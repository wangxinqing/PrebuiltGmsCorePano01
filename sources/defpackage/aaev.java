package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.util.Locale;

/* renamed from: aaev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaev extends jjj {
    public final int a;

    static final void b(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        sQLiteDatabase.execSQL(String.format(Locale.US, "CREATE UNIQUE INDEX %s ON \"%s\" (\"tag\", \"target_class\", \"target_package\", \"user_id\");", new Object[]{str2, str}));
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        qye qye = new qye("nts:db:onCreate");
        try {
            a(sQLiteDatabase, "pending_ops", "pk_pending_ops");
            qye.close();
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.a >= 17;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.a >= 18;
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 14) {
            Log.e("NetworkScheduler", String.format("Database downgrade required (version %d -> %d), dropping all data", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS pending_ops;");
            a(sQLiteDatabase, "pending_ops", "pk_pending_ops");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006f, code lost:
        r0.execSQL(java.lang.String.format("ALTER TABLE %s add COLUMN %s INTEGER;", new java.lang.Object[]{r7, "requires_charging"}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007e, code lost:
        r0.execSQL(java.lang.String.format("ALTER TABLE %s add COLUMN %s STRING;", new java.lang.Object[]{r7, "extras"}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008f, code lost:
        r3 = new java.lang.StringBuilder(287);
        r3.append("create TABLE ");
        r3.append("tmp");
        r3.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, target_package TEXT NOT NULL, target_class TEXT NOT NULL, tag TEXT, runtime INTEGER, flex_time INTEGER, period INTEGER, last_runtime INTEGER, user_id INTEGER, required_network_type INTEGER, requires_charging INTEGER, extras TEXT);");
        r0.execSQL(r3.toString());
        r2 = new java.lang.StringBuilder(180);
        r2.append("INSERT INTO tmp SELECT _id, target_package, target_class, tag, runtime, flex_time, period, last_runtime, user_id, required_network_type, requires_charging, extras FROM pending_ops;");
        r0.execSQL(r2.toString());
        r0.execSQL("DROP TABLE pending_ops;");
        r2 = new java.lang.StringBuilder(38);
        r2.append("ALTER TABLE tmp RENAME TO pending_ops;");
        r0.execSQL(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d7, code lost:
        r0.execSQL(java.lang.String.format("ALTER TABLE %s add COLUMN %s TEXT;", new java.lang.Object[]{r7, "retry_strategy"}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00e9, code lost:
        r0.execSQL(java.lang.String.format("ALTER TABLE %s add COLUMN %s INTEGER;", new java.lang.Object[]{r7, "task_type"}));
        r26 = "pk_pending_ops";
        r27 = r18;
        r28 = r7;
        r11 = "task_type";
        r2 = r30.query("pending_ops", new java.lang.String[]{"_id", "runtime", "flex_time", "period"}, (java.lang.String) null, (java.lang.String[]) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x012f, code lost:
        if (r2 != null) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0131, code lost:
        android.util.Log.e("NetworkScheduler", "Trying to upgrade column values from DB, but cursor is invalid.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0138, code lost:
        r7 = r28;
        r3 = 0;
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r2.moveToFirst();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0144, code lost:
        if (r2.isAfterLast() != false) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0146, code lost:
        r4 = r2.getInt(0);
        r6 = r2.getLong(1);
        r9 = r2.getLong(2);
        r17 = r2.getLong(3);
        r19 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x015e, code lost:
        if (r17 == 0) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0160, code lost:
        r6 = r6 - r17;
        r19 = r9;
        r9 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0166, code lost:
        r6 = r6 - r9;
        r17 = r9;
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x016a, code lost:
        r10 = new android.content.ContentValues();
        r10.put("runtime", java.lang.Long.valueOf(r6));
        r10.put("flex_time", java.lang.Long.valueOf(r19));
        r10.put("period", java.lang.Long.valueOf(r17));
        r10.put(r11, java.lang.Integer.valueOf(r9));
        r7 = r28;
        r0.update(r7, r10, "_id = ?", new java.lang.String[]{java.lang.Integer.toString(r4)});
        r2.moveToNext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x019d, code lost:
        r28 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01a0, code lost:
        r7 = r28;
        r3 = 0;
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01a7, code lost:
        r2 = java.util.Locale.US;
        r6 = new java.lang.Object[2];
        r6[r3] = r7;
        r6[r5] = "job_id";
        r0.execSQL(java.lang.String.format(r2, "ALTER TABLE %s ADD COLUMN %s INTEGER;", r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01bb, code lost:
        r2 = java.util.Locale.US;
        r6 = new java.lang.Object[2];
        r6[r3] = r7;
        r6[r5] = "content_uris";
        r4 = r27;
        r0.execSQL(java.lang.String.format(r2, r4, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01cf, code lost:
        r0.execSQL("DELETE FROM pending_ops WHERE _id NOT IN (SELECT MAX(_id) FROM pending_ops GROUP BY tag, target_class, target_package, user_id);");
        b(r0, r7, r26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01d9, code lost:
        r2 = java.util.Locale.US;
        r8 = new java.lang.Object[2];
        r8[r3] = r7;
        r8[r5] = "source";
        r0.execSQL(java.lang.String.format(r2, "ALTER TABLE %s ADD COLUMN %S INTEGER DEFAULT 0;", r8));
        r2 = java.util.Locale.US;
        r8 = new java.lang.Object[2];
        r8[r3] = r7;
        r8[r5] = "source_version";
        r0.execSQL(java.lang.String.format(r2, "ALTER TABLE %s ADD COLUMN %S INTEGER DEFAULT 0;", r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01fd, code lost:
        r2 = java.util.Locale.US;
        r8 = new java.lang.Object[2];
        r8[r3] = r7;
        r8[r5] = "triggered_content_uris";
        r0.execSQL(java.lang.String.format(r2, r4, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x020f, code lost:
        r2 = java.util.Locale.US;
        r4 = new java.lang.Object[2];
        r4[r3] = r7;
        r4[r5] = "required_uris";
        r0.execSQL(java.lang.String.format(r2, "ALTER TABLE %s ADD COLUMN %s TEXT;", r4));
        r2 = 14;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r30, int r31, int r32) {
        /*
            r29 = this;
            r1 = r29
            r0 = r30
            r2 = r31
            r11 = r32
            java.lang.String r12 = "period"
            java.lang.String r13 = "flex_time"
            java.lang.String r14 = "runtime"
            java.lang.String r15 = "ALTER TABLE %s ADD COLUMN %S INTEGER DEFAULT 0;"
            java.lang.String r10 = "task_type"
            qye r9 = new qye
            java.lang.String r3 = "nts:db:onUpgrade"
            r9.<init>(r3)
            aaew r3 = new aaew     // Catch:{ all -> 0x029c }
            r3.<init>(r1)     // Catch:{ all -> 0x029c }
            r4 = 13
            java.lang.String r7 = "pending_ops"
            if (r2 > r4) goto L_0x0239
            java.lang.String r6 = "ALTER TABLE %s ADD COLUMN %s STRING;"
            java.lang.String r5 = "pk_pending_ops"
            java.lang.String r4 = "ALTER TABLE %s add COLUMN %s INTEGER;"
            r16 = r9
            r9 = 2
            r8 = 1
            r18 = r6
            r6 = 0
            switch(r2) {
                case 1: goto L_0x022b;
                case 2: goto L_0x0060;
                case 3: goto L_0x006f;
                case 4: goto L_0x007e;
                case 5: goto L_0x008f;
                case 6: goto L_0x00d7;
                case 7: goto L_0x00e9;
                case 8: goto L_0x0058;
                case 9: goto L_0x0050;
                case 10: goto L_0x0048;
                case 11: goto L_0x0042;
                case 12: goto L_0x003c;
                case 13: goto L_0x0038;
                default: goto L_0x0034;
            }
        L_0x0034:
            r2 = 14
            goto L_0x023b
        L_0x0038:
            r3 = 0
            r5 = 1
            goto L_0x020f
        L_0x003c:
            r4 = r18
            r3 = 0
            r5 = 1
            goto L_0x01fd
        L_0x0042:
            r4 = r18
            r3 = 0
            r5 = 1
            goto L_0x01d9
        L_0x0048:
            r26 = r5
            r4 = r18
            r3 = 0
            r5 = 1
            goto L_0x01cf
        L_0x0050:
            r26 = r5
            r27 = r18
            r3 = 0
            r5 = 1
            goto L_0x01bb
        L_0x0058:
            r26 = r5
            r27 = r18
            r3 = 0
            r5 = 1
            goto L_0x01a7
        L_0x0060:
            java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ all -> 0x029a }
            r2[r6] = r7     // Catch:{ all -> 0x029a }
            java.lang.String r3 = "required_network_type"
            r2[r8] = r3     // Catch:{ all -> 0x029a }
            java.lang.String r2 = java.lang.String.format(r4, r2)     // Catch:{ all -> 0x029a }
            r0.execSQL(r2)     // Catch:{ all -> 0x029a }
        L_0x006f:
            java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ all -> 0x029a }
            r2[r6] = r7     // Catch:{ all -> 0x029a }
            java.lang.String r3 = "requires_charging"
            r2[r8] = r3     // Catch:{ all -> 0x029a }
            java.lang.String r2 = java.lang.String.format(r4, r2)     // Catch:{ all -> 0x029a }
            r0.execSQL(r2)     // Catch:{ all -> 0x029a }
        L_0x007e:
            java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ all -> 0x029a }
            r2[r6] = r7     // Catch:{ all -> 0x029a }
            java.lang.String r3 = "extras"
            r2[r8] = r3     // Catch:{ all -> 0x029a }
            java.lang.String r3 = "ALTER TABLE %s add COLUMN %s STRING;"
            java.lang.String r2 = java.lang.String.format(r3, r2)     // Catch:{ all -> 0x029a }
            r0.execSQL(r2)     // Catch:{ all -> 0x029a }
        L_0x008f:
            java.lang.String r2 = "tmp"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x029a }
            r8 = 287(0x11f, float:4.02E-43)
            r3.<init>(r8)     // Catch:{ all -> 0x029a }
            java.lang.String r8 = "create TABLE "
            r3.append(r8)     // Catch:{ all -> 0x029a }
            r3.append(r2)     // Catch:{ all -> 0x029a }
            java.lang.String r2 = " (_id INTEGER PRIMARY KEY AUTOINCREMENT, target_package TEXT NOT NULL, target_class TEXT NOT NULL, tag TEXT, runtime INTEGER, flex_time INTEGER, period INTEGER, last_runtime INTEGER, user_id INTEGER, required_network_type INTEGER, requires_charging INTEGER, extras TEXT);"
            r3.append(r2)     // Catch:{ all -> 0x029a }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x029a }
            r0.execSQL(r2)     // Catch:{ all -> 0x029a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x029a }
            r3 = 180(0xb4, float:2.52E-43)
            r2.<init>(r3)     // Catch:{ all -> 0x029a }
            java.lang.String r3 = "INSERT INTO tmp SELECT _id, target_package, target_class, tag, runtime, flex_time, period, last_runtime, user_id, required_network_type, requires_charging, extras FROM pending_ops;"
            r2.append(r3)     // Catch:{ all -> 0x029a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x029a }
            r0.execSQL(r2)     // Catch:{ all -> 0x029a }
            java.lang.String r2 = "DROP TABLE pending_ops;"
            r0.execSQL(r2)     // Catch:{ all -> 0x029a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x029a }
            r3 = 38
            r2.<init>(r3)     // Catch:{ all -> 0x029a }
            java.lang.String r3 = "ALTER TABLE tmp RENAME TO pending_ops;"
            r2.append(r3)     // Catch:{ all -> 0x029a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x029a }
            r0.execSQL(r2)     // Catch:{ all -> 0x029a }
        L_0x00d7:
            java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ all -> 0x029a }
            r2[r6] = r7     // Catch:{ all -> 0x029a }
            java.lang.String r3 = "retry_strategy"
            r8 = 1
            r2[r8] = r3     // Catch:{ all -> 0x029a }
            java.lang.String r3 = "ALTER TABLE %s add COLUMN %s TEXT;"
            java.lang.String r2 = java.lang.String.format(r3, r2)     // Catch:{ all -> 0x029a }
            r0.execSQL(r2)     // Catch:{ all -> 0x029a }
        L_0x00e9:
            java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ all -> 0x029a }
            r2[r6] = r7     // Catch:{ all -> 0x029a }
            r3 = 1
            r2[r3] = r10     // Catch:{ all -> 0x029a }
            java.lang.String r2 = java.lang.String.format(r4, r2)     // Catch:{ all -> 0x029a }
            r0.execSQL(r2)     // Catch:{ all -> 0x029a }
            r2 = 4
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch:{ all -> 0x029a }
            java.lang.String r2 = "_id"
            r4[r6] = r2     // Catch:{ all -> 0x029a }
            r8 = 1
            r4[r8] = r14     // Catch:{ all -> 0x029a }
            r4[r9] = r13     // Catch:{ all -> 0x029a }
            r3 = 3
            r4[r3] = r12     // Catch:{ all -> 0x029a }
            java.lang.String r19 = "pending_ops"
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r2 = r30
            r3 = r19
            r26 = r5
            r5 = r20
            r27 = r18
            r6 = r21
            r28 = r7
            r7 = r22
            r8 = r23
            r9 = r24
            r11 = r10
            r10 = r25
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x029a }
            if (r2 != 0) goto L_0x013d
            java.lang.String r2 = "NetworkScheduler"
            java.lang.String r3 = "Trying to upgrade column values from DB, but cursor is invalid."
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x029a }
            r7 = r28
            r3 = 0
            r5 = 1
            goto L_0x01a7
        L_0x013d:
            r2.moveToFirst()     // Catch:{ all -> 0x0226 }
        L_0x0140:
            boolean r3 = r2.isAfterLast()     // Catch:{ all -> 0x0226 }
            if (r3 != 0) goto L_0x01a0
            r3 = 0
            int r4 = r2.getInt(r3)     // Catch:{ all -> 0x0226 }
            r5 = 1
            long r6 = r2.getLong(r5)     // Catch:{ all -> 0x0226 }
            r8 = 2
            long r9 = r2.getLong(r8)     // Catch:{ all -> 0x0226 }
            r8 = 3
            long r17 = r2.getLong(r8)     // Catch:{ all -> 0x0226 }
            r19 = 0
            int r21 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r21 == 0) goto L_0x0166
            long r6 = r6 - r17
            r19 = r9
            r9 = 1
            goto L_0x016a
        L_0x0166:
            long r6 = r6 - r9
            r17 = r9
            r9 = 0
        L_0x016a:
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x0226 }
            r10.<init>()     // Catch:{ all -> 0x0226 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0226 }
            r10.put(r14, r6)     // Catch:{ all -> 0x0226 }
            java.lang.Long r6 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0226 }
            r10.put(r13, r6)     // Catch:{ all -> 0x0226 }
            java.lang.Long r6 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0226 }
            r10.put(r12, r6)     // Catch:{ all -> 0x0226 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0226 }
            r10.put(r11, r6)     // Catch:{ all -> 0x0226 }
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ all -> 0x0226 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x0226 }
            r6[r3] = r4     // Catch:{ all -> 0x0226 }
            java.lang.String r4 = "_id = ?"
            r7 = r28
            r0.update(r7, r10, r4, r6)     // Catch:{ all -> 0x0226 }
            r2.moveToNext()     // Catch:{ all -> 0x0226 }
            r28 = r7
            goto L_0x0140
        L_0x01a0:
            r7 = r28
            r3 = 0
            r5 = 1
            r2.close()     // Catch:{ all -> 0x029a }
        L_0x01a7:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x029a }
            r4 = 2
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x029a }
            r6[r3] = r7     // Catch:{ all -> 0x029a }
            java.lang.String r4 = "job_id"
            r6[r5] = r4     // Catch:{ all -> 0x029a }
            java.lang.String r4 = "ALTER TABLE %s ADD COLUMN %s INTEGER;"
            java.lang.String r2 = java.lang.String.format(r2, r4, r6)     // Catch:{ all -> 0x029a }
            r0.execSQL(r2)     // Catch:{ all -> 0x029a }
        L_0x01bb:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x029a }
            r4 = 2
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x029a }
            r6[r3] = r7     // Catch:{ all -> 0x029a }
            java.lang.String r4 = "content_uris"
            r6[r5] = r4     // Catch:{ all -> 0x029a }
            r4 = r27
            java.lang.String r2 = java.lang.String.format(r2, r4, r6)     // Catch:{ all -> 0x029a }
            r0.execSQL(r2)     // Catch:{ all -> 0x029a }
        L_0x01cf:
            java.lang.String r2 = "DELETE FROM pending_ops WHERE _id NOT IN (SELECT MAX(_id) FROM pending_ops GROUP BY tag, target_class, target_package, user_id);"
            r0.execSQL(r2)     // Catch:{ all -> 0x029a }
            r2 = r26
            b(r0, r7, r2)     // Catch:{ all -> 0x029a }
        L_0x01d9:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x029a }
            r6 = 2
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x029a }
            r8[r3] = r7     // Catch:{ all -> 0x029a }
            java.lang.String r6 = "source"
            r8[r5] = r6     // Catch:{ all -> 0x029a }
            java.lang.String r2 = java.lang.String.format(r2, r15, r8)     // Catch:{ all -> 0x029a }
            r0.execSQL(r2)     // Catch:{ all -> 0x029a }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x029a }
            r6 = 2
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x029a }
            r8[r3] = r7     // Catch:{ all -> 0x029a }
            java.lang.String r6 = "source_version"
            r8[r5] = r6     // Catch:{ all -> 0x029a }
            java.lang.String r2 = java.lang.String.format(r2, r15, r8)     // Catch:{ all -> 0x029a }
            r0.execSQL(r2)     // Catch:{ all -> 0x029a }
        L_0x01fd:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x029a }
            r6 = 2
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x029a }
            r8[r3] = r7     // Catch:{ all -> 0x029a }
            java.lang.String r6 = "triggered_content_uris"
            r8[r5] = r6     // Catch:{ all -> 0x029a }
            java.lang.String r2 = java.lang.String.format(r2, r4, r8)     // Catch:{ all -> 0x029a }
            r0.execSQL(r2)     // Catch:{ all -> 0x029a }
        L_0x020f:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x029a }
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x029a }
            r4[r3] = r7     // Catch:{ all -> 0x029a }
            java.lang.String r3 = "required_uris"
            r4[r5] = r3     // Catch:{ all -> 0x029a }
            java.lang.String r3 = "ALTER TABLE %s ADD COLUMN %s TEXT;"
            java.lang.String r2 = java.lang.String.format(r2, r3, r4)     // Catch:{ all -> 0x029a }
            r0.execSQL(r2)     // Catch:{ all -> 0x029a }
            r2 = 14
            goto L_0x023b
        L_0x0226:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x029a }
            throw r0     // Catch:{ all -> 0x029a }
        L_0x022b:
            r2 = r5
            java.lang.String r4 = "DROP TABLE IF EXISTS pending_ops"
            r0.execSQL(r4)     // Catch:{ all -> 0x029a }
            aaev r3 = r3.a     // Catch:{ all -> 0x029a }
            r3.a(r0, r7, r2)     // Catch:{ all -> 0x029a }
            r2 = 14
            goto L_0x023b
        L_0x0239:
            r16 = r9
        L_0x023b:
            aaew r3 = new aaew     // Catch:{ all -> 0x029a }
            r3.<init>(r1)     // Catch:{ all -> 0x029a }
            r3 = 15
            java.lang.String r4 = "INTEGER"
            r5 = 14
            if (r2 <= r5) goto L_0x024b
            r5 = r32
            goto L_0x025b
        L_0x024b:
            r5 = r32
            if (r5 < r3) goto L_0x025b
            java.lang.String r2 = "preferred_network_type"
            defpackage.aaex.a(r0, r7, r2, r4)     // Catch:{ all -> 0x029a }
            java.lang.String r2 = "preferred_charging_state"
            defpackage.aaex.a(r0, r7, r2, r4)     // Catch:{ all -> 0x029a }
            r2 = 15
        L_0x025b:
            aaew r6 = new aaew     // Catch:{ all -> 0x029a }
            r6.<init>(r1)     // Catch:{ all -> 0x029a }
            r6 = 16
            if (r2 <= r3) goto L_0x0265
            goto L_0x0273
        L_0x0265:
            if (r5 < r6) goto L_0x0273
            java.lang.String r2 = "required_idleness_state"
            defpackage.aaex.a(r0, r7, r2, r4)     // Catch:{ all -> 0x029a }
            java.lang.String r2 = "preferred_idleness_state"
            defpackage.aaex.a(r0, r7, r2, r4)     // Catch:{ all -> 0x029a }
            r2 = 16
        L_0x0273:
            aaew r3 = new aaew     // Catch:{ all -> 0x029a }
            r3.<init>(r1)     // Catch:{ all -> 0x029a }
            r3 = 17
            if (r2 <= r6) goto L_0x027d
            goto L_0x0286
        L_0x027d:
            if (r5 < r3) goto L_0x0286
            java.lang.String r2 = "service_kind"
            defpackage.aaex.a(r0, r7, r2, r4)     // Catch:{ all -> 0x029a }
            r2 = 17
        L_0x0286:
            aaew r6 = new aaew     // Catch:{ all -> 0x029a }
            r6.<init>(r1)     // Catch:{ all -> 0x029a }
            if (r2 > r3) goto L_0x0296
            r2 = 18
            if (r5 < r2) goto L_0x0296
            java.lang.String r2 = "persistence_level"
            defpackage.aaex.a(r0, r7, r2, r4)     // Catch:{ all -> 0x029a }
        L_0x0296:
            r16.close()
            return
        L_0x029a:
            r0 = move-exception
            goto L_0x029f
        L_0x029c:
            r0 = move-exception
            r16 = r9
        L_0x029f:
            r2 = r0
            r16.close()     // Catch:{ all -> 0x02a4 }
            goto L_0x02a9
        L_0x02a4:
            r0 = move-exception
            r3 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r3)
        L_0x02a9:
            goto L_0x02ab
        L_0x02aa:
            throw r2
        L_0x02ab:
            goto L_0x02aa
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaev.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    public aaev(Context context, String str, int i) {
        super(context, str, str, i);
        this.a = i;
    }

    /* access modifiers changed from: package-private */
    public final void a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        String str3 = a() ? "_id INTEGER PRIMARY KEY AUTOINCREMENT, target_package TEXT NOT NULL, target_class TEXT NOT NULL, tag TEXT, runtime INTEGER, flex_time INTEGER, period INTEGER, last_runtime INTEGER, user_id INTEGER, required_network_type INTEGER, requires_charging INTEGER, extras TEXT, retry_strategy TEXT, task_type INTEGER, job_id INTEGER, content_uris TEXT, source INTEGER DEFAULT 0, source_version INTEGER DEFAULT 0, triggered_content_uris TEXT, required_uris TEXT,preferred_network_type INTEGER, preferred_charging_state INTEGER,required_idleness_state INTEGER, preferred_idleness_state INTEGER, service_kind INTEGER" : "_id INTEGER PRIMARY KEY AUTOINCREMENT, target_package TEXT NOT NULL, target_class TEXT NOT NULL, tag TEXT, runtime INTEGER, flex_time INTEGER, period INTEGER, last_runtime INTEGER, user_id INTEGER, required_network_type INTEGER, requires_charging INTEGER, extras TEXT, retry_strategy TEXT, task_type INTEGER, job_id INTEGER, content_uris TEXT, source INTEGER DEFAULT 0, source_version INTEGER DEFAULT 0, triggered_content_uris TEXT, required_uris TEXT,preferred_network_type INTEGER, preferred_charging_state INTEGER,required_idleness_state INTEGER, preferred_idleness_state INTEGER";
        if (b()) {
            str3 = str3.concat(", persistence_level INTEGER");
        }
        sQLiteDatabase.execSQL(String.format("CREATE TABLE %s (%s);", new Object[]{str, str3}));
        b(sQLiteDatabase, str, str2);
    }
}
