package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: irw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class irw extends irm {
    final /* synthetic */ irx g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public irw(irx irx, int i) {
        super(irx, i, (Bundle) null);
        this.g = irx;
    }

    /* access modifiers changed from: protected */
    public final void a(ConnectionResult connectionResult) {
        this.g.i.a(connectionResult);
        this.g.a(connectionResult);
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        this.g.i.a(ConnectionResult.a);
        return true;
    }
}
