package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: yvk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yvk extends ytj {
    final /* synthetic */ ywg a;
    private final ymu b;

    public yvk(ywg ywg, ymu ymu) {
        this.a = ywg;
        this.b = ymu;
    }

    public final void a(int i, Bundle bundle, String str) {
        ConnectionResult connectionResult = new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null);
        ywg ywg = this.a;
        ywg.a((irq) new yvl(ywg, this.b, connectionResult, str));
    }
}
