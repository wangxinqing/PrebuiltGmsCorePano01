package defpackage;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: axc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axc {
    public final axm a = new axm();
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public final AssetManager d;
    public final String e = ".ttf";

    public axc(Drawable.Callback callback) {
        if (!(callback instanceof View)) {
            bay.a("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
            return;
        }
        this.d = ((View) callback).getContext().getAssets();
    }
}
