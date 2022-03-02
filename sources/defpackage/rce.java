package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.location.ActivityRecognitionRequest;

/* renamed from: rce  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class rce implements igp {
    private final ActivityRecognitionRequest a;
    private final PendingIntent b;

    public rce(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent) {
        this.a = activityRecognitionRequest;
        this.b = pendingIntent;
    }

    public final void a(Object obj, Object obj2) {
        ((rgu) obj).a(this.a, this.b, (idg) new rcj((acwd) obj2));
    }
}
