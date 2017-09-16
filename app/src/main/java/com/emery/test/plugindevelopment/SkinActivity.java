package com.emery.test.plugindevelopment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.LayoutInflaterCompat;

/**
 * Created by MyPC on 2017/3/17.
 */

public class SkinActivity extends Activity {
    protected SkinInflateFactory mSkinInflateFactory;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //给当前的activity设置xml监听器,因为每一个控件的创建都会走LayoutInflaterCompat 的onCreateView（）这里，
        // 而我们在这个factory的onCreateView方法里，就是把这些控件都收集起来，那么换肤的过程就像我们平时setTextColo()
        // setBackgroundResource()一样了。
        mSkinInflateFactory = new SkinInflateFactory();
        LayoutInflaterCompat.setFactory(getLayoutInflater(), mSkinInflateFactory);
        SkinManager.getInstance().init(getApplicationContext());
    }

    public void update() {
        mSkinInflateFactory.startChangeSkins();
    }
}
