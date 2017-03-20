package com.example.jh.swiperfreshdemo;

import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
/**
 * 作者：jinhui on 2017/3/20
 * 邮箱：1004260403@qq.com
 */


public class TextViewActivity extends ActionBarActivity {

    private SwipeRefreshLayout swipeRefreshLayout;
    private TextView tv_state;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        tv_state = (TextView) findViewById(R.id.tv_state);
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefresh);
        swipeRefreshLayout.setColorSchemeResources(android.R.color.holo_blue_light, android.R.color.holo_red_light, android.R.color.holo_orange_light, android.R.color.holo_green_light);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                //刷新5秒
                mHandler.sendEmptyMessageDelayed(0,5000);
            }
        });
    }

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            tv_state.setText("正在刷新");
            //刷新完成后停止刷新
            swipeRefreshLayout.setRefreshing(false);
        }
    };
}
