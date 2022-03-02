package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: acsq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acsq extends acsr {
    public static acsq a = null;
    private static final amzy f = amzy.a("data_app_crash", "data_app_native_crash", "data_app_anr", "system_app_crash", "system_app_native_crash", "system_app_anr", "system_server_anr", "system_server_crash", "system_server_native_crash");
    private static final anax g = anax.a((Object) 1);

    public static void a(avwc avwc) {
        SQLiteDatabase writableDatabase;
        if (aznu.b()) {
            ArrayList<avwa> arrayList = new ArrayList<>();
            aucx aucx = avwc.i;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                avwa avwa = (avwa) aucx.get(i);
                if (f.contains(avwa.b)) {
                    arrayList.add(avwa);
                }
            }
            if (!arrayList.isEmpty()) {
                acsm a2 = acsm.a((Context) ihs.b());
                if (!jir.a((Collection) arrayList)) {
                    try {
                        writableDatabase = a2.getWritableDatabase();
                        writableDatabase.beginTransaction();
                        for (avwa avwa2 : arrayList) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("wallclock_time", Long.valueOf(avwa2.d));
                            contentValues.put("package_name", avwa2.f);
                            contentValues.put("package_version", Integer.valueOf(avwa2.g));
                            contentValues.put("dropbox_tag", avwa2.b);
                            writableDatabase.insert("error_data", (String) null, contentValues);
                        }
                        long queryNumEntries = DatabaseUtils.queryNumEntries(writableDatabase, "error_data");
                        if (queryNumEntries > 1000) {
                            writableDatabase.delete("error_data", "rowid IN (SELECT rowid FROM error_data ORDER BY wallclock_time LIMIT ?)", new String[]{Long.toString(queryNumEntries - 1000)});
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (SQLiteException e) {
                        Log.e("EastworldSqliteHelper", "Failed to insert error status.", e);
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014b A[SYNTHETIC, Splitter:B:48:0x014b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r21, boolean r22, boolean r23, defpackage.aucd r24) {
        /*
            r20 = this;
            java.lang.String r1 = "error_status"
            boolean r0 = defpackage.aznu.b()
            if (r0 != 0) goto L_0x0019
            hph r0 = c
            java.lang.String r1 = "DisabledEastworldProcessorEastworldError"
            hox r0 = r0.c(r1)
            r0.a()
            hph r0 = c
            r0.d()
            return
        L_0x0019:
            anax r0 = g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0193
            ihs r0 = defpackage.ihs.b()
            long r2 = java.lang.System.currentTimeMillis()
            acsm r4 = defpackage.acsm.a((android.content.Context) r0)
            long r5 = r4.c()
            r7 = 1
            r0 = r21
            if (r0 == r7) goto L_0x003c
            goto L_0x018d
        L_0x003c:
            r8 = 0
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0043
            goto L_0x0055
        L_0x0043:
            long r5 = r2 - r5
            aznu r0 = defpackage.aznu.a
            aznv r0 = r0.a()
            long r10 = r0.a()
            int r0 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0055
            goto L_0x018d
        L_0x0055:
            avva r0 = defpackage.avva.g
            aucd r5 = r0.o()
            long r18 = r4.a()
            long r10 = r2 - r18
            boolean r0 = r5.c
            r6 = 0
            if (r0 == 0) goto L_0x006b
            r5.c()
            r5.c = r6
        L_0x006b:
            aucj r0 = r5.b
            avva r0 = (defpackage.avva) r0
            int r12 = r0.a
            r12 = r12 | 2
            r0.a = r12
            r0.e = r10
            r14 = 4
            android.database.sqlite.SQLiteDatabase r0 = r4.getWritableDatabase()     // Catch:{ SQLiteException -> 0x00e7 }
            long r12 = r4.c()     // Catch:{ SQLiteException -> 0x00e7 }
            r10 = 1
            int r15 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r15 <= 0) goto L_0x00a5
            boolean r15 = defpackage.aznu.d()     // Catch:{ SQLiteException -> 0x00e7 }
            if (r15 == 0) goto L_0x00a5
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ SQLiteException -> 0x00e7 }
            long r15 = r15.toMillis(r10)     // Catch:{ SQLiteException -> 0x00e7 }
            long r10 = r18 - r15
            long r15 = java.lang.Math.max(r8, r10)     // Catch:{ SQLiteException -> 0x00e7 }
            r6 = 1
            r10 = r0
            r11 = r5
            r14 = r15
            r16 = r18
            defpackage.acsm.a(r10, r11, r12, r14, r16)     // Catch:{ SQLiteException -> 0x00e7 }
            r12 = r18
            goto L_0x00a6
        L_0x00a5:
            r6 = r10
        L_0x00a6:
            boolean r10 = defpackage.aznu.d()     // Catch:{ SQLiteException -> 0x00e7 }
            if (r10 == 0) goto L_0x00b7
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ SQLiteException -> 0x00e7 }
            long r6 = r10.toMillis(r6)     // Catch:{ SQLiteException -> 0x00e7 }
            long r6 = r18 + r6
            r16 = r6
            goto L_0x00be
        L_0x00b7:
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r16 = r6
        L_0x00be:
            long r6 = java.lang.Math.max(r12, r8)     // Catch:{ SQLiteException -> 0x00e7 }
            long r6 = r2 - r6
            boolean r8 = r5.c     // Catch:{ SQLiteException -> 0x00e7 }
            if (r8 != 0) goto L_0x00ca
            goto L_0x00d0
        L_0x00ca:
            r5.c()     // Catch:{ SQLiteException -> 0x00e7 }
            r8 = 0
            r5.c = r8     // Catch:{ SQLiteException -> 0x00e7 }
        L_0x00d0:
            aucj r8 = r5.b     // Catch:{ SQLiteException -> 0x00e7 }
            avva r8 = (defpackage.avva) r8     // Catch:{ SQLiteException -> 0x00e7 }
            int r9 = r8.a     // Catch:{ SQLiteException -> 0x00e7 }
            r14 = 4
            r9 = r9 | r14
            r8.a = r9     // Catch:{ SQLiteException -> 0x00e7 }
            r8.f = r6     // Catch:{ SQLiteException -> 0x00e7 }
            r10 = r0
            r11 = r5
            r6 = 4
            r14 = r18
            defpackage.acsm.a(r10, r11, r12, r14, r16)     // Catch:{ SQLiteException -> 0x00e5 }
            goto L_0x00f0
        L_0x00e5:
            r0 = move-exception
            goto L_0x00e9
        L_0x00e7:
            r0 = move-exception
            r6 = 4
        L_0x00e9:
            java.lang.String r7 = "EastworldSqliteHelper"
            java.lang.String r8 = "Error fetching errors from database."
            android.util.Log.e(r7, r8, r0)
        L_0x00f0:
            aucj r0 = r5.i()
            avva r0 = (defpackage.avva) r0
            aznu r5 = defpackage.aznu.a
            aznv r5 = r5.a()
            boolean r5 = r5.f()
            if (r5 == 0) goto L_0x010a
            aucx r5 = r0.d
            int r5 = r5.size()
            if (r5 == 0) goto L_0x018d
        L_0x010a:
            avvl r5 = defpackage.avvl.j
            aucd r5 = r5.o()
            boolean r7 = r5.c
            if (r7 != 0) goto L_0x0115
            goto L_0x011b
        L_0x0115:
            r5.c()
            r7 = 0
            r5.c = r7
        L_0x011b:
            aucj r7 = r5.b
            avvl r7 = (defpackage.avvl) r7
            r7.b = r6
            int r6 = r7.a
            r8 = 1
            r6 = r6 | r8
            r7.a = r6
            r0.getClass()
            r7.d = r0
            r0 = r6 | 8
            r7.a = r0
            aznu r0 = defpackage.aznu.a
            aznv r0 = r0.a()
            long r6 = r0.d()
            int r0 = (int) r6
            avvf r6 = defpackage.avvf.h
            aucd r6 = r6.o()
            java.lang.String r7 = "EastworldError"
            java.lang.String r8 = "DROP_BOX_EASTWORLD"
            boolean r0 = defpackage.acsr.a(r5, r7, r8, r0, r6)
            if (r0 == 0) goto L_0x018d
            long r5 = r4.a()     // Catch:{ SQLiteException -> 0x018c }
            long r5 = java.lang.Math.min(r2, r5)     // Catch:{ SQLiteException -> 0x018c }
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x018c }
            r0.<init>()     // Catch:{ SQLiteException -> 0x018c }
            java.lang.String r7 = "last_upload_wallclock_time"
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ SQLiteException -> 0x018c }
            r0.put(r7, r2)     // Catch:{ SQLiteException -> 0x018c }
            android.database.sqlite.SQLiteDatabase r2 = r4.getWritableDatabase()     // Catch:{ SQLiteException -> 0x018c }
            r2.beginTransaction()     // Catch:{ SQLiteException -> 0x018c }
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x0187 }
            java.lang.String r4 = java.lang.Long.toString(r5)     // Catch:{ all -> 0x0187 }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x0187 }
            java.lang.String r4 = "error_data"
            java.lang.String r5 = "wallclock_time < ?"
            r2.delete(r4, r5, r3)     // Catch:{ all -> 0x0187 }
            r3 = 0
            r2.delete(r1, r3, r3)     // Catch:{ all -> 0x0187 }
            r2.insert(r1, r3, r0)     // Catch:{ all -> 0x0187 }
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x0187 }
            r2.endTransaction()     // Catch:{ SQLiteException -> 0x018c }
            goto L_0x018d
        L_0x0187:
            r0 = move-exception
            r2.endTransaction()     // Catch:{ SQLiteException -> 0x018c }
            throw r0     // Catch:{ SQLiteException -> 0x018c }
        L_0x018c:
            r0 = move-exception
        L_0x018d:
            hph r0 = c
            r0.d()
            return
        L_0x0193:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acsq.a(int, boolean, boolean, aucd):void");
    }
}
