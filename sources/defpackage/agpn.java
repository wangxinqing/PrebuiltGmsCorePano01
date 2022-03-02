package defpackage;

/* renamed from: agpn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agpn implements aoqb {
    private final agqm a;
    private final auay b;

    public agpn(agqm agqm, auay auay) {
        this.a = agqm;
        this.b = auay;
    }

    public final aorr a(Object obj) {
        agqm agqm = this.a;
        Void voidR = (Void) obj;
        try {
            agqm.h.a(this.b);
            return aorl.a((Object) null);
        } catch (agsx e) {
            return aorl.a((Throwable) new agog((Throwable) e));
        }
    }
}
