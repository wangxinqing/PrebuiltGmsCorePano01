package defpackage;

import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.io.File;

/* renamed from: qbd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qbd {
    public static SQLiteDatabase a(jjj jjj, String str, boolean z) {
        String str2;
        try {
            return jjj.getWritableDatabase();
        } catch (SQLiteCantOpenDatabaseException e) {
            if (z) {
                File databasePath = ihs.b().getDatabasePath(str);
                if (databasePath.length() < 1) {
                    SQLiteDatabase.deleteDatabase(databasePath);
                    str2 = "The database file is corrupted and has zero byte, delete the file";
                    throw new SQLiteException(str2, e);
                }
            }
            str2 = "Failed to get a writable database";
            throw new SQLiteException(str2, e);
        }
    }
}
