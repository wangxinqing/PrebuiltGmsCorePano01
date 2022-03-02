package defpackage;

import android.content.Context;

/* renamed from: mcg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mcg {
    private static mcg c;
    public final mcf a;
    private final Context b;

    private mcg(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.a = new mcf(this.b, new mcd(new iyn(applicationContext, awhr.g(), awhr.f(), awhr.d(), awhr.h(), awhr.c(), awhr.e(), "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk", (byte[]) null)));
    }

    public static synchronized mcg a(Context context) {
        mcg mcg;
        synchronized (mcg.class) {
            if (c == null) {
                c = new mcg(context);
            }
            mcg = c;
        }
        return mcg;
    }
}
