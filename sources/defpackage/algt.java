package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: algt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class algt {
    static final Intent a = new Intent().setPackage("com.google.android.setupwizard").setAction("com.google.android.setupcompat.SetupCompatService.BIND");
    private static volatile algt f;
    final ServiceConnection b = new algq(this);
    private volatile algr c = new algr(1);
    private final Context d;
    private final AtomicReference e = new AtomicReference();

    public algt(Context context) {
        this.d = context.getApplicationContext();
    }

    private final algb a(long j, TimeUnit timeUnit) {
        CountDownLatch countDownLatch;
        algr b2 = b();
        if (b2.a == 4) {
            return b2.b;
        }
        do {
            countDownLatch = (CountDownLatch) this.e.get();
            if (countDownLatch != null) {
                break;
            }
            countDownLatch = new CountDownLatch(1);
        } while (!this.e.compareAndSet((Object) null, countDownLatch));
        Log.i("SucServiceProvider", "Waiting for service to get connected");
        if (countDownLatch.await(j, timeUnit)) {
            algr b3 = b();
            if (Log.isLoggable("SucServiceProvider", 4)) {
                Log.i("SucServiceProvider", String.format("Finished waiting for service to get connected. Current state = %s", new Object[]{algs.a(b3.a)}));
            }
            return b3.b;
        }
        a();
        throw new TimeoutException(String.format("Failed to acquire connection after [%s %s]", new Object[]{Long.valueOf(j), timeUnit}));
    }

    private final synchronized algr b() {
        return this.c;
    }

    public static algb a(Context context, long j, TimeUnit timeUnit) {
        algm.a((Object) context, "Context object cannot be null.");
        algt algt = f;
        if (algt == null) {
            synchronized (algt.class) {
                algt = f;
                if (algt == null) {
                    algt = new algt(context.getApplicationContext());
                    f = algt;
                    f.a();
                }
            }
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            algr b2 = algt.b();
            int i = b2.a;
            int i2 = i - 1;
            if (i != 0) {
                switch (i2) {
                    case 0:
                        throw new IllegalStateException("NOT_STARTED state only possible before instance is created.");
                    case 1:
                    case 5:
                        return null;
                    case 2:
                    case 4:
                        return algt.a(j, timeUnit);
                    case 3:
                        return b2.b;
                    case 6:
                        algt.a();
                        return algt.a(j, timeUnit);
                    default:
                        String a2 = algs.a(i);
                        StringBuilder sb = new StringBuilder(a2.length() + 16);
                        sb.append("Unknown state = ");
                        sb.append(a2);
                        throw new IllegalStateException(sb.toString());
                }
            } else {
                throw null;
            }
        } else {
            throw new IllegalStateException("getService blocks and should not be called from the main thread.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void a() {
        /*
            r5 = this;
            monitor-enter(r5)
            algr r0 = r5.b()     // Catch:{ all -> 0x0063 }
            int r0 = r0.a     // Catch:{ all -> 0x0063 }
            r1 = 4
            if (r0 != r1) goto L_0x0013
            java.lang.String r0 = "SucServiceProvider"
            java.lang.String r1 = "Refusing to rebind since current state is already connected"
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x0063 }
            monitor-exit(r5)
            return
        L_0x0013:
            r2 = 1
            if (r0 == r2) goto L_0x0024
            java.lang.String r0 = "SucServiceProvider"
            java.lang.String r3 = "Unbinding existing service connection."
            android.util.Log.i(r0, r3)     // Catch:{ all -> 0x0063 }
            android.content.Context r0 = r5.d     // Catch:{ all -> 0x0063 }
            android.content.ServiceConnection r3 = r5.b     // Catch:{ all -> 0x0063 }
            r0.unbindService(r3)     // Catch:{ all -> 0x0063 }
        L_0x0024:
            android.content.Context r0 = r5.d     // Catch:{ SecurityException -> 0x0049 }
            android.content.Intent r3 = a     // Catch:{ SecurityException -> 0x0049 }
            android.content.ServiceConnection r4 = r5.b     // Catch:{ SecurityException -> 0x0049 }
            boolean r0 = r0.bindService(r3, r4, r2)     // Catch:{ SecurityException -> 0x0049 }
            if (r0 != 0) goto L_0x0031
            goto L_0x0051
        L_0x0031:
            algr r0 = r5.c     // Catch:{ all -> 0x0063 }
            int r0 = r0.a     // Catch:{ all -> 0x0063 }
            if (r0 == r1) goto L_0x0047
            algr r0 = new algr     // Catch:{ all -> 0x0063 }
            r1 = 3
            r0.<init>(r1)     // Catch:{ all -> 0x0063 }
            r5.a(r0)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "SucServiceProvider"
            java.lang.String r1 = "Context#bindService went through, now waiting for service connection"
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x0063 }
        L_0x0047:
            monitor-exit(r5)
            return
        L_0x0049:
            r0 = move-exception
            java.lang.String r1 = "SucServiceProvider"
            java.lang.String r2 = "Unable to bind to compat service"
            android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x0063 }
        L_0x0051:
            algr r0 = new algr     // Catch:{ all -> 0x0063 }
            r1 = 2
            r0.<init>(r1)     // Catch:{ all -> 0x0063 }
            r5.a(r0)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "SucServiceProvider"
            java.lang.String r1 = "Context#bindService did not succeed."
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x0063 }
            monitor-exit(r5)
            return
        L_0x0063:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.algt.a():void");
    }

    public final void a(algr algr) {
        if (Log.isLoggable("SucServiceProvider", 4)) {
            Log.i("SucServiceProvider", String.format("State changed: %s -> %s", new Object[]{algs.a(this.c.a), algs.a(algr.a)}));
        }
        this.c = algr;
        CountDownLatch countDownLatch = (CountDownLatch) this.e.getAndSet((Object) null);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}
