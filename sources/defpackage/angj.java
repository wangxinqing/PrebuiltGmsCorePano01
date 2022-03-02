package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Set;

/* renamed from: angj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class angj extends AbstractSet {
    public boolean removeAll(Collection collection) {
        return angm.a((Set) this, collection);
    }

    public boolean retainAll(Collection collection) {
        amrl.a((Object) collection);
        return super.retainAll(collection);
    }
}
