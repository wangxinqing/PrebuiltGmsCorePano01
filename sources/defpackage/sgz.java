package defpackage;

/* renamed from: sgz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class sgz implements aoqb {
    static final aoqb a = new sgz();

    private sgz() {
    }

    public final aorr a(Object obj) {
        Exception exc = (Exception) obj;
        amrl.a((Object) exc);
        amtb.a(exc);
        amtb.a((Throwable) exc, InterruptedException.class);
        throw new sln(exc);
    }
}
