package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: dku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dku implements ThreadFactory {
    private static final AtomicInteger a = new AtomicInteger();

    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = a.incrementAndGet();
        StringBuilder sb = new StringBuilder(23);
        sb.append("measurement-");
        sb.append(incrementAndGet);
        return new dkv(runnable, sb.toString());
    }
}
