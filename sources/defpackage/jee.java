package defpackage;

import java.text.DecimalFormat;
import java.util.Objects;

/* renamed from: jee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class jee implements Comparable {
    private static final DecimalFormat a = new DecimalFormat("#.##");
    public static final String k = String.format("%25s\t%10s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\n", new Object[]{"Component", "Tag", "Type", "TTL B", "TTL BRx", "TTL BTx", "TTL PRx", "TTL PTx"});
    public int l;
    protected int m;
    protected int n;
    protected int o;
    public long p = 0;
    public long q = 0;
    public long r = 0;
    public long s = 0;
    public long t = 0;
    public long u = 0;

    public jee(int i, int i2, int i3, int i4) {
        this.l = i;
        this.m = i2;
        this.o = i4;
        this.n = i3;
    }

    public static String a(long j) {
        return a(j, false);
    }

    public static String b(long j) {
        return a(j, true);
    }

    public long c() {
        return this.r;
    }

    public long d() {
        return this.t;
    }

    public final long e() {
        return c() + d();
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            jee jee = (jee) obj;
            if (this.m == jee.m && this.l == jee.l && this.n == jee.n && this.o == jee.o && this.p == jee.p && this.q == jee.q && c() == jee.c() && d() == jee.d() && this.s == jee.s && this.u == jee.u && e() == jee.e()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String f() {
        String valueOf = String.valueOf(Integer.toHexString(this.l));
        return valueOf.length() == 0 ? new String("0x") : "0x".concat(valueOf);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.m), Integer.valueOf(this.l), Integer.valueOf(this.n), Integer.valueOf(this.o), Long.valueOf(this.p), Long.valueOf(this.q), Long.valueOf(c()), Long.valueOf(d()), Long.valueOf(this.s), Long.valueOf(this.u)});
    }

    public String toString() {
        return String.format("%25s\t%10s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\n", new Object[]{izi.a(this.l), f(), jcm.a(this.o), b(e()), b(c()), b(d()), Long.valueOf(this.s), Long.valueOf(this.u)});
    }

    private static String a(long j, boolean z) {
        String str;
        double d;
        int i;
        double abs = (double) Math.abs(j);
        if (abs > 1.048576E8d) {
            Double.isNaN(abs);
            d = abs / 1.073741824E9d;
            str = !z ? " GB" : "G";
        } else if (abs <= 102400.0d) {
            Double.isNaN(abs);
            d = abs / 1024.0d;
            str = !z ? " KB" : "K";
        } else {
            Double.isNaN(abs);
            d = abs / 1048576.0d;
            str = !z ? " MB" : "M";
        }
        if (j < 0) {
            i = -1;
        } else {
            i = 1;
        }
        DecimalFormat decimalFormat = a;
        double d2 = (double) i;
        Double.isNaN(d2);
        String valueOf = String.valueOf(decimalFormat.format(d * d2));
        return str.length() == 0 ? new String(valueOf) : valueOf.concat(str);
    }

    /* renamed from: b */
    public final int compareTo(jee jee) {
        long e = jee.e();
        long e2 = e();
        if (e2 >= e) {
            return e2 <= e ? 0 : 1;
        }
        return -1;
    }

    public void a(jee jee) {
        long j = this.p;
        if (j == 0 || jee.p < j) {
            this.p = jee.p;
        }
        long j2 = this.q;
        if (j2 == 0 || jee.q > j2) {
            this.q = jee.q;
        }
        this.r += jee.c();
        this.t += jee.d();
        this.s += jee.s;
        this.u += jee.u;
    }
}
