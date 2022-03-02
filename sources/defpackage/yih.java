package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: yih  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yih {
    public String a;
    public final String b;

    public yih(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    /* JADX INFO: finally extract failed */
    public static void a(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.beginTransaction();
        try {
            b(sQLiteDatabase, str);
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            yhj.a();
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    static void b(SQLiteDatabase sQLiteDatabase, String str) {
        String[] strArr = {str};
        sQLiteDatabase.delete("ApplicationStates", "packageName = ?", strArr);
        sQLiteDatabase.delete("LogSources", "packageName = ?", strArr);
        sQLiteDatabase.delete("WeakExperimentIds", "packageName = ?", strArr);
        sQLiteDatabase.delete("ExperimentTokens", "packageName = ?", strArr);
        sQLiteDatabase.delete("Flags", "packageName = ?", strArr);
        sQLiteDatabase.delete("FlagOverrides", "packageName = ?", strArr);
        sQLiteDatabase.delete("ApplicationTags", "packageName = ?", strArr);
        sQLiteDatabase.delete("CrossLoggedExperimentTokens", "toPackageName = ?", strArr);
        sQLiteDatabase.delete("CrossLoggedExperimentTokens", "fromPackageName = ?", strArr);
        sQLiteDatabase.delete("Packages", "packageName = ?", strArr);
        sQLiteDatabase.delete("GenericDimensions", "packageName = ?", strArr);
        sQLiteDatabase.delete("RequestTags", (String) null, (String[]) null);
    }
}
