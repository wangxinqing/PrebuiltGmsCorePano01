package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: bpw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bpw extends amyp implements RandomAccess {
    public final Comparator a;
    private final amzy b;

    private bpw(Iterable iterable, Comparator comparator, boolean z) {
        iterable = iterable instanceof bpw ? ((bpw) iterable).b : iterable;
        if (!z && !amxx.a(iterable, comparator)) {
            this.b = amzy.a(comparator, iterable);
        } else {
            this.b = amzy.a(iterable);
        }
        this.a = comparator;
    }

    public static bpw a(Iterable iterable) {
        return a(iterable, anfh.a);
    }

    public static bpw b(Iterable iterable) {
        return b(iterable, anfh.a);
    }

    /* access modifiers changed from: protected */
    public final List a() {
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

    public final boolean contains(Object obj) {
        if (obj == null || isEmpty() || a(obj) < 0) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bpw) {
            bpw bpw = (bpw) obj;
            return this.a.equals(bpw.a) && anda.a((List) this.b, (Object) bpw.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    public static bpw a(Iterable iterable, Comparator comparator) {
        return new bpw(iterable, comparator, true);
    }

    public static bpw b(Iterable iterable, Comparator comparator) {
        boolean z = false;
        if ((iterable instanceof Collection) && ((Collection) iterable).size() < 2) {
            z = true;
        }
        return new bpw(iterable, comparator, z);
    }

    public static bpw a(Comparator comparator) {
        return new bpw(amzy.h(), comparator, true);
    }

    public final int a(Object obj) {
        return Collections.binarySearch(this.b, obj, this.a);
    }

    public final bpw a(Collection collection) {
        if (collection.isEmpty()) {
            return this;
        }
        int size = size();
        int size2 = collection.size();
        amzt b2 = amzy.b(size + size2);
        if (size2 == 1) {
            Object b3 = anbs.b(collection);
            int a2 = a(b3);
            if (a2 < 0) {
                a2 = -(a2 + 1);
            }
            b2.b((Iterable) this.b.subList(0, a2));
            b2.c(b3);
            b2.b((Iterable) this.b.subList(a2, size));
            return new bpw(b2.a(), this.a, true);
        }
        if (!amxx.a(collection, this.a)) {
            collection = amzy.a(this.a, (Iterable) collection);
        }
        amzy a3 = amzy.a((Object) this.b, (Object) collection);
        Comparator comparator = this.a;
        amrl.a((Object) a3, (Object) "iterables");
        amrl.a((Object) comparator, (Object) "comparator");
        b2.b((Iterable) new anbr(new anbq(a3, comparator)));
        return new bpw(b2.a(), this.a, true);
    }

    public final bpw a(Set set) {
        return !set.isEmpty() ? new bpw(anbs.a((Iterable) this.b, (amrm) new bpv(set)), this.a, true) : this;
    }
}
