package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: toa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class toa extends tnx {
    final /* synthetic */ tob e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public toa(tob tob, tlh tlh, String str) {
        super(tob, "Read", tlh, str);
        this.e = tob;
    }

    public final boolean a(tnm tnm) {
        while (true) {
            try {
                asai a = tpk.a(tnm.e());
                asav a2 = tpk.a(a);
                if (a2.equals(asav.DISCONNECTION)) {
                    tnm.g();
                    ((anih) tky.a.d()).a("EndpointManager received a DISCONNECTION frame from endpoint %s on channel %s, disconnecting.", (Object) this.c, (Object) tnm.a());
                } else {
                    tob tob = this.e;
                    Object obj = null;
                    try {
                        obj = tob.b.b(new tnt(tob, a2)).get();
                    } catch (InterruptedException | ExecutionException e2) {
                        anih anih = (anih) tgb.a.b();
                        anih.a(e2);
                        anih.a("Failed %s while waiting for the result.", (Object) "getOfflineFrameProcessor");
                        if (e2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    tny tny = (tny) obj;
                    if (tny == null) {
                        ((anih) tky.a.d()).a("EndpointManager discarded incoming OfflineFrame of type %s because it doesn't have a processor registered.", (Object) a2.name());
                    } else {
                        tny.a(a, this.c, this.b, tnm.l());
                    }
                }
            } catch (auda e3) {
                anih anih2 = (anih) tky.a.d();
                anih2.a((Throwable) e3);
                anih2.a("EndpointManager received an invalid OfflineFrame from endpoint %s on channel %s, discarding.", (Object) this.c, (Object) tnm.a());
            }
        }
    }
}
