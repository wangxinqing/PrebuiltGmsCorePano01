package defpackage;

import java.util.logging.Logger;

/* renamed from: alpq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alpq {
    public static final Logger a = Logger.getLogger("BrowserChannel");
    public final alpp b = new alpp(this);
    public final alpo c = new alpo(this);
    public final alqf d;
    public final alrf e;
    public final alpn f;
    public boolean g;
    public int h = 0;
    public final alqm i;
    public final alpt j;
    private alpw k = null;

    public alpq(alqf alqf, alrf alrf, alqm alqm, alpt alpt, alpn alpn) {
        this.d = alqf;
        this.e = alrf;
        this.i = alqm;
        this.j = alpt;
        this.f = alpn;
    }

    public final synchronized void a() {
        if (this.h == 0) {
            this.h = 1;
            this.e.a(alrg.SUCCESS, this.b);
        } else {
            throw new IllegalStateException("Cannot open the channel multiple times.");
        }
    }

    public final synchronized void b() {
        if (this.h != 3) {
            this.h = 3;
            a((alpw) null);
        }
    }

    public final synchronized boolean c() {
        return this.h == 3;
    }

    public final synchronized void a(alpw alpw) {
        alpw alpw2 = this.k;
        if (alpw2 != null) {
            alpw2.a();
        }
        this.k = alpw;
    }
}
