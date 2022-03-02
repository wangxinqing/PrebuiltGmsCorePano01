package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;

/* renamed from: aduj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aduj implements igp {
    private final adut a;
    private final UserLocationNearbyAlertRequest b;
    private final PendingIntent c;
    private final PendingIntent d;

    public aduj(adut adut, UserLocationNearbyAlertRequest userLocationNearbyAlertRequest, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        this.a = adut;
        this.b = userLocationNearbyAlertRequest;
        this.c = pendingIntent;
        this.d = pendingIntent2;
    }

    public final void a(Object obj, Object obj2) {
        adut adut = this.a;
        ((advj) ((advl) obj).x()).a(adut.a, (ifu) new adur((acwd) obj2), this.b, this.c, this.d);
    }
}
