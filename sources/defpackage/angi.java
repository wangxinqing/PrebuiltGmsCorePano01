package defpackage;

import java.util.Set;

/* renamed from: angi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class angi extends angk {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    public angi(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    /* renamed from: a */
    public final anhj iterator() {
        return new angh(this, this.a.iterator(), this.b.iterator());
    }

    public final boolean contains(Object obj) {
        return this.b.contains(obj) ^ this.a.contains(obj);
    }

    public final boolean isEmpty() {
        return this.a.equals(this.b);
    }

    public final int size() {
        int i = 0;
        for (Object contains : this.a) {
            if (!this.b.contains(contains)) {
                i++;
            }
        }
        for (Object contains2 : this.b) {
            if (!this.a.contains(contains2)) {
                i++;
            }
        }
        return i;
    }
}
