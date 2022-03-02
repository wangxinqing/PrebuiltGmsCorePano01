package defpackage;

/* renamed from: eh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class eh implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ ei b;

    public eh(ei eiVar, Runnable runnable) {
        this.b = eiVar;
        this.a = runnable;
    }

    public final void run() {
        try {
            this.a.run();
        } finally {
            this.b.a();
        }
    }
}
