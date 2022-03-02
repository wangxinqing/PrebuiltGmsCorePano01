package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import com.google.android.contextmanager.producer.module.WifiScanProducer$WifiReceiver;

/* renamed from: cga  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cga extends ccw {
    public static final ccj b = new ccj(new cfy(), "WifiScanProducer", new int[]{17}, (int[]) null);
    protected final WifiManager k = ((WifiManager) this.d.getSystemService("wifi"));
    protected final WifiScanProducer$WifiReceiver l = new WifiScanProducer$WifiReceiver(this);
    public long m = 0;

    public cga(Context context, bsz bsz, String str, but but) {
        super(context, bsz, b, str, but);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.d.registerReceiver(this.l, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
        this.k.startScan();
        this.m = cbi.i().b();
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.d.unregisterReceiver(this.l);
    }

    /* access modifiers changed from: protected */
    public final void j() {
        if (k() <= 0) {
            this.k.startScan();
            this.m = cbi.i().b();
        }
    }

    /* access modifiers changed from: protected */
    public final long k() {
        long j = this.m;
        if (j != 0) {
            return (j + 300000) - cbi.i().b();
        }
        return 0;
    }
}
