package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: angx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class angx extends angw implements List {
    private static final long serialVersionUID = 0;

    public final void add(int i, Object obj) {
        synchronized (this.g) {
            a().add(i, obj);
        }
    }

    public final boolean addAll(int i, Collection collection) {
        boolean addAll;
        synchronized (this.g) {
            addAll = a().addAll(i, collection);
        }
        return addAll;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final List a() {
        return (List) super.a();
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            equals = a().equals(obj);
        }
        return equals;
    }

    public final Object get(int i) {
        Object obj;
        synchronized (this.g) {
            obj = a().get(i);
        }
        return obj;
    }

    public final int hashCode() {
        int hashCode;
        synchronized (this.g) {
            hashCode = a().hashCode();
        }
        return hashCode;
    }

    public final int indexOf(Object obj) {
        int indexOf;
        synchronized (this.g) {
            indexOf = a().indexOf(obj);
        }
        return indexOf;
    }

    public final int lastIndexOf(Object obj) {
        int lastIndexOf;
        synchronized (this.g) {
            lastIndexOf = a().lastIndexOf(obj);
        }
        return lastIndexOf;
    }

    public final ListIterator listIterator() {
        return a().listIterator();
    }

    public final Object remove(int i) {
        Object remove;
        synchronized (this.g) {
            remove = a().remove(i);
        }
        return remove;
    }

    public final Object set(int i, Object obj) {
        Object obj2;
        synchronized (this.g) {
            obj2 = a().set(i, obj);
        }
        return obj2;
    }

    public final List subList(int i, int i2) {
        List a;
        synchronized (this.g) {
            a = anhf.a(a().subList(i, i2), this.g);
        }
        return a;
    }

    public angx(List list, Object obj) {
        super(list, obj);
    }

    public final ListIterator listIterator(int i) {
        return a().listIterator(i);
    }
}
