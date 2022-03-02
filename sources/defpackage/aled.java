package defpackage;

import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: aled  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aled implements Runnable {
    final /* synthetic */ LatLngBounds a;
    final /* synthetic */ alee b;

    public aled(alee alee, LatLngBounds latLngBounds) {
        this.b = alee;
        this.a = latLngBounds;
    }

    public final void run() {
        alee alee = this.b;
        if (alee.d != null && alee.c.getWidth() > 0) {
            alee alee2 = this.b;
            alee2.d.a(rqi.a(this.a, alee2.c.getWidth(), this.b.c.getHeight()));
            return;
        }
        this.b.d.a(rqi.a(this.a.a()));
    }
}
