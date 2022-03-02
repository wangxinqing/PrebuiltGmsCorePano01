package defpackage;

/* renamed from: acks  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class acks implements acvs {
    private final aclm a;

    public acks(aclm aclm) {
        this.a = aclm;
    }

    public final void a(Exception exc) {
        aclm aclm = this.a;
        if (exc instanceof ibr) {
            aclm.a.e("Error while trying to connect: ", exc, new Object[0]);
            aclm.b.m();
        }
    }
}
