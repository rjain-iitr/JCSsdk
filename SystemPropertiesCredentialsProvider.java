

public class SystemPropertiesCredentialsProvider implements JCSCredentialsProvider {

    @Override
    public JCSCredentials getCredentials() {
        String accessKey = System.getProperty("ACCESS_KEY").trim();

        String secretKey = System.getProperty("SECRET_KEY").trim();

        if (Utils.isNullOrEmpty(accessKey) || Utils.isNullOrEmpty(secretKey)) {

            throw new RuntimeException(
                    "Unable to load JCS credentials from Java system properties ("
            + accessKey + " and "+ secretKey + ")");
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