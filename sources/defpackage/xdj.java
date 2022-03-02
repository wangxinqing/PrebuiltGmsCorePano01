package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: xdj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xdj extends wlp {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ wll c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xdj(icc icc, String str, String str2, wll wll) {
        super(icc);
        this.a = str;
        this.b = str2;
        this.c = wll;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((xbi) ibf).a((idg) this, this.a, this.b, this.c);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new xdi(status);
    }
}
