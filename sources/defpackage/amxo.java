package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: amxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amxo extends AbstractSet {
    final /* synthetic */ amxr a;

    public amxo(amxr amxr) {
        this.a = amxr;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    public final Iterator iterator() {
        amxr amxr = this.a;
        Map d = amxr.d();
        if (d != null) {
            return d.keySet().iterator();
        }
        return new amxj(amxr);
    }

    public final boolean remove(Object obj) {
        Map d = this.a.d();
        if (d != null) {
            return d.keySet().remove(obj);
        }
        return this.a.b(obj) != amxr.a;
    }

    public final int size() {
        return this.a.size();
    }
}
