package defpackage;

import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: akks  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akks implements Runnable {
    final /* synthetic */ aklb a;

    public akks(aklb aklb) {
        this.a = aklb;
    }

    public final void run() {
        int i;
        aklb aklb = this.a;
        int i2 = aklb.c;
        if (i2 == 0) {
            int i3 = 0;
            if (aklb.a == null) {
                aklb.a = new akkm(7, (int) azbw.a.a().a(), new File(aklb.e, "l1"), new akkq(aklb.f), aklz.a());
                i = aklb.a.a();
            } else {
                i = 0;
            }
            if (aklb.b == null) {
                aklb.b = new akkm(7, (int) azbw.a.a().b(), new File(aklb.e, "l2"), new akkr(aklb.f), aklz.a());
                i3 = aklb.b.a();
            }
            aklb.c = 1;
            long millis = TimeUnit.SECONDS.toMillis((long) ((int) azcf.a.a().E()));
            long b = aklb.b();
            if (b < 0) {
                aklz.a();
                aklb.a(4, i, i3);
                aklb.i.i++;
                aklb.a();
            } else if (b > millis) {
                aklz.a();
                aklb.a(5, i, i3);
                aklb.i.j++;
                aklb.a();
            } else {
                aklz.a();
                aklb.a(6, i, i3);
                aklb.i.l++;
            }
        } else {
            aklb.c = i2 + 1;
        }
    }
}
