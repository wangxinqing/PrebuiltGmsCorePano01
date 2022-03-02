package defpackage;

import android.content.SyncResult;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: lda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lda {
    public static final ith a = new ith("PreparedSyncMoreImpl", "");
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final lsm c;
    public final kkz d;
    public final koa e;
    public final lcu f;
    public final SyncResult g;

    public lda(lsm lsm, kkz kkz, koa koa, ldz ldz, SyncResult syncResult) {
        iva.a((Object) lsm);
        this.c = lsm;
        this.d = kkz;
        this.e = koa;
        this.f = new lcu(ldz);
        this.g = syncResult;
    }

    public final lcy a(boolean z) {
        return new lcy(z, this.f.a().size(), this.g.hasSoftError());
    }

    public final String toString() {
        return String.format(Locale.US, "PreparedSyncMore[%s]", new Object[]{this.d.a});
    }
}
