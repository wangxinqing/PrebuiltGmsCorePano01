package defpackage;

import java.util.Iterator;

/* renamed from: hgd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class hgd implements Iterable {
    private final hfg a;
    private final hfg b;

    public hgd(hfg hfg, hfg hfg2) {
        this.a = hfg;
        this.b = hfg2;
    }

    public final Iterator iterator() {
        return ance.a(this.a.a.iterator(), this.b.a.iterator());
    }
}
