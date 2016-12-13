package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_scanner extends SVGRenderer {

    public ic_scanner(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(19.8f, 10.7f);
        mPath.lineTo(4.2f, 5.0f);
        mPath.rLineTo(-0.7f, 1.9f);
        mPath.lineTo(17.6f, 12.0f);
        mPath.lineTo(5.0f, 12.0f);
        mPath.rCubicTo(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        mPath.rLineTo(0f, 4.0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        mPath.rLineTo(14.0f, 0f);
        mPath.rCubicTo(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.rLineTo(0f, -5.5f);
        mPath.rCubicTo(0.0f, -0.8f, -0.5f, -1.6f, -1.2f, -1.8f);
        mPath.close();
        mPath.moveTo(19.8f, 10.7f);
        mPath.moveTo(7.0f, 17.0f);
        mPath.lineTo(5.0f, 17.0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.close();
        mPath.moveTo(7.0f, 17.0f);
        mPath.rMoveTo(12.0f, 0.0f);
        mPath.lineTo(9.0f, 17.0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(10.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.close();
        mPath.moveTo(19.0f, 17.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}