package defpackage;

/* renamed from: rjk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rjk extends rkw {
    final /* synthetic */ String a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rjk(ibq ibq, icc icc, String str) {
        super(ibq, icc);
        this.a = str;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        rjn rjn = (rjn) ibf;
        rkz rkz = new rkz(this);
        String str = this.a;
        iva.a((Object) rkz, (Object) "callback == null");
        ((rju) rjn.x()).a(str, rjn.a, (rla) rkz);
    }
}
