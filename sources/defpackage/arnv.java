package defpackage;

import android.os.Handler;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: arnv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class arnv implements Runnable, arng {
    protected final arnz a;
    private final CountDownLatch b = new CountDownLatch(1);
    private volatile Handler c;
    private volatile Object d;
    private volatile Object e;

    protected arnv(arnz arnz, String str) {
        if (str != null) {
            this.a = arnz;
            return;
        }
        throw new IllegalArgumentException("'tag' cannot be null.");
    }

    static boolean a(int i) {
        return i < 0;
    }

    private final Object b() {
        Object obj;
        synchronized (this.b) {
            if (isCancelled()) {
                throw new CancellationException("Transfer was cancelled");
            } else if (isDone()) {
                obj = this.e;
            } else {
                throw new IllegalStateException("Unable to query result before operation is completed.");
            }
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        r4.a.d.execute(a(r1, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r1 == null) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c() {
        /*
            r4 = this;
            java.util.concurrent.CountDownLatch r0 = r4.b
            monitor-enter(r0)
            boolean r1 = r4.isCancelled()     // Catch:{ all -> 0x0033 }
            if (r1 != 0) goto L_0x0031
            boolean r1 = r4.isDone()     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0029
            java.lang.Object r1 = r4.d     // Catch:{ all -> 0x0033 }
            java.lang.Object r2 = r4.e     // Catch:{ all -> 0x0033 }
            r3 = 0
            r4.d = r3     // Catch:{ all -> 0x0033 }
            r4.c = r3     // Catch:{ all -> 0x0033 }
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            arnu r0 = r4.a(r1, r2)
            arnz r1 = r4.a
            java.util.concurrent.ThreadPoolExecutor r1 = r1.d
            r1.execute(r0)
        L_0x0028:
            return
        L_0x0029:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0033 }
            java.lang.String r2 = "Attempted to trigger operation before it was done."
            r1.<init>(r2)     // Catch:{ all -> 0x0033 }
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arnv.c():void");
    }

    /* access modifiers changed from: protected */
    public abstract arnu a(Object obj, Object obj2);

    /* access modifiers changed from: protected */
    public abstract Object a();

    /* access modifiers changed from: protected */
    public abstract boolean b(Object obj);

    public final boolean cancel(boolean z) {
        arnz arnz = this.a;
        if (!arnz.b.remove(this) && !arnz.c.remove(this)) {
            return false;
        }
        c(a());
        return isCancelled();
    }

    public final Object get() {
        this.b.await();
        return b();
    }

    public final boolean isCancelled() {
        boolean b2;
        synchronized (this.b) {
            b2 = b(this.e);
        }
        return b2;
    }

    public final boolean isDone() {
        boolean z;
        synchronized (this.b) {
            z = this.e != null;
        }
        return z;
    }

    public final void a(Object obj) {
        synchronized (this.b) {
            this.d = obj;
            this.c = null;
            if (isDone()) {
                c();
            }
        }
    }

    public final Object get(long j, TimeUnit timeUnit) {
        if (this.b.await(j, timeUnit)) {
            return b();
        }
        throw new TimeoutException("Timeout awaiting for transfer's result.");
    }

    /* access modifiers changed from: protected */
    public final void c(Object obj) {
        if (obj != null) {
            synchronized (this.b) {
                if (!isDone()) {
                    this.e = obj;
                    this.b.countDown();
                    c();
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Result cannot be set to null.");
    }
}
