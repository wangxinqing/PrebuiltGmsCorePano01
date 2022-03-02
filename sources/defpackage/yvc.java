package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;

/* renamed from: yvc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yvc extends ytj {
    final /* synthetic */ ywg a;
    private final yul b;

    public yvc(ywg ywg, yul yul) {
        this.a = ywg;
        this.b = yul;
    }

    public final void a(int i, Bundle bundle, AppAclsEntity appAclsEntity) {
        ConnectionResult connectionResult = new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null);
        ywg ywg = this.a;
        ywg.a((irq) new yvd(ywg, this.b, connectionResult, appAclsEntity));
    }
}
