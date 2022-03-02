package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentsFeed;

/* renamed from: yvm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yvm extends ytj {
    final /* synthetic */ ywg a;
    private final ynp b;

    public yvm(ywg ywg, ynp ynp) {
        this.a = ywg;
        this.b = ynp;
    }

    public final void a(int i, Bundle bundle, MomentsFeed momentsFeed) {
        PendingIntent pendingIntent;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        ywg ywg = this.a;
        ywg.a((irq) new yvn(ywg, this.b, connectionResult, momentsFeed));
    }
}
