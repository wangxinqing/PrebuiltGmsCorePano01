package defpackage;

import java.io.IOException;

/* renamed from: tnx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class tnx implements Runnable {
    final String a;
    final tlh b;
    final String c;
    final /* synthetic */ tob d;

    public tnx(tob tob, String str, tlh tlh, String str2) {
        this.d = tob;
        this.a = str;
        this.b = tlh;
        this.c = str2;
    }

    public abstract boolean a(tnm tnm);

    public void run() {
        tnm tnm = null;
        while (true) {
            tnm a2 = this.d.a.a(this.c);
            if (a2 == null) {
                ((anih) tky.a.d()).a("EndpointManager quit overall %s loop for endpoint %s because there's no EndpointChannel for it.", (Object) this.a, (Object) this.c);
                break;
            }
            if (tnm != null) {
                if (a2 == tnm) {
                    ((anih) tky.a.d()).a("EndpointManager quit overall %s loop for endpoint %s because the currently registered %s EndpointChannel is in a failed state.", (Object) this.a, (Object) this.c, (Object) a2.a());
                    break;
                } else {
                    ((anih) tky.a.d()).a("EndpointManager switched its %s loop from %s EndpointChannel to %s EndpointChannel for endpoint %s.", this.a, tnm.a(), a2.a(), this.c);
                    tnm = null;
                }
            }
            try {
                if (!a(a2)) {
                    ((anih) tky.a.d()).a("EndpointManager quit overall %s loop for endpoint %s.", (Object) this.a, (Object) this.c);
                    break;
                }
            } catch (IOException e) {
                anih anih = (anih) tky.a.d();
                anih.a((Throwable) e);
                anih.a("EndpointManager failed the next %s read/write for endpoint %s over its %s EndpointChannel.", (Object) this.a, (Object) this.c, (Object) a2.a());
                tnm = a2;
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                anih anih2 = (anih) tky.a.d();
                anih2.a((Throwable) e2);
                anih2.a("EndpointManager quit overall %s loop for endpoint %s because it was interrupted.", (Object) this.a, (Object) this.c);
            }
        }
        this.d.a(this.b, this.c);
    }
}
