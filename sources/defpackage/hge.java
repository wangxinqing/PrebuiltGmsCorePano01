package defpackage;

import java.util.Iterator;

/* renamed from: hge  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class hge implements Iterable {
    private final hfg a;
    private final hfg b;

    public hge(hfg hfg, hfg hfg2) {
        this.a = hfg;
        this.b = hfg2;
    }

    public final Iterator iterator() {
        return ance.a(ance.a(this.a.c.iterator(), hgf.a), ance.a(this.b.c.iterator(), hgg.a));
    }
}
