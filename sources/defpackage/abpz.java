package defpackage;

/* renamed from: abpz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abpz implements acvs {
    private final abqd a;

    public abpz(abqd abqd) {
        this.a = abqd;
    }

    public final void a(Exception exc) {
        abqd abqd = this.a;
        if (exc instanceof ibr) {
            abqd.e.a(((ibr) exc).a());
        } else {
            abqd.e.a(13);
        }
        abqd.d.a((Throwable) exc);
    }
}
