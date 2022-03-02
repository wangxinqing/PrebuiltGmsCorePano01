package defpackage;

import java.util.Objects;

/* renamed from: jdy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jdy extends jee {
    public static final String a = String.format("%25.25s\t%10.10s\t%7.7s\t%6.6s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\n", new Object[]{"Component", "Tag", "Iface", "Type", "TTL B", "TTL BBg", "TTL BFg", "Bg BRx", "Fg BRx", "Bg BTx", "Fg BTx", "Bg PRx", "Fg PRx", "Bg PTx", "Fg PTx"});
    public String b;
    public long c = 0;
    public long d = 0;
    public long e = 0;
    public long f = 0;
    public long g = 0;
    public long h = 0;
    public long i = 0;
    public long j = 0;

    public jdy(String str, int i2, int i3, int i4, int i5) {
        super(i2, i3, i4, i5);
        this.b = str;
    }

    public final long a() {
        return this.c + this.e;
    }

    public final long b() {
        return this.g + this.i;
    }

    public final long c() {
        return this.c + this.g;
    }

    public final long d() {
        return this.e + this.i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jdy) {
            jdy jdy = (jdy) obj;
            if (this.m == jdy.m && this.l == jdy.l && this.n == jdy.n && this.o == jdy.o && this.p == jdy.p && this.q == jdy.q && this.c == jdy.c && this.d == jdy.d && this.e == jdy.e && this.f == jdy.f && this.g == jdy.g && this.h == jdy.h && this.i == jdy.i && this.j == jdy.j && Objects.equals(this.b, jdy.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.m), Integer.valueOf(this.l), Integer.valueOf(this.n), Integer.valueOf(this.o), Long.valueOf(this.p), Long.valueOf(this.q), Long.valueOf(this.c), Long.valueOf(this.e), Long.valueOf(this.d), Long.valueOf(this.f), Long.valueOf(this.g), Long.valueOf(this.i), Long.valueOf(this.h), Long.valueOf(this.j)});
    }

    public final String toString() {
        return String.format("%25.25s\t%10.10s\t%7.7s\t%6.6s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\n", new Object[]{izi.a(this.l), f(), this.b, jcm.a(this.o), jee.b(e()), jee.b(a()), jee.b(b()), jee.b(this.c), jee.b(this.g), jee.b(this.e), jee.b(this.i), Long.valueOf(this.d), Long.valueOf(this.h), Long.valueOf(this.f), Long.valueOf(this.j)});
    }

    public final void a(jee jee) {
        if (jee instanceof jdy) {
            super.a(jee);
            jdy jdy = (jdy) jee;
            this.c += jdy.c;
            this.d += jdy.d;
            this.e += jdy.e;
            this.f += jdy.f;
            this.g += jdy.g;
            this.h += jdy.h;
            this.i += jdy.i;
            this.j += jdy.j;
        }
    }
}
