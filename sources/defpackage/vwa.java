package defpackage;

/* renamed from: vwa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vwa implements Runnable {
    private final vwi a;
    private final String b;
    private final vjf c;

    public vwa(vwi vwi, vjf vjf, String str) {
        this.a = vwi;
        this.c = vjf;
        this.b = str;
    }

    public final void run() {
        this.a.a(this.c, this.b);
    }
}
