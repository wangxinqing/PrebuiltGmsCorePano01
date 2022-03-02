package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* renamed from: spk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class spk {
    static void a(sut sut, SQLiteDatabase sQLiteDatabase) {
        if (sut != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                sut.f.a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                sut.f.a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                sut.f.a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                sut.f.a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r0 != false) goto L_0x004b;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0086 A[Catch:{ all -> 0x00ed, SQLiteException -> 0x00f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1 A[Catch:{ all -> 0x00ed, SQLiteException -> 0x00f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c3 A[Catch:{ all -> 0x00ed, SQLiteException -> 0x00f2 }, LOOP:1: B:35:0x00c3->B:41:0x00d6, LOOP_START, PHI: r14 
      PHI: (r14v1 int) = (r14v0 int), (r14v2 int) binds: [B:33:0x00bf, B:41:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00df A[Catch:{ all -> 0x00ed, SQLiteException -> 0x00f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[Catch:{  }, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(defpackage.sut r15, android.database.sqlite.SQLiteDatabase r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String[] r20) {
        /*
            r1 = r15
            r10 = r16
            r11 = r17
            r12 = r20
            if (r1 == 0) goto L_0x0103
            r13 = 0
            r14 = 0
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0038, all -> 0x0035 }
            java.lang.String r2 = "name"
            r4[r14] = r2     // Catch:{ SQLiteException -> 0x0038, all -> 0x0035 }
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0038, all -> 0x0035 }
            r6[r14] = r11     // Catch:{ SQLiteException -> 0x0038, all -> 0x0035 }
            java.lang.String r3 = "SQLITE_MASTER"
            java.lang.String r5 = "name=?"
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r16
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0038, all -> 0x0035 }
            boolean r0 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0033, all -> 0x002f }
            if (r2 == 0) goto L_0x002c
            r2.close()
        L_0x002c:
            if (r0 == 0) goto L_0x0046
            goto L_0x004b
        L_0x002f:
            r0 = move-exception
            r13 = r2
            goto L_0x00fd
        L_0x0033:
            r0 = move-exception
            goto L_0x003a
        L_0x0035:
            r0 = move-exception
            goto L_0x00fd
        L_0x0038:
            r0 = move-exception
            r2 = r13
        L_0x003a:
            sur r3 = r1.f     // Catch:{ all -> 0x00fb }
            java.lang.String r4 = "Error querying for table"
            r3.a(r4, r11, r0)     // Catch:{ all -> 0x00fb }
            if (r2 == 0) goto L_0x0046
            r2.close()
        L_0x0046:
            r2 = r18
            r10.execSQL(r2)
        L_0x004b:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ SQLiteException -> 0x00f2 }
            r0.<init>()     // Catch:{ SQLiteException -> 0x00f2 }
            int r2 = r17.length()     // Catch:{ SQLiteException -> 0x00f2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00f2 }
            int r2 = r2 + 22
            r3.<init>(r2)     // Catch:{ SQLiteException -> 0x00f2 }
            java.lang.String r2 = "SELECT * FROM "
            r3.append(r2)     // Catch:{ SQLiteException -> 0x00f2 }
            r3.append(r11)     // Catch:{ SQLiteException -> 0x00f2 }
            java.lang.String r2 = " LIMIT 0"
            r3.append(r2)     // Catch:{ SQLiteException -> 0x00f2 }
            java.lang.String r2 = r3.toString()     // Catch:{ SQLiteException -> 0x00f2 }
            android.database.Cursor r2 = r10.rawQuery(r2, r13)     // Catch:{ SQLiteException -> 0x00f2 }
            java.lang.String[] r3 = r2.getColumnNames()     // Catch:{ all -> 0x00ed }
            java.util.Collections.addAll(r0, r3)     // Catch:{ all -> 0x00ed }
            r2.close()     // Catch:{ SQLiteException -> 0x00f2 }
            java.lang.String r2 = ","
            r3 = r19
            java.lang.String[] r2 = r3.split(r2)     // Catch:{ SQLiteException -> 0x00f2 }
            int r3 = r2.length     // Catch:{ SQLiteException -> 0x00f2 }
            r4 = 0
        L_0x0084:
            if (r4 >= r3) goto L_0x00bf
            r5 = r2[r4]     // Catch:{ SQLiteException -> 0x00f2 }
            boolean r6 = r0.remove(r5)     // Catch:{ SQLiteException -> 0x00f2 }
            if (r6 == 0) goto L_0x0091
            int r4 = r4 + 1
            goto L_0x0084
        L_0x0091:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x00f2 }
            int r2 = r17.length()     // Catch:{ SQLiteException -> 0x00f2 }
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x00f2 }
            int r3 = r3.length()     // Catch:{ SQLiteException -> 0x00f2 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00f2 }
            int r2 = r2 + 35
            int r2 = r2 + r3
            r4.<init>(r2)     // Catch:{ SQLiteException -> 0x00f2 }
            java.lang.String r2 = "Table "
            r4.append(r2)     // Catch:{ SQLiteException -> 0x00f2 }
            r4.append(r11)     // Catch:{ SQLiteException -> 0x00f2 }
            java.lang.String r2 = " is missing required column: "
            r4.append(r2)     // Catch:{ SQLiteException -> 0x00f2 }
            r4.append(r5)     // Catch:{ SQLiteException -> 0x00f2 }
            java.lang.String r2 = r4.toString()     // Catch:{ SQLiteException -> 0x00f2 }
            r0.<init>(r2)     // Catch:{ SQLiteException -> 0x00f2 }
            throw r0     // Catch:{ SQLiteException -> 0x00f2 }
        L_0x00bf:
            if (r12 != 0) goto L_0x00c2
            goto L_0x00d9
        L_0x00c2:
        L_0x00c3:
            int r2 = r12.length     // Catch:{ SQLiteException -> 0x00f2 }
            if (r14 >= r2) goto L_0x00d9
            r2 = r12[r14]     // Catch:{ SQLiteException -> 0x00f2 }
            boolean r2 = r0.remove(r2)     // Catch:{ SQLiteException -> 0x00f2 }
            if (r2 == 0) goto L_0x00cf
            goto L_0x00d6
        L_0x00cf:
            int r2 = r14 + 1
            r2 = r12[r2]     // Catch:{ SQLiteException -> 0x00f2 }
            r10.execSQL(r2)     // Catch:{ SQLiteException -> 0x00f2 }
        L_0x00d6:
            int r14 = r14 + 2
            goto L_0x00c3
        L_0x00d9:
            boolean r2 = r0.isEmpty()     // Catch:{ SQLiteException -> 0x00f2 }
            if (r2 != 0) goto L_0x00ec
            sur r2 = r1.f     // Catch:{ SQLiteException -> 0x00f2 }
            java.lang.String r3 = "Table has extra columns. table, columns"
            java.lang.String r4 = ", "
            java.lang.String r0 = android.text.TextUtils.join(r4, r0)     // Catch:{ SQLiteException -> 0x00f2 }
            r2.a(r3, r11, r0)     // Catch:{ SQLiteException -> 0x00f2 }
        L_0x00ec:
            return
        L_0x00ed:
            r0 = move-exception
            r2.close()     // Catch:{ SQLiteException -> 0x00f2 }
            throw r0     // Catch:{ SQLiteException -> 0x00f2 }
        L_0x00f2:
            r0 = move-exception
            sur r1 = r1.c
            java.lang.String r2 = "Failed to verify columns on table that was just created"
            r1.a(r2, r11)
            throw r0
        L_0x00fb:
            r0 = move-exception
            r13 = r2
        L_0x00fd:
            if (r13 == 0) goto L_0x0102
            r13.close()
        L_0x0102:
            throw r0
        L_0x0103:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Monitor must not be null"
            r0.<init>(r1)
            goto L_0x010c
        L_0x010b:
            throw r0
        L_0x010c:
            goto L_0x010b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spk.a(sut, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }
}
