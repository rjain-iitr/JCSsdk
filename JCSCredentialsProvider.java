
public interface JCSCredentialsProvider {

    /**
     * Returns AWSCredentials which the caller can use to authorize an AWS request.
     * Each implementation of AWSCredentialsProvider can chose its own strategy for
     * loading credentials.  For example, an implementation might load credentials
     * from an existing key management system, or load new credentials when
     * credentials are rotated.
     *
     * @return AWSCredentials which the caller can use to authorize an AWS request.
     */
    public JCSCredentials getCredentials();

    /**
     * Forces this credentials provider to refresh its credentials. For many
     * implementations of credentials provider, this method may simply be a
     * no-op, such as any credentials provider implementation that vends
     * static/non-changing credentials. For other implementations that vend
     * different credentials through out their lifetime, this method should
     * force the credentials provider to refresh its credentials.
     */
    public void refresh();

}