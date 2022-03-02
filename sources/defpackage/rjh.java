package defpackage;

import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: rjh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rjh extends ril {
    final /* synthetic */ LatLngBounds a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ PlaceFilter m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rjh(ibq ibq, icc icc, LatLngBounds latLngBounds, String str, int i, PlaceFilter placeFilter) {
        super(ibq, icc);
        this.a = latLngBounds;
        this.b = str;
        this.c = i;
        this.m = placeFilter;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        String str;
        PlaceFilter placeFilter;
        rjn rjn = (rjn) ibf;
        rio rio = new rio((ril) this);
        LatLngBounds latLngBounds = this.a;
        String str2 = this.b;
        int i = this.c;
        PlaceFilter placeFilter2 = this.m;
        iva.a((Object) rio, (Object) "callback == null");
        if (str2 == null) {
            str = "";
        } else {
            str = str2;
        }
        if (placeFilter2 == null) {
            placeFilter = PlaceFilter.e();
        } else {
            placeFilter = placeFilter2;
        }
        ((rju) rjn.x()).a(latLngBounds, i, str, placeFilter, rjn.a, (rka) rio);
    }
}
