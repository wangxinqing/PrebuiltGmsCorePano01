package defpackage;

import java.util.Comparator;
import java.util.Iterator;

/* renamed from: anbq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anbq extends amym {
    final /* synthetic */ Iterable a;
    final /* synthetic */ Comparator b;

    public anbq(Iterable iterable, Comparator comparator) {
        this.a = iterable;
        this.b = comparator;
    }

    public final Iterator iterator() {
        Iterable a2 = anbs.a(this.a, anbs.a());
        Comparator comparator = this.b;
        amrl.a((Object) a2, (Object) "iterators");
        amrl.a((Object) comparator, (Object) "comparator");
        return new ancc(a2, comparator);
    }
}
