package defpackage;

import android.view.View;

/* renamed from: aek  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aek extends aco {
    public boolean i = true;

    public abstract boolean a(adl adl);

    public abstract boolean a(adl adl, int i2, int i3, int i4, int i5);

    public final boolean a(adl adl, acn acn, acn acn2) {
        int i2 = acn.a;
        int i3 = acn.b;
        View view = adl.a;
        int left = acn2 != null ? acn2.a : view.getLeft();
        int top = acn2 != null ? acn2.b : view.getTop();
        if (adl.n() || (i2 == left && i3 == top)) {
            return a(adl);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return a(adl, i2, i3, left, top);
    }

    public abstract boolean a(adl adl, adl adl2, int i2, int i3, int i4, int i5);

    public abstract boolean b(adl adl);

    public final boolean b(adl adl, acn acn, acn acn2) {
        int i2;
        int i3;
        if (acn == null || ((i2 = acn.a) == (i3 = acn2.a) && acn.b == acn2.b)) {
            return b(adl);
        }
        return a(adl, i2, acn.b, i3, acn2.b);
    }

    public final boolean c(adl adl, acn acn, acn acn2) {
        int i2 = acn.a;
        int i3 = acn2.a;
        if (i2 == i3 && acn.b == acn2.b) {
            e(adl);
            return false;
        }
        return a(adl, i2, acn.b, i3, acn2.b);
    }

    public final boolean f(adl adl) {
        return !this.i || adl.k();
    }

    public final boolean a(adl adl, adl adl2, acn acn, acn acn2) {
        int i2;
        int i3;
        int i4 = acn.a;
        int i5 = acn.b;
        if (adl2.ax()) {
            int i6 = acn.a;
            i2 = acn.b;
            i3 = i6;
        } else {
            i3 = acn2.a;
            i2 = acn2.b;
        }
        return a(adl, adl2, i4, i5, i3, i2);
    }
}
