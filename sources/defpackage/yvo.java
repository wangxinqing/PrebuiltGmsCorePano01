package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.data.internal.PlusImageView;

/* renamed from: yvo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yvo extends ytj {
    final /* synthetic */ ywg a;
    private final PlusImageView b;

    public yvo(ywg ywg, PlusImageView plusImageView) {
        this.a = ywg;
        this.b = plusImageView;
    }

    public final void a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) {
        PendingIntent pendingIntent;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        ywg ywg = this.a;
        ywg.a((irq) new yvp(ywg, this.b, connectionResult, parcelFileDescriptor));
    }
}
