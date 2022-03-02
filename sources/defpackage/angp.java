package defpackage;

import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: angp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class angp {
    public static boolean a(Comparator comparator, Iterable iterable) {
        Object obj;
        amrl.a((Object) comparator);
        amrl.a((Object) iterable);
        if (iterable instanceof SortedSet) {
            obj = ((SortedSet) iterable).comparator();
            if (obj == null) {
                obj = anfh.a;
            }
        } else if (!(iterable instanceof ango)) {
            return false;
        } else {
            obj = ((ango) iterable).comparator();
        }
        return comparator.equals(obj);
    }
}
