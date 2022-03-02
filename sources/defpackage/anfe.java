package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: anfe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anfe extends angj {
    final /* synthetic */ amwz a;

    public anfe() {
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        return this.a.containsAll(collection);
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        return this.a.a();
    }

    public final boolean remove(Object obj) {
        return this.a.a(obj, Integer.MAX_VALUE) > 0;
    }

    public final int size() {
        return this.a.e().size();
    }

    public anfe(amwz amwz) {
        this.a = amwz;
    }
}
