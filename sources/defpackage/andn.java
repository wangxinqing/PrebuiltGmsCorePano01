package defpackage;

import java.util.Iterator;

/* renamed from: andn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class andn extends ando {
    final /* synthetic */ anej a;

    public andn(anej anej) {
        this.a = anej;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        return new andm(this.a);
    }

    public final boolean remove(Object obj) {
        return this.a.remove(obj) != null;
    }

    public final int size() {
        return this.a.size();
    }
}
