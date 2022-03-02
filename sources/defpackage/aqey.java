package defpackage;

import java.util.Arrays;

/* renamed from: aqey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqey {
    private static final ThreadLocal o = new aqev();
    public final aqex a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final double g;
    public final double h;
    public final String i;
    public final int j;
    public final String k;
    public final float l;
    public final float m;
    public final int n;

    public aqey(aqew aqew) {
        this.n = aqew.n;
        this.b = aqew.b;
        this.c = aqew.c;
        this.d = aqew.d;
        this.e = aqew.e;
        this.f = aqew.f;
        this.g = aqew.i;
        this.h = aqew.j;
        this.l = aqew.g;
        this.m = aqew.h;
        this.a = aqew.a;
        this.i = aqew.k;
        this.j = aqew.l;
        this.k = aqew.m;
    }

    public static aqew k() {
        aqew l2 = l();
        l2.a = aqex.UNKNOWN;
        l2.b = 0;
        l2.c = 0;
        l2.d = -1;
        l2.j = 0.0d;
        l2.e = 0.0f;
        l2.f = -1.0f;
        l2.i = 0.0d;
        l2.g = -1.0f;
        l2.h = -1.0f;
        l2.k = null;
        l2.l = Integer.MIN_VALUE;
        l2.m = null;
        l2.n = 0;
        l2.o = true;
        return l2;
    }

    private static aqew l() {
        aqew aqew = (aqew) o.get();
        if (!aqew.o) {
            return aqew;
        }
        throw new IllegalStateException("There is already a Position builder in progress.");
    }

    public final double a(aqey aqey) {
        return aell.a(this.b, this.c, aqey.b, aqey.c);
    }

    public final boolean b() {
        return this.a == aqex.WIFI;
    }

    public final boolean c() {
        return this.a == aqex.CELL || this.a == aqex.CELL_WITH_NEIGHBORS;
    }

    public final boolean d() {
        return (this.n & 4) != 0;
    }

    public final boolean e() {
        return (this.n & 64) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aqey) {
            aqey aqey = (aqey) obj;
            if (this.b == aqey.b && this.c == aqey.c && this.d == aqey.d && amqx.a(this.i, aqey.i) && this.j == aqey.j && amqx.a(this.k, aqey.k) && this.l == aqey.l && this.m == aqey.m && this.e == aqey.e && this.f == aqey.f && this.g == aqey.g && this.h == aqey.h && this.a == aqey.a && this.n == aqey.n) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean f() {
        return (this.n & 2) != 0;
    }

    public final boolean g() {
        return (this.n & 16) != 0;
    }

    public final boolean h() {
        return (this.n & 8) != 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.i, Integer.valueOf(this.j), this.k, Float.valueOf(this.l), Float.valueOf(this.m), Float.valueOf(this.e), Float.valueOf(this.f), Double.valueOf(this.g), Double.valueOf(this.h), this.a, Integer.valueOf(this.n)});
    }

    public final boolean i() {
        return (this.n & 128) != 0;
    }

    public final aqew j() {
        aqew l2 = l();
        l2.o = true;
        l2.a = this.a;
        l2.b = this.b;
        l2.c = this.c;
        l2.d = this.d;
        l2.e = this.e;
        l2.g = this.l;
        l2.i = this.g;
        l2.j = this.h;
        l2.k = this.i;
        l2.l = this.j;
        l2.m = this.k;
        l2.n = this.n;
        return l2;
    }

    public final String toString() {
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        String str = this.i;
        int i5 = this.j;
        String str2 = this.k;
        float f2 = this.l;
        float f3 = this.m;
        float f4 = this.e;
        float f5 = this.f;
        double d2 = this.g;
        double d3 = this.h;
        String valueOf = String.valueOf(this.a);
        int length = String.valueOf(str).length();
        String str3 = valueOf;
        StringBuilder sb = new StringBuilder(length + 354 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Position [latE7=");
        sb.append(i2);
        sb.append(", lngE7=");
        sb.append(i3);
        sb.append(", accuracyMm=");
        sb.append(i4);
        sb.append(", levelId=");
        sb.append(str);
        sb.append(", levelNumberE3=");
        sb.append(i5);
        sb.append(", floorLabel=");
        sb.append(str2);
        sb.append(", bearingDegrees=");
        sb.append(f2);
        sb.append(", bearingAccuracyDegrees=");
        sb.append(f3);
        sb.append(", speedMps=");
        sb.append(f4);
        sb.append(", speedAccuracyMps=");
        sb.append(f5);
        sb.append(", altitudeMeters=");
        sb.append(d2);
        sb.append(", verticalAccuracyMeters=");
        sb.append(d3);
        sb.append(", provider=");
        sb.append(str3);
        sb.append("]");
        return sb.toString();
    }

    public final boolean a() {
        return this.a == aqex.GPS || this.a == aqex.GPS_INJECTED;
    }
}
