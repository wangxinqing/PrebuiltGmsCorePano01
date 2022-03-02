package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.location.ActivityTransitionRequest;

/* renamed from: rcg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class rcg implements igp {
    private final ActivityTransitionRequest a;
    private final PendingIntent b;

    public rcg(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        this.a = activityTransitionRequest;
        this.b = pendingIntent;
    }

    public final void a(Object obj, Object obj2) {
        ActivityTransitionRequest activityTransitionRequest = this.a;
        PendingIntent pendingIntent = this.b;
        rgu rgu = (rgu) obj;
        rcj rcj = new rcj((acwd) obj2);
        rgu.w();
        iva.a((Object) rcj, (Object) "ResultHolder not provided.");
        ((rgk) rgu.x()).a(activityTransitionRequest, pendingIntent, (ifu) new igt(rcj));
    }
}
