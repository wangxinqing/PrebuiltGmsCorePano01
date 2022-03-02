package defpackage;

/* renamed from: fyf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fyf implements acvp {
    final /* synthetic */ acvp a;
    final /* synthetic */ fyg b;

    public fyf(fyg fyg, acvp acvp) {
        this.b = fyg;
        this.a = acvp;
    }

    public final void a(acwa acwa) {
        if (acwa.e() != null) {
            fyg.a.e("Previous checkin failed", acwa.e(), new Object[0]);
        }
        fyg fyg = this.b;
        acvp acvp = this.a;
        gvt gvt = new gvt(fyg.b, fyg);
        gvt.b();
        fyg.c.a(gvt.a()).a(acvp);
    }
}
