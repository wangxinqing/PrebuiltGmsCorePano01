package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.ContactsContract;
import android.util.Log;
import android.util.Pair;
import java.util.HashMap;
import java.util.List;

/* renamed from: wrc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wrc implements amsv {
    private final Context a;
    private wri b;
    private final wrg c;

    public wrc(Context context, wrg wrg) {
        this.a = context;
        this.c = wrg;
    }

    private final wri c() {
        if (this.b == null) {
            this.b = new wrj(new wqv(this.a.getContentResolver()));
        }
        return this.b;
    }

    /* renamed from: b */
    public final wqy a() {
        Cursor cursor;
        if (this.c.d) {
            SharedPreferences a2 = wqw.a(this.a);
            return c().a(this.a.getResources(), a2.getLong("contacts-logger-incremental-upload-timestamp", 0), a2.getLong("contacts-logger-full-upload-timestamp", 0));
        }
        wqy a3 = c().a(this.a.getResources(), 0, wqw.a(this.a).getLong("contacts-logger-full-upload-timestamp", 0));
        if (a3 != null && !a3.a.isEmpty()) {
            List list = a3.a;
            try {
                cursor = this.a.getContentResolver().query(ContactsContract.Data.CONTENT_URI, wre.f, (String) null, (String[]) null, "times_contacted DESC LIMIT 1000");
            } catch (SQLiteException e) {
                Log.e("ContactsLogger", "CP2 query exception.", e);
                cursor = null;
            }
            if (cursor == null) {
                Log.w("ContactsLogger", "CP2 query failed.");
            } else {
                HashMap hashMap = new HashMap();
                while (cursor.moveToNext()) {
                    hashMap.put(Long.valueOf(cursor.getLong(cursor.getColumnIndex("contact_id"))), Pair.create(Long.valueOf(cursor.getLong(cursor.getColumnIndex("times_contacted"))), Long.valueOf(cursor.getLong(cursor.getColumnIndex("last_time_contacted")))));
                }
                cursor.close();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    wrn wrn = (wrn) list.get(i);
                    Pair pair = (Pair) hashMap.get(Long.valueOf(wrn.a));
                    if (pair == null) {
                        xdt.a("ContactsLogger", "Could not get TimesContacted for contact = %d", Long.valueOf(wrn.a));
                    } else {
                        wrn.f = (double) ((Long) pair.first).longValue();
                        wrn.g = ((Long) pair.first).longValue();
                        wrn.h = ((Long) pair.second).longValue();
                        Object obj = pair.first;
                        Object obj2 = pair.second;
                    }
                }
            }
        }
        return a3;
    }
}
