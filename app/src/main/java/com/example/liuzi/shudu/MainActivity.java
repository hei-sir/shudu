package com.example.liuzi.shudu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){                     //初始化
        start=(ImageView)findViewById(R.id.start);
        start.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start:
                login(v);
                break;
            default:
        }
    }

    public void login(View v){                  //跳转
        Intent intent=new Intent(this,shuduActivity.class);
        startActivity(intent);
        finish();
    }

}
