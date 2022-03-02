package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import com.google.android.location.fused.bluepixel.BluePixelSettingsManager$WifiSettingReceiver;

/* renamed from: aihm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aihm {
    public final Context a;
    public final rns b;
    public boolean c = false;
    public final rng d;
    public final rnr e;
    public final aihl f;
    public final BluePixelSettingsManager$WifiSettingReceiver g;
    private final qvr h;
    private final aihg i;
    private final WifiManager j;
    private boolean k = false;

    public aihm(Context context, qvr qvr, aihg aihg) {
        rns f2 = rns.f(context);
        this.a = context;
        this.h = qvr;
        this.i = aihg;
        this.b = f2;
        this.j = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        this.d = new aihj(this);
        this.e = new aihk(this);
        this.g = new BluePixelSettingsManager$WifiSettingReceiver(this);
        this.f = new aihl(this, "location", "BluePixelWifiScanningObserver", qvr);
    }

    public final void a() {
        boolean z;
        if (axxm.k()) {
            this.k = false;
            if (rns.b(this.a)) {
                boolean isWifiEnabled = this.j.isWifiEnabled();
                int i2 = Build.VERSION.SDK_INT;
                if ((isWifiEnabled || rns.d(this.a)) && rns.a(this.a)) {
                    z = true;
                } else {
                    z = false;
                }
                aihg aihg = this.i;
                boolean a2 = this.b.a("gps");
                aucd o = arke.e.o();
                aucd o2 = arjx.e.o();
                aucd o3 = arjn.d.o();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                arjn arjn = (arjn) o3.b;
                arjn.a |= 1;
                arjn.b = a2;
                arjn arjn2 = (arjn) o3.i();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                arjx arjx = (arjx) o2.b;
                arjn2.getClass();
                arjx.c = arjn2;
                arjx.a |= 2;
                aucd o4 = arkh.d.o();
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                arkh arkh = (arkh) o4.b;
                arkh.a |= 1;
                arkh.b = z;
                arkh arkh2 = (arkh) o4.i();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                arjx arjx2 = (arjx) o2.b;
                arkh2.getClass();
                arjx2.d = arkh2;
                arjx2.a |= 4;
                arjx arjx3 = (arjx) o2.i();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                arke arke = (arke) o.b;
                arjx3.getClass();
                arke.c = arjx3;
                arke.b = 6;
                aihg.a((arke) o.i(), 1);
                this.i.d();
                return;
            }
            this.i.f();
        } else if (!this.k) {
            this.i.f();
            this.k = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (!this.c) {
            this.c = true;
            this.b.a(this.d, this.h.getLooper());
            this.b.a(this.e, this.h.getLooper());
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            this.a.registerReceiver(this.g, intentFilter, (String) null, this.h);
            int i2 = Build.VERSION.SDK_INT;
            this.a.getContentResolver().registerContentObserver(Settings.Global.getUriFor("wifi_scan_always_enabled"), false, this.f);
        }
    }
}
