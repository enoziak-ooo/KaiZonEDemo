
package linkgoo.android.brige.assist.net;

import java.io.InputStream;
import java.util.HashMap;

import org.apache.http.HttpResponse;

public interface Listener {
    void onStart();

    void onComplete();

    void onExeception(String exception);

    void onFaile();

    boolean interceptResponse(HttpResponse response);

    HashMap<String, String> supplyHeaders();
    
    InputStream getKeyStoreInputStream();
    
    char[] getKeyStorePassword();
}
