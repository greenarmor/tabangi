package com.tabangi.dolor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;

public class LoginPage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_login_page);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login_page, menu);
		return true;
	}
	
	public void loginFacebook(View view) {
		Intent intent = new Intent(this, FeedsPage.class);
		this.startActivity(intent);
	}
	
	public void sign_up(View view) {
		Intent intent = new Intent(this, user_signup.class);
		this.startActivity(intent);
	}
}
