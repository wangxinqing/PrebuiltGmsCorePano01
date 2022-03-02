package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: atgd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atgd implements ThreadFactory {
    private final String a;
    private final AtomicInteger b = new AtomicInteger(0);

    public atgd(String str) {
        this.a = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.a;
        int incrementAndGet = this.b.incrementAndGet();
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append(str);
        sb.append("-");
        sb.append(incrementAndGet);
        return new Thread(runnable, sb.toString());
    }
}
