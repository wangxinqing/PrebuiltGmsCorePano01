package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: awai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awai implements ThreadFactory {
    final /* synthetic */ String a;

    public awai(String str) {
        this.a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.a);
        thread.setDaemon(true);
        return thread;
    }
}
