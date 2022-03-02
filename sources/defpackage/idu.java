package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: idu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class idu implements ica, icb {
    public final ibq a;
    public idv b;
    private final boolean c;

    public idu(ibq ibq, boolean z) {
        this.a = ibq;
        this.c = z;
    }

    private final void a() {
        iva.a((Object) this.b, (Object) "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    public final void g(Bundle bundle) {
        a();
        this.b.g(bundle);
    }

    public final void a(int i) {
        a();
        this.b.a(i);
    }

    public final void a(ConnectionResult connectionResult) {
        a();
        idv idv = this.b;
        ibq ibq = this.a;
        boolean z = this.c;
        ifc ifc = (ifc) idv;
        ifc.a.lock();
        try {
            ((ifc) idv).j.a(connectionResult, ibq, z);
        } finally {
            ifc.a.unlock();
        }
    }
}
