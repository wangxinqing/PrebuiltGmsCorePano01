package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.model.posts.Settings;

/* renamed from: yvw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yvw extends ytj {
    final /* synthetic */ ywg a;
    private final yur b;

    public yvw(ywg ywg, yur yur) {
        this.a = ywg;
        this.b = yur;
    }

    public final void a(int i, Bundle bundle, Settings settings) {
        PendingIntent pendingIntent;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        ywg ywg = this.a;
        ywg.a((irq) new yvx(ywg, this.b, connectionResult, settings));
    }
}
