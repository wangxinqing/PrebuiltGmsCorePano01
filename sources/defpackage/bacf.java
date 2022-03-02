package defpackage;

/* renamed from: bacf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bacf extends azxo {
    final /* synthetic */ bacg b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bacf(bacg bacg, azxl azxl) {
        super(azxl);
        this.b = bacg;
    }

    public final void b(azxk azxk, baaf baaf) {
        baab baab = bacg.a;
        String valueOf = String.valueOf(this.b.b);
        baaf.a(baab, (Object) valueOf.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf));
        this.a.a((azxk) new bace(this, azxk), baaf);
    }
}
