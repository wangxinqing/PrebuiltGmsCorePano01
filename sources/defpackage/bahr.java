package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: bahr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bahr implements Runnable {
    final /* synthetic */ babj a;
    final /* synthetic */ baht b;

    public bahr(baht baht, babj babj) {
        this.b = baht;
        this.a = babj;
    }

    public final void run() {
        boolean z;
        if (this.b.c.n.a != azxz.SHUTDOWN) {
            bajo bajo = this.b.c.m;
            baht baht = this.b;
            baep baep = baht.a;
            if (bajo == baep) {
                baht.c.m = null;
                this.b.c.f.a();
                this.b.c.a(azxz.IDLE);
                return;
            }
            bahv bahv = baht.c;
            if (bahv.l == baep) {
                boolean z2 = false;
                if (bahv.n.a == azxz.CONNECTING) {
                    z = true;
                } else {
                    z = false;
                }
                amrl.b(z, "Expected state is CONNECTING, actual state is %s", (Object) this.b.c.n.a);
                bahp bahp = this.b.c.f;
                int i = bahp.c + 1;
                bahp.c = i;
                if (i >= ((azyj) bahp.a.get(bahp.b)).b.size()) {
                    bahp.b++;
                    bahp.c = 0;
                }
                bahp bahp2 = this.b.c.f;
                if (bahp2.b >= bahp2.a.size()) {
                    this.b.c.l = null;
                    this.b.c.f.a();
                    bahv bahv2 = this.b.c;
                    babj babj = this.a;
                    bahv2.e.b();
                    amrl.a(!babj.a(), (Object) "The error status must not be OK");
                    bahv2.a(new azya(azxz.TRANSIENT_FAILURE, babj));
                    if (bahv2.p == null) {
                        bahv2.p = bagc.a();
                    }
                    long a2 = bahv2.p.a() - bahv2.h.a(TimeUnit.NANOSECONDS);
                    bahv2.d.a(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", bahv.b(babj), Long.valueOf(a2));
                    if (bahv2.i == null) {
                        z2 = true;
                    }
                    amrl.b(z2, (Object) "previous reconnectTask is not done");
                    bahv2.i = bahv2.e.a(new bahd(bahv2), a2, TimeUnit.NANOSECONDS, bahv2.b);
                    return;
                }
                this.b.c.c();
            }
        }
    }
}
