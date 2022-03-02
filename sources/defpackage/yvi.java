package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.List;

/* renamed from: yvi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yvi extends ytj {
    final /* synthetic */ ywg a;
    private final yuo b;

    public yvi(ywg ywg, yuo yuo) {
        this.a = ywg;
        this.b = yuo;
    }

    public final void a(int i, Bundle bundle, List list) {
        PendingIntent pendingIntent;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        new ConnectionResult(i, pendingIntent);
        ywg ywg = this.a;
        ywg.a((irq) new yvj(ywg, this.b, list));
    }
}
