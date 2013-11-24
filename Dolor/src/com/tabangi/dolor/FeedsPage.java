package com.tabangi.dolor;

import java.net.MalformedURLException;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;

import com.microsoft.windowsazure.mobileservices.*;

public class FeedsPage extends Activity {
	
	@SuppressWarnings("unused")
	private MobileServiceClient db;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		getIntent();
		
		try {
			db = new MobileServiceClient(
			      "https://tabangi.azure-mobile.net/",
			      "toDfYOAroOtnYBZVuKTQycIIdaDRhI76",
			      this
			);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setContentView(R.layout.activity_feeds_page);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.feeds_page, menu);
		return true;
	}
	
	public void sendSos(View view) {
		Intent intent = new Intent(this, SosPage.class);
		this.startActivity(intent);
	}
	
	public void sendHelp(View view) {
		Intent intent = new Intent(this, HelpPage.class);
		this.startActivity(intent);
	}
	
	public void logOut(View view) {
		Intent intent = new Intent(this, LoginPage.class);
		this.startActivity(intent);
	}

}
