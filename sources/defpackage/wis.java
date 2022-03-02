package defpackage;

import android.graphics.Bitmap;
import android.os.Message;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: wis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wis extends qvr {
    private final WeakReference a;

    public wis(ImageView imageView) {
        this.a = new WeakReference(imageView);
    }

    public final void handleMessage(Message message) {
        ImageView imageView = (ImageView) this.a.get();
        if (imageView != null && message.what == 1) {
            imageView.setImageBitmap((Bitmap) message.obj);
        }
    }
}
