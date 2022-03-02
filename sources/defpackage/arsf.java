package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Set;

/* renamed from: arsf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arsf implements arsg {
    public static final arsf a = new arsf();
    public boolean b = false;
    public aizy c;
    public ajaa d;
    public ajbg e;
    public aiab f;
    public aybd g;
    public arsj h;
    public arsn i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public long n;
    public long o;
    public long p;
    public long q;
    public aqek r;
    public final arpj s = new arpj();
    public arse t;
    public arqy u;
    public arqz v;

    private arsf() {
    }

    public final long a(long j2) {
        return this.i.c(j2);
    }

    public final void b() {
        arpj arpj = this.s;
        arpj.a("pap_").a(this.c);
    }

    public final void c() {
        arpj arpj = this.s;
        arpj.a("pap_").b(this.c);
    }

    public final void d() {
        this.k = this.j;
    }

    public final boolean e() {
        int i2;
        if (!this.m) {
            i2 = this.k;
            int f2 = this.i.f();
            if (this.g.enableGlocRequestReducedDownloadThreshold()) {
                i2 /= Math.max(f2, 1);
            }
        } else {
            i2 = this.k;
        }
        if (this.l || this.c.c() - this.n <= ((long) i2) || !this.i.e()) {
            return false;
        }
        return true;
    }

    public final Set a(arsy arsy, arrc arrc) {
        return this.i.a(arsy, arrc);
    }

    public final void a() {
        this.i.a();
        this.h.b();
    }

    public final void a(aqek aqek) {
        if (aqek != null) {
            arsh.a(aqek, 77, 10000);
            arsh.a(aqek, 78, 1);
            if (aqek.i(77) && aqek.b(77) > 30000000) {
                aqek.k(77);
            }
        } else {
            aqek = null;
        }
        try {
            aqek aqek2 = this.r;
            if ((aqek2 == null || !Arrays.equals(aqek2.b(), aqek.b())) && aqek.i(1)) {
                aqek aqek3 = this.r;
                if (!(aqek3 == null || (aqek3.b(1) == aqek.b(1) && this.r.a(73) == aqek.a(73) && this.r.a(74) == aqek.a(74)))) {
                    a();
                }
                if (aqek.i(77)) {
                    this.j = aqek.b(77);
                }
                this.i.a(aqek);
                arse arse = this.t;
                if (arse != null) {
                    arse.a(aqek);
                }
                this.r = aqek;
            }
        } catch (IOException e2) {
        }
    }
}
