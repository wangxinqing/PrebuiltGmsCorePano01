package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.model.posts.Comment;

/* renamed from: yuw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yuw extends ytj {
    final /* synthetic */ ywg a;
    private final yun b;

    public yuw(ywg ywg, yun yun) {
        this.a = ywg;
        this.b = yun;
    }

    public final void a(int i, Bundle bundle, Comment comment) {
        PendingIntent pendingIntent;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        ywg ywg = this.a;
        ywg.a((irq) new yux(ywg, this.b, connectionResult));
    }
}
