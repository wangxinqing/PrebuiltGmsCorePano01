package defpackage;

import com.google.android.gms.ads.identifier.d;
import java.io.IOException;

/* renamed from: bhj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bhj implements Runnable {
    final /* synthetic */ bhm a;

    public bhj(bhm bhm) {
        this.a = bhm;
    }

    public final void run() {
        bhm bhm = this.a;
        try {
            if (bhm.f == null && bhm.i) {
                d dVar = new d(bhm.a);
                dVar.a();
                bhm.f = dVar;
            }
        } catch (hxw | hxx | IOException e) {
            bhm.f = null;
        }
    }
}
