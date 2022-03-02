package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* renamed from: anbh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class anbh extends anbi implements NavigableSet, ango {
    final transient Comparator a;
    transient anbh b;

    public anbh(Comparator comparator) {
        this.a = comparator;
    }

    static anbh a(Comparator comparator, int i, Object... objArr) {
        if (i == 0) {
            return a(comparator);
        }
        anfi.a(objArr, i);
        Arrays.sort(objArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                objArr[i2] = obj;
                i2++;
            }
        }
        Arrays.fill(objArr, i2, i, (Object) null);
        if (i2 < (objArr.length >> 1)) {
            objArr = Arrays.copyOf(objArr, i2);
        }
        return new anfw(amzy.b(objArr, i2), comparator);
    }

    public static anbh b(Collection collection) {
        anfh anfh = anfh.a;
        amrl.a((Object) anfh);
        if (angp.a(anfh, collection) && (collection instanceof anbh)) {
            anbh anbh = (anbh) collection;
            if (!anbh.f()) {
                return anbh;
            }
        }
        Object[] c = anbs.c(collection);
        return a(anfh, c.length, c);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: a */
    public abstract anhj iterator();

    public abstract anbh b(Object obj, boolean z, Object obj2, boolean z2);

    public abstract anbh c(Object obj, boolean z);

    public Object ceiling(Object obj) {
        return anbs.e(tailSet(obj, true));
    }

    public final Comparator comparator() {
        return this.a;
    }

    public abstract anbh d(Object obj, boolean z);

    public Object first() {
        return iterator().next();
    }

    public Object floor(Object obj) {
        return ance.g(headSet(obj, true).descendingIterator());
    }

    /* renamed from: h */
    public final anbh descendingSet() {
        anbh anbh = this.b;
        if (anbh != null) {
            return anbh;
        }
        anbh k = k();
        this.b = k;
        k.b = this;
        return k;
    }

    public Object higher(Object obj) {
        return anbs.e(tailSet(obj, false));
    }

    public abstract anbh k();

    /* renamed from: l */
    public abstract anhj descendingIterator();

    public Object last() {
        return descendingIterator().next();
    }

    public Object lower(Object obj) {
        return ance.g(headSet(obj, false).descendingIterator());
    }

    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new anbg(this.a, toArray());
    }

    public final /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    /* access modifiers changed from: package-private */
    public final int b(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    static anfw a(Comparator comparator) {
        if (anfh.a.equals(comparator)) {
            return anfw.c;
        }
        return new anfw(amzy.h(), comparator);
    }

    /* renamed from: b */
    public final anbh tailSet(Object obj, boolean z) {
        amrl.a(obj);
        return d(obj, z);
    }

    /* renamed from: a */
    public final anbh headSet(Object obj, boolean z) {
        amrl.a(obj);
        return c(obj, z);
    }

    /* renamed from: a */
    public final anbh subSet(Object obj, boolean z, Object obj2, boolean z2) {
        amrl.a(obj);
        amrl.a(obj2);
        amrl.a(this.a.compare(obj, obj2) <= 0);
        return b(obj, z, obj2, z2);
    }
}
