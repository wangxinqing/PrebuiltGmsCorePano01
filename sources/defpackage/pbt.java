package defpackage;

import java.util.concurrent.ExecutorService;

/* renamed from: pbt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pbt {
    public static void a() {
        phw.a.c("Scheduling periodic tasks", new Object[0]);
        if (!((Boolean) pba.ac.c()).booleanValue()) {
            pbx.a().A().a();
            return;
        }
        ExecutorService executorService = pbu.a;
        pkt A = pbx.a().A();
        A.getClass();
        executorService.execute(new pbr(A));
    }
}
