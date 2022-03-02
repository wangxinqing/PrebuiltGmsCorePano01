package defpackage;

import java.util.logging.Level;

/* renamed from: alps  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alps implements alqq {
    final /* synthetic */ alpr a;

    public alps(alpr alpr) {
        this.a = alpr;
    }

    public final void a() {
        alpr alpr = this.a;
        alpu alpu = new alpu(alpr.b());
        if (!alpr.a) {
            alpo alpo = alpr.g;
            alpq.a.logp(Level.INFO, "com.google.apps.brix.api.client.net.browserchannel.BrowserChannel$EventListener", "onBindComplete", "Bind request completed successfully.");
            if (!alpo.a.c()) {
                alpo.a.e.a(alrg.SUCCESS, new alpm(alpo.a, alpu.a));
            }
        }
    }

    public final void a(alqo alqo) {
        alqs alqs = alqo.a;
        if (alqs.a != 400 || !alqs.b.contains("Unknown SID")) {
            int i = alqs.a;
            if (i < 400) {
                alpr alpr = this.a;
                alpr.a(new alpv(1, alqs, alpr.b()));
                return;
            }
            alpr alpr2 = this.a;
            alpr2.a(new alpv(2, alqs, i, alpr2.b()));
            return;
        }
        alpr alpr3 = this.a;
        alpr3.a(new alpv(5, alqs, alpr3.b()));
    }

    public final void a(alqp alqp) {
        int i;
        alpo alpo = this.a.f;
        alpq.a.logp(Level.INFO, "com.google.apps.brix.api.client.net.browserchannel.BrowserChannel$EventListener", "onBindStart", "Bind request is now connected.");
        synchronized (alpo.a) {
            alpq alpq = alpo.a;
            i = alpq.h;
            if (i == 1) {
                alpq.h = 2;
            }
        }
        if (i == 1) {
            alot alot = (alot) alpo.a.f;
            if (alot.c != null) {
                alot.a(new alou());
                ((aloz) alot.a).a.a(alrg.SUCCESS, new alor());
            }
        }
    }

    public final void a(CharSequence charSequence, int i, int i2) {
        this.a.c.a(charSequence, i, i2);
        alpy a2 = this.a.c.a();
        while (a2 != null) {
            alpr alpr = this.a;
            int i3 = a2.e;
            alpr.e = (long) i3;
            if (i3 == 0) {
                try {
                    alpr.d = a2.g;
                } catch (IllegalStateException e) {
                    alpr alpr2 = this.a;
                    alpr2.a(new alpv(4, e, alpr2.b()));
                    return;
                }
            } else if (a2.f.equals(alpy.c)) {
                this.a.a(new alpv(3, new IllegalStateException("Server sent stop message."), this.a.b()));
            } else if (!a2.f.equals(alpy.a) && !a2.f.equals(alpy.b)) {
                alpo alpo = this.a.i;
                if (!alpo.a.c()) {
                    alpn alpn = alpo.a.f;
                    if (!a2.f.equals(alpy.d)) {
                        continue;
                    } else {
                        synchronized (alpn) {
                            long j = a2.h;
                            if (j > ((alot) alpn).b) {
                                ((alot) alpn).b = j;
                                ((alot) alpn).a(a2.i);
                            }
                        }
                    }
                } else {
                    continue;
                }
            }
            a2 = this.a.c.a();
        }
    }
}
