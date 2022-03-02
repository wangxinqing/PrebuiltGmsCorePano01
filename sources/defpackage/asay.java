package defpackage;

import android.content.Context;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: asay  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class asay implements asjb {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public final ashu c;
    public asfj d;
    public ashv e;
    public ashv f;

    public asay(Context context, asfj asfj) {
        this.c = (ashu) thl.a(context, ashu.class);
        this.d = asfj;
    }

    public final ashq a(asgs asgs) {
        return new asax(this, asgs);
    }

    /* access modifiers changed from: protected */
    public abstract ashv a(asfs asfs);

    /* access modifiers changed from: protected */
    public abstract void a(ashv ashv);

    public final asfk b() {
        aucd o = asfk.g.o();
        ashv ashv = this.f;
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
            asfn e2 = this.f.e();
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

    public final void a() {
        jjg jjg = asil.a;
        this.c.b(this.f);
        if (this.a.compareAndSet(false, true)) {
            a(this.e);
        }
        this.b.countDown();
    }

    public final /* bridge */ /* synthetic */ audx c() {
        return asfk.g;
    }

    public final void a(asiz asiz) {
        a();
        asiz.a();
    }

    public final boolean a(asix asix) {
        while (this.b.getCount() > 0 && asix.k()) {
            try {
                this.b.await(500, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                anih anih = (anih) asil.a.c();
                anih.a((Throwable) e2);
                ((anih) anih.a("asay", "a", 235, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ConnectionStatusCheck interrupted");
            }
            if (this.a.get()) {
                return false;
            }
        }
        asix.j();
        return true;
    }
}
