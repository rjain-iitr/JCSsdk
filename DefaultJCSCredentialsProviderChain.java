
public class DefaultJCSCredentialsProviderChain extends JCSCredentialsProviderChain{
	
	public DefaultJCSCredentialsProviderChain() {
        super(new EnvironmentVariableCredentialsProvider(),
              new SystemPropertiesCredentialsProvider());    
	}
}