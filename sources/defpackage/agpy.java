package defpackage;

/* renamed from: agpy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agpy implements aoqb {
    private final agqh a;
    private final afyl b;

    public agpy(agqh agqh, afyl afyl) {
        this.a = agqh;
        this.b = afyl;
    }

    public final aorr a(Object obj) {
        agqh agqh = this.a;
        afyl afyl = this.b;
        Exception exc = (Exception) obj;
        agot agot = agqh.e.f;
        agpu agpu = new agpu(agqh, exc, afyl);
        atvl atvl = agqh.c;
        atvl.getClass();
        agot.a(agpu, new agpv(atvl));
        return aorl.a((Throwable) exc);
    }
}
