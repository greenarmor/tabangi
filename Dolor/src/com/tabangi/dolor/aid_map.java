package com.tabangi.dolor;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressLint("SetJavaScriptEnabled")
public class aid_map extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
	 	// getWindow().requestFeature(Window.FEATURE_NO_TITLE);	 	
		setContentView(R.layout.aid_map);
		
		TabHost TabHost = (TabHost)findViewById(R.id.tabhost);
		TabHost.setup();

		TabSpec overview_map = TabHost.newTabSpec("Overview Map");
		overview_map.setContent(R.id.overview_map);
		overview_map.setIndicator("Overview Map");
		
		TabSpec calamity_list = TabHost.newTabSpec("Calamity List");
		calamity_list.setContent(R.id.calamity_list);
		calamity_list.setIndicator("Calamity List");

		TabSpec event_list = TabHost.newTabSpec("Event List");
		event_list.setContent(R.id.event_list);
		event_list.setIndicator("Event List");

		TabHost.addTab(overview_map);
		TabHost.addTab(calamity_list);
		TabHost.addTab(event_list);
    }
	
	public void viewMap(View view) {
		Intent view_map = new Intent(this, ViewMap.class);
		startActivity(view_map);
	}
	public void view_calamity_info(View view) {
		Intent log_in_facebook = new Intent(this, CalamityEventInfo.class);
		startActivity(log_in_facebook);
	}
}