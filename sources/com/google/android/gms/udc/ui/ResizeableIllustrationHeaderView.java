package com.google.android.gms.udc.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ResizeableIllustrationHeaderView extends LinearLayout {
    private static final jjg b = jjg.a();
    public double a = 1.5d;
    private float c = 0.0f;

    public ResizeableIllustrationHeaderView(Context context) {
        super(context);
    }

    private final ViewGroup a() {
        try {
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.illustration_container);
            if (viewGroup == null) {
                ((anih) ((anih) b.b()).a("com.google.android.gms.udc.ui.ResizeableIllustrationHeaderView", "a", 146, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot find illustration container.");
            }
            return viewGroup;
        } catch (ClassCastException e) {
            anih anih = (anih) b.b();
            anih.a((Throwable) e);
            ((anih) anih.a("com.google.android.gms.udc.ui.ResizeableIllustrationHeaderView", "a", 150, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Illustration container is not ViewGroup");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001c, code lost:
        if (r1 != 0) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            float r0 = r7.c
            android.content.Context r1 = r7.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.heightPixels
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = (int) r0
            int r1 = android.view.View.MeasureSpec.getMode(r9)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L_0x0020
            if (r1 == 0) goto L_0x001f
            goto L_0x002d
        L_0x001f:
            goto L_0x0028
        L_0x0020:
            int r9 = android.view.View.MeasureSpec.getSize(r9)
            int r0 = java.lang.Math.min(r0, r9)
        L_0x0028:
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
        L_0x002d:
            int r0 = android.view.View.MeasureSpec.getSize(r9)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            super.onMeasure(r8, r1)
            java.lang.String r1 = "com.google.android.gms.udc.ui.ResizeableIllustrationHeaderView"
            java.lang.String r2 = "a"
            java.lang.String r3 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            r4 = 2131428676(0x7f0b0544, float:1.8479003E38)
            android.view.View r4 = r7.findViewById(r4)     // Catch:{ ClassCastException -> 0x005f }
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch:{ ClassCastException -> 0x005f }
            if (r4 != 0) goto L_0x0079
            jjg r5 = b     // Catch:{ ClassCastException -> 0x005f }
            anie r5 = r5.b()     // Catch:{ ClassCastException -> 0x005f }
            anih r5 = (defpackage.anih) r5     // Catch:{ ClassCastException -> 0x005f }
            r6 = 146(0x92, float:2.05E-43)
            anie r5 = r5.a((java.lang.String) r1, (java.lang.String) r2, (int) r6, (java.lang.String) r3)     // Catch:{ ClassCastException -> 0x005f }
            anih r5 = (defpackage.anih) r5     // Catch:{ ClassCastException -> 0x005f }
            java.lang.String r6 = "Cannot find illustration container."
            r5.a((java.lang.String) r6)     // Catch:{ ClassCastException -> 0x005f }
            goto L_0x0079
        L_0x005f:
            r4 = move-exception
            jjg r5 = b
            anie r5 = r5.b()
            anih r5 = (defpackage.anih) r5
            r5.a((java.lang.Throwable) r4)
            r4 = 150(0x96, float:2.1E-43)
            anie r1 = r5.a((java.lang.String) r1, (java.lang.String) r2, (int) r4, (java.lang.String) r3)
            anih r1 = (defpackage.anih) r1
            java.lang.String r2 = "Illustration container is not ViewGroup"
            r1.a((java.lang.String) r2)
            r4 = 0
        L_0x0079:
            if (r4 == 0) goto L_0x00b2
            int r1 = r4.getVisibility()
            r2 = 0
            if (r1 != 0) goto L_0x0087
            int r1 = r4.getMeasuredHeight()
            goto L_0x0088
        L_0x0087:
            r1 = 0
        L_0x0088:
            int r3 = r7.getMeasuredHeight()
            int r3 = r3 - r1
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
            double r5 = r7.a
            int r1 = r7.getMeasuredWidth()
            int r0 = defpackage.adfh.a(r0, r5, r1)
            if (r0 != 0) goto L_0x00a5
            r0 = 8
            r4.setVisibility(r0)
            goto L_0x00ae
        L_0x00a5:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r1.height = r0
            r4.setVisibility(r2)
        L_0x00ae:
            super.onMeasure(r8, r9)
            return
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.udc.ui.ResizeableIllustrationHeaderView.onMeasure(int, int):void");
    }

    public ResizeableIllustrationHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public ResizeableIllustrationHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, adfj.a, 0, 0);
            try {
                this.c = obtainStyledAttributes.getFloat(0, 0.0f);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }
}
