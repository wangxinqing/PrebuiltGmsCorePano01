package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: amyn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class amyn extends amys implements Collection {
    protected amyn() {
    }

    public boolean add(Object obj) {
        return b().add(obj);
    }

    public boolean addAll(Collection collection) {
        return b().addAll(collection);
    }

    /* access modifiers changed from: protected */
    public abstract Collection b();

    public final void clear() {
        b().clear();
    }

    public boolean contains(Object obj) {
        return b().contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        return b().containsAll(collection);
    }

    public final boolean isEmpty() {
        return b().isEmpty();
    }

    public final Iterator iterator() {
        return b().iterator();
    }

    public boolean remove(Object obj) {
        return b().remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        return b().removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        return b().retainAll(collection);
    }

    public final int size() {
        return b().size();
    }

    public final Object[] toArray() {
        return b().toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        return b().toArray(objArr);
    }
}
