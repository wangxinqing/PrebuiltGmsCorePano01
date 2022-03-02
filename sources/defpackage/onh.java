package defpackage;

import android.content.Context;
import android.util.Log;

/* renamed from: onh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class onh extends jfx {
    final /* synthetic */ Context a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public onh(Context context) {
        super(10);
        this.a = context;
    }

    public final void run() {
        Context context = this.a;
        iva.b("Must be called from a worker thread.");
        if (context != null && context.getDatabasePath("history_query.db").exists() && !context.deleteDatabase("history_query.db")) {
            Log.e("gH_SearchQueryHDb", "Failed to delete old database file.");
        }
    }
}
