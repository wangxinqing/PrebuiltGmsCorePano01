package defpackage;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: albh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class albh implements rqs {
    final /* synthetic */ LatLngBounds a;
    final /* synthetic */ LatLng b;
    final /* synthetic */ CharSequence c;
    final /* synthetic */ Bitmap d;
    final /* synthetic */ float e;
    final /* synthetic */ float f;
    final /* synthetic */ albm g;

    public albh(albm albm, LatLngBounds latLngBounds, LatLng latLng, CharSequence charSequence, Bitmap bitmap, float f2, float f3) {
        this.g = albm;
        this.a = latLngBounds;
        this.b = latLng;
        this.c = charSequence;
        this.d = bitmap;
        this.e = f2;
        this.f = f3;
    }

    public final void a(rqn rqn) {
        rqh rqh;
        if (this.g.c.getWidth() > 0) {
            rqh = rqi.a(this.a, this.g.c.getWidth(), this.g.c.getHeight());
        } else {
            try {
                rqh = new rqh(rqi.a().a(this.b));
            } catch (RemoteException e2) {
                throw new rvl(e2);
            }
        }
        this.g.a(this.c, this.b, this.d, this.e, this.f, rqh, rqn);
    }
}
