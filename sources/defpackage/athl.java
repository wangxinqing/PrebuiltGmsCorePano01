package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: athl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class athl implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "MSMux:AHRF");
        thread.setPriority(4);
        return thread;
    }
}
