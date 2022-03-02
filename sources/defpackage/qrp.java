package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.List;

/* renamed from: qrp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qrp implements acvv {
    final /* synthetic */ qri a;
    final /* synthetic */ List b;
    final /* synthetic */ aosh c;
    final /* synthetic */ qru d;

    public qrp(qru qru, qri qri, List list, aosh aosh) {
        this.d = qru;
        this.a = qri;
        this.b = list;
        this.c = aosh;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        boolean z;
        Void voidR = (Void) obj;
        this.a.b(this.b.size());
        new Object[1][0] = "Mediastore indexing task succeeded.";
        this.c.b((Object) true);
        if (this.d.b()) {
            qsx qsx = this.d.c;
            List<qsw> list = this.b;
            try {
                SQLiteDatabase writableDatabase = qsx.b.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    for (qsw qsw : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("_ID", qsw.a);
                        contentValues.put("MEDIA_TYPE", qsw.b);
                        long insert = writableDatabase.insert("IntermediateStore", (String) null, contentValues);
                        if (insert < 0) {
                            qoi.c("Insert failed for fileId: %s", qsw.a);
                        }
                        if (insert >= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Boolean.valueOf(z).booleanValue();
                    }
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLiteException e) {
            }
        }
    }
}
