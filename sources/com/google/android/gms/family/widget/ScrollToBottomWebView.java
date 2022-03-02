package com.google.android.gms.family.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.webkit.WebView;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ScrollToBottomWebView extends WebView {
    public mrd a;

    public ScrollToBottomWebView(Context context) {
        super(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0037, code lost:
        r0 = (defpackage.mql) r3.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a() {
        /*
            r3 = this;
            mrd r0 = r3.a
            if (r0 == 0) goto L_0x0058
            int r0 = r3.getContentHeight()
            if (r0 <= 0) goto L_0x0058
            int r0 = r3.getContentHeight()
            float r0 = (float) r0
            mrd r1 = r3.a
            com.google.android.chimera.Fragment r1 = (com.google.android.chimera.Fragment) r1
            com.google.android.chimera.Activity r1 = r1.getActivity()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            int r0 = (int) r0
            int r1 = r3.getHeight()
            int r2 = r3.getScrollY()
            int r1 = r1 + r2
            int r0 = r0 - r1
            r1 = 10
            if (r0 >= r1) goto L_0x0058
            mrd r0 = r3.a
            mql r0 = (defpackage.mql) r0
            android.view.View r1 = r0.d
            if (r1 == 0) goto L_0x0058
            r2 = 2131428331(0x7f0b03eb, float:1.8478303E38)
            android.view.View r1 = r1.findViewById(r2)
            r2 = 8
            r1.setVisibility(r2)
            android.view.View r0 = r0.d
            r1 = 2131428330(0x7f0b03ea, float:1.8478301E38)
            android.view.View r0 = r0.findViewById(r1)
            r1 = 0
            r0.setVisibility(r1)
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.family.widget.ScrollToBottomWebView.a():void");
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a();
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        a();
    }

    public ScrollToBottomWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScrollToBottomWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
