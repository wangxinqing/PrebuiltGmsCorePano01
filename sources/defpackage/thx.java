package defpackage;

/* renamed from: thx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class thx implements Runnable {
    private final tib a;
    private final tia b;
    private final Runnable c;

    public thx(tib tib, tia tia, Runnable runnable) {
        this.a = tib;
        this.b = tia;
        this.c = runnable;
    }

    public final void run() {
        tib tib = this.a;
        tia tia = this.b;
        Runnable runnable = this.c;
        aosh a2 = tib.a(tib.a, tia);
        runnable.run();
        a2.b((Object) null);
    }
}
