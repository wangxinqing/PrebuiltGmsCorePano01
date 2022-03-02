package defpackage;

import android.util.SparseArray;

/* renamed from: bxm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bxm {
    public final clg a = new clg();
    public final SparseArray b = new SparseArray();

    public final boolean a(cas cas) {
        boolean z;
        new Object[1][0] = cas;
        if (cas.c == null || cas.i() == null) {
            z = false;
        } else {
            z = cas.i().b() == 1;
        }
        if (z) {
            int i = cas.b().bA;
            this.a.a(i, cas);
            amwy amwy = (amxb) this.b.get(i);
            if (amwy == null) {
                amwy = amzg.q();
                this.b.put(i, amwy);
            }
            amwy.a((Object) cas.c, (Object) cas);
        }
        new Object[1][0] = this.b;
        return z;
    }

    public final void b(cas cas) {
        new Object[1][0] = cas;
        int i = cas.b().bA;
        int b2 = this.a.b(i, cas);
        if (b2 == 3) {
            amxb amxb = (amxb) this.b.get(i);
            if (amxb != null) {
                amxb.c(cas.c, cas);
                if (amxb.k()) {
                    this.b.remove(i);
                }
            }
        } else if (b2 == 4) {
            this.b.remove(i);
        }
        new Object[1][0] = this.b;
    }
}
