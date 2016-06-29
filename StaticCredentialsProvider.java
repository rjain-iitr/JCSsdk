

/**
 * Simple implementation of AWSCredentialsProvider that just wraps static AWSCredentials.
 */
public class StaticCredentialsProvider implements JCSCredentialsProvider {

    private final JCSCredentials credentials;

    public StaticCredentialsProvider(JCSCredentials credentials) {
        this.credentials = credentials;
    }

    public JCSCredentials getCredentials() {
        return credentials;
    }

    public void refresh() {}

}
