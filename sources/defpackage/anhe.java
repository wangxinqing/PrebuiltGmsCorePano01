package defpackage;

import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: anhe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anhe extends anhd implements SortedSet {
    private static final long serialVersionUID = 0;

    public anhe(SortedSet sortedSet, Object obj) {
        super(sortedSet, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final SortedSet b() {
        return (SortedSet) super.a();
    }

    public final Comparator comparator() {
        Comparator comparator;
        synchronized (this.g) {
            comparator = b().comparator();
        }
        return comparator;
    }

    public final Object first() {
        Object first;
        synchronized (this.g) {
            first = b().first();
        }
        return first;
    }

    public final SortedSet headSet(Object obj) {
        SortedSet a;
        synchronized (this.g) {
            a = anhf.a(b().headSet(obj), this.g);
        }
        return a;
    }

    public final Object last() {
        Object last;
        synchronized (this.g) {
            last = b().last();
        }
        return last;
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        SortedSet a;
        synchronized (this.g) {
            a = anhf.a(b().subSet(obj, obj2), this.g);
        }
        return a;
    }

    public final SortedSet tailSet(Object obj) {
        SortedSet a;
        synchronized (this.g) {
            a = anhf.a(b().tailSet(obj), this.g);
        }
        return a;
    }
}
