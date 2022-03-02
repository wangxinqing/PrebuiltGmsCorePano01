package defpackage;

/* renamed from: aqae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aqae implements Runnable {
    private final aqag a;
    private final Runnable b;

    public aqae(aqag aqag, Runnable runnable) {
        this.a = aqag;
        this.b = runnable;
    }

    public final void run() {
        aqag aqag = this.a;
        Runnable runnable = this.b;
        if (aqag.d) {
            return;
        }
        if (aqag.b == null) {
            aqag.a.add(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            aqag.c.a(babj.a(th), new baaf());
        }
    }
}
