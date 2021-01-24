package com.example.labprogram_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextpage(View view) {
        EditText username=findViewById(R.id.user_name);
        EditText usn1=findViewById(R.id.usn);
        Bundle b= new Bundle();
        b.putString("username",username.getText().toString());
        b.putString("usn" ,usn1.getText().toString());
        Intent it= new Intent(MainActivity.this,SecondActivity.class);
        it.putExtra("bundle",b);
        startActivity(it);

    }
}