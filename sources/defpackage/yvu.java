package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: yvu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yvu extends ytj {
    final /* synthetic */ ywg a;
    private final yuq b;

    public yvu(ywg ywg, yuq yuq) {
        this.a = ywg;
        this.b = yuq;
    }

    public final void a(int i, Bundle bundle, Bundle bundle2) {
        PendingIntent pendingIntent;
        ysw ysw = null;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        ywg ywg = this.a;
        yuq yuq = this.b;
        if (bundle2 != null) {
            ysw = new ysw(bundle2);
        }
        ywg.a((irq) new yvv(ywg, yuq, connectionResult, ysw));
    }
}
