package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: annz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class annz {
    public static final ScheduledExecutorService a;
    private static final ThreadFactory b;

    static {
        aosj aosj = new aosj();
        aosj.a("RetryingFuture-Timer-%d");
        aosj.a();
        ThreadFactory a2 = aosj.a(aosj);
        b = a2;
        a = Executors.newSingleThreadScheduledExecutor(a2);
    }
}
