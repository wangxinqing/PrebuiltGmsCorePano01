package defpackage;

import android.os.Build;

/* renamed from: arv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arv {
    private static final boolean a = (Build.VERSION.SDK_INT >= 28);

    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.view.View a(android.view.ViewGroup r16, android.view.View r17, android.view.View r18) {
        /*
            r0 = r16
            r1 = r17
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            int r3 = r18.getScrollX()
            int r3 = -r3
            float r3 = (float) r3
            int r4 = r18.getScrollY()
            int r4 = -r4
            float r4 = (float) r4
            r2.setTranslate(r3, r4)
            asi r3 = defpackage.asc.a
            r3.a((android.view.View) r1, (android.graphics.Matrix) r2)
            asi r3 = defpackage.asc.a
            r3.b(r0, r2)
            android.graphics.RectF r3 = new android.graphics.RectF
            int r4 = r17.getWidth()
            float r4 = (float) r4
            int r5 = r17.getHeight()
            float r5 = (float) r5
            r6 = 0
            r3.<init>(r6, r6, r4, r5)
            r2.mapRect(r3)
            float r4 = r3.left
            int r4 = java.lang.Math.round(r4)
            float r5 = r3.top
            int r5 = java.lang.Math.round(r5)
            float r6 = r3.right
            int r6 = java.lang.Math.round(r6)
            float r7 = r3.bottom
            int r7 = java.lang.Math.round(r7)
            android.widget.ImageView r8 = new android.widget.ImageView
            android.content.Context r9 = r17.getContext()
            r8.<init>(r9)
            android.widget.ImageView$ScaleType r9 = android.widget.ImageView.ScaleType.CENTER_CROP
            r8.setScaleType(r9)
            boolean r9 = r17.isAttachedToWindow()
            r9 = r9 ^ 1
            r10 = 0
            if (r0 == 0) goto L_0x0069
            boolean r11 = r16.isAttachedToWindow()
            goto L_0x006a
        L_0x0069:
            r11 = 0
        L_0x006a:
            r12 = 0
            if (r9 != 0) goto L_0x0070
            r10 = r12
            r11 = 0
            goto L_0x0083
        L_0x0070:
            if (r11 == 0) goto L_0x00fc
            android.view.ViewParent r10 = r17.getParent()
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            int r11 = r10.indexOfChild(r1)
            android.view.ViewGroupOverlay r13 = r16.getOverlay()
            r13.add(r1)
        L_0x0083:
            float r13 = r3.width()
            int r13 = java.lang.Math.round(r13)
            float r14 = r3.height()
            int r14 = java.lang.Math.round(r14)
            if (r13 > 0) goto L_0x0096
            goto L_0x00ee
        L_0x0096:
            if (r14 <= 0) goto L_0x00ed
            r15 = 1233125376(0x49800000, float:1048576.0)
            int r12 = r13 * r14
            float r12 = (float) r12
            float r15 = r15 / r12
            r12 = 1065353216(0x3f800000, float:1.0)
            float r12 = java.lang.Math.min(r12, r15)
            float r13 = (float) r13
            float r13 = r13 * r12
            int r13 = java.lang.Math.round(r13)
            float r14 = (float) r14
            float r14 = r14 * r12
            int r14 = java.lang.Math.round(r14)
            float r15 = r3.left
            float r15 = -r15
            float r3 = r3.top
            float r3 = -r3
            r2.postTranslate(r15, r3)
            r2.postScale(r12, r12)
            boolean r3 = a
            if (r3 == 0) goto L_0x00da
            android.graphics.Picture r3 = new android.graphics.Picture
            r3.<init>()
            android.graphics.Canvas r12 = r3.beginRecording(r13, r14)
            r12.concat(r2)
            r1.draw(r12)
            r3.endRecording()
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r3)
            r12 = r2
            goto L_0x00ee
        L_0x00da:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r13, r14, r3)
            android.graphics.Canvas r12 = new android.graphics.Canvas
            r12.<init>(r3)
            r12.concat(r2)
            r1.draw(r12)
            r12 = r3
            goto L_0x00ee
        L_0x00ed:
        L_0x00ee:
            if (r9 == 0) goto L_0x00fb
            android.view.ViewGroupOverlay r0 = r16.getOverlay()
            r0.remove(r1)
            r10.addView(r1, r11)
            goto L_0x00fd
        L_0x00fb:
            goto L_0x00fd
        L_0x00fc:
        L_0x00fd:
            if (r12 != 0) goto L_0x0100
            goto L_0x0103
        L_0x0100:
            r8.setImageBitmap(r12)
        L_0x0103:
            int r0 = r6 - r4
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            int r2 = r7 - r5
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            r8.measure(r0, r1)
            r8.layout(r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arv.a(android.view.ViewGroup, android.view.View, android.view.View):android.view.View");
    }
}
