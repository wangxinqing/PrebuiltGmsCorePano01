package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: yfu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yfu {
    public static final amsv a = amta.a(yft.a);

    public static Map a(SQLiteDatabase sQLiteDatabase, Set set) {
        Cursor query;
        try {
            query = sQLiteDatabase.query("Packages", new String[]{"packageName", "androidPackageName"}, (String) null, (String[]) null, (String) null, (String) null, (String) null, (String) null);
            if (query.getCount() <= 0) {
                HashMap hashMap = new HashMap();
                if (query != null) {
                    query.close();
                }
                return hashMap;
            }
            HashMap hashMap2 = new HashMap();
            while (query.moveToNext()) {
                String string = query.getString(0);
                String string2 = query.getString(1);
                if (set.contains(string)) {
                    ygv.a(hashMap2, string2, string);
                }
            }
            if (query != null) {
                query.close();
            }
            return hashMap2;
        } catch (SQLiteException e) {
            anih anih = (anih) yfw.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("yfu", "a", 244, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to get android package mapping.");
            return new HashMap();
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public static String b(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query("Packages", new String[]{"androidPackageName"}, "packageName = ?", new String[]{str}, (String) null, (String) null, (String) null, "1");
        try {
            if (query.moveToFirst()) {
                String string = query.getString(0);
                if (query != null) {
                    query.close();
                }
                return string;
            } else if (query == null) {
                return null;
            } else {
                query.close();
                return null;
            }
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        String str;
        String[] strArr = new String[8];
        strArr[0] = "packageName TEXT NOT NULL PRIMARY KEY";
        strArr[1] = "version INTEGER NOT NULL";
        strArr[2] = "params BLOB";
        strArr[3] = "dynamicParams BLOB";
        strArr[4] = "weak INTEGER NOT NULL";
        strArr[5] = "androidPackageName TEXT NOT NULL";
        strArr[6] = "isSynced INTEGER";
        if (((Integer) yfw.b.a()).intValue() < 23) {
            str = "serializedDeclarativeRegInfo BLOB DEFAULT NULL";
        } else {
            str = "serializedDeclarativeRegInfo BLOB DEFAULT NULL, configTier INTEGER DEFAULT NULL";
        }
        strArr[7] = str;
        sQLiteDatabase.execSQL(yfw.a("Packages", strArr));
        sQLiteDatabase.execSQL(yfw.a("Packages", "androidPackageName", "androidPackageName"));
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("isSynced", 1);
        sQLiteDatabase.update("Packages", contentValues, "packageName = ?", new String[]{str});
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str, apfg apfg) {
        ContentValues contentValues = new ContentValues();
        int a2 = apff.a(apfg.a);
        if (a2 == 0) {
            a2 = 1;
        }
        contentValues.put("configTier", Integer.valueOf(a2 - 1));
        sQLiteDatabase.update("Packages", contentValues, "packageName = ?", new String[]{str});
    }
}
