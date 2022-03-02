package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import java.io.File;

/* renamed from: db  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class db {
    public dp a;
    public final ec b;
    public final String c;
    public final String d;

    public db() {
    }

    public static final void a(String str) {
        if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                int i = Build.VERSION.SDK_INT;
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e) {
                Log.w("SupportSQLite", "delete failed: ", e);
            }
        }
    }

    public db(dp dpVar, ec ecVar, String str, String str2) {
        this.a = dpVar;
        this.b = ecVar;
        this.c = str;
        this.d = str2;
    }

    public final void a(di diVar) {
        diVar.b("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = this.c;
        diVar.b("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (r7 < r4) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r7 <= r4) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0059, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0070 A[EDGE_INSN: B:68:0x0070->B:31:0x0070 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x005b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.di r11, int r12, int r13) {
        /*
            r10 = this;
            dp r0 = r10.a
            if (r0 == 0) goto L_0x00fa
            ea r0 = r0.c
            r1 = 0
            r2 = 0
            if (r12 == r13) goto L_0x006c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = r12
        L_0x0010:
            if (r13 > r12) goto L_0x0015
            if (r4 <= r13) goto L_0x0017
            goto L_0x001a
        L_0x0015:
            if (r4 < r13) goto L_0x001a
        L_0x0017:
            r1 = r3
            goto L_0x0070
        L_0x001a:
            java.util.HashMap r5 = r0.a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r5.get(r6)
            java.util.TreeMap r5 = (java.util.TreeMap) r5
            if (r5 != 0) goto L_0x0029
            goto L_0x0070
        L_0x0029:
            if (r13 > r12) goto L_0x0030
            java.util.Set r6 = r5.keySet()
            goto L_0x0034
        L_0x0030:
            java.util.NavigableSet r6 = r5.descendingKeySet()
        L_0x0034:
            java.util.Iterator r6 = r6.iterator()
        L_0x0038:
            boolean r7 = r6.hasNext()
            r8 = 1
            if (r7 == 0) goto L_0x0068
            java.lang.Object r7 = r6.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r13 > r12) goto L_0x0052
            if (r7 >= r13) goto L_0x004f
            r9 = 0
            goto L_0x0059
        L_0x004f:
            if (r7 >= r4) goto L_0x0054
            goto L_0x0058
        L_0x0052:
            if (r7 <= r13) goto L_0x0056
        L_0x0054:
            r9 = 0
            goto L_0x0059
        L_0x0056:
            if (r7 <= r4) goto L_0x0054
        L_0x0058:
            r9 = 1
        L_0x0059:
            if (r9 == 0) goto L_0x0038
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            java.lang.Object r4 = r5.get(r4)
            r3.add(r4)
            r4 = r7
            goto L_0x0069
        L_0x0068:
            r8 = 0
        L_0x0069:
            if (r8 != 0) goto L_0x0010
            goto L_0x0070
        L_0x006c:
            java.util.List r1 = java.util.Collections.emptyList()
        L_0x0070:
            if (r1 == 0) goto L_0x00fa
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.String r13 = "SELECT name FROM sqlite_master WHERE type = 'trigger'"
            android.database.Cursor r13 = r11.a((java.lang.String) r13)
        L_0x007d:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x00f5 }
            if (r0 != 0) goto L_0x00ec
            r13.close()
            int r13 = r12.size()
        L_0x008a:
            if (r2 >= r13) goto L_0x00b1
            java.lang.Object r0 = r12.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = "room_fts_content_sync_"
            boolean r3 = r0.startsWith(r3)
            if (r3 == 0) goto L_0x00ae
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "DROP TRIGGER IF EXISTS "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r11.b(r0)
        L_0x00ae:
            int r2 = r2 + 1
            goto L_0x008a
        L_0x00b1:
            java.util.Iterator r12 = r1.iterator()
        L_0x00b5:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00c5
            java.lang.Object r13 = r12.next()
            ej r13 = (defpackage.ej) r13
            r13.a(r11)
            goto L_0x00b5
        L_0x00c5:
            ec r12 = r10.b
            ed r12 = r12.b(r11)
            boolean r13 = r12.a
            if (r13 == 0) goto L_0x00d3
            r10.a((defpackage.di) r11)
            return
        L_0x00d3:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Migration didn't properly handle: "
            r13.append(r0)
            java.lang.String r12 = r12.b
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.<init>(r12)
            throw r11
        L_0x00ec:
            java.lang.String r0 = r13.getString(r2)     // Catch:{ all -> 0x00f5 }
            r12.add(r0)     // Catch:{ all -> 0x00f5 }
            goto L_0x007d
        L_0x00f5:
            r11 = move-exception
            r13.close()
            throw r11
        L_0x00fa:
            dp r0 = r10.a
            if (r0 == 0) goto L_0x011e
            if (r12 <= r13) goto L_0x0104
            boolean r1 = r0.g
            if (r1 != 0) goto L_0x0108
        L_0x0104:
            boolean r0 = r0.f
            if (r0 != 0) goto L_0x011e
        L_0x0108:
            java.lang.String r12 = "DROP TABLE IF EXISTS `resource_info`"
            r11.b(r12)
            java.lang.String r12 = "DROP TABLE IF EXISTS `dismissed_prompt_item`"
            r11.b(r12)
            java.lang.String r12 = "DROP TABLE IF EXISTS `per_device_dismissed_onboarding_flow`"
            r11.b(r12)
            ec r12 = r10.b
            r12.a(r11)
            return
        L_0x011e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "A migration from "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = " to "
            r0.append(r12)
            r0.append(r13)
            java.lang.String r12 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            goto L_0x0143
        L_0x0142:
            throw r11
        L_0x0143:
            goto L_0x0142
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db.a(di, int, int):void");
    }
}
