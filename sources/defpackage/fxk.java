package defpackage;

import java.util.concurrent.Executor;

/* renamed from: fxk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fxk implements aoqb {
    private final fxp a;
    private final boolean b;

    public fxk(fxp fxp, boolean z) {
        this.a = fxp;
        this.b = z;
    }

    public final aorr a(Object obj) {
        nme nme;
        boolean z;
        fxp fxp = this.a;
        icc icc = (icc) obj;
        if (!this.b) {
            return fxp.a(icc);
        }
        iva.a(icc.a(nlj.c), (Object) "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature.");
        if (icc.b(nlj.c)) {
            nme = (nme) icc.a(nlj.f);
        } else {
            nme = null;
        }
        if (nme != null) {
            z = nme.a;
        } else {
            z = false;
        }
        return aopr.a(qbc.a(fxp.a(false)), (aoqb) new fxl(z), (Executor) aoqm.a);
    }
}
