package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: jlu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jlu implements ThreadFactory {
    private final String a;
    private final int b;
    private final AtomicInteger c = new AtomicInteger();
    private final ThreadFactory d = Executors.defaultThreadFactory();

    public jlu(String str, int i) {
        iva.a((Object) str, (Object) "Name must not be null");
        this.a = str;
        this.b = i;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.d.newThread(new jlv(runnable, this.b));
        String str = this.a;
        int andIncrement = this.c.getAndIncrement();
        StringBuilder sb = new StringBuilder(str.length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
