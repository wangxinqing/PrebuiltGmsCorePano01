package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* renamed from: kjs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class kjs extends jjj {
    private static final ith a = new ith("DatabaseOpenHelper", "");
    private final int b;
    private final int c;
    private final lsb[] d;
    private final String e;

    public kjs(Context context, String str, String str2, lsb[] lsbArr, int i, int i2) {
        super(context, str, str2, i);
        this.d = lsbArr;
        this.b = i;
        this.c = i2;
        this.e = str;
    }

    /* JADX INFO: finally extract failed */
    static final void d(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "type == 'view'", (String[]) null, (String) null, (String) null, (String) null);
        try {
            query.moveToFirst();
            while (!query.isAfterLast()) {
                String valueOf = String.valueOf(kqh.a(query.getString(0)));
                sQLiteDatabase.execSQL(valueOf.length() == 0 ? new String("DROP VIEW ") : "DROP VIEW ".concat(valueOf));
                query.moveToNext();
            }
            query.close();
            Cursor query2 = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "type == 'trigger'", (String[]) null, (String) null, (String) null, (String) null);
            try {
                query2.moveToFirst();
                while (!query2.isAfterLast()) {
                    String valueOf2 = String.valueOf(kqh.a(query2.getString(0)));
                    sQLiteDatabase.execSQL(valueOf2.length() == 0 ? new String("DROP TRIGGER ") : "DROP TRIGGER ".concat(valueOf2));
                    query2.moveToNext();
                }
            } finally {
                query2.close();
            }
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    public void c(SQLiteDatabase sQLiteDatabase) {
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException e2) {
            File file = new File(this.e);
            if (!SQLiteDatabase.deleteDatabase(file)) {
                a.b("Failed to delete database file: %s", file);
            }
            return super.getWritableDatabase();
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        a.a("DatabaseOpenHelper", "Downgrade requested, resetting database. Old version: %s, new version: %s", Integer.valueOf(i), Integer.valueOf(i2));
        e(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Cursor rawQuery;
        Cursor query;
        int i3;
        int i4;
        Cursor query2;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        int i5 = i;
        int i6 = i2;
        int i7 = 1;
        a.a("DatabaseOpenHelper", "Upgrading %s from version %s to %s, databasePath=%s", this.e, Integer.valueOf(i), Integer.valueOf(i2), sQLiteDatabase.getPath());
        iva.b(i6 == this.b, "Must upgrade to latest database version.");
        if (i5 < this.c) {
            a.b("DatabaseOpenHelper", "Cannot upgrade database, recreating instead.");
            e(sQLiteDatabase);
            return;
        }
        sQLiteDatabase.beginTransaction();
        try {
            d(sQLiteDatabase);
            a(sQLiteDatabase2, i6);
            for (int i8 = i5 + 1; i8 < i6; i8++) {
                for (lsb b2 : this.d) {
                    kql kql = (kql) b2.b();
                    if (kql.e(i8)) {
                        int i9 = i8 - 1;
                        String a2 = kql.e(i9) ? kql.a(i9) : null;
                        String a3 = kql.a(i8);
                        StringBuilder sb = new StringBuilder();
                        sb.append("CREATE VIEW ");
                        sb.append(kqh.a(a3));
                        sb.append(" AS ");
                        kql.a(sb, i8, a2);
                        sQLiteDatabase2.execSQL(sb.toString());
                    }
                }
            }
            lsb[] lsbArr = this.d;
            int length = lsbArr.length;
            int i10 = 0;
            while (i10 < length) {
                kql kql2 = (kql) lsbArr[i10].b();
                if (!kql2.e(i5)) {
                    i3 = i10;
                    i4 = length;
                } else if (kql2.e(i6)) {
                    String a4 = kql2.a(i5);
                    String a5 = kql2.a(i6);
                    String[] strArr = new String[i7];
                    strArr[0] = "seq";
                    String[] strArr2 = new String[i7];
                    strArr2[0] = a4;
                    String str = "seq";
                    i3 = i10;
                    i4 = length;
                    query2 = sQLiteDatabase.query("sqlite_sequence", strArr, "name = ?", strArr2, (String) null, (String) null, (String) null);
                    if (query2.moveToFirst()) {
                        int columnIndexOrThrow = query2.getColumnIndexOrThrow(str);
                        if (!query2.isNull(columnIndexOrThrow)) {
                            sQLiteDatabase2.execSQL("INSERT OR REPLACE INTO sqlite_sequence (name, seq) VALUES (?,?);", new Object[]{a5, Long.valueOf(query2.getLong(columnIndexOrThrow))});
                            query2.moveToNext();
                            if (!query2.isAfterLast()) {
                                a.b("DatabaseOpenHelper", "Multiple entries in sqlite_sequence for %s", a4);
                            }
                        }
                    }
                    query2.close();
                } else {
                    i3 = i10;
                    i4 = length;
                }
                i10 = i3 + 1;
                length = i4;
                i7 = 1;
            }
            for (lsb b3 : this.d) {
                kql kql3 = (kql) b3.b();
                if (kql3.e(i6)) {
                    int i11 = i6 - 1;
                    String a6 = kql3.e(i11) ? kql3.a(i11) : null;
                    String a7 = kql3.a(i6);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("INSERT INTO ");
                    sb2.append(kqh.a(a7));
                    sb2.append(' ');
                    kql3.a(sb2, i6, a6);
                    sQLiteDatabase2.execSQL(sb2.toString());
                }
            }
            d(sQLiteDatabase);
            for (lsb b4 : this.d) {
                kql kql4 = (kql) b4.b();
                if (kql4.e(i5)) {
                    String valueOf = String.valueOf(kqh.a(kql4.a(i5)));
                    sQLiteDatabase2.execSQL(valueOf.length() == 0 ? new String("DROP TABLE IF EXISTS ") : "DROP TABLE IF EXISTS ".concat(valueOf));
                    String[] strArr3 = {"name"};
                    String valueOf2 = String.valueOf(kqh.a((Object) String.valueOf(kql4.a(i5)).concat("%")));
                    query = sQLiteDatabase.query("SQLITE_MASTER", strArr3, valueOf2.length() == 0 ? new String("type == 'index' AND name LIKE ") : "type == 'index' AND name LIKE ".concat(valueOf2), (String[]) null, (String) null, (String) null, (String) null);
                    query.moveToFirst();
                    while (!query.isAfterLast()) {
                        String valueOf3 = String.valueOf(kqh.a(query.getString(0)));
                        sQLiteDatabase2.execSQL(valueOf3.length() == 0 ? new String("DROP INDEX ") : "DROP INDEX ".concat(valueOf3));
                        query.moveToNext();
                    }
                    query.close();
                }
            }
            c(sQLiteDatabase);
            rawQuery = sQLiteDatabase2.rawQuery("PRAGMA foreign_key_check", (String[]) null);
            boolean moveToFirst = rawQuery.moveToFirst();
            rawQuery.close();
            if (moveToFirst) {
                a.c("DatabaseOpenHelper", "Foreign keys constraint not satisfied. Recreating database.");
                e(sQLiteDatabase);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    private final void e(SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type IN ('table', 'index') AND name NOT LIKE 'sqlite_%' ORDER BY 1", (String[]) null);
        if (rawQuery != null) {
            while (rawQuery.moveToNext()) {
                try {
                    String valueOf = String.valueOf(rawQuery.getString(0));
                    sQLiteDatabase.execSQL(valueOf.length() == 0 ? new String("DROP TABLE IF EXISTS ") : "DROP TABLE IF EXISTS ".concat(valueOf));
                } finally {
                    rawQuery.close();
                }
            }
        }
        d(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            a(sQLiteDatabase, this.b);
            c(sQLiteDatabase);
            a();
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public final void a(SQLiteDatabase sQLiteDatabase, int i) {
        lsb[] lsbArr;
        int i2;
        int i3;
        lsb[] lsbArr2;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        int i4 = i;
        lsb[] lsbArr3 = this.d;
        int length = lsbArr3.length;
        int i5 = 0;
        while (i5 < length) {
            kql kql = (kql) lsbArr3[i5].b();
            if (kql.e(i4)) {
                String a2 = kqh.a(kql.a(i4));
                StringBuilder sb = new StringBuilder("CREATE TABLE ");
                sb.append(a2);
                sb.append(" (");
                boolean z = false;
                for (lsb b2 : kql.a()) {
                    kqh kqh = (kqh) b2.b();
                    if (kqh.e(i4)) {
                        if (z) {
                            sb.append(", ");
                        }
                        kqp kqp = (kqp) kqh.c(i4);
                        sb.append(kqh.a(kqp.a));
                        sb.append(" ");
                        sb.append(kqo.a(kqp.i));
                        if (kqp.b) {
                            sb.append(" PRIMARY KEY");
                            if (kqp.i == 1) {
                                sb.append(" AUTOINCREMENT");
                            }
                        }
                        if (kqp.g) {
                            sb.append(" NOT NULL");
                        }
                        if (kqp.f != null) {
                            sb.append(" DEFAULT ");
                            sb.append(kqh.a(kqp.f));
                        }
                        z = true;
                    }
                }
                lsb[] a3 = kql.a();
                int length2 = a3.length;
                int i6 = 0;
                while (i6 < length2) {
                    lsb[] lsbArr4 = lsbArr3;
                    int i7 = length;
                    kqh kqh2 = (kqh) a3[i6].b();
                    if (kqh2.e(i4)) {
                        kqp kqp2 = (kqp) kqh2.c(i4);
                        if (kqp2.c != null) {
                            sb.append(", FOREIGN KEY(");
                            sb.append(kqh.a(kqp2.a));
                            sb.append(") REFERENCES ");
                            sb.append(kqh.a(kqp2.c.a.a(i4)));
                            sb.append("(");
                            sb.append(kqh.a(kqp2.c.a(i4)));
                            sb.append(") ON DELETE ");
                            sb.append(kqp2.h.c);
                        }
                    }
                    i6++;
                    lsbArr3 = lsbArr4;
                    length = i7;
                }
                sb.append(");");
                sQLiteDatabase2.execSQL(sb.toString());
                lsb[] a4 = kql.a();
                int length3 = a4.length;
                int i8 = 0;
                while (i8 < length3) {
                    kqh kqh3 = (kqh) a4[i8].b();
                    if (kqh3.e(i4)) {
                        if (((kqp) kqh3.c(i4)).d) {
                            String a5 = kql.a(i4);
                            lsbArr2 = lsbArr3;
                            String a6 = kqh3.a(i4);
                            i2 = length;
                            lsbArr = a4;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(a5).length() + 3 + String.valueOf(a6).length());
                            sb2.append(a5);
                            sb2.append("_");
                            sb2.append(a6);
                            sb2.append("_i");
                            String a7 = kqh.a(sb2.toString());
                            String a8 = kqh.a(kqh3.a(i4));
                            i3 = length3;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(a7).length() + 35 + String.valueOf(a2).length() + String.valueOf(a8).length());
                            sb3.append("CREATE INDEX IF NOT EXISTS ");
                            sb3.append(a7);
                            sb3.append(" ON ");
                            sb3.append(a2);
                            sb3.append(" (");
                            sb3.append(a8);
                            sb3.append(");");
                            sQLiteDatabase2.execSQL(sb3.toString());
                        } else {
                            lsbArr2 = lsbArr3;
                            i2 = length;
                            lsbArr = a4;
                            i3 = length3;
                        }
                        Set<kqh> set = ((kqp) kqh3.c(i4)).e;
                        if (set != null) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(kqh3.a(i4));
                            for (kqh a9 : set) {
                                arrayList.add(a9.a(i4));
                            }
                            Collections.sort(arrayList);
                            String a10 = kql.a(i4);
                            String join = TextUtils.join("_", arrayList);
                            StringBuilder sb4 = new StringBuilder(String.valueOf(a10).length() + 4 + String.valueOf(join).length());
                            sb4.append(a10);
                            sb4.append("_");
                            sb4.append(join);
                            sb4.append("_ui");
                            String a11 = kqh.a(sb4.toString());
                            String join2 = TextUtils.join(",", arrayList);
                            StringBuilder sb5 = new StringBuilder(String.valueOf(a11).length() + 42 + String.valueOf(a2).length() + String.valueOf(join2).length());
                            sb5.append("CREATE UNIQUE INDEX IF NOT EXISTS ");
                            sb5.append(a11);
                            sb5.append(" ON ");
                            sb5.append(a2);
                            sb5.append(" (");
                            sb5.append(join2);
                            sb5.append(");");
                            sQLiteDatabase2.execSQL(sb5.toString());
                        }
                    } else {
                        lsbArr2 = lsbArr3;
                        i2 = length;
                        lsbArr = a4;
                        i3 = length3;
                    }
                    i8++;
                    lsbArr3 = lsbArr2;
                    length3 = i3;
                    length = i2;
                    a4 = lsbArr;
                }
            }
            i5++;
            lsbArr3 = lsbArr3;
            length = length;
        }
    }
}
