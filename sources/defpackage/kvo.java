package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.GetMetadataRequest;

/* renamed from: kvo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kvo extends kuz {
    final /* synthetic */ kvp a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kvo(kvp kvp, icc icc) {
        super(icc);
        this.a = kvp;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((kvf) ibf).A().a(new GetMetadataRequest(this.a.a, false), (kwg) new kvm(this));
    }

    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new kvn(status, (jzr) null);
    }
}
