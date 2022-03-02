package defpackage;

import java.util.Iterator;

/* renamed from: angd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class angd extends amvu {
    final Iterator a = this.b.a.iterator();
    final /* synthetic */ ange b;

    public angd(ange ange) {
        this.b = ange;
    }

    /* access modifiers changed from: protected */
    public final Object a() {
        while (this.a.hasNext()) {
            Object next = this.a.next();
            if (this.b.b.contains(next)) {
                return next;
            }
        }
        return d();
    }
}
