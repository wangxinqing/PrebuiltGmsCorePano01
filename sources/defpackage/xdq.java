package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: xdq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xdq extends wlp {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ boolean m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xdq(icc icc, String str, String str2, long j, boolean z) {
        super(icc);
        this.a = str;
        this.b = str2;
        this.c = j;
        this.m = z;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((xbi) ibf).a(this.a, this.b, this.c, this.m);
        a((icl) Status.a);
    }
}
