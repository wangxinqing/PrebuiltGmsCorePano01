package defpackage;

/* renamed from: absg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class absg implements acvs {
    private final absq a;

    public absg(absq absq) {
        this.a = absq;
    }

    public final void a(Exception exc) {
        absq absq = this.a;
        if (exc instanceof ibr) {
            absq.j.a(((ibr) exc).a());
        } else {
            absq.j.a(13);
        }
        absq.h.a((Throwable) exc);
    }
}
