package defpackage;

/* renamed from: afnc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afnc implements Runnable {
    final /* synthetic */ afnd a;
    private final Runnable b;

    public afnc(afnd afnd, Runnable runnable) {
        this.a = afnd;
        this.b = runnable;
    }

    public final void run() {
        try {
            this.b.run();
        } finally {
            this.a.a();
        }
    }
}
