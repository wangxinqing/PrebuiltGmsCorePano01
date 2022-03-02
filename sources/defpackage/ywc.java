package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: ywc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ywc extends ytj {
    final /* synthetic */ ywg a;
    private final yne b;

    public ywc(ywg ywg, yne yne) {
        this.a = ywg;
        this.b = yne;
    }

    public final void b(int i, Bundle bundle) {
        PendingIntent pendingIntent;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        ywg ywg = this.a;
        ywg.a((irq) new ywd(ywg, this.b, connectionResult));
    }
}
