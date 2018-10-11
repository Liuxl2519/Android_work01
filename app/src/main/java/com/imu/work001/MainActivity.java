package com.imu.work001;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn01,btn02,btn03,btn04,btn05,btn06,btn07,btn08,btn09,btn10,btn11,btn12,btn13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn01=findViewById(R.id.btn01);
        btn02=findViewById(R.id.btn02);
        btn03=findViewById(R.id.btn03);
        btn04=findViewById(R.id.btn04);
        btn05=findViewById(R.id.btn05);
        btn06=findViewById(R.id.btn06);
        btn07=findViewById(R.id.btn07);
        btn08=findViewById(R.id.btn08);
        btn09=findViewById(R.id.btn09);
        btn10=findViewById(R.id.btn10);
        btn11=findViewById(R.id.btn11);
        btn12=findViewById(R.id.btn12);
        btn13=findViewById(R.id.btn13);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent01=new Intent(MainActivity.this,XSIntent.class);
                startActivity(intent01);
            }
        });
        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent02=new Intent("com.imu.work001.ACTION_START");
                startActivity(intent02);
            }
        });
        btn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://ccs.imu.edu.cn/"));
                startActivity(intent);
            }
        });
        btn04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);
            }
        });
        btn05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent01=new Intent(MainActivity.this,Transport.class);
                startActivity(intent01);
            }
        });
        btn06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Rdata.class);
                startActivity(intent);
            }
        });
        btn07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,LifeCycle.class);
                startActivity(intent);
            }
        });
        btn08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Standard.class);
                startActivity(intent);
            }
        });
        btn09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SingleTop.class);
                startActivity(intent);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Patten.class);
                startActivity(intent);
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Talk.class);
                startActivity(intent);
            }
        });
    }
}
