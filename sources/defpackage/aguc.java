package defpackage;

/* renamed from: aguc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aguc implements aoqb {
    private final agui a;
    private final afyl b;

    public aguc(agui agui, afyl afyl) {
        this.a = agui;
        this.b = afyl;
    }

    public final aorr a(Object obj) {
        agui agui = this.a;
        Exception exc = (Exception) obj;
        agui.g.h.b(new agug(exc, this.b), new aguh(agui));
        return aorl.a((Throwable) exc);
    }
}
