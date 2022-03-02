package defpackage;

/* renamed from: zpz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class zpz implements aoqb {
    static final aoqb a = new zpz();

    private zpz() {
    }

    public final aorr a(Object obj) {
        Exception exc = (Exception) obj;
        if ((exc instanceof zpv) || (exc instanceof zor)) {
            return aorl.a((Throwable) new zoy(exc));
        }
        return aorl.a((Throwable) new zoz(exc));
    }
}
