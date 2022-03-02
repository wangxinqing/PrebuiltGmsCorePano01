package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.PlaceFilter;

/* renamed from: rim  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rim extends ril {
    final /* synthetic */ PlaceFilter a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rim(ibq ibq, icc icc, PlaceFilter placeFilter) {
        super(ibq, icc);
        this.a = placeFilter;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        rki rki = (rki) ibf;
        rio rio = new rio(this);
        PlaceFilter placeFilter = this.a;
        iva.a((Object) rio, (Object) "callback == null");
        ((rjr) rki.x()).a(placeFilter, rki.a, (rka) rio);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new ria(DataHolder.b(status.i), 100);
    }
}
