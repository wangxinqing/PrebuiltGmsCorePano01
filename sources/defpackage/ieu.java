package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;

/* renamed from: ieu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ieu implements iez {
    private final ifc a;

    public ieu(ifc ifc) {
        this.a = ifc;
    }

    public final idf a(idf idf) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void a(int i) {
    }

    public final void a(Bundle bundle) {
    }

    public final void a(ConnectionResult connectionResult, ibq ibq, boolean z) {
    }

    public final void b(idf idf) {
        this.a.l.f.add(idf);
    }

    public final boolean b() {
        return true;
    }

    public final void c() {
        ifc ifc = this.a;
        ifc.a.lock();
        try {
            ifc.j = new iet(ifc, ifc.h, ifc.i, ifc.d, ifc.n, ifc.a, ifc.c);
            ifc.j.a();
            ifc.b.signalAll();
        } finally {
            ifc.a.unlock();
        }
    }

    public final void a() {
        for (ibo j : this.a.f.values()) {
            j.j();
        }
        this.a.l.i = Collections.emptySet();
    }
}
