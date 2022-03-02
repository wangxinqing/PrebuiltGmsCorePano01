package defpackage;

import android.text.TextUtils;
import java.util.List;

/* renamed from: sou  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sou {
    private boolean A;
    private boolean B;
    private String C;
    private long D;
    private long E;
    private long F;
    public final svv a;
    public Boolean b;
    public List c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public String j;
    public boolean k;
    private final String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private long q;
    private long r;
    private long s;
    private String t;
    private long u;
    private String v;
    private long w;
    private long x;
    private boolean y;
    private long z;

    public sou(svv svv, String str) {
        iva.a((Object) svv);
        iva.c(str);
        this.a = svv;
        this.l = str;
        svv.p();
    }

    public final String a() {
        this.a.p();
        return this.l;
    }

    public final String b() {
        this.a.p();
        return this.m;
    }

    public final String c() {
        this.a.p();
        return this.n;
    }

    public final String d() {
        this.a.p();
        return this.C;
    }

    public final String e() {
        this.a.p();
        return this.o;
    }

    public final String f() {
        this.a.p();
        return this.p;
    }

    public final long g() {
        this.a.p();
        return this.r;
    }

    public final long h() {
        this.a.p();
        return this.s;
    }

    public final String i() {
        this.a.p();
        return this.t;
    }

    public final long j() {
        this.a.p();
        return this.u;
    }

    public final String k() {
        this.a.p();
        return this.v;
    }

    public final long l() {
        this.a.p();
        return this.w;
    }

    public final long m() {
        this.a.p();
        return this.x;
    }

    public final long n() {
        this.a.p();
        return this.D;
    }

    public final boolean o() {
        this.a.p();
        return this.y;
    }

    public final long p() {
        this.a.p();
        return this.q;
    }

    public final long q() {
        this.a.p();
        return this.E;
    }

    public final long r() {
        this.a.p();
        return this.F;
    }

    public final void s() {
        this.a.p();
        long j2 = this.q + 1;
        if (j2 > 2147483647L) {
            this.a.E().f.a("Bundle index overflow. appId", sut.a(this.l));
            j2 = 0;
        }
        this.k = true;
        this.q = j2;
    }

    public final String t() {
        this.a.p();
        return this.j;
    }

    public final long u() {
        this.a.p();
        return this.z;
    }

    public final boolean v() {
        this.a.p();
        return this.A;
    }

    public final boolean w() {
        this.a.p();
        return this.B;
    }

    public final Boolean x() {
        this.a.p();
        return this.b;
    }

    public final List y() {
        this.a.p();
        return this.c;
    }

    public final void a(long j2) {
        this.a.p();
        this.k |= this.r != j2;
        this.r = j2;
    }

    public final void b(long j2) {
        this.a.p();
        this.k |= this.s != j2;
        this.s = j2;
    }

    public final void c(long j2) {
        this.a.p();
        this.k |= this.u != j2;
        this.u = j2;
    }

    public final void d(long j2) {
        this.a.p();
        this.k |= this.w != j2;
        this.w = j2;
    }

    public final void e(long j2) {
        this.a.p();
        this.k |= this.x != j2;
        this.x = j2;
    }

    public final void f(long j2) {
        this.a.p();
        this.k |= this.D != j2;
        this.D = j2;
    }

    public final void g(long j2) {
        boolean z2 = true;
        iva.b(j2 >= 0);
        this.a.p();
        boolean z3 = this.k;
        if (this.q == j2) {
            z2 = false;
        }
        this.k = z2 | z3;
        this.q = j2;
    }

    public final void h(long j2) {
        this.a.p();
        this.k |= this.E != j2;
        this.E = j2;
    }

    public final void i(long j2) {
        this.a.p();
        this.k |= this.F != j2;
        this.F = j2;
    }

    public final void j(long j2) {
        this.a.p();
        this.k |= this.z != j2;
        this.z = j2;
    }

    public final void a(String str) {
        this.a.p();
        this.k |= !szj.b(this.m, str);
        this.m = str;
    }

    public final void b(String str) {
        this.a.p();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.k |= !szj.b(this.n, str);
        this.n = str;
    }

    public final void c(String str) {
        this.a.p();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.k |= !szj.b(this.C, str);
        this.C = str;
    }

    public final void d(String str) {
        this.a.p();
        this.k |= !szj.b(this.o, str);
        this.o = str;
    }

    public final void e(String str) {
        this.a.p();
        this.k |= !szj.b(this.p, str);
        this.p = str;
    }

    public final void f(String str) {
        this.a.p();
        this.k |= !szj.b(this.t, str);
        this.t = str;
    }

    public final void g(String str) {
        this.a.p();
        this.k |= !szj.b(this.v, str);
        this.v = str;
    }

    public final void h(String str) {
        this.a.p();
        this.k |= !szj.b(this.j, str);
        this.j = str;
    }

    public final void a(boolean z2) {
        this.a.p();
        this.k |= this.y != z2;
        this.y = z2;
    }

    public final void b(boolean z2) {
        this.a.p();
        this.k |= this.A != z2;
        this.A = z2;
    }

    public final void c(boolean z2) {
        this.a.p();
        this.k |= this.B != z2;
        this.B = z2;
    }
}
