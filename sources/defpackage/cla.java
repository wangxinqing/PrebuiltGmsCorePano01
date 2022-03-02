package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: cla  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cla {
    private amxb a = null;

    public cla() {
    }

    public final synchronized void a(cky cky) {
        amxb amxb = this.a;
        if (amxb != null) {
            for (but but : amxb.m()) {
                but.a(new ckz(new LinkedHashSet(this.a.c((Object) but)), cky), bvq.a("ListenerInvokerRunner"));
            }
        }
    }

    public cla(Object obj, but but) {
        a(obj, but);
    }

    public final synchronized void a(Object obj) {
        Iterator it = this.a.m().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            but but = (but) it.next();
            if (this.a.b(but, obj)) {
                this.a.c(but, obj);
                break;
            }
        }
        if (this.a.k()) {
            this.a = null;
        }
    }

    public final synchronized void a(Object obj, but but) {
        iva.a(obj);
        iva.a((Object) but);
        if (this.a == null) {
            this.a = amzg.q();
        }
        if (this.a.n().contains(obj)) {
            a(obj);
        }
        this.a.a((Object) but, obj);
    }
}
