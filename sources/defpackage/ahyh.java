package defpackage;

import android.location.GnssStatus;
import android.os.SystemClock;

/* renamed from: ahyh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahyh implements ahyn {
    private final GnssStatus a;

    public ahyh(GnssStatus gnssStatus) {
        SystemClock.elapsedRealtimeNanos();
        this.a = gnssStatus;
    }

    public final int a() {
        return this.a.getSatelliteCount();
    }

    public final int b(int i) {
        return this.a.getSvid(i);
    }

    public final float c(int i) {
        return this.a.getCn0DbHz(i);
    }

    public final boolean d(int i) {
        return this.a.usedInFix(i);
    }

    public final float e(int i) {
        return this.a.getCarrierFrequencyHz(i);
    }

    public final int a(int i) {
        return this.a.getConstellationType(i);
    }
}
