package defpackage;

import android.graphics.Bitmap;
import com.android.volley.Response;
import com.android.volley.toolbox.ImageLoader;

/* renamed from: bfi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bfi implements Response.Listener {
    final /* synthetic */ String a;
    final /* synthetic */ ImageLoader b;

    public bfi(ImageLoader imageLoader, String str) {
        this.b = imageLoader;
        this.a = str;
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        this.b.onGetImageSuccess(this.a, (Bitmap) obj);
    }
}
