package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: ahd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahd implements aorr {
    final WeakReference a;
    public final agy b = new ahc(this);

    public ahd(agz agz) {
        this.a = new WeakReference(agz);
    }

    public final void a(Runnable runnable, Executor executor) {
        this.b.a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        agz agz = (agz) this.a.get();
        boolean cancel = this.b.cancel(z);
        if (!cancel || agz == null) {
            return cancel;
        }
        agz.a = null;
        agz.b = null;
        agz.c.a((Object) null);
        return true;
    }

    public final Object get() {
        return this.b.get();
    }

    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    /* access modifiers changed from: package-private */
    public final boolean a(Throwable th) {
        agy agy = this.b;
        agy.b(th);
        if (!agy.b.a(agy, (Object) null, (Object) new ags(th))) {
            return false;
        }
        agy.a(agy);
        return true;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
