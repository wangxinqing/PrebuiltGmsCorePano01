package defpackage;

import java.util.Iterator;

/* renamed from: bail  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bail implements Runnable {
    final /* synthetic */ baji a;

    public bail(baji baji) {
        this.a = baji;
    }

    public final void run() {
        if (!this.a.y.get()) {
            babp babp = this.a.K;
            if (babp != null && babp.b()) {
                amrl.b(this.a.q, (Object) "name resolver must be started");
                this.a.k();
            }
            for (bahv bahv : this.a.u) {
                bahv.e.execute(new bahf(bahv));
            }
            Iterator it = this.a.v.iterator();
            if (it.hasNext()) {
                baka baka = (baka) it.next();
                throw null;
            }
        }
    }
}
