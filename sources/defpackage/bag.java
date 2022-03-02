package defpackage;

/* renamed from: bag  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bag {
    private static final bar a = bar.a("nm", "c", "o", "tr", "hd");

    static ayk a(bat bat, auk auk) {
        String str = null;
        axo axo = null;
        axo axo2 = null;
        axy axy = null;
        boolean z = false;
        while (bat.e()) {
            int a2 = bat.a(a);
            if (a2 == 0) {
                str = bat.h();
            } else if (a2 == 1) {
                axo = azk.a(bat, auk, false);
            } else if (a2 == 2) {
                axo2 = azk.a(bat, auk, false);
            } else if (a2 == 3) {
                axy = azj.a(bat, auk);
            } else if (a2 != 4) {
                bat.l();
            } else {
                z = bat.i();
            }
        }
        return new ayk(str, axo, axo2, axy, z);
    }
}
