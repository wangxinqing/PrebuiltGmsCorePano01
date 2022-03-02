package defpackage;

import android.content.Context;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: acqk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acqk {
    public static final String a = acqk.class.getName();
    public final WifiManager b;
    private final Context c;
    private final CountDownLatch d = new CountDownLatch(1);

    public acqk(Context context) {
        WifiManager a2 = acqo.a(context);
        iva.a((Object) context);
        this.c = context;
        iva.a((Object) a2);
        this.b = a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c3 A[SYNTHETIC, Splitter:B:52:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d3 A[Catch:{ all -> 0x00d0 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x00a3=Splitter:B:39:0x00a3, B:35:0x0095=Splitter:B:35:0x0095, B:49:0x00ba=Splitter:B:49:0x00ba} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized int a(int r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = a     // Catch:{ all -> 0x00eb }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00eb }
            r2 = 33
            r1.<init>(r2)     // Catch:{ all -> 0x00eb }
            java.lang.String r2 = "doConnect. NetworkId: "
            r1.append(r2)     // Catch:{ all -> 0x00eb }
            r1.append(r8)     // Catch:{ all -> 0x00eb }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00eb }
            android.util.Log.v(r0, r1)     // Catch:{ all -> 0x00eb }
            r0 = -1
            if (r8 != r0) goto L_0x0025
            java.lang.String r8 = a     // Catch:{ all -> 0x00eb }
            java.lang.String r1 = "Network not found"
            android.util.Log.w(r8, r1)     // Catch:{ all -> 0x00eb }
            monitor-exit(r7)
            return r0
        L_0x0025:
            int r1 = r7.b()     // Catch:{ all -> 0x00eb }
            if (r1 == r8) goto L_0x00e9
            java.util.List r1 = r7.c()     // Catch:{ all -> 0x00eb }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00eb }
        L_0x0033:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00eb }
            if (r2 == 0) goto L_0x00e0
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00eb }
            android.net.wifi.WifiConfiguration r2 = (android.net.wifi.WifiConfiguration) r2     // Catch:{ all -> 0x00eb }
            int r2 = r2.networkId     // Catch:{ all -> 0x00eb }
            if (r2 != r8) goto L_0x0033
            r1 = 0
            com.google.android.gms.smartdevice.utils.wifi.WifiConnectionManager$WifiConnectionReceiver r2 = new com.google.android.gms.smartdevice.utils.wifi.WifiConnectionManager$WifiConnectionReceiver     // Catch:{ InterruptedException -> 0x00b9, all -> 0x00b7 }
            java.util.concurrent.CountDownLatch r3 = r7.d     // Catch:{ InterruptedException -> 0x00b9, all -> 0x00b7 }
            r2.<init>(r7, r8, r3)     // Catch:{ InterruptedException -> 0x00b9, all -> 0x00b7 }
            android.content.Context r1 = r7.c     // Catch:{ InterruptedException -> 0x00b4, all -> 0x00b1 }
            android.content.IntentFilter r3 = new android.content.IntentFilter     // Catch:{ InterruptedException -> 0x00b4, all -> 0x00b1 }
            java.lang.String r4 = "android.net.wifi.STATE_CHANGE"
            r3.<init>(r4)     // Catch:{ InterruptedException -> 0x00b4, all -> 0x00b1 }
            r1.registerReceiver(r2, r3)     // Catch:{ InterruptedException -> 0x00b4, all -> 0x00b1 }
            android.net.wifi.WifiManager r1 = r7.b     // Catch:{ InterruptedException -> 0x00b4, all -> 0x00b1 }
            r3 = 1
            boolean r1 = r1.enableNetwork(r8, r3)     // Catch:{ InterruptedException -> 0x00b4, all -> 0x00b1 }
            if (r1 != 0) goto L_0x0062
            r1 = -1
            goto L_0x0063
        L_0x0062:
            r1 = r8
        L_0x0063:
            if (r1 == r0) goto L_0x00a3
            java.util.concurrent.CountDownLatch r3 = r7.d     // Catch:{ InterruptedException -> 0x00b4, all -> 0x00b1 }
            r4 = 15
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x00b4, all -> 0x00b1 }
            r3.await(r4, r6)     // Catch:{ InterruptedException -> 0x00b4, all -> 0x00b1 }
            int r3 = r7.b()     // Catch:{ InterruptedException -> 0x00b4, all -> 0x00b1 }
            if (r3 != r8) goto L_0x0075
            goto L_0x00a3
        L_0x0075:
            if (r8 != r0) goto L_0x0078
            goto L_0x0095
        L_0x0078:
            java.util.List r1 = r7.c()     // Catch:{ InterruptedException -> 0x00b4, all -> 0x00b1 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ InterruptedException -> 0x00b4, all -> 0x00b1 }
        L_0x0080:
            boolean r3 = r1.hasNext()     // Catch:{ InterruptedException -> 0x00b4, all -> 0x00b1 }
            if (r3 == 0) goto L_0x0095
            java.lang.Object r3 = r1.next()     // Catch:{ InterruptedException -> 0x00b4, all -> 0x00b1 }
            android.net.wifi.WifiConfiguration r3 = (android.net.wifi.WifiConfiguration) r3     // Catch:{ InterruptedException -> 0x00b4, all -> 0x00b1 }
            int r3 = r3.networkId     // Catch:{ InterruptedException -> 0x00b4, all -> 0x00b1 }
            if (r3 != r8) goto L_0x0080
            android.net.wifi.WifiManager r1 = r7.b     // Catch:{ InterruptedException -> 0x00b4, all -> 0x00b1 }
            r1.removeNetwork(r8)     // Catch:{ InterruptedException -> 0x00b4, all -> 0x00b1 }
        L_0x0095:
            java.lang.String r8 = a     // Catch:{ all -> 0x00eb }
            java.lang.String r1 = "Unregistering wifi state receiver"
            android.util.Log.v(r8, r1)     // Catch:{ all -> 0x00eb }
            android.content.Context r8 = r7.c     // Catch:{ all -> 0x00eb }
            r8.unregisterReceiver(r2)     // Catch:{ all -> 0x00eb }
        L_0x00a1:
            monitor-exit(r7)
            return r0
        L_0x00a3:
            java.lang.String r8 = a     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "Unregistering wifi state receiver"
            android.util.Log.v(r8, r0)     // Catch:{ all -> 0x00eb }
            android.content.Context r8 = r7.c     // Catch:{ all -> 0x00eb }
            r8.unregisterReceiver(r2)     // Catch:{ all -> 0x00eb }
            monitor-exit(r7)
            return r1
        L_0x00b1:
            r8 = move-exception
            r1 = r2
            goto L_0x00d1
        L_0x00b4:
            r8 = move-exception
            r1 = r2
            goto L_0x00ba
        L_0x00b7:
            r8 = move-exception
            goto L_0x00d1
        L_0x00b9:
            r8 = move-exception
        L_0x00ba:
            java.lang.String r2 = a     // Catch:{ all -> 0x00d0 }
            java.lang.String r3 = "WiFi connection interrupted"
            android.util.Log.e(r2, r3, r8)     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x00a1
            java.lang.String r8 = a     // Catch:{ all -> 0x00eb }
            java.lang.String r2 = "Unregistering wifi state receiver"
            android.util.Log.v(r8, r2)     // Catch:{ all -> 0x00eb }
            android.content.Context r8 = r7.c     // Catch:{ all -> 0x00eb }
            r8.unregisterReceiver(r1)     // Catch:{ all -> 0x00eb }
            goto L_0x00a1
        L_0x00d0:
            r8 = move-exception
        L_0x00d1:
            if (r1 == 0) goto L_0x00df
            java.lang.String r0 = a     // Catch:{ all -> 0x00eb }
            java.lang.String r2 = "Unregistering wifi state receiver"
            android.util.Log.v(r0, r2)     // Catch:{ all -> 0x00eb }
            android.content.Context r0 = r7.c     // Catch:{ all -> 0x00eb }
            r0.unregisterReceiver(r1)     // Catch:{ all -> 0x00eb }
        L_0x00df:
            throw r8     // Catch:{ all -> 0x00eb }
        L_0x00e0:
            java.lang.String r8 = a     // Catch:{ all -> 0x00eb }
            java.lang.String r1 = "Network not found"
            android.util.Log.w(r8, r1)     // Catch:{ all -> 0x00eb }
            monitor-exit(r7)
            return r0
        L_0x00e9:
            monitor-exit(r7)
            return r8
        L_0x00eb:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x00ef
        L_0x00ee:
            throw r8
        L_0x00ef:
            goto L_0x00ee
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acqk.a(int):int");
    }

    private final List c() {
        List<WifiConfiguration> configuredNetworks = this.b.getConfiguredNetworks();
        return configuredNetworks == null ? new ArrayList() : configuredNetworks;
    }

    public final int b() {
        WifiInfo connectionInfo = this.b.getConnectionInfo();
        if (connectionInfo != null) {
            return connectionInfo.getNetworkId();
        }
        return -1;
    }

    public final int a(WifiConfiguration wifiConfiguration) {
        int i;
        iva.a((Object) wifiConfiguration);
        iva.a((Object) wifiConfiguration.SSID);
        String b2 = acqc.b(wifiConfiguration.SSID);
        if (b2 != null) {
            Iterator it = c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WifiConfiguration wifiConfiguration2 = (WifiConfiguration) it.next();
                String b3 = acqc.b(wifiConfiguration2.SSID);
                if (b3 != null && b3.equals(b2)) {
                    i = wifiConfiguration2.networkId;
                    break;
                }
            }
        }
        i = -1;
        if (i != -1) {
            Log.w(a, "Network already exists, connecting.");
        }
        if (i == -1) {
            i = this.b.addNetwork(wifiConfiguration);
        }
        if (i != -1) {
            return a(i);
        }
        String str = a;
        String valueOf = String.valueOf(wifiConfiguration.SSID);
        Log.e(str, valueOf.length() == 0 ? new String("Could not create/add network configuration for ") : "Could not create/add network configuration for ".concat(valueOf));
        return -1;
    }

    public final WifiConfiguration a(String str) {
        for (WifiConfiguration wifiConfiguration : a()) {
            String b2 = acqc.b(wifiConfiguration.SSID);
            if (b2 != null && b2.equals(str)) {
                return wifiConfiguration;
            }
        }
        return null;
    }

    public final List a() {
        List list;
        if (acpp.a(this.c)) {
            list = this.b.getPrivilegedConfiguredNetworks();
        } else {
            list = c();
        }
        return list == null ? new ArrayList() : list;
    }
}
