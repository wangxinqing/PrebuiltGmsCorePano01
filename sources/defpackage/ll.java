package defpackage;

import android.graphics.Rect;

/* renamed from: ll  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ll {
    public static final ll a = new ll(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private ll(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static ll a(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? a : new ll(i, i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ll llVar = (ll) obj;
            return this.e == llVar.e && this.b == llVar.b && this.d == llVar.d && this.c == llVar.c;
        }
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "Insets{left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + '}';
    }
}
