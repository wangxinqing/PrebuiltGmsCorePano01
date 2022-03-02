package defpackage;

import android.graphics.Bitmap;
import com.android.volley.toolbox.ImageLoader;

/* renamed from: djm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class djm implements ImageLoader.ImageCache {
    final /* synthetic */ djr a;

    public djm(djr djr) {
        this.a = djr;
    }

    public final Bitmap getBitmap(String str) {
        return (Bitmap) this.a.a.a((Object) str);
    }

    public final void putBitmap(String str, Bitmap bitmap) {
        this.a.a.a((Object) str, (Object) bitmap);
    }
}
