package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.TimeUnit;

/* renamed from: ima  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ima implements ily {
    static final String a = String.format("CREATE TABLE IF NOT EXISTS %s (%s TEXT NOT NULL PRIMARY KEY, %s INTEGER NOT NULL);", new Object[]{"event_tracker", "tag", "expiration_time"});

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(a);
    }

    public final void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("event_tracker", "expiration_time < ?", new String[]{Long.toString(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()))});
    }

    public final void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_tracker");
        a(sQLiteDatabase);
    }

    public final void d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_tracker");
        a(sQLiteDatabase);
    }
}
