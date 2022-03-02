package defpackage;

import android.content.Context;
import android.util.Log;

/* renamed from: xdw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xdw {
    private static xdw c;
    public final Context a;
    public final yck b;

    private xdw(Context context) {
        this.a = context;
        this.b = yck.a(context);
    }

    public static String a(String str) {
        return ycc.a(ycc.a(str, ""));
    }

    public static synchronized xdw a(Context context) {
        xdw xdw;
        synchronized (xdw.class) {
            if (c == null) {
                c = new xdw(context);
            }
            xdw = c;
        }
        return xdw;
    }

    public final synchronized void a() {
        try {
            wss a2 = wss.a(this.a);
            int i = a2.a.getInt("saved_cover_photo_width_pixels", -1);
            int a3 = wsq.a(this.a);
            if (i != a3) {
                this.b.b();
                iva.b((String) null);
                a2.a.edit().putInt("saved_cover_photo_width_pixels", a3).commit();
            }
        } catch (Exception e) {
            Log.w("PeopleCPSM", "Failed to wipe cached files.", e);
            if (!hxz.a()) {
                throw e;
            }
        }
    }
}
