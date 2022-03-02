package defpackage;

import android.util.Pair;
import java.util.Comparator;

/* renamed from: xps  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class xps implements Comparator {
    static final Comparator a = new xps();

    private xps() {
    }

    public final int compare(Object obj, Object obj2) {
        int compareToIgnoreCase;
        Pair pair = (Pair) obj;
        Pair pair2 = (Pair) obj2;
        if (pair.first != null && pair2.first != null && (compareToIgnoreCase = ((String) pair.first).compareToIgnoreCase((String) pair2.first)) != 0) {
            return compareToIgnoreCase;
        }
        if (pair.first != null) {
            return 1;
        }
        if (pair2.first != null) {
            return -1;
        }
        return ((Integer) pair.second).intValue() - ((Integer) pair2.second).intValue();
    }
}
