package defpackage;

/* renamed from: aemj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aemj extends aemn {
    final /* synthetic */ aemk a;

    public aemj(aemk aemk) {
        this.a = aemk;
    }

    public final void a(long j) {
        aemk aemk = this.a;
        aemk.d++;
        if (!aemk.a(aemk.a) && !this.a.a.isStarted()) {
            aemk aemk2 = this.a;
            if (aemk2.c == -1 || aemk2.d < 0) {
                Runnable runnable = aemk2.b;
                if (runnable != null) {
                    runnable.run();
                }
                this.a.a.start();
            }
        }
    }
}
