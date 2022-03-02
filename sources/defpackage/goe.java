package defpackage;

/* renamed from: goe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class goe implements acvs {
    private final goj a;

    public goe(goj goj) {
        this.a = goj;
    }

    public final void a(Exception exc) {
        this.a.c.a("FAILURE");
        goj.a.d("Failed to get consent status. Not logging to clearcut", new Object[0]);
    }
}
