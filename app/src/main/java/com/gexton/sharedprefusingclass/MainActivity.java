package com.gexton.sharedprefusingclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.gexton.sharedprefusingclass.utils.SharedPref;

public class MainActivity extends AppCompatActivity {
    TextView tvName, tvEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = findViewById(R.id.tvName);
        tvEmail = findViewById(R.id.tvEmail);

        SharedPref.init(getApplicationContext());
        SharedPref.write("name", "Asad Rao");
        SharedPref.write("email", "raoasad125@gmail.com");

        String name = SharedPref.read("name", "");
        String email = SharedPref.read("email", "");

        tvName.setText(name);
        tvEmail.setText(email);

    }
}