import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class Authorization {

	String verb;
	String accessKey;
	String secretKey;
	Map<String, String> headers;
	String path;
	String protocol;
	String host;
	String port;
	
	public Authorization(String url, String verb, String accessKey, String secretKey, Map<String, String> headers){
		this.verb = verb;
		this.accessKey = accessKey;
		this.secretKey = secretKey;
		this.headers = headers;
		this.path = "/";
		ProtocolAndHost protocolAndHost = Utils.getProtocolAndHost(url);
		if(!Arrays.asList(new String[]{"http","https"}).contains(protocolAndHost.protocol)){
			throw new RuntimeException("Unsupported protocol present in given url :"+url);
		}
		this.protocol = protocolAndHost.protocol;
		this.host = protocolAndHost.host;
		this.port = "";
		if(host.indexOf(':')>0){
			String[] parts = host.split(":");
			this.host = parts[0];
			this.port = parts[1];
		}	
		
	}
	public void addParams(Map<String, String> params){
		params.put("JCSAccessKeyId", this.accessKey);
		params.put("SignatureVersion", "2");
		params.put("SignatureMethod", "HmacSHA256");
		params.put("Version", "2016-03-01");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		params.put("Timestamp", sdf.format(Calendar.getInstance().getTime()));
	}
	
	public static String getUtf8Value(String value){
		
		
		return value;
	}
	
	public String sortParams(Map<String, String> params) throws UnsupportedEncodingException{
		List<String> sortedKeys = new ArrayList<String>(params.keySet());
		Collections.sort(sortedKeys);
		String value;
		String qs="";
		for(String key: sortedKeys){
			value = Authorization.getUtf8Value(params.get(key));
			value = URLEncoder.encode(value, "UTF-8");
			qs  = qs + key+"="+value+"&";
		}	
		qs = qs.substring(0, qs.length()-1);
		return qs;
 	}
	
	public String stringToSign(Map<String, String> params) throws UnsupportedEncodingException{
	String ss = this.verb + "\n" + this.host;
	if(this.port!=""){
		ss+="\n"+this.port;
	}
	ss += "\n" + this.path + "\n";
	this.addParams(params);
	String qs = this.sortParams(params);
	ss+=qs;
	return ss;		
	}
	
	public void addAuthorization(Map<String, String> params) throws NoSuchAlgorithmException, InvalidKeyException, IllegalStateException, UnsupportedEncodingException{
		Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
		String canonicalString = this.stringToSign(params);
		SecretKeySpec secret_key = new SecretKeySpec(this.secretKey.getBytes(), "HmacSHA256");
		sha256_HMAC.init(secret_key);
		String hash = Base64.encodeBase64String(sha256_HMAC.doFinal(canonicalString.getBytes("UTF-8")));
		hash = new String(hash.getBytes(), "UTF-8");
		hash = URLEncoder.encode(hash, "UTF-8");
		hash = hash.replaceAll("%2F", "/");
		params.put("Signature", hash);
	}
	
}
