package com.tabangi.dolor;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SosPage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sos_page);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sos_page, menu);
		return true;
	}

}
