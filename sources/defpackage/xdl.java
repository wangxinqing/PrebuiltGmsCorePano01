package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: xdl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xdl extends wlp {
    final /* synthetic */ Bundle a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xdl(icc icc, Bundle bundle) {
        super(icc);
        this.a = bundle;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((xbi) ibf).a((idg) this, this.a);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new xdk(status);
    }
}
