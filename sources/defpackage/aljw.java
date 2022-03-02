package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: aljw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aljw implements ThreadFactory {
    static final ThreadFactory a = new aljw();

    private aljw() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "LoggingStore");
    }
}
