package defpackage;

import java.lang.ref.ReferenceQueue;

/* renamed from: amvc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amvc extends amve {
    volatile long a = Long.MAX_VALUE;
    amvp b = amvo.i();
    amvp c = amvo.i();

    public amvc(ReferenceQueue referenceQueue, Object obj, int i, amvp amvp) {
        super(referenceQueue, obj, i, amvp);
    }

    public final void a(long j) {
        this.a = j;
    }

    public final void a(amvp amvp) {
        this.b = amvp;
    }

    public final void b(amvp amvp) {
        this.c = amvp;
    }

    public final long e() {
        return this.a;
    }

    public final amvp f() {
        return this.b;
    }

    public final amvp g() {
        return this.c;
    }
}
