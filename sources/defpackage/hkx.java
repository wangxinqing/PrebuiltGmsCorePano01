package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: hkx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hkx {
    public static final hlv a = new hlz((auef) hmg.e.c(7), "encryption_key");
    public static final hlv b = new hlz((auef) aqpb.d.c(7), "metadata");
    public static final hlv c = new hlw("is_metadata_stale", true);
    public static final hlv d = new hlx("affiliation_expiration_timestamp_millis", 0L);
    public static final hlv e = new hlx("affiliation_version", 0L);
    public static final hlv f = new hlx("earliest_sync_time_millis", 0L);
    public static final hlv g = new hlx("sync_delay_on_server_error_millis", -1L);
    public static final hlv h = new hly("last_synced_times_millis");
    public static final fzh i = new hkv();
    private static final String n = ("SELECT value FROM account_data WHERE account=? AND key=?");
    public final pyr j;
    public final hle k;
    public final Object l = new Object();
    public final Map m = new HashMap();

    public hkx(Context context) {
        this.j = new pyr(context);
        this.k = hle.a(context);
    }

    public static hlv a(int i2) {
        StringBuilder sb = new StringBuilder(36);
        sb.append("is_sync_data_initialized.");
        sb.append(i2);
        return new hlw(sb.toString(), false);
    }

    public static hlv b(int i2) {
        StringBuilder sb = new StringBuilder(30);
        sb.append("is_sync_data_stale.");
        sb.append(i2);
        return new hlw(sb.toString(), true);
    }

    public static hlv c(int i2) {
        StringBuilder sb = new StringBuilder(25);
        sb.append("index_version.");
        sb.append(i2);
        return new hlx(sb.toString(), -1L);
    }

    public static hlv d(int i2) {
        StringBuilder sb = new StringBuilder(23);
        sb.append("subscribers.");
        sb.append(i2);
        return new hma(sb.toString());
    }

    public static hlv a(String str) {
        return new hlw(str.length() == 0 ? new String("is_sync_topic_subscribed.") : "is_sync_topic_subscribed.".concat(str), false);
    }

    private final Map a(pyv pyv) {
        synchronized (this.l) {
            Map map = (Map) this.m.get(pyv.d);
            if (map != null) {
                return map;
            }
            hkw hkw = new hkw();
            this.m.put(pyv.d, hkw);
            return hkw;
        }
    }

    public final Object a(pyv pyv, hlv hlv) {
        Object obj;
        SQLiteDatabase a2 = this.k.a();
        synchronized (this.l) {
            Map a3 = a(pyv);
            Object obj2 = a3.get(hlv.a);
            if (obj2 != null) {
                return obj2;
            }
            Cursor rawQuery = a2.rawQuery(n, new String[]{pyv.d, hlv.a});
            try {
                rawQuery.moveToFirst();
                byte[] bArr = null;
                while (!rawQuery.isAfterLast()) {
                    bArr = hll.a(rawQuery, "value");
                    rawQuery.moveToNext();
                }
                amri c2 = amri.c(bArr);
                if (c2.a()) {
                    obj = hlv.a((byte[]) c2.b());
                } else {
                    obj = hlv.b;
                }
                a3.put(hlv.a, obj);
                return obj;
            } finally {
                rawQuery.close();
            }
        }
    }

    public final void a(pyv pyv, hlv hlv, Object obj) {
        amri a2 = hlv.a(obj);
        SQLiteDatabase a3 = this.k.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("account", pyv.d);
        contentValues.put("key", hlv.a);
        contentValues.put("value", (byte[]) a2.c());
        synchronized (this.l) {
            hll.a(a3, "account_data", contentValues);
            a(pyv).put(hlv.a, obj);
        }
    }

    public final void a(pyv pyv, hlv... hlvArr) {
        SQLiteDatabase a2 = this.k.a();
        ArrayList arrayList = new ArrayList();
        for (hlv hlv : hlvArr) {
            arrayList.add(hlv.a);
        }
        synchronized (this.l) {
            String a3 = amre.a(',').a((Iterable) Collections.nCopies(arrayList.size(), "?"));
            StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 23);
            sb.append("account=? AND key IN (");
            sb.append(a3);
            sb.append(")");
            a2.delete("account_data", sb.toString(), (String[]) jhx.a((Object[][]) new String[][]{new String[]{pyv.d}, (String[]) arrayList.toArray(new String[0])}));
            Map a4 = a(pyv);
            for (hlv hlv2 : hlvArr) {
                a4.remove(hlv2.a);
            }
        }
    }
}
