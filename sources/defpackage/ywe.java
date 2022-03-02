package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;

/* renamed from: ywe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ywe extends ytj {
    final /* synthetic */ ywg a;
    private final yuu b;

    public ywe(ywg ywg, yuu yuu) {
        this.a = ywg;
        this.b = yuu;
    }

    public final void a(int i, Bundle bundle, UpgradeAccountEntity upgradeAccountEntity) {
        PendingIntent pendingIntent;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        ywg ywg = this.a;
        ywg.a((irq) new ywf(ywg, this.b, connectionResult, upgradeAccountEntity));
    }
}
