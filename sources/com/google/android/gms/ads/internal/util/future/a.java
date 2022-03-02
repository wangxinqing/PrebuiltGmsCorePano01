package com.google.android.gms.ads.internal.util.future;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class a implements ThreadFactory {
    final /* synthetic */ String a;
    private final AtomicInteger b = new AtomicInteger(1);

    public a(String str) {
        this.a = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.a;
        int andIncrement = this.b.getAndIncrement();
        StringBuilder sb = new StringBuilder(str.length() + 23);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
