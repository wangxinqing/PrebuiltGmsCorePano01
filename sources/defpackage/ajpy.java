package defpackage;

import android.location.GpsStatus;

/* renamed from: ajpy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajpy implements GpsStatus.Listener {
    final /* synthetic */ ajpz a;

    public ajpy(ajpz ajpz) {
        this.a = ajpz;
    }

    public final void onGpsStatusChanged(int i) {
        if (i == 4) {
            try {
                ajpz ajpz = this.a;
                ajpz.d = ajpz.a.getGpsStatus(ajpz.d);
            } catch (NullPointerException e) {
                this.a.d = null;
            }
            ajpz ajpz2 = this.a;
            GpsStatus gpsStatus = ajpz2.d;
            if (gpsStatus != null) {
                ajpz2.a((ahyn) new ajpr(gpsStatus));
            }
        }
    }
}
