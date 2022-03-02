package defpackage;

import java.util.Iterator;

/* renamed from: angf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class angf extends amvu {
    final Iterator a = this.b.a.iterator();
    final /* synthetic */ angg b;

    public angf(angg angg) {
        this.b = angg;
    }

    /* access modifiers changed from: protected */
    public final Object a() {
        while (this.a.hasNext()) {
            Object next = this.a.next();
            if (!this.b.b.contains(next)) {
                return next;
            }
        }
        return d();
    }
}
