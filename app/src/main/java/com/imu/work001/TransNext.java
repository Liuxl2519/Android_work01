package com.imu.work001;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class TransNext extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trans_next);

        Intent intent=getIntent();
        String data=intent.getStringExtra("extra_data");
        TextView lblTitle=(TextView)findViewById(R.id.tv2);
        lblTitle.setText(data);
    }
}
