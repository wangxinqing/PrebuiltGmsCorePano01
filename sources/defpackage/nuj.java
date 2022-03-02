package defpackage;

import java.util.List;

/* renamed from: nuj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nuj {
    private final amyh a = amyh.a((int) axlc.l());
    private int b = 0;

    public final synchronized void a() {
        this.b = 0;
        this.a.clear();
    }

    public final synchronized void a(amnp amnp) {
        if (this.b > 0) {
            aucd o = ammy.k.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ammy ammy = (ammy) o.b;
            ammy.b = 1;
            int i = 1 | ammy.a;
            ammy.a = i;
            int i2 = this.b;
            ammy.a = i | 2;
            ammy.c = i2;
            amnp.a(o);
        }
        amyh amyh = this.a;
        if (amnp.c) {
            amnp.c();
            amnp.c = false;
        }
        amns amns = (amns) amnp.b;
        amns amns2 = amns.z;
        amns.a();
        auab.a((Iterable) amyh, (List) amns.r);
    }

    public final void a(aucd aucd) {
        if (axlc.l() > 0) {
            synchronized (this) {
                amyh amyh = this.a;
                if (amyh.a - amyh.size() == 0) {
                    this.b++;
                }
                this.a.add((ammy) aucd.i());
            }
        }
    }
}
