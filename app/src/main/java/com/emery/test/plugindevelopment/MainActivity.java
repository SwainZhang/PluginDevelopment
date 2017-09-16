package com.emery.test.plugindevelopment;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends SkinActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.tv_hello);
    }

    public void chose1(View view) {
        //加载不成功就是红色，加载成功就是粉红色
        String path = new File(Environment.getExternalStorageDirectory(),
                "skin.apk").getAbsolutePath();

        SkinManager instance = SkinManager.getInstance();
        instance.loadSkin(path);
        update();
       /*
        mTextView.setTextColor(SkinManager.getInstance().getColor(R.color.colorAccent));
        // mTextView.setTextColor(getResources().getColor(R.color.colorAccent));*/
    }

    public void chose2(View view) {

    }

    public void chose3(View view) {

    }
}
