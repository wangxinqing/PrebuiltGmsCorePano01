package defpackage;

/* renamed from: afws  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afws implements amqy {
    private final afxl a;

    public afws(afxl afxl) {
        this.a = afxl;
    }

    public final Object a(Object obj) {
        afxl afxl = this.a;
        Exception exc = (Exception) obj;
        int b = sgc.b();
        if (b != 0) {
            anie c = ((anij) afxl.c.a()).c();
            c.a(b);
            c.a((Throwable) exc);
            c.a("afxl", "a", 284, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Photo download failed!");
        }
        return afur.g;
    }
}
