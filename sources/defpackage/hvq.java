package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hvq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hvq {
    static final String[] a = {"_id", "hash", "play_logger_context_id", "log_event"};
    public final hvs b;
    public final jjj c;

    public hvq(jjj jjj, hvs hvs) {
        iva.a((Object) jjj);
        this.c = jjj;
        this.b = hvs;
    }

    private static int a(long j, byte[] bArr) {
        return jkd.a(bArr, bArr.length, (int) j);
    }

    static void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event");
        a(sQLiteDatabase);
    }

    /* access modifiers changed from: package-private */
    public final List c(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query(true, "log_event", new String[]{"play_logger_context_id"}, (String) null, (String[]) null, (String) null, (String) null, (String) null, (String) null);
        try {
            ArrayList arrayList = new ArrayList();
            while (query.moveToNext()) {
                arrayList.add(Long.valueOf(query.getLong(0)));
            }
            return arrayList;
        } finally {
            query.close();
        }
    }

    public static hvp a(String str, long[] jArr) {
        int length = jArr.length;
        if (length <= 512) {
            String[] strArr = new String[length];
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" IN (");
            int i = 0;
            while (i < jArr.length) {
                strArr[i] = Long.toString(jArr[i]);
                sb.append(i != 0 ? ", ?" : "?");
                i++;
            }
            sb.append(")");
            return new hvp(sb.toString(), strArr);
        }
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("ids.length exceeds 512: ");
        sb2.append(length);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* access modifiers changed from: package-private */
    public final int b(List list) {
        int i;
        if (list == null) {
            throw new IllegalArgumentException("ids cannot be null");
        } else if (list.size() > 512) {
            int size = list.size();
            StringBuilder sb = new StringBuilder(35);
            sb.append("ids.length exceeds 512: ");
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (list.isEmpty()) {
            return 0;
        } else {
            SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                SQLiteDatabase writableDatabase2 = this.c.getWritableDatabase();
                long[] a2 = a(list);
                if (a2.length != 0) {
                    hvp a3 = a("_id", a2);
                    hvs hvs = this.b;
                    SQLiteDatabase writableDatabase3 = this.c.getWritableDatabase();
                    String valueOf = String.valueOf(a3.a);
                    hvs.a(writableDatabase2, -DatabaseUtils.longForQuery(writableDatabase3, valueOf.length() == 0 ? new String("SELECT SUM(LENGTH(log_event)) FROM log_event WHERE ") : "SELECT SUM(LENGTH(log_event)) FROM log_event WHERE ".concat(valueOf), a3.b));
                    i = writableDatabase2.delete("log_event", a3.a, a3.b);
                } else {
                    i = 0;
                }
                writableDatabase.setTransactionSuccessful();
                return i;
            } catch (hvm e) {
                return 0;
            } finally {
                writableDatabase.endTransaction();
            }
        }
    }

    static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS log_event (_id INTEGER PRIMARY KEY AUTOINCREMENT, hash INTEGER NOT NULL, play_logger_context_id INTEGER NOT NULL, log_event BLOB NOT NULL, FOREIGN KEY (play_logger_context_id) REFERENCES play_logger_context (_id) ON DELETE RESTRICT ON UPDATE RESTRICT);");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS log_event_play_logger_context_id ON log_event (play_logger_context_id)");
    }

    static boolean a(long j, byte[] bArr, int i) {
        return bArr != null && a(j, bArr) == i;
    }

    public static long[] a(List list) {
        long[] jArr = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            jArr[i] = ((Long) list.get(i)).longValue();
        }
        return jArr;
    }

    /* access modifiers changed from: package-private */
    public final void a(SQLiteDatabase sQLiteDatabase, long j, byte[] bArr) {
        iva.a((Object) bArr);
        int a2 = a(j, bArr);
        ContentValues contentValues = new ContentValues();
        contentValues.put("hash", Integer.valueOf(a2));
        contentValues.put("play_logger_context_id", Long.valueOf(j));
        contentValues.put("log_event", bArr);
        try {
            long insertOrThrow = sQLiteDatabase.insertOrThrow("log_event", (String) null, contentValues);
            StringBuilder sb = new StringBuilder(31);
            sb.append("INSERT: id=");
            sb.append(insertOrThrow);
            sb.toString();
            if (insertOrThrow >= 0) {
                this.b.a(sQLiteDatabase, (long) bArr.length);
                return;
            }
            StringBuilder sb2 = new StringBuilder(68);
            sb2.append("INSERT: id=");
            sb2.append(insertOrThrow);
            sb2.append(" loggerContextId=");
            sb2.append(j);
            throw new SQLException(sb2.toString());
        } catch (hvm e) {
            StringBuilder sb3 = new StringBuilder(65);
            sb3.append("Error inserting LogEvent for loggerContextId=");
            sb3.append(j);
            throw new SQLException(sb3.toString(), e);
        }
    }
}
