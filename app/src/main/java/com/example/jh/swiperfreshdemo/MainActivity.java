package com.example.jh.swiperfreshdemo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * 作者：jinhui on 2017/3/20
 * 邮箱：1004260403@qq.com
 *
 * 下拉刷新 + 对下拉动作的刷新监听setOnRefreshListener， handler进行数据的更新
 */


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    private Button btn_TextView;
    private Button btn_listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_TextView = (Button) findViewById(R.id.btn_textView);
        btn_listView = (Button) findViewById(R.id.btn_listView);
        btn_TextView.setOnClickListener(this);
        btn_listView.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btn_textView:
                intent = new Intent(getApplication(),TextViewActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_listView:
                intent = new Intent(getApplication(),ListViewActivity.class);
                startActivity(intent);
                break;
        }
    }
}
