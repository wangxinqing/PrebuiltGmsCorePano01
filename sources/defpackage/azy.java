package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: azy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class azy {
    static final bar a = bar.a("k");

    static List a(bat bat, auk auk, float f, bao bao) {
        ArrayList arrayList = new ArrayList();
        if (bat.n() == 6) {
            auk.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        bat.c();
        while (bat.e()) {
            if (bat.a(a) != 0) {
                bat.l();
            } else if (bat.n() == 1) {
                bat.a();
                if (bat.n() != 7) {
                    while (bat.e()) {
                        arrayList.add(azx.a(bat, auk, f, bao, true));
                    }
                } else {
                    arrayList.add(azx.a(bat, auk, f, bao, false));
                }
                bat.b();
            } else {
                arrayList.add(azx.a(bat, auk, f, bao, false));
            }
        }
        bat.d();
        a(arrayList);
        return arrayList;
    }

    public static void a(List list) {
        int i;
        Object obj;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            bbc bbc = (bbc) list.get(i2);
            i2++;
            bbc bbc2 = (bbc) list.get(i2);
            bbc.f = Float.valueOf(bbc2.e);
            if (bbc.c == null && (obj = bbc2.b) != null) {
                bbc.c = obj;
                if (bbc instanceof awt) {
                    ((awt) bbc).a();
                }
            }
        }
        bbc bbc3 = (bbc) list.get(i);
        if ((bbc3.b == null || bbc3.c == null) && list.size() > 1) {
            list.remove(bbc3);
        }
    }
}
