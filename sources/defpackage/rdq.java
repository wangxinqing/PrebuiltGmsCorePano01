package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.location.GeofencingRequest;

/* renamed from: rdq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class rdq implements igp {
    private final GeofencingRequest a;
    private final PendingIntent b;

    public rdq(GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        this.a = geofencingRequest;
        this.b = pendingIntent;
    }

    public final void a(Object obj, Object obj2) {
        ((rgu) obj).a(this.a, this.b, (idg) new rdt((acwd) obj2));
    }
}
