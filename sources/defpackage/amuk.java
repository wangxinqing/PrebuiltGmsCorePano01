package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

/* renamed from: amuk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amuk extends amtu {
    final /* synthetic */ amvo b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amuk(amvo amvo, ConcurrentMap concurrentMap) {
        super(concurrentMap);
        this.b = amvo;
    }

    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    public final Iterator iterator() {
        return new amuj(this.b);
    }

    public final boolean remove(Object obj) {
        return this.a.remove(obj) != null;
    }
}
