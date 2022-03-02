package defpackage;

/* renamed from: baf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baf {
    private static final bar a = bar.a("nm", "p", "s", "r", "hd");

    static ayj a(bat bat, auk auk) {
        String str = null;
        axz axz = null;
        axs axs = null;
        axo axo = null;
        boolean z = false;
        while (bat.e()) {
            int a2 = bat.a(a);
            if (a2 == 0) {
                str = bat.h();
            } else if (a2 == 1) {
                axz = azh.b(bat, auk);
            } else if (a2 == 2) {
                axs = azk.c(bat, auk);
            } else if (a2 == 3) {
                axo = azk.a(bat, auk);
            } else if (a2 != 4) {
                bat.l();
            } else {
                z = bat.i();
            }
        }
        return new ayj(str, axz, axs, axo, z);
    }
}
