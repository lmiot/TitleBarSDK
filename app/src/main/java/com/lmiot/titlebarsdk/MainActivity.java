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


    }
}
