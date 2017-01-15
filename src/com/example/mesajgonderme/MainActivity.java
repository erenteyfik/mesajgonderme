package com.example.mesajgonderme;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final EditText telno=(EditText)findViewById(R.id.editText1);
		final EditText mesaj=(EditText)findViewById(R.id.editText2);
		Button gonder=(Button)findViewById(R.id.button1);
		gonder.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				android.telephony.SmsManager sms = android.telephony.SmsManager.getDefault();
				sms.sendTextMessage(telno.getText().toString(), null, mesaj.getText().toString(), null, null);
				
			}
		});
	}

	
}
