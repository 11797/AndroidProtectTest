package com.example.myapplication1;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class CustomVie extends View {
    private Paint mPaint;//画笔
    private Context mContext;
    public CustomVie(Context context) {
        super(context);
    }
    public CustomVie(Context context, AttributeSet attrs) {

        super(context, attrs);
       initPaint();
        mContext=context;

    }

    private void initPaint() {

// 实例化画笔并打开抗锯齿

        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setStyle(Paint.Style.STROKE);//描边
        mPaint.setColor(Color.LTGRAY);//设置画笔为浅灰色
        mPaint.setStrokeWidth(10);

    }
    @Override

    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);
        canvas.drawCircle(550, 700, 200, mPaint);


    }




}
