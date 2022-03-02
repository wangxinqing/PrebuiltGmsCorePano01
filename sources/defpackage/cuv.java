package defpackage;

/* renamed from: cuv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cuv implements Runnable {
    private final cuw a;
    private final csw b;

    public cuv(cuw cuw, csw csw) {
        this.a = cuw;
        this.b = csw;
    }

    public final void run() {
        cuw cuw = this.a;
        csw csw = this.b;
        cuw.b.a(csw);
    }
}
