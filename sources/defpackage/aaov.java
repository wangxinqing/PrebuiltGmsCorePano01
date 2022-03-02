package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: aaov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aaov implements Runnable {
    private final aaoy a;
    private final int b;
    private final int c;

    public aaov(aaoy aaoy, int i, int i2) {
        this.a = aaoy;
        this.b = i;
        this.c = i2;
    }

    public final void run() {
        aaoy aaoy = this.a;
        int i = this.b;
        int i2 = this.c;
        synchronized (aaoy.d) {
            acwa acwa = aaoy.c;
            if (acwa != null) {
                try {
                    aaoy.b = ((ick) acws.a(acwa)).p();
                } catch (InterruptedException | ExecutionException e) {
                    aaoy.b = false;
                }
                aaoy.c = null;
            }
        }
        if (aaoy.b) {
            aucd o = atfs.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            atfs atfs = (atfs) o.b;
            atfs.c = i - 1;
            int i3 = atfs.a | 2;
            atfs.a = i3;
            atfs.b = i2 - 1;
            atfs.a = i3 | 1;
            int i4 = aaoy.e;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atfs atfs2 = (atfs) o.b;
            int i5 = i4 - 1;
            if (i4 != 0) {
                atfs2.d = i5;
                atfs2.a |= 4;
                aaoy.a.a(((atfs) o.i()).k()).b();
                return;
            }
            throw null;
        }
    }
}
