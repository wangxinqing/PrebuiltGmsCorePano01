package defpackage;

import com.android.volley.toolbox.ImageLoader;

/* renamed from: mgd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mgd {
    private static ImageLoader a;

    public static ImageLoader a() {
        if (a == null) {
            a = new ImageLoader(ihs.b().getRequestQueue(), new mgc(Math.min(1048576, (int) (Runtime.getRuntime().maxMemory() / 8))));
        }
        return a;
    }
}
