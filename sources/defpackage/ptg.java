package defpackage;

import android.content.Context;

/* renamed from: ptg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ptg {
    private static final Object a = new Object();
    private static volatile ptg b;
    private final ahei c;

    private ptg(Context context) {
        agzs agzs = new agzs(amzy.a((Object) new aham()));
        ahej ahej = new ahej();
        ahej.a = jfm.a(10);
        ahej.b = agzs;
        ahej.a(ahdx.a);
        long r = axrp.a.a().r();
        if (r != 0) {
            ahgm a2 = ahgn.a(context);
            ahgf a3 = ahgg.a(context);
            a3.b = jfm.b(10);
            a3.c = afjn.a((aekn) new aekp(), a2.a(), (int) r);
            ahej.a(a3.a(), a2);
        }
        this.c = ahej.a();
    }

    public static ahei a(Context context) {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new ptg(context.getApplicationContext());
                }
            }
        }
        return b.c;
    }
}
