package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: ier  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ier implements ica, icb {
    final /* synthetic */ iet a;

    public ier(iet iet) {
        this.a = iet;
    }

    public final void a(int i) {
    }

    public final void g(Bundle bundle) {
        iet iet = this.a;
        iet.e.a(new ieq(iet));
    }

    public final void a(ConnectionResult connectionResult) {
        this.a.b.lock();
        try {
            if (this.a.a(connectionResult)) {
                this.a.f();
                this.a.e();
            } else {
                this.a.b(connectionResult);
            }
        } finally {
            this.a.b.unlock();
        }
    }
}
