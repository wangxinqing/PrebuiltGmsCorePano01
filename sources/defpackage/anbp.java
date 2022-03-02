package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: anbp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anbp extends amym {
    final /* synthetic */ Iterable a;
    final /* synthetic */ int b;

    public anbp(Iterable iterable, int i) {
        this.a = iterable;
        this.b = i;
    }

    public final Iterator iterator() {
        Iterable iterable = this.a;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.b), list.size()).iterator();
        }
        Iterator it = iterable.iterator();
        ance.a(it, this.b);
        return new anbo(it);
    }
}
