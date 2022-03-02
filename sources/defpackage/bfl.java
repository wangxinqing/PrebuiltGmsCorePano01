package defpackage;

import android.graphics.Bitmap;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bfl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bfl {
    public Bitmap a;
    public VolleyError b;
    public final List c;
    private final Request d;

    public bfl(Request request, ImageLoader.ImageContainer imageContainer) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = request;
        arrayList.add(imageContainer);
    }

    public final boolean a(ImageLoader.ImageContainer imageContainer) {
        this.c.remove(imageContainer);
        if (this.c.size() != 0) {
            return false;
        }
        this.d.cancel();
        return true;
    }
}
