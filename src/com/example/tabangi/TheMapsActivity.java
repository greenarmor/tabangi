package com.example.tabangi;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TheMapsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_the_maps);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.the_maps, menu);
		return true;
	}

}
