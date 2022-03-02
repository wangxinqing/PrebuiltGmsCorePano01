package defpackage;

import java.util.concurrent.Executor;

/* renamed from: agpp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agpp implements aoqb {
    private final agqm a;
    private final agpb b;
    private final agoy c;
    private final Executor d;

    public agpp(agqm agqm, agpb agpb, agoy agoy, Executor executor) {
        this.a = agqm;
        this.b = agpb;
        this.c = agoy;
        this.d = executor;
    }

    public final aorr a(Object obj) {
        agqm agqm = this.a;
        Void voidR = (Void) obj;
        return aorl.a((aoqa) new agqh(agqm, this.b, this.c, this.d), agqm.i);
    }
}
