package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed;

/* renamed from: yvq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yvq extends ytj {
    final /* synthetic */ ywg a;
    private final yrm b;

    public yvq(ywg ywg, yrm yrm) {
        this.a = ywg;
        this.b = yrm;
    }

    public final void a(int i, Bundle bundle, PeopleFeed peopleFeed) {
        PendingIntent pendingIntent;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        new ConnectionResult(i, pendingIntent);
        ywg ywg = this.a;
        ywg.a((irq) new yvr(ywg, this.b, peopleFeed));
    }
}
