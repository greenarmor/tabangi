package com.tabangi.dolor;

import java.net.MalformedURLException;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Spinner;

import com.microsoft.windowsazure.mobileservices.MobileServiceClient;
import com.microsoft.windowsazure.mobileservices.ServiceFilterResponse;
import com.microsoft.windowsazure.mobileservices.TableOperationCallback;

public class user_signup extends Activity{
	
	private MobileServiceClient userClient;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.user_signup);
		
		try {
			userClient = new MobileServiceClient(
			  "https://tabangi.azure-mobile.net/",
			  "toDfYOAroOtnYBZVuKTQycIIdaDRhI76",
			  this
			);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void userSignup(View view) {
		
		User user = new User();
		EditText FirstName = (EditText) findViewById(R.id.first_name);
		user.FirstName = FirstName.getText().toString();
		EditText LastName = (EditText) findViewById(R.id.last_name);
		user.LastName = LastName.getText().toString();
		EditText Birthday = (EditText) findViewById(R.id.birthday);
		user.Birthday = Birthday.getText().toString();
		EditText Organization = (EditText) findViewById(R.id.organzation_name);
		user.Organization = Organization.getText().toString();
		Spinner Gender = (Spinner) findViewById(R.id.user_gender);
		user.Gender = Gender.getSelectedItem().toString();
		
		userClient.getTable(User.class).insert(user, new TableOperationCallback<User>() {
			public void onCompleted(User newUser, Exception e, ServiceFilterResponse r) {
				if (e == null) {
					Intent signedUp = new Intent(user_signup.this, aid_map.class);
					startActivity(signedUp);
				}
				else e.printStackTrace();
			}
		});
	}
	
}
