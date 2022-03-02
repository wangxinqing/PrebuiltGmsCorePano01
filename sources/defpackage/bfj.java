package defpackage;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;

/* renamed from: bfj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bfj implements Response.ErrorListener {
    final /* synthetic */ String a;
    final /* synthetic */ ImageLoader b;

    public bfj(ImageLoader imageLoader, String str) {
        this.b = imageLoader;
        this.a = str;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.b.onGetImageError(this.a, volleyError);
    }
}
