
import https.compute_ind_.west_1_jiocloudservices_com.doc._2016_03_01.*;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.xml.sax.InputSource;

import javax.xml.bind.JAXBContext;  
//simport javax.xml.bind.JAXBException;  
import javax.xml.bind.Unmarshaller;  
 

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
			params.put("SnapshotId", createVolumeRequest.getSnapshotId());
		}
		CloseableHttpResponse response = this.makeRequest(this.jcsCredentialsProvider.getCredentials(), 
															params, createVolumeRequest.getCustomRequestHeaders());
		
		try{
			if(response.getStatusLine().getStatusCode()==200){
				System.out.println(response.getStatusLine());
			    HttpEntity entity = response.getEntity();
			    String content = EntityUtils.toString(entity);
			    
			    JAXBContext jaxbContext = JAXBContext.newInstance(CreateVolumeResponse.class);  
			    
		        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
		        CreateVolumeResponse createVolumeResponse = (CreateVolumeResponse) jaxbUnmarshaller
		        		.unmarshal(new InputSource( new StringReader(content) ));  
		    
			    Volume volume = new Volume()
			    		.withSize(createVolumeResponse.getSize())
			    		.withVolumeId(createVolumeResponse.getVolumeId())
			    		.withCreateTime(createVolumeResponse.getCreateTime())
			    		.withSnapshotId(createVolumeResponse.getSnapshotId())
			    		.withStatus(createVolumeResponse.getStatus());
			    				
			    EntityUtils.consume(entity);
			    CreateVolumeResult createVolumeResult = new CreateVolumeResult().withVolume(volume);
			    createVolumeResult.setRequestId(createVolumeResponse.getRequestId());
			    createVolumeResult.setXml(content);
				return createVolumeResult;

			}
			else throw new Exception(response.getStatusLine().toString());
		} finally {
		    response.close();
		}
		
	}

	@Override
	public DeleteVolumeResult deleteVolume(
			DeleteVolumeRequest deleteVolumeRequest) throws Exception {
		Map<String, String> params = new HashMap<String, String>();
		params.put("Action", "DeleteVolume");
		if(deleteVolumeRequest.getVolumeId() != null){
			params.put("VolumeId", deleteVolumeRequest.getVolumeId());
		}
		
		CloseableHttpResponse response = this.makeRequest(this.jcsCredentialsProvider.getCredentials(), 
															params, deleteVolumeRequest.getCustomRequestHeaders());
		
		try{
			if(response.getStatusLine().getStatusCode()==200){
				System.out.println(response.getStatusLine());
			    HttpEntity entity = response.getEntity();
			    String content = EntityUtils.toString(entity);
			    
			    JAXBContext jaxbContext = JAXBContext.newInstance(DeleteVolumeResponse.class);  
			    
		        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
		        DeleteVolumeResponse deleteVolumeResponse = (DeleteVolumeResponse) jaxbUnmarshaller
		        		.unmarshal(new InputSource( new StringReader(content) ));  
 
	 
			    				
			    EntityUtils.consume(entity);
			    DeleteVolumeResult deleteVolumeResult = new DeleteVolumeResult();
			    deleteVolumeResult.setRequestId(deleteVolumeResponse.getRequestId());
			    deleteVolumeResult.setXml(content);
				return deleteVolumeResult;

			}
			else throw new Exception(response.getStatusLine().toString());
		} finally {
		    response.close();
		}
	}
	
	@Override
	public DescribeVolumesResult describeVolumes(DescribeVolumesRequest describeVolumesRequest) throws  Exception{
		Map<String, String> params = new HashMap<String, String>();
		params.put("Action", "DescribeVolumes");
		if(describeVolumesRequest.getMaxResults() != null){
			params.put("MaxResults", describeVolumesRequest.getMaxResults().toString());
		}
		if(describeVolumesRequest.getNextToken() != null){
			params.put("NextToken", describeVolumesRequest.getNextToken());
		}
		if(describeVolumesRequest.getVolumeIds() != null){
			int i=1;
			for(String volumeId: describeVolumesRequest.getVolumeIds()){
				params.put("VolumeId."+i, volumeId);
				i++;
			}
		}
		CloseableHttpResponse response = this.makeRequest(this.jcsCredentialsProvider.getCredentials(), 
															params, describeVolumesRequest.getCustomRequestHeaders());
		
		try{
			if(response.getStatusLine().getStatusCode()==200){
				System.out.println(response.getStatusLine());
			    HttpEntity entity = response.getEntity();
			    String content = EntityUtils.toString(entity);
			    			    
			    JAXBContext jaxbContext = JAXBContext.newInstance(DescribeVolumesResponse.class);  
			    
		        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
		        DescribeVolumesResponse describeVolumesResponse = (DescribeVolumesResponse) jaxbUnmarshaller
		        		.unmarshal(new InputSource( new StringReader(content) ));  
			    
			    List<Volume> volumes = new ArrayList<Volume>();
			    
			    for(DescribeVolumesResponse.VolumeSet.Item item : describeVolumesResponse.getVolumeSet().getItem()){
			    	volumes.add(new Volume()
			    	.withSize(item.getSize())
		    		.withVolumeId(item.getVolumeId())
		    		.withCreateTime(item.getCreateTime())
		    		.withSnapshotId(item.getSnapshotId())
		    		.withStatus(item.getStatus())
			    	);
			    }
			    EntityUtils.consume(entity);
			    DescribeVolumesResult describeVolumesResult = new DescribeVolumesResult().withVolumes(volumes);
			    describeVolumesResult.setRequestId(describeVolumesResponse.getRequestId());
			    describeVolumesResult.setXml(content);
				return describeVolumesResult;

			}
			else throw new Exception(response.getStatusLine().toString());
		} finally {
		    response.close();
		}
	}

	@Override
	public CreateSnapshotResult createSnapshot(
			CreateSnapshotRequest createSnapshotRequest) throws Exception {
		Map<String, String> params = new HashMap<String, String>();
		params.put("Action", "CreateSnapshot");
		
		if(createSnapshotRequest.getVolumeId() != null){
			params.put("VolumeId", createSnapshotRequest.getVolumeId());
		}
		CloseableHttpResponse response = this.makeRequest(this.jcsCredentialsProvider.getCredentials(), 
															params, createSnapshotRequest.getCustomRequestHeaders());
		
		try{
			if(response.getStatusLine().getStatusCode()==200){
				System.out.println(response.getStatusLine());
			    HttpEntity entity = response.getEntity();
			    String content = EntityUtils.toString(entity);
			    			    
			    JAXBContext jaxbContext = JAXBContext.newInstance(CreateSnapshotResponse.class);  
			    
		        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
		        CreateSnapshotResponse createSnapshotResponse = (CreateSnapshotResponse) jaxbUnmarshaller
		        		.unmarshal(new InputSource( new StringReader(content) ));  
			    
			    Snapshot snapshot = new Snapshot()
			    		.withSize(createSnapshotResponse.getVolumeSize())
			    		.withVolumeId(createSnapshotResponse.getVolumeId())
			    		.withStartTime(createSnapshotResponse.getStartTime())
			    		.withSnapshotId(createSnapshotResponse.getSnapshotId())
			    		.withStatus(createSnapshotResponse.getStatus());
			    				
			    EntityUtils.consume(entity);
			    CreateSnapshotResult createSnapshotResult = new CreateSnapshotResult().withSnapshot(snapshot);
			    createSnapshotResult.setRequestId(createSnapshotResponse.getRequestId());
			    createSnapshotResult.setXml(content);
				return createSnapshotResult;

			}
			else throw new Exception(response.getStatusLine().toString());
		} finally {
		    response.close();
		}
	}

	@Override
	public DeleteSnapshotResult deleteSnapshot(
			DeleteSnapshotRequest deleteSnapshotRequest) throws Exception {
		Map<String, String> params = new HashMap<String, String>();
		params.put("Action", "DeleteSnapshot");
		if(deleteSnapshotRequest.getSnapshotId() != null){
			params.put("SnapshotId", deleteSnapshotRequest.getSnapshotId());
		}
		
		CloseableHttpResponse response = this.makeRequest(this.jcsCredentialsProvider.getCredentials(), 
															params, deleteSnapshotRequest.getCustomRequestHeaders());
		
		try{
			if(response.getStatusLine().getStatusCode()==200){
				System.out.println(response.getStatusLine());
			    HttpEntity entity = response.getEntity();
			    String content = EntityUtils.toString(entity);
			    			    
			    JAXBContext jaxbContext = JAXBContext.newInstance(DeleteSnapshotResponse.class);  
			    
		        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
		        DeleteSnapshotResponse deleteSnapshotResponse = (DeleteSnapshotResponse) jaxbUnmarshaller
		        		.unmarshal(new InputSource( new StringReader(content) ));  
 
			    
			    				
			    EntityUtils.consume(entity);
			    DeleteSnapshotResult deleteSnapshotResult = new DeleteSnapshotResult();
			    deleteSnapshotResult.setRequestId(deleteSnapshotResponse.getRequestId());
			    deleteSnapshotResult.setXml(content);
				return deleteSnapshotResult;

			}
			else throw new Exception(response.getStatusLine().toString());
		} finally {
		    response.close();
		}
	}

	@Override
	public DescribeSnapshotsResult describeSnapshots(
			DescribeSnapshotsRequest describeSnapshotsRequest) throws Exception {
		Map<String, String> params = new HashMap<String, String>();
		params.put("Action", "DescribeSnapshots");
		if(describeSnapshotsRequest.getMaxResults() != null){
			params.put("MaxResults", describeSnapshotsRequest.getMaxResults().toString());
		}
		if(describeSnapshotsRequest.getNextToken() != null){
			params.put("NextToken", describeSnapshotsRequest.getNextToken());
		}
		if(describeSnapshotsRequest.getSnapshotIds() != null){
			int i=1;
			for(String snapshotId: describeSnapshotsRequest.getSnapshotIds()){
				params.put("SnapshotId."+i, snapshotId);
				i++;
			}
		}
		CloseableHttpResponse response = this.makeRequest(this.jcsCredentialsProvider.getCredentials(), 
															params, describeSnapshotsRequest.getCustomRequestHeaders());
		
		try{
			if(response.getStatusLine().getStatusCode()==200){
				System.out.println(response.getStatusLine());
			    HttpEntity entity = response.getEntity();
			    String content = EntityUtils.toString(entity);
			  			    
			    JAXBContext jaxbContext = JAXBContext.newInstance(DescribeSnapshotsResponse.class);  
			    
		        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
		        DescribeSnapshotsResponse describeSnapshotsResponse = (DescribeSnapshotsResponse) jaxbUnmarshaller
		        		.unmarshal(new InputSource( new StringReader(content) ));  
			    
			    List<Snapshot> snapshots = new ArrayList<Snapshot>();
			    
			    for(DescribeSnapshotsResponse.SnapshotSet.Item item : describeSnapshotsResponse.getSnapshotSet().getItem()){
			    	snapshots.add(new Snapshot()
			    	.withSnapshotId(item.getSnapshotId())
			    	.withSize(item.getVolumeSize())
		    		.withVolumeId(item.getVolumeId())
		    		.withStartTime(item.getStartTime())
		    		.withStatus(item.getStatus())
			    	);
			    }
			    EntityUtils.consume(entity);
			    DescribeSnapshotsResult describeSnapshotsResult = new DescribeSnapshotsResult().withSnapshots(snapshots);
			    describeSnapshotsResult.setRequestId(describeSnapshotsResponse.getRequestId());
			    describeSnapshotsResult.setXml(content);
				return describeSnapshotsResult;

			}
			else throw new Exception(response.getStatusLine().toString());
		} finally {
		    response.close();
		}
	}
	
	
}
