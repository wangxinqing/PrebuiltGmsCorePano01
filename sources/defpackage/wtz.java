package defpackage;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.people.api.operations.DatabaseUpdateOperation;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: wtz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wtz {
    public static final ycd a = new yce();
    public static final ycw h = ybx.a;
    public static final String j = String.format(Locale.US, "(SELECT %s FROM %s WHERE %s=? AND %s IS NULL) ", new Object[]{"_id", "owners", "account_name", "page_gaia_id"});
    private static final String[] n = {"value"};
    private static wtz o;
    public final Context b;
    public final wty c;
    public wtx d;
    public final wue e;
    public final wtw f;
    public volatile CountDownLatch g = new CountDownLatch(1);
    public wmj i;
    private final Object k = new Object();
    private final wtu l = new wtu();
    private wtx m;

    private wtz(Context context) {
        this.b = context.getApplicationContext();
        this.c = new wty(this, this.b, "pluscontacts.db", "pluscontacts.db");
        this.f = new wtw(this);
        this.e = new wue(this, context);
        ycm.a(this.b);
    }

    public static int a(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            return (int) DatabaseUtils.longForQuery(sQLiteDatabase, "SELECT last_sync_status FROM owners WHERE account_name=? AND page_gaia_id IS NULL", new String[]{str});
        } catch (SQLiteDoneException e2) {
            return -1;
        }
    }

    private static int b(Context context, SQLiteDatabase sQLiteDatabase) {
        LinkedHashSet<String> linkedHashSet;
        String str;
        Cursor rawQuery;
        int i2;
        xip.a();
        if (Boolean.valueOf(aywy.a.a().aX()).booleanValue()) {
            linkedHashSet = new LinkedHashSet<>(ycx.a(context));
        } else {
            linkedHashSet = new LinkedHashSet<>(h.c(context));
        }
        sQLiteDatabase.beginTransaction();
        try {
            xip.a();
            if (!Boolean.valueOf(aywy.a.a().bD()).booleanValue()) {
                str = "SELECT DISTINCT account_name FROM owners";
            } else {
                str = "SELECT DISTINCT account_name FROM owners WHERE page_gaia_id IS NULL";
            }
            rawQuery = sQLiteDatabase.rawQuery(str, (String[]) null);
            rawQuery.moveToPosition(-1);
            while (true) {
                i2 = 0;
                if (!rawQuery.moveToNext()) {
                    break;
                }
                linkedHashSet.remove(rawQuery.getString(0));
            }
            rawQuery.close();
            ContentValues contentValues = new ContentValues();
            for (String str2 : linkedHashSet) {
                contentValues.clear();
                contentValues.put("account_name", str2);
                sQLiteDatabase.insertOrThrow("owners", (String) null, contentValues);
                i2++;
                wus.a(context, "PeopleDatabaseHelper", str2, (String) null, "Account added");
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            return i2;
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    public static void c(SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT sql FROM sqlite_master WHERE name='owners' AND type='table'", (String[]) null);
        rawQuery.moveToFirst();
        if (!rawQuery.getString(0).contains("cover_photo_id")) {
            sQLiteDatabase.execSQL("ALTER TABLE owners ADD COLUMN cover_photo_url TEXT;");
            sQLiteDatabase.execSQL("ALTER TABLE owners ADD COLUMN  cover_photo_height INTEGER NOT NULL DEFAULT 0;");
            sQLiteDatabase.execSQL("ALTER TABLE owners ADD COLUMN  cover_photo_width INTEGER NOT NULL DEFAULT 0;");
            sQLiteDatabase.execSQL("ALTER TABLE owners ADD COLUMN cover_photo_id TEXT;");
        }
        rawQuery.close();
    }

    static void d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE owners ADD COLUMN last_full_people_sync_time INTEGER NOT NULL DEFAULT 0;");
    }

    public static void e(SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("last_sync_status", 4);
        contentValues.put("last_successful_sync_time", 0);
        sQLiteDatabase.update("owners", contentValues, (String) null, (String[]) null);
    }

    public final int f() {
        return a("ac_people", "owners", "owner_id", "_id");
    }

    /* JADX INFO: finally extract failed */
    public final void g() {
        wmj wmj;
        int i2;
        int i3;
        int i4;
        wmj wmj2;
        xip.a();
        amsn b2 = amsn.b();
        int b3 = b(this.b, c().b);
        if (b3 > 0) {
            wmy a2 = wmy.a(this.b);
            a2.a((String) null, (String) null, 1);
            a2.b();
        }
        if (((Boolean) xhs.a.a()).booleanValue() && (wmj2 = this.i) != null) {
            wmj2.c = b3;
        }
        if (((Boolean) xht.a.a()).booleanValue() && this.i != null) {
            amsn b4 = amsn.b();
            Cursor rawQuery = b().b.rawQuery("SELECT COUNT(*),COUNT(DISTINCT account_name),SUM(CASE WHEN page_gaia_id IS NULL THEN 1 ELSE 0 END) FROM owners", (String[]) null);
            try {
                if (!rawQuery.moveToFirst()) {
                    i4 = 0;
                    i3 = 0;
                    i2 = 0;
                } else if (rawQuery.getColumnCount() == 3) {
                    i4 = rawQuery.getInt(0);
                    i3 = rawQuery.getInt(1);
                    i2 = rawQuery.getInt(2);
                } else {
                    i4 = 0;
                    i3 = 0;
                    i2 = 0;
                }
                rawQuery.close();
                wmj wmj3 = this.i;
                long a3 = b4.a(TimeUnit.MICROSECONDS);
                aucd o2 = xmp.f.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                xmp xmp = (xmp) o2.b;
                int i5 = xmp.a | 8;
                xmp.a = i5;
                xmp.e = i4;
                int i6 = 1 | i5;
                xmp.a = i6;
                xmp.b = i3;
                int i7 = i6 | 2;
                xmp.a = i7;
                xmp.c = i2;
                xmp.a = i7 | 4;
                xmp.d = a3;
                wmj3.g = (xmp) o2.i();
            } catch (Throwable th) {
                rawQuery.close();
                throw th;
            }
        }
        if (((Boolean) xhc.a.a()).booleanValue() && (wmj = this.i) != null) {
            wmj.i = b2.a(TimeUnit.MICROSECONDS);
        }
    }

    public static synchronized wtz a(Context context) {
        wtz wtz;
        synchronized (wtz.class) {
            if (o == null) {
                o = new wtz(context.getApplicationContext());
                if (!a()) {
                    b(context, o.c().b);
                    o.b("gcoreVersion", String.valueOf(jhg.d(context)));
                }
                context.startService(IntentOperation.getStartIntent(context, DatabaseUpdateOperation.class, "com.google.android.gms.people.api.operations.PREPARE_FOR_SYNC"));
            }
            wtz = o;
        }
        return wtz;
    }

    public final void d() {
        wtw wtw = this.f;
        wtw.b.clear();
        wtw.c.clear();
        wmy.a(this.b).b();
    }

    public final void f(SQLiteDatabase sQLiteDatabase) {
        wty.c(sQLiteDatabase);
        wty.f(sQLiteDatabase);
    }

    public final int e() {
        return a("ac_container", "ac_people", "people_id", "_id");
    }

    public final long c(String str) {
        return DatabaseUtils.queryNumEntries(b().b, str);
    }

    public final void d(String str) {
        b(str, "1");
    }

    public final long c(String str, String str2) {
        String b2 = this.f.b(str, (String) null);
        wtx b3 = b();
        StringBuilder sb = new StringBuilder(str2.length() + 31);
        sb.append("SELECT ");
        sb.append(str2);
        sb.append(" FROM owners WHERE _id=?");
        return b3.a(sb.toString(), new String[]{b2}, -1);
    }

    public final wtx c() {
        wtx wtx;
        ydd a2;
        boolean b2 = ayuw.b();
        synchronized (this.k) {
            if (this.m == null) {
                try {
                    this.m = new wtx(this.b, this, this.l, this.c.getWritableDatabase(), true);
                } catch (Exception e2) {
                    a2.a(e2, ((Double) xhi.a.a()).doubleValue());
                    if (b2 && (e2 instanceof SQLiteCantOpenDatabaseException)) {
                        return null;
                    }
                    throw e;
                } catch (SQLiteException e3) {
                    if (b2) {
                        if (e3 instanceof SQLiteCantOpenDatabaseException) {
                            return null;
                        }
                    }
                    xip.a();
                    if (Boolean.valueOf(aywy.a.a().bN()).booleanValue()) {
                        a2 = yde.a.a(this.b);
                        a2.a(e3, ((Double) xhi.a.a()).doubleValue());
                        File databasePath = ihs.b().getDatabasePath("pluscontacts.db");
                        databasePath.getAbsolutePath();
                        SQLiteDatabase.deleteDatabase(databasePath);
                        this.m = new wtx(this.b, this, this.l, this.c.getWritableDatabase(), true);
                    } else {
                        throw e3;
                    }
                }
            }
            wtx = this.m;
        }
        return wtx;
    }

    public static void a(Context context, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DELETE FROM sync_tokens;");
        xej a2 = xej.a(context);
        wus.b(a2.a, "PeopleSync", "requestAllFullSyncForDbUpgrade");
        anhj a3 = a2.c.d(a2.a).iterator();
        while (a3.hasNext()) {
            xej.a((Account) a3.next(), "com.google.android.gms.people", xej.a(false, false));
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DELETE FROM sync_tokens WHERE name = 'people';");
        sQLiteDatabase.execSQL("DELETE FROM sync_tokens WHERE name = 'gaiamap';");
        sQLiteDatabase.execSQL("DELETE FROM sync_tokens WHERE name = 'autocomplete';");
    }

    private static void a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", str);
        contentValues.put("value", str2);
        sQLiteDatabase.replace("properties", (String) null, contentValues);
    }

    public static void a(SQLiteDatabase sQLiteDatabase, List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sQLiteDatabase.execSQL((String) list.get(i2));
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase, Locale locale) {
        a(sQLiteDatabase, "dbLocale", locale.toString());
    }

    public static boolean a() {
        boolean equals = "1".equals(jli.a("gms.people.read_only", ""));
        if (equals) {
            xdt.a("PeopleDatabaseHelper", "%s is set.  Some features are disabled.", "gms.people.read_only");
        }
        return equals;
    }

    private final boolean a(String str, String[] strArr) {
        Cursor a2 = b().a(str, strArr);
        try {
            return a2.moveToFirst();
        } finally {
            a2.close();
        }
    }

    public static void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DELETE FROM people WHERE in_contacts=0 AND NOT EXISTS (SELECT * FROM circle_members AS cm WHERE cm.owner_id = people.owner_id AND cm.qualified_id = people.qualified_id)");
    }

    public final int a(String str, String str2, String str3, String str4) {
        SQLiteDatabase sQLiteDatabase = b().b;
        int length = str.length();
        int length2 = str2.length();
        StringBuilder sb = new StringBuilder(length + 73 + length2 + str3.length() + str4.length());
        sb.append("SELECT COUNT(1) FROM ");
        sb.append(str);
        sb.append(" WHERE  NOT EXISTS( SELECT 1 FROM ");
        sb.append(str2);
        sb.append(" AS p WHERE ");
        sb.append(str3);
        sb.append(" = p.");
        sb.append(str4);
        sb.append(")");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), (String[]) null);
        try {
            int i2 = 0;
            if (rawQuery.moveToFirst()) {
                i2 = rawQuery.getInt(0);
            }
            return i2;
        } finally {
            rawQuery.close();
        }
    }

    public final wtx b() {
        wtx wtx;
        synchronized (this.k) {
            if (this.d == null) {
                try {
                    this.d = new wtx(this.b, this, this.l, this.c.getReadableDatabase(), false);
                } catch (SQLiteCantOpenDatabaseException e2) {
                    if (ayuw.b()) {
                        return null;
                    }
                    throw e2;
                }
            }
            wtx = this.d;
        }
        return wtx;
    }

    public final long a(String str) {
        return c(str, "last_sync_finish_time");
    }

    public final String a(String str, String str2) {
        String str3;
        Cursor a2 = b().a("properties", n, "name=?", new String[]{str});
        try {
            if (a2.moveToFirst()) {
                str3 = a2.getString(0);
            } else {
                str3 = null;
            }
            return str3 != null ? str3 : str2;
        } finally {
            a2.close();
        }
    }

    public final void b(String str, String str2) {
        a(c().b, str, str2);
    }

    public final boolean b(String str) {
        String str2 = j;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 50);
        sb.append("SELECT 1 FROM people WHERE owner_id IN (");
        sb.append(str2);
        sb.append(" ) LIMIT 1");
        if (!a(sb.toString(), new String[]{str})) {
            String str3 = j;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 126);
            sb2.append("SELECT 1 FROM ac_people p JOIN ac_container c ON p._id=c.people_id WHERE (p.owner_id IN (");
            sb2.append(str3);
            sb2.append(" )) AND (c.container_type!=1) LIMIT 1");
            if (!a(sb2.toString(), new String[]{str})) {
                return false;
            }
        }
        return true;
    }
}
