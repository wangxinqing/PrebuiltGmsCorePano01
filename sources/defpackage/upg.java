package defpackage;

import android.os.SystemClock;
import java.util.Map;
import java.util.Set;

/* renamed from: upg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class upg {
    private final Map a = new nz();
    private long b = aymi.b();
    private long c = (SystemClock.elapsedRealtime() - aymi.c());
    private int d = 1;

    public final synchronized Set a() {
        return new ob(this.a.values());
    }

    public final synchronized long b() {
        return SystemClock.elapsedRealtime() - this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int c() {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.d     // Catch:{ all -> 0x0017 }
            r1 = 2
            if (r0 == r1) goto L_0x0015
            long r2 = r6.b()     // Catch:{ all -> 0x0017 }
            long r4 = r6.b     // Catch:{ all -> 0x0017 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0013
            r0 = 4
        L_0x0011:
            monitor-exit(r6)
            return r0
        L_0x0013:
            monitor-exit(r6)
            return r1
        L_0x0015:
            r0 = 3
            goto L_0x0011
        L_0x0017:
            r0 = move-exception
            monitor-exit(r6)
            goto L_0x001b
        L_0x001a:
            throw r0
        L_0x001b:
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upg.c():int");
    }

    public final synchronized void a(int i, byte[] bArr) {
        this.a.put(Integer.valueOf(i), bArr);
    }

    public final synchronized void a(boolean z) {
        this.c = SystemClock.elapsedRealtime();
        int i = 3;
        if (z) {
            this.b = aymi.b();
            i = 2;
        } else if (this.d == 3) {
            double d2 = aymi.a.a().d();
            double d3 = (double) this.b;
            Double.isNaN(d3);
            this.b = Math.min((long) (d2 * d3), aymi.c());
        } else {
            this.b = aymi.b();
        }
        this.d = i;
    }

    public final synchronized boolean a(int i) {
        return this.a.containsKey(Integer.valueOf(i));
    }
}
