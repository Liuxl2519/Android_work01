package com.imu.work001;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Talk extends AppCompatActivity {
    private ListView msgListView;
    private EditText inputText;
    private Button send;
    private MsgAdapter adapter;
    private List<Msg> msgList = new ArrayList<Msg>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.talk);
        initMsgs(); // 初始化消息数据
        adapter = new MsgAdapter(Talk.this, R.layout.msg_item, msgList);
        inputText = findViewById(R.id.input_text);
        send = findViewById(R.id.send);
        msgListView = findViewById(R.id.msg_list_view);
        msgListView.setAdapter(adapter);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = inputText.getText().toString();
                if (!"".equals(content)) {
                    Msg msg = new Msg(content, Msg.TYPE_SENT);
                    msgList.add(msg);
                    adapter.notifyDataSetChanged(); // 当有新消息时，刷新ListView中的显示
                    msgListView.setSelection(msgList.size()); // 将ListView定位到最后一行
                    inputText.setText(""); // 清空输入框中的内容
                }
            }
        });
    }
    private void initMsgs() {
        Msg msg1 = new Msg("学习移动应用开发", Msg.TYPE_RECEIVED);
        msgList.add(msg1);
        Msg msg2 = new Msg("Android开发", Msg.TYPE_SENT);
        msgList.add(msg2);
        Msg msg3 = new Msg("内蒙古大学", Msg.TYPE_RECEIVED);
        msgList.add(msg3);
        Msg msg4 = new Msg("计算机学院", Msg.TYPE_SENT);
        msgList.add(msg4);
        Msg msg5 = new Msg("哈哈哈哈哈哈哈哈", Msg.TYPE_RECEIVED);
        msgList.add(msg5);
    }
}

