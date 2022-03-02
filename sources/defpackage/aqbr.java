package defpackage;

import java.util.List;

/* renamed from: aqbr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aqbr implements Runnable {
    private final aqbv a;

    public aqbr(aqbv aqbv) {
        this.a = aqbv;
    }

    public final void run() {
        aqbv aqbv = this.a;
        aqaw aqaw = new aqaw(aqbv.g);
        for (List a2 : anda.a((List) aqbv.a.subList(0, aqbv.d))) {
            aqbv.d--;
            for (aqay aqay : anda.a(a2)) {
                if (aqbv.c.contains(aqay)) {
                    try {
                        int i = aqay.a(aqaw).b;
                    } catch (Throwable th) {
                        aqbv.h = babj.a(th);
                        aqbv.i = new baaf();
                        aqbv.d();
                        return;
                    }
                }
            }
            if (aqbv.a()) {
                return;
            }
        }
        aqbv.j.a(aqbv.g);
        aqbv.e = true;
        aqbv.b();
    }
}
