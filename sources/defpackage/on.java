package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: on  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class on implements Collection {
    final /* synthetic */ oo a;

    public on(oo ooVar) {
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
        return this.a.b(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.a.a() == 0;
    }

    public final Iterator iterator() {
        return new oj(this.a, 1);
    }

    public final boolean remove(Object obj) {
        int b = this.a.b(obj);
        if (b < 0) {
            return false;
        }
        this.a.a(b);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        int a2 = this.a.a();
        int i = 0;
        boolean z = false;
        while (i < a2) {
            if (collection.contains(this.a.a(i, 1))) {
                this.a.a(i);
                i--;
                a2--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        int a2 = this.a.a();
        int i = 0;
        boolean z = false;
        while (i < a2) {
            if (!collection.contains(this.a.a(i, 1))) {
                this.a.a(i);
                i--;
                a2--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public final int size() {
        return this.a.a();
    }

    public final Object[] toArray() {
        return this.a.b(1);
    }

    public final Object[] toArray(Object[] objArr) {
        return this.a.a(objArr, 1);
    }
}
