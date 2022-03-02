package defpackage;

import android.accounts.Account;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: agqr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agqr implements agqn {
    public static final String[] a = {"CREATE TABLE continuation_token(token BLOB)", "CREATE TABLE push_payloads(id INTEGER PRIMARY KEY AUTOINCREMENT,timestamp_millis INTEGER, payload BLOB)"};
    public static final String[] b = {"continuation_token", "push_payloads"};
    public final SQLiteDatabase c;
    private final int d;
    private final long e;

    private agqr(SQLiteDatabase sQLiteDatabase, int i, long j) {
        this.c = sQLiteDatabase;
        this.d = i;
        this.e = j;
    }

    public static agqr a(File file, Account account, int i, long j, TimeUnit timeUnit) {
        try {
            SQLiteDatabase a2 = agtd.a(file, new agqp());
            agta.a(a2, account, new agqo(a2));
            return new agqr(a2, i, timeUnit.toMillis(j));
        } catch (SQLException e2) {
            throw new agsx(e2);
        }
    }

    public final void close() {
        try {
            this.c.close();
        } catch (SQLException e2) {
            throw new agsx(e2);
        }
    }

    private final void a() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.e;
        this.c.delete("push_payloads", "timestamp_millis<?", new String[]{Long.toString(currentTimeMillis - j)});
    }

    public final agqq a(boolean z) {
        Cursor query;
        Throwable th;
        amri amri;
        long j;
        Cursor query2;
        Throwable th2;
        amrl.b(this.c.isOpen());
        try {
            this.c.beginTransaction();
            try {
                a();
                query = this.c.query("continuation_token", new String[]{"token"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
                if (query.moveToNext()) {
                    amri = amri.b(auay.a(query.getBlob(0)));
                } else {
                    amri = ampu.a;
                }
                if (query != null) {
                    query.close();
                }
                amzt j2 = amzy.j();
                long j3 = Long.MIN_VALUE;
                if (z) {
                    query2 = this.c.query("push_payloads", new String[]{"id", "payload"}, (String) null, (String[]) null, (String) null, (String) null, "id");
                    while (query2.moveToNext()) {
                        j3 = Math.max(j3, query2.getLong(0));
                        j2.c(auay.a(query2.getBlob(1)));
                    }
                    if (query2 != null) {
                        query2.close();
                    }
                    j = j3;
                } else {
                    j = Long.MIN_VALUE;
                }
                agqq agqq = new agqq(this, amri, j2.a(), j);
                this.c.setTransactionSuccessful();
                this.c.endTransaction();
                return agqq;
                throw th2;
                throw th;
            } catch (Throwable th3) {
                this.c.endTransaction();
                throw th3;
            }
        } catch (SQLException e2) {
            throw new agsx(e2);
        }
    }

    public final void a(long j) {
        this.c.delete("push_payloads", "id<=?", new String[]{Long.toString(j)});
    }

    public final void a(auay auay) {
        amrl.b(this.c.isOpen());
        try {
            this.c.beginTransaction();
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("timestamp_millis", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("payload", auay.k());
            a(this.c.insertOrThrow("push_payloads", (String) null, contentValues) - ((long) this.d));
            a();
            this.c.setTransactionSuccessful();
            this.c.endTransaction();
        } catch (SQLException e2) {
            throw new agsx(e2);
        } catch (Throwable th) {
            this.c.endTransaction();
            throw th;
        }
    }
}
