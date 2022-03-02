package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: qsy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qsy extends jjj {
    private static qsy a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private qsy(Context context, String str) {
        super(context, str, str, 3);
        iva.a((Object) context);
    }

    public static synchronized qsy a(Context context) {
        qsy qsy;
        synchronized (qsy.class) {
            if (a == null) {
                a = new qsy(context, "mediastore-indexer.db");
            }
            qsy = a;
        }
        return qsy;
    }

    /* JADX INFO: finally extract failed */
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = qsx.c;
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS IntermediateStore");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS IntermediateStore (_ID INTEGER PRIMARY KEY ON CONFLICT REPLACE, MEDIA_TYPE INTEGER);");
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            sQLiteDatabase.beginTransaction();
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS PhotoTagStore");
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        int i = qsx.c;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS IntermediateStore (_ID INTEGER PRIMARY KEY ON CONFLICT REPLACE, MEDIA_TYPE INTEGER);");
    }
}
