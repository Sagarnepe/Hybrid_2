package com.example.labprogram_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle b= getIntent().getBundleExtra("bundle");

        String username = b.getString("username");
        Toast.makeText(getApplicationContext(),username,Toast.LENGTH_LONG).show();

        String usn1 = b.getString("usn");
        Toast.makeText(getApplicationContext(),usn1,Toast.LENGTH_LONG).show();

        ((TextView)findViewById(R.id.username_second)).setText(username);
        ((TextView)findViewById(R.id.usn_second)).setText(usn1);
    }
}