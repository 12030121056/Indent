package com.example.intents;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.TextureView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_details);
	
		//TextView tv=new TextView(this);
		//tv.setText("");
	     
		   Bundle extras = getIntent().getExtras();  
		   String usr =extras.getString("u");  
		   
		   Toast.makeText(getApplicationContext(),"Welcome"+usr,Toast.LENGTH_LONG).show();  
	}
	
	

	

}
