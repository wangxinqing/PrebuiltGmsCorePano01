package defpackage;

import android.database.Cursor;
import android.util.Log;

/* renamed from: xbu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xbu extends Thread {
    final /* synthetic */ xbw a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xbu(xbw xbw) {
        super("PeopleAggregator-contacts");
        this.a = xbw;
    }

    public final void run() {
        this.a.e.a("contacts query start");
        try {
            xbw xbw = this.a;
            xbw.a(xbw.b());
        } catch (Exception e) {
            Log.e("PeopleAggregator", "Error while quering contacts", e);
            this.a.a((Cursor) null);
        }
    }
}
