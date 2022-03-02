package defpackage;

import android.content.SyncResult;
import java.util.HashMap;
import java.util.Map;

/* renamed from: leq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class leq {
    public static final ith a = new ith("SyncManager", "");
    public final lsm b;
    public final kkf c;
    public final lnn d;
    public final lfg e;
    public final ldv f;
    public final lfr g;
    public final Map h;
    public final Map i;
    public final long j = ((Long) jzq.aW.c()).longValue();
    public final long k = ((Long) jzq.aX.c()).longValue();
    public final long l = ((Long) jzq.aV.c()).longValue();
    public final int m = ((Integer) jzq.aU.c()).intValue();

    public leq(lsm lsm) {
        lfg lfg = new lfg(lsm);
        this.b = lsm;
        this.c = lsm.d;
        this.d = lsm.i;
        iva.a((Object) lfg);
        this.e = lfg;
        this.g = lsm.x;
        this.f = lsm.y;
        this.h = new HashMap();
        this.i = new HashMap();
    }

    public final long a(SyncResult syncResult, lff lff, kkz kkz, lnk lnk) {
        lea lea = new lea(this.b, kkz, lff.b());
        lff.a(lea, lnk, syncResult);
        long a2 = lea.a(syncResult, lff.a());
        lff.a(syncResult);
        return a2;
    }
}
