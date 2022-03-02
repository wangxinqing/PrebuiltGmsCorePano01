package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: xcj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xcj extends wlp {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ wkx c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xcj(icc icc, String str, String str2, wkx wkx) {
        super(icc);
        this.a = str;
        this.b = str2;
        this.c = wkx;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        String str = this.a;
        String str2 = this.b;
        wkx wkx = this.c;
        ((xbi) ibf).a((idg) this, str, str2, wkx.a, wkx.b, wkx.c);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new xci(status);
    }
}
