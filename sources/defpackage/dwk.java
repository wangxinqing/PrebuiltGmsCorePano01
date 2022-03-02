package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: dwk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dwk {
    private static dwk b;
    public final ReentrantLock a = new ReentrantLock();

    private dwk() {
    }

    public static synchronized dwk a() {
        dwk dwk;
        synchronized (dwk.class) {
            if (b == null) {
                b = new dwk();
            }
            dwk = b;
        }
        return dwk;
    }

    public final void a(Context context, String str, int i) {
        this.a.lock();
        try {
            SQLiteDatabase writableDatabase = dwl.a(context).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", Integer.valueOf(i));
            int update = writableDatabase.update("sms", contentValues, "invitation_id=?", new String[]{str});
        } catch (SQLiteException e) {
        } finally {
            this.a.unlock();
        }
    }
}
