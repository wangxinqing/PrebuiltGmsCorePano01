package defpackage;

import android.location.GnssStatus;

/* renamed from: ajqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajqb extends GnssStatus.Callback {
    final /* synthetic */ ajqc a;

    public ajqb(ajqc ajqc) {
        this.a = ajqc;
    }

    public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
        this.a.a((ahyn) new ahyh(gnssStatus));
    }
}
