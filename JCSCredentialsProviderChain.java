import java.util.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class JCSCredentialsProviderChain implements JCSCredentialsProvider{
	
	private static final Log log = LogFactory.getLog(JCSCredentialsProviderChain.class);
	
	private final List<JCSCredentialsProvider> credentialsProviders =
            new LinkedList<JCSCredentialsProvider>();
	
	private boolean reuseLastProvider = true;
    private JCSCredentialsProvider lastUsedProvider;
    
    public JCSCredentialsProviderChain(List<? extends JCSCredentialsProvider> credentialsProviders) {
        if (credentialsProviders == null || credentialsProviders.size() == 0) {
            throw new IllegalArgumentException("No credential providers specified");
        }
        this.credentialsProviders.addAll(credentialsProviders);
    }

    public JCSCredentialsProviderChain(JCSCredentialsProvider... credentialsProviders) {
        if (credentialsProviders == null || credentialsProviders.length == 0) {
            throw new IllegalArgumentException("No credential providers specified");
        }

        for (JCSCredentialsProvider provider : credentialsProviders) {
            this.credentialsProviders.add(provider);
        }
    }
    
    public boolean getReuseLastProvider() {
        return reuseLastProvider;
    }

    public void setReuseLastProvider(boolean b) {
        this.reuseLastProvider = b;
    }
    
	@Override
	public JCSCredentials getCredentials() {
		if (reuseLastProvider && lastUsedProvider != null) {
            return lastUsedProvider.getCredentials();
        }

        for (JCSCredentialsProvider provider : credentialsProviders) {
            try {
                JCSCredentials credentials = provider.getCredentials();

                if (credentials.getJCSAccessKey() != null &&
                    credentials.getJCSSecretKey() != null) {
                    log.debug("Loading credentials from " + provider.toString());

                    lastUsedProvider = provider;
                    return credentials;
                }
            } catch (Exception e) {
                // Ignore any exceptions and move onto the next provider
                log.debug("Unable to load credentials from " + provider.toString() +
                          ": " + e.getMessage());
            }
        }

        throw new RuntimeException("Unable to load JCS credentials from any provider in the chain");
	}

	@Override
	public void refresh() {
		for (JCSCredentialsProvider provider : credentialsProviders) {
            provider.refresh();
        }
	}

}

