package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: rzq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rzq extends ihg {
    final /* synthetic */ rzw a;
    final /* synthetic */ sac c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rzq(sac sac, igc igc, rzw rzw) {
        super(igc);
        this.c = sac;
        this.a = rzw;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        sag sag;
        sbf sbf = (sbf) ibf;
        acwd acwd2 = new acwd();
        acwd2.a.a((acvp) new rzp(acwd));
        rzw rzw = this.a;
        synchronized (rzw.b.i) {
            try {
                sag = rzw.c;
                rzw.c = null;
            } catch (Throwable th) {
                rzw.c = null;
                throw th;
            }
        }
        if (sag != null) {
            sas A = sbf.A();
            rzr rzr = new rzr(acwd2);
            sac sac = this.c;
            A.a((ifu) rzr, sac.e, sac.f, sac.g, (sah) sag);
            return;
        }
        acwd.a((Exception) new ibr(new Status(13, "No listener registered")));
    }
}
