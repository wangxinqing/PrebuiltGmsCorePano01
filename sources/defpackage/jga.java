package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: jga  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jga implements qvh {
    static int a(int i) {
        return i + -1 != 0 ? 9 : 10;
    }

    public final ExecutorService b(int i) {
        return jfm.b(a(i));
    }

    public final ScheduledExecutorService c(int i) {
        return jfm.a(1, a(i));
    }

    public final ExecutorService d(int i) {
        return jfb.a(i, a(2));
    }

    public final ExecutorService a() {
        return jfm.a(a(2));
    }

    public final ExecutorService a(int i, ThreadFactory threadFactory) {
        return d(2);
    }

    public final ExecutorService a(ThreadFactory threadFactory) {
        return b(2);
    }

    public final ScheduledExecutorService a(ThreadFactory threadFactory, int i) {
        return c(i);
    }
}
