package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: oxj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oxj {
    public final Set a;
    public final Set b;

    public oxj(Set set, Set set2) {
        this.a = set == null ? Collections.emptySet() : set;
        this.b = set2 == null ? Collections.emptySet() : set2;
    }

    static oxj a(Set set) {
        return new oxj(set, (Set) null);
    }
}
