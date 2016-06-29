import java.util.*;
import org.apache.http.annotation.NotThreadSafe;


@NotThreadSafe
public abstract class JCSRequest {
	
	private JCSCredentialsProvider credentialsProvider;
	private Map<String, String> customRequestHeaders;
	
	public void setRequestCredentialsProvider(JCSCredentialsProvider credentialsProvider) {
        this.credentialsProvider = credentialsProvider;
    }

    public JCSCredentialsProvider getRequestCredentialsProvider() {
        return credentialsProvider;
    }
    
    public Map<String, String> getCustomRequestHeaders() {
        if (customRequestHeaders == null) {
            return new HashMap<String, String>();
        }
        return customRequestHeaders;
    }
    
    public String putCustomRequestHeader(String name, String value) {
        if (customRequestHeaders == null) {
            customRequestHeaders = new HashMap<String, String>();
        }
        return customRequestHeaders.put(name, value);
    }

}
