package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: amwm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class amwm extends amwk implements List {
    final /* synthetic */ amwq f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amwm(amwq amwq, Object obj, List list, amwk amwk) {
        super(amwq, obj, list, amwk);
        this.f = amwq;
    }

    public final void add(int i, Object obj) {
        a();
        boolean isEmpty = this.b.isEmpty();
        d().add(i, obj);
        amwq.a(this.f);
        if (isEmpty) {
            c();
        }
    }

    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = d().addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        amwq.a(this.f, this.b.size() - size);
        if (size != 0) {
            return addAll;
        }
        c();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final List d() {
        return (List) this.b;
    }

    public final Object get(int i) {
        a();
        return d().get(i);
    }

    public final int indexOf(Object obj) {
        a();
        return d().indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        a();
        return d().lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        a();
        return new amwl(this);
    }

    public final Object remove(int i) {
        a();
        Object remove = d().remove(i);
        amwq.b(this.f);
        b();
        return remove;
    }

    public final Object set(int i, Object obj) {
        a();
        return d().set(i, obj);
    }

    public final List subList(int i, int i2) {
        a();
        amwq amwq = this.f;
        Object obj = this.a;
        List subList = d().subList(i, i2);
        amwk amwk = this.c;
        if (amwk == null) {
            amwk = this;
        }
        return amwq.a(obj, subList, amwk);
    }

    public final ListIterator listIterator(int i) {
        a();
        return new amwl(this, i);
    }
}
