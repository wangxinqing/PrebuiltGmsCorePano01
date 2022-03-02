package defpackage;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import java.util.List;

/* renamed from: bfk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bfk implements Runnable {
    final /* synthetic */ ImageLoader a;

    public bfk(ImageLoader imageLoader) {
        this.a = imageLoader;
    }

    public final void run() {
        for (bfl bfl : this.a.b.values()) {
            List list = bfl.c;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ImageLoader.ImageContainer imageContainer = (ImageLoader.ImageContainer) list.get(i);
                ImageLoader.ImageListener imageListener = imageContainer.b;
                if (imageListener != null) {
                    VolleyError volleyError = bfl.b;
                    if (volleyError == null) {
                        imageContainer.a = bfl.a;
                        imageListener.onResponse(imageContainer, false);
                    } else {
                        imageListener.onErrorResponse(volleyError);
                    }
                }
            }
        }
        this.a.b.clear();
        this.a.c = null;
    }
}
