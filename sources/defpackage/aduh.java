package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;

/* renamed from: aduh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aduh implements igp {
    private final adut a;
    private final PlacefencingRequest b;
    private final PendingIntent c;

    public aduh(adut adut, PlacefencingRequest placefencingRequest, PendingIntent pendingIntent) {
        this.a = adut;
        this.b = placefencingRequest;
        this.c = pendingIntent;
    }

    public final void a(Object obj, Object obj2) {
        adut adut = this.a;
        ((advj) ((advl) obj).x()).a(adut.a, (ifu) new adup((acwd) obj2), this.b, this.c);
    }
}
