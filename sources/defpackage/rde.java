package defpackage;

import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: rde  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class rde implements igp {
    private final rdn a;
    private final reh b;
    private final LocationRequestInternal c;
    private final ige d;
    private final iby e;

    public rde(iby iby, rdn rdn, reh reh, LocationRequestInternal locationRequestInternal, ige ige) {
        this.e = iby;
        this.a = rdn;
        this.b = reh;
        this.c = locationRequestInternal;
        this.d = ige;
    }

    public final void a(Object obj, Object obj2) {
        iby iby = this.e;
        rdn rdn = this.a;
        reh reh = this.b;
        LocationRequestInternal locationRequestInternal = this.c;
        ige ige = this.d;
        rdk rdk = new rdk((acwd) obj2, new rdd(iby, rdn, reh));
        locationRequestInternal.k = iby.d;
        ((rgu) obj).b(locationRequestInternal, ige, rdk);
    }
}
