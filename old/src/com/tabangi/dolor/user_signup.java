package com.tabangi.dolor;

import java.net.MalformedURLException;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

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
		user.FirstName = "Otenito";
		user.LastName = "Utganon";
		user.Birthday = "11/01/13";
		user.Orgid = "1";
		user.Gender = "Male";
		
		userClient.getTable(User.class).insert(user, new TableOperationCallback<User>() {
			public void onCompleted(User newUser, Exception e, ServiceFilterResponse r) {
				if (e == null) {}
				else e.printStackTrace();
			}
		});
	}
	
}
