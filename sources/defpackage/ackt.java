package defpackage;

/* renamed from: ackt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ackt implements acvs {
    private final aclm a;

    public ackt(aclm aclm) {
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
