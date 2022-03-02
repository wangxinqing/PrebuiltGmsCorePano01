package defpackage;

import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: rdb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class rdb implements igp {
    private final rdn a;
    private final ige b;
    private final LocationRequestInternal c;
    private final iby d;

    public rdb(iby iby, rdn rdn, ige ige, LocationRequestInternal locationRequestInternal) {
        this.d = iby;
        this.a = rdn;
        this.b = ige;
        this.c = locationRequestInternal;
    }

    public final void a(Object obj, Object obj2) {
        iby iby = this.d;
        rdn rdn = this.a;
        ige ige = this.b;
        LocationRequestInternal locationRequestInternal = this.c;
        rdk rdk = new rdk((acwd) obj2, new rdc(iby, rdn, ige));
        locationRequestInternal.k = iby.d;
        ((rgu) obj).a(locationRequestInternal, ige, (rge) rdk);
    }
}
