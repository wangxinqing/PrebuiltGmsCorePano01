package defpackage;

import android.content.Context;

/* renamed from: qve  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qve {
    public static final ahei a;

    static {
        aoru a2 = jfm.a(10);
        ihs b = ihs.b();
        agzw a3 = agzx.a((Context) b);
        a3.c = qvc.a;
        if (axay.a.a().b()) {
            a3.b = qvb.a;
        }
        agzs agzs = new agzs(amzy.a((Object) a3.a()));
        ahej ahej = new ahej();
        ahej.a = a2;
        ahej.b = agzs;
        ahej.a(ahfi.a);
        ahej.a(ahdx.a);
        ahej.a(ahex.a);
        int a4 = (int) axay.a.a().a();
        if (a4 > 0) {
            ahgm a5 = ahgn.a(b);
            ahgf a6 = ahgg.a((Context) b);
            a6.b = jfm.b(10);
            a6.c = afjn.a((aekn) new aekp(), a5.a(), a4);
            a6.a.a(avsd.UNMETERED_OR_DAILY);
            ahej.a(a6.a(), a5);
        }
        a = ahej.a();
    }
}
