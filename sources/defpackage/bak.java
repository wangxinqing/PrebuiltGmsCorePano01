package defpackage;

import java.util.ArrayList;

/* renamed from: bak  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bak {
    private static final bar a = bar.a("nm", "hd", "it");

    static ayn a(bat bat, auk auk) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (bat.e()) {
            int a2 = bat.a(a);
            if (a2 == 0) {
                str = bat.h();
            } else if (a2 == 1) {
                z = bat.i();
            } else if (a2 != 2) {
                bat.l();
            } else {
                bat.a();
                while (bat.e()) {
                    ayc a3 = azn.a(bat, auk);
                    if (a3 != null) {
                        arrayList.add(a3);
                    }
                }
                bat.b();
            }
        }
        return new ayn(str, arrayList, z);
    }
}
