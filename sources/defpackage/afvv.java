package defpackage;

/* renamed from: afvv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afvv implements amqy {
    private final afwo a;

    public afvv(afwo afwo) {
        this.a = afwo;
    }

    public final Object a(Object obj) {
        afwo afwo = this.a;
        Exception exc = (Exception) obj;
        int b = sgc.b();
        if (b != 0) {
            anie c = ((anij) afwo.c.a()).c();
            c.a(b);
            c.a((Throwable) exc);
            c.a("afwo", "a", 268, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Photo download failed!");
        }
        return afur.g;
    }
}
