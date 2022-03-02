package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: axd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axd {
    private static final Object d = new Object();
    public final Context a;
    public String b;
    public final Map c;

    public axd(Drawable.Callback callback, String str, Map map) {
        this.b = str;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.b;
            if (str2.charAt(str2.length() - 1) != '/') {
                this.b += '/';
            }
        }
        if (!(callback instanceof View)) {
            bay.a("LottieDrawable must be inside of a view for images to work.");
            this.c = new HashMap();
            this.a = null;
            return;
        }
        this.a = ((View) callback).getContext();
        this.c = map;
    }

    public final void a(String str, Bitmap bitmap) {
        synchronized (d) {
            ((avd) this.c.get(str)).e = bitmap;
        }
    }
}
