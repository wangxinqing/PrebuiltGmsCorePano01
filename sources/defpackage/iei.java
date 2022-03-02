package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* renamed from: iei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iei implements iez {
    public final ifc a;

    public iei(ifc ifc) {
        this.a = ifc;
    }

    public final idf a(idf idf) {
        try {
            this.a.l.l.a(idf);
            iey iey = this.a.l;
            ibo ibo = (ibo) iey.h.get(idf.d);
            iva.a((Object) ibo, (Object) "Appropriate Api was not requested.");
            if (ibo.l() || !this.a.g.containsKey(idf.d)) {
                if (ibo instanceof ivq) {
                    ibp ibp = ((ivq) ibo).a;
                    ibo = null;
                }
                idf.b(ibo);
                return idf;
            }
            idf.a(new Status(17));
            return idf;
        } catch (DeadObjectException e) {
            this.a.a((ifa) new ieh(this, this));
        }
    }

    public final void a() {
    }

    public final void a(Bundle bundle) {
    }

    public final void a(ConnectionResult connectionResult, ibq ibq, boolean z) {
    }

    public final void b(idf idf) {
        a(idf);
    }

    public final void c() {
    }

    public final boolean b() {
        iey iey = this.a.l;
        iey.b.lock();
        iey.b.unlock();
        this.a.a((ConnectionResult) null);
        return true;
    }

    public final void a(int i) {
        this.a.a((ConnectionResult) null);
        this.a.m.a(i);
    }
}
