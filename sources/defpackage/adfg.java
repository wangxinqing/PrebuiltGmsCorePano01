package defpackage;

import android.graphics.Bitmap;
import com.android.volley.toolbox.ImageLoader;

/* renamed from: adfg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adfg extends iqj implements ImageLoader.ImageCache {
    public adfg(int i) {
        super(i);
    }

    public final Bitmap getBitmap(String str) {
        return (Bitmap) a((Object) str);
    }

    public final void putBitmap(String str, Bitmap bitmap) {
        a((Object) str, (Object) bitmap);
    }
}
