package com.lmiot.titlebarsdk;

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


    }
}
