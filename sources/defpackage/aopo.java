package defpackage;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* renamed from: aopo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aopo extends AbstractExecutorService implements aoru {
    /* renamed from: a */
    public final aorr submit(Runnable runnable) {
        return (aorr) super.submit(runnable);
    }

    /* renamed from: b */
    public final aorr submit(Callable callable) {
        return (aorr) super.submit(callable);
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return aosp.a(runnable, obj);
    }

    /* renamed from: a */
    public final aorr submit(Runnable runnable, Object obj) {
        return (aorr) super.submit(runnable, obj);
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Callable callable) {
        return aosp.a(callable);
    }
}
