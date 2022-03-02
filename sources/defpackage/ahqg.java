package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: ahqg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahqg {
    public final aizy a;
    public final ajbg b;
    public final ajab c;
    public final ahqq d;
    public final ahqj e;
    public final ahqp f;
    public final ArrayList g = new ArrayList();
    public boolean h = false;
    public aizx i = null;
    public int j = 1;

    public ahqg(ajab ajab, aizy aizy, ajbg ajbg, ahqq ahqq, ahqp ahqp, ahqj ahqj) {
        this.c = ajab;
        this.a = aizy;
        this.b = ajbg;
        this.d = ahqq;
        this.f = ahqp;
        this.e = ahqj;
    }

    private final void c(boolean z) {
        this.d.a(this.a.c(), z);
    }

    public final void a() {
        this.j = 1;
        c(false);
        e();
        b();
    }

    public final void b() {
        if (this.h) {
            this.b.c(ajbe.CACHE_UPDATER);
            this.h = false;
        }
    }

    public final void d() {
        Locale locale = Locale.ENGLISH;
        new Object[1][0] = Integer.valueOf(this.f.d());
        c(true);
        e();
        b();
    }

    public final void e() {
        long j2;
        this.g.clear();
        this.j = 1;
        ahqq ahqq = this.d;
        long j3 = ahqq.a;
        boolean z = ahqq.b;
        double random = Math.random() - 8.0d;
        long j4 = (long) ((random + random) * 600000.0d);
        if (!z) {
            j2 = 43200000;
        } else {
            j2 = 86400000;
        }
        long j5 = j3 + j2 + j4;
        this.b.a(ajbe.CACHE_UPDATER, j5, this.i);
        StringBuilder sb = new StringBuilder(47);
        sb.append("Cache refresh scheduled at ");
        sb.append(j5);
        sb.toString();
    }

    public final boolean b(boolean z) {
        aqek aqek;
        int i2;
        long b2 = this.a.b();
        boolean z2 = false;
        if (!this.g.isEmpty()) {
            aqek = new aqek(ajck.Q);
            aqek.b(1, (Object) new aqek(ajck.P));
            aqek.b(2, b2);
            Iterator it = this.g.iterator();
            i2 = 0;
            while (it.hasNext()) {
                aqek.a(4, (Object) (aqek) it.next());
                it.remove();
                i2++;
            }
        } else {
            aqek = null;
            i2 = 0;
        }
        if (i2 > 0 || z) {
            aqek aqek2 = new aqek(ajck.al);
            if (i2 > 0) {
                aqek aqek3 = new aqek(ajck.ah);
                aqek3.b(1, (Object) aqek);
                aqek2.a(4, (Object) aqek3);
                Locale locale = Locale.ENGLISH;
                new Object[1][0] = Integer.valueOf(i2);
            }
            if (z) {
                this.e.a(aqek2);
            }
            this.c.a(aqek2);
        }
        if (i2 > 0) {
            z2 = true;
        } else if (z) {
            z2 = true;
        }
        if (!z2) {
            d();
        }
        return z2;
    }

    public final void c() {
        if (!this.h) {
            this.b.b(ajbe.CACHE_UPDATER, 60000, (aizx) null);
            this.h = true;
        }
    }

    public final void a(boolean z) {
        ahqz ahqz = this.d.f;
        this.g.clear();
        long b2 = this.a.b();
        if (ahqz != null) {
            int d2 = this.f.d();
            ahqy c2 = ahqz.c();
            while (c2.hasNext()) {
                c2.next();
                if (c2.a() < d2) {
                    aqek a2 = aiaj.a(c2.d());
                    if (a2 != null) {
                        this.g.add(a2);
                    }
                } else {
                    c2.b.d[c2.a.g()] = b2;
                }
            }
        }
        Locale locale = Locale.ENGLISH;
        new Object[1][0] = Integer.valueOf(this.g.size());
        if (b(z)) {
            c();
            this.b.a(ajbe.CACHE_UPDATER, this.a.c() + 10000, this.i);
            this.j = 3;
        }
    }
}
