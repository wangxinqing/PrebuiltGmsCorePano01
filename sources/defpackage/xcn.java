package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: xcn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xcn extends wlp {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ wkv c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xcn(icc icc, String str, String str2, wkv wkv) {
        super(icc);
        this.a = str;
        this.b = str2;
        this.c = wkv;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        String str = this.a;
        String str2 = this.b;
        wkv wkv = this.c;
        ((xbi) ibf).a((idg) this, str, str2, wkv.a, wkv.b, wkv.c, wkv.d);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new xcm(status);
    }
}
