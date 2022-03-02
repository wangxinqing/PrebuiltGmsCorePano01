package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class HeaderRecyclerView extends RecyclerView {
    public View a;
    private int b;
    private boolean c = false;

    public HeaderRecyclerView(Context context) {
        super(context);
        a((AttributeSet) null, 0);
    }

    private final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, alhx.h, i, 0);
        this.b = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0089, code lost:
        if (r1 == false) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.c
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0011
            int r0 = r6.getAction()
            if (r0 == r2) goto L_0x000d
            goto L_0x0011
        L_0x000d:
            r5.c = r1
            goto L_0x008c
        L_0x0011:
            int r0 = r6.getAction()
            if (r0 != 0) goto L_0x008d
            int r0 = r6.getKeyCode()
            r3 = 19
            r4 = 2
            if (r0 == r3) goto L_0x005b
            r3 = 20
            if (r0 == r3) goto L_0x0025
            goto L_0x0087
        L_0x0025:
            android.view.View r0 = r5.findFocus()
            if (r0 == 0) goto L_0x005a
            int[] r3 = new int[r4]
            int[] r4 = new int[r4]
            r0.getLocationInWindow(r3)
            r5.getLocationInWindow(r4)
            r3 = r3[r2]
            int r0 = r0.getMeasuredHeight()
            int r3 = r3 + r0
            r0 = r4[r2]
            int r4 = r5.getMeasuredHeight()
            int r0 = r0 + r4
            int r3 = r3 - r0
            if (r3 <= 0) goto L_0x005a
            int r0 = r5.getMeasuredHeight()
            float r0 = (float) r0
            r4 = 1060320051(0x3f333333, float:0.7)
            float r0 = r0 * r4
            int r0 = (int) r0
            int r0 = java.lang.Math.min(r0, r3)
            r5.smoothScrollBy(r1, r0)
            r1 = 1
            goto L_0x0087
        L_0x005a:
            goto L_0x0087
        L_0x005b:
            android.view.View r0 = r5.findFocus()
            if (r0 == 0) goto L_0x0086
            int[] r3 = new int[r4]
            int[] r4 = new int[r4]
            r0.getLocationInWindow(r3)
            r5.getLocationInWindow(r4)
            r0 = r3[r2]
            r3 = r4[r2]
            int r0 = r0 - r3
            if (r0 >= 0) goto L_0x0086
            int r3 = r5.getMeasuredHeight()
            float r3 = (float) r3
            r4 = -1087163597(0xffffffffbf333333, float:-0.7)
            float r3 = r3 * r4
            int r3 = (int) r3
            int r0 = java.lang.Math.max(r3, r0)
            r5.smoothScrollBy(r1, r0)
            r1 = 1
            goto L_0x0087
        L_0x0086:
        L_0x0087:
            r5.c = r1
            if (r1 != 0) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            return r2
        L_0x008d:
            boolean r6 = super.dispatchKeyEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.setupdesign.view.HeaderRecyclerView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (this.a != null) {
            i = 1;
        } else {
            i = 0;
        }
        accessibilityEvent.setItemCount(accessibilityEvent.getItemCount() - i);
        accessibilityEvent.setFromIndex(Math.max(accessibilityEvent.getFromIndex() - i, 0));
        int i2 = Build.VERSION.SDK_INT;
        accessibilityEvent.setToIndex(Math.max(accessibilityEvent.getToIndex() - i, 0));
    }

    public final void setAdapter(acg acg) {
        if (!(this.a == null || acg == null)) {
            aljo aljo = new aljo(acg);
            aljo.e = this.a;
            acg = aljo;
        }
        super.setAdapter(acg);
    }

    public final void setLayoutManager(act act) {
        super.setLayoutManager(act);
        if (act != null && this.a == null && this.b != 0) {
            this.a = LayoutInflater.from(getContext()).inflate(this.b, this, false);
        }
    }

    public HeaderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet, 0);
    }

    public HeaderRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet, i);
    }
}
