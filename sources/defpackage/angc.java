package defpackage;

import java.util.Set;

/* renamed from: angc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class angc extends angk {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    public angc(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    /* renamed from: a */
    public final anhj iterator() {
        return new angb(this);
    }

    public final boolean contains(Object obj) {
        return this.a.contains(obj) || this.b.contains(obj);
    }

    public final boolean isEmpty() {
        return this.a.isEmpty() && this.b.isEmpty();
    }

    public final int size() {
        int size = this.a.size();
        for (Object contains : this.b) {
            if (!this.a.contains(contains)) {
                size++;
            }
        }
        return size;
    }
}
