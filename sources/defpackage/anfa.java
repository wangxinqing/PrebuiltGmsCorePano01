package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: anfa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class anfa extends AbstractCollection {
    final /* synthetic */ amwy a;

    anfa() {
    }

    public final void clear() {
        this.a.d();
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.a.b(entry.getKey(), entry.getValue());
    }

    public final Iterator iterator() {
        return this.a.i();
    }

    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.a.c(entry.getKey(), entry.getValue());
    }

    public final int size() {
        return this.a.c();
    }

    public anfa(amwy amwy) {
        this.a = amwy;
    }
}
