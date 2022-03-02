package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: apzf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class apzf implements Runnable {
    private final apzh a;

    public apzf(apzh apzh) {
        this.a = apzh;
    }

    public final void run() {
        apzh apzh = this.a;
        try {
            for (String str : apzh.f.b()) {
                if (!apzh.k.contains(str)) {
                    if (str.endsWith("-bin")) {
                        apzh.f.d(baab.a(str, baaf.e));
                    } else {
                        apzh.f.d(baab.a(str, baaf.a));
                    }
                }
            }
            apzj apzj = apzh.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            apzj.c();
        } catch (Throwable th) {
            anih anih = (anih) apzh.a.b();
            anih.a(th);
            ((anih) anih.a("apzh", "a", 334, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Could not write to cache");
        }
    }
}
