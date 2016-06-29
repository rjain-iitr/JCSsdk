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
        JCSCredentials credentials = null;
        
            credentials = new JCSCredentials() {

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

        /*
         * Amazon EC2
         *
         * The AWS EC2 client allows you to create, delete, and administer
         * instances programmatically.
         *
         * In this sample, we use an EC2 client to get a list of all the
         * availability zones, and all instances sorted by reservation id.
         */
        try {
            //DescribeAvailabilityZonesResult availabilityZonesResult = ec2.describeAvailabilityZones();
            //System.out.println("You have access to " + availabilityZonesResult.getAvailabilityZones().size() +
                    //" Availability Zones.");
            
            CreateVolumeRequest createVolumeRequest = new CreateVolumeRequest();
            createVolumeRequest.setSize(1);
            //System.out.println("yyyyyyy");
            jcs.createVolume(createVolumeRequest);
            //System.out.println("xxxxxxx");
            //List<Reservation> reservations = describeInstancesRequest.getReservations();
            //Set<Instance> instances = new HashSet<Instance>();
            
            //DescribeVolumesResult describevolumesresult = ec2.describeVolumes();
            //for (Reservation reservation : reservations) {
            //    instances.addAll(reservation.getInstances());
            //}
            //System.out.println("You have "+ describevolumesresult.getVolumes().size() +" Volumes");
            //System.out.println("You have " + instances.size() + " Amazon EC2 instance(s) running.");
        } catch (Exception e) {
        	e.printStackTrace();
        
        }

        
    }
}


