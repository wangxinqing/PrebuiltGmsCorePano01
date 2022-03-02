package defpackage;

import com.google.android.gms.facs.cache.FacsCacheCallOptions;
import java.util.concurrent.Executor;

/* renamed from: agsc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agsc implements agrm {
    public final Object a = new Object();
    public volatile agsb b;
    public final agsk c;
    private aorr d = aorl.a((Object) null);

    public agsc(agsd agsd, agsk agsk) {
        amrl.a((Object) agsd);
        amrl.a((Object) agsk);
        this.c = agsk;
    }

    public static aorr a(aorr aorr) {
        return aopr.a(aorr, agrr.a, (Executor) aoqm.a);
    }

    public final aorr b(aorr aorr) {
        return aopr.a(aorr, (amqy) new agrs(this), (Executor) aoqm.a);
    }

    public final boolean b() {
        return this.b == null;
    }

    public final aorr a() {
        aorr a2;
        synchronized (this.a) {
            a2 = a((aoqa) new agru(this));
        }
        return a2;
    }

    public final aorr a(agsi agsi) {
        aorr aorr;
        agsk agsk = this.c;
        agsi agsi2 = agsi.FORCED_SYNC;
        int ordinal = agsi.ordinal();
        if (ordinal == 0) {
            meh meh = agsk.a;
            FacsCacheCallOptions a2 = agsk.a();
            iha b2 = ihb.b();
            b2.a = new mdw(a2);
            aorr = agsk.a(meh.a(b2.a()));
        } else if (ordinal == 1) {
            meh meh2 = agsk.a;
            FacsCacheCallOptions a3 = agsk.a();
            iha b3 = ihb.b();
            b3.a = new mdy(a3);
            aorr = agsk.a(meh2.a(b3.a()));
        } else {
            throw new AssertionError(agsi);
        }
        return aopr.a(aopr.a((aorr) aoqw.c(aorr), agrz.a, (Executor) aoqm.a), (aoqb) new agsa(), (Executor) aoqm.a);
    }

    public final aorr a(aoqa aoqa) {
        aorr a2 = aorl.b(this.d).a(aoqa, (Executor) aoqm.a);
        this.d = a(a2);
        return a2;
    }
}
