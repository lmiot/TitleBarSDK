package com.lmiot.titlebarsdk;

import android.graphics.Color;
import android.os.Looper;
import android.os.MessageQueue;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.lmiot.tiblebarlibrary.LmiotTitleBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LmiotTitleBar lmiotTitleBar= (LmiotTitleBar) findViewById(R.id.id_lmiot_title_bar);


        lmiotTitleBar.setOnItemClickListener(new LmiotTitleBar.onItemClickListener() {
            @Override
            public void onBackClick(View var1) {
                //返回键点击监听

                Toast.makeText(MainActivity.this, "BackClick", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onMenuClick(View var1) {

                //菜单键返回监听
                Toast.makeText(MainActivity.this, "MenuClick", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onTitleClick(View var1) {
                //标题点击监听
                Toast.makeText(MainActivity.this, "TitleClick", Toast.LENGTH_SHORT).show();

            }
        });

        lmiotTitleBar.setBg(Color.TRANSPARENT);
        lmiotTitleBar.setTitleColor(Color.BLACK);
        StatusBarUtil.darkMode(this,Color.GREEN,0.5f);
        StatusBarUtil.setMargin(this,lmiotTitleBar);
        SetTitleColor();


    }


    /**
     * 改变标题栏颜色
     */
    private void SetTitleColor() {
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() {
            @Override
            public boolean queueIdle() {
                if (true) {
                    initStatusBar();
                    getWindow().getDecorView().addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                        @Override
                        public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                            initStatusBar();
                        }
                    });
                }       //只走一次
                return false;
            }
        });
    }

    private void initStatusBar() {
        int identifier = getResources().getIdentifier("statusBarBackground", "id", "android");
        View  StatusBarView = getWindow().findViewById(identifier);
        if (StatusBarView != null) {
            StatusBarView.setBackgroundResource(R.drawable.title_color); //颜色资源ID
        }

    }
}
