package defpackage;

import java.util.concurrent.Executor;

/* renamed from: sgr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class sgr implements aoqb {
    private final sgv a;
    private final sls b;

    public sgr(sgv sgv, sls sls) {
        this.a = sgv;
        this.b = sls;
    }

    public final aorr a(Object obj) {
        sgv sgv = this.a;
        sls sls = this.b;
        if (!((Boolean) obj).booleanValue()) {
            return aorl.a((Object) afup.a());
        }
        int i = 1;
        if (sls.b() == slr.ONEOFF && aygz.b()) {
            i = 2;
        }
        return sgv.a(aopr.a(sgv.a.a(i), sgt.a, (Executor) aoqm.a));
    }
}
