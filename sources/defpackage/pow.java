package defpackage;

import java.util.concurrent.Semaphore;

/* renamed from: pow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pow extends aplf {
    public final Semaphore a;
    private final aplf b;
    private final acvp c = new pov(this);

    public pow(aplf aplf, int i) {
        this.b = aplf;
        this.a = new Semaphore(i);
    }

    public final acwa a(aplu... apluArr) {
        this.a.acquireUninterruptibly();
        acwa a2 = this.b.a(apluArr);
        a2.a(this.c);
        return a2;
    }

    public final acwa b(aplu... apluArr) {
        throw new UnsupportedOperationException();
    }

    public final acwa a(String... strArr) {
        this.a.acquireUninterruptibly();
        acwa a2 = this.b.a(strArr);
        a2.a(this.c);
        return a2;
    }

    public final acwa b(String... strArr) {
        throw new UnsupportedOperationException();
    }
}
