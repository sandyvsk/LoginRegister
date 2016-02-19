package com.example.santhosh.loginregister;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Home extends Activity {

    String name, password, email, address, phone, Err;
    TextView nameTV, emailTV, passwordTV, addressTV, phoneTV, err;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        nameTV = (TextView) findViewById(R.id.home_name);
        emailTV = (TextView) findViewById(R.id.home_email);
        passwordTV = (TextView) findViewById(R.id.home_password);
        addressTV = (TextView) findViewById(R.id.address);
        phoneTV = (TextView) findViewById(R.id.phone);
        err = (TextView) findViewById(R.id.err);

        name = getIntent().getStringExtra("name");
        password = getIntent().getStringExtra("password");
        email = getIntent().getStringExtra("email");
        address = getIntent().getStringExtra("address");
        phone = getIntent().getStringExtra("phone");
        Err = getIntent().getStringExtra("err");

        nameTV.setText("Welcome " + name);
        passwordTV.setText("Your password is " + password);
        emailTV.setText("Your email is " + email);
        addressTV.setText("Your Address is" + address);
        phoneTV.setText("Your Phone no is" + phone);
        err.setText(Err);
    }
}