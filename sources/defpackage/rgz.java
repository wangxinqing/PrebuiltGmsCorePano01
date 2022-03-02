package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: rgz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rgz extends rem {
    final /* synthetic */ LocationSettingsRequest a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rgz(icc icc, LocationSettingsRequest locationSettingsRequest) {
        super(icc);
        this.a = locationSettingsRequest;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((rgu) ibf).a(this.a, (idg) this, (String) null);
    }

    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new LocationSettingsResult(status);
    }
}
