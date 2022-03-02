package defpackage;

import com.google.android.gms.location.RemoveGeofencingRequest;

/* renamed from: rfz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rfz extends rga {
    final /* synthetic */ RemoveGeofencingRequest a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rfz(icc icc, RemoveGeofencingRequest removeGeofencingRequest) {
        super(icc);
        this.a = removeGeofencingRequest;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        rgu rgu = (rgu) ibf;
        RemoveGeofencingRequest removeGeofencingRequest = this.a;
        rgu.w();
        iva.a((Object) removeGeofencingRequest, (Object) "removeGeofencingRequest can't be null.");
        iva.a((Object) this, (Object) "ResultHolder not provided.");
        ((rgk) rgu.x()).a(removeGeofencingRequest, (rgh) new rgt(this));
    }
}
