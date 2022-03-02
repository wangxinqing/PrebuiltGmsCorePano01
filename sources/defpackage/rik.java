package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: rik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rik extends ril {
    final /* synthetic */ String a;
    final /* synthetic */ LatLngBounds b;
    final /* synthetic */ AutocompleteFilter c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rik(ibq ibq, icc icc, String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter) {
        super(ibq, icc);
        this.a = str;
        this.b = latLngBounds;
        this.c = autocompleteFilter;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        String str;
        AutocompleteFilter autocompleteFilter;
        rjn rjn = (rjn) ibf;
        rio rio = new rio(this);
        String str2 = this.a;
        LatLngBounds latLngBounds = this.b;
        AutocompleteFilter autocompleteFilter2 = this.c;
        iva.a((Object) rio, (Object) "callback == null");
        if (str2 == null) {
            str = "";
        } else {
            str = str2;
        }
        if (autocompleteFilter2 == null) {
            autocompleteFilter = new rhd().a();
        } else {
            autocompleteFilter = autocompleteFilter2;
        }
        ((rju) rjn.x()).a(str, latLngBounds, 1, autocompleteFilter, rjn.a, (rka) rio);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new rhg(DataHolder.b(status.i));
    }
}
