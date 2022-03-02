package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import com.google.android.location.contexthub.SettingsHelperNyc$2;
import java.io.PrintWriter;

/* renamed from: ahzh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahzh extends ahzd implements arnb {
    public final long a;
    public final aucd b;
    private final arnd c;
    private final Context d;
    private final Handler e;
    private final qvv f;
    private final WifiManager g;
    private boolean h = false;
    private boolean i = false;
    private final arne j = new ahze(this);
    private final BroadcastReceiver k = new SettingsHelperNyc$2(this, "location");

    public ahzh(Context context, Handler handler) {
        arnd a2 = new aipq().a(context);
        this.d = context;
        this.e = handler;
        this.c = a2;
        this.a = 5147455389092024324L;
        this.g = (WifiManager) context.getSystemService("wifi");
        this.b = armv.g.o();
        this.f = new ahzg(this, "location", "SettingsHelperWifiObserver", handler);
    }

    private final boolean j() {
        WifiManager wifiManager = this.g;
        return wifiManager != null && (wifiManager.isWifiEnabled() || this.g.isScanAlwaysAvailable());
    }

    public final void a() {
        this.c.a(5147455389092024324L, this, this.e);
        this.c.a(this.j, this.e);
        e();
        a(this.b);
        a(2, this.b);
    }

    public final void a(int i2) {
    }

    public final void b() {
        this.c.a((arnb) this);
        this.c.b(this.j);
        f();
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        armv armv = (armv) aucd.b;
        armv armv2 = armv.g;
        armv.a |= 2;
        armv.c = false;
        aucd aucd2 = this.b;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        armv armv3 = (armv) aucd2.b;
        armv3.a |= 4;
        armv3.d = false;
        aucd aucd3 = this.b;
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        armv armv4 = (armv) aucd3.b;
        armv4.a |= 8;
        armv4.e = false;
        aucd aucd4 = this.b;
        if (aucd4.c) {
            aucd4.c();
            aucd4.c = false;
        }
        armv armv5 = (armv) aucd4.b;
        armv5.a |= 16;
        armv5.f = false;
        a(1, this.b);
    }

    public final void b(int i2) {
    }

    public final void be() {
        a(this.b);
        a(3, this.b);
    }

    public final void d() {
        boolean j2 = j();
        aucd aucd = this.b;
        if (((armv) aucd.b).c != j2) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            armv armv = (armv) aucd.b;
            armv armv2 = armv.g;
            armv.a |= 2;
            armv.c = j2;
            a(3, this.b);
        }
    }

    public final void e() {
        if (!this.h) {
            this.h = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.location.MODE_CHANGED");
            if (axyx.a.a().bugfixCatchLatestSettings()) {
                intentFilter.addAction("android.location.PROVIDERS_CHANGED");
                this.d.getContentResolver().registerContentObserver(Settings.Global.getUriFor("wifi_scan_always_enabled"), false, this.f);
                this.i = true;
            }
            this.d.registerReceiver(this.k, intentFilter, (String) null, this.e);
        }
    }

    public final void f() {
        if (this.h) {
            this.h = false;
            this.d.unregisterReceiver(this.k);
            if (this.i) {
                this.i = false;
                this.d.getContentResolver().unregisterContentObserver(this.f);
            }
        }
    }

    public final boolean g() {
        return Settings.System.getInt(this.d.getContentResolver(), "airplane_mode_on", 0) == 1;
    }

    public final boolean h() {
        return Settings.Secure.isLocationProviderEnabled(this.d.getContentResolver(), "gps");
    }

    public final boolean i() {
        return Settings.Secure.isLocationProviderEnabled(this.d.getContentResolver(), "network");
    }

    public final void a(int i2, aucd aucd) {
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        armv armv = (armv) aucd.b;
        armv armv2 = armv.g;
        armv.b = i2 - 1;
        armv.a |= 1;
        arnh a2 = this.c.a(this.a);
        if (a2 != null) {
            arnk a3 = a2.a(49, 0, (audx) (armv) aucd.clone().i());
            if (a3 == null) {
                Log.e("SettingsHelperNyc", "Unable to post notification to nanoapp.");
            } else {
                a3.a(new ahzf());
            }
        }
    }

    public final void a(aucd aucd) {
        boolean j2 = j();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        armv armv = (armv) aucd.b;
        armv armv2 = armv.g;
        armv.a |= 2;
        armv.c = j2;
        boolean z = !g();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        armv armv3 = (armv) aucd.b;
        armv3.a |= 4;
        armv3.d = z;
        boolean h2 = h();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        armv armv4 = (armv) aucd.b;
        armv4.a |= 8;
        armv4.e = h2;
        boolean i2 = i();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        armv armv5 = (armv) aucd.b;
        armv5.a |= 16;
        armv5.f = i2;
    }

    public final void a(PrintWriter printWriter) {
        if (this.h) {
            printWriter.println("Have active CHRE settings listener");
        } else {
            printWriter.println("No active CHRE settings listener");
        }
    }
}
