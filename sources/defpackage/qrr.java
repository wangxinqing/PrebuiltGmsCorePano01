package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: qrr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qrr implements acvv {
    final /* synthetic */ aosh a;
    final /* synthetic */ Integer b;
    final /* synthetic */ qru c;

    public qrr(qru qru, aosh aosh, Integer num) {
        this.c = qru;
        this.a = aosh;
        this.b = num;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
        new Object[1][0] = "Mediastore corpus remove task succeeded.";
        this.a.b((Object) true);
        if (this.c.b()) {
            qsx qsx = this.c.c;
            Integer num = this.b;
            try {
                SQLiteDatabase writableDatabase = qsx.b.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    writableDatabase.delete("IntermediateStore", "MEDIA_TYPE=?", new String[]{String.valueOf(num)});
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLiteException e) {
            }
        }
    }
}
