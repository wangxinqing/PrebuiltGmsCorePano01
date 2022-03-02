package defpackage;

import java.io.IOException;

/* renamed from: avzr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class avzr implements Runnable {
    final /* synthetic */ avzy a;

    public avzr(avzy avzy) {
        this.a = avzy;
    }

    public final void run() {
        synchronized (this.a) {
            avzy avzy = this.a;
            if (!(!avzy.g) && !avzy.h) {
                try {
                    avzy.e();
                    if (this.a.c()) {
                        this.a.b();
                        this.a.e = 0;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
