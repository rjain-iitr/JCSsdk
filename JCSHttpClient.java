import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

import org.apache.http.annotation.ThreadSafe;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

@ThreadSafe
public abstract class JCSHttpClient {
	
	protected volatile String endpoint;
	
	public void setEndpoint(String endpoint){
		this.endpoint = endpoint;		
	}
	
	private void addCustomHeaders(Map<String, String> headers){
		headers.put("Content-Type","application/json");
		headers.put("Accept-Encoding","identity");
	}
	
	protected CloseableHttpResponse makeRequest(JCSCredentials credentials, Map<String,String> params, Map<String, String> headers) throws InvalidKeyException, NoSuchAlgorithmException, IllegalStateException, ClientProtocolException, IOException{
		addCustomHeaders(headers);
		Authorization authorization = new Authorization(endpoint.toString() , "POST", credentials.getJCSAccessKey(),credentials.getJCSSecretKey(), headers);
		authorization.addAuthorization(params);
		String url = getUrl(params);	
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		
		for(String header : headers.keySet()){
			httpPost.addHeader(header, headers.get(header));
		}
		
		CloseableHttpResponse closeableHttpResponse = httpclient.execute(httpPost);
		return closeableHttpResponse;
	}
	
	private String getUrl(Map<String, String> params){
		String url = this.endpoint;
		url += "/?";
		for(String key: params.keySet()){
			url += key+"="+params.get(key)+"&";
		}
		url = url.substring(0,url.length()-1);
		return url;
	}

}
