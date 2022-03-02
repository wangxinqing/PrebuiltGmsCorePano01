package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;

/* renamed from: uoa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uoa extends urq {
    public final WifiManager a;
    public unu b;
    private final Context c;
    private final ConnectivityManager d;
    private WifiConfiguration e;
    private final tfw f;

    public uoa(Context context, WifiManager wifiManager, ConnectivityManager connectivityManager, tfw tfw) {
        super(63, tfw);
        this.c = context;
        this.a = wifiManager;
        this.d = connectivityManager;
        this.f = tfw;
    }

    private final boolean a(WifiConfiguration wifiConfiguration) {
        this.e = this.a.getWifiApConfiguration();
        if (!this.a.setWifiApConfiguration(wifiConfiguration)) {
            ((anih) ((anih) ulh.a.b()).a("uoa", "a", 1168, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to set Wifi AP configuration for SSID %s before starting tethering", (Object) wifiConfiguration.SSID);
            return false;
        }
        this.d.startTethering(0, false, new unz());
        return true;
    }

    private final void b(WifiConfiguration wifiConfiguration) {
        this.d.stopTethering(0);
        if (!this.a.setWifiApConfiguration(this.e)) {
            ((anih) ((anih) ulh.a.c()).a("uoa", "b", 1195, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to restore prior Wifi AP configuration for SSID %s after stopping tethering for SSID %s", (Object) this.e.SSID, (Object) wifiConfiguration.SSID);
        }
        this.e = null;
    }

    private final boolean d(int i) {
        return this.a.getWifiApState() == i;
    }

    private final boolean b(WifiConfiguration wifiConfiguration, int i) {
        try {
            tge a2 = tgf.a((Object) this.a).a("setWifiApEnabled", WifiConfiguration.class, Boolean.TYPE);
            Object[] objArr = new Object[2];
            objArr[0] = wifiConfiguration;
            objArr[1] = Boolean.valueOf(i == 13);
            if (((Boolean) a2.a(objArr)).booleanValue()) {
                return true;
            }
            ((anih) ((anih) ulh.a.b()).a("uoa", "b", 1214, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to set Wifi AP state to %d", i);
            return false;
        } catch (tgg e2) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("uoa", "b", 1218, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to use reflection to invoke setWifiApEnabled to %d", i);
            return false;
        }
    }

    public final void a() {
        unu unu = this.b;
        uny uny = new uny(this, uoh.a(unu.a, unu.b, false));
        arzi arzi = new arzi(aymi.af());
        arzi.a = this.f.c();
        arzk.a((Runnable) uny, "StopWifiAp", arzi.a());
    }

    public final int b() {
        unx unx = new unx(this, ulu.a(28), ulu.a(12));
        arzi arzi = new arzi(aymi.af());
        arzi.a = this.f.c();
        return !arzk.a((Runnable) unx, "StartWifiAp", arzi.a()) ? 3 : 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x012d A[Catch:{ InterruptedException -> 0x0168 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0167 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.net.wifi.WifiConfiguration r14, int r15) {
        /*
            r13 = this;
            boolean r0 = r13.d(r15)
            r1 = 1
            if (r0 != 0) goto L_0x0190
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r0.<init>(r1)
            com.google.android.gms.nearby.mediums.WifiHotspot$SoftApHotspotOperation$1 r2 = new com.google.android.gms.nearby.mediums.WifiHotspot$SoftApHotspotOperation$1
            java.lang.String r3 = "nearby"
            r2.<init>(r3, r15, r0)
            android.content.Context r3 = r13.c
            android.content.IntentFilter r4 = new android.content.IntentFilter
            java.lang.String r5 = "android.net.wifi.WIFI_AP_STATE_CHANGED"
            r4.<init>(r5)
            r3.registerReceiver(r2, r4)
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0189 }
            r4 = 24
            java.lang.String r5 = "b"
            r6 = 13
            java.lang.String r7 = "a"
            java.lang.String r8 = "uoa"
            java.lang.String r9 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            r10 = 0
            if (r3 >= r4) goto L_0x009a
            android.net.wifi.WifiManager r3 = r13.a     // Catch:{ tgg -> 0x007b }
            tgf r3 = defpackage.tgf.a((java.lang.Object) r3)     // Catch:{ tgg -> 0x007b }
            r4 = 2
            java.lang.Class[] r11 = new java.lang.Class[r4]     // Catch:{ tgg -> 0x007b }
            java.lang.Class<android.net.wifi.WifiConfiguration> r12 = android.net.wifi.WifiConfiguration.class
            r11[r10] = r12     // Catch:{ tgg -> 0x007b }
            java.lang.Class r12 = java.lang.Boolean.TYPE     // Catch:{ tgg -> 0x007b }
            r11[r1] = r12     // Catch:{ tgg -> 0x007b }
            java.lang.String r12 = "setWifiApEnabled"
            tge r3 = r3.a((java.lang.String) r12, (java.lang.Class[]) r11)     // Catch:{ tgg -> 0x007b }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ tgg -> 0x007b }
            r4[r10] = r14     // Catch:{ tgg -> 0x007b }
            if (r15 != r6) goto L_0x004f
            r14 = 1
            goto L_0x0050
        L_0x004f:
            r14 = 0
        L_0x0050:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)     // Catch:{ tgg -> 0x007b }
            r4[r1] = r14     // Catch:{ tgg -> 0x007b }
            java.lang.Object r14 = r3.a(r4)     // Catch:{ tgg -> 0x007b }
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ tgg -> 0x007b }
            boolean r14 = r14.booleanValue()     // Catch:{ tgg -> 0x007b }
            if (r14 == 0) goto L_0x0065
            goto L_0x0121
        L_0x0065:
            jjg r14 = defpackage.ulh.a     // Catch:{ tgg -> 0x007b }
            anie r14 = r14.b()     // Catch:{ tgg -> 0x007b }
            anih r14 = (defpackage.anih) r14     // Catch:{ tgg -> 0x007b }
            r0 = 1214(0x4be, float:1.701E-42)
            anie r14 = r14.a((java.lang.String) r8, (java.lang.String) r5, (int) r0, (java.lang.String) r9)     // Catch:{ tgg -> 0x007b }
            anih r14 = (defpackage.anih) r14     // Catch:{ tgg -> 0x007b }
            java.lang.String r0 = "Failed to set Wifi AP state to %d"
            r14.a((java.lang.String) r0, (int) r15)     // Catch:{ tgg -> 0x007b }
            goto L_0x0094
        L_0x007b:
            r14 = move-exception
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x0189 }
            anie r0 = r0.b()     // Catch:{ all -> 0x0189 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0189 }
            r0.a((java.lang.Throwable) r14)     // Catch:{ all -> 0x0189 }
            r14 = 1218(0x4c2, float:1.707E-42)
            anie r14 = r0.a((java.lang.String) r8, (java.lang.String) r5, (int) r14, (java.lang.String) r9)     // Catch:{ all -> 0x0189 }
            anih r14 = (defpackage.anih) r14     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = "Failed to use reflection to invoke setWifiApEnabled to %d"
            r14.a((java.lang.String) r0, (int) r15)     // Catch:{ all -> 0x0189 }
        L_0x0094:
            android.content.Context r14 = r13.c
        L_0x0096:
            defpackage.thp.a((android.content.Context) r14, (android.content.BroadcastReceiver) r2)
            return r10
        L_0x009a:
            if (r15 != r6) goto L_0x00d3
            android.net.wifi.WifiManager r3 = r13.a     // Catch:{ Exception -> 0x00d1 }
            android.net.wifi.WifiConfiguration r3 = r3.getWifiApConfiguration()     // Catch:{ Exception -> 0x00d1 }
            r13.e = r3     // Catch:{ Exception -> 0x00d1 }
            android.net.wifi.WifiManager r3 = r13.a     // Catch:{ Exception -> 0x00d1 }
            boolean r3 = r3.setWifiApConfiguration(r14)     // Catch:{ Exception -> 0x00d1 }
            if (r3 != 0) goto L_0x00c6
            jjg r15 = defpackage.ulh.a     // Catch:{ Exception -> 0x00d1 }
            anie r15 = r15.b()     // Catch:{ Exception -> 0x00d1 }
            anih r15 = (defpackage.anih) r15     // Catch:{ Exception -> 0x00d1 }
            r0 = 1168(0x490, float:1.637E-42)
            anie r15 = r15.a((java.lang.String) r8, (java.lang.String) r7, (int) r0, (java.lang.String) r9)     // Catch:{ Exception -> 0x00d1 }
            anih r15 = (defpackage.anih) r15     // Catch:{ Exception -> 0x00d1 }
            java.lang.String r0 = "Failed to set Wifi AP configuration for SSID %s before starting tethering"
            java.lang.String r14 = r14.SSID     // Catch:{ Exception -> 0x00d1 }
            r15.a((java.lang.String) r0, (java.lang.Object) r14)     // Catch:{ Exception -> 0x00d1 }
            android.content.Context r14 = r13.c
            goto L_0x0096
        L_0x00c6:
            android.net.ConnectivityManager r14 = r13.d     // Catch:{ Exception -> 0x00d1 }
            unz r3 = new unz     // Catch:{ Exception -> 0x00d1 }
            r3.<init>()     // Catch:{ Exception -> 0x00d1 }
            r14.startTethering(r10, r10, r3)     // Catch:{ Exception -> 0x00d1 }
            goto L_0x0121
        L_0x00d1:
            r14 = move-exception
            goto L_0x0105
        L_0x00d3:
            r3 = 11
            if (r15 != r3) goto L_0x0121
            android.net.ConnectivityManager r3 = r13.d     // Catch:{ Exception -> 0x00d1 }
            r3.stopTethering(r10)     // Catch:{ Exception -> 0x00d1 }
            android.net.wifi.WifiManager r3 = r13.a     // Catch:{ Exception -> 0x00d1 }
            android.net.wifi.WifiConfiguration r4 = r13.e     // Catch:{ Exception -> 0x00d1 }
            boolean r3 = r3.setWifiApConfiguration(r4)     // Catch:{ Exception -> 0x00d1 }
            if (r3 != 0) goto L_0x0101
            jjg r3 = defpackage.ulh.a     // Catch:{ Exception -> 0x00d1 }
            anie r3 = r3.c()     // Catch:{ Exception -> 0x00d1 }
            anih r3 = (defpackage.anih) r3     // Catch:{ Exception -> 0x00d1 }
            r4 = 1195(0x4ab, float:1.675E-42)
            anie r3 = r3.a((java.lang.String) r8, (java.lang.String) r5, (int) r4, (java.lang.String) r9)     // Catch:{ Exception -> 0x00d1 }
            anih r3 = (defpackage.anih) r3     // Catch:{ Exception -> 0x00d1 }
            java.lang.String r4 = "Failed to restore prior Wifi AP configuration for SSID %s after stopping tethering for SSID %s"
            android.net.wifi.WifiConfiguration r5 = r13.e     // Catch:{ Exception -> 0x00d1 }
            java.lang.String r5 = r5.SSID     // Catch:{ Exception -> 0x00d1 }
            java.lang.String r14 = r14.SSID     // Catch:{ Exception -> 0x00d1 }
            r3.a((java.lang.String) r4, (java.lang.Object) r5, (java.lang.Object) r14)     // Catch:{ Exception -> 0x00d1 }
        L_0x0101:
            r14 = 0
            r13.e = r14     // Catch:{ Exception -> 0x00d1 }
            goto L_0x0121
        L_0x0105:
            jjg r15 = defpackage.ulh.a     // Catch:{ all -> 0x0189 }
            anie r15 = r15.b()     // Catch:{ all -> 0x0189 }
            anih r15 = (defpackage.anih) r15     // Catch:{ all -> 0x0189 }
            r15.a((java.lang.Throwable) r14)     // Catch:{ all -> 0x0189 }
            r14 = 1110(0x456, float:1.555E-42)
            anie r14 = r15.a((java.lang.String) r8, (java.lang.String) r7, (int) r14, (java.lang.String) r9)     // Catch:{ all -> 0x0189 }
            anih r14 = (defpackage.anih) r14     // Catch:{ all -> 0x0189 }
            java.lang.String r15 = "Failed to invoke tethering-related @SystemApi method, have OEMs removed it?"
            r14.a((java.lang.String) r15)     // Catch:{ all -> 0x0189 }
            android.content.Context r14 = r13.c
            goto L_0x0096
        L_0x0121:
            long r3 = defpackage.aymi.ae()     // Catch:{ InterruptedException -> 0x0168 }
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0168 }
            boolean r14 = r0.await(r3, r14)     // Catch:{ InterruptedException -> 0x0168 }
            if (r14 != 0) goto L_0x0142
            jjg r14 = defpackage.ulh.a     // Catch:{ InterruptedException -> 0x0168 }
            anie r14 = r14.c()     // Catch:{ InterruptedException -> 0x0168 }
            anih r14 = (defpackage.anih) r14     // Catch:{ InterruptedException -> 0x0168 }
            r0 = 1129(0x469, float:1.582E-42)
            anie r14 = r14.a((java.lang.String) r8, (java.lang.String) r7, (int) r0, (java.lang.String) r9)     // Catch:{ InterruptedException -> 0x0168 }
            anih r14 = (defpackage.anih) r14     // Catch:{ InterruptedException -> 0x0168 }
            java.lang.String r0 = "Timed out while waiting on latch to signal successful Wifi AP state change."
            r14.a((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0168 }
        L_0x0142:
            android.content.Context r14 = r13.c
            defpackage.thp.a((android.content.Context) r14, (android.content.BroadcastReceiver) r2)
            boolean r14 = r13.d(r15)
            if (r14 != 0) goto L_0x0167
            jjg r14 = defpackage.ulh.a
            anie r14 = r14.b()
            anih r14 = (defpackage.anih) r14
            r0 = 1143(0x477, float:1.602E-42)
            anie r14 = r14.a((java.lang.String) r8, (java.lang.String) r7, (int) r0, (java.lang.String) r9)
            anih r14 = (defpackage.anih) r14
            long r0 = defpackage.aymi.ae()
            java.lang.String r2 = "Couldn't set Wifi AP state to %d in %d seconds"
            r14.a((java.lang.String) r2, (int) r15, (long) r0)
            return r10
        L_0x0167:
            return r1
        L_0x0168:
            r14 = move-exception
            java.lang.Thread r14 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0189 }
            r14.interrupt()     // Catch:{ all -> 0x0189 }
            jjg r14 = defpackage.ulh.a     // Catch:{ all -> 0x0189 }
            anie r14 = r14.b()     // Catch:{ all -> 0x0189 }
            anih r14 = (defpackage.anih) r14     // Catch:{ all -> 0x0189 }
            r0 = 1134(0x46e, float:1.589E-42)
            anie r14 = r14.a((java.lang.String) r8, (java.lang.String) r7, (int) r0, (java.lang.String) r9)     // Catch:{ all -> 0x0189 }
            anih r14 = (defpackage.anih) r14     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = "Interrupted while waiting to set Wifi AP state to %d"
            r14.a((java.lang.String) r0, (int) r15)     // Catch:{ all -> 0x0189 }
            android.content.Context r14 = r13.c
            goto L_0x0096
        L_0x0189:
            r14 = move-exception
            android.content.Context r15 = r13.c
            defpackage.thp.a((android.content.Context) r15, (android.content.BroadcastReceiver) r2)
            throw r14
        L_0x0190:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uoa.a(android.net.wifi.WifiConfiguration, int):boolean");
    }
}
