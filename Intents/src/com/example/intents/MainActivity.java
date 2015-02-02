package com.example.intents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
private Button btnimp;
private Button btnexp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
    
    btnimp=(Button)findViewById(R.id.btnimp); 
  OnClickListener listener=new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
	
		  Intent intentObj=new Intent(Intent.ACTION_VIEW),Uri.parse("www.google.com"));
				  startActivity(intentObj);

	}
};
   
btnexp=(Button)findViewById(R.id.btnexp);
OnClickListener listener=new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
	
		Intent intent =new Intent(getApplicationContext(),CaseConverterActivity.class);
		  startActivity(intent);
	}
};
}
		
 
    

