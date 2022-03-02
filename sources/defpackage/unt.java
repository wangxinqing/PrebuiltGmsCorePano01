package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import com.google.android.gms.nearby.mediums.WifiHotspot$ConnectOperation$1;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: unt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class unt extends urq {
    public final WifiManager a;
    public final ConnectivityManager b;
    public uwf c;
    private final Context d;
    private final AtomicBoolean e;
    private final String f;
    private final String i;
    private final int j;
    private final String k;

    public unt(Context context, WifiManager wifiManager, ConnectivityManager connectivityManager, AtomicBoolean atomicBoolean, String str, String str2, int i2, String str3) {
        super(64);
        this.d = context;
        this.a = wifiManager;
        this.b = connectivityManager;
        this.e = atomicBoolean;
        this.f = str;
        this.i = str2;
        this.j = i2;
        this.k = str3;
    }

    private final uns a(String str) {
        uns uns;
        Context context;
        if (Build.VERSION.SDK_INT >= 23) {
            Context context2 = this.d;
            if (Build.VERSION.SDK_INT < 28 ? Settings.Secure.getInt(context2.getContentResolver(), "location_mode", 0) == 0 : !((LocationManager) context2.getSystemService("location")).isLocationEnabled()) {
                ((anih) ((anih) ulh.a.d()).a("unt", "a", 1910, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to scan since location is disabled on version %d", Build.VERSION.SDK_INT);
                return uns.UNABLE_TO_SCAN;
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        WifiHotspot$ConnectOperation$1 wifiHotspot$ConnectOperation$1 = new WifiHotspot$ConnectOperation$1(this, "nearby", str, countDownLatch);
        this.d.registerReceiver(wifiHotspot$ConnectOperation$1, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
        try {
            this.a.startScan();
            if (!countDownLatch.await(aymi.ad(), TimeUnit.SECONDS)) {
                ((anih) ((anih) ulh.a.b()).a("unt", "a", 1944, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Couldn't find Wifi AP %s after scanning for %d seconds.", (Object) str, aymi.ad());
                uns = uns.AP_NOT_FOUND;
                context = this.d;
                thp.a(context, (BroadcastReceiver) wifiHotspot$ConnectOperation$1);
                return uns;
            }
            thp.a(this.d, (BroadcastReceiver) wifiHotspot$ConnectOperation$1);
            return uns.FOUND_AP;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            ((anih) ((anih) ulh.a.b()).a("unt", "a", 1951, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted while waiting to get the results of scanning for Wifi AP %s.", (Object) str);
            uns = uns.AP_NOT_FOUND;
            context = this.d;
        } catch (Throwable th) {
            thp.a(this.d, (BroadcastReceiver) wifiHotspot$ConnectOperation$1);
            throw th;
        }
    }

    private final boolean b(WifiConfiguration wifiConfiguration) {
        int addNetwork = this.a.addNetwork(wifiConfiguration);
        if (addNetwork == -1) {
            ((anih) ((anih) ulh.a.b()).a("unt", "b", 2076, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to add network %s.", (Object) wifiConfiguration.SSID);
            return false;
        } else if (!this.a.enableNetwork(addNetwork, true)) {
            ((anih) ((anih) ulh.a.b()).a("unt", "b", 2081, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to enable network %s.", (Object) wifiConfiguration.SSID);
            return false;
        } else if (this.a.reconnect()) {
            return true;
        } else {
            ((anih) ((anih) ulh.a.b()).a("unt", "b", 2086, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to reconnect to network %s.", (Object) wifiConfiguration.SSID);
            return false;
        }
    }

    public final Network[] c() {
        return this.b.getAllNetworks();
    }

    private final boolean b(String str) {
        boolean disconnect = this.a.disconnect();
        WifiManager wifiManager = this.a;
        List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
        if (configuredNetworks != null) {
            Iterator<WifiConfiguration> it = configuredNetworks.iterator();
            while (true) {
                if (!it.hasNext()) {
                    ((anih) ((anih) ulh.a.d()).a("uoh", "a", 905, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to forget SSID %s. Unable to find it in the list of configured Wifi networks.", (Object) str);
                    break;
                }
                WifiConfiguration next = it.next();
                if (uoh.a(next.SSID, str)) {
                    wifiManager.removeNetwork(next.networkId);
                    wifiManager.saveConfiguration();
                    jjg jjg = ulh.a;
                    break;
                }
            }
        } else {
            ((anih) ((anih) ulh.a.d()).a("uoh", "a", 910, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to forget SSID %s because wifiManager.getConfiguredNetworks() returned null.", (Object) str);
        }
        return disconnect;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b() {
        /*
            r15 = this;
            java.lang.String r0 = r15.f
            java.lang.String r1 = r15.i
            java.lang.String r2 = defpackage.uoh.a((java.lang.String) r0)
            java.lang.String r3 = defpackage.uoh.a((java.lang.String) r1)
            r4 = 1
            android.net.wifi.WifiConfiguration r2 = defpackage.uoh.a(r2, r3, r4)
            java.lang.String r3 = r15.k
            boolean r3 = defpackage.uwe.a(r2, r3)
            if (r3 != 0) goto L_0x0026
            java.lang.String r2 = defpackage.uoh.a((java.lang.String) r0)
            java.lang.String r1 = defpackage.uoh.a((java.lang.String) r1)
            android.net.wifi.WifiConfiguration r2 = defpackage.uoh.a(r2, r1, r4)
            goto L_0x0027
        L_0x0026:
        L_0x0027:
            java.lang.String r1 = "b"
            boolean r3 = defpackage.jkr.e()
            r5 = 2
            r6 = 3
            r7 = 0
            java.lang.String r8 = "unt"
            java.lang.String r9 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            if (r3 == 0) goto L_0x003c
            boolean r0 = r15.a((android.net.wifi.WifiConfiguration) r2)
            goto L_0x011c
        L_0x003c:
            int r3 = android.os.Build.VERSION.SDK_INT
            r10 = 23
            java.lang.String r11 = "a"
            if (r3 < r10) goto L_0x0083
            android.content.Context r3 = r15.d
            int r10 = android.os.Build.VERSION.SDK_INT
            r12 = 28
            if (r10 < r12) goto L_0x005c
            java.lang.String r10 = "location"
            java.lang.Object r3 = r3.getSystemService(r10)
            android.location.LocationManager r3 = (android.location.LocationManager) r3
            boolean r3 = r3.isLocationEnabled()
            if (r3 != 0) goto L_0x0083
            goto L_0x0069
        L_0x005c:
            android.content.ContentResolver r3 = r3.getContentResolver()
            java.lang.String r10 = "location_mode"
            int r3 = android.provider.Settings.Secure.getInt(r3, r10, r7)
            if (r3 == 0) goto L_0x0069
            goto L_0x0083
        L_0x0069:
            jjg r0 = defpackage.ulh.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            r3 = 1910(0x776, float:2.676E-42)
            anie r0 = r0.a((java.lang.String) r8, (java.lang.String) r11, (int) r3, (java.lang.String) r9)
            anih r0 = (defpackage.anih) r0
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r10 = "Unable to scan since location is disabled on version %d"
            r0.a((java.lang.String) r10, (int) r3)
            uns r0 = defpackage.uns.UNABLE_TO_SCAN
            goto L_0x00f6
        L_0x0083:
            java.util.concurrent.CountDownLatch r3 = new java.util.concurrent.CountDownLatch
            r3.<init>(r4)
            com.google.android.gms.nearby.mediums.WifiHotspot$ConnectOperation$1 r10 = new com.google.android.gms.nearby.mediums.WifiHotspot$ConnectOperation$1
            java.lang.String r12 = "nearby"
            r10.<init>(r15, r12, r0, r3)
            android.content.Context r12 = r15.d
            android.content.IntentFilter r13 = new android.content.IntentFilter
            java.lang.String r14 = "android.net.wifi.SCAN_RESULTS"
            r13.<init>(r14)
            r12.registerReceiver(r10, r13)
            android.net.wifi.WifiManager r12 = r15.a     // Catch:{ all -> 0x0194 }
            r12.startScan()     // Catch:{ all -> 0x0194 }
            long r12 = defpackage.aymi.ad()     // Catch:{ InterruptedException -> 0x00d2 }
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x00d2 }
            boolean r3 = r3.await(r12, r14)     // Catch:{ InterruptedException -> 0x00d2 }
            if (r3 == 0) goto L_0x00b4
            android.content.Context r0 = r15.d
            defpackage.thp.a((android.content.Context) r0, (android.content.BroadcastReceiver) r10)
            uns r0 = defpackage.uns.FOUND_AP
            goto L_0x00f6
        L_0x00b4:
            jjg r3 = defpackage.ulh.a     // Catch:{ InterruptedException -> 0x00d2 }
            anie r3 = r3.b()     // Catch:{ InterruptedException -> 0x00d2 }
            anih r3 = (defpackage.anih) r3     // Catch:{ InterruptedException -> 0x00d2 }
            r12 = 1944(0x798, float:2.724E-42)
            anie r3 = r3.a((java.lang.String) r8, (java.lang.String) r11, (int) r12, (java.lang.String) r9)     // Catch:{ InterruptedException -> 0x00d2 }
            anih r3 = (defpackage.anih) r3     // Catch:{ InterruptedException -> 0x00d2 }
            java.lang.String r12 = "Couldn't find Wifi AP %s after scanning for %d seconds."
            long r13 = defpackage.aymi.ad()     // Catch:{ InterruptedException -> 0x00d2 }
            r3.a((java.lang.String) r12, (java.lang.Object) r0, (long) r13)     // Catch:{ InterruptedException -> 0x00d2 }
            uns r0 = defpackage.uns.AP_NOT_FOUND     // Catch:{ InterruptedException -> 0x00d2 }
            android.content.Context r3 = r15.d
            goto L_0x00f3
        L_0x00d2:
            r3 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0194 }
            r3.interrupt()     // Catch:{ all -> 0x0194 }
            jjg r3 = defpackage.ulh.a     // Catch:{ all -> 0x0194 }
            anie r3 = r3.b()     // Catch:{ all -> 0x0194 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0194 }
            r12 = 1951(0x79f, float:2.734E-42)
            anie r3 = r3.a((java.lang.String) r8, (java.lang.String) r11, (int) r12, (java.lang.String) r9)     // Catch:{ all -> 0x0194 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0194 }
            java.lang.String r12 = "Interrupted while waiting to get the results of scanning for Wifi AP %s."
            r3.a((java.lang.String) r12, (java.lang.Object) r0)     // Catch:{ all -> 0x0194 }
            uns r0 = defpackage.uns.AP_NOT_FOUND     // Catch:{ all -> 0x0194 }
            android.content.Context r3 = r15.d
        L_0x00f3:
            defpackage.thp.a((android.content.Context) r3, (android.content.BroadcastReceiver) r10)
        L_0x00f6:
            int r3 = r0.ordinal()
            if (r3 == 0) goto L_0x0116
            if (r3 == r4) goto L_0x017a
            if (r3 == r5) goto L_0x0118
            jjg r2 = defpackage.ulh.a
            anie r2 = r2.c()
            anih r2 = (defpackage.anih) r2
            r3 = 1896(0x768, float:2.657E-42)
            anie r2 = r2.a((java.lang.String) r8, (java.lang.String) r11, (int) r3, (java.lang.String) r9)
            anih r2 = (defpackage.anih) r2
            java.lang.String r3 = "Unknown ApScanResult %s!"
            r2.a((java.lang.String) r3, (java.lang.Object) r0)
            goto L_0x017a
        L_0x0116:
            jjg r0 = defpackage.ulh.a
        L_0x0118:
            boolean r0 = r15.a((android.net.wifi.WifiConfiguration) r2)
        L_0x011c:
            if (r0 == 0) goto L_0x017a
            java.lang.String r0 = r15.f
            int r2 = r15.j
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r3[r7] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3[r4] = r0
            java.lang.String r0 = "{%s:%s}"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            unq r3 = new unq
            r3.<init>(r15, r2, r0)
            arzi r0 = new arzi
            long r4 = defpackage.aymi.af()
            r0.<init>((long) r4)
            java.util.concurrent.atomic.AtomicBoolean r2 = r15.e
            r0.a = r2
            arzj r0 = r0.a()
            java.lang.String r2 = "CreateSocketToConnectedWifiAp"
            java.lang.Object r0 = defpackage.arzk.a((java.util.concurrent.Callable) r3, (java.lang.String) r2, (defpackage.arzj) r0)
            uwf r0 = (defpackage.uwf) r0
            if (r0 == 0) goto L_0x015b
            r15.c = r0
            r0 = 65
            int r0 = r15.a((int) r0)
            return r0
        L_0x015b:
            java.lang.String r0 = r15.f
            r15.b((java.lang.String) r0)
            jjg r0 = defpackage.ulh.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            r2 = 1842(0x732, float:2.581E-42)
            anie r0 = r0.a((java.lang.String) r8, (java.lang.String) r1, (int) r2, (java.lang.String) r9)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = r15.f
            int r2 = r15.j
            java.lang.String r3 = "Failed to connect to Wifi hotspot (%s, %s) because we couldn't create a socket to it."
            r0.a((java.lang.String) r3, (java.lang.Object) r1, (int) r2)
            return r6
        L_0x017a:
            jjg r0 = defpackage.ulh.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            r2 = 1831(0x727, float:2.566E-42)
            anie r0 = r0.a((java.lang.String) r8, (java.lang.String) r1, (int) r2, (java.lang.String) r9)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = r15.f
            int r2 = r15.j
            java.lang.String r3 = "Failed to connect to Wifi hotspot (%s, %s) because we couldn't connect to the AP."
            r0.a((java.lang.String) r3, (java.lang.Object) r1, (int) r2)
            return r6
        L_0x0194:
            r0 = move-exception
            android.content.Context r1 = r15.d
            defpackage.thp.a((android.content.Context) r1, (android.content.BroadcastReceiver) r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.unt.b():int");
    }

    private final void a(ConnectivityManager.NetworkCallback networkCallback) {
        this.b.unregisterNetworkCallback(networkCallback);
    }

    private final boolean a(WifiConfiguration wifiConfiguration) {
        boolean z;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        int i2 = Build.VERSION.SDK_INT;
        unr unr = new unr(this, countDownLatch);
        this.b.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), unr);
        try {
            int addNetwork = this.a.addNetwork(wifiConfiguration);
            z = false;
            if (addNetwork == -1) {
                ((anih) ((anih) ulh.a.b()).a("unt", "b", 2076, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to add network %s.", (Object) wifiConfiguration.SSID);
            } else if (!this.a.enableNetwork(addNetwork, true)) {
                ((anih) ((anih) ulh.a.b()).a("unt", "b", 2081, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to enable network %s.", (Object) wifiConfiguration.SSID);
            } else if (!this.a.reconnect()) {
                ((anih) ((anih) ulh.a.b()).a("unt", "b", 2086, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to reconnect to network %s.", (Object) wifiConfiguration.SSID);
            } else {
                z = countDownLatch.await(aymi.ac(), TimeUnit.SECONDS);
                if (!z) {
                    b(wifiConfiguration.SSID);
                    ((anih) ((anih) ulh.a.b()).a("unt", "a", 2030, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Couldn't connect to Wifi AP %s after %d seconds", (Object) wifiConfiguration.SSID, aymi.ac());
                } else {
                    jjg jjg = ulh.a;
                    String str = wifiConfiguration.SSID;
                }
                int i3 = Build.VERSION.SDK_INT;
                a((ConnectivityManager.NetworkCallback) unr);
                return z;
            }
            ((anih) ((anih) ulh.a.b()).a("unt", "a", 2004, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to initiate connection to discovered Wifi AP %s.", (Object) wifiConfiguration.SSID);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            ((anih) ((anih) ulh.a.b()).a("unt", "a", 2018, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted while waiting to connect to Wifi AP %s", (Object) wifiConfiguration.SSID);
        } catch (Throwable th) {
            int i4 = Build.VERSION.SDK_INT;
            a((ConnectivityManager.NetworkCallback) unr);
            throw th;
        }
        int i32 = Build.VERSION.SDK_INT;
        a((ConnectivityManager.NetworkCallback) unr);
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r0 = defpackage.uoh.a((java.lang.String) r11)
            java.lang.String r1 = defpackage.uoh.a((java.lang.String) r12)
            r2 = 1
            android.net.wifi.WifiConfiguration r0 = defpackage.uoh.a(r0, r1, r2)
            java.lang.String r1 = r10.k
            boolean r1 = defpackage.uwe.a(r0, r1)
            if (r1 != 0) goto L_0x0022
            java.lang.String r0 = defpackage.uoh.a((java.lang.String) r11)
            java.lang.String r12 = defpackage.uoh.a((java.lang.String) r12)
            android.net.wifi.WifiConfiguration r0 = defpackage.uoh.a(r0, r12, r2)
            goto L_0x0023
        L_0x0022:
        L_0x0023:
            boolean r12 = defpackage.jkr.e()
            if (r12 != 0) goto L_0x0117
            int r12 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            java.lang.String r3 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r4 = "a"
            java.lang.String r5 = "unt"
            r6 = 0
            if (r12 < r1) goto L_0x0074
            android.content.Context r12 = r10.d
            int r1 = android.os.Build.VERSION.SDK_INT
            r7 = 28
            if (r1 < r7) goto L_0x004d
            java.lang.String r1 = "location"
            java.lang.Object r12 = r12.getSystemService(r1)
            android.location.LocationManager r12 = (android.location.LocationManager) r12
            boolean r12 = r12.isLocationEnabled()
            if (r12 != 0) goto L_0x0074
            goto L_0x005a
        L_0x004d:
            android.content.ContentResolver r12 = r12.getContentResolver()
            java.lang.String r1 = "location_mode"
            int r12 = android.provider.Settings.Secure.getInt(r12, r1, r6)
            if (r12 == 0) goto L_0x005a
            goto L_0x0074
        L_0x005a:
            jjg r11 = defpackage.ulh.a
            anie r11 = r11.d()
            anih r11 = (defpackage.anih) r11
            r12 = 1910(0x776, float:2.676E-42)
            anie r11 = r11.a((java.lang.String) r5, (java.lang.String) r4, (int) r12, (java.lang.String) r3)
            anih r11 = (defpackage.anih) r11
            int r12 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = "Unable to scan since location is disabled on version %d"
            r11.a((java.lang.String) r1, (int) r12)
            uns r11 = defpackage.uns.UNABLE_TO_SCAN
            goto L_0x00e7
        L_0x0074:
            java.util.concurrent.CountDownLatch r12 = new java.util.concurrent.CountDownLatch
            r12.<init>(r2)
            com.google.android.gms.nearby.mediums.WifiHotspot$ConnectOperation$1 r1 = new com.google.android.gms.nearby.mediums.WifiHotspot$ConnectOperation$1
            java.lang.String r7 = "nearby"
            r1.<init>(r10, r7, r11, r12)
            android.content.Context r7 = r10.d
            android.content.IntentFilter r8 = new android.content.IntentFilter
            java.lang.String r9 = "android.net.wifi.SCAN_RESULTS"
            r8.<init>(r9)
            r7.registerReceiver(r1, r8)
            android.net.wifi.WifiManager r7 = r10.a     // Catch:{ all -> 0x0110 }
            r7.startScan()     // Catch:{ all -> 0x0110 }
            long r7 = defpackage.aymi.ad()     // Catch:{ InterruptedException -> 0x00c3 }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x00c3 }
            boolean r12 = r12.await(r7, r9)     // Catch:{ InterruptedException -> 0x00c3 }
            if (r12 == 0) goto L_0x00a5
            android.content.Context r11 = r10.d
            defpackage.thp.a((android.content.Context) r11, (android.content.BroadcastReceiver) r1)
            uns r11 = defpackage.uns.FOUND_AP
            goto L_0x00e7
        L_0x00a5:
            jjg r12 = defpackage.ulh.a     // Catch:{ InterruptedException -> 0x00c3 }
            anie r12 = r12.b()     // Catch:{ InterruptedException -> 0x00c3 }
            anih r12 = (defpackage.anih) r12     // Catch:{ InterruptedException -> 0x00c3 }
            r7 = 1944(0x798, float:2.724E-42)
            anie r12 = r12.a((java.lang.String) r5, (java.lang.String) r4, (int) r7, (java.lang.String) r3)     // Catch:{ InterruptedException -> 0x00c3 }
            anih r12 = (defpackage.anih) r12     // Catch:{ InterruptedException -> 0x00c3 }
            java.lang.String r7 = "Couldn't find Wifi AP %s after scanning for %d seconds."
            long r8 = defpackage.aymi.ad()     // Catch:{ InterruptedException -> 0x00c3 }
            r12.a((java.lang.String) r7, (java.lang.Object) r11, (long) r8)     // Catch:{ InterruptedException -> 0x00c3 }
            uns r11 = defpackage.uns.AP_NOT_FOUND     // Catch:{ InterruptedException -> 0x00c3 }
            android.content.Context r12 = r10.d
            goto L_0x00e4
        L_0x00c3:
            r12 = move-exception
            java.lang.Thread r12 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0110 }
            r12.interrupt()     // Catch:{ all -> 0x0110 }
            jjg r12 = defpackage.ulh.a     // Catch:{ all -> 0x0110 }
            anie r12 = r12.b()     // Catch:{ all -> 0x0110 }
            anih r12 = (defpackage.anih) r12     // Catch:{ all -> 0x0110 }
            r7 = 1951(0x79f, float:2.734E-42)
            anie r12 = r12.a((java.lang.String) r5, (java.lang.String) r4, (int) r7, (java.lang.String) r3)     // Catch:{ all -> 0x0110 }
            anih r12 = (defpackage.anih) r12     // Catch:{ all -> 0x0110 }
            java.lang.String r7 = "Interrupted while waiting to get the results of scanning for Wifi AP %s."
            r12.a((java.lang.String) r7, (java.lang.Object) r11)     // Catch:{ all -> 0x0110 }
            uns r11 = defpackage.uns.AP_NOT_FOUND     // Catch:{ all -> 0x0110 }
            android.content.Context r12 = r10.d
        L_0x00e4:
            defpackage.thp.a((android.content.Context) r12, (android.content.BroadcastReceiver) r1)
        L_0x00e7:
            int r12 = r11.ordinal()
            if (r12 == 0) goto L_0x0109
            if (r12 == r2) goto L_0x0108
            r1 = 2
            if (r12 == r1) goto L_0x010b
            jjg r12 = defpackage.ulh.a
            anie r12 = r12.c()
            anih r12 = (defpackage.anih) r12
            r0 = 1896(0x768, float:2.657E-42)
            anie r12 = r12.a((java.lang.String) r5, (java.lang.String) r4, (int) r0, (java.lang.String) r3)
            anih r12 = (defpackage.anih) r12
            java.lang.String r0 = "Unknown ApScanResult %s!"
            r12.a((java.lang.String) r0, (java.lang.Object) r11)
            return r6
        L_0x0108:
            return r6
        L_0x0109:
            jjg r11 = defpackage.ulh.a
        L_0x010b:
            boolean r11 = r10.a((android.net.wifi.WifiConfiguration) r0)
            return r11
        L_0x0110:
            r11 = move-exception
            android.content.Context r12 = r10.d
            defpackage.thp.a((android.content.Context) r12, (android.content.BroadcastReceiver) r1)
            throw r11
        L_0x0117:
            boolean r11 = r10.a((android.net.wifi.WifiConfiguration) r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.unt.a(java.lang.String, java.lang.String):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0082 A[SYNTHETIC, Splitter:B:18:0x0082] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ defpackage.uwf a(int r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r0 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r1 = "a"
            java.lang.String r2 = "unt"
            r3 = 0
            r4 = 1
            defpackage.ulu.a()     // Catch:{ IOException -> 0x007b }
            java.net.Socket r5 = defpackage.unw.a()     // Catch:{ IOException -> 0x007b }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x007b }
            android.net.Network[] r6 = r11.c()     // Catch:{ IOException -> 0x007b }
            int r7 = r6.length     // Catch:{ IOException -> 0x007b }
            r8 = 0
        L_0x0017:
            if (r8 >= r7) goto L_0x002d
            r9 = r6[r8]     // Catch:{ IOException -> 0x007b }
            android.net.ConnectivityManager r10 = r11.b     // Catch:{ IOException -> 0x007b }
            android.net.NetworkInfo r10 = r10.getNetworkInfo(r9)     // Catch:{ IOException -> 0x007b }
            int r10 = r10.getType()     // Catch:{ IOException -> 0x007b }
            if (r10 == r4) goto L_0x002a
            int r8 = r8 + 1
            goto L_0x0017
        L_0x002a:
            r9.bindSocket(r5)     // Catch:{ IOException -> 0x007b }
        L_0x002d:
            jjg r6 = defpackage.ulh.a     // Catch:{ IOException -> 0x0077 }
            android.net.wifi.WifiManager r6 = r11.a     // Catch:{ IOException -> 0x0077 }
            android.net.DhcpInfo r6 = r6.getDhcpInfo()     // Catch:{ IOException -> 0x0077 }
            int r6 = r6.gateway     // Catch:{ IOException -> 0x0077 }
            defpackage.ulu.c(r6)     // Catch:{ IOException -> 0x0077 }
            java.net.InetSocketAddress r6 = new java.net.InetSocketAddress     // Catch:{ IOException -> 0x0077 }
            android.net.wifi.WifiManager r7 = r11.a     // Catch:{ IOException -> 0x0077 }
            android.net.DhcpInfo r7 = r7.getDhcpInfo()     // Catch:{ IOException -> 0x0077 }
            int r7 = r7.gateway     // Catch:{ IOException -> 0x0077 }
            java.net.InetAddress r7 = defpackage.ulu.c(r7)     // Catch:{ IOException -> 0x0077 }
            r6.<init>(r7, r12)     // Catch:{ IOException -> 0x0077 }
            aymi r12 = defpackage.aymi.a     // Catch:{ IOException -> 0x0077 }
            aymj r12 = r12.a()     // Catch:{ IOException -> 0x0077 }
            long r7 = r12.bz()     // Catch:{ IOException -> 0x0077 }
            int r12 = (int) r7     // Catch:{ IOException -> 0x0077 }
            r5.connect(r6, r12)     // Catch:{ IOException -> 0x0077 }
            jjg r12 = defpackage.ulh.a     // Catch:{ IOException -> 0x0077 }
            anie r12 = r12.d()     // Catch:{ IOException -> 0x0077 }
            anih r12 = (defpackage.anih) r12     // Catch:{ IOException -> 0x0077 }
            r6 = 2113(0x841, float:2.961E-42)
            anie r12 = r12.a((java.lang.String) r2, (java.lang.String) r1, (int) r6, (java.lang.String) r0)     // Catch:{ IOException -> 0x0077 }
            anih r12 = (defpackage.anih) r12     // Catch:{ IOException -> 0x0077 }
            java.lang.String r2 = "Successfully connected via a Wifi socket to %s."
            r12.a((java.lang.String) r2, (java.lang.Object) r13)     // Catch:{ IOException -> 0x0077 }
            uwf r12 = new uwf     // Catch:{ IOException -> 0x0077 }
            r12.<init>(r5)     // Catch:{ IOException -> 0x0077 }
            defpackage.ulu.b()
            return r12
        L_0x0077:
            r12 = move-exception
            goto L_0x007d
        L_0x0079:
            r12 = move-exception
            goto L_0x00b3
        L_0x007b:
            r12 = move-exception
            r5 = 0
        L_0x007d:
            java.lang.String r2 = "WifiHotspot"
            if (r5 != 0) goto L_0x0082
            goto L_0x00a3
        L_0x0082:
            r5.close()     // Catch:{ IOException -> 0x0088 }
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x0079 }
            goto L_0x00a3
        L_0x0088:
            r5 = move-exception
            jjg r6 = defpackage.ulh.a     // Catch:{ all -> 0x0079 }
            anie r6 = r6.c()     // Catch:{ all -> 0x0079 }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x0079 }
            r6.a((java.lang.Throwable) r5)     // Catch:{ all -> 0x0079 }
            java.lang.String r5 = "ulu"
            r7 = 82
            anie r0 = r6.a((java.lang.String) r5, (java.lang.String) r1, (int) r7, (java.lang.String) r0)     // Catch:{ all -> 0x0079 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "Failed to close %sSocket %s"
            r0.a((java.lang.String) r1, (java.lang.Object) r2, (java.lang.Object) r13)     // Catch:{ all -> 0x0079 }
        L_0x00a3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0079 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x0079 }
            r1[r3] = r13     // Catch:{ all -> 0x0079 }
            java.lang.String r13 = "Failed to connect via a Wifi socket to %s."
            java.lang.String r13 = java.lang.String.format(r13, r1)     // Catch:{ all -> 0x0079 }
            r0.<init>(r13, r12)     // Catch:{ all -> 0x0079 }
            throw r0     // Catch:{ all -> 0x0079 }
        L_0x00b3:
            defpackage.ulu.b()
            goto L_0x00b8
        L_0x00b7:
            throw r12
        L_0x00b8:
            goto L_0x00b7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.unt.a(int, java.lang.String):uwf");
    }

    public final void a() {
        if (!b(this.f)) {
            ((anih) ((anih) ulh.a.c()).a("unt", "a", 1857, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to disconnect from the currently-connected Wifi hotspot");
        } else {
            jjg jjg = ulh.a;
        }
    }
}
