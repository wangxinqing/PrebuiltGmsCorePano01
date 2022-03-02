package defpackage;

import android.util.SparseArray;

/* renamed from: ckc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ckc {
    public final clg a = new clg();
    public final SparseArray b = new SparseArray();
    public final amxb c = amzg.q();

    public final void a(cas cas) {
        if (cas.c != null && cas.h() && cas.i().b() == 2) {
            int i = cas.b().bA;
            this.a.a(i, cas);
            SparseArray sparseArray = this.b;
            sparseArray.put(i, Long.valueOf(Math.min(((Long) sparseArray.get(i, Long.MAX_VALUE)).longValue(), cas.i().c())));
            this.c.a((Object) cas.c, (Object) cas);
        }
    }
}
