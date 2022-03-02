package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;

/* renamed from: yva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yva extends ytj {
    final /* synthetic */ ywg a;
    private final yuk b;

    public yva(ywg ywg, yuk yuk) {
        this.a = ywg;
        this.b = yuk;
    }

    public final void a(int i, Bundle bundle, String str, AppAclsEntity appAclsEntity) {
        ConnectionResult connectionResult = new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null);
        ywg ywg = this.a;
        ywg.a((irq) new yvb(ywg, this.b, connectionResult, appAclsEntity));
    }
}
