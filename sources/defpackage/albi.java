package defpackage;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: albi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class albi implements rqs {
    final /* synthetic */ LatLngBounds a;
    final /* synthetic */ LatLng b;
    final /* synthetic */ CharSequence c;
    final /* synthetic */ albm d;

    public albi(albm albm, LatLngBounds latLngBounds, LatLng latLng, CharSequence charSequence) {
        this.d = albm;
        this.a = latLngBounds;
        this.b = latLng;
        this.c = charSequence;
    }

    public final void a(rqn rqn) {
        rqh rqh;
        if (this.d.c.getWidth() > 0) {
            rqh = rqi.a(this.a, this.d.c.getWidth(), this.d.c.getHeight());
        } else {
            rqh = rqi.a(this.b);
        }
        this.d.a(this.c, this.b, (Bitmap) null, 0.0f, 0.0f, rqh, rqn);
    }
}
