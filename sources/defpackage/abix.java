package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: abix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abix implements jsw {
    private final ImageView a;

    public abix(ImageView imageView) {
        this.a = imageView;
    }

    public final void a(amri amri) {
        ImageView imageView = this.a;
        if (amri.a()) {
            imageView.setVisibility(0);
            imageView.setImageBitmap((Bitmap) amri.b());
        }
    }
}
