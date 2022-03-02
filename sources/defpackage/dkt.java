package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: dkt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dkt extends ThreadPoolExecutor {
    final /* synthetic */ dkw a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dkt(dkw dkw) {
        super(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.a = dkw;
        setThreadFactory(new dku());
        allowCoreThreadTimeOut(true);
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new dks(this, runnable, obj);
    }
}
