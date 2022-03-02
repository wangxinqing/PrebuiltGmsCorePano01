package defpackage;

import java.util.Iterator;

/* renamed from: angb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class angb extends amvu {
    final Iterator a = this.c.a.iterator();
    final Iterator b = this.c.b.iterator();
    final /* synthetic */ angc c;

    public angb(angc angc) {
        this.c = angc;
    }

    /* access modifiers changed from: protected */
    public final Object a() {
        if (this.a.hasNext()) {
            return this.a.next();
        }
        while (this.b.hasNext()) {
            Object next = this.b.next();
            if (!this.c.a.contains(next)) {
                return next;
            }
        }
        return d();
    }
}
