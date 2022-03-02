package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.location.reporting.collectors.WifiScanReporter$ScanReceiver;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ajhp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajhp {
    public final Set a = new HashSet();
    public final jiq b;
    public final Object c = new Object();
    public boolean d;
    public ajho e;
    private final Context f;
    private WifiScanReporter$ScanReceiver g;

    public ajhp(Context context, jiq jiq) {
        this.f = context;
        this.b = jiq;
    }

    public final synchronized void a() {
        if (this.d) {
            ajnw.b(this.f, "com.google.android.location.reporting.ACTION_WIFI_SCAN_RESULTS").cancel();
            WifiScanReporter$ScanReceiver wifiScanReporter$ScanReceiver = this.g;
            if (wifiScanReporter$ScanReceiver != null) {
                try {
                    this.f.unregisterReceiver(wifiScanReporter$ScanReceiver);
                    this.g = null;
                } catch (IllegalArgumentException e2) {
                    try {
                        ajix.c("GCoreUlr", "Try to unregister a  wifi scan reporter receiver before register it!");
                        this.g = null;
                    } catch (Throwable th) {
                        this.g = null;
                        throw th;
                    }
                }
            }
            synchronized (this.c) {
                this.e = null;
                this.a.clear();
            }
            this.d = false;
        }
    }

    public final synchronized void a(ajho ajho) {
        if (!this.d) {
            this.e = ajho;
            if (this.g == null) {
                WifiScanReporter$ScanReceiver wifiScanReporter$ScanReceiver = new WifiScanReporter$ScanReceiver(this);
                this.g = wifiScanReporter$ScanReceiver;
                this.f.registerReceiver(wifiScanReporter$ScanReceiver, new IntentFilter("com.google.android.location.reporting.ACTION_WIFI_SCAN_RESULTS"));
            }
            PendingIntent b2 = ajnw.b(this.f, "com.google.android.location.reporting.ACTION_WIFI_SCAN_RESULTS");
            atir atir = new atir(this.f.getPackageName());
            atir.c(b2);
            atir.a(jlr.a(this.f, "com.google.android.gms"));
            boolean a2 = ajnw.a(this.f, atir.a);
            this.d = a2;
            StringBuilder sb = new StringBuilder(43);
            sb.append("NLP Wifi scan registration, result is ");
            sb.append(a2);
            sb.toString();
        }
    }
}
