package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: elo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class elo implements eio {
    public static final elo a = new elo();

    private elo() {
    }

    public final void a(Context context) {
    }

    public final void b(Context context) {
    }

    public final void c(Context context) {
        long j;
        qwq a2 = qwq.a(context);
        if (ihs.b().getSharedPreferences("auth_cron_chimera_service_storage", 0).getLong("key_failed_attempts", 0) <= ent.q()) {
            j = ent.p();
        } else {
            j = ent.o();
        }
        long j2 = -1 + j;
        int i = !awja.a.a().c() ? 1 : 2;
        qxi qxi = new qxi();
        qxi.i = "com.google.android.gms.auth.account.be.legacy.AuthCronService";
        qxi.a = j;
        qxi.k = "auth_droidguard_recurring_run";
        qxi.b = j2;
        qxi.b(i);
        qxi.n = true;
        qxi.a(0, axcc.c() ? 1 : 0);
        qxi.a(0);
        a2.a((qxx) qxi.b());
        qwq a3 = qwq.a(context);
        qxi qxi2 = new qxi();
        qxi2.i = "com.google.android.gms.auth.account.be.legacy.AuthCronService";
        qxi2.k = "buffered_logs_update";
        qxi2.a(qxe.EVERY_7_DAYS);
        qxi2.b = TimeUnit.HOURS.toSeconds(1);
        qxi2.b(0);
        qxi2.n = true;
        qxi2.a(0, axcc.c() ? 1 : 0);
        qxi2.a(1);
        a3.a((qxx) qxi2.b());
    }
}
