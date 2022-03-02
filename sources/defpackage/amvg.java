package defpackage;

import java.lang.ref.ReferenceQueue;

/* renamed from: amvg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amvg extends amve {
    volatile long a = Long.MAX_VALUE;
    amvp b = amvo.i();
    amvp c = amvo.i();

    public amvg(ReferenceQueue referenceQueue, Object obj, int i, amvp amvp) {
        super(referenceQueue, obj, i, amvp);
    }

    public final void b(long j) {
        this.a = j;
    }

    public final void c(amvp amvp) {
        this.b = amvp;
    }

    public final void d(amvp amvp) {
        this.c = amvp;
    }

    public final long h() {
        return this.a;
    }

    public final amvp i() {
        return this.b;
    }

    public final amvp j() {
        return this.c;
    }
}
