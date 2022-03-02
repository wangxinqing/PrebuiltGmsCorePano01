package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: rdf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class rdf implements igp {
    private final LocationRequestInternal a;
    private final PendingIntent b;
    private final iby c;

    public rdf(iby iby, LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent) {
        this.c = iby;
        this.a = locationRequestInternal;
        this.b = pendingIntent;
    }

    public final void a(Object obj, Object obj2) {
        iby iby = this.c;
        LocationRequestInternal locationRequestInternal = this.a;
        PendingIntent pendingIntent = this.b;
        rdm rdm = new rdm((acwd) obj2);
        locationRequestInternal.k = iby.d;
        ((rgu) obj).a(locationRequestInternal, pendingIntent, (rge) rdm);
    }
}
