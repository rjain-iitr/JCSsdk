import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;


@ThreadSafe
public class JCSComputeClient extends JCSHttpClient implements JCSCompute{
	
	
	private JCSCredentialsProvider jcsCredentialsProvider;
	
	public JCSComputeClient(){
		this(new DefaultJCSCredentialsProviderChain()); 
	}
	
	public JCSComputeClient(JCSCredentials jcsCredentials){
		this.jcsCredentialsProvider = new StaticCredentialsProvider(jcsCredentials);
		init();
    }
	
	public JCSComputeClient(JCSCredentialsProvider jcsCredentialsProvider){
        this.jcsCredentialsProvider = jcsCredentialsProvider;
        init();
    }
	
	private void init(){     
        this.setEndpoint("https://compute.ind-west-1.staging.jiocloudservices.com");
    }
	
	@Override
	public CreateVolumeResult createVolume(CreateVolumeRequest createVolumeRequest) throws Exception {
		Map<String, String> params = new HashMap<String, String>();
		params.put("Action", "CreateVolume");
		if(createVolumeRequest.getSize() != null){
			params.put("Size", createVolumeRequest.getSize().toString());
		}
		if(createVolumeRequest.getSnapshotId() != null){
			params.put("Size", createVolumeRequest.getSnapshotId());
		}
		CloseableHttpResponse response = this.makeRequest(this.jcsCredentialsProvider.getCredentials(), 
															params, createVolumeRequest.getCustomRequestHeaders());

		try {
		    System.out.println(response.getStatusLine());
		    HttpEntity entity2 = response.getEntity();
		    // do something useful with the response body
		    // and ensure it is fully consumed
		    EntityUtils.consume(entity2);
		} finally {
		    response.close();
		}
		
		
		return new CreateVolumeResult();
	}

	
}
