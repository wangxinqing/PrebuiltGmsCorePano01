package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: aoru  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface aoru extends ExecutorService {
    aorr a(Runnable runnable);

    aorr a(Runnable runnable, Object obj);

    aorr b(Callable callable);

    List invokeAll(Collection collection);

    List invokeAll(Collection collection, long j, TimeUnit timeUnit);
}
