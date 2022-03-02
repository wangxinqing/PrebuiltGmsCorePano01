package defpackage;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;

/* renamed from: djn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class djn implements ImageLoader.ImageListener {
    final /* synthetic */ djj a;

    public djn(djj djj) {
        this.a = djj;
    }

    public final void onErrorResponse(VolleyError volleyError) {
    }

    public final void onResponse(ImageLoader.ImageContainer imageContainer, boolean z) {
        this.a.a(imageContainer.getBitmap(), z);
    }
}
