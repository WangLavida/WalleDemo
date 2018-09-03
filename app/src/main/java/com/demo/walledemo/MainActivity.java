package com.demo.walledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.meituan.android.walle.*;

import static android.R.attr.type;

public class MainActivity extends AppCompatActivity {
    private TextView tvInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvInfo = findViewById(R.id.tv_info);
        String channel = WalleChannelReader.getChannel(MainActivity.this);
//        int type = BuildConfig.ENV_TYPE;
        tvInfo.setText(channel);
    }
}
