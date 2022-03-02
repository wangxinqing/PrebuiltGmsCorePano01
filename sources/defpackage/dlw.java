package defpackage;

import android.database.sqlite.SQLiteException;

/* renamed from: dlw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dlw implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ dly b;

    public dlw(dly dly, int i) {
        this.b = dly;
        this.a = i;
    }

    public final void run() {
        dms dms = this.b.a;
        int i = this.a;
        Integer valueOf = Integer.valueOf(i);
        iva.a((Object) valueOf);
        dkw.a();
        dms.q();
        dms.f();
        dms.a("Delete hits for appUid", valueOf);
        try {
            dmm dmm = dms.b;
            long j = (long) i;
            dkw.a();
            dmm.q();
            dmm.v().delete("hits2", "hit_app_id = ?", new String[]{Long.valueOf(j).toString()});
            dms.s();
        } catch (SQLiteException e) {
            dms.d("Failed to delete app hits from local database", e);
        }
    }
}
