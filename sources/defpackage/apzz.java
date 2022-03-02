package defpackage;

/* renamed from: apzz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class apzz implements Runnable {
    private final aqag a;
    private final azxk b;
    private final baaf c;

    public apzz(aqag aqag, azxk azxk, baaf baaf) {
        this.a = aqag;
        this.b = azxk;
        this.c = baaf;
    }

    public final void run() {
        aqag aqag = this.a;
        aqag.b.a(this.b, this.c);
    }
}
