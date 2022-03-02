package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: cuz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cuz extends ThreadPoolExecutor.DiscardPolicy {
    private static final iwd a = dit.a("ResourceExecutor");

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        a.b("Execution rejected - isShutdown:%b", Boolean.valueOf(threadPoolExecutor.isShutdown()));
    }
}
