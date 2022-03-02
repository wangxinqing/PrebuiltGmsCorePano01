package defpackage;

import java.util.AbstractList;
import java.util.List;

/* renamed from: aucu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aucu extends AbstractList {
    private final List a;
    private final auct b;

    public aucu(List list, auct auct) {
        this.a = list;
        this.b = auct;
    }

    public final Object get(int i) {
        return this.b.a(this.a.get(i));
    }

    public final int size() {
        return this.a.size();
    }
}
