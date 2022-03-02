package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: aghf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aghf implements aorv {
    public final aggs a;
    private final aorv b;

    public aghf(aorv aorv, aggs aggs) {
        amrl.a((Object) aorv);
        this.b = aorv;
        amrl.a((Object) aggs);
        this.a = aggs;
    }

    private final List a(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(a((Callable) it.next()));
        }
        return arrayList;
    }

    private final Runnable b(Runnable runnable) {
        return new aghd(this, runnable);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.b.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.b.execute(b(runnable));
    }

    public final List invokeAll(Collection collection) {
        return this.b.invokeAll(a(collection));
    }

    public final Object invokeAny(Collection collection) {
        return this.b.invokeAny(a(collection));
    }

    public final boolean isShutdown() {
        return this.b.isShutdown();
    }

    public final boolean isTerminated() {
        return this.b.isTerminated();
    }

    public final void shutdown() {
        this.b.shutdown();
    }

    public final List shutdownNow() {
        return this.b.shutdownNow();
    }

    private final Callable a(Callable callable) {
        return new aghe(this, callable);
    }

    /* renamed from: b */
    public final aorr submit(Callable callable) {
        return this.b.b(a(callable));
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.b.invokeAll(a(collection), j, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.b.invokeAny(a(collection), j, timeUnit);
    }

    /* renamed from: a */
    public final aorr submit(Runnable runnable) {
        return this.b.a(b(runnable));
    }

    /* renamed from: b */
    public final aort scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.b.b(b(runnable), j, j2, timeUnit);
    }

    /* renamed from: a */
    public final aorr submit(Runnable runnable, Object obj) {
        return this.b.a(b(runnable), obj);
    }

    /* renamed from: a */
    public final aort scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.b.a(b(runnable), j, j2, timeUnit);
    }

    /* renamed from: a */
    public final aort schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.b.a(b(runnable), j, timeUnit);
    }

    /* renamed from: a */
    public final aort schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.b.a(a(callable), j, timeUnit);
    }
}
