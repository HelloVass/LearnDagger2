package com.dove.flyer.fuckthirdpart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

public class ClassARoomActivity extends AppCompatActivity {

    TextView mUserNameTv;
    Button mCleanToBBtn;
    Button mToBBtn;
    @Inject User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_aroom);
        mUserNameTv = (TextView) findViewById(R.id.user_name_tv);
        mCleanToBBtn = (Button) findViewById(R.id.clean_to_b_btn);
        mToBBtn = (Button) findViewById(R.id.to_b_btn);
        App.getUserComponent().injectTo(this);

        mUserNameTv.setText(mUser.toString());
        // 直接跳转 B
        mToBBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ClassARoomActivity.this,ClassBRoomActivity.class));
                finish();
            }
        });
        // 跳转之前,清除创建好的 UserComponent
        mCleanToBBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                App.releaseUserComponent();
                startActivity(new Intent(ClassARoomActivity.this,ClassBRoomActivity.class));
                finish();
            }
        });

    }

}
