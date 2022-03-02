package defpackage;

import java.util.concurrent.Executor;

/* renamed from: sfo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sfo implements slh {
    private final afvr a;
    private final afxm b;

    public sfo(afvr afvr, afxm afxm) {
        this.a = afvr;
        this.b = afxm;
    }

    public static afup a(afup afup) {
        return afup.a(((audx) afup.a).k()).a();
    }

    public final aorr b(set set, byte[] bArr) {
        set set2 = set.UNKNOWN;
        int ordinal = set.ordinal();
        if (ordinal == 1) {
            return aooz.a(aopr.a(this.b.a(1), sfl.a, (Executor) aoqm.a), Exception.class, sfm.a, (Executor) aoqm.a);
        }
        if (ordinal == 2) {
            return aooz.a(aopr.a(this.b.a((aqxk) a(sey.a, bArr)), sez.a, (Executor) aoqm.a), Exception.class, sfa.a, (Executor) aoqm.a);
        }
        if (ordinal == 3) {
            return aooz.a(aopr.a(this.b.a((aqxi) a(sfb.a, bArr)), sfc.a, (Executor) aoqm.a), Exception.class, sfd.a, (Executor) aoqm.a);
        }
        throw new UnsupportedOperationException();
    }

    private static audx a(sfn sfn, byte[] bArr) {
        try {
            return sfn.a(bArr);
        } catch (auda e) {
            throw new slf(e);
        }
    }

    public final aorr a(set set, byte[] bArr) {
        set set2 = set.UNKNOWN;
        int ordinal = set.ordinal();
        if (ordinal == 1) {
            return aooz.a(aopr.a(this.a.a(1), sex.a, (Executor) aoqm.a), Exception.class, sfe.a, (Executor) aoqm.a);
        }
        if (ordinal == 2) {
            return aooz.a(aopr.a(this.a.a((aqxk) a(sff.a, bArr)), sfg.a, (Executor) aoqm.a), Exception.class, sfh.a, (Executor) aoqm.a);
        }
        if (ordinal == 3) {
            return aooz.a(aopr.a(this.a.a((aqxi) a(sfi.a, bArr)), sfj.a, (Executor) aoqm.a), Exception.class, sfk.a, (Executor) aoqm.a);
        }
        throw new UnsupportedOperationException();
    }

    public final slq a() {
        return slq.PROFILE_SYNC;
    }
}
