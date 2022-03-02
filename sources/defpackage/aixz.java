package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiScanner;
import android.os.PowerManager;
import com.android.location.provider.ActivityRecognitionProviderClient;
import java.util.concurrent.Executor;

/* renamed from: aixz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aixz extends aixy {
    aiyp a;
    private Boolean b;
    private Boolean c;

    public final aiwi a() {
        if (axwl.b()) {
            return new aiwg();
        }
        try {
            ActivityRecognitionProviderClient.class.getName();
            return new aiwf();
        } catch (NoClassDefFoundError e) {
            return super.a();
        }
    }

    public final void b() {
        aiyp aiyp = this.a;
        if (aiyp != null) {
            boolean scanResults = aiyp.a.getScanResults();
            StringBuilder sb = new StringBuilder(43);
            sb.append("wifiScanner.getScanResults() returned ");
            sb.append(scanResults);
            sb.toString();
        }
    }

    public final boolean b(PowerManager powerManager) {
        return powerManager.isDeviceIdleMode();
    }

    public final aixs a(ScanResult scanResult) {
        long j;
        ScanResult scanResult2 = scanResult;
        long j2 = scanResult2.timestamp / 1000;
        if (scanResult2.BSSID != null) {
            j = arvy.a(scanResult2.BSSID);
        } else {
            j = 0;
        }
        return new aixs(j2, j, scanResult2.SSID, scanResult2.capabilities, scanResult2.channelWidth, scanResult.is80211mcResponder(), scanResult2.frequency, scanResult2.level, scanResult2.centerFreq0, scanResult2.centerFreq1, scanResult);
    }

    /* access modifiers changed from: protected */
    public WifiScanner.ScanSettings a(boolean z, int i, int i2, boolean z2) {
        StringBuilder sb = new StringBuilder(90);
        sb.append("buildScanSettings: singleShot is ");
        sb.append(z);
        sb.append(", periodInMs is ");
        sb.append(i);
        sb.append(", maxScans is ");
        sb.append(i2);
        sb.toString();
        WifiScanner.ScanSettings scanSettings = new WifiScanner.ScanSettings();
        if (z) {
            scanSettings.reportEvents = 2;
            scanSettings.numBssidsPerScan = 25;
            scanSettings.periodInMs = 0;
        } else {
            scanSettings.reportEvents = 0;
            scanSettings.numBssidsPerScan = 25;
            scanSettings.maxScansToCache = i2;
            scanSettings.periodInMs = i;
        }
        scanSettings.band = 3;
        return scanSettings;
    }

    public final void a(AlarmManager alarmManager, long j, PendingIntent pendingIntent) {
        String valueOf = String.valueOf(pendingIntent.getIntentSender());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
        sb.append("setAlarmAndAllowIdle from ");
        sb.append(valueOf);
        sb.append(" at ");
        sb.append(j);
        sb.toString();
        alarmManager.setExactAndAllowWhileIdle(2, j, pendingIntent);
    }

    public void a(Context context, aixt aixt, boolean z, aizx aizx, boolean z2, aicn aicn, Executor executor) {
        if (z2 || !a(context, 16)) {
            super.a(context, aixt, z, aizx, z2, aicn, executor);
            return;
        }
        WifiScanner wifiScanner = (WifiScanner) context.getSystemService("wifiscanner");
        try {
            wifiScanner.startScan(a(true, 10000, 0, z), new aiyp(wifiScanner, aixt, true));
        } catch (IllegalStateException e) {
            super.a(context, aixt, z, aizx, false, aicn, executor);
        }
    }

    public final void a(Context context, boolean z, long j, int i, aixt aixt, boolean z2) {
        StringBuilder sb = new StringBuilder(75);
        sb.append("setupWifiBatching, enable is ");
        sb.append(z);
        sb.append(" and scanIntervai is ");
        sb.append(j);
        sb.toString();
        if (a(context, 8)) {
            WifiScanner wifiScanner = (WifiScanner) context.getSystemService("wifiscanner");
            if (z) {
                aiyp aiyp = this.a;
                if (aiyp == null) {
                    WifiScanner.ScanSettings a2 = a(false, (int) j, i, z2);
                    aiyp aiyp2 = new aiyp(wifiScanner, aixt, false);
                    this.a = aiyp2;
                    wifiScanner.startBackgroundScan(a2, aiyp2);
                    return;
                }
                wifiScanner.stopBackgroundScan(aiyp);
                return;
            }
            aiyp aiyp3 = this.a;
            if (aiyp3 != null) {
                wifiScanner.stopBackgroundScan(aiyp3);
                this.a = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(android.content.Context r5, int r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.content.Context r0 = r5.getApplicationContext()     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = "wifi"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ all -> 0x0064 }
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0     // Catch:{ all -> 0x0064 }
            java.lang.Boolean r1 = r4.b     // Catch:{ all -> 0x0064 }
            if (r1 != 0) goto L_0x0029
            java.lang.String r1 = "user"
            java.lang.Object r5 = r5.getSystemService(r1)     // Catch:{ all -> 0x0064 }
            android.os.UserManager r5 = (android.os.UserManager) r5     // Catch:{ all -> 0x0064 }
            boolean r5 = r5.isManagedProfile()     // Catch:{ SecurityException -> 0x0024 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ SecurityException -> 0x0024 }
            r4.b = r5     // Catch:{ SecurityException -> 0x0024 }
            goto L_0x0029
        L_0x0024:
            r5 = move-exception
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0064 }
            r4.b = r5     // Catch:{ all -> 0x0064 }
        L_0x0029:
            java.lang.Boolean r5 = r4.b     // Catch:{ all -> 0x0064 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0064 }
            r1 = 0
            if (r5 != 0) goto L_0x0062
            long r2 = defpackage.aydu.j()     // Catch:{ all -> 0x0064 }
            int r5 = (int) r2     // Catch:{ all -> 0x0064 }
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0062
            java.lang.Boolean r5 = r4.c     // Catch:{ all -> 0x0064 }
            if (r5 != 0) goto L_0x005a
            boolean r5 = r0.isWifiScannerSupported()     // Catch:{ all -> 0x0064 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0064 }
            r0 = 50
            r6.<init>(r0)     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = "WifiManager.isWifiScannerSupported() returns "
            r6.append(r0)     // Catch:{ all -> 0x0064 }
            r6.append(r5)     // Catch:{ all -> 0x0064 }
            r6.toString()     // Catch:{ all -> 0x0064 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0064 }
            r4.c = r5     // Catch:{ all -> 0x0064 }
        L_0x005a:
            java.lang.Boolean r5 = r4.c     // Catch:{ all -> 0x0064 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0064 }
            monitor-exit(r4)
            return r5
        L_0x0062:
            monitor-exit(r4)
            return r1
        L_0x0064:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixz.a(android.content.Context, int):boolean");
    }
}
