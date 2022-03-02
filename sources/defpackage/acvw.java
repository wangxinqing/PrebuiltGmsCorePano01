package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: acvw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acvw implements Runnable {
    final /* synthetic */ acwa a;
    final /* synthetic */ acvx b;

    public acvw(acvx acvx, acwa acwa) {
        this.b = acvx;
        this.a = acwa;
    }

    public final void run() {
        try {
            acwa a2 = this.b.a.a(this.a.d());
            if (a2 != null) {
                a2.a(acwg.b, (acvv) this.b);
                a2.a(acwg.b, (acvs) this.b);
                a2.a(acwg.b, (acvm) this.b);
                return;
            }
            this.b.a((Exception) new NullPointerException("Continuation returned null"));
        } catch (acvy e) {
            if (e.getCause() instanceof Exception) {
                this.b.a((Exception) e.getCause());
            } else {
                this.b.a((Exception) e);
            }
        } catch (CancellationException e2) {
            this.b.b();
        } catch (Exception e3) {
            this.b.a(e3);
        }
    }
}
