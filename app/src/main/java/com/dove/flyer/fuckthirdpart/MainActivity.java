package com.dove.flyer.fuckthirdpart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    TextView mUserAgeTv;
    @Inject User mUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUserAgeTv = (TextView) findViewById(R.id.user_age_tv);
        DaggerUserComponent.builder().build().injectTo(this);
        mUserAgeTv.setText("" + mUser.getAge());
    }
}
