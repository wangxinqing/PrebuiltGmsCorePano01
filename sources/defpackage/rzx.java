package defpackage;

/* renamed from: rzx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rzx {
    public final acwd a;
    private final Runnable b;

    public rzx(acwd acwd, Runnable runnable) {
        this.a = acwd;
        this.b = runnable;
    }

    public final void a() {
        this.b.run();
    }
}
