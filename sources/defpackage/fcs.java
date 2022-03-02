package defpackage;

import android.graphics.Bitmap;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;

/* renamed from: fcs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fcs implements ImageLoader.ImageListener {
    final /* synthetic */ agcl a;

    public fcs(agcl agcl) {
        this.a = agcl;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.a.a((Bitmap) null);
    }

    public final void onResponse(ImageLoader.ImageContainer imageContainer, boolean z) {
        if (imageContainer.getBitmap() != null) {
            this.a.a(imageContainer.getBitmap());
        }
    }
}
