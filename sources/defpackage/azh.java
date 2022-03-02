package defpackage;

import java.util.ArrayList;

/* renamed from: azh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azh {
    private static final bar a = bar.a("k", "x", "y");

    public static axr a(bat bat, auk auk) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (bat.n() == 1) {
            bat.a();
            while (bat.e()) {
                if (bat.n() == 3) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new awt(auk, azx.a(bat, auk, bbb.a(), bac.a, z)));
            }
            bat.b();
            azy.a(arrayList);
        } else {
            arrayList.add(new bbc(azw.b(bat, bbb.a())));
        }
        return new axr(arrayList);
    }

    static axz b(bat bat, auk auk) {
        bat.c();
        axr axr = null;
        axo axo = null;
        axo axo2 = null;
        boolean z = false;
        while (bat.n() != 4) {
            int a2 = bat.a(a);
            if (a2 == 0) {
                axr = a(bat, auk);
            } else if (a2 != 1) {
                if (a2 != 2) {
                    bat.g();
                    bat.l();
                } else if (bat.n() == 6) {
                    bat.l();
                    z = true;
                } else {
                    axo2 = azk.a(bat, auk);
                }
            } else if (bat.n() == 6) {
                bat.l();
                z = true;
            } else {
                axo = azk.a(bat, auk);
            }
        }
        bat.d();
        if (z) {
            auk.a("Lottie doesn't support expressions.");
        }
        return axr == null ? new axv(axo, axo2) : axr;
    }
}
