package defpackage;

import android.graphics.Bitmap;
import com.android.volley.toolbox.ImageLoader;

/* renamed from: iqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class iqj extends oi implements ImageLoader.ImageCache {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ int b(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    public Bitmap getBitmap(String str) {
        return (Bitmap) a((Object) str);
    }

    public void putBitmap(String str, Bitmap bitmap) {
        a((Object) str, (Object) bitmap);
    }

    public iqj() {
        super(3145728);
    }

    public iqj(int i) {
        super(i);
    }
}
