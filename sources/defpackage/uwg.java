package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;

/* renamed from: uwg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uwg {
    private final Context a;
    private final WifiManager b;

    public uwg(Context context, WifiManager wifiManager) {
        this.a = context;
        this.b = wifiManager;
    }

    private final SharedPreferences d() {
        return this.a.getSharedPreferences("nearbymediums:wifilan:blacklist", 0);
    }

    public final synchronized void a() {
        d().edit().putLong(this.b.getConnectionInfo().getBSSID(), System.currentTimeMillis()).apply();
    }

    public final synchronized void b() {
        d().edit().remove(this.b.getConnectionInfo().getBSSID()).apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean c() {
        /*
            r11 = this;
            monitor-enter(r11)
            aymi r0 = defpackage.aymi.a     // Catch:{ all -> 0x007f }
            aymj r0 = r0.a()     // Catch:{ all -> 0x007f }
            boolean r0 = r0.aD()     // Catch:{ all -> 0x007f }
            r1 = 0
            if (r0 == 0) goto L_0x007d
            android.net.wifi.WifiManager r0 = r11.b     // Catch:{ all -> 0x007f }
            android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()     // Catch:{ all -> 0x007f }
            java.lang.String r0 = r0.getBSSID()     // Catch:{ all -> 0x007f }
            android.content.SharedPreferences r2 = r11.d()     // Catch:{ all -> 0x007f }
            r3 = -1
            long r5 = r2.getLong(r0, r3)     // Catch:{ all -> 0x007f }
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x007d
            java.lang.String r3 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r4 = "c"
            java.lang.String r7 = "uwg"
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x007f }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x007f }
            long r9 = r9 - r5
            long r5 = r8.toHours(r9)     // Catch:{ all -> 0x007f }
            long r8 = defpackage.aymi.ah()     // Catch:{ all -> 0x007f }
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0065
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x007f }
            android.content.SharedPreferences$Editor r2 = r2.remove(r0)     // Catch:{ all -> 0x007f }
            r2.apply()     // Catch:{ all -> 0x007f }
            jjg r2 = defpackage.ulh.a     // Catch:{ all -> 0x007f }
            anie r2 = r2.d()     // Catch:{ all -> 0x007f }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x007f }
            r5 = 56
            anie r2 = r2.a((java.lang.String) r7, (java.lang.String) r4, (int) r5, (java.lang.String) r3)     // Catch:{ all -> 0x007f }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x007f }
            java.lang.String r3 = "BSSID %s failed more than %s hrs ago, try again this time."
            long r4 = defpackage.aymi.ah()     // Catch:{ all -> 0x007f }
            r2.a((java.lang.String) r3, (java.lang.Object) r0, (long) r4)     // Catch:{ all -> 0x007f }
            monitor-exit(r11)
            return r1
        L_0x0065:
            jjg r1 = defpackage.ulh.a     // Catch:{ all -> 0x007f }
            anie r1 = r1.d()     // Catch:{ all -> 0x007f }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x007f }
            r2 = 62
            anie r1 = r1.a((java.lang.String) r7, (java.lang.String) r4, (int) r2, (java.lang.String) r3)     // Catch:{ all -> 0x007f }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x007f }
            java.lang.String r2 = "BSSID %s has failed in the past, ignored this time."
            r1.a((java.lang.String) r2, (java.lang.Object) r0)     // Catch:{ all -> 0x007f }
            r0 = 1
            monitor-exit(r11)
            return r0
        L_0x007d:
            monitor-exit(r11)
            return r1
        L_0x007f:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwg.c():boolean");
    }
}
