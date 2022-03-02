package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: aorv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface aorv extends ScheduledExecutorService, aoru {
    aort a(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    aort a(Runnable runnable, long j, TimeUnit timeUnit);

    aort a(Callable callable, long j, TimeUnit timeUnit);

    aort b(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
