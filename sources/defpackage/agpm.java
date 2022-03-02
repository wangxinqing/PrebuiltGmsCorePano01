package defpackage;

import java.util.concurrent.Executor;

/* renamed from: agpm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agpm implements aoqb {
    private final agqm a;
    private final long b;

    public agpm(agqm agqm, long j) {
        this.a = agqm;
        this.b = j;
    }

    public final aorr a(Object obj) {
        agqm agqm = this.a;
        long j = this.b;
        if (((Boolean) obj).booleanValue()) {
            return aorl.a((Object) Boolean.TRUE);
        }
        agoz d = agpb.d();
        d.a(agpa.INITIALIZATION);
        d.a(j);
        d.a(false);
        agpb a2 = d.a();
        agqi agqi = new agqi();
        return aopr.a(agqm.a(a2, agqi, aoqm.a), (amqy) new agpq(agqi), (Executor) aoqm.a);
    }
}
