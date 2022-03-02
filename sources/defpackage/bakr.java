package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: bakr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bakr implements Runnable {
    final /* synthetic */ bakt a;

    public bakr(bakt bakt) {
        this.a = bakt;
    }

    public final void run() {
        bakt bakt = this.a;
        if (bakt.e) {
            long a2 = bakt.a();
            bakt bakt2 = this.a;
            if (bakt2.d - a2 > 0) {
                bakt2.f = bakt2.a.schedule(new baks(bakt2), this.a.d - a2, TimeUnit.NANOSECONDS);
                return;
            }
            bakt2.e = false;
            bakt2.f = null;
            bakt2.c.run();
            return;
        }
        bakt.f = null;
    }
}
