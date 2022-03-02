package defpackage;

import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.icing.proxy.InternalIcingCorporaChimeraProvider;

/* renamed from: pnp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pnp extends dvf {
    private static pnp f;
    public final Context d;
    public pmr e;

    public pnp(Context context) {
        super(context, "icing_contacts.db", 1, new dvg("com.google.android.gms.icing.proxy", pnq.a()));
        this.d = context;
    }

    public static long a(SQLiteDatabase sQLiteDatabase, String str) {
        if (sQLiteDatabase != null) {
            return DatabaseUtils.queryNumEntries(sQLiteDatabase, str, (String) null, (String[]) null);
        }
        return 0;
    }

    public final boolean a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return ((Boolean) ozx.aO.c()).booleanValue();
    }

    public final pmr e() {
        if (this.e == null) {
            Context context = this.d;
            this.e = new pmw(context, new png(new oyq(context), this.d.getContentResolver()));
        }
        return this.e;
    }

    public final SQLiteDatabase getWritableDatabase() {
        return f();
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder(46);
        sb.append("Downgrading DB from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        pnz.c(sb.toString());
        jit.a(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }

    public static synchronized pnp a(Context context) {
        pnp pnp;
        synchronized (pnp.class) {
            if (f == null) {
                f = new pnp(context);
            }
            pnp = f;
        }
        return pnp;
    }

    public final boolean c(dvj dvj) {
        try {
            if (pba.m()) {
                return a(dvj, pnn.a);
            }
            return a(dvj);
        } catch (RuntimeException e2) {
            pnz.a((Throwable) e2, "Exception thrown from onTableChanged", new Object[0]);
            if (InternalIcingCorporaChimeraProvider.f()) {
                return false;
            }
            throw e2;
        }
    }

    public final SQLiteDatabase f() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException e2) {
            pnz.a((Throwable) e2, "Failed to get a writable database.", new Object[0]);
            return null;
        }
    }

    public final void a(int i, dvj dvj) {
        if (i > 0) {
            pnz.a("Updated %d entries in table %s", (Object) Integer.valueOf(i), (Object) dvj);
            if (!c(dvj)) {
                String valueOf = String.valueOf(dvj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                sb.append("Table change notification failed for ");
                sb.append(valueOf);
                pnz.e(sb.toString());
            }
        }
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS contacts");
        sQLiteDatabase.execSQL("CREATE TABLE contacts (_id INTEGER PRIMARY KEY AUTOINCREMENT,contact_id INTEGER,lookup_key TEXT,icon_uri TEXT,display_name TEXT,given_names TEXT,times_contacted TEXT,score INTEGER,emails TEXT,nickname TEXT,note TEXT,organization TEXT,phone_numbers TEXT,postal_address TEXT,phonetic_name TEXT)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contacts_contact_id_index ON contacts(contact_id)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS emails");
        sQLiteDatabase.execSQL("CREATE TABLE emails (_id INTEGER PRIMARY KEY AUTOINCREMENT,contact_id INTEGER,data_id INTEGER,email TEXT,label TEXT,type INTEGER,score INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX emails_data_id_index ON emails(data_id)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS phones");
        sQLiteDatabase.execSQL("CREATE TABLE phones (_id INTEGER PRIMARY KEY AUTOINCREMENT,contact_id INTEGER,data_id INTEGER,phone TEXT,label TEXT,type INTEGER,score INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX phones_data_id_index ON phones(data_id)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS postals");
        sQLiteDatabase.execSQL("CREATE TABLE postals (_id INTEGER PRIMARY KEY AUTOINCREMENT,contact_id INTEGER,data_id INTEGER,postal TEXT,label TEXT,type INTEGER,score INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX postals_data_id_index ON postals(data_id)");
    }

    public final void a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder(44);
        sb.append("Upgrading DB from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        pnz.c(sb.toString());
    }
}
