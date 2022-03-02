package defpackage;

import java.util.Arrays;

/* renamed from: aklx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aklx {
    public final double a;
    public final double b;
    public final double c;

    public aklx(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public static aklx a(aklr aklr) {
        double d = (double) aklr.a;
        Double.isNaN(d);
        double d2 = d * 1.0E-7d * 0.017453292519943295d;
        double d3 = (double) aklr.b;
        Double.isNaN(d3);
        double d4 = d3 * 1.0E-7d * 0.017453292519943295d;
        double cos = Math.cos(d2);
        return new aklx(Math.cos(d4) * cos, Math.sin(d4) * cos, Math.sin(d2));
    }

    public static final aklx b(aklx aklx, double d) {
        return new aklx(aklx.a / d, aklx.b / d, aklx.c / d);
    }

    public static final aklx c(aklx aklx, aklx aklx2) {
        return new aklx(aklx.a * aklx2.a, aklx.b * aklx2.b, aklx.c * aklx2.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aklx) {
            aklx aklx = (aklx) obj;
            if (Double.compare(this.a, aklx.a) == 0 && Double.compare(this.b, aklx.b) == 0 && Double.compare(this.c, aklx.c) == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.a), Double.valueOf(this.b), Double.valueOf(this.c)});
    }

    public static final aklx a(aklx aklx, double d) {
        return new aklx(d * aklx.a, aklx.b * d, aklx.c * d);
    }

    public static final aklx b(aklx aklx, aklx aklx2) {
        return new aklx(aklx.a - aklx2.a, aklx.b - aklx2.b, aklx.c - aklx2.c);
    }

    public static final aklx a(aklx aklx, aklx aklx2) {
        return new aklx(aklx.a + aklx2.a, aklx.b + aklx2.b, aklx.c + aklx2.c);
    }

    public final aklr a() {
        if (Math.abs(this.a) > 1.0d || Math.abs(this.b) > 1.0d || Math.abs(this.c) > 1.0d) {
            return null;
        }
        double d = this.c;
        double d2 = this.a;
        double d3 = this.b;
        return new aklr((int) Math.round(Math.atan2(d, Math.sqrt((d2 * d2) + (d3 * d3))) * 57.29577951308232d * 1.0E7d), (int) Math.round(Math.atan2(this.b, this.a) * 57.29577951308232d * 1.0E7d), 0, Float.NaN, "unknown", 0, -1.0f);
    }
}
