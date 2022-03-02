package defpackage;

/* renamed from: cul  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cul implements Runnable {
    private final cuw a;
    private final cto b;

    public cul(cuw cuw, cto cto) {
        this.a = cuw;
        this.b = cto;
    }

    public final void run() {
        cuw cuw = this.a;
        cto cto = this.b;
        cuw.c.a(cto);
    }
}
