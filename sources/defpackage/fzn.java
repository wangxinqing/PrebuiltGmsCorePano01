package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: fzn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fzn {
    static {
        fzn.class.getSimpleName();
    }

    public static String a(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        StringBuilder sb = new StringBuilder(128);
        sb.append("CREATE INDEX IF NOT EXISTS idx_");
        sb.append(str);
        for (String append : strArr) {
            sb.append('_');
            sb.append(append);
        }
        sb.append(" ON ");
        sb.append(str);
        sb.append('(');
        for (int i = 0; i < strArr.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(strArr[i]);
        }
        sb.append(");");
        sQLiteDatabase.execSQL(sb.toString());
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String[] strArr2, String[] strArr3) {
        boolean z;
        int i = 0;
        if (strArr3 == null || strArr3.length <= 0) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS ");
        sb.append(str);
        sb.append('(');
        int i2 = 0;
        while (true) {
            int length = strArr.length;
            if (i2 >= length) {
                break;
            }
            sb.append(strArr[i2]);
            sb.append(' ');
            sb.append(strArr2[i2]);
            if (z || i2 + 1 < length) {
                sb.append(',');
            }
            i2++;
        }
        if (z) {
            while (true) {
                int length2 = strArr3.length;
                if (i >= length2) {
                    break;
                }
                sb.append(strArr3[i]);
                i++;
                if (i < length2) {
                    sb.append(',');
                }
            }
        }
        sb.append(");");
        sQLiteDatabase.execSQL(sb.toString());
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("Creating table: ");
        } else {
            "Creating table: ".concat(valueOf);
        }
    }
}
