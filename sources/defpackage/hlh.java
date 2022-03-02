package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: hlh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hlh {
    public static final fzi a = new hlg();
    private static final iwd c = hir.b("FacetGroupStore");
    public final hle b;

    public hlh(Context context) {
        this.b = hle.a(context);
    }

    public final void a(List list) {
        SQLiteDatabase a2 = this.b.a();
        a2.beginTransaction();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                auuo auuo = (auuo) it.next();
                if (auuo.a.isEmpty()) {
                    c.d("Invalid facet group data.", new Object[0]);
                } else {
                    String str = ((auun) auuo.a.get(0)).b;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("id", str);
                    contentValues.put("value", auuo.k());
                    hll.a(a2, "facet_group_data", contentValues);
                    amzt j = amzy.j();
                    for (auun auun : auuo.a) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("facet_id", auun.b);
                        contentValues2.put("id", str);
                        j.c(contentValues2);
                    }
                    for (ContentValues a3 : j.a()) {
                        hll.a(a2, "facet_group_index", a3);
                    }
                }
            }
            a2.setTransactionSuccessful();
        } finally {
            a2.endTransaction();
        }
    }

    public final anax b(List list) {
        anax a2;
        SQLiteDatabase a3 = this.b.a();
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        String a4 = amre.a(", ").a((Iterable) Collections.nCopies(list.size(), "?"));
        StringBuilder sb = new StringBuilder(String.valueOf(a4).length() + 133);
        sb.append("SELECT DISTINCT(A.value) FROM facet_group_data AS A INNER JOIN facet_group_index AS A_IDX ON A.id=A_IDX.id WHERE A_IDX.facet_id IN (");
        sb.append(a4);
        sb.append(")");
        Cursor rawQuery = a3.rawQuery(sb.toString(), strArr);
        try {
            anav j = anax.j();
            rawQuery.moveToFirst();
            while (!rawQuery.isAfterLast()) {
                j.b((auuo) aucj.a((aucj) auuo.b, hll.a(rawQuery, "value")));
                rawQuery.moveToNext();
            }
            a2 = j.a();
        } catch (auda e) {
            c.d("Invalid facet group data.", e, new Object[0]);
            a2 = anfv.a;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
        rawQuery.close();
        return a2;
    }
}
