package defpackage;

import java.util.logging.Level;

/* renamed from: alpm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alpm implements Runnable {
    final /* synthetic */ alpq a;
    private final alpx b;

    public alpm(alpq alpq, alpx alpx) {
        this.a = alpq;
        this.b = alpx;
    }

    public final void run() {
        synchronized (this.a) {
            if (!this.a.c()) {
                alpq.a.logp(Level.INFO, "com.google.apps.brix.api.client.net.browserchannel.BrowserChannel$BindRunnable", "run", "Opening bind request to server.");
                alpq alpq = this.a;
                alpt alpt = alpq.j;
                alpr alpr = new alpr(alpq.d, this.b, alpt.a, alpq.g);
                this.a.a(alpr);
                alpo alpo = this.a.c;
                alpr.f = alpo;
                alpr.g = alpo;
                alpr.h = alpo;
                alpr.i = alpo;
                alpr.b.a();
            }
        }
    }
}
