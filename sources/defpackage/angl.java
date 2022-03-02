package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: angl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class angl extends amyv implements NavigableSet, Serializable {
    private static final long serialVersionUID = 0;
    private final NavigableSet a;
    private final SortedSet b;
    private transient angl c;

    public angl(NavigableSet navigableSet) {
        amrl.a((Object) navigableSet);
        this.a = navigableSet;
        this.b = Collections.unmodifiableSortedSet(navigableSet);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Set a() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Collection b() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object c() {
        return this.b;
    }

    public final Object ceiling(Object obj) {
        return this.a.ceiling(obj);
    }

    public final Iterator descendingIterator() {
        return ance.a(this.a.descendingIterator());
    }

    public final NavigableSet descendingSet() {
        angl angl = this.c;
        if (angl != null) {
            return angl;
        }
        angl angl2 = new angl(this.a.descendingSet());
        this.c = angl2;
        angl2.c = this;
        return angl2;
    }

    /* access modifiers changed from: protected */
    public final SortedSet e() {
        return this.b;
    }

    public final Object floor(Object obj) {
        return this.a.floor(obj);
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return angm.a(this.a.headSet(obj, z));
    }

    public final Object higher(Object obj) {
        return this.a.higher(obj);
    }

    public final Object lower(Object obj) {
        return this.a.lower(obj);
    }

    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return angm.a(this.a.subSet(obj, z, obj2, z2));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return angm.a(this.a.tailSet(obj, z));
    }
}
