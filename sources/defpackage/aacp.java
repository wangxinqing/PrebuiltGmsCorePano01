package defpackage;

import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aacp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aacp {
    public final Object a = new Object();
    public final nz b = new nz();
    public final ntv c;
    public final Looper d;
    public final ScheduledExecutorService e = jfm.a(1, 10);
    public final jca f;

    public aacp(ntv ntv, Looper looper) {
        this.c = ntv;
        this.d = looper;
        this.f = jca.a();
    }

    static int a() {
        return (!jkr.h() || !axbn.a.a().S()) ? 5 : 261;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.aacm r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.a
            monitor-enter(r0)
            ntv r1 = r9.c     // Catch:{ all -> 0x0073 }
            r2 = 0
            android.content.Context r1 = r1.b(r2)     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0049
            nz r3 = r9.b     // Catch:{ all -> 0x0073 }
            aacn r4 = r10.b     // Catch:{ all -> 0x0073 }
            r3.remove(r4)     // Catch:{ all -> 0x0073 }
            boolean r3 = r10.f     // Catch:{ all -> 0x0073 }
            if (r3 != 0) goto L_0x0047
            r3 = 1
            r10.f = r3     // Catch:{ all -> 0x0073 }
            java.util.List r4 = r10.a     // Catch:{ all -> 0x0073 }
            int r5 = r4.size()     // Catch:{ all -> 0x0073 }
        L_0x0020:
            if (r2 >= r5) goto L_0x003f
            java.lang.Object r6 = r4.get(r2)     // Catch:{ all -> 0x0073 }
            aaco r6 = (defpackage.aaco) r6     // Catch:{ all -> 0x0073 }
            acwd r7 = r6.a     // Catch:{ all -> 0x0073 }
            r8 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0073 }
            boolean r7 = r7.b((java.lang.Object) r8)     // Catch:{ all -> 0x0073 }
            if (r7 == 0) goto L_0x0037
            goto L_0x003c
        L_0x0037:
            aabx r6 = r6.b     // Catch:{ all -> 0x0073 }
            r6.a((int) r3)     // Catch:{ all -> 0x0073 }
        L_0x003c:
            int r2 = r2 + 1
            goto L_0x0020
        L_0x003f:
            java.util.List r2 = r10.a     // Catch:{ all -> 0x0073 }
            r2.clear()     // Catch:{ all -> 0x0073 }
            r10.a((android.content.Context) r1)     // Catch:{ all -> 0x0073 }
        L_0x0047:
            monitor-exit(r0)     // Catch:{ all -> 0x0073 }
            return
        L_0x0049:
            java.lang.String r1 = "NetworkScheduler.TED"
            aacn r10 = r10.b     // Catch:{ all -> 0x0073 }
            android.content.ComponentName r10 = r10.c     // Catch:{ all -> 0x0073 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0073 }
            int r2 = r2.length()     // Catch:{ all -> 0x0073 }
            int r2 = r2 + 26
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
            r3.<init>(r2)     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = "Unable to get context for "
            r3.append(r2)     // Catch:{ all -> 0x0073 }
            r3.append(r10)     // Catch:{ all -> 0x0073 }
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x0073 }
            android.util.Log.e(r1, r10)     // Catch:{ all -> 0x0073 }
            monitor-exit(r0)     // Catch:{ all -> 0x0073 }
            return
        L_0x0073:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0073 }
            goto L_0x0077
        L_0x0076:
            throw r10
        L_0x0077:
            goto L_0x0076
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aacp.a(aacm):void");
    }
}
