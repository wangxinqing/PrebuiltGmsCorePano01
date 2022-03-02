package defpackage;

import java.util.concurrent.TimeoutException;

/* renamed from: asho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asho extends arwm {
    final /* synthetic */ ashp a;
    private int b = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asho(ashp ashp, String str) {
        super(str);
        this.a = ashp;
    }

    public final void run() {
        ashp ashp = this.a;
        int i = ashp.i;
        ashp.e.b();
        if (this.a.d.get() != 2) {
            int i2 = this.b;
            if (i2 > 30) {
                anih anih = (anih) asil.a.b();
                anih.a((Throwable) new TimeoutException());
                ((anih) anih.a("asho", "run", 161, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s timeout when starting", (Object) this.m);
                this.a.c();
                return;
            }
            this.b = i2 + 1;
            ashp ashp2 = this.a;
            ashp2.e.a(ashp2.h, 200);
            return;
        }
        this.a.c();
    }
}
