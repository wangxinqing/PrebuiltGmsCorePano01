package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: amyp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class amyp extends amyn implements List {
    protected amyp() {
    }

    /* access modifiers changed from: protected */
    public abstract List a();

    public final void add(int i, Object obj) {
        a().add(i, obj);
    }

    public final boolean addAll(int i, Collection collection) {
        return a().addAll(i, collection);
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ Collection b() {
        throw null;
    }

    public boolean equals(Object obj) {
        return obj == this || a().equals(obj);
    }

    public final Object get(int i) {
        return a().get(i);
    }

    public int hashCode() {
        return a().hashCode();
    }

    public final int indexOf(Object obj) {
        return a().indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        return a().lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        return a().listIterator();
    }

    public final Object remove(int i) {
        return a().remove(i);
    }

    public final Object set(int i, Object obj) {
        return a().set(i, obj);
    }

    public final List subList(int i, int i2) {
        return a().subList(i, i2);
    }

    public final ListIterator listIterator(int i) {
        return a().listIterator(i);
    }
}
