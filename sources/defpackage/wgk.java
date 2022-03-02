package defpackage;

/* renamed from: wgk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wgk implements Runnable {
    public final aosh a = aosh.f();
    private final Runnable b;

    public wgk(Runnable runnable) {
        this.b = runnable;
    }

    public final void run() {
        this.b.run();
        this.a.a((Throwable) new RuntimeException("DiscoveryCancellationRunnable timed out."));
    }
}
