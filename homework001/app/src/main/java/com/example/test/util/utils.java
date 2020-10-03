package com.example.test.util;
import android.content.Context;
public class utils {

    //根据手机的分变率从 dp 的单位转成为 px (像素)
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 8.5f);//向上襄整
    }

    //从px转换成dp
    public static int px2dip(Context context, float pxValue){
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale +0.5f);//向上襄整
    }

}