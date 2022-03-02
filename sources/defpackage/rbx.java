package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: rbx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rbx {
    public static final /* synthetic */ int a = 0;
    private static final Object b = new Object();
    private static volatile apyb c;
    private static final amsv d = amta.a(rbu.a);

    public static apxx a(rca rca) {
        amrl.a((Object) rca);
        rbq rbq = new rbq();
        ihs b2 = ihs.b();
        awdx.a(b2);
        rbq.a = b2;
        jfz jfz = new jfz(Integer.MAX_VALUE, 10);
        awdx.a(jfz);
        rbq.b = jfz;
        awdx.a((Object) rbq.a, Context.class);
        awdx.a((Object) rbq.b, Executor.class);
        return (apxx) new rbr(rbq.a, rbq.b).a.a();
    }

    public static apyb a(int i) {
        ((anih) ((anih) ((jjg) d.a()).d()).a("rbx", "a", 68, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Returning a channel provider with trafficStatsTag=%d", i);
        if (c == null) {
            synchronized (b) {
                if (c == null) {
                    c = a(a(rca.a).a());
                }
            }
        }
        return a(c, i);
    }

    public static apyb a(int i, rca rca) {
        amrl.a((Object) rca);
        apxx a2 = a(rca);
        a2.b = null;
        apyb a3 = a(a2.a());
        ((anih) ((anih) ((jjg) d.a()).d()).a("rbx", "a", 93, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Creating an unauthenticated channel provider with trafficStatsTag=%d", i);
        return a(a3, i);
    }

    private static apyb a(apxy apxy) {
        rbs rbs = new rbs();
        awdx.a(apxy);
        rbs.a = apxy;
        awdx.a((Object) rbs.a, apxy.class);
        return (apyb) new rbt(rbs.a).a.a();
    }

    private static apyb a(apyb apyb, int i) {
        return new apya(apyh.a, new apxz(apyh.a, apyb, ihs.b().getApplicationInfo().uid), izj.a(i));
    }
}
