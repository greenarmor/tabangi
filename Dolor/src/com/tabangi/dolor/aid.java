package com.tabangi.dolor;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class aid extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aid);
		
		TabHost TabHost = (TabHost)findViewById(R.id.tabHost);
		TabHost.setup();

		TabSpec calamity = TabHost.newTabSpec("Calamities");
		calamity.setContent(R.id.tab_calamity);
		calamity.setIndicator("Calamities");

		TabSpec event = TabHost.newTabSpec("Events");
		event.setContent(R.id.tab_event);
		event.setIndicator("Events");

		TabHost.addTab(calamity);
		TabHost.addTab(event);
	}
}
