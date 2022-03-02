package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* renamed from: qbb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qbb implements ica, icb {
    public final aosh a = aosh.f();
    private final icc b;

    public qbb(ibz ibz) {
        ibz.a((ica) this);
        ibz.a((icb) this);
        icc b2 = ibz.b();
        this.b = b2;
        b2.e();
    }

    public final void a(int i) {
    }

    public final void g(Bundle bundle) {
        this.a.b((Object) this.b);
    }

    public final void a(ConnectionResult connectionResult) {
        this.a.a((Throwable) irj.a(new Status(connectionResult.c, connectionResult.e, connectionResult.d)));
    }

    public qbb(ibz ibz, FragmentActivity fragmentActivity) {
        ibz.a((ica) this);
        ibz.a((Activity) fragmentActivity, (icb) this);
        icc b2 = ibz.b();
        this.b = b2;
        b2.e();
    }
}
