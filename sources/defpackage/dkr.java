package defpackage;

import android.net.Uri;
import java.util.HashSet;
import java.util.List;

/* renamed from: dkr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dkr implements Runnable {
    final /* synthetic */ dkn a;
    final /* synthetic */ dkw b;

    public dkr(dkw dkw, dkn dkn) {
        this.b = dkw;
        this.a = dkn;
    }

    public final void run() {
        dkn dkn = this.a;
        dkn.a.a(dkn);
        for (dkx a2 : this.b.c) {
            a2.a();
        }
        dkn dkn2 = this.a;
        iva.b("deliver should be called from worker thread");
        iva.b(dkn2.c, "Measurement must be submitted");
        List list = dkn2.i;
        if (!list.isEmpty()) {
            HashSet hashSet = new HashSet();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                dky dky = (dky) list.get(i);
                Uri a3 = dky.a();
                if (!hashSet.contains(a3)) {
                    hashSet.add(a3);
                    dky.a(dkn2);
                }
            }
        }
    }
}
