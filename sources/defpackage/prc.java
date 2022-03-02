package defpackage;

import com.google.android.gms.icing.service.IndexChimeraService;

/* renamed from: prc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class prc extends ppr {
    final /* synthetic */ String a;
    final /* synthetic */ oyz b;
    final /* synthetic */ jbb c;
    final /* synthetic */ jbh d;
    final /* synthetic */ IndexChimeraService e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public prc(IndexChimeraService indexChimeraService, aonk aonk, String str, String str2, oyz oyz, jbb jbb, jbh jbh) {
        super(aonk, 2, str);
        this.e = indexChimeraService;
        this.a = str2;
        this.b = oyz;
        this.c = jbb;
        this.d = jbh;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        this.e.a().c(this.a);
        this.e.a(this.b, this.c, this.d);
        return null;
    }
}
