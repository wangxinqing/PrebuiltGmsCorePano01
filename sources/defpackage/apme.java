package defpackage;

/* renamed from: apme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class apme implements acvs {
    private final apmh a;

    public apme(apmh apmh) {
        this.a = apmh;
    }

    public final void a(Exception exc) {
        apmh apmh;
        apmh apmh2 = this.a;
        synchronized (apmh2.c.b) {
            if (apmh2.c.b.peek() == apmh2) {
                apmh2.c.b.remove();
                apmi apmi = apmh2.c;
                apmi.c = 0;
                apmh = (apmh) apmi.b.peek();
            } else {
                apmh = null;
            }
        }
        apmh2.b.b(exc);
        if (apmh != null) {
            apmh.a();
        }
    }
}
