package defpackage;

import java.util.Iterator;

/* renamed from: angh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class angh extends amvu {
    final /* synthetic */ Iterator a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ angi c;

    public angh(angi angi, Iterator it, Iterator it2) {
        this.c = angi;
        this.a = it;
        this.b = it2;
    }

    public final Object a() {
        while (this.a.hasNext()) {
            Object next = this.a.next();
            if (!this.c.b.contains(next)) {
                return next;
            }
        }
        while (this.b.hasNext()) {
            Object next2 = this.b.next();
            if (!this.c.a.contains(next2)) {
                return next2;
            }
        }
        return d();
    }
}
