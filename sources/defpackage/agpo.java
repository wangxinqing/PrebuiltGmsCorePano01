package defpackage;

import java.util.concurrent.Executor;

/* renamed from: agpo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agpo implements aoqa {
    private final agqm a;
    private final agpb b;
    private final agoy c;
    private final Executor d;

    public agpo(agqm agqm, agpb agpb, agoy agoy, Executor executor) {
        this.a = agqm;
        this.b = agpb;
        this.c = agoy;
        this.d = executor;
    }

    public final aorr a() {
        agqm agqm = this.a;
        agpb agpb = this.b;
        return aopr.a(agok.a(((afym) agqm.e.a()).a((Enum) ((agov) agpb).b), "DeletionsDownloader"), (aoqb) new agpp(agqm, agpb, this.c, this.d), agqm.i);
    }
}
