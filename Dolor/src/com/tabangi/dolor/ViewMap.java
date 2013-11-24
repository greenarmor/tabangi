package com.tabangi.dolor;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

@SuppressLint("SetJavaScriptEnabled")
public class ViewMap extends Activity {

	private WebView mapView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
	 	getWindow().requestFeature(Window.FEATURE_NO_TITLE);
		// setContentView(R.layout.activity_view_map);
		
	 	mapView = new WebView(this);
	 	mapView.loadUrl("http://tabangi.azurewebsites.net/tabangi/maps.html");
	 	mapView.getSettings().setJavaScriptEnabled(true);
		mapView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
		mapView.clearCache(true);
		mapView.clearHistory();
		mapView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
		mapView.getSettings().setGeolocationEnabled(true);
		mapView.setWebViewClient(new WebViewClient() {
		    @Override
		    public boolean shouldOverrideUrlLoading(WebView view, String url) {
		        view.loadUrl(url);
		        return true;		        
		    }
		});	
		
		this.setContentView(mapView);	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.view_map, menu);
		return true;
	}

}
