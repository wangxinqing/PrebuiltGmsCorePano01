package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ascb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ascb implements asjb {
    public final CountDownLatch a;
    public final ascd b;
    public final ashu c;
    public final asda d;
    public final asfj e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public ascc g;
    public ashv h;
    public int i;

    public ascb(Context context, asfj asfj) {
        this.c = (ashu) thl.a(context, ashu.class);
        this.b = (ascd) thl.a(context, ascd.class);
        this.d = (asda) thl.a(context, asda.class);
        this.e = asfj;
        int a2 = asfr.a(asfj.d);
        this.i = a2 == 0 ? 1 : a2;
        this.a = new CountDownLatch(1);
    }

    public static void a(Context context, asfj asfj) {
        int i2 = Build.VERSION.SDK_INT;
        int a2 = asfr.a(asfj.d);
        if (a2 != 0 && a2 == 2 && ((asfj.a & 2) == 0 || asfj.c.a() == 0)) {
            throw new asji("Secret key not set for SPAKE connection");
        }
        asda asda = (asda) thl.b(context, asda.class);
        if (asda == null || !asda.a()) {
            throw new asjk(asda.class, ascb.class);
        }
    }

    /* renamed from: b */
    public final asfk c() {
        aucd o = asfk.g.o();
        ashv ashv = this.h;
        if (ashv == null || !ashv.d()) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            asfk asfk = (asfk) o.b;
            asfk.c = 1;
            asfk.a |= 2;
        } else {
            if (o.c) {
                o.c();
                o.c = false;
            }
            asfk asfk2 = (asfk) o.b;
            asfk2.c = 2;
            asfk2.a = 2 | asfk2.a;
            asfn e2 = this.h.e();
            if (o.c) {
                o.c();
                o.c = false;
            }
            asfk asfk3 = (asfk) o.b;
            e2.getClass();
            asfk3.d = e2;
            asfk3.a |= 4;
        }
        return (asfk) o.i();
    }

    public final void d() {
        this.c.b(this.h);
        if (this.f.compareAndSet(false, true)) {
            this.a.countDown();
            ascc ascc = this.g;
            if (ascc != null) {
                this.b.c(ascc);
            }
        }
    }

    public final ashq a(asgs asgs) {
        return new asca(this, asgs);
    }

    public final void a() {
        ashv ashv = this.h;
        if (ashv != null && (ashv instanceof asix)) {
            asix asix = (asix) ashv;
            if (asix.k()) {
                asix.j();
                try {
                    asix.h();
                } catch (IOException e2) {
                    anih anih = (anih) asil.a.c();
                    anih.a((Throwable) e2);
                    ((anih) anih.a("ascb", "a", 233, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Fail to send confirm message");
                }
                this.a.countDown();
                return;
            }
            return;
        }
        ((anih) ((anih) asil.a.c()).a("ascb", "a", 238, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No connection ready to confirm");
    }

    public final void a(asiz asiz) {
        d();
        this.d.b(asiz);
    }

    public final boolean a(asix asix, asgs asgs) {
        try {
            String i2 = asix.i();
            aucd o = asfk.g.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            asfk asfk = (asfk) o.b;
            asfk.c = 5;
            int i3 = asfk.a | 2;
            asfk.a = i3;
            i2.getClass();
            asfk.a = i3 | 16;
            asfk.f = i2;
            asgs.a((asfk) o.i());
            if (!asix.g()) {
                return false;
            }
            while (!asix.d() && asix.k()) {
                try {
                    this.a.await(500, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e2) {
                    anih anih = (anih) asil.a.c();
                    anih.a((Throwable) e2);
                    ((anih) anih.a("ascb", "a", 210, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ConnectionStatusCheck interrupted");
                }
                if (this.f.get()) {
                    return false;
                }
            }
            return asix.d();
        } catch (IOException e3) {
            jjg jjg = asil.a;
            return false;
        }
    }
}
