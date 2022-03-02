package defpackage;

import android.os.Build;
import android.widget.FrameLayout;

/* renamed from: yzy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yzy {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public yzy(yzz yzz, FrameLayout frameLayout) {
        frameLayout.measure(0, 0);
        int[] iArr = new int[2];
        yzz.b.getLocationOnScreen(iArr);
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int measuredHeight = (yzz.b.getMeasuredHeight() + i2) - yzz.b.getPaddingBottom();
        int measuredHeight2 = frameLayout.getMeasuredHeight();
        int i3 = Build.VERSION.SDK_INT;
        this.a = (measuredHeight2 + measuredHeight) + 48 <= yzz.l.getHeight() ? false : z;
        int measuredWidth = frameLayout.getMeasuredWidth() + i;
        int width = yzz.l.getWidth();
        int measuredWidth2 = (frameLayout.getMeasuredWidth() / 2) + i + (yzz.b.getMeasuredWidth() / 2);
        int width2 = yzz.l.getWidth();
        int measuredWidth3 = (yzz.b.getMeasuredWidth() / 2) - (yzz.o.getDrawable().getIntrinsicWidth() / 2);
        if (measuredWidth < width) {
            if (this.a) {
                this.d = 80;
            } else {
                this.d = 48;
            }
            this.b = measuredWidth3;
            this.c = 0;
        } else {
            boolean z2 = this.a;
            if (measuredWidth2 >= width2) {
                this.d = z2 ? 85 : 53;
                this.b = 0;
                this.c = measuredWidth3;
            } else {
                this.d = z2 ? 81 : 49;
                this.b = 0;
                this.c = 0;
            }
        }
        if (measuredWidth < width) {
            this.e = i;
        } else if (measuredWidth2 < width2) {
            this.e = (i - (frameLayout.getMeasuredWidth() / 2)) + (yzz.b.getMeasuredWidth() / 2);
        } else {
            this.e = (i - frameLayout.getMeasuredWidth()) + yzz.b.getMeasuredWidth();
        }
        this.f = this.a ? (i2 - frameLayout.getMeasuredHeight()) - yzz.b.getPaddingTop() : measuredHeight;
    }
}
