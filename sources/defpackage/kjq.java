package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: kjq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kjq implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ kjr c;

    public kjq(kjr kjr, String str, AtomicReference atomicReference) {
        this.c = kjr;
        this.a = str;
        this.b = atomicReference;
    }

    public final void run() {
        klb a2 = this.c.a(this.a);
        if (a2 == null) {
            a2 = new klb(this.c.a, -1, this.a);
            a2.t();
        }
        this.b.set(a2);
    }
}
