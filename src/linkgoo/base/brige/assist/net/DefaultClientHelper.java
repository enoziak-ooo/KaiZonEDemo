
package linkgoo.base.brige.assist.net;

import java.io.InputStream;
import java.util.HashMap;

import org.apache.http.HttpResponse;

public class DefaultClientHelper extends ClientHelper {

    @Override
    public HashMap<String, String> supplyHeaders() {
        HashMap<String, String> map = new HashMap<String, String>();

        return map;
    }

    @Override
    public boolean interceptResponse(HttpResponse response) {
    	return false;
    }
    
    @Override
    public InputStream getKeyStoreInputStream() {
    	return null;
    }
    
    @Override
    public char[] getKeyStorePassword() {
    	return "123456".toCharArray();
    }
    
}
