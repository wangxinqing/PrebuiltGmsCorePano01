package com.google.android.gms.smartdevice.setup.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CircularImageView extends ImageView {
    public CircularImageView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            r1 = 1
            r0.setAntiAlias(r1)
            android.graphics.drawable.Drawable r1 = r6.getDrawable()
            r2 = 0
            if (r1 == 0) goto L_0x0039
            int r3 = r6.getWidth()
            int r4 = r6.getHeight()
            if (r3 > 0) goto L_0x0021
            r3 = r2
            goto L_0x003a
        L_0x0021:
            if (r4 <= 0) goto L_0x0039
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r4, r5)
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>(r3)
            android.graphics.Matrix r5 = r6.getImageMatrix()
            r4.concat(r5)
            r1.draw(r4)
            goto L_0x003a
        L_0x0039:
            r3 = r2
        L_0x003a:
            if (r3 == 0) goto L_0x0049
            android.graphics.BitmapShader r1 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.CLAMP
            r1.<init>(r3, r2, r4)
            r0.setShader(r1)
            goto L_0x004d
        L_0x0049:
            r0.setShader(r2)
        L_0x004d:
            int r1 = r6.getWidth()
            int r2 = r6.getHeight()
            int r1 = java.lang.Math.min(r1, r2)
            int r2 = r6.getWidth()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            int r4 = r6.getHeight()
            float r4 = (float) r4
            float r4 = r4 / r3
            float r1 = (float) r1
            float r1 = r1 / r3
            r7.drawCircle(r2, r4, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.smartdevice.setup.ui.views.CircularImageView.onDraw(android.graphics.Canvas):void");
    }

    public CircularImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CircularImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
