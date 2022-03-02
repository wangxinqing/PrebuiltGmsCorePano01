package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: ol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ol implements Set {
    final /* synthetic */ oo a;

    public ol(oo ooVar) {
        this.a = ooVar;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.a.c();
    }

    public final boolean contains(Object obj) {
        return this.a.a(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        Map b = this.a.b();
        for (Object containsKey : collection) {
            if (!b.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return oo.a((Set) this, obj);
    }

    public final int hashCode() {
        int i = 0;
        for (int a2 = this.a.a() - 1; a2 >= 0; a2--) {
            Object a3 = this.a.a(a2, 0);
            i += a3 != null ? a3.hashCode() : 0;
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.a.a() == 0;
    }

    public final Iterator iterator() {
        return new oj(this.a, 0);
    }

    public final boolean remove(Object obj) {
        int a2 = this.a.a(obj);
        if (a2 < 0) {
            return false;
        }
        this.a.a(a2);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        return oo.a(this.a.b(), collection);
    }

    public final boolean retainAll(Collection collection) {
        return oo.b(this.a.b(), collection);
    }

    public final int size() {
        return this.a.a();
    }

    public final Object[] toArray() {
        return this.a.b(0);
    }

    public final Object[] toArray(Object[] objArr) {
        return this.a.a(objArr, 0);
    }
}
