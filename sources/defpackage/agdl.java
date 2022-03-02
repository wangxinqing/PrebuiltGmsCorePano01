package defpackage;

import android.app.Application;
import android.content.SharedPreferences;

/* renamed from: agdl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agdl implements agfv {
    private static final anhq g = anhq.a("agdl");
    public final aggp a;
    public final SharedPreferences b;
    public final bapu c;
    public final bapu d;
    public final bapu e;
    public final bapu f;
    private final agic h;
    private final bapu i;
    private final bapu j;
    private final bapu k;
    private final bapu l;
    private final bapu m;
    private final bapu n;
    private final bapu o;

    public agdl(Application application, aggp aggp, SharedPreferences sharedPreferences, agic agic, bapu bapu, bapu bapu2, bapu bapu3, bapu bapu4, bapu bapu5, bapu bapu6, bapu bapu7, bapu bapu8, bapu bapu9, bapu bapu10, bapu bapu11) {
        application.getPackageName();
        this.a = aggp;
        this.b = sharedPreferences;
        this.h = agic;
        this.i = bapu;
        this.j = bapu2;
        this.k = bapu3;
        this.c = bapu4;
        this.l = bapu5;
        this.m = bapu6;
        this.d = bapu7;
        this.e = bapu8;
        this.n = bapu9;
        this.o = bapu10;
        this.f = bapu11;
    }

    public final void a(agev agev) {
        if (this.a.f().a() && ((aghj) this.a.f().b()).a()) {
            agfc agfc = (agfc) this.m.a();
            if (agfc.i.b()) {
                return;
            }
            if (agev.c <= 0 && agev.d <= 0 && agev.e <= 0 && agev.q <= 0) {
                ((anhn) ((anhn) agfc.a.c()).a("agfc", "a", 67, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("skip logging NetworkEvent due to empty bandwidth/latency data");
                return;
            }
            agfc.j.incrementAndGet();
            ((aorv) agfc.d.a()).a(new agez(agfc, agev));
            anhq anhq = aggw.a;
        }
    }

    public final void b(agif agif, String str, boolean z) {
        if (!agif.a(agif) && b()) {
            agif.c();
            agif.d = 1;
            aggw.a(((agig) this.n.a()).a(agif, str, z));
        }
    }

    public final void c() {
        this.h.a();
    }

    public final void d() {
        amri amri = (amri) this.l.a();
        if (amri.a()) {
            ((agmb) amri.b()).b();
        }
    }

    public final agif e() {
        if (!b()) {
            return agif.b;
        }
        return ((agig) this.n.a()).b();
    }

    public final void f() {
        g();
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        if (a() && ((aghl) this.a.g().b()).b()) {
            ((aorv) this.i.a()).a(new agdk(this));
            anhq anhq = aggw.a;
        }
    }

    public final void b(String str) {
        amri amri = (amri) this.l.a();
        if (amri.a()) {
            aggw.a(((agmb) amri.b()).a(str));
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return ((Boolean) this.j.a()).booleanValue();
    }

    public final void a(agie agie, barw barw, barb barb) {
        amrl.a((Object) agie);
        if (barw == null || barw.d.size() == 0) {
            ((anhn) ((anhn) g.c()).a("agdl", "a", 552, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Invalid traces were logged.");
        } else if (((Boolean) this.k.a()).booleanValue()) {
            agio agio = (agio) this.o.a();
            if (!agio.b.b()) {
                aucd o2 = basu.s.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                basu basu = (basu) o2.b;
                barw.getClass();
                basu.m = barw;
                basu.a |= 32768;
                basu basu2 = (basu) o2.i();
                if (barw.d.size() > 0) {
                    String str = ((barz) barw.d.get(0)).b;
                }
                agio.a.a((String) null, true, basu2, barb, (String) null);
            }
        }
    }

    public final void a(agif agif, String str, boolean z) {
        b(agif, str, z);
    }

    public final void a(agir agir, String str, long j2, long j3, barb barb) {
        amrl.a((Object) agir);
        if (b()) {
            aggw.a(((agig) this.n.a()).a(str, true, j2, j3, barb));
        }
    }

    public final void a(String str) {
        b(str);
    }

    public final boolean a() {
        return this.a.g().a() && ((aghl) this.a.g().b()).a();
    }
}
