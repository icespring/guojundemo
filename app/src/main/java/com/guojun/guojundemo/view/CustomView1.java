package com.guojun.guojundemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CustomView1 extends View {


    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public CustomView1(Context context) {
        this(context, null);
    }

    public CustomView1(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomView1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        // 这里如果是使用 XML 指定了宽高，就已经测量好了，不需要再测量了
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setStyle(Paint.Style.STROKE); // 画边框
        paint.setColor(Color.BLACK); // 边框颜色
        canvas.drawRect(0, 0, getMeasuredWidth(), getMeasuredHeight(), paint);

        paint.setStyle(Paint.Style.FILL); // 画点
        paint.setColor(Color.BLUE); // 画个蓝色
        canvas.drawCircle(getMeasuredWidth() >> 2, getMeasuredHeight() >> 2, 5, paint);
    }
}
