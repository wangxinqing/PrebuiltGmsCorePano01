package defpackage;

import java.util.Collection;

/* renamed from: amxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amxi {
    public static Collection a(Collection collection, amrm amrm) {
        amrl.a((Object) collection);
        amrl.a((Object) amrm);
        return new amxh(collection, amrm);
    }

    static boolean a(Collection collection, Object obj) {
        amrl.a((Object) collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException e) {
            return false;
        }
    }

    static boolean a(Collection collection, Collection collection2) {
        for (Object contains : collection2) {
            if (!collection.contains(contains)) {
                return false;
            }
        }
        return true;
    }
}
