package defpackage;

import android.util.Pair;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: lei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lei extends Thread {
    public static final ith a = new ith("ResultsPageProducer", "");
    public final lnn b;
    public final BlockingQueue c;
    public final ClientContext d;
    public final Set e;
    public final Long f;
    public final int g;
    public final lnk h;
    public long i = 0;
    public int j = 0;
    private final lsg k;
    private final lcq l;
    private final int m;
    private final Executor n = jfb.a(2, 9);
    private volatile boolean o = false;
    private long p = 0;
    private long q = 0;

    public lei(ClientContext clientContext, lsm lsm, BlockingQueue blockingQueue, lcq lcq, Long l2, Set set, int i2, int i3, lnk lnk) {
        lsm lsm2 = lsm;
        lri lri = new lri(lsm2.F, jzq.X, jzq.Y, 0, System.currentTimeMillis());
        this.d = clientContext;
        iva.a((Object) lri);
        this.k = lri;
        this.b = lsm2.i;
        iva.a((Object) blockingQueue);
        this.c = blockingQueue;
        iva.a((Object) lcq);
        this.l = lcq;
        this.f = l2;
        this.e = set;
        this.m = i2;
        this.g = i3;
        this.h = lnk;
        setName(lei.class.getName());
    }

    private final Pair a(lcq lcq, aosh aosh, boolean z) {
        String str;
        String a2 = lcq.a();
        lcp lcp = lcq.a;
        aosh f2 = aosh.f();
        leg leg = new leg(f2);
        aosh f3 = aosh.f();
        this.n.execute(new leh(this, lcp, a2, z, leg, aosh, f3, f2));
        try {
            str = (String) f2.get();
        } catch (InterruptedException | ExecutionException e2) {
            a.c("Interrupted while getting next page token");
            Class<?> cls = e2.getClass();
            Exception exc = e2;
            if (cls != InterruptedException.class) {
                exc = e2.getCause();
            }
            f3.a(exc);
            str = null;
        }
        return Pair.create(str, f3);
    }

    public final void interrupt() {
        this.o = true;
        super.interrupt();
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x017e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            ith r0 = a
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            lcq r3 = r15.l
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "Running: initialFeedState: %s"
            r0.a((java.lang.String) r3, (java.lang.Object[]) r2)
            lcq r0 = r15.l
            android.os.SystemClock.elapsedRealtime()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = 0
            aosh r6 = defpackage.aosh.f()     // Catch:{ InterruptedException -> 0x0140, ExecutionException -> 0x013e }
            r6.b((java.lang.Object) r5)     // Catch:{ InterruptedException -> 0x0140, ExecutionException -> 0x013e }
            r7 = 0
        L_0x0022:
            boolean r8 = r0.c()     // Catch:{ InterruptedException -> 0x013c, ExecutionException -> 0x013a }
            if (r8 == 0) goto L_0x002a
        L_0x0028:
            goto L_0x00fb
        L_0x002a:
            boolean r8 = r15.isInterrupted()     // Catch:{ InterruptedException -> 0x013c, ExecutionException -> 0x013a }
            if (r8 != 0) goto L_0x0028
            int r8 = r15.m     // Catch:{ InterruptedException -> 0x013c, ExecutionException -> 0x013a }
            if (r7 >= r8) goto L_0x0028
            if (r7 != 0) goto L_0x0038
            r8 = 1
            goto L_0x0039
        L_0x0038:
            r8 = 0
        L_0x0039:
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ InterruptedException -> 0x013c, ExecutionException -> 0x013a }
            lsg r11 = r15.k     // Catch:{ all -> 0x00f5 }
            r11.f()     // Catch:{ all -> 0x00f5 }
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00f5 }
            long r13 = r15.p     // Catch:{ all -> 0x00f5 }
            long r9 = r11 - r9
            long r13 = r13 + r9
            r15.p = r13     // Catch:{ all -> 0x00f5 }
            lcp r9 = r0.a     // Catch:{ all -> 0x00f5 }
            lcr r9 = r9.c     // Catch:{ all -> 0x00f5 }
            lcr r10 = defpackage.lcr.CHANGELOG     // Catch:{ all -> 0x00f5 }
            int r10 = r9.ordinal()     // Catch:{ all -> 0x00f5 }
            r13 = 2
            if (r10 == 0) goto L_0x00b9
            if (r10 == r1) goto L_0x00ad
            if (r10 == r13) goto L_0x00a1
            r14 = 3
            if (r10 == r14) goto L_0x0095
            r14 = 4
            if (r10 != r14) goto L_0x0070
            lcp r9 = r0.a     // Catch:{ all -> 0x00f5 }
            boolean r9 = r9 instanceof defpackage.lcs     // Catch:{ all -> 0x00f5 }
            defpackage.iva.b((boolean) r9)     // Catch:{ all -> 0x00f5 }
            android.util.Pair r6 = r15.a(r0, r6, r8)     // Catch:{ all -> 0x00f5 }
            goto L_0x00c4
        L_0x0070:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00f5 }
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00f5 }
            int r4 = r4.length()     // Catch:{ all -> 0x00f5 }
            int r4 = r4 + 23
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r6.<init>(r4)     // Catch:{ all -> 0x00f5 }
            java.lang.String r4 = "Unsupported feed type: "
            r6.append(r4)     // Catch:{ all -> 0x00f5 }
            r6.append(r1)     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x00f5 }
            r0.<init>(r1)     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x0095:
            lcp r9 = r0.a     // Catch:{ all -> 0x00f5 }
            boolean r9 = r9 instanceof defpackage.lcm     // Catch:{ all -> 0x00f5 }
            defpackage.iva.b((boolean) r9)     // Catch:{ all -> 0x00f5 }
            android.util.Pair r6 = r15.a(r0, r6, r8)     // Catch:{ all -> 0x00f5 }
            goto L_0x00c4
        L_0x00a1:
            lcp r9 = r0.a     // Catch:{ all -> 0x00f5 }
            boolean r9 = r9 instanceof defpackage.lct     // Catch:{ all -> 0x00f5 }
            defpackage.iva.b((boolean) r9)     // Catch:{ all -> 0x00f5 }
            android.util.Pair r6 = r15.a(r0, r6, r8)     // Catch:{ all -> 0x00f5 }
            goto L_0x00c4
        L_0x00ad:
            lcp r9 = r0.a     // Catch:{ all -> 0x00f5 }
            boolean r9 = r9 instanceof defpackage.lco     // Catch:{ all -> 0x00f5 }
            defpackage.iva.b((boolean) r9)     // Catch:{ all -> 0x00f5 }
            android.util.Pair r6 = r15.a(r0, r6, r8)     // Catch:{ all -> 0x00f5 }
            goto L_0x00c4
        L_0x00b9:
            lcp r9 = r0.a     // Catch:{ all -> 0x00f5 }
            boolean r9 = r9 instanceof defpackage.lcn     // Catch:{ all -> 0x00f5 }
            defpackage.iva.b((boolean) r9)     // Catch:{ all -> 0x00f5 }
            android.util.Pair r6 = r15.a(r0, r6, r8)     // Catch:{ all -> 0x00f5 }
        L_0x00c4:
            java.lang.Object r8 = r6.first     // Catch:{ all -> 0x00f5 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x00f5 }
            java.lang.Object r6 = r6.second     // Catch:{ all -> 0x00f5 }
            aosh r6 = (defpackage.aosh) r6     // Catch:{ all -> 0x00f5 }
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00f5 }
            long r9 = r9 - r11
            long r11 = r15.q     // Catch:{ all -> 0x00f5 }
            long r11 = r11 + r9
            r15.q = r11     // Catch:{ all -> 0x00f5 }
            lcq r0 = defpackage.lcq.a(r0, r8)     // Catch:{ all -> 0x00f5 }
            int r7 = r7 + 1
            ith r8 = a     // Catch:{ all -> 0x00f3 }
            java.lang.Object[] r11 = new java.lang.Object[r13]     // Catch:{ all -> 0x00f3 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00f3 }
            r11[r4] = r12     // Catch:{ all -> 0x00f3 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x00f3 }
            r11[r1] = r9     // Catch:{ all -> 0x00f3 }
            java.lang.String r9 = "Done retrieving page %d [%d ms]."
            r8.a((java.lang.String) r9, (java.lang.Object[]) r11)     // Catch:{ all -> 0x00f3 }
            goto L_0x0022
        L_0x00f3:
            r0 = move-exception
            goto L_0x00f6
        L_0x00f5:
            r0 = move-exception
        L_0x00f6:
            throw r0     // Catch:{ InterruptedException -> 0x00f9, ExecutionException -> 0x00f7 }
        L_0x00f7:
            r0 = move-exception
            goto L_0x0141
        L_0x00f9:
            r0 = move-exception
            goto L_0x0141
        L_0x00fb:
            boolean r1 = r0.b()     // Catch:{ InterruptedException -> 0x013c, ExecutionException -> 0x013a }
            defpackage.iva.b((boolean) r1)     // Catch:{ InterruptedException -> 0x013c, ExecutionException -> 0x013a }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ InterruptedException -> 0x013c, ExecutionException -> 0x013a }
            ith r1 = a     // Catch:{ InterruptedException -> 0x013c, ExecutionException -> 0x013a }
            java.lang.String r4 = "Waiting for requests in flight"
            r1.b(r4)     // Catch:{ InterruptedException -> 0x013c, ExecutionException -> 0x013a }
            r6.get()     // Catch:{ InterruptedException -> 0x013c, ExecutionException -> 0x013a }
            ith r1 = a     // Catch:{ InterruptedException -> 0x013c, ExecutionException -> 0x013a }
            java.lang.String r4 = "All requests in flight completed"
            r1.b(r4)     // Catch:{ InterruptedException -> 0x013c, ExecutionException -> 0x013a }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ InterruptedException -> 0x013c, ExecutionException -> 0x013a }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ InterruptedException -> 0x013c, ExecutionException -> 0x013a }
            java.util.concurrent.BlockingQueue r1 = r15.c     // Catch:{ InterruptedException -> 0x013c, ExecutionException -> 0x013a }
            int r4 = r15.g     // Catch:{ InterruptedException -> 0x013c, ExecutionException -> 0x013a }
            java.lang.String r0 = r0.a()     // Catch:{ InterruptedException -> 0x013c, ExecutionException -> 0x013a }
            lej r8 = new lej     // Catch:{ InterruptedException -> 0x013c, ExecutionException -> 0x013a }
            r8.<init>(r4, r5, r5, r0)     // Catch:{ InterruptedException -> 0x013c, ExecutionException -> 0x013a }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x013c, ExecutionException -> 0x013a }
            r1.offer(r8, r2, r0)     // Catch:{ InterruptedException -> 0x013c, ExecutionException -> 0x013a }
            long r0 = r15.i     // Catch:{ InterruptedException -> 0x013c, ExecutionException -> 0x013a }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ InterruptedException -> 0x013c, ExecutionException -> 0x013a }
            long r8 = r8 - r6
            long r0 = r0 + r8
            r15.i = r0     // Catch:{ InterruptedException -> 0x013c, ExecutionException -> 0x013a }
            return
        L_0x013a:
            r0 = move-exception
            goto L_0x0141
        L_0x013c:
            r0 = move-exception
            goto L_0x0141
        L_0x013e:
            r0 = move-exception
            goto L_0x0141
        L_0x0140:
            r0 = move-exception
        L_0x0141:
            boolean r1 = r15.o
            if (r1 != 0) goto L_0x017e
            java.lang.Class r1 = r0.getClass()
            java.lang.Class<java.lang.InterruptedException> r4 = java.lang.InterruptedException.class
            if (r1 == r4) goto L_0x0153
            java.lang.Throwable r0 = r0.getCause()
            java.lang.Exception r0 = (java.lang.Exception) r0
        L_0x0153:
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ InterruptedException -> 0x0173 }
            java.util.concurrent.BlockingQueue r1 = r15.c     // Catch:{ InterruptedException -> 0x0173 }
            int r4 = r15.g     // Catch:{ InterruptedException -> 0x0173 }
            defpackage.iva.a((java.lang.Object) r0)     // Catch:{ InterruptedException -> 0x0173 }
            lej r8 = new lej     // Catch:{ InterruptedException -> 0x0173 }
            r8.<init>(r4, r5, r0, r5)     // Catch:{ InterruptedException -> 0x0173 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0173 }
            r1.offer(r8, r2, r0)     // Catch:{ InterruptedException -> 0x0173 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ InterruptedException -> 0x0173 }
            long r2 = r15.i     // Catch:{ InterruptedException -> 0x0173 }
            long r0 = r0 - r6
            long r2 = r2 + r0
            r15.i = r2     // Catch:{ InterruptedException -> 0x0173 }
            return
        L_0x0173:
            r0 = move-exception
            ith r0 = a
            java.lang.String r1 = "ResultsPageProducer"
            java.lang.String r2 = "Producer cannot be terminated gracefully"
            r0.c((java.lang.String) r1, (java.lang.String) r2)
            return
        L_0x017e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lei.run():void");
    }
}
