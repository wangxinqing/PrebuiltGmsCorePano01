package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: iru  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iru implements irr {
    final /* synthetic */ irx a;

    public iru(irx irx) {
        this.a = irx;
    }

    public final void a(ConnectionResult connectionResult) {
        if (connectionResult.b()) {
            irx irx = this.a;
            irx.a((itm) null, irx.y());
            return;
        }
        iro iro = this.a.m;
        if (iro != null) {
            iro.a(connectionResult);
        }
    }
}
