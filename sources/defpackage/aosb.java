package defpackage;

/* renamed from: aosb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aosb extends aopj implements Runnable {
    private final Runnable a;

    public aosb(Runnable runnable) {
        amrl.a((Object) runnable);
        this.a = runnable;
    }

    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            a(th);
            amtb.a(th);
            throw new RuntimeException(th);
        }
    }
}
