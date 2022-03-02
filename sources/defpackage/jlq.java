package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import com.google.android.gms.common.util.WifiConnectionMonitor$ConnectionChangeReceiver;

/* renamed from: jlq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jlq {
    public final WifiManager a;
    public final Object b = new Object();
    public jlp c;
    public boolean d;
    public String e;
    private final Context f;
    private final BroadcastReceiver g;

    public jlq(Context context) {
        this.f = context;
        this.g = new WifiConnectionMonitor$ConnectionChangeReceiver(this);
        this.a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    public final void a() {
        synchronized (this.b) {
            if (this.c != null) {
                this.f.unregisterReceiver(this.g);
            }
            this.c = null;
            this.d = false;
            this.e = "";
        }
    }

    public final void a(jlp jlp) {
        synchronized (this.b) {
            int i = jhg.a;
            if (this.c == null) {
                this.f.registerReceiver(this.g, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            }
            this.c = jlp;
        }
    }
}
