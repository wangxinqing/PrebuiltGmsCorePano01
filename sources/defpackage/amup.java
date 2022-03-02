package defpackage;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* renamed from: amup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class amup extends amys implements Serializable {
    private static final long serialVersionUID = 1;
    final amut b;
    final amut c;
    final amqw d;
    final amqw e;
    final long f;
    final long g;
    final long h;
    final amvt i;
    final int j;
    final amvr k;
    final amtd l;
    final amtp m;
    transient amth n;

    public amup(amvo amvo) {
        amut amut = amvo.h;
        amut amut2 = amvo.i;
        amqw amqw = amvo.f;
        amqw amqw2 = amvo.g;
        long j2 = amvo.m;
        long j3 = amvo.l;
        long j4 = amvo.j;
        amvt amvt = amvo.k;
        int i2 = amvo.e;
        amvr amvr = amvo.o;
        amtd amtd = amvo.p;
        amtp amtp = amvo.r;
        this.b = amut;
        this.c = amut2;
        this.d = amqw;
        this.e = amqw2;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = amvt;
        this.j = i2;
        this.k = amvr;
        this.l = (amtd == amtd.a || amtd == amtm.b) ? null : amtd;
        this.m = amtp;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.n = a().d();
    }

    private Object readResolve() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public final amtm a() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        amtm a = amtm.a();
        a.a(this.b);
        a.b(this.c);
        amqw amqw = this.d;
        amqw amqw2 = a.l;
        boolean z7 = true;
        if (amqw2 == null) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, "key equivalence was already set to %s", (Object) amqw2);
        amrl.a((Object) amqw);
        a.l = amqw;
        amqw amqw3 = this.e;
        amqw amqw4 = a.m;
        if (amqw4 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        amrl.b(z2, "value equivalence was already set to %s", (Object) amqw4);
        amrl.a((Object) amqw3);
        a.m = amqw3;
        a.a(this.j);
        amvr amvr = this.k;
        if (a.n == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        amrl.b(z3);
        amrl.a((Object) amvr);
        a.n = amvr;
        a.c = false;
        long j2 = this.f;
        if (j2 > 0) {
            a.b(j2, TimeUnit.NANOSECONDS);
        }
        long j3 = this.g;
        if (j3 > 0) {
            a.a(j3, TimeUnit.NANOSECONDS);
        }
        if (this.i == amtl.a) {
            long j4 = this.h;
            if (j4 != -1) {
                a.a(j4);
            }
        } else {
            amvt amvt = this.i;
            amrl.b(a.g == null);
            if (a.c) {
                long j5 = a.e;
                if (j5 == -1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                amrl.b(z6, "weigher can not be combined with maximum size", j5);
            }
            amrl.a((Object) amvt);
            a.g = amvt;
            long j6 = this.h;
            if (j6 != -1) {
                long j7 = a.f;
                if (j7 == -1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                amrl.b(z4, "maximum weight was already set to %s", j7);
                long j8 = a.e;
                if (j8 == -1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                amrl.b(z5, "maximum size was already set to %s", j8);
                a.f = j6;
                if (j6 < 0) {
                    z7 = false;
                }
                amrl.a(z7, (Object) "maximum weight must not be negative");
            }
        }
        amtd amtd = this.l;
        if (amtd != null) {
            a.a(amtd);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object c() {
        return this.n;
    }
}
