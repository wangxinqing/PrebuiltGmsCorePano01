package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: alcm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alcm extends abk {
    private final int[] a = new int[2];

    public alcm() {
        super(1);
    }

    public final void a(adb adb, adi adi, int i, int i2) {
        adb adb2 = adb;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < y()) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, i3);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, i3);
            int[] iArr = this.a;
            View b = adb2.b(i4);
            if (b != null) {
                acu acu = (acu) b.getLayoutParams();
                b.measure(ViewGroup.getChildMeasureSpec(makeMeasureSpec, s() + u(), acu.width), ViewGroup.getChildMeasureSpec(makeMeasureSpec2, t() + v(), acu.height));
                iArr[0] = b.getMeasuredWidth() + acu.leftMargin + acu.rightMargin;
                iArr[1] = b.getMeasuredHeight() + acu.bottomMargin + acu.topMargin;
                adb2.a(b);
            }
            if (this.i == 0) {
                int[] iArr2 = this.a;
                i5 += iArr2[0];
                if (i4 == 0) {
                    i6 = iArr2[1];
                }
            } else {
                int[] iArr3 = this.a;
                i6 += iArr3[1];
                if (i4 == 0) {
                    i5 = iArr3[0];
                }
            }
            i4++;
            i3 = 0;
        }
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, i5);
        } else if (mode != 1073741824) {
            size = i5;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, i6);
        } else if (mode2 != 1073741824) {
            size2 = i6;
        }
        i(size, size2);
    }
}
