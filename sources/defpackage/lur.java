package defpackage;

/* renamed from: lur  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class lur implements Runnable {
    private final luu a;

    public lur(luu luu) {
        this.a = luu;
    }

    public final void run() {
        lut lut = this.a.b;
        if (lut != null) {
            lut.a();
        }
    }
}
