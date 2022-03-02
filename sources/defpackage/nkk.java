package defpackage;

import android.os.SystemClock;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: nkk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nkk implements nkg {
    public final int a;
    public final int b;
    public final int c;
    public final AtomicInteger d = new AtomicInteger();
    private final Executor e;
    private final Random f;
    private final ixy g;
    private volatile long h;

    public nkk(Executor executor, Random random, int i, int i2, ixy ixy) {
        this.e = executor;
        this.f = random;
        this.a = i;
        this.b = i2;
        this.c = (i2 / i) + 1;
        this.g = ixy;
    }

    public final amky a(amkr amkr) {
        return new nkh(this, SystemClock.uptimeMillis(), amkr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        if (r0 <= ((r5 + r5) + 100)) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r5) {
        /*
            r4 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r5
            int r5 = r4.c
            long r5 = (long) r5
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x001a
            java.util.Random r5 = r4.f
            int r6 = r4.b
            int r5 = r5.nextInt(r6)
            long r5 = (long) r5
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0045
            goto L_0x0024
        L_0x001a:
            java.util.Random r5 = r4.f
            int r6 = r4.a
            int r5 = r5.nextInt(r6)
            if (r5 != 0) goto L_0x0045
        L_0x0024:
            ixy r5 = r4.g
            boolean r5 = r5.a()
            if (r5 == 0) goto L_0x002d
            goto L_0x0038
        L_0x002d:
            long r5 = r4.h
            long r5 = r5 + r5
            r2 = 100
            long r5 = r5 + r2
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0038
            goto L_0x0045
        L_0x0038:
            r4.h = r0
            java.util.concurrent.Executor r5 = r4.e
            nkj r6 = new nkj
            r6.<init>(r4, r0)
            r5.execute(r6)
            return
        L_0x0045:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.d
            r5.incrementAndGet()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nkk.a(long):void");
    }

    public final void a(amkr amkr, aorr aorr) {
        aorr.a(amll.a((Runnable) new nki(this, SystemClock.uptimeMillis())), aoqm.a);
        amkr.a(aorr);
    }
}
