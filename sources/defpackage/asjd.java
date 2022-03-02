package defpackage;

/* renamed from: asjd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class asjd implements Runnable {
    private final asjh a;
    private final ashq b;

    public asjd(asjh asjh, ashq ashq) {
        this.a = asjh;
        this.b = ashq;
    }

    public final void run() {
        asjh asjh = this.a;
        ashq ashq = this.b;
        try {
            jjg jjg = asil.a;
            ashq.run();
        } catch (Exception e) {
            anih anih = (anih) asil.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("asjh", "a", 113, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s ERROR in background job!", (Object) asjh.b);
            asjh.f = true;
        }
        asjh.c.c(asjh.e);
    }
}
