import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class JCStry {



    static JCSCompute jcs;
    
    private static void init(){

       
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
      
        
    }

    
    
    

    public static void main(String[] args){

       init();

        
        try {
                        
//            CreateVolumeRequest createVolumeRequest = new CreateVolumeRequest();
//            //createVolumeRequest.setSnapshotId("1613998c-d78a-4504-b474-e175819ca1f9");
//            CreateVolumeResult createVolumeResult = jcs.createVolume(createVolumeRequest);
//            //System.out.println(createVolumeResult.toString());
//            System.out.println(createVolumeResult.getVolume().getVolumeId());
//            System.out.println(createVolumeResult.getVolume().getStatus());
//            System.out.println(createVolumeResult.getVolume().getCreateTime());
//            
//            DeleteVolumeRequest deleteVolumeRequest = new DeleteVolumeRequest().withVolumeId("14b35b92-fe75-4e8d-9eb3-9c268374422e");
//            DeleteVolumeResult deleteVolumeResult = jcs.deleteVolume(deleteVolumeRequest);
//            System.out.println(deleteVolumeResult.toString());
//            
//        	DescribeVolumesRequest describeVolumesRequest = new DescribeVolumesRequest().withVolumeIds("5388580c-5745-486f-b0c8-6ab363fa0a85");
//        	DescribeVolumesResult describeVolumesResult = jcs.describeVolumes(describeVolumesRequest);
//        	System.out.println(describeVolumesResult.toString());
        	
//        	        	
//        	CreateSnapshotRequest createSnapshotRequest = new CreateSnapshotRequest()
//        													.withVolumeId("5388580c-5745-486f-b0c8-6ab363fa0a85");
//        	CreateSnapshotResult createSnapshotResult = jcs.createSnapshot(createSnapshotRequest);
//        	System.out.println(createSnapshotResult.toString());
        	
//        	DeleteSnapshotRequest deleteSnapshotRequest = new DeleteSnapshotRequest().
//        							withSnapshotId("1613998c-d78a-4504-b474-e175819ca1f9");
//        	DeleteSnapshotResult deleteSnapshotResult = jcs.deleteSnapshot(deleteSnapshotRequest);
//        	System.out.println(deleteSnapshotResult.toString());
//      	
        	DescribeSnapshotsRequest describeSnapshotsRequest = new DescribeSnapshotsRequest();
        	DescribeSnapshotsResult describeSnapshotsResult = jcs.describeSnapshots(describeSnapshotsRequest);
        	System.out.println(describeSnapshotsResult.toString());
        	System.out.println(describeSnapshotsResult.getSnapshots());
        	
//        	CreateVolumeRequest createVolumeRequest = new CreateVolumeRequest()
//        						.withSize(10)
//        						.withSnapshotId("a247ced0-4e94-40ec-887c-de3bbb0b19d2");
//        	CreateVolumeResult createVolumeResult = jcs.createVolume(createVolumeRequest);
//        	System.out.println(createVolumeResult.getVolume());
        	
//        	DeleteVolumeRequest deleteVolumeRequest = new DeleteVolumeRequest().withVolumeId("df28d289-0436-48e6-9b0f-07ced523ded2");
//        	DeleteVolumeResult  deleteVolumeResult = jcs.deleteVolume(deleteVolumeRequest);
        
        
        } catch (Exception e) {
        	e.printStackTrace();
        
        }        
    }
}


