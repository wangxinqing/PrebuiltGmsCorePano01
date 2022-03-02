package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: amtm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amtm {
    static final amsv a = amta.a((Object) new amti());
    static final amtd b = new amtj();
    private static final Logger q = Logger.getLogger(amtm.class.getName());
    boolean c = true;
    int d = -1;
    long e = -1;
    long f = -1;
    amvt g;
    amut h;
    amut i;
    long j = -1;
    long k = -1;
    amqw l;
    amqw m;
    amvr n;
    amtd o;
    final amsv p = a;

    static {
        new amtq();
    }

    private amtm() {
    }

    public static amtm a() {
        return new amtm();
    }

    private final void f() {
        boolean z = true;
        if (this.g == null) {
            if (this.f != -1) {
                z = false;
            }
            amrl.b(z, (Object) "maximumWeight requires weigher");
        } else if (this.c) {
            if (this.f == -1) {
                z = false;
            }
            amrl.b(z, (Object) "weigher requires maximumWeight");
        } else if (this.f == -1) {
            q.logp(Level.WARNING, "com.google.common.cache.CacheBuilder", "checkWeightWithWeigher", "ignoring weigher specified without maximumWeight");
        }
    }

    /* access modifiers changed from: package-private */
    public final amut b() {
        return (amut) amrh.a(this.h, amut.STRONG);
    }

    /* access modifiers changed from: package-private */
    public final amut c() {
        return (amut) amrh.a(this.i, amut.STRONG);
    }

    public final amth d() {
        f();
        amrl.b(true, (Object) "refreshAfterWrite requires a LoadingCache");
        return new amuo(new amvo(this, (amtp) null));
    }

    public final void e() {
        a(amut.WEAK);
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        int i2 = this.d;
        if (i2 != -1) {
            a2.a("concurrencyLevel", i2);
        }
        long j2 = this.e;
        if (j2 != -1) {
            a2.a("maximumSize", j2);
        }
        long j3 = this.f;
        if (j3 != -1) {
            a2.a("maximumWeight", j3);
        }
        long j4 = this.j;
        if (j4 != -1) {
            StringBuilder sb = new StringBuilder(22);
            sb.append(j4);
            sb.append("ns");
            a2.a("expireAfterWrite", (Object) sb.toString());
        }
        long j5 = this.k;
        if (j5 != -1) {
            StringBuilder sb2 = new StringBuilder(22);
            sb2.append(j5);
            sb2.append("ns");
            a2.a("expireAfterAccess", (Object) sb2.toString());
        }
        amut amut = this.h;
        if (amut != null) {
            a2.a("keyStrength", (Object) ampw.a(amut.toString()));
        }
        amut amut2 = this.i;
        if (amut2 != null) {
            a2.a("valueStrength", (Object) ampw.a(amut2.toString()));
        }
        if (this.l != null) {
            a2.a("keyEquivalence");
        }
        if (this.m != null) {
            a2.a("valueEquivalence");
        }
        if (this.n != null) {
            a2.a("removalListener");
        }
        return a2.toString();
    }

    public final amtr a(amtp amtp) {
        f();
        return new amun(this, amtp);
    }

    public final void b(long j2, TimeUnit timeUnit) {
        boolean z;
        long j3 = this.j;
        boolean z2 = true;
        if (j3 == -1) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, "expireAfterWrite was already set to %s ns", j3);
        if (j2 < 0) {
            z2 = false;
        }
        amrl.a(z2, "duration cannot be negative: %s %s", j2, (Object) timeUnit);
        this.j = timeUnit.toNanos(j2);
    }

    public final void a(int i2) {
        boolean z;
        int i3 = this.d;
        boolean z2 = true;
        if (i3 == -1) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, "concurrency level was already set to %s", i3);
        if (i2 <= 0) {
            z2 = false;
        }
        amrl.a(z2);
        this.d = i2;
    }

    public final void b(amut amut) {
        amut amut2 = this.i;
        amrl.b(amut2 == null, "Value strength was already set to %s", (Object) amut2);
        amrl.a((Object) amut);
        this.i = amut;
    }

    public final void a(long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        long j3 = this.e;
        boolean z4 = true;
        if (j3 == -1) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, "maximum size was already set to %s", j3);
        long j4 = this.f;
        if (j4 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        amrl.b(z2, "maximum weight was already set to %s", j4);
        if (this.g == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        amrl.b(z3, (Object) "maximum size can not be combined with weigher");
        if (j2 < 0) {
            z4 = false;
        }
        amrl.a(z4, (Object) "maximum size must not be negative");
        this.e = j2;
    }

    public final void a(long j2, TimeUnit timeUnit) {
        boolean z;
        long j3 = this.k;
        boolean z2 = true;
        if (j3 == -1) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, "expireAfterAccess was already set to %s ns", j3);
        if (j2 < 0) {
            z2 = false;
        }
        amrl.a(z2, "duration cannot be negative: %s %s", j2, (Object) timeUnit);
        this.k = timeUnit.toNanos(j2);
    }

    public final void a(amtd amtd) {
        amrl.b(this.o == null);
        amrl.a((Object) amtd);
        this.o = amtd;
    }

    /* access modifiers changed from: package-private */
    public final void a(amut amut) {
        amut amut2 = this.h;
        amrl.b(amut2 == null, "Key strength was already set to %s", (Object) amut2);
        amrl.a((Object) amut);
        this.h = amut;
    }
}
