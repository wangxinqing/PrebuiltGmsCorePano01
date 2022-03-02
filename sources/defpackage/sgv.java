package defpackage;

import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: sgv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sgv implements slm {
    public final afxm a;
    public final afji b;
    private final afvr c;

    public sgv(afvr afvr, afxm afxm, afji afji) {
        this.c = afvr;
        this.a = afxm;
        this.b = afji;
    }

    public static aorr a(aorr aorr) {
        return aooz.a(aorr, Exception.class, sgu.a, (Executor) aoqm.a);
    }

    public final aorr a(sls sls) {
        int i = 1;
        if (sls.b() == slr.ONEOFF && aygz.b()) {
            i = 2;
        }
        return a(aopr.a(this.c.a(i), sgq.a, (Executor) aoqm.a));
    }

    public final aorr a(sls sls, afxv afxv) {
        aorr aorr;
        if (!aygz.a.a().h()) {
            aorr = aorl.a((Object) true);
        } else if (sls.b() == slr.ONEOFF && afxv != null) {
            aorr = aooz.a(afxv.a(), Exception.class, (amqy) new sgs(this), (Executor) aoqm.a);
        } else {
            aorr = aorl.a((Object) true);
        }
        return aopr.a(aorr, (aoqb) new sgr(this, sls), (Executor) aoqm.a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Boolean a(Exception exc) {
        int i;
        afji afji = this.b;
        if (!(exc instanceof IOException)) {
            i = 6;
        } else {
            i = 5;
        }
        anie a2 = afji.a(i);
        a2.a((Throwable) exc);
        ((anih) ((anih) a2).a("sgv", "a", 77, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to check if account should be synced in one-off profile sync task!");
        return true;
    }
}
