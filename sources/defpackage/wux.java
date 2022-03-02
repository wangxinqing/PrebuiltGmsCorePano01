package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: wux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wux {
    private static wux e;
    public final jiq a;
    public final wuw b;
    public final ContentValues c = new ContentValues();
    public final wut d;
    private final Context f;

    public wux(Context context, String str) {
        this.f = context.getApplicationContext();
        this.b = new wuw(this.f, str);
        this.a = ycm.a(this.f);
        this.d = new wut(this.a);
    }

    public static synchronized wux a(Context context) {
        wux wux;
        synchronized (wux.class) {
            if (e == null) {
                e = new wux(context, "peoplelog.db");
            }
            wux = e;
        }
        return wux;
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase a() {
        try {
            return this.b.getWritableDatabase();
        } catch (SQLiteException e2) {
            return null;
        }
    }

    public final void a(SQLiteDatabase sQLiteDatabase, String str, String str2, int i, String str3, long j, int i2, String str4) {
        this.c.clear();
        this.c.put("account_name", str);
        this.c.put("page_id", str2);
        this.c.put("process_id", Integer.valueOf(i));
        this.c.put("message", str3);
        this.c.put("timestamp", Long.valueOf(j));
        this.c.put("thread_id", Integer.valueOf(i2));
        this.c.put("log_tag", str4);
        sQLiteDatabase.insert("logs", (String) null, this.c);
    }
}
