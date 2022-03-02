package defpackage;

/* renamed from: bab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bab {
    private static final bar a = bar.a("nm", "mm", "hd");

    static ayh a(bat bat) {
        int i = 0;
        boolean z = false;
        while (bat.e()) {
            int a2 = bat.a(a);
            if (a2 == 0) {
                bat.h();
            } else if (a2 == 1) {
                int k = bat.k();
                if (k != 1) {
                    if (k == 2) {
                        i = 2;
                    } else if (k == 3) {
                        i = 3;
                    } else if (k == 4) {
                        i = 4;
                    } else if (k == 5) {
                        i = 5;
                    }
                }
                i = 1;
            } else if (a2 != 2) {
                bat.g();
                bat.l();
            } else {
                z = bat.i();
            }
        }
        return new ayh(i, z);
    }
}
