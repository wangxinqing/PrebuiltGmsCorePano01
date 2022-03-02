package defpackage;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: albg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class albg implements rqs {
    final /* synthetic */ LatLng a;
    final /* synthetic */ CharSequence b;
    final /* synthetic */ albm c;

    public albg(albm albm, LatLng latLng, CharSequence charSequence) {
        this.c = albm;
        this.a = latLng;
        this.b = charSequence;
    }

    public final void a(rqn rqn) {
        this.c.a(this.b, this.a, (Bitmap) null, 0.0f, 0.0f, rqi.a(this.a), rqn);
    }
}
