package defpackage;

/* renamed from: lem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lem implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ len b;

    public lem(len len, Runnable runnable) {
        this.b = len;
        this.a = runnable;
    }

    public final void run() {
        try {
            this.a.run();
            synchronized (this.b) {
                this.b.d = false;
            }
        } catch (Throwable th) {
            synchronized (this.b) {
                this.b.d = false;
                throw th;
            }
        }
    }
}
