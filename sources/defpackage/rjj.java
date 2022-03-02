package defpackage;

/* renamed from: rjj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rjj extends rkw {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rjj(ibq ibq, icc icc, String str, String str2, String str3) {
        super(ibq, icc);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        rjn rjn = (rjn) ibf;
        rkz rkz = new rkz(this);
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        iva.a((Object) rkz, (Object) "callback == null");
        ((rju) rjn.x()).a(str, str2, str3, rjn.a, (rla) rkz);
    }
}
