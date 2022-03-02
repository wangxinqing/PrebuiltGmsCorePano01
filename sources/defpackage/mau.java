package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: mau  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mau {
    public final Context a;

    public final synchronized mas a(mav mav) {
        Cursor query;
        try {
            SQLiteDatabase readableDatabase = new mat(this).getReadableDatabase();
            readableDatabase.beginTransaction();
            try {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                StringBuilder sb = new StringBuilder(70);
                sb.append("a = ? AND b <= ");
                sb.append(currentTimeMillis);
                sb.append(" AND ");
                sb.append(currentTimeMillis);
                sb.append(" < (");
                sb.append("b");
                sb.append(" + ");
                sb.append("c");
                sb.append(")");
                query = readableDatabase.query("main", new String[]{"f", "d", "e", "c", "g"}, sb.toString(), new String[]{mav.toString()}, (String) null, (String) null, "b DESC", "1");
                if (query.moveToNext()) {
                    byte[] blob = query.getBlob(0);
                    mbh mbh = new mbh(query.getString(1));
                    mav.toString();
                    mas mas = new mas(blob, mbh, query.getLong(3), query.getBlob(4));
                    query.close();
                    readableDatabase.setTransactionSuccessful();
                    readableDatabase.endTransaction();
                    readableDatabase.close();
                    return mas;
                }
                query.close();
                readableDatabase.setTransactionSuccessful();
                readableDatabase.endTransaction();
                readableDatabase.close();
                return null;
            } catch (Throwable th) {
                readableDatabase.endTransaction();
                readableDatabase.close();
                throw th;
            }
        } catch (SQLiteException e) {
            throw new mah("Database read error.", e);
        }
    }

    public mau(Context context) {
        this.a = context;
    }

    public final synchronized void a(mav mav, mas mas) {
        SQLiteDatabase writableDatabase;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            ContentValues contentValues = new ContentValues();
            contentValues.put("a", mav.toString());
            contentValues.put("b", Long.valueOf(currentTimeMillis / 1000));
            contentValues.put("c", Long.valueOf(mas.c));
            contentValues.put("d", mas.b.a);
            contentValues.put("e", "");
            contentValues.put("f", mas.a);
            contentValues.put("g", mas.d);
            writableDatabase = new mat(this).getWritableDatabase();
            writableDatabase.beginTransaction();
            String[] strArr = {mav.toString()};
            if (mas.c <= 0) {
                writableDatabase.delete("main", "a = ?", strArr);
            } else if (writableDatabase.update("main", contentValues, "a = ?", strArr) == 0) {
                writableDatabase.insert("main", (String) null, contentValues);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (SQLiteException e) {
            throw new mah("Database access error.", e);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            writableDatabase.close();
            throw th;
        }
    }
}
