package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* renamed from: ange  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ange extends angk {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    public ange(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    /* renamed from: a */
    public final anhj iterator() {
        return new angd(this);
    }

    public final boolean contains(Object obj) {
        return this.a.contains(obj) && this.b.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        return this.a.containsAll(collection) && this.b.containsAll(collection);
    }

    public final boolean isEmpty() {
        return Collections.disjoint(this.b, this.a);
    }

    public final int size() {
        int i = 0;
        for (Object contains : this.a) {
            if (this.b.contains(contains)) {
                i++;
            }
        }
        return i;
    }
}
