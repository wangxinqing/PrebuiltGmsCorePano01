package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import java.util.Locale;
import java.util.Map;

/* renamed from: wty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wty extends jjj {
    final /* synthetic */ wtz a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wty(wtz wtz, Context context, String str, String str2) {
        super(context, str, str2, 1900);
        this.a = wtz;
    }

    public static final void a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        if (str2 != null) {
            sQLiteDatabase.execSQL("DELETE FROM sqlite_stat1 WHERE tbl=? AND idx=?", new String[]{str, str2});
        } else {
            sQLiteDatabase.execSQL("DELETE FROM sqlite_stat1 WHERE tbl=? AND idx IS NULL", new String[]{str});
        }
        sQLiteDatabase.execSQL("INSERT INTO sqlite_stat1 (tbl,idx,stat) VALUES (?,?,?)", new String[]{str, str2, str3});
    }

    public static final void d(SQLiteDatabase sQLiteDatabase) {
        anhk i = wtp.c().entrySet().e().g().listIterator();
        while (i.hasNext()) {
            Map.Entry entry = (Map.Entry) i.next();
            String format = String.format("DROP VIEW IF EXISTS %s;", new Object[]{(String) entry.getKey()});
            entry.getKey();
            sQLiteDatabase.execSQL(format);
            entry.getKey();
        }
        anhj a2 = wtp.c().entrySet().iterator();
        while (a2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) a2.next();
            entry2.getKey();
            entry2.getValue();
            sQLiteDatabase.execSQL((String) entry2.getValue());
            entry2.getKey();
        }
    }

    public static final void e(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.execSQL("DELETE FROM sqlite_stat1");
            a(sQLiteDatabase, "people", "sqlite_autoindex_people_1", "500 250 1");
            a(sQLiteDatabase, "owners", (String) null, "3");
            a(sQLiteDatabase, "owner_sync_requests", "sqlite_autoindex_owner_sync_requests_1", "3 1 1");
            a(sQLiteDatabase, "sync_tokens", "sqlite_autoindex_sync_tokens_1", "15");
            a(sQLiteDatabase, "circle_members", "sqlite_autoindex_circle_members_1", "1000 300 2 1");
            a(sQLiteDatabase, "circles", "sqlite_autoindex_circles_1", "20 10 1");
            a(sQLiteDatabase, "search_index", "search_value", "1500 3");
            a(sQLiteDatabase, "search_index", "search_person_id_index", "1500 3");
            a(sQLiteDatabase, "emails", "email_person", "500 150 1");
            a(sQLiteDatabase, "phones", "phone_person", "500 150 1");
            a(sQLiteDatabase, "postal_address", "postal_address_person", "500 150 1");
            a(sQLiteDatabase, "owner_emails", (String) null, "6");
            a(sQLiteDatabase, "owner_phones", (String) null, "6");
            a(sQLiteDatabase, "owner_postal_address", (String) null, "6");
            a(sQLiteDatabase, "properties", (String) null, "10");
            a(sQLiteDatabase, "gaia_id_map", "sqlite_autoindex_gaia_id_map_1", "500 200 2 1");
            a(sQLiteDatabase, "ac_people", "sqlite_autoindex_ac_people_1", "500 250 1");
            a(sQLiteDatabase, "ac_people", "ac_people_v2_id", "500 250 1");
            a(sQLiteDatabase, "ac_container", "ac_item_container_person_id", "1000 2");
            a(sQLiteDatabase, "ac_item", "ac_item_container", "2000 2");
            a(sQLiteDatabase, "ac_index", "ac_index_1", "8000 2000 2 2");
            a(sQLiteDatabase, "ac_index", "ac_index_item_id", "8000 4");
            a(sQLiteDatabase, "applications", "sqlite_autoindex_applications_1", "1 1 1");
            a(sQLiteDatabase, "application_packages", (String) null, "1");
            a(sQLiteDatabase, "facl_people", "sqlite_autoindex_facl_people_1", "50 50 50 1");
            a(sQLiteDatabase, "temp_gaia_ordinal", (String) null, "3");
            sQLiteDatabase.execSQL("ANALYZE sqlite_master;");
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLException e) {
            Log.e("PeopleDatabaseHelper", "Could not update index stats", e);
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase.endTransaction();
    }

    public static final void f(SQLiteDatabase sQLiteDatabase) {
        anhj a2 = wtp.a().entrySet().iterator();
        while (a2.hasNext()) {
            Map.Entry entry = (Map.Entry) a2.next();
            entry.getKey();
            entry.getValue();
            sQLiteDatabase.execSQL((String) entry.getValue());
            entry.getKey();
        }
        anhj a3 = wtp.b().entrySet().iterator();
        while (a3.hasNext()) {
            Map.Entry entry2 = (Map.Entry) a3.next();
            entry2.getKey();
            entry2.getValue();
            sQLiteDatabase.execSQL((String) entry2.getValue());
            entry2.getKey();
        }
        d(sQLiteDatabase);
        sQLiteDatabase.execSQL("ANALYZE;");
        e(sQLiteDatabase);
    }

    /* access modifiers changed from: protected */
    public final void b(SQLiteDatabase sQLiteDatabase) {
        xip.a();
        if (!sQLiteDatabase.isReadOnly() && !((Boolean) xgu.a.a()).booleanValue()) {
            sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007c, code lost:
        if (defpackage.jix.d(r0.b) != false) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onConfigure(android.database.sqlite.SQLiteDatabase r5) {
        /*
            r4 = this;
            defpackage.xip.a()
            xfs r0 = defpackage.xgu.a
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0036
            aywy r0 = defpackage.aywy.a
            ayxk r0 = r0.a()
            boolean r0 = r0.aZ()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0032
            boolean r0 = r5.isReadOnly()
            if (r0 == 0) goto L_0x002d
            goto L_0x0032
        L_0x002d:
            r0 = 1
            r5.setForeignKeyConstraintsEnabled(r0)
            goto L_0x0036
        L_0x0032:
            r5.setForeignKeyConstraintsEnabled(r1)
        L_0x0036:
            aywy r0 = defpackage.aywy.a
            ayxk r0 = r0.a()
            boolean r0 = r0.bX()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0086
            aywy r0 = defpackage.aywy.a
            ayxk r0 = r0.a()
            boolean r0 = r0.di()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0083
            aywy r0 = defpackage.aywy.a
            ayxk r0 = r0.a()
            boolean r0 = r0.J()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x007f
            wtz r0 = r4.a
            ycd r2 = defpackage.wtz.a
            android.content.Context r0 = r0.b
            boolean r0 = defpackage.jix.d(r0)
            if (r0 == 0) goto L_0x007f
            goto L_0x0083
        L_0x007f:
            r5.enableWriteAheadLogging()
            goto L_0x0086
        L_0x0083:
            r5.disableWriteAheadLogging()
        L_0x0086:
            aywy r0 = defpackage.aywy.a
            ayxk r0 = r0.a()
            boolean r0 = r0.bA()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00e7
            defpackage.wml.a()
            boolean r5 = r5.isWriteAheadLoggingEnabled()
            xmh r0 = defpackage.xmh.o
            aucd r0 = r0.o()
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x00ac
            goto L_0x00b1
        L_0x00ac:
            r0.c()
            r0.c = r1
        L_0x00b1:
            aucj r2 = r0.b
            xmh r2 = (defpackage.xmh) r2
            int r3 = r2.a
            r3 = r3 | 2
            r2.a = r3
            r2.c = r5
            aucj r5 = r0.i()
            xmh r5 = (defpackage.xmh) r5
            xol r0 = defpackage.xol.w
            aucd r0 = r0.o()
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x00ce
            goto L_0x00d3
        L_0x00ce:
            r0.c()
            r0.c = r1
        L_0x00d3:
            aucj r1 = r0.b
            xol r1 = (defpackage.xol) r1
            r5.getClass()
            r1.m = r5
            int r5 = r1.a
            r5 = r5 | 1024(0x400, float:1.435E-42)
            r1.a = r5
            r5 = 0
            defpackage.wmm.a(r5, r0)
            return
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wty.onConfigure(android.database.sqlite.SQLiteDatabase):void");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (jlo.g() != -1) {
            wml.a();
            aucd o = aoin.r.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoin aoin = (aoin) o.b;
            aoin.a |= 32768;
            aoin.q = true;
            aoin aoin2 = (aoin) o.i();
            aucd o2 = aoip.h.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aoip aoip = (aoip) o2.b;
            aoin2.getClass();
            aoip.d = aoin2;
            aoip.a |= 4;
            wmm.a((aoip) o2.i());
        }
        StringBuilder sb = new StringBuilder(51);
        sb.append("Downgrading from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        String sb2 = sb.toString();
        wtz wtz = this.a;
        ycd ycd = wtz.a;
        wus.a(wtz.b, "PeopleDatabaseHelper", sb2);
        Log.w("PeopleDatabaseHelper", sb2);
        this.a.f(sQLiteDatabase);
        if (ayws.c()) {
            Context context = this.a.b;
            sQLiteDatabase.execSQL("DELETE FROM sync_tokens;");
            xej a2 = xej.a(context);
            wus.b(a2.a, "PeopleSync", "requestAllFullSyncForDbUpgradeWithLogging");
            anhj a3 = a2.c.d(a2.a).iterator();
            while (a3.hasNext()) {
                Bundle a4 = xej.a(false, false);
                a4.putBoolean("db_downgrade", true);
                xej.a((Account) a3.next(), "com.google.android.gms.people", a4);
            }
            return;
        }
        wtz.a(this.a.b, sQLiteDatabase);
    }

    /* JADX WARNING: Removed duplicated region for block: B:246:0x09bc A[Catch:{ SQLException -> 0x0926 }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x09c1 A[Catch:{ SQLException -> 0x0926 }] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x09c4 A[Catch:{ SQLException -> 0x0926 }] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x09d5  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x09f4  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0a45  */
    /* JADX WARNING: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r27, int r28, int r29) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            r3 = r28
            java.lang.String r4 = "com.google.android.gms.people"
            java.lang.String r5 = "PeopleDatabaseHelper"
            java.util.concurrent.atomic.AtomicBoolean r6 = new java.util.concurrent.atomic.AtomicBoolean
            r7 = 0
            r6.<init>(r7)
            r8 = 1
            java.lang.String r9 = "Upgrading from version %d to %d"
            r10 = r29
            defpackage.xdt.a((java.lang.String) r5, (java.lang.String) r9, (int) r3, (int) r10)     // Catch:{ SQLException -> 0x09ca }
            r9 = 32
            if (r3 >= r9) goto L_0x0029
            c(r27)     // Catch:{ SQLException -> 0x09ca }
            f(r27)     // Catch:{ SQLException -> 0x09ca }
            r6.set(r8)     // Catch:{ SQLException -> 0x09ca }
            r3 = 32
            r9 = 1
            goto L_0x002a
        L_0x0029:
            r9 = 0
        L_0x002a:
            r10 = 33
            if (r3 < r10) goto L_0x002f
            goto L_0x0035
        L_0x002f:
            r6.set(r8)     // Catch:{ SQLException -> 0x09ca }
            r3 = 33
        L_0x0035:
            r10 = 34
            if (r3 < r10) goto L_0x003a
            goto L_0x0043
        L_0x003a:
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x09ca }
            java.lang.String r3 = "UPDATE owners SET gaia_id=(SELECT gaia_id FROM owners AS i WHERE owners.account_name = i.account_name ) WHERE page_gaia_id IS NOT NULL"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x09ca }
            r3 = 34
        L_0x0043:
            r10 = 35
            java.lang.String r11 = "owners"
            java.lang.String r12 = "_id"
            java.lang.String r13 = "owner_id INTEGER NOT NULL"
            r14 = 6
            java.lang.String r15 = "owner_id"
            r8 = 2
            if (r3 >= r10) goto L_0x0099
            java.lang.String r3 = "gaia_id_map"
            java.lang.String r3 = defpackage.wtq.a((java.lang.String) r3)     // Catch:{ SQLException -> 0x09ca }
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x09ca }
            java.lang.String[] r3 = new java.lang.String[r14]     // Catch:{ SQLException -> 0x09ca }
            r3[r7] = r13     // Catch:{ SQLException -> 0x09ca }
            java.lang.String r9 = "contact_id TEXT NOT NULL"
            r10 = 1
            r3[r10] = r9     // Catch:{ SQLException -> 0x09ca }
            java.lang.String r9 = "value TEXT NOT NULL"
            r3[r8] = r9     // Catch:{ SQLException -> 0x09ca }
            java.lang.String r9 = "gaia_id TEXT NOT NULL"
            r10 = 3
            r3[r10] = r9     // Catch:{ SQLException -> 0x09ca }
            java.lang.String[] r9 = new java.lang.String[r10]     // Catch:{ SQLException -> 0x09ca }
            r9[r7] = r15     // Catch:{ SQLException -> 0x09ca }
            java.lang.String r10 = "contact_id"
            r16 = 1
            r9[r16] = r10     // Catch:{ SQLException -> 0x09ca }
            java.lang.String r10 = "value"
            r9[r8] = r10     // Catch:{ SQLException -> 0x09ca }
            java.lang.String r9 = defpackage.wtq.a((java.lang.String[]) r9)     // Catch:{ SQLException -> 0x09ca }
            r10 = 4
            r3[r10] = r9     // Catch:{ SQLException -> 0x09ca }
            java.lang.String r9 = defpackage.wtq.a((java.lang.String) r15, (java.lang.String) r11, (java.lang.String) r12)     // Catch:{ SQLException -> 0x09ca }
            r10 = 5
            r3[r10] = r9     // Catch:{ SQLException -> 0x09ca }
            java.lang.String r9 = "gaia_id_map"
            java.lang.String r3 = defpackage.wtq.a(r9, r3)     // Catch:{ SQLException -> 0x09ca }
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x09ca }
            r3 = 1
            r6.set(r3)     // Catch:{ SQLException -> 0x09ca }
            r3 = 35
            r9 = 1
            goto L_0x009a
        L_0x0099:
        L_0x009a:
            r10 = 36
            java.lang.String r17 = "qualified_id TEXT NOT NULL"
            java.lang.String r18 = "dev_console_id TEXT NOT NULL"
            java.lang.String r14 = "dev_console_id"
            java.lang.String r8 = "qualified_id"
            java.lang.String r20 = "_id INTEGER PRIMARY KEY AUTOINCREMENT"
            if (r3 >= r10) goto L_0x015b
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x09ca }
            r3 = 3
            java.lang.String[] r9 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x09ca }
            java.lang.String r3 = "application_packages"
            r9[r7] = r3     // Catch:{ SQLException -> 0x09ca }
            java.lang.String r3 = "facl_applications"
            r10 = 1
            r9[r10] = r3     // Catch:{ SQLException -> 0x09ca }
            java.lang.String r3 = "facl_circles"
            r10 = 2
            r9[r10] = r3     // Catch:{ SQLException -> 0x09ca }
            java.util.List r3 = defpackage.wtq.c(r9)     // Catch:{ SQLException -> 0x09ca }
            defpackage.wtz.a((android.database.sqlite.SQLiteDatabase) r2, (java.util.List) r3)     // Catch:{ SQLException -> 0x09ca }
            r3 = 5
            java.lang.String[] r9 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x09ca }
            r9[r7] = r20     // Catch:{ SQLException -> 0x09ca }
            r3 = 1
            r9[r3] = r18     // Catch:{ SQLException -> 0x09ca }
            java.lang.String r3 = "package_name TEXT NOT NULL"
            r10 = 2
            r9[r10] = r3     // Catch:{ SQLException -> 0x09ca }
            java.lang.String r3 = "certificate_hash TEXT NOT NULL"
            r10 = 3
            r9[r10] = r3     // Catch:{ SQLException -> 0x09ca }
            r3 = 1
            java.lang.String[] r10 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x09ca }
            java.lang.String r3 = "package_name"
            r10[r7] = r3     // Catch:{ SQLException -> 0x09ca }
            java.lang.String r3 = defpackage.wtq.a((java.lang.String[]) r10)     // Catch:{ SQLException -> 0x09ca }
            r10 = 4
            r9[r10] = r3     // Catch:{ SQLException -> 0x09ca }
            java.lang.String r3 = "application_packages"
            java.lang.String r3 = defpackage.wtq.a(r3, r9)     // Catch:{ SQLException -> 0x09ca }
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x09ca }
            r3 = 6
            java.lang.String[] r9 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x09ca }
            r9[r7] = r20     // Catch:{ SQLException -> 0x09ca }
            r3 = 1
            r9[r3] = r13     // Catch:{ SQLException -> 0x09ca }
            r3 = 2
            r9[r3] = r18     // Catch:{ SQLException -> 0x09ca }
            r3 = 3
            r9[r3] = r17     // Catch:{ SQLException -> 0x09ca }
            java.lang.String[] r10 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x09ca }
            r10[r7] = r15     // Catch:{ SQLException -> 0x09ca }
            r3 = 1
            r10[r3] = r14     // Catch:{ SQLException -> 0x09ca }
            r3 = 2
            r10[r3] = r8     // Catch:{ SQLException -> 0x09ca }
            java.lang.String r3 = defpackage.wtq.a((java.lang.String[]) r10)     // Catch:{ SQLException -> 0x09ca }
            r10 = 4
            r9[r10] = r3     // Catch:{ SQLException -> 0x09ca }
            amzy r3 = defpackage.amzy.a((java.lang.Object) r15, (java.lang.Object) r8)     // Catch:{ SQLException -> 0x09ca }
            java.lang.String r10 = "people"
            amzy r7 = defpackage.amzy.a((java.lang.Object) r15, (java.lang.Object) r8)     // Catch:{ SQLException -> 0x09ca }
            r22 = r6
            r6 = 0
            java.lang.String r3 = defpackage.wtq.a(r3, r10, r7, r6)     // Catch:{ SQLException -> 0x022f }
            r6 = 5
            r9[r6] = r3     // Catch:{ SQLException -> 0x022f }
            java.lang.String r3 = "facl_people"
            java.lang.String r3 = defpackage.wtq.a(r3, r9)     // Catch:{ SQLException -> 0x022f }
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x022f }
            r3 = 6
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x022f }
            r3 = 0
            r6[r3] = r20     // Catch:{ SQLException -> 0x022f }
            r3 = 1
            r6[r3] = r13     // Catch:{ SQLException -> 0x022f }
            r3 = 2
            r6[r3] = r18     // Catch:{ SQLException -> 0x022f }
            java.lang.String r7 = "everyone INTEGER NOT NULL"
            r9 = 3
            r6[r9] = r7     // Catch:{ SQLException -> 0x022f }
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x022f }
            r3 = 0
            r7[r3] = r15     // Catch:{ SQLException -> 0x022f }
            r3 = 1
            r7[r3] = r14     // Catch:{ SQLException -> 0x022f }
            java.lang.String r3 = defpackage.wtq.a((java.lang.String[]) r7)     // Catch:{ SQLException -> 0x022f }
            r7 = 4
            r6[r7] = r3     // Catch:{ SQLException -> 0x022f }
            java.lang.String r3 = defpackage.wtq.a((java.lang.String) r15, (java.lang.String) r11, (java.lang.String) r12)     // Catch:{ SQLException -> 0x022f }
            r7 = 5
            r6[r7] = r3     // Catch:{ SQLException -> 0x022f }
            java.lang.String r3 = "facl_applications"
            java.lang.String r3 = defpackage.wtq.a(r3, r6)     // Catch:{ SQLException -> 0x022f }
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x022f }
            r3 = 36
            r9 = 1
            goto L_0x015d
        L_0x015b:
            r22 = r6
        L_0x015d:
            r6 = 37
            if (r3 >= r6) goto L_0x0232
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x022f }
            r3 = 4
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x022f }
            java.lang.String r3 = "applications"
            r9 = 0
            r6[r9] = r3     // Catch:{ SQLException -> 0x022f }
            java.lang.String r3 = "application_packages"
            r9 = 1
            r6[r9] = r3     // Catch:{ SQLException -> 0x022f }
            java.lang.String r3 = "facl_applications"
            r9 = 2
            r6[r9] = r3     // Catch:{ SQLException -> 0x022f }
            java.lang.String r3 = "facl_people"
            r9 = 3
            r6[r9] = r3     // Catch:{ SQLException -> 0x022f }
            java.util.List r3 = defpackage.wtq.c(r6)     // Catch:{ SQLException -> 0x022f }
            defpackage.wtz.a((android.database.sqlite.SQLiteDatabase) r2, (java.util.List) r3)     // Catch:{ SQLException -> 0x022f }
            r3 = 5
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x022f }
            r3 = 0
            r6[r3] = r20     // Catch:{ SQLException -> 0x022f }
            r3 = 1
            r6[r3] = r13     // Catch:{ SQLException -> 0x022f }
            r3 = 2
            r6[r3] = r18     // Catch:{ SQLException -> 0x022f }
            java.lang.String[] r9 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x022f }
            r3 = 0
            r9[r3] = r15     // Catch:{ SQLException -> 0x022f }
            r3 = 1
            r9[r3] = r14     // Catch:{ SQLException -> 0x022f }
            java.lang.String r3 = defpackage.wtq.a((java.lang.String[]) r9)     // Catch:{ SQLException -> 0x022f }
            r9 = 3
            r6[r9] = r3     // Catch:{ SQLException -> 0x022f }
            java.lang.String r3 = defpackage.wtq.a((java.lang.String) r15, (java.lang.String) r11, (java.lang.String) r12)     // Catch:{ SQLException -> 0x022f }
            r9 = 4
            r6[r9] = r3     // Catch:{ SQLException -> 0x022f }
            java.lang.String r3 = "applications"
            java.lang.String r3 = defpackage.wtq.a(r3, r6)     // Catch:{ SQLException -> 0x022f }
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x022f }
            r3 = 6
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x022f }
            r3 = 0
            r6[r3] = r20     // Catch:{ SQLException -> 0x022f }
            r3 = 1
            r6[r3] = r13     // Catch:{ SQLException -> 0x022f }
            r3 = 2
            r6[r3] = r18     // Catch:{ SQLException -> 0x022f }
            java.lang.String r3 = "package_name TEXT NOT NULL"
            r9 = 3
            r6[r9] = r3     // Catch:{ SQLException -> 0x022f }
            java.lang.String r3 = "certificate_hash TEXT NOT NULL"
            r9 = 4
            r6[r9] = r3     // Catch:{ SQLException -> 0x022f }
            amzy r3 = defpackage.amzy.a((java.lang.Object) r15, (java.lang.Object) r14)     // Catch:{ SQLException -> 0x022f }
            java.lang.String r9 = "applications"
            amzy r10 = defpackage.amzy.a((java.lang.Object) r15, (java.lang.Object) r14)     // Catch:{ SQLException -> 0x022f }
            r7 = 1
            java.lang.String r3 = defpackage.wtq.a(r3, r9, r10, r7)     // Catch:{ SQLException -> 0x022f }
            r7 = 5
            r6[r7] = r3     // Catch:{ SQLException -> 0x022f }
            java.lang.String r3 = "application_packages"
            java.lang.String r3 = defpackage.wtq.a(r3, r6)     // Catch:{ SQLException -> 0x022f }
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x022f }
            r3 = 7
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x022f }
            r3 = 0
            r6[r3] = r20     // Catch:{ SQLException -> 0x022f }
            r3 = 1
            r6[r3] = r13     // Catch:{ SQLException -> 0x022f }
            r3 = 2
            r6[r3] = r18     // Catch:{ SQLException -> 0x022f }
            r3 = 3
            r6[r3] = r17     // Catch:{ SQLException -> 0x022f }
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x022f }
            r3 = 0
            r7[r3] = r15     // Catch:{ SQLException -> 0x022f }
            r3 = 1
            r7[r3] = r14     // Catch:{ SQLException -> 0x022f }
            r3 = 2
            r7[r3] = r8     // Catch:{ SQLException -> 0x022f }
            java.lang.String r3 = defpackage.wtq.b((java.lang.String[]) r7)     // Catch:{ SQLException -> 0x022f }
            r7 = 4
            r6[r7] = r3     // Catch:{ SQLException -> 0x022f }
            amzy r3 = defpackage.amzy.a((java.lang.Object) r15, (java.lang.Object) r8)     // Catch:{ SQLException -> 0x022f }
            java.lang.String r7 = "people"
            amzy r9 = defpackage.amzy.a((java.lang.Object) r15, (java.lang.Object) r8)     // Catch:{ SQLException -> 0x022f }
            r10 = 1
            java.lang.String r3 = defpackage.wtq.a(r3, r7, r9, r10)     // Catch:{ SQLException -> 0x022f }
            r7 = 5
            r6[r7] = r3     // Catch:{ SQLException -> 0x022f }
            amzy r3 = defpackage.amzy.a((java.lang.Object) r15, (java.lang.Object) r14)     // Catch:{ SQLException -> 0x022f }
            java.lang.String r7 = "applications"
            amzy r9 = defpackage.amzy.a((java.lang.Object) r15, (java.lang.Object) r14)     // Catch:{ SQLException -> 0x022f }
            r10 = 1
            java.lang.String r3 = defpackage.wtq.a(r3, r7, r9, r10)     // Catch:{ SQLException -> 0x022f }
            r7 = 6
            r6[r7] = r3     // Catch:{ SQLException -> 0x022f }
            java.lang.String r3 = "facl_people"
            java.lang.String r3 = defpackage.wtq.a(r3, r6)     // Catch:{ SQLException -> 0x022f }
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x022f }
            r3 = 37
            r9 = 1
            goto L_0x0233
        L_0x022f:
            r0 = move-exception
            goto L_0x09cd
        L_0x0232:
        L_0x0233:
            r6 = 38
            if (r3 < r6) goto L_0x0238
            goto L_0x0241
        L_0x0238:
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x022f }
            java.lang.String r3 = "ALTER TABLE people ADD COLUMN invisible_3p INTEGER NOT NULL DEFAULT 0;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x022f }
            r3 = 38
        L_0x0241:
            r6 = 39
            if (r3 < r6) goto L_0x0246
            goto L_0x024b
        L_0x0246:
            defpackage.wtz.a((android.database.sqlite.SQLiteDatabase) r27)     // Catch:{ SQLException -> 0x022f }
            r3 = 39
        L_0x024b:
            r6 = 40
            if (r3 < r6) goto L_0x0250
            goto L_0x0263
        L_0x0250:
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x022f }
            java.lang.String r3 = "ALTER TABLE owners ADD COLUMN is_dasher INTEGER NOT NULL DEFAULT 0;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x022f }
            java.lang.String r3 = "ALTER TABLE owners ADD COLUMN dasher_domain TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x022f }
            java.lang.String r3 = "ALTER TABLE people ADD COLUMN in_viewer_domain INTEGER NOT NULL DEFAULT 0;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x022f }
            r3 = 40
        L_0x0263:
            r6 = 41
            java.lang.String r7 = "custom_label TEXT"
            java.lang.String r10 = "type INTEGER NOT NULL"
            if (r3 >= r6) goto L_0x02c1
            java.lang.String r3 = "postal_address"
            java.lang.String r3 = defpackage.wtq.a((java.lang.String) r3)     // Catch:{ SQLException -> 0x022f }
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x022f }
            r3 = 7
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x022f }
            r3 = 0
            r6[r3] = r20     // Catch:{ SQLException -> 0x022f }
            r3 = 1
            r6[r3] = r13     // Catch:{ SQLException -> 0x022f }
            r3 = 2
            r6[r3] = r17     // Catch:{ SQLException -> 0x022f }
            java.lang.String r3 = "postal_address TEXT NOT NULL"
            r14 = 3
            r6[r14] = r3     // Catch:{ SQLException -> 0x022f }
            r3 = 4
            r6[r3] = r10     // Catch:{ SQLException -> 0x022f }
            r3 = 5
            r6[r3] = r7     // Catch:{ SQLException -> 0x022f }
            amzy r3 = defpackage.amzy.a((java.lang.Object) r15, (java.lang.Object) r8)     // Catch:{ SQLException -> 0x022f }
            java.lang.String r14 = "people"
            r18 = r9
            amzy r9 = defpackage.amzy.a((java.lang.Object) r15, (java.lang.Object) r8)     // Catch:{ SQLException -> 0x022f }
            r23 = r11
            r11 = 1
            java.lang.String r3 = defpackage.wtq.a(r3, r14, r9, r11)     // Catch:{ SQLException -> 0x022f }
            r9 = 6
            r6[r9] = r3     // Catch:{ SQLException -> 0x022f }
            java.lang.String r3 = "postal_address"
            java.lang.String r3 = defpackage.wtq.a(r3, r6)     // Catch:{ SQLException -> 0x022f }
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x022f }
            r3 = 2
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x022f }
            r3 = 0
            r6[r3] = r15     // Catch:{ SQLException -> 0x022f }
            r3 = 1
            r6[r3] = r8     // Catch:{ SQLException -> 0x022f }
            java.lang.String r3 = "postal_address_person"
            java.lang.String r8 = "postal_address"
            java.lang.String r3 = defpackage.wtq.b(r3, r8, r6)     // Catch:{ SQLException -> 0x022f }
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x022f }
            r3 = 41
            goto L_0x02c5
        L_0x02c1:
            r18 = r9
            r23 = r11
        L_0x02c5:
            r6 = 42
            if (r3 < r6) goto L_0x02ca
            goto L_0x02cf
        L_0x02ca:
            defpackage.wtz.a((android.database.sqlite.SQLiteDatabase) r27)     // Catch:{ SQLException -> 0x022f }
            r3 = 42
        L_0x02cf:
            r6 = 44
            if (r3 >= r6) goto L_0x0380
            wtz r3 = r1.a     // Catch:{ SQLException -> 0x037b }
            ycd r6 = defpackage.wtz.a     // Catch:{ SQLException -> 0x037b }
            android.content.Context r3 = r3.b     // Catch:{ SQLException -> 0x037b }
            java.lang.String r6 = "Fixing sync"
            defpackage.wus.b(r3, r5, r6)     // Catch:{ SQLException -> 0x037b }
            ycw r6 = defpackage.wtz.h     // Catch:{ SQLException -> 0x037b }
            anax r6 = r6.d(r3)     // Catch:{ SQLException -> 0x037b }
            anhj r6 = r6.iterator()     // Catch:{ SQLException -> 0x037b }
        L_0x02e8:
            boolean r8 = r6.hasNext()     // Catch:{ SQLException -> 0x037b }
            if (r8 == 0) goto L_0x0376
            java.lang.Object r8 = r6.next()     // Catch:{ SQLException -> 0x037b }
            android.accounts.Account r8 = (android.accounts.Account) r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r9 = r8.name     // Catch:{ SQLException -> 0x037b }
            int r9 = defpackage.wtz.a((android.database.sqlite.SQLiteDatabase) r2, (java.lang.String) r9)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r11 = "com.android.contacts"
            boolean r11 = android.content.ContentResolver.getSyncAutomatically(r8, r11)     // Catch:{ SQLException -> 0x037b }
            boolean r14 = android.content.ContentResolver.getSyncAutomatically(r8, r4)     // Catch:{ SQLException -> 0x037b }
            r24 = r6
            java.util.Locale r6 = java.util.Locale.US     // Catch:{ SQLException -> 0x037b }
            r25 = r12
            r1 = 3
            java.lang.Object[] r12 = new java.lang.Object[r1]     // Catch:{ SQLException -> 0x037b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ SQLException -> 0x037b }
            r21 = 0
            r12[r21] = r1     // Catch:{ SQLException -> 0x037b }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r14)     // Catch:{ SQLException -> 0x037b }
            r16 = 1
            r12[r16] = r1     // Catch:{ SQLException -> 0x037b }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)     // Catch:{ SQLException -> 0x037b }
            r19 = 2
            r12[r19] = r1     // Catch:{ SQLException -> 0x037b }
            java.lang.String r1 = "Last status=%d  people sync=%s  focus sync=%s"
            java.lang.String r1 = java.lang.String.format(r6, r1, r12)     // Catch:{ SQLException -> 0x037b }
            defpackage.wus.a((android.content.Context) r3, (java.lang.String) r5, (android.accounts.Account) r8, (java.lang.String) r1)     // Catch:{ SQLException -> 0x037b }
            aywy r1 = defpackage.aywy.a     // Catch:{ SQLException -> 0x037b }
            ayxk r1 = r1.a()     // Catch:{ SQLException -> 0x037b }
            boolean r1 = r1.cv()     // Catch:{ SQLException -> 0x037b }
            if (r1 != 0) goto L_0x033b
            goto L_0x034d
        L_0x033b:
            r1 = 3
            if (r9 != r1) goto L_0x034d
            if (r14 == 0) goto L_0x034d
            java.lang.String r1 = "Last=failure"
            defpackage.wus.a((android.content.Context) r3, (java.lang.String) r5, (android.accounts.Account) r8, (java.lang.String) r1)     // Catch:{ SQLException -> 0x037b }
            r1 = 0
            android.os.Bundle r6 = defpackage.xej.a((boolean) r1, (boolean) r1)     // Catch:{ SQLException -> 0x037b }
            android.content.ContentResolver.requestSync(r8, r4, r6)     // Catch:{ SQLException -> 0x037b }
        L_0x034d:
            aywy r1 = defpackage.aywy.a     // Catch:{ SQLException -> 0x037b }
            ayxk r1 = r1.a()     // Catch:{ SQLException -> 0x037b }
            boolean r1 = r1.cw()     // Catch:{ SQLException -> 0x037b }
            if (r1 == 0) goto L_0x036e
            if (r11 == 0) goto L_0x036e
            if (r14 != 0) goto L_0x036e
            java.lang.String r1 = "Re-enabling"
            defpackage.wus.a((android.content.Context) r3, (java.lang.String) r5, (android.accounts.Account) r8, (java.lang.String) r1)     // Catch:{ SQLException -> 0x037b }
            r1 = 1
            android.content.ContentResolver.setSyncAutomatically(r8, r4, r1)     // Catch:{ SQLException -> 0x037b }
            r1 = r26
            r6 = r24
            r12 = r25
            goto L_0x02e8
        L_0x036e:
            r1 = r26
            r6 = r24
            r12 = r25
            goto L_0x02e8
        L_0x0376:
            r25 = r12
            r3 = 44
            goto L_0x0382
        L_0x037b:
            r0 = move-exception
            r6 = r26
            goto L_0x09ce
        L_0x0380:
            r25 = r12
        L_0x0382:
            r1 = 45
            if (r3 < r1) goto L_0x0387
            goto L_0x0390
        L_0x0387:
            ycd r1 = defpackage.wtz.a     // Catch:{ SQLException -> 0x037b }
            java.lang.String r1 = "DELETE FROM people WHERE name IS NULL;"
            r2.execSQL(r1)     // Catch:{ SQLException -> 0x037b }
            r3 = 45
        L_0x0390:
            r1 = 46
            if (r3 < r1) goto L_0x0395
            goto L_0x039e
        L_0x0395:
            ycd r1 = defpackage.wtz.a     // Catch:{ SQLException -> 0x037b }
            java.lang.String r1 = "ALTER TABLE people ADD COLUMN name_verified INTEGER NOT NULL DEFAULT 0;"
            r2.execSQL(r1)     // Catch:{ SQLException -> 0x037b }
            r3 = 46
        L_0x039e:
            r1 = 47
            if (r3 < r1) goto L_0x03a3
            goto L_0x03a8
        L_0x03a3:
            defpackage.wtz.a((android.database.sqlite.SQLiteDatabase) r27)     // Catch:{ SQLException -> 0x037b }
            r3 = 47
        L_0x03a8:
            r1 = 100
            if (r3 >= r1) goto L_0x0437
            ycd r1 = defpackage.wtz.a     // Catch:{ SQLException -> 0x037b }
            java.lang.String r1 = "ALTER TABLE owners ADD COLUMN etag TEXT;"
            r2.execSQL(r1)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r1 = "ALTER TABLE people ADD COLUMN in_circle INTEGER NOT NULL DEFAULT 0;"
            r2.execSQL(r1)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r1 = "UPDATE people SET in_circle=1;"
            r2.execSQL(r1)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r1 = "ALTER TABLE people ADD COLUMN in_contacts INTEGER NOT NULL DEFAULT 0;"
            r2.execSQL(r1)     // Catch:{ SQLException -> 0x037b }
            r1 = 6
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ SQLException -> 0x037b }
            r1 = 0
            r3[r1] = r20     // Catch:{ SQLException -> 0x037b }
            r1 = 1
            r3[r1] = r13     // Catch:{ SQLException -> 0x037b }
            java.lang.String r1 = "email TEXT NOT NULL"
            r6 = 2
            r3[r6] = r1     // Catch:{ SQLException -> 0x037b }
            r1 = 3
            r3[r1] = r10     // Catch:{ SQLException -> 0x037b }
            r1 = 4
            r3[r1] = r7     // Catch:{ SQLException -> 0x037b }
            r1 = r23
            r6 = r25
            java.lang.String r8 = defpackage.wtq.a((java.lang.String) r15, (java.lang.String) r1, (java.lang.String) r6)     // Catch:{ SQLException -> 0x037b }
            r9 = 5
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "owner_emails"
            java.lang.String r3 = defpackage.wtq.a(r8, r3)     // Catch:{ SQLException -> 0x037b }
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 6
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x037b }
            r3 = 0
            r8[r3] = r20     // Catch:{ SQLException -> 0x037b }
            r3 = 1
            r8[r3] = r13     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "phone TEXT NOT NULL"
            r9 = 2
            r8[r9] = r3     // Catch:{ SQLException -> 0x037b }
            r3 = 3
            r8[r3] = r10     // Catch:{ SQLException -> 0x037b }
            r3 = 4
            r8[r3] = r7     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = defpackage.wtq.a((java.lang.String) r15, (java.lang.String) r1, (java.lang.String) r6)     // Catch:{ SQLException -> 0x037b }
            r9 = 5
            r8[r9] = r3     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "owner_phones"
            java.lang.String r3 = defpackage.wtq.a(r3, r8)     // Catch:{ SQLException -> 0x037b }
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 6
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x037b }
            r3 = 0
            r8[r3] = r20     // Catch:{ SQLException -> 0x037b }
            r3 = 1
            r8[r3] = r13     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "postal_address TEXT NOT NULL"
            r9 = 2
            r8[r9] = r3     // Catch:{ SQLException -> 0x037b }
            r3 = 3
            r8[r3] = r10     // Catch:{ SQLException -> 0x037b }
            r3 = 4
            r8[r3] = r7     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = defpackage.wtq.a((java.lang.String) r15, (java.lang.String) r1, (java.lang.String) r6)     // Catch:{ SQLException -> 0x037b }
            r9 = 5
            r8[r9] = r3     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "owner_postal_address"
            java.lang.String r3 = defpackage.wtq.a(r3, r8)     // Catch:{ SQLException -> 0x037b }
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 100
            r18 = 1
            goto L_0x043b
        L_0x0437:
            r1 = r23
            r6 = r25
        L_0x043b:
            r8 = 101(0x65, float:1.42E-43)
            if (r3 >= r8) goto L_0x0477
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x037b }
            r3 = 5
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x037b }
            r3 = 0
            r8[r3] = r20     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "account_name TEXT NOT NULL"
            r9 = 1
            r8[r9] = r3     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "page_gaia_id TEXT"
            r9 = 2
            r8[r9] = r3     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "sync_requested_time INTEGER NOT NULL DEFAULT 0"
            r11 = 3
            r8[r11] = r3     // Catch:{ SQLException -> 0x037b }
            java.lang.String[] r3 = new java.lang.String[r9]     // Catch:{ SQLException -> 0x037b }
            java.lang.String r9 = "account_name"
            r11 = 0
            r3[r11] = r9     // Catch:{ SQLException -> 0x037b }
            java.lang.String r9 = "page_gaia_id"
            r11 = 1
            r3[r11] = r9     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = defpackage.wtq.a((java.lang.String[]) r3)     // Catch:{ SQLException -> 0x037b }
            r9 = 4
            r8[r9] = r3     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "owner_sync_requests"
            java.lang.String r3 = defpackage.wtq.a(r3, r8)     // Catch:{ SQLException -> 0x037b }
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 101(0x65, float:1.42E-43)
            r18 = 1
            goto L_0x0478
        L_0x0477:
        L_0x0478:
            r8 = 102(0x66, float:1.43E-43)
            if (r3 < r8) goto L_0x047d
            goto L_0x048b
        L_0x047d:
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE owners ADD COLUMN sync_circles_to_contacts INTEGER NOT NULL DEFAULT 0;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE owners ADD COLUMN sync_evergreen_to_contacts INTEGER NOT NULL DEFAULT 0;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 102(0x66, float:1.43E-43)
        L_0x048b:
            r8 = 103(0x67, float:1.44E-43)
            if (r3 < r8) goto L_0x0490
            goto L_0x0499
        L_0x0490:
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "DELETE from people WHERE in_circle=0 AND in_contacts=0;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 103(0x67, float:1.44E-43)
        L_0x0499:
            r8 = 104(0x68, float:1.46E-43)
            if (r3 < r8) goto L_0x049e
            goto L_0x04a0
        L_0x049e:
            r3 = 104(0x68, float:1.46E-43)
        L_0x04a0:
            r8 = 105(0x69, float:1.47E-43)
            if (r3 >= r8) goto L_0x0507
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE gaia_id_map ADD COLUMN type INTEGER;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "UPDATE gaia_id_map SET type = (CASE WHEN value LIKE '%@%' then 1 ELSE 2 END);"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 7
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x037b }
            r3 = 0
            r8[r3] = r13     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "contact_id TEXT NOT NULL"
            r9 = 1
            r8[r9] = r3     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "value TEXT NOT NULL"
            r9 = 2
            r8[r9] = r3     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "gaia_id TEXT NOT NULL"
            r9 = 3
            r8[r9] = r3     // Catch:{ SQLException -> 0x037b }
            r3 = 4
            r8[r3] = r10     // Catch:{ SQLException -> 0x037b }
            java.lang.String[] r3 = new java.lang.String[r9]     // Catch:{ SQLException -> 0x037b }
            r9 = 0
            r3[r9] = r15     // Catch:{ SQLException -> 0x037b }
            java.lang.String r9 = "contact_id"
            r10 = 1
            r3[r10] = r9     // Catch:{ SQLException -> 0x037b }
            java.lang.String r9 = "value"
            r10 = 2
            r3[r10] = r9     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = defpackage.wtq.a((java.lang.String[]) r3)     // Catch:{ SQLException -> 0x037b }
            r9 = 5
            r8[r9] = r3     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = defpackage.wtq.a((java.lang.String) r15, (java.lang.String) r1, (java.lang.String) r6)     // Catch:{ SQLException -> 0x037b }
            r9 = 6
            r8[r9] = r3     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "new_table"
            java.lang.String r3 = defpackage.wtq.a(r3, r8)     // Catch:{ SQLException -> 0x037b }
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "INSERT INTO new_table SELECT * FROM gaia_id_map;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "DROP TABLE gaia_id_map;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE new_table RENAME TO gaia_id_map;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "DELETE FROM sync_tokens WHERE name = 'gaiamap';"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 105(0x69, float:1.47E-43)
            r18 = 1
            goto L_0x0508
        L_0x0507:
        L_0x0508:
            r8 = 106(0x6a, float:1.49E-43)
            if (r3 < r8) goto L_0x050d
            goto L_0x0512
        L_0x050d:
            defpackage.wtz.a((android.database.sqlite.SQLiteDatabase) r27)     // Catch:{ SQLException -> 0x037b }
            r3 = 106(0x6a, float:1.49E-43)
        L_0x0512:
            r8 = 107(0x6b, float:1.5E-43)
            if (r3 < r8) goto L_0x0517
            goto L_0x0520
        L_0x0517:
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "DELETE FROM owners WHERE account_name='';"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 107(0x6b, float:1.5E-43)
        L_0x0520:
            r8 = 108(0x6c, float:1.51E-43)
            if (r3 < r8) goto L_0x0525
            goto L_0x052a
        L_0x0525:
            defpackage.wtz.b((android.database.sqlite.SQLiteDatabase) r27)     // Catch:{ SQLException -> 0x037b }
            r3 = 108(0x6c, float:1.51E-43)
        L_0x052a:
            r8 = 200(0xc8, float:2.8E-43)
            if (r3 < r8) goto L_0x052f
            goto L_0x0534
        L_0x052f:
            defpackage.wtz.c((android.database.sqlite.SQLiteDatabase) r27)     // Catch:{ SQLException -> 0x037b }
            r3 = 200(0xc8, float:2.8E-43)
        L_0x0534:
            r8 = 201(0xc9, float:2.82E-43)
            if (r3 < r8) goto L_0x0539
            goto L_0x053e
        L_0x0539:
            defpackage.wtz.d((android.database.sqlite.SQLiteDatabase) r27)     // Catch:{ SQLException -> 0x037b }
            r3 = 201(0xc9, float:2.82E-43)
        L_0x053e:
            r8 = 202(0xca, float:2.83E-43)
            if (r3 < r8) goto L_0x0543
            goto L_0x0565
        L_0x0543:
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE people ADD COLUMN affinity1 REAL;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE people ADD COLUMN affinity2 REAL;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE people ADD COLUMN affinity3 REAL;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE people ADD COLUMN affinity4 REAL;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE people ADD COLUMN affinity5 REAL;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE people ADD COLUMN people_in_common TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 202(0xca, float:2.83E-43)
        L_0x0565:
            r8 = 411(0x19b, float:5.76E-43)
            if (r3 < r8) goto L_0x056c
            r1 = 0
            goto L_0x078e
        L_0x056c:
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x037b }
            r3 = 8
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "ac_item_container_person_id"
            r9 = 0
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "ac_item_container"
            r9 = 1
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "ac_index_1"
            r9 = 2
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "ac_index_item_id"
            r9 = 3
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "ac_index"
            r9 = 4
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "ac_item"
            r9 = 5
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "ac_container"
            r9 = 6
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "ac_people"
            r9 = 7
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.util.List r3 = defpackage.wtq.c(r3)     // Catch:{ SQLException -> 0x037b }
            defpackage.wtz.a((android.database.sqlite.SQLiteDatabase) r2, (java.util.List) r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 12
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x037b }
            r8 = 0
            r3[r8] = r20     // Catch:{ SQLException -> 0x037b }
            r8 = 1
            r3[r8] = r13     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "people_v2_id TEXT NOT NULL"
            r9 = 2
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "qualified_id TEXT"
            r9 = 3
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "sync_is_alive INTEGER NOT NULL DEFAULT 0"
            r9 = 4
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "affinity1 REAL"
            r9 = 5
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "affinity2 REAL"
            r9 = 6
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "affinity3 REAL"
            r9 = 7
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            r8 = 8
            java.lang.String r9 = "affinity4 REAL"
            r3[r8] = r9     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "affinity5 REAL"
            r9 = 9
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            r8 = 2
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ SQLException -> 0x037b }
            r8 = 0
            r9[r8] = r15     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "people_v2_id"
            r10 = 1
            r9[r10] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = defpackage.wtq.a((java.lang.String[]) r9)     // Catch:{ SQLException -> 0x037b }
            r9 = 10
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = defpackage.wtq.a((java.lang.String) r15, (java.lang.String) r1, (java.lang.String) r6)     // Catch:{ SQLException -> 0x037b }
            r9 = 11
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "ac_people"
            java.lang.String r3 = defpackage.wtq.a(r8, r3)     // Catch:{ SQLException -> 0x037b }
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 23
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x037b }
            r8 = 0
            r3[r8] = r20     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "people_id INTEGER NOT NULL"
            r9 = 1
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "container_type INTEGER NOT NULL"
            r9 = 2
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "profile_type INTEGER NOT NULL"
            r9 = 3
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "gaia_id TEXT"
            r9 = 4
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "contact_id TEXT"
            r9 = 5
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "compressed_avatar_url TEXT"
            r9 = 6
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "has_avatar INTEGER NOT NULL DEFAULT 0"
            r9 = 7
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            r8 = 8
            java.lang.String r9 = "in_circle INTEGER NOT NULL DEFAULT 0"
            r3[r8] = r9     // Catch:{ SQLException -> 0x037b }
            r8 = 9
            java.lang.String r9 = "in_viewer_domain INTEGER NOT NULL DEFAULT 0"
            r3[r8] = r9     // Catch:{ SQLException -> 0x037b }
            r8 = 10
            java.lang.String r9 = "display_name TEXT"
            r3[r8] = r9     // Catch:{ SQLException -> 0x037b }
            r8 = 11
            java.lang.String r9 = "formatted_name TEXT"
            r3[r8] = r9     // Catch:{ SQLException -> 0x037b }
            r8 = 12
            java.lang.String r9 = "given_name TEXT"
            r3[r8] = r9     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "family_name TEXT"
            r9 = 13
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "middle_name TEXT"
            r9 = 14
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            r8 = 15
            java.lang.String r9 = "honorific_prefix TEXT"
            r3[r8] = r9     // Catch:{ SQLException -> 0x037b }
            r8 = 16
            java.lang.String r9 = "honorific_suffix TEXT"
            r3[r8] = r9     // Catch:{ SQLException -> 0x037b }
            r8 = 17
            java.lang.String r9 = "yomi_given_name TEXT"
            r3[r8] = r9     // Catch:{ SQLException -> 0x037b }
            r8 = 18
            java.lang.String r9 = "yomi_family_name TEXT"
            r3[r8] = r9     // Catch:{ SQLException -> 0x037b }
            r8 = 19
            java.lang.String r9 = "yomi_honorific_prefix TEXT"
            r3[r8] = r9     // Catch:{ SQLException -> 0x037b }
            r8 = 20
            java.lang.String r9 = "yomi_honorific_suffix TEXT"
            r3[r8] = r9     // Catch:{ SQLException -> 0x037b }
            r8 = 21
            java.lang.String r9 = "nickname TEXT"
            r3[r8] = r9     // Catch:{ SQLException -> 0x037b }
            r8 = 22
            java.lang.String r9 = "people_id"
            java.lang.String r10 = "ac_people"
            java.lang.String r9 = defpackage.wtq.a((java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r6)     // Catch:{ SQLException -> 0x037b }
            r3[r8] = r9     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "ac_container"
            java.lang.String r3 = defpackage.wtq.a(r8, r3)     // Catch:{ SQLException -> 0x037b }
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 14
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x037b }
            r8 = 0
            r3[r8] = r20     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "container_id INTEGER NOT NULL"
            r9 = 1
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "item_type INTEGER NOT NULL"
            r9 = 2
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "is_edge_key INTEGER"
            r9 = 3
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "value TEXT NOT NULL"
            r9 = 4
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "value2 TEXT"
            r9 = 5
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r8 = "value_type INTEGER"
            r9 = 6
            r3[r9] = r8     // Catch:{ SQLException -> 0x037b }
            r8 = 7
            r3[r8] = r7     // Catch:{ SQLException -> 0x037b }
            r7 = 8
            java.lang.String r8 = "affinity1 REAL"
            r3[r7] = r8     // Catch:{ SQLException -> 0x037b }
            r7 = 9
            java.lang.String r8 = "affinity2 REAL"
            r3[r7] = r8     // Catch:{ SQLException -> 0x037b }
            r7 = 10
            java.lang.String r8 = "affinity3 REAL"
            r3[r7] = r8     // Catch:{ SQLException -> 0x037b }
            r7 = 11
            java.lang.String r8 = "affinity4 REAL"
            r3[r7] = r8     // Catch:{ SQLException -> 0x037b }
            r7 = 12
            java.lang.String r8 = "affinity5 REAL"
            r3[r7] = r8     // Catch:{ SQLException -> 0x037b }
            r7 = 13
            java.lang.String r8 = "container_id"
            java.lang.String r9 = "ac_container"
            java.lang.String r8 = defpackage.wtq.a((java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r6)     // Catch:{ SQLException -> 0x037b }
            r3[r7] = r8     // Catch:{ SQLException -> 0x037b }
            java.lang.String r7 = "ac_item"
            java.lang.String r3 = defpackage.wtq.a(r7, r3)     // Catch:{ SQLException -> 0x037b }
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 7
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x037b }
            java.lang.String r7 = "item_id INTEGER NOT NULL"
            r8 = 0
            r3[r8] = r7     // Catch:{ SQLException -> 0x037b }
            r7 = 1
            r3[r7] = r13     // Catch:{ SQLException -> 0x037b }
            java.lang.String r7 = "is_normalized INTEGER NOT NULL"
            r8 = 2
            r3[r8] = r7     // Catch:{ SQLException -> 0x037b }
            java.lang.String r7 = "kind INTEGER NOT NULL"
            r8 = 3
            r3[r8] = r7     // Catch:{ SQLException -> 0x037b }
            java.lang.String r7 = "value TEXT NOT NULL COLLATE NOCASE"
            r8 = 4
            r3[r8] = r7     // Catch:{ SQLException -> 0x037b }
            java.lang.String r1 = defpackage.wtq.a((java.lang.String) r15, (java.lang.String) r1, (java.lang.String) r6)     // Catch:{ SQLException -> 0x037b }
            r7 = 5
            r3[r7] = r1     // Catch:{ SQLException -> 0x037b }
            java.lang.String r1 = "item_id"
            java.lang.String r7 = "ac_item"
            java.lang.String r1 = defpackage.wtq.a((java.lang.String) r1, (java.lang.String) r7, (java.lang.String) r6)     // Catch:{ SQLException -> 0x037b }
            r6 = 6
            r3[r6] = r1     // Catch:{ SQLException -> 0x037b }
            java.lang.String r1 = "ac_index"
            java.lang.String r1 = defpackage.wtq.a(r1, r3)     // Catch:{ SQLException -> 0x037b }
            r2.execSQL(r1)     // Catch:{ SQLException -> 0x037b }
            r1 = 3
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ SQLException -> 0x037b }
            r1 = 0
            r3[r1] = r15     // Catch:{ SQLException -> 0x037b }
            java.lang.String r1 = "value"
            r6 = 1
            r3[r6] = r1     // Catch:{ SQLException -> 0x037b }
            java.lang.String r1 = "kind"
            r6 = 2
            r3[r6] = r1     // Catch:{ SQLException -> 0x037b }
            java.lang.String r1 = "ac_index_1"
            java.lang.String r6 = "ac_index"
            java.lang.String r1 = defpackage.wtq.a((java.lang.String) r1, (java.lang.String) r6, (java.lang.String[]) r3)     // Catch:{ SQLException -> 0x037b }
            r2.execSQL(r1)     // Catch:{ SQLException -> 0x037b }
            r1 = 1
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ SQLException -> 0x037b }
            java.lang.String r1 = "item_id"
            r6 = 0
            r3[r6] = r1     // Catch:{ SQLException -> 0x037b }
            java.lang.String r1 = "ac_index_item_id"
            java.lang.String r6 = "ac_index"
            java.lang.String r1 = defpackage.wtq.a((java.lang.String) r1, (java.lang.String) r6, (java.lang.String[]) r3)     // Catch:{ SQLException -> 0x037b }
            r2.execSQL(r1)     // Catch:{ SQLException -> 0x037b }
            r1 = 1
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ SQLException -> 0x037b }
            java.lang.String r1 = "container_id"
            r6 = 0
            r3[r6] = r1     // Catch:{ SQLException -> 0x037b }
            java.lang.String r1 = "ac_item_container"
            java.lang.String r6 = "ac_item"
            java.lang.String r1 = defpackage.wtq.a((java.lang.String) r1, (java.lang.String) r6, (java.lang.String[]) r3)     // Catch:{ SQLException -> 0x037b }
            r2.execSQL(r1)     // Catch:{ SQLException -> 0x037b }
            r1 = 1
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ SQLException -> 0x037b }
            java.lang.String r1 = "people_id"
            r6 = 0
            r3[r6] = r1     // Catch:{ SQLException -> 0x037b }
            java.lang.String r1 = "ac_item_container_person_id"
            java.lang.String r6 = "ac_container"
            java.lang.String r1 = defpackage.wtq.a((java.lang.String) r1, (java.lang.String) r6, (java.lang.String[]) r3)     // Catch:{ SQLException -> 0x037b }
            r2.execSQL(r1)     // Catch:{ SQLException -> 0x037b }
            r1 = 2
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ SQLException -> 0x037b }
            r1 = 0
            r3[r1] = r15     // Catch:{ SQLException -> 0x037b }
            java.lang.String r1 = "people_v2_id"
            r6 = 1
            r3[r6] = r1     // Catch:{ SQLException -> 0x037b }
            java.lang.String r1 = "ac_people_v2_id"
            java.lang.String r6 = "ac_people"
            java.lang.String r1 = defpackage.wtq.b(r1, r6, r3)     // Catch:{ SQLException -> 0x037b }
            r2.execSQL(r1)     // Catch:{ SQLException -> 0x037b }
            defpackage.wtz.a((android.database.sqlite.SQLiteDatabase) r27)     // Catch:{ SQLException -> 0x037b }
            r3 = 411(0x19b, float:5.76E-43)
            r1 = 1
            r18 = 1
        L_0x078e:
            r6 = 412(0x19c, float:5.77E-43)
            java.lang.String r7 = "temp_gaia_ordinal"
            if (r3 >= r6) goto L_0x07b1
            java.lang.String r3 = defpackage.wtq.a((java.lang.String) r7)     // Catch:{ SQLException -> 0x037b }
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 2
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ordinal INTEGER NOT NULL"
            r8 = 0
            r6[r8] = r3     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "gaia_id TEXT NOT NULL"
            r8 = 1
            r6[r8] = r3     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = defpackage.wtq.a(r7, r6)     // Catch:{ SQLException -> 0x037b }
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 412(0x19c, float:5.77E-43)
        L_0x07b1:
            r6 = 413(0x19d, float:5.79E-43)
            if (r3 >= r6) goto L_0x07d3
            java.lang.String r3 = defpackage.wtq.a((java.lang.String) r7)     // Catch:{ SQLException -> 0x037b }
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 2
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ordinal INTEGER NOT NULL"
            r8 = 0
            r6[r8] = r3     // Catch:{ SQLException -> 0x037b }
            r3 = 1
            r6[r3] = r17     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = defpackage.wtq.a(r7, r6)     // Catch:{ SQLException -> 0x037b }
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 413(0x19d, float:5.79E-43)
            r18 = 1
            goto L_0x07d4
        L_0x07d3:
        L_0x07d4:
            r6 = 414(0x19e, float:5.8E-43)
            if (r3 < r6) goto L_0x07d9
            goto L_0x07e2
        L_0x07d9:
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "DELETE FROM sync_tokens WHERE name = 'me';"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 414(0x19e, float:5.8E-43)
        L_0x07e2:
            r6 = 415(0x19f, float:5.82E-43)
            if (r3 >= r6) goto L_0x0809
            java.lang.String r3 = defpackage.wtq.a((java.lang.String) r7)     // Catch:{ SQLException -> 0x037b }
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x037b }
            java.lang.String r6 = "ordinal INTEGER NOT NULL"
            r8 = 0
            r3[r8] = r6     // Catch:{ SQLException -> 0x037b }
            java.lang.String r6 = "gaia_id TEXT NULL"
            r8 = 1
            r3[r8] = r6     // Catch:{ SQLException -> 0x037b }
            r6 = 2
            r3[r6] = r17     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = defpackage.wtq.a(r7, r3)     // Catch:{ SQLException -> 0x037b }
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 415(0x19f, float:5.82E-43)
            r18 = 1
            goto L_0x080a
        L_0x0809:
        L_0x080a:
            r6 = 501(0x1f5, float:7.02E-43)
            if (r3 >= r6) goto L_0x081a
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE people ADD COLUMN sync_is_alive INTEGER NOT NULL DEFAULT 0;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 501(0x1f5, float:7.02E-43)
            r18 = 1
            goto L_0x081b
        L_0x081a:
        L_0x081b:
            r6 = 600(0x258, float:8.41E-43)
            if (r3 < r6) goto L_0x0820
            goto L_0x0847
        L_0x0820:
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE ac_item ADD COLUMN logging_id TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE emails ADD COLUMN affinity1 REAL;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE emails ADD COLUMN affinity2 REAL;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE emails ADD COLUMN affinity3 REAL;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE emails ADD COLUMN affinity4 REAL;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE emails ADD COLUMN affinity5 REAL;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE emails ADD COLUMN logging_id TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 600(0x258, float:8.41E-43)
        L_0x0847:
            r6 = 601(0x259, float:8.42E-43)
            if (r3 < r6) goto L_0x084c
            goto L_0x085a
        L_0x084c:
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE people ADD COLUMN logging_id TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE ac_people ADD COLUMN logging_id TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 601(0x259, float:8.42E-43)
        L_0x085a:
            r6 = 602(0x25a, float:8.44E-43)
            if (r3 < r6) goto L_0x085f
            goto L_0x08b3
        L_0x085f:
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE people ADD COLUMN logging_id2 TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE people ADD COLUMN logging_id3 TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE people ADD COLUMN logging_id4 TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE people ADD COLUMN logging_id5 TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE emails ADD COLUMN logging_id2 TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE emails ADD COLUMN logging_id3 TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE emails ADD COLUMN logging_id4 TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE emails ADD COLUMN logging_id5 TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE ac_people ADD COLUMN logging_id2 TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE ac_people ADD COLUMN logging_id3 TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE ac_people ADD COLUMN logging_id4 TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE ac_people ADD COLUMN logging_id5 TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE ac_item ADD COLUMN logging_id2 TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE ac_item ADD COLUMN logging_id3 TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE ac_item ADD COLUMN logging_id4 TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE ac_item ADD COLUMN logging_id5 TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 602(0x25a, float:8.44E-43)
        L_0x08b3:
            r6 = 603(0x25b, float:8.45E-43)
            if (r3 < r6) goto L_0x08b8
            goto L_0x08c1
        L_0x08b8:
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ALTER TABLE people ADD COLUMN mobile_owner_id TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            r3 = 603(0x25b, float:8.45E-43)
        L_0x08c1:
            r6 = 604(0x25c, float:8.46E-43)
            if (r3 < r6) goto L_0x08c6
            goto L_0x08cb
        L_0x08c6:
            defpackage.wtz.a((android.database.sqlite.SQLiteDatabase) r27)     // Catch:{ SQLException -> 0x037b }
            r3 = 604(0x25c, float:8.46E-43)
        L_0x08cb:
            r6 = 700(0x2bc, float:9.81E-43)
            if (r3 < r6) goto L_0x08d0
            goto L_0x08d5
        L_0x08d0:
            defpackage.wtz.a((android.database.sqlite.SQLiteDatabase) r27)     // Catch:{ SQLException -> 0x037b }
            r3 = 700(0x2bc, float:9.81E-43)
        L_0x08d5:
            r6 = 1400(0x578, float:1.962E-42)
            if (r3 < r6) goto L_0x08da
            goto L_0x08de
        L_0x08da:
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x037b }
            r3 = 1400(0x578, float:1.962E-42)
        L_0x08de:
            r6 = 1401(0x579, float:1.963E-42)
            if (r3 >= r6) goto L_0x0929
            r6 = r26
            wtz r3 = r6.a     // Catch:{ SQLException -> 0x0926 }
            ycd r7 = defpackage.wtz.a     // Catch:{ SQLException -> 0x0926 }
            android.content.Context r3 = r3.b     // Catch:{ SQLException -> 0x0926 }
            java.lang.String r7 = "ALTER TABLE owners ADD COLUMN is_active_plus_account  INTEGER NOT NULL DEFAULT 0;"
            r2.execSQL(r7)     // Catch:{ SQLException -> 0x0926 }
            ycw r7 = defpackage.wtz.h     // Catch:{ SQLException -> 0x0926 }
            anax r7 = r7.d(r3)     // Catch:{ SQLException -> 0x0926 }
            anhj r7 = r7.iterator()     // Catch:{ SQLException -> 0x0926 }
        L_0x08f9:
            boolean r8 = r7.hasNext()     // Catch:{ SQLException -> 0x0926 }
            if (r8 == 0) goto L_0x0923
            java.lang.Object r8 = r7.next()     // Catch:{ SQLException -> 0x0926 }
            android.accounts.Account r8 = (android.accounts.Account) r8     // Catch:{ SQLException -> 0x0926 }
            ycd r9 = defpackage.wtz.a     // Catch:{ SQLException -> 0x0926 }
            boolean r9 = r9.a((android.content.Context) r3, (android.accounts.Account) r8)     // Catch:{ SQLException -> 0x0926 }
            r10 = 2
            java.lang.String[] r11 = new java.lang.String[r10]     // Catch:{ SQLException -> 0x0926 }
            if (r9 != 0) goto L_0x0913
            java.lang.String r9 = "0"
            goto L_0x0915
        L_0x0913:
            java.lang.String r9 = "1"
        L_0x0915:
            r12 = 0
            r11[r12] = r9     // Catch:{ SQLException -> 0x0926 }
            java.lang.String r8 = r8.name     // Catch:{ SQLException -> 0x0926 }
            r9 = 1
            r11[r9] = r8     // Catch:{ SQLException -> 0x0926 }
            java.lang.String r8 = "UPDATE owners SET is_active_plus_account=? WHERE account_name=?;"
            r2.execSQL(r8, r11)     // Catch:{ SQLException -> 0x0926 }
            goto L_0x08f9
        L_0x0923:
            r3 = 1401(0x579, float:1.963E-42)
            goto L_0x092b
        L_0x0926:
            r0 = move-exception
            goto L_0x09ce
        L_0x0929:
            r6 = r26
        L_0x092b:
            r7 = 1402(0x57a, float:1.965E-42)
            if (r3 < r7) goto L_0x0930
            goto L_0x0939
        L_0x0930:
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x0926 }
            java.lang.String r3 = "ALTER TABLE ac_people ADD COLUMN last_update_time  INTEGER NOT NULL DEFAULT 0;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x0926 }
            r3 = 1402(0x57a, float:1.965E-42)
        L_0x0939:
            r7 = 1403(0x57b, float:1.966E-42)
            if (r3 < r7) goto L_0x093e
            goto L_0x094c
        L_0x093e:
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x0926 }
            java.lang.String r3 = "ALTER TABLE people ADD COLUMN name_visibility TEXT DEFAULT 'public';"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x0926 }
            java.lang.String r3 = "ALTER TABLE people ADD COLUMN avatar_visibility TEXT DEFAULT 'public';"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x0926 }
            r3 = 1403(0x57b, float:1.966E-42)
        L_0x094c:
            r7 = 1404(0x57c, float:1.967E-42)
            if (r3 < r7) goto L_0x0951
            goto L_0x095a
        L_0x0951:
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x0926 }
            java.lang.String r3 = "ALTER TABLE owners ADD COLUMN sync_me_to_contacts INTEGER NOT NULL DEFAULT 0"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x0926 }
            r3 = 1404(0x57c, float:1.967E-42)
        L_0x095a:
            r7 = 1405(0x57d, float:1.969E-42)
            if (r3 < r7) goto L_0x095f
            goto L_0x096d
        L_0x095f:
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x0926 }
            java.lang.String r3 = "UPDATE people SET name_visibility='public';"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x0926 }
            java.lang.String r3 = "UPDATE people SET avatar_visibility='public';"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x0926 }
            r3 = 1405(0x57d, float:1.969E-42)
        L_0x096d:
            r7 = 1500(0x5dc, float:2.102E-42)
            if (r3 < r7) goto L_0x0972
            goto L_0x0980
        L_0x0972:
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x0926 }
            java.lang.String r3 = "ALTER TABLE ac_item ADD COLUMN certificate_expiration_millis INTEGER NOT NULL DEFAULT 0;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x0926 }
            java.lang.String r3 = "ALTER TABLE ac_item ADD COLUMN certificate_status TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x0926 }
            r3 = 1500(0x5dc, float:2.102E-42)
        L_0x0980:
            r7 = 1501(0x5dd, float:2.103E-42)
            if (r3 < r7) goto L_0x0985
            goto L_0x0993
        L_0x0985:
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x0926 }
            java.lang.String r3 = "ALTER TABLE owners ADD COLUMN given_name TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x0926 }
            java.lang.String r3 = "ALTER TABLE owners ADD COLUMN family_name TEXT;"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x0926 }
            r3 = 1501(0x5dd, float:2.103E-42)
        L_0x0993:
            r7 = 1600(0x640, float:2.242E-42)
            if (r3 < r7) goto L_0x0998
            goto L_0x09a1
        L_0x0998:
            ycd r3 = defpackage.wtz.a     // Catch:{ SQLException -> 0x0926 }
            java.lang.String r3 = "ALTER TABLE owners ADD COLUMN contacts_backup_and_sync INTEGER NOT NULL DEFAULT 0"
            r2.execSQL(r3)     // Catch:{ SQLException -> 0x0926 }
            r3 = 1600(0x640, float:2.242E-42)
        L_0x09a1:
            r7 = 1700(0x6a4, float:2.382E-42)
            if (r3 < r7) goto L_0x09a6
            goto L_0x09ab
        L_0x09a6:
            d(r27)     // Catch:{ SQLException -> 0x0926 }
            r3 = 1700(0x6a4, float:2.382E-42)
        L_0x09ab:
            r7 = 1800(0x708, float:2.522E-42)
            if (r3 < r7) goto L_0x09b4
            r7 = 1900(0x76c, float:2.662E-42)
            if (r3 >= r7) goto L_0x09ba
            goto L_0x09b7
        L_0x09b4:
            d(r27)     // Catch:{ SQLException -> 0x0926 }
        L_0x09b7:
            d(r27)     // Catch:{ SQLException -> 0x0926 }
        L_0x09ba:
            if (r18 == 0) goto L_0x09bf
            e(r27)     // Catch:{ SQLException -> 0x0926 }
        L_0x09bf:
            if (r1 != 0) goto L_0x09c4
            r1 = r22
            goto L_0x09ee
        L_0x09c4:
            defpackage.wtz.e(r27)     // Catch:{ SQLException -> 0x0926 }
            r1 = r22
            goto L_0x09ee
        L_0x09ca:
            r0 = move-exception
            r22 = r6
        L_0x09cd:
            r6 = r1
        L_0x09ce:
            r1 = r0
            boolean r3 = defpackage.hxz.a()
            if (r3 == 0) goto L_0x0a44
            java.lang.String r3 = "Upgrade failed. Re-creating the database."
            android.util.Log.e(r5, r3, r1)
            wtz r7 = r6.a
            ycd r8 = defpackage.wtz.a
            android.content.Context r7 = r7.b
            defpackage.wus.a((android.content.Context) r7, (java.lang.String) r5, (java.lang.String) r3, (java.lang.Throwable) r1)
            wtz r1 = r6.a
            r1.f(r2)
            r1 = r22
            r3 = 1
            r1.set(r3)
        L_0x09ee:
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x0a43
            boolean r1 = defpackage.ayws.d()
            if (r1 == 0) goto L_0x0a3a
            wtz r1 = r6.a
            ycd r3 = defpackage.wtz.a
            android.content.Context r1 = r1.b
            java.lang.String r3 = "DELETE FROM sync_tokens;"
            r2.execSQL(r3)
            xej r1 = defpackage.xej.a((android.content.Context) r1)
            android.content.Context r2 = r1.a
            java.lang.String r3 = "PeopleSync"
            java.lang.String r5 = "requestAllFullSyncForDbUpgradeWithLogging"
            defpackage.wus.b(r2, r3, r5)
            ycw r2 = r1.c
            android.content.Context r1 = r1.a
            anax r1 = r2.d(r1)
            anhj r1 = r1.iterator()
        L_0x0a1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0a39
            java.lang.Object r2 = r1.next()
            android.accounts.Account r2 = (android.accounts.Account) r2
            r3 = 0
            android.os.Bundle r5 = defpackage.xej.a((boolean) r3, (boolean) r3)
            java.lang.String r7 = "db_upgrade"
            r8 = 1
            r5.putBoolean(r7, r8)
            defpackage.xej.a((android.accounts.Account) r2, (java.lang.String) r4, (android.os.Bundle) r5)
            goto L_0x0a1e
        L_0x0a39:
            return
        L_0x0a3a:
            wtz r1 = r6.a
            ycd r3 = defpackage.wtz.a
            android.content.Context r1 = r1.b
            defpackage.wtz.a((android.content.Context) r1, (android.database.sqlite.SQLiteDatabase) r2)
        L_0x0a43:
            return
        L_0x0a44:
            goto L_0x0a46
        L_0x0a45:
            throw r1
        L_0x0a46:
            goto L_0x0a45
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wty.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    public static final void c(SQLiteDatabase sQLiteDatabase) {
        Log.w("PeopleDatabaseHelper", "Wiping the database...");
        wtz.a(sQLiteDatabase, wtq.c("temp_gaia_ordinal", "ac_index", "ac_item", "ac_container", "ac_people", "owner_emails", "owner_phones", "owner_postal_address", "owner_sync_requests", "applications", "application_packages", "facl_application", "facl_applications", "facl_circles", "facl_people", "owners", "search_index", "emails", "phones", "postal_address", "circle_members", "circles", "people", "sync_tokens", "properties", "email_gaia_map", "gaia_id_map"));
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        f(sQLiteDatabase);
        wtz.a(sQLiteDatabase, Locale.getDefault());
    }
}
