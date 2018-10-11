package com.imu.work001;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ReturnData extends AppCompatActivity {
    private EditText et01;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.return_data);
    }

    @Override
    public void onBackPressed() {
        et01=findViewById(R.id.et2);
        String data=et01.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("data_return", data);
        setResult(RESULT_OK, intent);
        finish();
    }
}
