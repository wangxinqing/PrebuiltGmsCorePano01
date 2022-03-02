package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: iqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iqd extends jjj {
    public static volatile iqd a;
    public static final Object b = new Object();

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE downloads (_id INTEGER PRIMARY KEY AUTOINCREMENT,filename TEXT NOT NULL UNIQUE,url TEXT NOT NULL,sizeBytes INTEGER NOT NULL,sha1 TEXT NOT NULL,destination TEXT,minVersion INTEGER,maxVersion INTEGER,notificationTitle TEXT,notificationDescription TEXT,enabled INTEGER DEFAULT 0,retries INTEGER DEFAULT 0,dm_id INTEGER);");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i <= 0) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS downloads");
            onCreate(sQLiteDatabase);
        }
    }

    public iqd(Context context, String str) {
        super(context, str, str, 1);
    }
}
