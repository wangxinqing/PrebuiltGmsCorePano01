package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;

/* renamed from: ntq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ntq extends jjj {
    private final Context a;

    private final SQLiteDatabase a(boolean z) {
        int an = (int) axlc.a.a().an();
        int i = 0;
        while (i < an) {
            try {
                if (axlc.a.a().am() && i == an - 1) {
                    this.a.deleteDatabase(getDatabaseName());
                }
                if (!z) {
                    return getReadableDatabase();
                }
                return getWritableDatabase();
            } catch (SQLiteException e) {
                StringBuilder sb = new StringBuilder(49);
                sb.append("Failed to open RMQ database. attempt: ");
                sb.append(i);
                Log.e("GCM", sb.toString(), e);
                i++;
            }
        }
        return null;
    }

    public final SQLiteDatabase b() {
        return a(true);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public ntq(Context context, String str) {
        super(context, str, str, 1);
        this.a = context;
    }

    public final SQLiteDatabase a() {
        return a(false);
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create TABLE outgoingRmqMessages (_id INTEGER PRIMARY KEY,rmq_id INTEGER,type INTEGER,ts INTEGER,data BLOB);");
        sQLiteDatabase.execSQL("create TABLE lastrmqid (_id INTEGER PRIMARY KEY,rmq_id INTEGER);");
        sQLiteDatabase.execSQL("create TABLE s2dRmqIds (_id INTEGER PRIMARY KEY,rmq_id INTEGER);");
    }
}
