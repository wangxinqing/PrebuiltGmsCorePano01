package defpackage;

import java.util.concurrent.Executor;

/* renamed from: badq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class badq extends bagj {
    public final baep a;
    public final String b;
    final /* synthetic */ badr c;

    public badq(badr badr, baep baep, String str) {
        this.c = badr;
        amrl.a((Object) baep, (Object) "delegate");
        this.a = baep;
        amrl.a((Object) str, (Object) "authority");
        this.b = str;
    }

    public final baef a(baaj baaj, baaf baaf, azxh azxh) {
        baef baef;
        azxf azxf = azxh.d;
        if (azxf == null) {
            return this.a.a(baaj, baaf, azxh);
        }
        bajx bajx = new bajx(this.a, baaj, baaf, azxh);
        try {
            azxf.a(new azxc(this, baaj), (Executor) amrh.a(azxh.c, this.c.a), bajx);
        } catch (Throwable th) {
            bajx.a(babj.j.a("Credentials should use fail() instead of throwing exceptions").b(th));
        }
        synchronized (bajx.f) {
            baef = bajx.g;
            if (baef == null) {
                bajx.i = new bafs();
                baef = bajx.i;
                bajx.g = baef;
            }
        }
        return baef;
    }

    /* access modifiers changed from: protected */
    public final baep c() {
        return this.a;
    }
}
