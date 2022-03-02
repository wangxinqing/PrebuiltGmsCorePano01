package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: yvs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yvs extends ytj {
    final /* synthetic */ ywg a;
    private final yup b;

    public yvs(ywg ywg, yup yup) {
        this.a = ywg;
        this.b = yup;
    }

    public final void a(int i, Bundle bundle, Bundle bundle2) {
        PendingIntent pendingIntent;
        ysx ysx = null;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        if (bundle2 != null) {
            ysx = new ysx(bundle2);
        }
        ywg ywg = this.a;
        ywg.a((irq) new yvt(ywg, this.b, connectionResult, ysx));
    }
}
