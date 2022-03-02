package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: xch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xch extends wlp {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xch(icc icc, String str, String str2) {
        super(icc);
        this.a = str;
        this.b = str2;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((xbi) ibf).a((idg) this, true, true, this.a, this.b, 0);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new xcg(status);
    }
}
