package defpackage;

/* renamed from: vix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vix implements Runnable {
    private final viy a;
    private final String b;

    public vix(viy viy, String str) {
        this.a = viy;
        this.b = str;
    }

    public final void run() {
        viy viy = this.a;
        viy.a.a(this.b, false);
    }
}
