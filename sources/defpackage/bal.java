package defpackage;

/* renamed from: bal  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bal {
    static final bar a = bar.a("nm", "ind", "ks", "hd");

    static ayo a(bat bat, auk auk) {
        int i = 0;
        String str = null;
        axu axu = null;
        boolean z = false;
        while (bat.e()) {
            int a2 = bat.a(a);
            if (a2 == 0) {
                str = bat.h();
            } else if (a2 == 1) {
                i = bat.k();
            } else if (a2 == 2) {
                axu = azk.d(bat, auk);
            } else if (a2 != 3) {
                bat.l();
            } else {
                z = bat.i();
            }
        }
        return new ayo(str, i, axu, z);
    }
}
