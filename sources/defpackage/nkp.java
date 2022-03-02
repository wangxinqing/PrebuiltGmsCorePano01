package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: nkp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class nkp implements ThreadFactory {
    static final ThreadFactory a = new nkp();

    private nkp() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(new nkr(runnable), "common_PhantomFutures");
    }
}
