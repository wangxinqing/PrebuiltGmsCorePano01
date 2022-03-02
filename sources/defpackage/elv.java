package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.auth.AccountChangeEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: elv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class elv {
    public static final iwd a = ehv.a("GoogleAccountHistoryStore");
    public static final String b = String.format("CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s INTEGER NOT NULL, %s INTEGER NOT NULL, %s TEXT);", new Object[]{"AccountHistory", "id", "account_name", "change_type", "event_index", "change_data"});
    public static final String c = String.format("CREATE TABLE IF NOT EXISTS %s ( %s TEXT NOT NULL, %s INTEGER NOT NULL, UNIQUE(%s));", new Object[]{"AccountEventIndex", "account_name", "event_index", "account_name"});
    private static final Object d = new Object();
    private static elv e;
    private final elu f;
    private final ReentrantLock g = new ReentrantLock();
    private String h;

    private elv(Context context) {
        elu elu = new elu(context, "google_account_history.db");
        iva.a((Object) elu);
        this.f = elu;
    }

    public static elv a(Context context) {
        synchronized (d) {
            if (e == null) {
                e = new elv(context.getApplicationContext());
            }
        }
        return e;
    }

    private final SQLiteDatabase b() {
        try {
            return this.f.getWritableDatabase();
        } catch (SQLiteException e2) {
            a.d("error getting writeable database", e2, new Object[0]);
            return null;
        }
    }

    public final String a() {
        this.g.lock();
        String uuid = UUID.randomUUID().toString();
        this.h = uuid;
        return uuid;
    }

    public final List a(String str, int i) {
        Cursor query;
        iva.a(this.g.isHeldByCurrentThread(), (Object) "#getEventsForUser invoked outside of transaction.");
        iva.a(str, (Object) "Account Name must be provided.");
        LinkedList linkedList = new LinkedList();
        SQLiteDatabase b2 = b();
        if (!(b2 == null || (query = b2.query("AccountHistory", (String[]) null, "account_name = ? AND event_index > ?", new String[]{str, String.valueOf(i)}, (String) null, (String) null, "event_index DESC", (String) null)) == null)) {
            try {
                if (query.moveToFirst()) {
                    do {
                        linkedList.add(new AccountChangeEvent(query.getLong(0), query.getString(1), query.getInt(2), query.getInt(3), query.getString(4)));
                    } while (query.moveToNext());
                }
            } finally {
                query.close();
            }
        }
        return linkedList;
    }

    public final void a(String str) {
        iva.a((Object) this.h, (Object) "Transaction must be started before it can be concluded.");
        boolean equals = this.h.equals(str);
        String str2 = this.h;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 44 + String.valueOf(str).length());
        sb.append("Transaction [");
        sb.append(str2);
        sb.append("] doesn't match supplied token ");
        sb.append(str);
        iva.b(equals, sb.toString());
        this.g.unlock();
    }

    public final void a(String str, int i, String str2) {
        Cursor query;
        String str3 = str;
        iva.a(this.g.isHeldByCurrentThread(), (Object) "#getEventsForUser invoked outside of transaction.");
        ContentValues contentValues = new ContentValues();
        iva.a(str3, (Object) "accountName must be provided");
        contentValues.put("account_name", str3);
        contentValues.put("change_data", str2);
        contentValues.put("change_type", Integer.valueOf(i));
        String format = String.format("REPLACE INTO %s(%s, %s) VALUES (?, COALESCE((SELECT %s FROM %s WHERE %s = ?) + 1, 1))", new Object[]{"AccountEventIndex", "account_name", "event_index", "event_index", "AccountEventIndex", "account_name"});
        SQLiteDatabase b2 = b();
        if (b2 != null) {
            b2.beginTransaction();
            try {
                b2.execSQL(format, new Object[]{str3, str3});
                query = b2.query("AccountEventIndex", new String[]{"event_index"}, "account_name = ?", new String[]{str3}, (String) null, (String) null, (String) null);
                if (query != null) {
                    if (query.moveToFirst()) {
                        contentValues.put("event_index", Integer.valueOf(query.getInt(0)));
                        b2.insert("AccountHistory", (String) null, contentValues);
                        b2.setTransactionSuccessful();
                    } else {
                        a.f("Failed to fetch event index.", new Object[0]);
                    }
                    query.close();
                }
                b2.endTransaction();
            } catch (Throwable th) {
                b2.endTransaction();
                throw th;
            }
        }
    }
}
