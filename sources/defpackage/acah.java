package defpackage;

import android.content.Context;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: acah  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acah implements acak {
    public static final iwd a = acqa.a("D2D", "Metrics", "SourceApiLogManager");
    public final Context b;
    public final acag c;
    public final acas d;
    public final aucd e;
    public final aucd f = anwj.g.o();
    public final aucd g;
    public final aucd h = anwh.j.o();
    private final hol i;
    private final AtomicBoolean j = new AtomicBoolean(false);
    private final acap k;
    private final acao l;
    private final acat m;
    private final aucd n = anvu.e.o();
    private final aucd o = anwk.i.o();

    public acah(Context context) {
        hol hol = new hol(context, "SMART_SETUP", (String) null);
        amrl.a((Object) context);
        this.b = context.getApplicationContext();
        this.i = hol;
        this.c = new acag();
        this.k = new acap(anvq.e.o());
        this.e = anvp.h.o();
        this.l = new acao();
        this.m = new acat(anwg.c.o());
        this.d = new acas(this.b);
        this.g = anwi.d.o();
    }

    public final void a() {
        if (this.j.compareAndSet(false, true)) {
            a.a("Sending Source API logs with Clearcut.", new Object[0]);
            aucd aucd = this.e;
            anvj a2 = this.l.a();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            anvp anvp = (anvp) aucd.b;
            anvp anvp2 = anvp.h;
            a2.getClass();
            anvp.c = a2;
            anvp.a |= 2;
            acae a3 = this.c.a();
            aucd aucd2 = this.o;
            aucd aucd3 = this.e;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            anwk anwk = (anwk) aucd2.b;
            anvp anvp3 = (anvp) aucd3.i();
            anwk anwk2 = anwk.i;
            anvp3.getClass();
            anwk.c = anvp3;
            anwk.a |= 2;
            aucd aucd4 = this.o;
            aucd aucd5 = this.n;
            if (aucd4.c) {
                aucd4.c();
                aucd4.c = false;
            }
            anwk anwk3 = (anwk) aucd4.b;
            anvu anvu = (anvu) aucd5.i();
            anvu.getClass();
            anwk3.f = anvu;
            anwk3.a |= 16;
            aucd aucd6 = this.o;
            anvq a4 = this.k.a();
            if (aucd6.c) {
                aucd6.c();
                aucd6.c = false;
            }
            anwk anwk4 = (anwk) aucd6.b;
            a4.getClass();
            anwk4.b = a4;
            anwk4.a = 1 | anwk4.a;
            aucd aucd7 = this.o;
            if (aucd7.c) {
                aucd7.c();
                aucd7.c = false;
            }
            ((anwk) aucd7.b).h = aucj.s();
            List asList = Arrays.asList(a3.a());
            if (aucd7.c) {
                aucd7.c();
                aucd7.c = false;
            }
            anwk anwk5 = (anwk) aucd7.b;
            if (!anwk5.h.a()) {
                anwk5.h = aucj.a(anwk5.h);
            }
            auab.a((Iterable) asList, (List) anwk5.h);
            aucd aucd8 = this.o;
            aucd aucd9 = a3.a;
            if (aucd8.c) {
                aucd8.c();
                aucd8.c = false;
            }
            anwk anwk6 = (anwk) aucd8.b;
            anwg anwg = (anwg) aucd9.i();
            anwg.getClass();
            anwk6.d = anwg;
            anwk6.a |= 4;
            aucd aucd10 = this.f;
            aucd aucd11 = this.g;
            if (aucd10.c) {
                aucd10.c();
                aucd10.c = false;
            }
            anwj anwj = (anwj) aucd10.b;
            anwi anwi = (anwi) aucd11.i();
            anwj anwj2 = anwj.g;
            anwi.getClass();
            anwj.e = anwi;
            anwj.a |= 8;
            aucd aucd12 = this.o;
            aucd aucd13 = this.f;
            if (aucd12.c) {
                aucd12.c();
                aucd12.c = false;
            }
            anwk anwk7 = (anwk) aucd12.b;
            anwj anwj3 = (anwj) aucd13.i();
            anwj3.getClass();
            anwk7.g = anwj3;
            anwk7.a |= 32;
            aucd aucd14 = this.o;
            anwb a5 = this.d.a();
            if (aucd14.c) {
                aucd14.c();
                aucd14.c = false;
            }
            anwk anwk8 = (anwk) aucd14.b;
            a5.getClass();
            anwk8.e = a5;
            anwk8.a |= 8;
            aucd aucd15 = this.h;
            aucd aucd16 = this.o;
            if (aucd15.c) {
                aucd15.c();
                aucd15.c = false;
            }
            anwh anwh = (anwh) aucd15.b;
            anwk anwk9 = (anwk) aucd16.i();
            anwh anwh2 = anwh.j;
            anwk9.getClass();
            anwh.d = anwk9;
            anwh.a |= 4;
            anwh anwh3 = (anwh) this.h.i();
            a.a(anwh3.toString(), new Object[0]);
            this.i.a(anwh3.k()).b();
            return;
        }
        a.d("Logs already sent to Clearcut. Ignoring call to log().", new Object[0]);
    }

    public final void b(int i2) {
        this.k.a(i2);
    }

    public final void c(int i2) {
        aucd aucd = this.f;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anwj anwj = (anwj) aucd.b;
        anwj anwj2 = anwj.g;
        anwj.a |= 1;
        anwj.b = i2;
    }

    public final void d(int i2) {
        aucd aucd = this.n;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anvu anvu = (anvu) aucd.b;
        anvu anvu2 = anvu.e;
        anvu.b = i2 - 1;
        anvu.a |= 1;
    }

    public final void e(int i2) {
        aucd aucd = this.e;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anvp anvp = (anvp) aucd.b;
        anvp anvp2 = anvp.h;
        anvp.b = i2 - 1;
        anvp.a |= 1;
    }

    public final void f(int i2) {
        aucd aucd = this.e;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anvp anvp = (anvp) aucd.b;
        anvp anvp2 = anvp.h;
        anvp.d = i2 - 1;
        anvp.a |= 4;
    }

    public final void g(int i2) {
        aucd aucd = this.n;
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

    public final void b(long j2) {
        this.m.a(j2);
    }

    public final void b(boolean z) {
        this.k.a(z);
    }

    public final void a(int i2) {
        aucd aucd = this.f;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anwj anwj = (anwj) aucd.b;
        anwj anwj2 = anwj.g;
        anwj.a |= 16;
        anwj.f = i2;
    }

    public final void a(long j2) {
        aucd aucd = this.h;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anwh anwh = (anwh) aucd.b;
        anwh anwh2 = anwh.j;
        anwh.a |= 1;
        anwh.b = j2;
    }

    public final void a(String str, boolean z, boolean z2) {
        this.l.a(str, z, z2);
    }

    public final void a(boolean z) {
        aucd aucd = this.n;
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
