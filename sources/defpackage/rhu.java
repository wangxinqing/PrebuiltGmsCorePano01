package defpackage;

import com.google.android.gms.location.places.PlacesClientIdentifier;

/* renamed from: rhu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rhu extends ihb {
    final /* synthetic */ PlacesClientIdentifier a;

    public rhu(PlacesClientIdentifier placesClientIdentifier) {
        this.a = placesClientIdentifier;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        rki rki = (rki) ibf;
        try {
            iva.a((Object) this.a, (Object) "clientIdentifier == null.");
            rht rht = new rht(acwd);
            PlacesClientIdentifier placesClientIdentifier = this.a;
            iva.a((Object) rht, (Object) "callback == null");
            ((rjr) rki.x()).a(placesClientIdentifier, rki.a, (ifu) rht);
        } catch (NullPointerException e) {
            acwd.b((Exception) e);
        }
    }
}
