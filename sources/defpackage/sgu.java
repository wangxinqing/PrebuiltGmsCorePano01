package defpackage;

/* renamed from: sgu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class sgu implements aoqb {
    static final aoqb a = new sgu();

    private sgu() {
    }

    public final aorr a(Object obj) {
        Exception exc = (Exception) obj;
        if (!(exc instanceof InterruptedException) && !(exc instanceof RuntimeException)) {
            exc = new sln(exc);
        }
        return aorl.a((Throwable) exc);
    }
}
