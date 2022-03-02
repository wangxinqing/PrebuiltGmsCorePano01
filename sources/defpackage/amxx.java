package defpackage;

import java.util.Comparator;
import java.util.Iterator;

/* renamed from: amxx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amxx {
    public static boolean a(Iterable iterable, Comparator comparator) {
        amrl.a((Object) comparator);
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }
}
