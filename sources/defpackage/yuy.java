package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: yuy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yuy extends ytj {
    final /* synthetic */ ywg a;
    private final yuj b;

    public yuy(ywg ywg, yuj yuj) {
        this.a = ywg;
        this.b = yuj;
    }

    public final void a(int i, Bundle bundle) {
        ConnectionResult connectionResult = new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null);
        ywg ywg = this.a;
        ywg.a((irq) new yuz(ywg, this.b, connectionResult));
    }
}
