package defpackage;

import java.util.Arrays;

/* renamed from: aqff  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqff {
    public final int a;
    public final int b;

    public aqff(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final double a(double d, double d2) {
        return Math.abs(d - ((Math.cos(aell.a(a(d2))) / Math.cos(aell.a(this.a))) * d));
    }

    public final int a(double d) {
        return this.a + aell.a(aell.e(d));
    }

    public final double b(int i) {
        return aell.a(aell.a(i - this.b), aell.a(this.a));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aqff) {
            aqff aqff = (aqff) obj;
            return this.a == aqff.a && this.b == aqff.b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(66);
        sb.append("EquirectangularProjection latE7 = ");
        sb.append(i);
        sb.append(", lngE7 = ");
        sb.append(i2);
        return sb.toString();
    }

    public final double a(int i) {
        return aell.c(i - this.a);
    }

    public final int b(double d) {
        return this.b + aell.a(aell.b(d, aell.a(this.a)));
    }
}
