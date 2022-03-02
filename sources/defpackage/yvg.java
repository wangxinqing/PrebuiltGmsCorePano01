package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: yvg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yvg extends ytj {
    final /* synthetic */ ywg a;
    private final zab b;

    public yvg(ywg ywg, zab zab) {
        this.a = ywg;
        this.b = zab;
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
        if (bundle2 != null) {
            ysw = new ysw(bundle2);
        }
        ywg ywg = this.a;
        ywg.a((irq) new yvh(ywg, this.b, connectionResult, ysw));
    }
}
