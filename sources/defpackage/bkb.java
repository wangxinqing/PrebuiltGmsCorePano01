package defpackage;

import java.util.Comparator;

/* renamed from: bkb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class bkb implements Comparator {
    static final Comparator a = new bkb();

    private bkb() {
    }

    public final int compare(Object obj, Object obj2) {
        bnm bnm = (bnm) obj;
        bnm bnm2 = (bnm) obj2;
        if (bnm == bnm2) {
            return 0;
        }
        int a2 = bnj.a(bnm.b);
        int i = 1;
        if (a2 == 0) {
            a2 = 1;
        }
        int i2 = a2 - 1;
        int a3 = bnj.a(bnm2.b);
        if (a3 != 0) {
            i = a3;
        }
        int i3 = i2 - (i - 1);
        if (i3 != 0) {
            return i3;
        }
        int compareTo = bnm.c.compareTo(bnm2.c);
        if (compareTo != 0) {
            return compareTo;
        }
        return 0;
    }
}
