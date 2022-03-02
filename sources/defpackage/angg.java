package defpackage;

import java.util.Set;

/* renamed from: angg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class angg extends angk {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    public angg(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    /* renamed from: a */
    public final anhj iterator() {
        return new angf(this);
    }

    public final boolean contains(Object obj) {
        return this.a.contains(obj) && !this.b.contains(obj);
    }

    public final boolean isEmpty() {
        return this.b.containsAll(this.a);
    }

    public final int size() {
        int i = 0;
        for (Object contains : this.a) {
            if (!this.b.contains(contains)) {
                i++;
            }
        }
        return i;
    }
}
