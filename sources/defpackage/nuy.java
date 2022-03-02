package defpackage;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: nuy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nuy {
    public static final long a = TimeUnit.SECONDS.toMillis(5);
    private static final long c = TimeUnit.SECONDS.toMillis(10);
    private static final int d = ((int) TimeUnit.SECONDS.toMillis(10));
    public final nui b;
    private final Context e;
    private final Random f;
    private final nuk g;
    private final double h;
    private final nuw i;
    private long j;

    public nuy(Context context, nuw nuw, nuk nuk, Random random) {
        this.e = context;
        this.i = nuw;
        this.g = nuk;
        this.f = random;
        this.b = new nui(context, "GCM_CONN_ALARM", "com.google.android.intent.action.GCM_RECONNECT");
        double d2 = 2.0d;
        if (!TextUtils.isEmpty(axlc.q())) {
            try {
                d2 = Double.parseDouble(axlc.q());
            } catch (NumberFormatException e2) {
            }
        }
        this.h = d2;
    }

    private final long b(boolean z) {
        if (z) {
            return c + ((long) this.f.nextInt(d * 3));
        }
        return (long) this.f.nextInt(d);
    }

    private static int c(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            return networkInfo.getType();
        }
        return -1;
    }

    private final synchronized void d(NetworkInfo networkInfo) {
        double d2 = (double) this.j;
        double d3 = this.h;
        Double.isNaN(d2);
        long max = Math.max((long) (d2 * d3), axlc.a.a().J());
        long U = axlc.a.a().U();
        if (networkInfo != null) {
            if (networkInfo.isConnected()) {
                this.j = Math.min(max, U);
            }
        }
        U = axlc.a.a().T();
        this.j = Math.min(max, U);
    }

    /* access modifiers changed from: package-private */
    public final synchronized long a() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(NetworkInfo networkInfo) {
        c();
        if (this.b.c()) {
            long a2 = this.b.a() - SystemClock.elapsedRealtime();
            if (a2 > 0) {
                if (a2 < this.j) {
                    return;
                }
            }
        }
        this.b.a(this.j);
        if (b()) {
            b(networkInfo);
        }
        d(networkInfo);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void c() {
        /*
            r6 = this;
            monitor-enter(r6)
            nrr r0 = defpackage.nrr.a()     // Catch:{ all -> 0x003a }
            nut r0 = r0.g()     // Catch:{ all -> 0x003a }
            boolean r1 = r0.d()     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0038
            boolean r1 = r6.b()     // Catch:{ all -> 0x003a }
            if (r1 != 0) goto L_0x0038
            long r1 = r0.e()     // Catch:{ all -> 0x003a }
            long r3 = defpackage.axlc.p()     // Catch:{ all -> 0x003a }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0027
            r0 = 0
            r6.a((boolean) r0)     // Catch:{ all -> 0x003a }
            monitor-exit(r6)
            return
        L_0x0027:
            long r1 = defpackage.axlc.p()     // Catch:{ all -> 0x003a }
            long r3 = r0.e()     // Catch:{ all -> 0x003a }
            long r1 = r1 - r3
            long r3 = r6.j     // Catch:{ all -> 0x003a }
            long r0 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x003a }
            r6.j = r0     // Catch:{ all -> 0x003a }
        L_0x0038:
            monitor-exit(r6)
            return
        L_0x003a:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuy.c():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(android.net.NetworkInfo r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            int r4 = c(r4)     // Catch:{ all -> 0x0037 }
            nuk r0 = r3.g     // Catch:{ all -> 0x0037 }
            nun r0 = r0.a(r4)     // Catch:{ all -> 0x0037 }
            android.content.Context r1 = r3.e     // Catch:{ all -> 0x0037 }
            nul r0 = r0.a((android.content.Context) r1)     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0035
            r1 = -1
            if (r4 == r1) goto L_0x0035
            long r1 = r3.j     // Catch:{ all -> 0x0037 }
            aucd r4 = r0.b     // Catch:{ all -> 0x0037 }
            boolean r0 = r4.c     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x001f
            goto L_0x0025
        L_0x001f:
            r4.c()     // Catch:{ all -> 0x0037 }
            r0 = 0
            r4.c = r0     // Catch:{ all -> 0x0037 }
        L_0x0025:
            aucj r4 = r4.b     // Catch:{ all -> 0x0037 }
            nqj r4 = (defpackage.nqj) r4     // Catch:{ all -> 0x0037 }
            nqj r0 = defpackage.nqj.k     // Catch:{ all -> 0x0037 }
            int r0 = r4.a     // Catch:{ all -> 0x0037 }
            r0 = r0 | 128(0x80, float:1.794E-43)
            r4.a = r0     // Catch:{ all -> 0x0037 }
            r4.i = r1     // Catch:{ all -> 0x0037 }
            monitor-exit(r3)
            return
        L_0x0035:
            monitor-exit(r3)
            return
        L_0x0037:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuy.b(android.net.NetworkInfo):void");
    }

    public final boolean b() {
        return axlc.m() && jkr.b() && this.i.b();
    }

    public final synchronized void a(NetworkInfo networkInfo, boolean z) {
        int c2 = c(networkInfo);
        nun a2 = this.g.a(c2);
        this.j = -1;
        nul a3 = a2.a(this.e);
        if (a3 != null) {
            if (c2 != -1) {
                this.j = ((nqj) a3.b.b).i;
            }
        }
        if (this.j < 0) {
            this.j = b(z);
        }
    }

    public final synchronized void a(boolean z) {
        this.j = b(z);
    }
}
