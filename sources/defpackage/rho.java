package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.location.places.PlacePhotoResult;

/* renamed from: rho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rho extends ril {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rho(ibq ibq, icc icc, String str, int i, int i2, int i3) {
        super(ibq, icc);
        this.a = str;
        this.b = i;
        this.c = i2;
        this.m = i3;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        rjn rjn = (rjn) ibf;
        rjw rjw = new rjw(this);
        String str = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.m;
        iva.a((Object) rjw, (Object) "callback cannot be null");
        ((rju) rjn.x()).a(str, i, i2, i3, rjn.a, (rjx) rjw);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new PlacePhotoResult(status, (BitmapTeleporter) null);
    }
}
