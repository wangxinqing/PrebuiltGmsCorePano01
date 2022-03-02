package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: bata  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class bata extends bauc {
    public static final long b = TimeUnit.SECONDS.toMillis(60);
    public static final long c = TimeUnit.MILLISECONDS.toNanos(b);
    static bata d;
    private boolean a;
    public bata e;
    private long h;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052 A[LOOP:0: B:17:0x0046->B:21:0x0052, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055 A[EDGE_INSN: B:33:0x0055->B:22:0x0055 ?: BREAK  
    EDGE_INSN: B:34:0x0055->B:22:0x0055 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void a(defpackage.bata r6, long r7, boolean r9) {
        /*
            java.lang.Class<bata> r0 = defpackage.bata.class
            monitor-enter(r0)
            bata r1 = d     // Catch:{ all -> 0x006a }
            if (r1 != 0) goto L_0x0016
            bata r1 = new bata     // Catch:{ all -> 0x006a }
            r1.<init>()     // Catch:{ all -> 0x006a }
            d = r1     // Catch:{ all -> 0x006a }
            basz r1 = new basz     // Catch:{ all -> 0x006a }
            r1.<init>()     // Catch:{ all -> 0x006a }
            r1.start()     // Catch:{ all -> 0x006a }
        L_0x0016:
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x006a }
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0021
            goto L_0x0030
        L_0x0021:
            if (r9 == 0) goto L_0x0030
            long r3 = r6.g()     // Catch:{ all -> 0x006a }
            long r3 = r3 - r1
            long r7 = java.lang.Math.min(r7, r3)     // Catch:{ all -> 0x006a }
            long r7 = r7 + r1
            r6.h = r7     // Catch:{ all -> 0x006a }
            goto L_0x0040
        L_0x0030:
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0038
            long r7 = r7 + r1
            r6.h = r7     // Catch:{ all -> 0x006a }
            goto L_0x0040
        L_0x0038:
            if (r9 == 0) goto L_0x0064
            long r7 = r6.g()     // Catch:{ all -> 0x006a }
            r6.h = r7     // Catch:{ all -> 0x006a }
        L_0x0040:
            long r7 = r6.a((long) r1)     // Catch:{ all -> 0x006a }
            bata r9 = d     // Catch:{ all -> 0x006a }
        L_0x0046:
            bata r3 = r9.e     // Catch:{ all -> 0x006a }
            if (r3 == 0) goto L_0x0055
            long r3 = r3.a((long) r1)     // Catch:{ all -> 0x006a }
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0055
            bata r9 = r9.e     // Catch:{ all -> 0x006a }
            goto L_0x0046
        L_0x0055:
            bata r7 = r9.e     // Catch:{ all -> 0x006a }
            r6.e = r7     // Catch:{ all -> 0x006a }
            r9.e = r6     // Catch:{ all -> 0x006a }
            bata r6 = d     // Catch:{ all -> 0x006a }
            if (r9 != r6) goto L_0x0062
            r0.notify()     // Catch:{ all -> 0x006a }
        L_0x0062:
            monitor-exit(r0)
            return
        L_0x0064:
            java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch:{ all -> 0x006a }
            r6.<init>()     // Catch:{ all -> 0x006a }
            throw r6     // Catch:{ all -> 0x006a }
        L_0x006a:
            r6 = move-exception
            monitor-exit(r0)
            goto L_0x006e
        L_0x006d:
            throw r6
        L_0x006e:
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bata.a(bata, long, boolean):void");
    }

    public final long a(long j) {
        return this.h - j;
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    /* access modifiers changed from: package-private */
    public final IOException b(IOException iOException) {
        return d() ? a(iOException) : iOException;
    }

    public final void c() {
        if (!this.a) {
            long j = this.g;
            boolean f = f();
            if (j != 0 || f) {
                this.a = true;
                a(this, j, f);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final boolean d() {
        if (!this.a) {
            return false;
        }
        this.a = false;
        return a(this);
    }

    private static synchronized boolean a(bata bata) {
        boolean z;
        synchronized (bata.class) {
            bata bata2 = d;
            while (true) {
                if (bata2 != null) {
                    bata bata3 = bata2.e;
                    if (bata3 == bata) {
                        bata2.e = bata.e;
                        bata.e = null;
                        z = false;
                        break;
                    }
                    bata2 = bata3;
                } else {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public IOException a(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (d() && z) {
            throw a((IOException) null);
        }
    }
}
