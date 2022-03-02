package defpackage;

import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.MdhFootprint;
import com.google.android.gms.mdh.SyncStatus;

/* renamed from: pgi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pgi {
    public final auky a;
    public final MdhFootprint b;
    public final LatestFootprintFilter c;
    public final amzy d;
    public final SyncStatus e;

    public pgi(auky auky, MdhFootprint mdhFootprint) {
        this.a = auky;
        this.b = mdhFootprint;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public pgi(LatestFootprintFilter latestFootprintFilter, Iterable iterable) {
        this.a = null;
        this.b = null;
        this.c = latestFootprintFilter;
        this.d = amzy.a(iterable);
        this.e = null;
    }

    public pgi(SyncStatus syncStatus) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = syncStatus;
    }
}
