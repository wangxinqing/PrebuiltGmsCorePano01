package defpackage;

import java.io.PrintWriter;

/* renamed from: cas  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cas implements jio {
    public atke a;
    public final car b;
    public bvt c;
    public jwi d;
    public cai e;
    private cbb f;
    private cbc g;
    private cbd h;

    public cas(atke atke, car car) {
        iva.a((Object) car);
        this.b = car;
        iva.a((Object) atke);
        aucd aucd = (aucd) atke.c(5);
        aucd.a((aucj) atke);
        aucd o = atkd.e.o();
        String a2 = car.a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atkd atkd = (atkd) o.b;
        a2.getClass();
        atkd.a |= 1;
        atkd.b = a2;
        String b2 = car.b();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atkd atkd2 = (atkd) o.b;
        b2.getClass();
        atkd2.a |= 2;
        atkd2.c = b2;
        String c2 = car.c();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atkd atkd3 = (atkd) o.b;
        c2.getClass();
        atkd3.a |= 4;
        atkd3.d = c2;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        atke atke2 = (atke) aucd.b;
        atkd atkd4 = (atkd) o.i();
        atke atke3 = atke.i;
        atkd4.getClass();
        atke2.h = atkd4;
        atke2.a |= 64;
        this.a = (atke) aucd.i();
    }

    public static long a(cas cas) {
        if (!b(cas)) {
            return Long.MAX_VALUE;
        }
        if (cas.g() == null || cas.g().a() != 6) {
            return cas.a() + Math.min(cas.e().e(), awuz.a.a().ar());
        }
        return cas.a() + Math.min(cas.e().e(), awuz.w());
    }

    public static boolean b(cas cas) {
        return cas.d() && cas.e().d() == 1;
    }

    public final long a() {
        return this.a.b;
    }

    public final boolean c() {
        return this.c != null;
    }

    public final boolean d() {
        return (this.a.a & 4) != 0;
    }

    public final cbb e() {
        if (!d()) {
            return null;
        }
        if (this.f == null) {
            atkh atkh = this.a.d;
            if (atkh == null) {
                atkh = atkh.d;
            }
            this.f = new cbb(atkh);
        }
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cas) {
            return this.b.equals(((cas) obj).b);
        }
        return false;
    }

    public final boolean f() {
        return (this.a.a & 8) != 0;
    }

    public final cbc g() {
        if (!f()) {
            return null;
        }
        if (this.g == null) {
            atkm atkm = this.a.e;
            if (atkm == null) {
                atkm = atkm.j;
            }
            this.g = new cbc(atkm);
        }
        return this.g;
    }

    public final boolean h() {
        return (this.a.a & 32) != 0;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final cai i() {
        if (!h()) {
            return null;
        }
        if (this.e == null) {
            atkc atkc = this.a.g;
            if (atkc == null) {
                atkc = atkc.d;
            }
            this.e = new cai(atkc);
        }
        return this.e;
    }

    public final int j() {
        return this.b.b;
    }

    public final String k() {
        return this.b.a();
    }

    public final String l() {
        return null;
    }

    public final String[] m() {
        return bta.a(b().bA, false);
    }

    public final String toString() {
        cbd cbd;
        iur a2 = ius.a(this);
        a2.a("key", this.b);
        a2.a("t", Long.valueOf(a()));
        a2.a("name", Integer.toString(b().bA));
        a2.a("lifetime", e());
        a2.a("production", g());
        atke atke = this.a;
        if ((atke.a & 16) != 0) {
            if (this.h == null) {
                atkp atkp = atke.f;
                if (atkp == null) {
                    atkp = atkp.e;
                }
                this.h = new cbd(atkp);
            }
            cbd = this.h;
        } else {
            cbd = null;
        }
        a2.a("retention", cbd);
        a2.a("dispatch", i());
        a2.a("consumer", this.c);
        return a2.toString();
    }

    public final atjv b() {
        atjv a2 = atjv.a(this.a.c);
        return a2 == null ? atjv.UNKNOWN_CONTEXT_NAME : a2;
    }

    public static boolean a(cas cas, int i) {
        return cas.f() && cas.g().a() == i;
    }

    public static boolean a(cas cas, long j) {
        return a(cas) <= j;
    }

    public final void a(long j) {
        atke atke = this.a;
        aucd aucd = (aucd) atke.c(5);
        aucd.a((aucj) atke);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        atke atke2 = (atke) aucd.b;
        atke atke3 = atke.i;
        atke2.a |= 1;
        atke2.b = j;
        this.a = (atke) aucd.i();
    }

    public final void a(PrintWriter printWriter) {
        printWriter.println(toString());
    }
}
