package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: agqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agqm implements agpc {
    public final agny a;
    public final int b;
    public final int c;
    public final int d;
    public final amsv e;
    public final agot f;
    public final agod g;
    public final agqn h;
    public final Executor i;
    private final aoqu j = aoqu.a();

    public agqm(agny agny, int i2, int i3, int i4, amsv amsv, agot agot, agqn agqn, agod agod, Executor executor) {
        this.a = agny;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = amsv;
        this.f = agot;
        this.h = agqn;
        this.g = agod;
        this.i = executor;
    }

    public static atxf a(agpa agpa) {
        agpa agpa2 = agpa.UNKNOWN;
        int ordinal = agpa.ordinal();
        if (ordinal == 0) {
            return atxf.UNKNOWN_REQUEST_REASON;
        }
        if (ordinal == 1) {
            return atxf.INITIALIZATION_SYNC;
        }
        if (ordinal == 2) {
            return atxf.PERIODIC_SYNC;
        }
        if (ordinal != 3) {
            return atxf.UNKNOWN_REQUEST_REASON;
        }
        return atxf.PUSH_MESSAGE;
    }

    public final void close() {
        try {
            this.h.close();
        } finally {
            this.g.close();
        }
    }

    public final aorr a() {
        return aorl.a((Callable) new agpl(this), this.i);
    }

    public final aorr a(long j2) {
        return aopr.a(a(), (aoqb) new agpm(this, j2), this.i);
    }

    public final aorr a(agpb agpb, agoy agoy, Executor executor) {
        return this.j.a(new agpo(this, agpb, agoy, executor), this.i);
    }

    public final aorr a(auay auay) {
        return aopr.a(agok.a(((afym) this.e.a()).a((Enum) agpa.CHANGE_NOTIFICATION), "DeletionsDownloader"), (aoqb) new agpn(this, auay), this.i);
    }
}
