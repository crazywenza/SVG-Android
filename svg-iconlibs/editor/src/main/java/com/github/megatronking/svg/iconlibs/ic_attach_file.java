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
public class ic_attach_file extends SVGRenderer {

    public ic_attach_file(Context context) {
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
        
        mPath.moveTo(16.5f, 6.0f);
        mPath.rLineTo(0f, 11.5f);
        mPath.rCubicTo(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f);
        mPath.rCubicTo(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        mPath.lineTo(8.5f, 5.0f);
        mPath.rCubicTo(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        mPath.rCubicTo(1.3800001f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        mPath.rLineTo(0f, 10.5f);
        mPath.rCubicTo(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        mPath.rCubicTo(-0.5500002f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        mPath.lineTo(11.5f, 6.0f);
        mPath.lineTo(10.0f, 6.0f);
        mPath.rLineTo(0f, 9.5f);
        mPath.rCubicTo(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f);
        mPath.rCubicTo(1.3800001f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        mPath.lineTo(15.0f, 5.0f);
        mPath.rCubicTo(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        mPath.cubicTo(8.79f, 1.0f, 7.0f, 2.79f, 7.0f, 5.0f);
        mPath.rLineTo(0f, 12.5f);
        mPath.rCubicTo(0.0f, 3.04f, 2.46f, 5.5f, 5.5f, 5.5f);
        mPath.rCubicTo(3.04f, 0.0f, 5.5f, -2.46f, 5.5f, -5.5f);
        mPath.lineTo(18.0f, 6.0f);
        mPath.rLineTo(-1.5f, 0f);
        mPath.close();
        mPath.moveTo(16.5f, 6.0f);
        
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