package defpackage;

import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.contextmanager.producer.module.WifiScanProducer$WifiReceiver;
import java.util.List;

/* renamed from: cfz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cfz implements Runnable {
    final /* synthetic */ Intent a;
    final /* synthetic */ WifiScanProducer$WifiReceiver b;

    public cfz(WifiScanProducer$WifiReceiver wifiScanProducer$WifiReceiver, Intent intent) {
        this.b = wifiScanProducer$WifiReceiver;
        this.a = intent;
    }

    public final void run() {
        WifiInfo wifiInfo;
        if (this.a.getAction().equals("android.net.wifi.SCAN_RESULTS")) {
            cga cga = this.b.a;
            long b2 = cbi.i().b();
            ccj ccj = cga.b;
            cga.m = b2;
            cga cga2 = this.b.a;
            List<ScanResult> scanResults = cga2.k.getScanResults();
            String str = null;
            try {
                wifiInfo = cga2.k.getConnectionInfo();
            } catch (IllegalArgumentException e) {
                wifiInfo = null;
            }
            if (wifiInfo != null) {
                str = wifiInfo.getBSSID();
            }
            int i = Build.VERSION.SDK_INT;
            cbi.i().a();
            aucd o = atvc.b.o();
            for (ScanResult next : scanResults) {
                if (!agxx.a(next.BSSID)) {
                    new Object[1][0] = next.BSSID;
                } else {
                    try {
                        if (agxx.b(next.SSID)) {
                            Object[] objArr = {next.BSSID, next.SSID};
                        } else if (next.frequency == 0) {
                            new Object[1][0] = Integer.valueOf(next.frequency);
                        } else {
                            aucd o2 = atvd.i.o();
                            if (!TextUtils.isEmpty(next.BSSID)) {
                                String str2 = next.BSSID;
                                if (o2.c) {
                                    o2.c();
                                    o2.c = false;
                                }
                                atvd atvd = (atvd) o2.b;
                                str2.getClass();
                                atvd.a |= 1;
                                atvd.b = str2;
                                if (atvd.b.equals(str)) {
                                    if (o2.c) {
                                        o2.c();
                                        o2.c = false;
                                    }
                                    atvd atvd2 = (atvd) o2.b;
                                    atvd2.a |= 64;
                                    atvd2.h = true;
                                }
                            }
                            if (!TextUtils.isEmpty(next.SSID)) {
                                String str3 = next.SSID;
                                if (o2.c) {
                                    o2.c();
                                    o2.c = false;
                                }
                                atvd atvd3 = (atvd) o2.b;
                                str3.getClass();
                                atvd3.a = 2 | atvd3.a;
                                atvd3.c = str3;
                            }
                            if (!TextUtils.isEmpty(next.capabilities)) {
                                String str4 = next.capabilities;
                                if (o2.c) {
                                    o2.c();
                                    o2.c = false;
                                }
                                atvd atvd4 = (atvd) o2.b;
                                str4.getClass();
                                atvd4.a |= 4;
                                atvd4.d = str4;
                            }
                            int i2 = next.frequency;
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            atvd atvd5 = (atvd) o2.b;
                            atvd5.a |= 8;
                            atvd5.e = i2;
                            int i3 = next.level;
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            atvd atvd6 = (atvd) o2.b;
                            atvd6.a |= 16;
                            atvd6.f = i3;
                            long j = next.timestamp;
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            atvd atvd7 = (atvd) o2.b;
                            atvd7.a |= 32;
                            atvd7.g = j;
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            atvc atvc = (atvc) o.b;
                            atvd atvd8 = (atvd) o2.i();
                            atvd8.getClass();
                            if (!atvc.a.a()) {
                                atvc.a = aucj.a(atvc.a);
                            }
                            atvc.a.add(atvd8);
                        }
                    } catch (IllegalArgumentException e2) {
                    }
                }
            }
            jti jti = new jti(7, 17, 1);
            jti.a(jut.a(cbi.i().a()));
            jti.a(atvc.c, (atvc) o.i());
            cga2.c(jti.a());
        }
    }
}
