package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: jlt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jlt implements ThreadFactory {
    private final String a;
    private final ThreadFactory b = Executors.defaultThreadFactory();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.b.newThread(new jlv(runnable, 0));
        newThread.setName(this.a);
        return newThread;
    }

    public jlt(String str) {
        iva.a((Object) str, (Object) "Name must not be null");
        this.a = str;
    }
}
