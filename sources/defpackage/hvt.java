package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: hvt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hvt {
    public static final String[] a = {"_id", "play_logger_context", "qos_tier"};
    private static final String[] c = {"_id", "hash", "play_logger_context", "qos_tier"};
    public final jjj b;

    public hvt(jjj jjj) {
        iva.a((Object) jjj);
        this.b = jjj;
    }

    public static int a(byte[] bArr) {
        return jkd.a(bArr, bArr.length, 0);
    }

    static void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS play_logger_context");
        a(sQLiteDatabase);
    }

    static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS play_logger_context (_id INTEGER PRIMARY KEY AUTOINCREMENT, hash INTEGER NOT NULL, play_logger_context BLOB NOT NULL, qos_tier INTEGER NOT NULL);");
    }

    static boolean a(byte[] bArr, int i) {
        return bArr != null && a(bArr) == i;
    }

    /* access modifiers changed from: package-private */
    public final Cursor a() {
        return a(c, (String) null, (String[]) null);
    }

    public final Cursor a(String[] strArr, String str, String[] strArr2) {
        return this.b.getWritableDatabase().query("play_logger_context", strArr, str, strArr2, (String) null, (String) null, (String) null);
    }
}
