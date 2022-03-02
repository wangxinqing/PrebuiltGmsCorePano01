package defpackage;

/* renamed from: apzn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class apzn implements Runnable {
    private final apzt a;
    private final azxk b;
    private final baaf c;

    public apzn(apzt apzt, azxk azxk, baaf baaf) {
        this.a = apzt;
        this.b = azxk;
        this.c = baaf;
    }

    public final void run() {
        apzt apzt = this.a;
        apzt.a().a(this.b, this.c);
    }
}
