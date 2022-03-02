package defpackage;

/* renamed from: azl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class azl {
    private static final bar a = bar.a("nm", "p", "s", "hd", "d");

    static ayb a(bat bat, auk auk, int i) {
        boolean z;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        String str = null;
        axz axz = null;
        axs axs = null;
        boolean z3 = false;
        while (bat.e()) {
            int a2 = bat.a(a);
            if (a2 == 0) {
                str = bat.h();
            } else if (a2 == 1) {
                axz = azh.b(bat, auk);
            } else if (a2 == 2) {
                axs = azk.c(bat, auk);
            } else if (a2 == 3) {
                z3 = bat.i();
            } else if (a2 != 4) {
                bat.g();
                bat.l();
            } else {
                z2 = bat.k() == 3;
            }
        }
        return new ayb(str, axz, axs, z2, z3);
    }
}
