package defpackage;

import android.content.Context;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: acan  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acan implements acam {
    public static final iwd a = acqa.a("D2D", "Metrics", "TargetApiLogManager");
    public final Context b;
    public final acag c;
    public final acao d;
    public final acas e;
    public final acaq f;
    public final acar g;
    public final aucd h;
    public final aucd i = anwh.j.o();
    public final aucd j;
    private final AtomicBoolean k = new AtomicBoolean(false);
    private final acap l;
    private final acat m;
    private final hol n;
    private final aucd o = anvu.e.o();

    public acan(Context context) {
        hol hol = new hol(context, "SMART_SETUP", (String) null);
        amrl.a((Object) context);
        this.b = context.getApplicationContext();
        this.n = hol;
        acag acag = new acag();
        this.c = acag;
        acaf b2 = acag.b();
        this.h = anvp.h.o();
        this.l = new acap(anvq.e.o());
        this.d = new acao();
        this.m = new acat(b2.a);
        this.e = new acas(this.b);
        this.j = anxj.g.o();
        this.f = new acaq(this.c);
        this.g = new acar();
    }

    public final void a() {
        if (this.k.compareAndSet(false, true)) {
            a.a("Sending Target API logs with Clearcut.", new Object[0]);
            this.l.a();
            acaf b2 = this.c.b();
            aucd o2 = anxk.j.o();
            aucd aucd = this.h;
            anvj a2 = this.d.a();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            anvp anvp = (anvp) aucd.b;
            anvp anvp2 = anvp.h;
            a2.getClass();
            anvp.c = a2;
            anvp.a |= 2;
            aucd aucd2 = this.j;
            aucd aucd3 = b2.b;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            anxj anxj = (anxj) aucd2.b;
            anxi anxi = (anxi) aucd3.i();
            anxj anxj2 = anxj.g;
            anxi.getClass();
            anxj.e = anxi;
            anxj.a |= 8;
            aucd aucd4 = this.j;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anxk anxk = (anxk) o2.b;
            anxj anxj3 = (anxj) aucd4.i();
            anxj3.getClass();
            anxk.g = anxj3;
            anxk.a |= 32;
            aucd aucd5 = this.h;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anxk anxk2 = (anxk) o2.b;
            anvp anvp3 = (anvp) aucd5.i();
            anvp3.getClass();
            anxk2.c = anvp3;
            anxk2.a |= 2;
            anvq a3 = this.l.a();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anxk anxk3 = (anxk) o2.b;
            a3.getClass();
            anxk3.b = a3;
            anxk3.a = 1 | anxk3.a;
            List asList = Arrays.asList(b2.a());
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anxk anxk4 = (anxk) o2.b;
            if (!anxk4.h.a()) {
                anxk4.h = aucj.a(anxk4.h);
            }
            auab.a((Iterable) asList, (List) anxk4.h);
            aucd aucd6 = b2.a;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anxk anxk5 = (anxk) o2.b;
            anwg anwg = (anwg) aucd6.i();
            anwg.getClass();
            anxk5.d = anwg;
            anxk5.a |= 4;
            aucd aucd7 = this.o;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anxk anxk6 = (anxk) o2.b;
            anvu anvu = (anvu) aucd7.i();
            anvu.getClass();
            anxk6.f = anvu;
            anxk6.a |= 16;
            anwb a4 = this.e.a();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anxk anxk7 = (anxk) o2.b;
            a4.getClass();
            anxk7.e = a4;
            anxk7.a |= 8;
            anxn anxn = (anxn) this.g.b.i();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anxk anxk8 = (anxk) o2.b;
            anxn.getClass();
            anxk8.i = anxn;
            anxk8.a |= 64;
            aucd aucd8 = this.i;
            if (aucd8.c) {
                aucd8.c();
                aucd8.c = false;
            }
            anwh anwh = (anwh) aucd8.b;
            anxk anxk9 = (anxk) o2.i();
            anwh anwh2 = anwh.j;
            anxk9.getClass();
            anwh.e = anxk9;
            anwh.a |= 8;
            anwh anwh3 = (anwh) this.i.i();
            a.a(anwh3.toString(), new Object[0]);
            this.n.a(anwh3.k()).b();
            return;
        }
        a.d("Logs already sent to Clearcut. Ignoring call to log().", new Object[0]);
    }

    public final void b(int i2) {
        aucd aucd = this.o;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anvu anvu = (anvu) aucd.b;
        anvu anvu2 = anvu.e;
        anvu.b = i2 - 1;
        anvu.a |= 1;
    }

    public final void c(int i2) {
        aucd aucd = this.h;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anvp anvp = (anvp) aucd.b;
        anvp anvp2 = anvp.h;
        anvp.b = i2 - 1;
        anvp.a |= 1;
    }

    public final void d(int i2) {
        aucd aucd = this.h;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anvp anvp = (anvp) aucd.b;
        anvp anvp2 = anvp.h;
        anvp.d = i2 - 1;
        anvp.a |= 4;
    }

    public final void e(int i2) {
        aucd aucd = this.o;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anvu anvu = (anvu) aucd.b;
        int i3 = i2 - 1;
        anvu anvu2 = anvu.e;
        if (i2 != 0) {
            anvu.d = i3;
            anvu.a |= 4;
            return;
        }
        throw null;
    }

    public final void f(int i2) {
        aucd aucd = this.h;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anvp anvp = (anvp) aucd.b;
        anvp anvp2 = anvp.h;
        anvp.f = i2 - 1;
        anvp.a |= 16;
    }

    public final void b(long j2) {
        this.m.a(j2);
    }

    public final void b(boolean z) {
        this.l.a(z);
    }

    public final void a(int i2) {
        this.l.a(i2);
    }

    public final void a(long j2) {
        aucd aucd = this.i;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anwh anwh = (anwh) aucd.b;
        anwh anwh2 = anwh.j;
        anwh.a |= 1;
        anwh.b = j2;
    }

    public final void a(anvn anvn) {
        aucd aucd = this.h;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anvp anvp = (anvp) aucd.b;
        anvp anvp2 = anvp.h;
        anvp.e = anvn.d;
        anvp.a |= 8;
    }

    public final void a(String str, boolean z, boolean z2) {
        this.d.a(str, z, z2);
    }

    public final void a(boolean z) {
        aucd aucd = this.o;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anvu anvu = (anvu) aucd.b;
        anvu anvu2 = anvu.e;
        anvu.a |= 2;
        anvu.c = z;
    }
}
