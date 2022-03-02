package defpackage;

import android.hardware.SensorEvent;
import android.os.SystemClock;
import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

/* renamed from: ahse  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahse extends ahuo {
    public final TelephonyManager a;
    public volatile int b = -9999;
    private final PhoneStateListener c = new ahsc(this);
    private final Runnable d = new ahsd(this);

    public ahse(TelephonyManager telephonyManager, ahsr ahsr, ahss ahss, ajrh ajrh) {
        super(ahsr, ahss, ajrh);
        amrl.a((Object) telephonyManager);
        this.a = telephonyManager;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.h.postDelayed(this.d, 500);
        this.a.listen(this.c, 273);
        ahss ahss = this.i;
        if (ahss != null) {
            ahss.c();
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.a.listen(this.c, 0);
        this.h.removeCallbacks(this.d);
        ahss ahss = this.i;
        if (ahss != null) {
            ahss.b();
        }
    }

    public final void a(CellLocation cellLocation) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ahsr ahsr = this.h;
        ahsr.post(new ahsk(ahsr, this.a.getNetworkType(), this.a.getNetworkOperator(), cellLocation, this.b, elapsedRealtime));
        a(ahup.CELL, elapsedRealtime, (SensorEvent) null);
    }
}
