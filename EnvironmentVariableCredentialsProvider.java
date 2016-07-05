
/**
 * {@link AWSCredentialsProvider} implementation that provides credentials
 * by looking at the: <code>AWS_ACCESS_KEY_ID</code> (or <code>AWS_ACCESS_KEY</code>) and
 * <code>AWS_SECRET_KEY</code> (or <code>AWS_SECRET_ACCESS_KEY</code>) environment variables.
 */
public class EnvironmentVariableCredentialsProvider implements JCSCredentialsProvider {
    @Override
    public JCSCredentials getCredentials(){
        String accessKey = System.getenv("ACCESS_KEY");
        String secretKey = System.getenv("SECRET_KEY");
        
        accessKey = accessKey.trim();
        secretKey = secretKey.trim();
        
        if (Utils.isNullOrEmpty(accessKey) || Utils.isNullOrEmpty(secretKey)) {

            throw new RuntimeException(
                    "Unable to load AWS credentials from environment variables " +
                    "(" + accessKey + ") and (" + secretKey + ")");
        }

        
        return new BasicJCSCredentials(accessKey, secretKey);
    }

    @Override
    public void refresh() {}

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}