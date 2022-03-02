package defpackage;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: amyv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class amyv extends amyu implements SortedSet {
    protected amyv() {
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ Set a() {
        throw null;
    }

    public final Comparator comparator() {
        return e().comparator();
    }

    /* access modifiers changed from: protected */
    public abstract SortedSet e();

    public final Object first() {
        return e().first();
    }

    public final SortedSet headSet(Object obj) {
        return e().headSet(obj);
    }

    public final Object last() {
        return e().last();
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        return e().subSet(obj, obj2);
    }

    public final SortedSet tailSet(Object obj) {
        return e().tailSet(obj);
    }
}
