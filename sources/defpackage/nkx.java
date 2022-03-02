package defpackage;

/* renamed from: nkx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class nkx implements Runnable {
    private final jff a;
    private final Runnable b;

    public nkx(jff jff, Runnable runnable) {
        this.a = jff;
        this.b = runnable;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
