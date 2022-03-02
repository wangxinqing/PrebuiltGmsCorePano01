package defpackage;

import android.accounts.Account;
import java.util.Iterator;

/* renamed from: pzc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pzc implements aora {
    final /* synthetic */ anaf a;
    final /* synthetic */ pze b;

    public pzc(pze pze, anaf anaf) {
        this.b = pze;
        this.a = anaf;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        wla wla = (wla) obj;
        xfh b2 = wla.b();
        if (b2 != null) {
            Iterator it = b2.iterator();
            while (it.hasNext()) {
                xaa xaa = (xaa) it.next();
                if (this.a.containsKey(xaa.c())) {
                    String c = xaa.c();
                    String d = xaa.d();
                    pzh pzh = (pzh) this.b.c.get((Account) this.a.get(c));
                    amrl.a((Object) pzh);
                    pzh.d = d;
                }
            }
            b2.c();
        }
        wla.c();
    }

    public final void a(Throwable th) {
        pze.a.e("Failed to load owner", th, new Object[0]);
    }
}
