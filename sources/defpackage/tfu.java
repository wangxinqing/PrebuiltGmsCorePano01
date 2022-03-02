package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: tfu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tfu {
    private final Runnable a;
    private final long b;
    private final ScheduledExecutorService c;
    private final boolean d;
    private volatile ScheduledFuture e;
    private final tfw f = new tfw();

    private tfu(Runnable runnable, long j, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this.a = runnable;
        this.b = j;
        this.c = scheduledExecutorService;
        this.d = z;
        this.e = scheduledExecutorService.schedule(new tfr(this), j, TimeUnit.MILLISECONDS);
    }

    public static tfu a(Runnable runnable, long j, ScheduledExecutorService scheduledExecutorService) {
        return new tfu(runnable, j, scheduledExecutorService, true);
    }

    public static tfu b(Runnable runnable, long j, ScheduledExecutorService scheduledExecutorService) {
        return new tfu(runnable, j, scheduledExecutorService, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r5 = this;
            boolean r0 = defpackage.aynf.d()
            if (r0 == 0) goto L_0x0029
            tfw r0 = r5.f
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x0028
            java.lang.Runnable r0 = r5.a
            r0.run()
            boolean r0 = r5.d
            if (r0 == 0) goto L_0x0028
            java.util.concurrent.ScheduledExecutorService r0 = r5.c
            tfs r1 = new tfs
            r1.<init>(r5)
            long r2 = r5.b
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r0 = r0.schedule(r1, r2, r4)
            r5.e = r0
        L_0x0028:
            return
        L_0x0029:
            monitor-enter(r5)
            java.util.concurrent.ScheduledFuture r0 = r5.e     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x004a
            java.lang.Runnable r0 = r5.a     // Catch:{ all -> 0x004c }
            r0.run()     // Catch:{ all -> 0x004c }
            boolean r0 = r5.d     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0048
            java.util.concurrent.ScheduledExecutorService r0 = r5.c     // Catch:{ all -> 0x004c }
            tft r1 = new tft     // Catch:{ all -> 0x004c }
            r1.<init>(r5)     // Catch:{ all -> 0x004c }
            long r2 = r5.b     // Catch:{ all -> 0x004c }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x004c }
            java.util.concurrent.ScheduledFuture r0 = r0.schedule(r1, r2, r4)     // Catch:{ all -> 0x004c }
            r5.e = r0     // Catch:{ all -> 0x004c }
        L_0x0048:
            monitor-exit(r5)     // Catch:{ all -> 0x004c }
            return
        L_0x004a:
            monitor-exit(r5)     // Catch:{ all -> 0x004c }
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x004c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tfu.a():void");
    }

    public final void b() {
        if (aynf.d()) {
            this.f.a();
            this.e.cancel(true);
            return;
        }
        synchronized (this) {
            if (this.e != null) {
                try {
                    this.e.cancel(true);
                } finally {
                    this.e = null;
                }
            }
        }
    }
}
