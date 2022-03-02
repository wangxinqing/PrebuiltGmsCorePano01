package defpackage;

import android.content.Intent;

/* renamed from: pyw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class pyw implements ax {
    private final pze a;

    public pyw(pze pze) {
        this.a = pze;
    }

    public final void a(Object obj) {
        pze pze = this.a;
        pzh pzh = (pzh) obj;
        if (pzh != null) {
            int i = pzh.a;
            boolean z = true;
            if (i == 0) {
                pze.a(pzh.c, pzh.b);
            } else if (i == 2) {
                pze.e = true;
                pze.a((Intent) null, 1);
            } else if (i != 3) {
                z = false;
            } else {
                pze.e = true;
                pze.a((Intent) null, 3);
            }
            pze.f.a(z);
        }
    }
}
