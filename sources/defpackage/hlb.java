package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.List;

/* renamed from: hlb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hlb {
    public static final fzi a = new hla();
    private static final iwd c = hir.b("AffiliationStore");
    public final hle b;

    public hlb(Context context) {
        this.b = hle.a(context);
    }

    public final amri a(String str) {
        amri amri;
        String a2 = hiq.a(str);
        SQLiteDatabase a3 = this.b.a();
        StringBuilder sb = new StringBuilder(141);
        sb.append("SELECT A.value FROM affiliation_data AS A INNER JOIN affiliation_index AS A_IDX ON A.id=A_IDX.id WHERE (A_IDX.facet_id=? OR A_IDX.facet_id=?)");
        Cursor rawQuery = a3.rawQuery(sb.toString(), new String[]{a2.substring(0, a2.length() - 1), a2});
        try {
            rawQuery.moveToFirst();
            if (!rawQuery.isAfterLast()) {
                auum auum = (auum) aucj.a((aucj) auum.b, hll.a(rawQuery, "value"));
                aucd aucd = (aucd) auum.c(5);
                aucd.a((aucj) auum);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                ((auum) aucd.b).a = aucj.s();
                for (auun auun : auum.a) {
                    aucd aucd2 = (aucd) auun.c(5);
                    aucd2.a((aucj) auun);
                    String a4 = hiq.a(auun.b);
                    if (aucd2.c) {
                        aucd2.c();
                        aucd2.c = false;
                    }
                    auun auun2 = (auun) aucd2.b;
                    auun auun3 = auun.c;
                    a4.getClass();
                    auun2.a |= 1;
                    auun2.b = a4;
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    auum auum2 = (auum) aucd.b;
                    auun auun4 = (auun) aucd2.i();
                    auun4.getClass();
                    auum2.c();
                    auum2.a.add(auun4);
                }
                amri = amri.b((auum) aucd.i());
            } else {
                amri = ampu.a;
            }
        } catch (auda e) {
            c.d("Invalid affiliation data.", e, new Object[0]);
            amri = ampu.a;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
        rawQuery.close();
        return amri;
    }

    public final void a(List list) {
        SQLiteDatabase a2 = this.b.a();
        a2.beginTransaction();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                auum auum = (auum) it.next();
                if (auum.a.isEmpty()) {
                    c.d("Invalid affiliation data.", new Object[0]);
                } else {
                    String str = ((auun) auum.a.get(0)).b;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("id", str);
                    contentValues.put("value", auum.k());
                    hll.a(a2, "affiliation_data", contentValues);
                    amzt j = amzy.j();
                    for (auun auun : auum.a) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("facet_id", auun.b);
                        contentValues2.put("id", str);
                        j.c(contentValues2);
                    }
                    for (ContentValues a3 : j.a()) {
                        hll.a(a2, "affiliation_index", a3);
                    }
                }
            }
            a2.setTransactionSuccessful();
        } finally {
            a2.endTransaction();
        }
    }
}
