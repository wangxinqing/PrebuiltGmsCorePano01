package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: izl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class izl extends azxk {
    public babj a;
    public Object b;
    public final CountDownLatch c = new CountDownLatch(1);

    public final void a(baaf baaf) {
    }

    public final void a(babj babj, baaf baaf) {
        if (babj == null) {
            this.a = babj.n.a("Null status returned for unary call");
        } else {
            if (babj.a() && this.b == null) {
                babj = babj.n.a("No value received for unary call");
            }
            this.a = babj;
        }
        this.c.countDown();
    }

    public final void a(Object obj) {
        if (this.b == null) {
            this.b = obj;
            return;
        }
        throw babj.n.a("More than one value received for unary call").b();
    }
}
