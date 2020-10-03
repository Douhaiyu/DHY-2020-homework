package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test.util.DisplayUtil;
import com.example.test.util.utils;

public class MainActivity extends AppCompatActivity {

    private TextView text_screen;
    private utils Utils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取屏幕文件中id为text_screen的TextView
        text_screen = findViewById(R.id.test_screen);

        //单位换算,自定义转换函数
        int dip_10 = Utils.dip2px(this,10L);

        //设置间距
        text_screen.setPadding(dip_10,dip_10,dip_10,dip_10);
        //设置背景颜色
        text_screen.setBackgroundColor(0xff00ffff);
        //设置字体颜色
        text_screen.setTextColor(0xff333333);

        showScreenInfo();
        }
    //获取屏幕信息
    private void showScreenInfo(){
        int width = DisplayUtil.getScreenWidth(this);
        int height = DisplayUtil.getSystemHeight(this);
        float density = DisplayUtil.getSystemDensity(this);
        String info = String.format("当前屏幕的宽度是%dpx,高度是%dpx，像素密度是%f",width,height,density);
        text_screen.setText(info);
    }

}
