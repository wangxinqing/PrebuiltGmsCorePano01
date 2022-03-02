package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: baic  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baic {
    public final ScheduledExecutorService a;
    public final amsn b;
    public ScheduledFuture c;
    public ScheduledFuture d;
    public final Runnable e = new baid(new bahy(this));
    public final Runnable f = new baid(new bahz(this));
    public final long g;
    public final long h;
    public int i = 1;
    public final baib j;

    static {
        TimeUnit.SECONDS.toNanos(10);
        TimeUnit.MILLISECONDS.toNanos(10);
    }

    public baic(baib baib, ScheduledExecutorService scheduledExecutorService, long j2, long j3) {
        amsn a2 = amsn.a();
        amrl.a((Object) baib, (Object) "keepAlivePinger");
        this.j = baib;
        amrl.a((Object) scheduledExecutorService, (Object) "scheduler");
        this.a = scheduledExecutorService;
        amrl.a((Object) a2, (Object) "stopwatch");
        this.b = a2;
        this.g = j2;
        this.h = j3;
        a2.c();
        a2.d();
    }

    public final synchronized void a() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b() {
        /*
            r5 = this;
            monitor-enter(r5)
            amsn r0 = r5.b     // Catch:{ all -> 0x004c }
            r0.c()     // Catch:{ all -> 0x004c }
            r0.d()     // Catch:{ all -> 0x004c }
            int r0 = r5.i     // Catch:{ all -> 0x004c }
            r1 = 2
            if (r0 == r1) goto L_0x0047
            r2 = 4
            r3 = 5
            if (r0 != r2) goto L_0x0013
            goto L_0x0017
        L_0x0013:
            if (r0 == r3) goto L_0x0017
            monitor-exit(r5)
            return
        L_0x0017:
            java.util.concurrent.ScheduledFuture r0 = r5.c     // Catch:{ all -> 0x004c }
            r2 = 0
            if (r0 != 0) goto L_0x001d
            goto L_0x0021
        L_0x001d:
            r0.cancel(r2)     // Catch:{ all -> 0x004c }
        L_0x0021:
            int r0 = r5.i     // Catch:{ all -> 0x004c }
            r4 = 1
            if (r0 == r3) goto L_0x0044
            r5.i = r1     // Catch:{ all -> 0x004c }
            java.util.concurrent.ScheduledFuture r0 = r5.d     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x002e
            r2 = 1
            goto L_0x002f
        L_0x002e:
        L_0x002f:
            java.lang.String r0 = "There should be no outstanding pingFuture"
            defpackage.amrl.b((boolean) r2, (java.lang.Object) r0)     // Catch:{ all -> 0x004c }
            java.util.concurrent.ScheduledExecutorService r0 = r5.a     // Catch:{ all -> 0x004c }
            java.lang.Runnable r1 = r5.f     // Catch:{ all -> 0x004c }
            long r2 = r5.g     // Catch:{ all -> 0x004c }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x004c }
            java.util.concurrent.ScheduledFuture r0 = r0.schedule(r1, r2, r4)     // Catch:{ all -> 0x004c }
            r5.d = r0     // Catch:{ all -> 0x004c }
        L_0x0042:
            monitor-exit(r5)
            return
        L_0x0044:
            r5.i = r4     // Catch:{ all -> 0x004c }
            goto L_0x0042
        L_0x0047:
            r0 = 3
            r5.i = r0     // Catch:{ all -> 0x004c }
            monitor-exit(r5)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r5)
            goto L_0x0050
        L_0x004f:
            throw r0
        L_0x0050:
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baic.b():void");
    }

    public final synchronized void c() {
        int i2 = this.i;
        if (i2 == 1) {
            this.i = 2;
            if (this.d == null) {
                this.d = this.a.schedule(this.f, this.g - this.b.a(TimeUnit.NANOSECONDS), TimeUnit.NANOSECONDS);
            }
        } else if (i2 == 5) {
            this.i = 4;
        }
    }

    public final synchronized void d() {
        int i2 = this.i;
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    this.i = 5;
                    return;
                }
                return;
            }
        }
        this.i = 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void e() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.i     // Catch:{ all -> 0x0020 }
            r1 = 6
            if (r0 == r1) goto L_0x001e
            r2.i = r1     // Catch:{ all -> 0x0020 }
            java.util.concurrent.ScheduledFuture r0 = r2.c     // Catch:{ all -> 0x0020 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            goto L_0x0012
        L_0x000e:
            r0.cancel(r1)     // Catch:{ all -> 0x0020 }
        L_0x0012:
            java.util.concurrent.ScheduledFuture r0 = r2.d     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x001e
            r0.cancel(r1)     // Catch:{ all -> 0x0020 }
            r0 = 0
            r2.d = r0     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)
            return
        L_0x001e:
            monitor-exit(r2)
            return
        L_0x0020:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baic.e():void");
    }
}
