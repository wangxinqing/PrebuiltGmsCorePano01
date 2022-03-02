package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: audd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class audd implements Iterator {
    private final Iterator a;

    public audd(Iterator it) {
        this.a = it;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        return entry.getValue() instanceof aude ? new audc(entry) : entry;
    }

    public final void remove() {
        this.a.remove();
    }
}
