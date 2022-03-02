package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: xdn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xdn extends wlp {
    final /* synthetic */ xaq a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ int m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xdn(icc icc, xaq xaq, String str, String str2, int i) {
        super(icc);
        this.a = xaq;
        this.b = str;
        this.c = str2;
        this.m = i;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((xbi) ibf).a(this.a, this.b, this.c, this.m);
        a((icl) Status.a);
    }
}
