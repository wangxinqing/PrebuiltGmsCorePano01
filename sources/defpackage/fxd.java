package defpackage;

import com.google.android.gms.auth.api.signin.service.SignInChimeraService;

/* renamed from: fxd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class fxd implements amry {
    private final fxe a;

    public fxd(fxe fxe) {
        this.a = fxe;
    }

    public final void a(Object obj) {
        fxe fxe = this.a;
        qbr qbr = (qbr) obj;
        iwd iwd = SignInChimeraService.a;
        hol hol = fxe.b;
        qbk qbk = (qbk) SignInChimeraService.b.get(qbr.a.getClass());
        iva.a((Object) qbk);
        hol.a((audx) qbv.a(qbk, qbr, fxe.a)).b();
    }
}
