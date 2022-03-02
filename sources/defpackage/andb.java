package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: andb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class andb {
    boolean a;
    int b = -1;
    int c = -1;
    andr d;
    andr e;
    amqw f;

    /* access modifiers changed from: package-private */
    public final int a() {
        int i = this.b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        int i = this.c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public final andr c() {
        return (andr) amrh.a(this.d, andr.STRONG);
    }

    /* access modifiers changed from: package-private */
    public final andr d() {
        return (andr) amrh.a(this.e, andr.STRONG);
    }

    public final ConcurrentMap e() {
        if (!this.a) {
            return new ConcurrentHashMap(a(), 0.75f, b());
        }
        if (c() == andr.STRONG && d() == andr.STRONG) {
            return new anej(this, ands.a);
        }
        if (c() == andr.STRONG && d() == andr.WEAK) {
            return new anej(this, andu.a);
        }
        if (c() == andr.WEAK && d() == andr.STRONG) {
            return new anej(this, andz.a);
        }
        if (c() == andr.WEAK && d() == andr.WEAK) {
            return new anej(this, anec.a);
        }
        throw new AssertionError();
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        int i = this.b;
        if (i != -1) {
            a2.a("initialCapacity", i);
        }
        int i2 = this.c;
        if (i2 != -1) {
            a2.a("concurrencyLevel", i2);
        }
        andr andr = this.d;
        if (andr != null) {
            a2.a("keyStrength", (Object) ampw.a(andr.toString()));
        }
        andr andr2 = this.e;
        if (andr2 != null) {
            a2.a("valueStrength", (Object) ampw.a(andr2.toString()));
        }
        if (this.f != null) {
            a2.a("keyEquivalence");
        }
        return a2.toString();
    }

    public final void a(andr andr) {
        andr andr2 = this.d;
        amrl.b(andr2 == null, "Key strength was already set to %s", (Object) andr2);
        amrl.a((Object) andr);
        this.d = andr;
        if (andr != andr.STRONG) {
            this.a = true;
        }
    }
}
