package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.model.posts.Post;

/* renamed from: yvy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yvy extends ytj {
    final /* synthetic */ ywg a;
    private final yus b;

    public yvy(ywg ywg, yus yus) {
        this.a = ywg;
        this.b = yus;
    }

    public final void a(int i, Bundle bundle, Post post) {
        PendingIntent pendingIntent;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        ywg ywg = this.a;
        ywg.a((irq) new yvz(ywg, this.b, connectionResult, post));
    }
}
