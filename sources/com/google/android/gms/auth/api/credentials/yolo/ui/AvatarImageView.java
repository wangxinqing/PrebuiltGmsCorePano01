package com.google.android.gms.auth.api.credentials.yolo.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AvatarImageView extends jmg {
    private Paint g;

    public AvatarImageView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        Paint paint = this.g;
        if (paint != null) {
            canvas.drawOval(new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight()), paint);
        } else {
            super.onDraw(canvas);
        }
    }

    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap((Bitmap) null);
        if (bitmap != null) {
            BitmapShader bitmapShader = new BitmapShader(Bitmap.createScaledBitmap(bitmap, getWidth(), getHeight(), false), Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            Paint paint = new Paint();
            this.g = paint;
            paint.setAntiAlias(true);
            this.g.setShader(bitmapShader);
            return;
        }
        this.g = null;
    }

    public AvatarImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
