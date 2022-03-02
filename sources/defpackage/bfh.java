package defpackage;

import android.widget.ImageView;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;

/* renamed from: bfh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bfh implements ImageLoader.ImageListener {
    final /* synthetic */ int a;
    final /* synthetic */ ImageView b;
    final /* synthetic */ int c;

    public bfh(int i, ImageView imageView, int i2) {
        this.a = i;
        this.b = imageView;
        this.c = i2;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        int i = this.a;
        if (i != 0) {
            this.b.setImageResource(i);
        }
    }

    public final void onResponse(ImageLoader.ImageContainer imageContainer, boolean z) {
        if (imageContainer.getBitmap() != null) {
            this.b.setImageBitmap(imageContainer.getBitmap());
            return;
        }
        int i = this.c;
        if (i != 0) {
            this.b.setImageResource(i);
        }
    }
}
