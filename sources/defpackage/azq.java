package defpackage;

import java.util.ArrayList;

/* renamed from: azq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class azq {
    private static final bar a = bar.a("ch", "size", "w", "style", "fFamily", "data");
    private static final bar b = bar.a("shapes");

    static axh a(bat bat, auk auk) {
        ArrayList arrayList = new ArrayList();
        bat.c();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        char c = 0;
        while (bat.e()) {
            int a2 = bat.a(a);
            if (a2 == 0) {
                c = bat.h().charAt(0);
            } else if (a2 == 1) {
                bat.j();
            } else if (a2 == 2) {
                d = bat.j();
            } else if (a2 == 3) {
                str = bat.h();
            } else if (a2 == 4) {
                str2 = bat.h();
            } else if (a2 != 5) {
                bat.g();
                bat.l();
            } else {
                bat.c();
                while (bat.e()) {
                    if (bat.a(b) != 0) {
                        bat.g();
                        bat.l();
                    } else {
                        bat.a();
                        while (bat.e()) {
                            arrayList.add((ayn) azn.a(bat, auk));
                        }
                        bat.b();
                    }
                }
                bat.d();
            }
        }
        bat.d();
        return new axh(arrayList, c, d, str, str2);
    }
}
