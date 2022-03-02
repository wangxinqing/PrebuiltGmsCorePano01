package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: mbb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mbb {
    public final jjj a;
    public final lyp b;

    public mbb(Context context, String str) {
        this.a = new mba(context, str);
        this.b = lyp.a(context);
    }

    public final void a(byte[] bArr) {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = this.a.getWritableDatabase();
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("a", bArr);
            if (writableDatabase.update("t", contentValues, (String) null, (String[]) null) == 0) {
                writableDatabase.insert("t", (String) null, contentValues);
            }
            writableDatabase.close();
        } catch (RuntimeException e) {
            this.b.a((Throwable) e);
        } catch (Throwable th) {
            writableDatabase.close();
            throw th;
        }
    }
}
