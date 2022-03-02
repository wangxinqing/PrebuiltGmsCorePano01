package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: yve  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yve extends ytj {
    final /* synthetic */ ywg a;
    private final yum b;

    public yve(ywg ywg, yum yum) {
        this.a = ywg;
        this.b = yum;
    }

    public final void a(DataHolder dataHolder, String str) {
        PendingIntent pendingIntent;
        DataHolder dataHolder2;
        Bundle bundle = dataHolder.f;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(dataHolder.e, pendingIntent);
        if (!connectionResult.b() && dataHolder != null) {
            if (!dataHolder.b()) {
                dataHolder.close();
            }
            dataHolder2 = null;
        } else {
            dataHolder2 = dataHolder;
        }
        ywg ywg = this.a;
        ywg.a((irq) new yvf(ywg, this.b, connectionResult, dataHolder2, str));
    }
}
