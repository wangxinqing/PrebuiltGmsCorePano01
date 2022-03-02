package defpackage;

/* renamed from: agqf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agqf implements aoqb {
    private final agqh a;
    private final amri b;
    private final atwm c;
    private final agqq d;

    public agqf(agqh agqh, agqq agqq, amri amri, atwm atwm) {
        this.a = agqh;
        this.d = agqq;
        this.b = amri;
        this.c = atwm;
    }

    public final aorr a(Object obj) {
        agqh agqh = this.a;
        agqq agqq = this.d;
        amri amri = this.b;
        atwm atwm = this.c;
        Void voidR = (Void) obj;
        try {
            agqq.a(amri);
            if (atwm.c) {
                return agqh.b();
            }
            return aorl.a((Object) null);
        } catch (agsx e) {
            return aorl.a((Throwable) new agog((Throwable) e));
        }
    }
}
