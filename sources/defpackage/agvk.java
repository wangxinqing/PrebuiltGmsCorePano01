package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: agvk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agvk implements ThreadFactory {
    static final ThreadFactory a = new agvk();

    private agvk() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "ProcessStablePhenotypeFlag");
    }
}
