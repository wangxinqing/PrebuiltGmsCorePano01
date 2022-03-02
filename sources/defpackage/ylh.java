package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: ylh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ylh extends ytj {
    final /* synthetic */ yli a;
    final /* synthetic */ ykv b;

    public ylh(yli yli, ykv ykv) {
        this.a = yli;
        this.b = ykv;
    }

    public final void a(int i, Bundle bundle, Bundle bundle2) {
        PendingIntent pendingIntent;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        this.a.a.post(new ylg(this, new ConnectionResult(i, pendingIntent)));
    }
}
