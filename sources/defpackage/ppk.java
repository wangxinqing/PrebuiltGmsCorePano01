package defpackage;

import android.content.Context;

/* renamed from: ppk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ppk {
    public static final ppk a = new ppk();
    public final oys b = new oys();
    int c = 0;
    int d = 0;
    long e = 0;

    public static int a(Context context, int i) {
        if (((Boolean) ozx.aX.c()).booleanValue()) {
            pnz.c("Clearing calendar data because emergency flag is set.");
            return 3;
        } else if (kr.a(context, "android.permission.READ_CALENDAR") == 0) {
            return i;
        } else {
            pnz.c("Clearing calendar data because permission was denied.");
            return 3;
        }
    }

    static String a(int i) {
        if (i == 0) {
            return "ACTION_NONE";
        }
        if (i == 1) {
            return "ACTION_INCREMENTAL_UPDATE";
        }
        if (i != 2) {
            return i != 3 ? Integer.toString(i) : "ACTION_CLEAR_DATA";
        }
        return "ACTION_FULL_UPDATE";
    }

    public static oyq a(Context context) {
        return new oyq(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void a(defpackage.ppj r9, int r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.c     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0046
            int r0 = r8.d     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0046
            r0 = 1
            r8.c = r0     // Catch:{ all -> 0x0048 }
            if (r10 == 0) goto L_0x0043
            agvx r10 = defpackage.ozx.aY     // Catch:{ all -> 0x0048 }
            java.lang.Object r10 = r10.c()     // Catch:{ all -> 0x0048 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x0048 }
            long r0 = r10.longValue()     // Catch:{ all -> 0x0048 }
            long r2 = r8.e     // Catch:{ all -> 0x0048 }
            agvx r10 = defpackage.ozx.aZ     // Catch:{ all -> 0x0048 }
            java.lang.Object r10 = r10.c()     // Catch:{ all -> 0x0048 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x0048 }
            long r4 = r10.longValue()     // Catch:{ all -> 0x0048 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0048 }
            long r2 = r2 + r4
            long r2 = r2 - r6
            long r0 = java.lang.Math.max(r0, r2)     // Catch:{ all -> 0x0048 }
            poi r10 = defpackage.poi.a()     // Catch:{ all -> 0x0048 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0048 }
            jfc r10 = r10.a     // Catch:{ all -> 0x0048 }
            aort r9 = r10.a((java.lang.Runnable) r9, (long) r0, (java.util.concurrent.TimeUnit) r2)     // Catch:{ all -> 0x0048 }
            defpackage.jfi.a(r9)     // Catch:{ all -> 0x0048 }
            monitor-exit(r8)
            return
        L_0x0043:
            r9.run()     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r8)
            return
        L_0x0048:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ppk.a(ppj, int):void");
    }

    public final synchronized int a() {
        boolean z;
        int i;
        boolean z2 = true;
        if (this.c == 1) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        if (this.d == 0) {
            z2 = false;
        }
        iva.a(z2);
        i = this.d;
        this.d = 0;
        this.c = 2;
        if (pnz.a()) {
            pnz.a("IndexingScheduler.onTaskStarted() -> %s", (Object) a(i));
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r3 > 1) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.content.Context r6, int r7, int r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = defpackage.pnz.a()     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = a((int) r7)     // Catch:{ all -> 0x0061 }
            if (r8 == 0) goto L_0x0010
            java.lang.String r1 = "RUN_DEFERRED"
            goto L_0x0012
        L_0x0010:
            java.lang.String r1 = "RUN_IMMEDIATELY"
        L_0x0012:
            java.lang.String r2 = "IndexingScheduler.schedule(%s, %s)"
            defpackage.pnz.a((java.lang.String) r2, (java.lang.Object) r0, (java.lang.Object) r1)     // Catch:{ all -> 0x0061 }
        L_0x0017:
            aplf r0 = defpackage.aplf.a((android.content.Context) r6)     // Catch:{ all -> 0x0061 }
            agvx r1 = defpackage.ozx.be     // Catch:{ all -> 0x0061 }
            java.lang.Object r1 = r1.c()     // Catch:{ all -> 0x0061 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0061 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0061 }
            r2 = 1
            int r1 = java.lang.Math.max(r2, r1)     // Catch:{ all -> 0x0061 }
            agvx r3 = defpackage.ozx.bf     // Catch:{ all -> 0x0061 }
            java.lang.Object r3 = r3.c()     // Catch:{ all -> 0x0061 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0061 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0061 }
            int r3 = java.lang.Math.max(r2, r3)     // Catch:{ all -> 0x0061 }
            if (r1 <= r2) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            if (r3 <= r2) goto L_0x0047
        L_0x0041:
            plz r4 = new plz     // Catch:{ all -> 0x0061 }
            r4.<init>(r0, r1, r3)     // Catch:{ all -> 0x0061 }
            r0 = r4
        L_0x0047:
            agvx r1 = defpackage.ozx.bd     // Catch:{ all -> 0x0061 }
            java.lang.Object r1 = r1.c()     // Catch:{ all -> 0x0061 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0061 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0061 }
            int r1 = java.lang.Math.max(r2, r1)     // Catch:{ all -> 0x0061 }
            pow r2 = new pow     // Catch:{ all -> 0x0061 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0061 }
            r5.a(r6, r2, r7, r8)     // Catch:{ all -> 0x0061 }
            monitor-exit(r5)
            return
        L_0x0061:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ppk.a(android.content.Context, int, int):void");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(Context context, aplf aplf, int i, int i2) {
        if (!axsd.c()) {
            pnz.c("Not scheduling calendar indexing task because the feature is disabled.");
            return;
        }
        this.d = Math.max(this.d, a(context, i));
        a(new ppj(this, context, aplf), i2);
    }

    public final synchronized void a(ppj ppj) {
        boolean z;
        pnz.a("IndexingScheduler.onTaskFinished()");
        if (this.c == 2) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        this.e = System.currentTimeMillis();
        this.c = 0;
        a(ppj, 1);
    }
}
