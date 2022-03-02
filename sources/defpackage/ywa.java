package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: ywa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ywa extends ytj {
    final /* synthetic */ ywg a;
    private final yut b;

    public ywa(ywg ywg, yut yut) {
        this.a = ywg;
        this.b = yut;
    }

    public final void a(int i, Bundle bundle, Bundle bundle2) {
        PendingIntent pendingIntent;
        ysy ysy = null;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        if (bundle2 != null) {
            ysy = new ysy(bundle2);
        }
        ywg ywg = this.a;
        ywg.a((irq) new ywb(ywg, this.b, connectionResult, ysy));
    }
}
