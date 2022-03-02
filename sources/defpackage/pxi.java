package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: pxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pxi extends amvu implements pws {
    final List a;
    final Iterator b;

    public pxi(List list) {
        this.a = list;
        this.b = list.iterator();
    }

    public static pws b() {
        return new pxi(new ArrayList());
    }

    public final Object a() {
        return this.b.hasNext() ? this.b.next() : d();
    }

    public final void close() {
    }
}
