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
public class ic_folder_special extends SVGRenderer {

    public ic_folder_special(Context context) {
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
        
        mPath.moveTo(20.0f, 6.0f);
        mPath.rLineTo(-8.0f, 0f);
        mPath.rLineTo(-2.0f, -2.0f);
        mPath.lineTo(4.0f, 4.0f);
        mPath.rCubicTo(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        mPath.rLineTo(0f, 12.0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        mPath.rLineTo(16.0f, 0f);
        mPath.rCubicTo(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.lineTo(22.0f, 8.0f);
        mPath.rCubicTo(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        mPath.close();
        mPath.moveTo(20.0f, 6.0f);
        mPath.rMoveTo(-2.06f, 11.0f);
        mPath.lineTo(15.0f, 15.28f);
        mPath.lineTo(12.06f, 17.0f);
        mPath.rLineTo(0.78f, -3.33f);
        mPath.rLineTo(-2.59f, -2.24f);
        mPath.rLineTo(3.41f, -0.29f);
        mPath.lineTo(15.0f, 8.0f);
        mPath.rLineTo(1.34f, 3.14f);
        mPath.rLineTo(3.41f, 0.29f);
        mPath.rLineTo(-2.59f, 2.24f);
        mPath.rLineTo(0.78f, 3.33f);
        mPath.close();
        mPath.moveTo(17.94f, 17.0f);
        
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