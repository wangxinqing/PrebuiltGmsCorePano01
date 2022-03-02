package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* renamed from: kai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kai {
    static boolean a(Collection collection, Collection collection2) {
        return !Collections.disjoint(collection, collection2);
    }

    static boolean a(kbj kbj, kbd kbd) {
        Set o = kbj.o();
        if (a((Collection) o, (Collection) kbd.q())) {
            return true;
        }
        knc s = kbd.s();
        if (s == null || !o.contains(s)) {
            return false;
        }
        return true;
    }
}
