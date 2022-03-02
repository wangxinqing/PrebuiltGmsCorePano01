package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.List;

/* renamed from: hlq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hlq {
    public static final fzi a = new hlp();
    public final hle b;

    public hlq(Context context) {
        this.b = hle.a(context);
    }

    public final void a(hlj hlj, pyv pyv, List list) {
        SQLiteDatabase a2 = this.b.a();
        a2.beginTransaction();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ContentValues contentValues = (ContentValues) it.next();
                contentValues.put("account", pyv.d);
                hll.a(a2, hlj.a(), contentValues);
            }
            a2.setTransactionSuccessful();
        } finally {
            a2.endTransaction();
        }
    }
}
