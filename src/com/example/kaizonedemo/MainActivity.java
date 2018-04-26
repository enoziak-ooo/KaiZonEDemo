package com.example.kaizonedemo;
s
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements IDataUpdateListener {

	DataControl mControl;
	ImageFetcher mImageFetcher;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mControl = new DataControl(this);
		mControl.addChangeListener(this);
		
        mImageFetcher = new ImageFetcher(this, 800);
        mImageFetcher.setLoadingImage(null);
		
		((Button) findViewById(R.id.button))
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						String uri = "https://github.com/";
						mControl.setShowTips(true);
						mControl.setTipsText("loading...");
						mControl.exec(uri);
					}
				});
	}

	@Override
	public Object backParse(String arg0, String arg1) {
		return arg0+"?"+arg1;
	}

	@Override
	public void exception(final Exception arg0) {
		runOnUiThread(new Runnable() {
			@Override
			public void run() {
				((TextView)findViewById(R.id.textview)).setText(arg0.toString());
				
			}
		});

	}

	@Override
	public void foreUpdate(Object arg0, String arg1) {
		((TextView)findViewById(R.id.textview)).setText(arg1.toString()+"?"+arg1);
		mImageFetcher.loadImage("", (ImageView)findViewById(R.id.imageview));

	}
}
