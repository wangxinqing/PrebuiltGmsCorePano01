package com.google.android.contextmanager.producer.module.indooroutdoor;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class WifiFeatureGroupGenerator extends nla {
    public final Context a;
    public final Handler b;
    public volatile boolean c;
    public cgz d;
    private final WifiManager e;
    private final cgp f;
    private final cgm g;

    public WifiFeatureGroupGenerator(Context context, cgm cgm, cgp cgp, Looper looper) {
        super("contextmanager");
        this.a = context;
        this.g = cgm;
        this.e = (WifiManager) context.getSystemService("wifi");
        this.f = cgp;
        this.b = new qvr(looper);
    }

    public final void a(Context context, Intent intent) {
        List<ScanResult> list;
        if (this.c && "android.net.wifi.SCAN_RESULTS".equals(intent.getAction())) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
            try {
                list = this.e.getScanResults();
            } catch (RuntimeException e2) {
                Log.e("IndoorOutdoorPredictor", "Failed to scan wifi results.", e2);
                list = null;
            }
            if (list != null) {
                cha cha = new cha();
                Iterator<T> it = list.iterator();
                while (true) {
                    char c2 = 0;
                    if (!it.hasNext()) {
                        List a2 = cha.a(0);
                        List a3 = cha.a(1);
                        this.d = new cgz(nanos, cha.b(a2, 0), cha.a(a2, 0), cha.b(a3, 1), cha.a(a3, 1));
                        this.g.a.a();
                        break;
                    }
                    ScanResult scanResult = (ScanResult) it.next();
                    if (scanResult == null || !agxx.a(scanResult.BSSID)) {
                        String valueOf = String.valueOf(scanResult);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                        sb.append("Invalid BSSID in scan result: ");
                        sb.append(valueOf);
                        Log.e("IndoorOutdoorPredictor", sb.toString());
                    } else if (!agxx.a(scanResult.BSSID, scanResult.SSID)) {
                        String str = scanResult.BSSID;
                        int i = scanResult.level;
                        int i2 = scanResult.frequency;
                        if (agxx.a(str)) {
                            long a4 = arvy.a(str);
                            if (agxx.a(a4)) {
                                long j = a4 & 281474960982000L;
                                Map map = cha.b;
                                Long valueOf2 = Long.valueOf(j);
                                cgy cgy = (cgy) map.get(valueOf2);
                                if (cgy == null) {
                                    cgy = new cgy(j);
                                    cha.b.put(valueOf2, cgy);
                                }
                                if (i2 >= 2601) {
                                    c2 = 1;
                                }
                                int[] iArr = cgy.b;
                                iArr[c2] = iArr[c2] + 1;
                                int[] iArr2 = cgy.c;
                                iArr2[c2] = iArr2[c2] + i;
                            } else {
                                StringBuilder sb2 = new StringBuilder(41);
                                sb2.append("Invalid MAC address: ");
                                sb2.append(a4);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                        } else {
                            String valueOf3 = String.valueOf(str);
                            throw new IllegalArgumentException(valueOf3.length() == 0 ? new String("Invalid BSSID ") : "Invalid BSSID ".concat(valueOf3));
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                Log.e("IndoorOutdoorPredictor", "null scan results");
            }
            cgp cgp = this.f;
            cgp.b.removeMessages(2);
            cgp.a();
        }
    }
}
