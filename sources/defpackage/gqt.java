package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.uncertifieddevice.UncertifiedDeviceServiceResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: gqt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gqt extends nis {
    private final gqq a;

    public gqt(gqq gqq) {
        super(151, "IsDeviceCertified");
        this.a = gqq;
    }

    public final void a(Context context) {
        UncertifiedDeviceServiceResponse uncertifiedDeviceServiceResponse = new UncertifiedDeviceServiceResponse(1, true, (PendingIntent) null);
        if (!axdg.b()) {
            uncertifiedDeviceServiceResponse.b = true;
            uncertifiedDeviceServiceResponse.c = null;
            this.a.a(Status.a, uncertifiedDeviceServiceResponse);
            return;
        }
        int ai = ent.ai();
        if (ai != 3 && (ai != 2 || ent.aj() >= System.currentTimeMillis())) {
            uncertifiedDeviceServiceResponse.b = true;
            uncertifiedDeviceServiceResponse.c = null;
        } else {
            uncertifiedDeviceServiceResponse.b = false;
            Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.UncertifiedNotificationActivity");
            className.addFlags(268435456);
            uncertifiedDeviceServiceResponse.c = PendingIntent.getActivity(context, 0, className, 134217728);
        }
        this.a.a(Status.a, uncertifiedDeviceServiceResponse);
    }

    public final void a(Status status) {
        this.a.a(status, (UncertifiedDeviceServiceResponse) null);
    }
}
