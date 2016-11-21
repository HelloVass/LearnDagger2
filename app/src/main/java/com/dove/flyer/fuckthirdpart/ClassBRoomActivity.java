package com.dove.flyer.fuckthirdpart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

public class ClassBRoomActivity extends AppCompatActivity {

    TextView mUserNameTv;
    Button mLogoutBtn;


    @Inject User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_broom);
        mUserNameTv = (TextView) findViewById(R.id.user_name_tv);
        mLogoutBtn = (Button) findViewById(R.id.logout_btn);

        App.getUserComponent().injectTo(this);

        mUserNameTv.setText(mUser.toString());
        mLogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
