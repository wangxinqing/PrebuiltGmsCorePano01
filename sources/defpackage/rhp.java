package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.PlacePhotoMetadataResult;

/* renamed from: rhp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rhp extends ril {
    final /* synthetic */ String a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rhp(ibq ibq, icc icc, String str) {
        super(ibq, icc);
        this.a = str;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        rjn rjn = (rjn) ibf;
        rjw rjw = new rjw(this);
        String str = this.a;
        iva.a((Object) rjw, (Object) "callback cannot be null");
        ((rju) rjn.x()).a(str, rjn.a, (rjx) rjw);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new PlacePhotoMetadataResult(status, (DataHolder) null);
    }
}
