package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;

/* renamed from: hth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hth {
    public static htg a(Context context, hvh hvh) {
        iva.a((Object) context);
        if (!awtj.a.a().a()) {
            try {
                anhk i = hvh.b().listIterator();
                while (i.hasNext()) {
                    if (((hvg) i.next()).a("METALOG_COUNTERS")) {
                        hol hol = new hol(context, "METALOG_COUNTERS", (String) null);
                        return new hte(context, hol, new hph(hol, "METALOG_COUNTERS", (int) awtj.a.a().d()));
                    }
                }
            } catch (SQLiteException e) {
                Log.e("MetaLoggerFactory", "Failed to check if log store has non metalog log source logs.", e);
            }
        }
        return new htf();
    }
}
