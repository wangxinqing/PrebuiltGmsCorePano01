package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: aiwo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aiwo implements arnj {
    final /* synthetic */ aiwq a;

    public aiwo(aiwq aiwq) {
        this.a = aiwq;
    }

    public final void a(int i) {
        if (i == 0) {
            synchronized (this.a) {
                this.a.b = new aiwn(this);
                aiwq aiwq = this.a;
                aiwq.a.postDelayed(aiwq.b, TimeUnit.SECONDS.toMillis(2));
            }
            return;
        }
        this.a.c(5);
    }
}
