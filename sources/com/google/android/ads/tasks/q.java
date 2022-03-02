package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.c;
import com.google.android.chimera.FragmentTransaction;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class q extends v {
    public q(bhm bhm, String str, String str2, aucd aucd, int i) {
        super(bhm, str, str2, aucd, i, 51);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        synchronized (this.g) {
            bhh bhh = new bhh((String) this.d.invoke((Object) null, new Object[0]));
            aucd aucd = this.g;
            long longValue = bhh.a.longValue();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            c cVar = (c) aucd.b;
            c cVar2 = c.Q;
            cVar.b |= FragmentTransaction.TRANSIT_ENTER_MASK;
            cVar.B = longValue;
            aucd aucd2 = this.g;
            long longValue2 = bhh.b.longValue();
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            c cVar3 = (c) aucd2.b;
            cVar3.b |= FragmentTransaction.TRANSIT_EXIT_MASK;
            cVar3.C = longValue2;
        }
    }
}
