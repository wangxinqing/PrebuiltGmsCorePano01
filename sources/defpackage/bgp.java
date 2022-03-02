package defpackage;

import android.content.Context;

/* renamed from: bgp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bgp implements Runnable {
    final /* synthetic */ Context a;

    public bgp(Context context) {
        this.a = context;
    }

    public final void run() {
        npq npq;
        npr npr;
        try {
            bgk bgk = bgq.b;
            Context context = this.a;
            if (!bgk.h) {
                synchronized (bgk.g) {
                    if (!bgk.h) {
                        if ((System.currentTimeMillis() / 1000) - bgk.f >= 3600) {
                            npx npx = bgk.c;
                            synchronized (npx.b) {
                                npq npq2 = npx.a;
                                if (npq2 != null) {
                                    npr = npq2.a;
                                } else {
                                    npr = null;
                                }
                            }
                            if (npr != null) {
                                if (npr.a.d - (System.currentTimeMillis() / 1000) >= 3600) {
                                }
                            }
                            bgk.b();
                        }
                    }
                }
            }
            npx npx2 = bgk.c;
            synchronized (npx2.b) {
                npq = npx2.a;
            }
            if (npq != null) {
                long currentTimeMillis = System.currentTimeMillis();
                bgk.d.a(5001, System.currentTimeMillis() - currentTimeMillis, (Exception) null, npq.a(context), (String) null);
            }
        } catch (Exception e) {
            bgq.d.a(2019, -1, e);
        }
    }
}
