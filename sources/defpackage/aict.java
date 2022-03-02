package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: aict  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aict {
    public int a = -1;
    public int b = -1;
    public final Map c = new nz();
    public final Map d = new nz();
    public final aucd e = anyy.h.o();
    private final hol f;
    private boolean g = false;
    private long h = Long.MIN_VALUE;
    private final Context i;

    public aict(Context context) {
        hol hol = new hol(context, "LE", (String) null);
        hol.a(avsd.UNMETERED_OR_DAILY);
        this.f = hol;
        this.i = context;
        c();
    }

    private final boolean b() {
        if (ayaz.k() && !rns.a(this.i) && this.g) {
            d();
        }
        return this.g;
    }

    private final void c() {
        if (b()) {
            aucd aucd = this.e;
            int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(ayaz.i());
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            anyy anyy = (anyy) aucd.b;
            anyy anyy2 = anyy.h;
            anyy.a |= 8;
            anyy.g = minutes;
            aucd o = anyz.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((anyz) o.b).c = aucj.s();
            for (aucd g2 : this.d.values()) {
                anyx anyx = (anyx) g2.i();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                anyz anyz = (anyz) o.b;
                anyx.getClass();
                if (!anyz.c.a()) {
                    anyz.c = aucj.a(anyz.c);
                }
                anyz.c.add(anyx);
            }
            anyy anyy3 = (anyy) this.e.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anyz anyz2 = (anyz) o.b;
            anyy3.getClass();
            anyz2.b = anyy3;
            anyz2.a |= 1;
            aucd o2 = anui.p.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anui anui = (anui) o2.b;
            anui.b = 9;
            anui.a |= 1;
            anyz anyz3 = (anyz) o.i();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anui anui2 = (anui) o2.b;
            anyz3.getClass();
            anui2.k = anyz3;
            anui2.a |= 512;
            this.f.a((audx) o2.i()).b();
        }
        d();
    }

    private final void d() {
        aucd aucd = this.e;
        boolean z = false;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anyy anyy = anyy.h;
        ((anyy) aucd.b).b = aucj.q();
        List b2 = aoog.b(new int[5]);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anyy anyy2 = (anyy) aucd.b;
        anyy2.a();
        auab.a((Iterable) b2, (List) anyy2.b);
        aucd aucd2 = this.e;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        ((anyy) aucd2.b).c = aucj.q();
        List b3 = aoog.b(new int[9]);
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        anyy anyy3 = (anyy) aucd2.b;
        anyy3.b();
        auab.a((Iterable) b3, (List) anyy3.c);
        aucd aucd3 = this.e;
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        anyy anyy4 = (anyy) aucd3.b;
        anyy4.a &= -9;
        anyy4.g = 0;
        aucd aucd4 = this.e;
        if (aucd4.c) {
            aucd4.c();
            aucd4.c = false;
        }
        anyy anyy5 = (anyy) aucd4.b;
        anyy5.a &= -3;
        anyy5.e = 0;
        aucd aucd5 = this.e;
        if (aucd5.c) {
            aucd5.c();
            aucd5.c = false;
        }
        anyy anyy6 = (anyy) aucd5.b;
        anyy6.a &= -2;
        anyy6.d = 0;
        aucd aucd6 = this.e;
        if (aucd6.c) {
            aucd6.c();
            aucd6.c = false;
        }
        anyy anyy7 = (anyy) aucd6.b;
        anyy7.a &= -5;
        anyy7.f = 0;
        this.a = -1;
        this.b = -1;
        this.c.clear();
        this.d.clear();
        this.h = SystemClock.elapsedRealtime();
        if (ayaz.k()) {
            if (rns.a(this.i) && Math.random() < ayaz.j()) {
                z = true;
            }
            this.g = z;
            return;
        }
        if (Math.random() < ayaz.j()) {
            z = true;
        }
        this.g = z;
    }

    public final boolean a() {
        if (this.h < 0 || SystemClock.elapsedRealtime() - this.h > ayaz.i()) {
            c();
        }
        return b();
    }
}
