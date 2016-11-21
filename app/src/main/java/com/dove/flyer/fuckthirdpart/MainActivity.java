package com.dove.flyer.fuckthirdpart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button mUser1Btn;
//    Button mUser2Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUser1Btn = (Button) findViewById(R.id.user_1_login_btn);
        mUser1Btn.setOnClickListener(this);
//        mUser2Btn = (Button) findViewById(R.id.user_2_login_btn);
//        mUser2Btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.user_1_login_btn:
                startActivity(new Intent(this,ClassARoomActivity.class));
                break;
//            case R.id.user_2_login_btn:
//                startActivity(new Intent(this,ClassBRoomActivity.class));
//                break;
        }
    }
}
