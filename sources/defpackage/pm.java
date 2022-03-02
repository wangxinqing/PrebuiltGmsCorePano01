package defpackage;

import android.view.View;
import android.view.ViewParent;

/* renamed from: pm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pm {
    public boolean a;
    private ViewParent b;
    private ViewParent c;
    private final View d;
    private int[] e;

    public pm(View view) {
        this.d = view;
    }

    private final void a(int i, ViewParent viewParent) {
        if (i == 0) {
            this.b = viewParent;
        } else if (i == 1) {
            this.c = viewParent;
        }
    }

    private final int[] c() {
        if (this.e == null) {
            this.e = new int[2];
        }
        return this.e;
    }

    private final ViewParent d(int i) {
        if (i == 0) {
            return this.b;
        }
        if (i != 1) {
            return null;
        }
        return this.c;
    }

    public final void b() {
        c(0);
    }

    public final void a(boolean z) {
        if (this.a) {
            qb.z(this.d);
        }
        this.a = z;
    }

    public final boolean b(int i) {
        return a(i, 0);
    }

    public final void c(int i) {
        ViewParent d2 = d(i);
        if (d2 != null) {
            qd.a(d2, this.d, i);
            a(i, (ViewParent) null);
        }
    }

    public final boolean a() {
        return a(0);
    }

    public final boolean a(float f, float f2) {
        ViewParent d2;
        if (!this.a || (d2 = d(0)) == null) {
            return false;
        }
        return qd.a(d2, this.d, f, f2);
    }

    public final boolean a(float f, float f2, boolean z) {
        ViewParent d2;
        if (!this.a || (d2 = d(0)) == null) {
            return false;
        }
        return qd.a(d2, this.d, f, f2, z);
    }

    public final boolean a(int i) {
        return d(i) != null;
    }

    public final boolean a(int i, int i2) {
        if (a(i2)) {
            return true;
        }
        if (!this.a) {
            return false;
        }
        ViewParent parent = this.d.getParent();
        View view = this.d;
        while (parent != null) {
            if (!qd.a(parent, view, this.d, i, i2)) {
                if (parent instanceof View) {
                    view = (View) parent;
                }
                parent = parent.getParent();
            } else {
                a(i2, parent);
                qd.b(parent, view, this.d, i, i2);
                return true;
            }
        }
        return false;
    }

    public final boolean a(int i, int i2, int i3, int i4, int[] iArr) {
        return a(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    public final boolean a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent d2;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!this.a || (d2 = d(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.d.getLocationInWindow(iArr4);
            i7 = iArr4[0];
            i6 = iArr4[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            int[] c2 = c();
            c2[0] = 0;
            c2[1] = 0;
            iArr3 = c2;
        } else {
            iArr3 = iArr2;
        }
        qd.a(d2, this.d, i, i2, i3, i4, i5, iArr3);
        if (iArr4 != null) {
            this.d.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i7;
            iArr4[1] = iArr4[1] - i6;
        }
        return true;
    }

    public final boolean a(int i, int i2, int[] iArr, int[] iArr2) {
        return a(i, i2, iArr, iArr2, 0);
    }

    public final boolean a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent d2;
        int i4;
        int i5;
        if (!this.a || (d2 = d(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.d.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i4 = iArr2[1];
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (iArr == null) {
            iArr = c();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        qd.a(d2, this.d, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.d.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i4;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }
}
