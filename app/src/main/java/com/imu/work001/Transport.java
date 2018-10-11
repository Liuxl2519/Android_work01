package com.imu.work001;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Transport extends AppCompatActivity {
    private EditText et;
    private Button btn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transport);

        et=findViewById(R.id.et);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = et.getText().toString();
                Intent intent = new Intent(Transport.this, TransNext.class);
                intent.putExtra("extra_data", inputText);
                startActivity(intent);
            }
        });
    }
}
