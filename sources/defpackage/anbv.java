package defpackage;

import java.util.Iterator;

/* renamed from: anbv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anbv extends amvu {
    final /* synthetic */ Iterator a;
    final /* synthetic */ amrm b;

    public anbv(Iterator it, amrm amrm) {
        this.a = it;
        this.b = amrm;
    }

    /* access modifiers changed from: protected */
    public final Object a() {
        while (this.a.hasNext()) {
            Object next = this.a.next();
            if (this.b.a(next)) {
                return next;
            }
        }
        return d();
    }
}
