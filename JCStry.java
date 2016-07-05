import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class JCStry {



    static JCSCompute jcs;
    /**
     * The only information needed to create a client are security credentials
     * consisting of the AWS Access Key ID and Secret Access Key. All other
     * configuration, such as the service endpoints, are performed
     * automatically. Client parameters, such as proxies, can be specified in an
     * optional ClientConfiguration object when constructing a client.
     *
     * @see com.amazonaws.auth.BasicAWSCredentials
     * @see com.amazonaws.auth.PropertiesCredentials
     * @see com.amazonaws.ClientConfiguration
     */
    private static void init() throws Exception {

        /*
         * The ProfileCredentialsProvider will return your [default]
         * credential profile by reading from the credentials file located at
         * (/home/shubham/.aws/credentials).
         */
        JCSCredentials credentials = new JCSCredentials() {

        		@Override
        		public String getJCSAccessKey() {
        			// TODO Auto-generated method stub
        			return "856207ec61a64f3a8b59a5a33b6186a7";
        			
        		}

        		@Override
        		public String getJCSSecretKey() {
        			// TODO Auto-generated method stub
        			return "567c59052b374d1ea308b938020dc0e3";
        		}
            	
            };
            
        jcs = new JCSComputeClient(credentials);
        //jcs.setEndpoint("https://compute.ind-west-1.staging.jiocloudservices.com");
        
    }

    
    
    

    public static void main(String[] args) throws Exception {

        System.out.println("===========================================");
        System.out.println("Welcome to the AWS Java SDK!");
        System.out.println("===========================================");

        init();

        
        try {
                        
//            CreateVolumeRequest createVolumeRequest = new CreateVolumeRequest();
//            createVolumeRequest.setSize(5);
//            createVolumeRequest.setSnapshotId("6dca164c-bb90-45ae-8d01-9832966c16a2");
//            CreateVolumeResult createVolumeResult = jcs.createVolume(createVolumeRequest);
//            System.out.println(createVolumeResult.toString());
//            
//            DeleteVolumeRequest deleteVolumeRequest = new DeleteVolumeRequest().withVolumeId("703eace6-dd8a-4841-a359-d6d333e59944");
//            DeleteVolumeResult deleteVolumeResult = jcs.deleteVolume(deleteVolumeRequest);
//            System.out.println(deleteVolumeResult.toString());
//            
        	DescribeVolumesRequest describeVolumesRequest = new DescribeVolumesRequest();
        	DescribeVolumesResult describeVolumesResult = jcs.describeVolumes(describeVolumesRequest);
        	System.out.println(describeVolumesResult.toString());
        	
//        	List<Volume> volumes = describeVolumesResult.getVolumes();
//        	for(Volume volume:volumes){
//        		System.out.println(volume.toString());
//        	}
//        	
//        	CreateSnapshotRequest createSnapshotRequest = new CreateSnapshotRequest()
//        													.withVolumeId("dcf77516-92e0-4406-b5f4-9550f7d0f34b");
//        	CreateSnapshotResult createSnapshotResult = jcs.createSnapshot(createSnapshotRequest);
        	
//        	DeleteSnapshotRequest deleteSnapshotRequest = new DeleteSnapshotRequest().
//        							withSnapshotId("4c43dd83-0856-43ba-857d-59a4a7492785");
//        	DeleteSnapshotResult deleteSnapshotResult = jcs.deleteSnapshot(deleteSnapshotRequest);
//        	
//      	
//        	DescribeSnapshotsRequest describeSnapshotsRequest = new DescribeSnapshotsRequest();
//        	DescribeSnapshotsResult describeSnapshotsResult = jcs.describeSnapshots(describeSnapshotsRequest);
//        	System.out.println(describeSnapshotsResult.toString());
        } catch (Exception e) {
        	e.printStackTrace();
        
        }        
    }
}


