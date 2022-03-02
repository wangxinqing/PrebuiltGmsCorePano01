package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: aftn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aftn {
    private final hol a;
    private final aftr b;

    public aftn(hol hol, aftr aftr) {
        this.a = hol;
        this.b = aftr;
    }

    public final void a(int i, aftc aftc) {
        hoi a2 = this.a.a(aftc.k());
        a2.b(i - 1);
        a2.b();
        if (this.b.a()) {
            this.a.a(10, TimeUnit.SECONDS);
        }
    }
}
