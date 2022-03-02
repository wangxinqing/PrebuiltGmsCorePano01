package defpackage;

/* renamed from: agsj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agsj implements acvp {
    private final aosh a;

    public agsj(aosh aosh) {
        this.a = aosh;
    }

    public final void a(acwa acwa) {
        aosh aosh = this.a;
        if (((acwi) acwa).d) {
            aosh.cancel(false);
        } else if (acwa.b()) {
            aosh.b(acwa.d());
        } else {
            Exception e = acwa.e();
            if (e != null) {
                aosh.a((Throwable) e);
                return;
            }
            throw new IllegalStateException();
        }
    }
}
