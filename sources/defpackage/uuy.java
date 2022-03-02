package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.wifi.aware.WifiAwareManager;
import android.net.wifi.aware.WifiAwareSession;
import com.google.android.gms.nearby.mediums.wifiaware.WifiAwareImpl$LazyWifiAwareSession$1;
import java.security.SecureRandom;

/* renamed from: uuy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uuy {
    public final WifiAwareManager a;
    public final aoru b = tid.b();
    public byte[] c;
    private final Context d;
    private WifiAwareSession e;
    private final BroadcastReceiver f = new WifiAwareImpl$LazyWifiAwareSession$1(this, "nearby");

    public uuy(WifiAwareManager wifiAwareManager, Context context) {
        this.a = wifiAwareManager;
        this.d = context;
        this.c = c();
    }

    private static byte[] c() {
        byte[] bArr = new byte[2];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.net.wifi.aware.WifiAwareSession a() {
        /*
            r8 = this;
            monitor-enter(r8)
            android.net.wifi.aware.WifiAwareSession r0 = r8.e     // Catch:{ all -> 0x00dd }
            if (r0 != 0) goto L_0x0081
            android.net.wifi.aware.WifiAwareManager r0 = r8.a     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r2 = "a"
            java.lang.String r3 = "uuy"
            r4 = 0
            if (r0 != 0) goto L_0x0027
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x00dd }
            anie r0 = r0.b()     // Catch:{ all -> 0x00dd }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00dd }
            r5 = 1074(0x432, float:1.505E-42)
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r2, (int) r5, (java.lang.String) r1)     // Catch:{ all -> 0x00dd }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = "Unable to acquire WiFi Aware session. wifiAwareManager is null."
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x00dd }
            monitor-exit(r8)
            return r4
        L_0x0027:
            boolean r0 = r0.isAvailable()     // Catch:{ all -> 0x00dd }
            if (r0 != 0) goto L_0x0044
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x00dd }
            anie r0 = r0.b()     // Catch:{ all -> 0x00dd }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00dd }
            r5 = 1079(0x437, float:1.512E-42)
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r2, (int) r5, (java.lang.String) r1)     // Catch:{ all -> 0x00dd }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = "Unable to acquire WiFi Aware session. WiFi is not currently available."
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x00dd }
            monitor-exit(r8)
            return r4
        L_0x0044:
            android.content.Context r0 = r8.d     // Catch:{ all -> 0x00dd }
            android.content.BroadcastReceiver r5 = r8.f     // Catch:{ all -> 0x00dd }
            android.content.IntentFilter r6 = new android.content.IntentFilter     // Catch:{ all -> 0x00dd }
            java.lang.String r7 = "android.net.wifi.aware.action.WIFI_AWARE_STATE_CHANGED"
            r6.<init>(r7)     // Catch:{ all -> 0x00dd }
            r0.registerReceiver(r5, r6)     // Catch:{ all -> 0x00dd }
            aosh r0 = defpackage.aosh.f()     // Catch:{ all -> 0x00dd }
            android.net.wifi.aware.WifiAwareManager r5 = r8.a     // Catch:{ all -> 0x00dd }
            uuw r6 = new uuw     // Catch:{ all -> 0x00dd }
            r6.<init>(r0)     // Catch:{ all -> 0x00dd }
            uux r7 = new uux     // Catch:{ all -> 0x00dd }
            r7.<init>()     // Catch:{ all -> 0x00dd }
            r5.attach(r6, r7, r4)     // Catch:{ all -> 0x00dd }
            aymi r5 = defpackage.aymi.a     // Catch:{ InterruptedException -> 0x00b7, ExecutionException -> 0x009d, TimeoutException -> 0x0083 }
            aymj r5 = r5.a()     // Catch:{ InterruptedException -> 0x00b7, ExecutionException -> 0x009d, TimeoutException -> 0x0083 }
            long r5 = r5.ba()     // Catch:{ InterruptedException -> 0x00b7, ExecutionException -> 0x009d, TimeoutException -> 0x0083 }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x00b7, ExecutionException -> 0x009d, TimeoutException -> 0x0083 }
            java.lang.Object r0 = r0.get(r5, r7)     // Catch:{ InterruptedException -> 0x00b7, ExecutionException -> 0x009d, TimeoutException -> 0x0083 }
            android.net.wifi.aware.WifiAwareSession r0 = (android.net.wifi.aware.WifiAwareSession) r0     // Catch:{ InterruptedException -> 0x00b7, ExecutionException -> 0x009d, TimeoutException -> 0x0083 }
            r8.e = r0     // Catch:{ InterruptedException -> 0x00b7, ExecutionException -> 0x009d, TimeoutException -> 0x0083 }
            byte[] r0 = c()     // Catch:{ InterruptedException -> 0x00b7, ExecutionException -> 0x009d, TimeoutException -> 0x0083 }
            r8.c = r0     // Catch:{ InterruptedException -> 0x00b7, ExecutionException -> 0x009d, TimeoutException -> 0x0083 }
            android.net.wifi.aware.WifiAwareSession r0 = r8.e     // Catch:{ InterruptedException -> 0x00b7, ExecutionException -> 0x009d, TimeoutException -> 0x0083 }
        L_0x0081:
            monitor-exit(r8)
            return r0
        L_0x0083:
            r0 = move-exception
            jjg r5 = defpackage.ulh.a     // Catch:{ all -> 0x00dd }
            anie r5 = r5.b()     // Catch:{ all -> 0x00dd }
            anih r5 = (defpackage.anih) r5     // Catch:{ all -> 0x00dd }
            r5.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x00dd }
            r0 = 1129(0x469, float:1.582E-42)
            anie r0 = r5.a((java.lang.String) r3, (java.lang.String) r2, (int) r0, (java.lang.String) r1)     // Catch:{ all -> 0x00dd }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = "Timed out waiting to attach WiFi Aware session"
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x00dd }
            goto L_0x00d4
        L_0x009d:
            r0 = move-exception
            jjg r5 = defpackage.ulh.a     // Catch:{ all -> 0x00dd }
            anie r5 = r5.b()     // Catch:{ all -> 0x00dd }
            anih r5 = (defpackage.anih) r5     // Catch:{ all -> 0x00dd }
            r5.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x00dd }
            r0 = 1127(0x467, float:1.579E-42)
            anie r0 = r5.a((java.lang.String) r3, (java.lang.String) r2, (int) r0, (java.lang.String) r1)     // Catch:{ all -> 0x00dd }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = "Failed to attach WiFi Aware session"
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x00dd }
            goto L_0x00d4
        L_0x00b7:
            r0 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00dd }
            r0.interrupt()     // Catch:{ all -> 0x00dd }
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x00dd }
            anie r0 = r0.b()     // Catch:{ all -> 0x00dd }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00dd }
            r5 = 1125(0x465, float:1.576E-42)
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r2, (int) r5, (java.lang.String) r1)     // Catch:{ all -> 0x00dd }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = "Interrupted while waiting to attach WiFi Aware session"
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x00dd }
        L_0x00d4:
            android.content.Context r0 = r8.d     // Catch:{ all -> 0x00dd }
            android.content.BroadcastReceiver r1 = r8.f     // Catch:{ all -> 0x00dd }
            defpackage.thp.a((android.content.Context) r0, (android.content.BroadcastReceiver) r1)     // Catch:{ all -> 0x00dd }
            monitor-exit(r8)
            return r4
        L_0x00dd:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uuy.a():android.net.wifi.aware.WifiAwareSession");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b() {
        if (this.e != null) {
            thp.a(this.d, this.f);
            this.e.close();
            this.e = null;
            ((anih) ((anih) ulh.a.d()).a("uuy", "b", 1148, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Released WiFi Aware session.");
            return;
        }
        ((anih) ((anih) ulh.a.d()).a("uuy", "b", 1139, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't release the WiFi Aware session because none was acquired.");
    }
}
