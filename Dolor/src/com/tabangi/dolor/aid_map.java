package com.tabangi.dolor;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressLint("SetJavaScriptEnabled")
public class aid_map extends Activity{

	private WebView mapView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	 	getWindow().requestFeature(Window.FEATURE_NO_TITLE);
	 	
		setContentView(R.layout.aid_map);
		
		TabHost TabHost = (TabHost)findViewById(R.id.tabhost);
		TabHost.setup();

		TabSpec map_overview = TabHost.newTabSpec("Map Overview");
		map_overview.setContent(R.id.overview_map);
		map_overview.setIndicator("Map Overview");

		TabSpec calamity_list = TabHost.newTabSpec("Calamity List");
		calamity_list.setContent(R.id.calamity_list);
		calamity_list.setIndicator("Calamity List");

		TabSpec event_list = TabHost.newTabSpec("Event List");
		event_list.setContent(R.id.event_list);
		event_list.setIndicator("Event List");

		TabHost.addTab(map_overview);
		TabHost.addTab(calamity_list);
		TabHost.addTab(event_list);
		
	 	mapView = new WebView(this);
	 	mapView.loadUrl("http://tabangi.azurewebsites.net/tabangi/maps.html");
	 	mapView.getSettings().setJavaScriptEnabled(true);
		mapView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
		mapView.clearCache(true);
		mapView.clearHistory();
		mapView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
		mapView.setWebViewClient(new WebViewClient() {
		    @Override
		    public boolean shouldOverrideUrlLoading(WebView view, String url) {
		        view.loadUrl(url);
		        return true;
		        
		    }
		});
	 
        this.setContentView(mapView);
    }
    
}