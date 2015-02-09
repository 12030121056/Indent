package com.example.intents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class LogonActivity extends Activity {
private EditText user; 
private EditText pwd;
private Button logon;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_logon);
	     
		 user=(EditText)findViewById(R.id.user);
		 pwd=(EditText)findViewById(R.id.pwd);
		 logon=(Button)findViewById(R.id.logon);
		 OnClickListener listener= new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				Intent i= new Intent(getApplicationContext(),DetailsActivity.class);
				Bundle b =new Bundle();
				b.putString("u",user.getText().toString());
				i.putExtras(b);
				startActivity(i);
			}
		};
		logon.setOnClickListener(listener); 
	
	
	}
}
