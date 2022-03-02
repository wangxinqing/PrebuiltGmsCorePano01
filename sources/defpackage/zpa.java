package defpackage;

import android.content.Context;

/* renamed from: zpa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zpa {
    private static volatile zpa b;
    public final ahei a;

    private zpa(Context context) {
        ahej ahej = new ahej();
        ahej.a = jfm.a(10);
        ahej.b = new agzs(amzy.a((Object) agzx.a(context).a()));
        ahej.a(ahfi.a);
        this.a = ahej.a();
    }

    public static synchronized zpa a(Context context) {
        zpa zpa;
        synchronized (zpa.class) {
            if (b == null) {
                b = new zpa(context.getApplicationContext());
            }
            zpa = b;
        }
        return zpa;
    }
}
