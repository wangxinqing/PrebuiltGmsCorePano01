package defpackage;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.util.Log;

/* renamed from: xbt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xbt extends Thread {
    final /* synthetic */ xbw a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xbt(xbw xbw) {
        super("PeopleAggregator-aggregator");
        this.a = xbw;
    }

    public final void run() {
        try {
            xbw xbw = this.a;
            boolean z = xbw.l;
            iva.b(xbw.g.b());
            xbw.e.a("agg start");
            Cursor cursor = xbw.k;
            if (cursor == null) {
                cursor = new MatrixCursor(xbr.a);
            }
            xbp a2 = xbw.a(new xbv(xbw.h), new xbv(xbw.i), cursor);
            xbw.e.a("agg finish");
            xbw.e.a();
            xbw.n.a(0, a2);
        } catch (Exception e) {
            Log.e("PeopleAggregator", "Unknown exception during aggregation", e);
            xbw xbw2 = this.a;
            boolean z2 = xbw.l;
            xbw2.c();
        }
    }
}
