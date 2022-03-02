package defpackage;

/* renamed from: ban  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ban {
    private static final bar a = bar.a("s", "e", "o", "nm", "m", "hd");

    static ays a(bat bat, auk auk) {
        axo axo = null;
        axo axo2 = null;
        axo axo3 = null;
        int i = 0;
        boolean z = false;
        while (bat.e()) {
            int a2 = bat.a(a);
            if (a2 == 0) {
                axo = azk.a(bat, auk, false);
            } else if (a2 == 1) {
                axo2 = azk.a(bat, auk, false);
            } else if (a2 == 2) {
                axo3 = azk.a(bat, auk, false);
            } else if (a2 == 3) {
                bat.h();
            } else if (a2 == 4) {
                int k = bat.k();
                if (k == 1) {
                    i = 1;
                } else if (k == 2) {
                    i = 2;
                } else {
                    throw new IllegalArgumentException("Unknown trim path type " + k);
                }
            } else if (a2 != 5) {
                bat.l();
            } else {
                z = bat.i();
            }
        }
        return new ays(i, axo, axo2, axo3, z);
    }
}
