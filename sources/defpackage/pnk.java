package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: pnk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pnk {
    public static final CharSequence a(long j) {
        return j != 0 ? new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US).format(new Date(j)) : "0";
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str, PrintWriter printWriter, String str2) {
        Cursor rawQuery;
        a(printWriter, str, "Table ", str2, ":");
        String concat = str.concat("  ");
        try {
            rawQuery = sQLiteDatabase.rawQuery(str2.length() == 0 ? new String("SELECT * FROM ") : "SELECT * FROM ".concat(str2), (String[]) null);
            if (rawQuery != null) {
                a(printWriter, concat, TextUtils.join("|", rawQuery.getColumnNames()));
                int columnCount = rawQuery.getColumnCount();
                StringBuilder sb = new StringBuilder();
                while (rawQuery.moveToNext()) {
                    sb.setLength(0);
                    for (int i = 0; i < columnCount; i++) {
                        sb.append(rawQuery.getString(i));
                        sb.append('|');
                    }
                    a(printWriter, concat, sb.toString());
                }
                rawQuery.close();
            }
        } catch (SQLiteException e) {
            if (e.getMessage() != null) {
                a(printWriter, concat, e.getMessage());
            }
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public static void a(PrintWriter printWriter, Object... objArr) {
        for (Object valueOf : objArr) {
            printWriter.print(String.valueOf(valueOf));
        }
        printWriter.println();
    }
}
