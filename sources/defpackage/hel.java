package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: hel  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hel {
    private static final Bundle a(int i, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("reason", i - 1);
        bundle.putBoolean("allowRetry", z);
        return bundle;
    }

    public static final synchronized void b(Context context) {
        boolean z;
        synchronized (hel.class) {
            hef a = hef.a(context);
            int a2 = a.a();
            StringBuilder sb = new StringBuilder(46);
            sb.append("Checking retry on unmetered count: ");
            sb.append(a2);
            sb.toString();
            if (a2 == 0) {
                if (a.a() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                amtf.a(z);
                if (a.a((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES)) {
                    a(context, 0, (long) ((int) awxp.b()), false, 1);
                    return;
                }
                Log.w("ChimeraConfigService", "Could not write retry on unmetered network state. Canceling retry.");
                return;
            }
            Log.w("ChimeraConfigService", "Retry attempt on unmetered network was throttled.");
        }
    }

    public static final synchronized void c(Context context) {
        synchronized (hel.class) {
            int max = Math.max((int) awxp.a.a().d(), 60);
            a(context, hef.a(context), max, max - 60, 2);
        }
    }

    private static final void a(Context context, long j, long j2, boolean z, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(132);
        sb.append("Scheduling checkin for one-off execution between [");
        sb.append(j);
        sb.append(",");
        sb.append(j2);
        sb.append("] seconds from now (");
        sb.append(currentTimeMillis);
        sb.append(")");
        Log.i("ChimeraConfigService", sb.toString());
        qwq a = qwq.a(context);
        qxf qxf = new qxf();
        qxf.a(j, j2);
        qxf.i = "com.google.android.gms.chimera.container.ConfigService";
        qxf.n = true;
        qxf.b(z);
        qxf.k = "ChimeraConfigService_OneOffRetry";
        qxf.s = a(4, false);
        qxf.b(i, i);
        qxf.a(0, 0);
        qxf.a(awxo.c());
        a.a((qxx) qxf.b());
    }

    public static final synchronized void a(Context context, hef hef) {
        synchronized (hel.class) {
            int i = hef.a.getInt("ChimeraConfigService.scheduledPeriodSec", -1);
            int b = (int) awxp.b();
            if (i != b) {
                a(context, hef, b, (int) awxp.a.a().b(), 3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void b(android.content.Context r11, defpackage.hef r12) {
        /*
            java.lang.Class<hel> r0 = defpackage.hel.class
            monitor-enter(r0)
            awxp r1 = defpackage.awxp.a     // Catch:{ all -> 0x006c }
            awxq r1 = r1.a()     // Catch:{ all -> 0x006c }
            long r1 = r1.c()     // Catch:{ all -> 0x006c }
            int r2 = (int) r1     // Catch:{ all -> 0x006c }
            if (r2 <= 0) goto L_0x006a
            int r1 = r12.a()     // Catch:{ all -> 0x006c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x006c }
            r4 = 33
            r3.<init>(r4)     // Catch:{ all -> 0x006c }
            java.lang.String r4 = "Checking retry count: "
            r3.append(r4)     // Catch:{ all -> 0x006c }
            r3.append(r1)     // Catch:{ all -> 0x006c }
            r3.toString()     // Catch:{ all -> 0x006c }
            r1 = r1 & 255(0xff, float:3.57E-43)
            if (r1 != 0) goto L_0x0063
            int r1 = r12.a()     // Catch:{ all -> 0x006c }
            int r1 = r1 >> 8
            r3 = 1
            if (r1 == 0) goto L_0x0035
            r9 = 1
            goto L_0x0037
        L_0x0035:
            r1 = 0
            r9 = 0
        L_0x0037:
            boolean r12 = r12.a((int) r3)     // Catch:{ all -> 0x006c }
            if (r12 != 0) goto L_0x0047
            java.lang.String r11 = "ChimeraConfigService"
            java.lang.String r12 = "Could not write retry state. Canceling retry."
            android.util.Log.w(r11, r12)     // Catch:{ all -> 0x006c }
            monitor-exit(r0)
            return
        L_0x0047:
            awxp r12 = defpackage.awxp.a     // Catch:{ all -> 0x006c }
            awxq r12 = r12.a()     // Catch:{ all -> 0x006c }
            long r3 = r12.a()     // Catch:{ all -> 0x006c }
            int r12 = (int) r3     // Catch:{ all -> 0x006c }
            int r12 = r12 / 2
            int r2 = r2 - r12
            long r5 = (long) r2     // Catch:{ all -> 0x006c }
            long r1 = defpackage.awxp.b()     // Catch:{ all -> 0x006c }
            int r12 = (int) r1     // Catch:{ all -> 0x006c }
            long r7 = (long) r12     // Catch:{ all -> 0x006c }
            r10 = 0
            r4 = r11
            a((android.content.Context) r4, (long) r5, (long) r7, (boolean) r9, (int) r10)     // Catch:{ all -> 0x006c }
            monitor-exit(r0)
            return
        L_0x0063:
            java.lang.String r11 = "ChimeraConfigService"
            java.lang.String r12 = "Retry attempt was throttled."
            android.util.Log.w(r11, r12)     // Catch:{ all -> 0x006c }
        L_0x006a:
            monitor-exit(r0)
            return
        L_0x006c:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hel.b(android.content.Context, hef):void");
    }

    private static final void a(Context context, hef hef, int i, int i2, int i3) {
        hef.b(-1);
        StringBuilder sb = new StringBuilder(78);
        sb.append("Scheduling checkin every ");
        sb.append(i);
        sb.append(" seconds, with flex of ");
        sb.append(i2);
        sb.append(" seconds");
        Log.i("ChimeraConfigService", sb.toString());
        qwq a = qwq.a(context);
        qxi qxi = new qxi();
        qxi.a = (long) i;
        qxi.i = "com.google.android.gms.chimera.container.ConfigService";
        qxi.b(1);
        qxi.n = true;
        qxi.b = (long) i2;
        qxi.b(0, 0);
        qxi.a(0, 0);
        qxi.s = a(i3, true);
        qxi.k = "ChimeraConfigService";
        qxi.a(awxo.c());
        a.a((qxx) qxi.b());
        hef.b(i);
    }

    public final void a(Context context) {
        b(context, hef.a(context));
    }
}
