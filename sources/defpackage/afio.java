package defpackage;

/* renamed from: afio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afio implements acvp {
    private final acwa a;
    private final aosh b;
    private final amqy c;

    public afio(acwa acwa, aosh aosh, amqy amqy) {
        this.a = acwa;
        this.b = aosh;
        this.c = amqy;
    }

    public final void a(acwa acwa) {
        acwa acwa2 = this.a;
        aosh aosh = this.b;
        amqy amqy = this.c;
        if (acwa2.b()) {
            aosh.b(amqy.a(acwa2.d()));
        } else {
            aosh.a((Throwable) acwa2.e());
        }
    }
}
