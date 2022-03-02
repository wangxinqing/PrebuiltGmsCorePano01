package defpackage;

import java.util.concurrent.Executor;

/* renamed from: agrn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class agrn implements aoqa {
    private final agsc a;

    public agrn(agsc agsc) {
        this.a = agsc;
    }

    public final aorr a() {
        agsc agsc = this.a;
        if (!agsc.b()) {
            return aorl.a((Object) atvr.IN_MEMORY_CACHE);
        }
        return agsc.b(aopr.a(aooz.a((aorr) aoqw.c(aopr.a(aorl.a((Object) ampu.a), agrw.a, (Executor) aoqm.a)), Exception.class, (aoqb) new agrx(agsc), (Executor) aoqm.a), (aoqb) new agry(agsc), (Executor) aoqm.a));
    }
}
