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

	public void login(View view) {
		Intent log_in_intent = new Intent(this, LoginForm.class);
		this.startActivity(log_in_intent);
	}
	
	public void loginFacebook(View view) {
		Intent log_in_facebook = new Intent(this, aid_map.class);
		startActivity(log_in_facebook);
	}
	
	public void sign_up(View view) {
		Intent sign_up_intent = new Intent(this, user_signup.class);
		this.startActivity(sign_up_intent);
	}
}
