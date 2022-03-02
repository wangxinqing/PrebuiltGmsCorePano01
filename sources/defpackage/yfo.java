package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* renamed from: yfo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yfo {
    public static final String[] a;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("packageName");
        arrayList.add("version");
        arrayList.add("user");
        arrayList.add("isCommitted");
        arrayList.add("experimentToken");
        arrayList.add("serverToken");
        arrayList.add("configHash");
        arrayList.add("servingVersion");
        arrayList.add("tokensTag");
        arrayList.add("flagsHash");
        a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static Cursor a(SQLiteDatabase sQLiteDatabase, String str, int i, String str2, boolean z, String str3) {
        String str4;
        String[] strArr = {str3};
        String[] strArr2 = new String[4];
        strArr2[0] = str;
        strArr2[1] = Integer.toString(i);
        strArr2[2] = str2;
        if (!z) {
            str4 = "0";
        } else {
            str4 = "1";
        }
        strArr2[3] = str4;
        return sQLiteDatabase.query("ExperimentTokens", strArr, "packageName = ? AND version = ? AND user = ? AND isCommitted = ?", strArr2, (String) null, (String) null, (String) null);
    }

    public static String a(SQLiteDatabase sQLiteDatabase, String str, int i, String str2, boolean z) {
        Cursor a2 = a(sQLiteDatabase, str, i, str2, z, "configHash");
        try {
            if (!a2.moveToFirst()) {
                if (a2 != null) {
                    a2.close();
                }
                return "";
            }
            String string = a2.getString(0);
            if (a2 != null) {
                a2.close();
            }
            return string;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        String[] strArr = new String[9];
        strArr[0] = "packageName TEXT NOT NULL";
        strArr[1] = "version INTEGER NOT NULL";
        strArr[2] = "user TEXT NOT NULL";
        strArr[3] = "isCommitted INTEGER NOT NULL";
        strArr[4] = "experimentToken BLOB NOT NULL";
        strArr[5] = "serverToken TEXT NOT NULL";
        strArr[6] = "configHash TEXT NOT NULL DEFAULT ''";
        strArr[7] = "servingVersion INTEGER NOT NULL DEFAULT 0";
        String valueOf = String.valueOf(yfw.a("packageName", "version", "user", "isCommitted"));
        strArr[8] = valueOf.length() == 0 ? new String("tokensTag BLOB DEFAULT NULL, flagsHash INTEGER DEFAULT NULL") : "tokensTag BLOB DEFAULT NULL, flagsHash INTEGER DEFAULT NULL".concat(valueOf);
        sQLiteDatabase.execSQL(yfw.a("ExperimentTokens", strArr));
        sQLiteDatabase.execSQL(yfw.a("ExperimentTokens", "committed", "packageName", "version", "user", "isCommitted"));
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str, String str2, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tokensTag", new byte[0]);
        contentValues.put("experimentToken", new byte[0]);
        sQLiteDatabase.update("ExperimentTokens", contentValues, "packageName = ? AND user = ? AND version = ?", new String[]{str, str2, Integer.toString(i)});
    }
}
