package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: baja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baja extends azxi {
    final /* synthetic */ baji a;
    private final String b;

    public baja(baji baji, String str) {
        this.a = baji;
        amrl.a((Object) str, (Object) "authority");
        this.b = str;
    }

    public final azxl a(baaj baaj, azxh azxh) {
        Executor executor;
        ScheduledExecutorService scheduledExecutorService;
        baji baji = this.a;
        Executor executor2 = azxh.c;
        if (executor2 != null) {
            executor = executor2;
        } else {
            executor = baji.i;
        }
        baiq baiq = baji.O;
        if (!baji.B) {
            scheduledExecutorService = this.a.h.a();
        } else {
            scheduledExecutorService = null;
        }
        baee baee = new baee(baaj, executor, azxh, baiq, scheduledExecutorService, this.a.C);
        baji baji2 = this.a;
        baee.h = baji2.m;
        baee.i = baji2.n;
        return baee;
    }

    public final String a() {
        return this.b;
    }
}
