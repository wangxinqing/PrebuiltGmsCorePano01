package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: adwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adwy extends adxn {
    final /* synthetic */ acwd a;

    public adwy(acwd acwd) {
        this.a = acwd;
    }

    public final void a(Status status, Bundle bundle) {
        adww adww;
        if (status.c() && bundle != null) {
            bundle.getString("com.google.android.gms.wallet.firstparty.EXTRA_ORDER_ID");
            bundle.getString("com.google.android.gms.wallet.firstparty.EXTRA_DISPLAY_MESSAGE");
            bundle.getByteArray("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN");
            adww = new adww(status);
        } else {
            adww = new adww(status);
        }
        adwd.a(status, new ick(adww), this.a);
    }
}
