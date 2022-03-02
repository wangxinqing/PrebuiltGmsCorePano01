package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue b;
    public TypedValue c;
    public TypedValue d;
    public TypedValue e;
    public TypedValue f;
    public TypedValue g;
    public final Rect h;
    public sy i;

    public ContentFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        sy syVar = this.i;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        wt wtVar;
        super.onDetachedFromWindow();
        sy syVar = this.i;
        if (syVar != null) {
            tn tnVar = syVar.a;
            zw zwVar = tnVar.j;
            if (zwVar != null) {
                zwVar.j();
            }
            if (tnVar.m != null) {
                tnVar.f.getDecorView().removeCallbacks(tnVar.n);
                if (tnVar.m.isShowing()) {
                    try {
                        tnVar.m.dismiss();
                    } catch (IllegalArgumentException e2) {
                    }
                }
                tnVar.m = null;
            }
            tnVar.u();
            tl f2 = tnVar.f(0);
            if (f2 != null && (wtVar = f2.j) != null) {
                wtVar.close();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            android.content.Context r1 = r16.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r2 = r1.widthPixels
            int r3 = r1.heightPixels
            int r4 = android.view.View.MeasureSpec.getMode(r17)
            int r5 = android.view.View.MeasureSpec.getMode(r18)
            r6 = 1
            r7 = 6
            r8 = 5
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 1073741824(0x40000000, float:2.0)
            r11 = 0
            if (r4 == r9) goto L_0x0028
            r12 = r17
            r13 = 0
            goto L_0x0075
        L_0x0028:
            if (r2 < r3) goto L_0x002d
            android.util.TypedValue r12 = r0.d
            goto L_0x002f
        L_0x002d:
            android.util.TypedValue r12 = r0.e
        L_0x002f:
            if (r12 != 0) goto L_0x0035
            r12 = r17
            r13 = 0
            goto L_0x0075
        L_0x0035:
            int r13 = r12.type
            if (r13 != 0) goto L_0x003d
            r12 = r17
            r13 = 0
            goto L_0x0075
        L_0x003d:
            int r13 = r12.type
            if (r13 != r8) goto L_0x0047
            float r12 = r12.getDimension(r1)
            int r12 = (int) r12
            goto L_0x0058
        L_0x0047:
            int r13 = r12.type
            if (r13 != r7) goto L_0x0057
            int r13 = r1.widthPixels
            float r13 = (float) r13
            int r14 = r1.widthPixels
            float r14 = (float) r14
            float r12 = r12.getFraction(r13, r14)
            int r12 = (int) r12
            goto L_0x0058
        L_0x0057:
            r12 = 0
        L_0x0058:
            if (r12 <= 0) goto L_0x0072
            android.graphics.Rect r13 = r0.h
            int r13 = r13.left
            android.graphics.Rect r14 = r0.h
            int r14 = r14.right
            int r13 = r13 + r14
            int r12 = r12 - r13
            int r13 = android.view.View.MeasureSpec.getSize(r17)
            int r12 = java.lang.Math.min(r12, r13)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r10)
            r13 = 1
            goto L_0x0075
        L_0x0072:
            r12 = r17
            r13 = 0
        L_0x0075:
            if (r5 == r9) goto L_0x0078
            goto L_0x00b9
        L_0x0078:
            if (r2 < r3) goto L_0x007d
            android.util.TypedValue r5 = r0.g
            goto L_0x007f
        L_0x007d:
            android.util.TypedValue r5 = r0.f
        L_0x007f:
            if (r5 == 0) goto L_0x00b9
            int r14 = r5.type
            if (r14 == 0) goto L_0x00b9
            int r14 = r5.type
            if (r14 != r8) goto L_0x008f
            float r5 = r5.getDimension(r1)
            int r5 = (int) r5
            goto L_0x00a0
        L_0x008f:
            int r14 = r5.type
            if (r14 != r7) goto L_0x009f
            int r14 = r1.heightPixels
            float r14 = (float) r14
            int r15 = r1.heightPixels
            float r15 = (float) r15
            float r5 = r5.getFraction(r14, r15)
            int r5 = (int) r5
            goto L_0x00a0
        L_0x009f:
            r5 = 0
        L_0x00a0:
            if (r5 <= 0) goto L_0x00b9
            android.graphics.Rect r14 = r0.h
            int r14 = r14.top
            android.graphics.Rect r15 = r0.h
            int r15 = r15.bottom
            int r14 = r14 + r15
            int r5 = r5 - r14
            int r14 = android.view.View.MeasureSpec.getSize(r18)
            int r5 = java.lang.Math.min(r5, r14)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10)
            goto L_0x00bb
        L_0x00b9:
            r5 = r18
        L_0x00bb:
            super.onMeasure(r12, r5)
            int r12 = r16.getMeasuredWidth()
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r10)
            if (r13 == 0) goto L_0x00ca
            r6 = 0
            goto L_0x010d
        L_0x00ca:
            if (r4 == r9) goto L_0x00ce
        L_0x00cc:
            r6 = 0
            goto L_0x010d
        L_0x00ce:
            if (r2 < r3) goto L_0x00d3
            android.util.TypedValue r2 = r0.b
            goto L_0x00d5
        L_0x00d3:
            android.util.TypedValue r2 = r0.c
        L_0x00d5:
            if (r2 != 0) goto L_0x00d8
            goto L_0x00cc
        L_0x00d8:
            int r3 = r2.type
            if (r3 != 0) goto L_0x00de
            r6 = 0
            goto L_0x010d
        L_0x00de:
            int r3 = r2.type
            if (r3 != r8) goto L_0x00e8
            float r1 = r2.getDimension(r1)
            int r1 = (int) r1
            goto L_0x00f9
        L_0x00e8:
            int r3 = r2.type
            if (r3 != r7) goto L_0x00f8
            int r3 = r1.widthPixels
            float r3 = (float) r3
            int r1 = r1.widthPixels
            float r1 = (float) r1
            float r1 = r2.getFraction(r3, r1)
            int r1 = (int) r1
            goto L_0x00f9
        L_0x00f8:
            r1 = 0
        L_0x00f9:
            if (r1 <= 0) goto L_0x0105
            android.graphics.Rect r2 = r0.h
            int r2 = r2.left
            android.graphics.Rect r3 = r0.h
            int r3 = r3.right
            int r2 = r2 + r3
            int r1 = r1 - r2
        L_0x0105:
            if (r12 >= r1) goto L_0x010c
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r10)
            goto L_0x010d
        L_0x010c:
            r6 = 0
        L_0x010d:
            if (r6 == 0) goto L_0x0112
            super.onMeasure(r14, r5)
        L_0x0112:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.h = new Rect();
    }
}
