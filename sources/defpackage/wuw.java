package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: wuw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wuw extends jjj {
    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(wtq.a("logs", "timestamp INTEGER NOT NULL", "account_name TEXT", "page_id TEXT", "process_id INTEGER NOT NULL", "thread_id INTEGER NOT NULL", "log_tag TEXT NOT NULL", "message TEXT"));
    }

    /* access modifiers changed from: protected */
    public final void b(SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
            Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory;", (String[]) null);
            try {
                rawQuery.moveToFirst();
            } finally {
                rawQuery.close();
            }
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        xdt.a("PeopleLog", "Downgrading from version %d to %d", i, i2);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        xdt.a("PeopleLog", "Upgrading from version %d to %d", i, i2);
    }

    public wuw(Context context, String str) {
        super(context, str, str, 1);
    }
}
