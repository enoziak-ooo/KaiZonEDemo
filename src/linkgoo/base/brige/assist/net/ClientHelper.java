package linkgoo.base.brige.assist.net;

import java.io.InputStream;
import java.util.HashMap;

import org.apache.http.HttpResponse;

public class ClientHelper implements Listener {

	@Override
	public void onStart() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onComplete() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onExeception(String exception) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFaile() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean interceptResponse(HttpResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public HashMap<String, String> supplyHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InputStream getKeyStoreInputStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char[] getKeyStorePassword() {
		// TODO Auto-generated method stub
		return null;
	}

}
