package defpackage;

import android.graphics.Path;

/* renamed from: baj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baj {
    private static final bar a = bar.a("nm", "c", "o", "fillEnabled", "r", "hd");

    static aym a(bat bat, auk auk) {
        String str = null;
        axn axn = null;
        axq axq = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (bat.e()) {
            int a2 = bat.a(a);
            if (a2 == 0) {
                str = bat.h();
            } else if (a2 == 1) {
                axn = azk.e(bat, auk);
            } else if (a2 == 2) {
                axq = azk.b(bat, auk);
            } else if (a2 == 3) {
                z = bat.i();
            } else if (a2 == 4) {
                i = bat.k();
            } else if (a2 != 5) {
                bat.g();
                bat.l();
            } else {
                z2 = bat.i();
            }
        }
        return new aym(str, z, i != 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING, axn, axq, z2);
    }
}
