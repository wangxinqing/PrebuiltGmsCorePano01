package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.TimeUnit;

/* renamed from: ilt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ilt implements ily {
    public static final long a = TimeUnit.DAYS.toSeconds(1);
    static final String b = String.format("CREATE TABLE IF NOT EXISTS %s (%s TEXT PRIMARY KEY NOT NULL, %s TEXT NOT NULL, %s INTEGER NOT NULL, %s INTEGER NOT NULL, %s INTEGER NOT NULL, %s INTEGER NOT NULL, %s INTEGER NOT NULL);", new Object[]{"crash_count", "crash_hash", "stack_trace", "count", "start_time", "latest_tme", "latest_error_dialog_time", "latest_notification_time"});

    static ilu a(Cursor cursor, String str) {
        if (cursor == null) {
            return null;
        }
        return new ilu(str, cursor.getString(cursor.getColumnIndexOrThrow("stack_trace")), cursor.getLong(cursor.getColumnIndexOrThrow("count")), cursor.getLong(cursor.getColumnIndexOrThrow("start_time")), cursor.getLong(cursor.getColumnIndexOrThrow("latest_tme")), cursor.getLong(cursor.getColumnIndexOrThrow("latest_error_dialog_time")), cursor.getLong(cursor.getColumnIndexOrThrow("latest_notification_time")));
    }

    public final void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("crash_count", "latest_tme < ?", new String[]{Long.toString(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - a)});
    }

    public final void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS crash_count");
        a(sQLiteDatabase);
    }

    public final void d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS crash_count");
        a(sQLiteDatabase);
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(b);
    }
}
