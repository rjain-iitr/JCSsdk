import java.util.regex.*;


public class Utils {

	public static ProtocolAndHost getProtocolAndHost(String url){
		ProtocolAndHost protocolAndHost = new ProtocolAndHost();
		Pattern r = Pattern.compile("(http[s]?)://((?:[a-zA-Z]|[0-9]|[$-_@.&+]|[!*(),]|(?:%[0-9a-fA-F][0-9a-fA-F]))+)");
		Matcher url_parts = r.matcher(url);
		if(!url_parts.find()){
			protocolAndHost.protocol="";
			protocolAndHost.host = "";
		}
		else{
			protocolAndHost.protocol = url_parts.group(1);
			protocolAndHost.host = url_parts.group(2);
		}
		return protocolAndHost;
	}
}
