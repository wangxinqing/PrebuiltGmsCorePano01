package defpackage;

/* renamed from: aqbe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aqbe implements Runnable {
    private final aqbq a;
    private final Runnable b;

    public aqbe(aqbq aqbq, Runnable runnable) {
        this.a = aqbq;
        this.b = runnable;
    }

    public final void run() {
        aqbq aqbq = this.a;
        try {
            this.b.run();
        } catch (Throwable th) {
            azxk azxk = aqbq.e;
            if (azxk != null) {
                azxk.a(babj.a(th), new baaf());
                azxl azxl = aqbq.h;
                if (azxl != null && aqbq.d.e == 4) {
                    azxl.a((String) null, th);
                }
            }
        }
    }
}
