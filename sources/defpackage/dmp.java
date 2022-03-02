package defpackage;

import android.database.sqlite.SQLiteException;

/* renamed from: dmp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dmp extends dnb {
    final /* synthetic */ dms a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dmp(dms dms, dmd dmd) {
        super(dmd);
        this.a = dms;
    }

    public final void a() {
        dms dms = this.a;
        try {
            dmm dmm = dms.b;
            dkw.a();
            dmm.q();
            if (dmm.c.a(86400000)) {
                dmm.c.a();
                dmm.b("Deleting stale hits (if any)");
                dmm.a("Deleted stale hits, count", Integer.valueOf(dmm.v().delete("hits2", "hit_time < ?", new String[]{Long.toString(dmm.c().a() - 2592000000L)})));
            }
            dms.s();
        } catch (SQLiteException e) {
            dms.d("Failed to delete stale hits", e);
        }
        dnb dnb = dms.e;
        dms.f();
        dnb.a(86400000);
    }
}
