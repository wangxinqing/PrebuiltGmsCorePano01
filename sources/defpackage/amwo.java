package defpackage;

import java.util.Collection;
import java.util.Set;

/* renamed from: amwo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amwo extends amwk implements Set {
    final /* synthetic */ amwq f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amwo(amwq amwq, Object obj, Set set) {
        super(amwq, obj, set, (amwk) null);
        this.f = amwq;
    }

    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean a = angm.a((Set) this.b, collection);
        if (a) {
            amwq.a(this.f, this.b.size() - size);
            b();
        }
        return a;
    }
}
