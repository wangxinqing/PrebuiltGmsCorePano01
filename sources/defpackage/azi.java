package defpackage;

/* renamed from: azi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azi {
    private static final bar a = bar.a("a");
    private static final bar b = bar.a("fc", "sc", "sw", "t");

    public static axx a(bat bat, auk auk) {
        bat.c();
        axx axx = null;
        while (bat.e()) {
            if (bat.a(a) != 0) {
                bat.g();
                bat.l();
            } else {
                bat.c();
                axn axn = null;
                axn axn2 = null;
                axo axo = null;
                axo axo2 = null;
                while (bat.e()) {
                    int a2 = bat.a(b);
                    if (a2 == 0) {
                        axn = azk.e(bat, auk);
                    } else if (a2 == 1) {
                        axn2 = azk.e(bat, auk);
                    } else if (a2 == 2) {
                        axo = azk.a(bat, auk);
                    } else if (a2 != 3) {
                        bat.g();
                        bat.l();
                    } else {
                        axo2 = azk.a(bat, auk);
                    }
                }
                bat.d();
                axx = new axx(axn, axn2, axo, axo2);
            }
        }
        bat.d();
        return axx == null ? new axx((axn) null, (axn) null, (axo) null, (axo) null) : axx;
    }
}
