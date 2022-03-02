package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ButtonBarLayout extends LinearLayout {
    private boolean a;
    private int b = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uh.k);
        qb.a(this, context, uh.k, attributeSet, obtainStyledAttributes, 0, 0);
        this.a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    private final int a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r1 != false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            boolean r1 = r5.a
            r2 = 0
            if (r1 != 0) goto L_0x000a
            goto L_0x0019
        L_0x000a:
            int r1 = r5.b
            if (r0 <= r1) goto L_0x0017
            boolean r1 = r5.a()
            if (r1 == 0) goto L_0x0017
            r5.a((boolean) r2)
        L_0x0017:
            r5.b = r0
        L_0x0019:
            boolean r1 = r5.a()
            r3 = 1
            if (r1 != 0) goto L_0x0030
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 != r4) goto L_0x0030
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = 1
            goto L_0x0032
        L_0x0030:
            r0 = r6
            r1 = 0
        L_0x0032:
            super.onMeasure(r0, r7)
            boolean r0 = r5.a
            if (r0 == 0) goto L_0x004e
            boolean r0 = r5.a()
            if (r0 != 0) goto L_0x004e
            int r0 = r5.getMeasuredWidthAndState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r4
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 != r4) goto L_0x004e
            r5.a((boolean) r3)
            goto L_0x0050
        L_0x004e:
            if (r1 == 0) goto L_0x0053
        L_0x0050:
            super.onMeasure(r6, r7)
        L_0x0053:
            int r6 = r5.a((int) r2)
            if (r6 < 0) goto L_0x00a2
            android.view.View r7 = r5.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r1 = r5.getPaddingTop()
            int r7 = r7.getMeasuredHeight()
            int r1 = r1 + r7
            int r7 = r0.topMargin
            int r1 = r1 + r7
            int r7 = r0.bottomMargin
            int r2 = r1 + r7
            boolean r7 = r5.a()
            if (r7 == 0) goto L_0x009c
            int r6 = r6 + r3
            int r6 = r5.a((int) r6)
            if (r6 < 0) goto L_0x009b
            android.view.View r6 = r5.getChildAt(r6)
            int r6 = r6.getPaddingTop()
            android.content.res.Resources r7 = r5.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            r0 = 1098907648(0x41800000, float:16.0)
            float r7 = r7 * r0
            int r7 = (int) r7
            int r6 = r6 + r7
            int r2 = r2 + r6
            goto L_0x00a3
        L_0x009b:
            goto L_0x00a3
        L_0x009c:
            int r6 = r5.getPaddingBottom()
            int r2 = r2 + r6
            goto L_0x00a3
        L_0x00a2:
        L_0x00a3:
            int r6 = defpackage.qb.l(r5)
            if (r6 == r2) goto L_0x00ac
            r5.setMinimumHeight(r2)
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ButtonBarLayout.onMeasure(int, int):void");
    }

    private final void a(boolean z) {
        int i;
        int i2;
        setOrientation(z ? 1 : 0);
        if (!z) {
            i = 80;
        } else {
            i = 5;
        }
        setGravity(i);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            if (!z) {
                i2 = 4;
            } else {
                i2 = 8;
            }
            findViewById.setVisibility(i2);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    private final boolean a() {
        return getOrientation() == 1;
    }
}
