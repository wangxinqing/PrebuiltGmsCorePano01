package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* renamed from: ahvz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahvz extends ahwf {
    private final BroadcastReceiver l = new ahvy(this);

    public ahvz(Context context, ahsr ahsr, ahyy ahyy, ahss ahss, ajrh ajrh, long j, ahwc ahwc) {
        super(context, ahsr, ahyy, ahss, ajrh, j, ahwc);
    }

    public final void c() {
        try {
            this.b.startScan();
        } catch (NullPointerException e) {
        }
    }

    public final void d() {
        this.a.registerReceiver(this.l, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
    }

    public final void e() {
        this.a.unregisterReceiver(this.l);
    }
}
