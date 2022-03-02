package defpackage;

/* renamed from: aghd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aghd implements Runnable {
    private final aghf a;
    private final Runnable b;

    public aghd(aghf aghf, Runnable runnable) {
        this.a = aghf;
        this.b = runnable;
    }

    public final void run() {
        aghf aghf = this.a;
        try {
            this.b.run();
        } catch (Throwable th) {
            aghf.a.a(th);
            throw th;
        }
    }
}
