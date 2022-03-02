package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: afve  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afve implements aoqb {
    private final afvf a;

    public afve(afvf afvf) {
        this.a = afvf;
    }

    public final aorr a(Object obj) {
        aorr aorr;
        afvf afvf = this.a;
        CancellationException cancellationException = (CancellationException) obj;
        synchronized (afvf.a) {
            amrl.a((Object) afvf.c);
            if (afvf.b) {
                aorr = aorl.a((Throwable) new afvl("Connectivity lost while downloading photos."));
            } else {
                aorr = afvf.c;
            }
        }
        return aorr;
    }
}
