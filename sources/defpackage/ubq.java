package defpackage;

import java.util.Comparator;

/* renamed from: ubq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ubq implements Comparator {
    static final Comparator a = new ubq();

    private ubq() {
    }

    public final int compare(Object obj, Object obj2) {
        Long E = ((ttg) obj2).E();
        Long E2 = ((ttg) obj).E();
        if (E == null && E2 == null) {
            return 0;
        }
        if (E == null) {
            return -1;
        }
        if (E2 == null) {
            return 1;
        }
        return E.compareTo(E2);
    }
}
