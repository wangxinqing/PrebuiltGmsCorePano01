package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: qvh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface qvh {
    ExecutorService a();

    ExecutorService a(int i, ThreadFactory threadFactory);

    ExecutorService a(ThreadFactory threadFactory);

    ScheduledExecutorService a(ThreadFactory threadFactory, int i);

    ExecutorService b(int i);

    ScheduledExecutorService c(int i);

    ExecutorService d(int i);
}
