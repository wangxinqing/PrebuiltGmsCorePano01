package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: yfe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yfe {
    public static int a(Cursor cursor) {
        anlj a = anln.b().a();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            boolean z = true;
            a.a(cursor.getString(1), amqn.c);
            if (!cursor.isNull(2)) {
                a.a(cursor.getLong(2));
            } else if (!cursor.isNull(3)) {
                if (cursor.getInt(3) == 0) {
                    z = false;
                }
                a.a(z);
            } else if (!cursor.isNull(4)) {
                a.a(cursor.getDouble(4));
            } else if (!cursor.isNull(5)) {
                a.a(cursor.getString(5), amqn.c);
            } else if (!cursor.isNull(6)) {
                a.a(cursor.getBlob(6));
            }
            cursor.moveToNext();
        }
        return a.a().c();
    }

    public static Cursor a(SQLiteDatabase sQLiteDatabase, String str, long j, String str2, boolean z) {
        String str3;
        String[] strArr = yfq.b;
        String[] strArr2 = new String[4];
        strArr2[0] = str;
        strArr2[1] = Long.toString(j);
        strArr2[2] = str2;
        if (!z) {
            str3 = "0";
        } else {
            str3 = "1";
        }
        strArr2[3] = str3;
        return sQLiteDatabase.query("Flags", strArr, "packageName = ? AND version = ? AND user = ? AND committed = ?", strArr2, (String) null, (String) null, "name");
    }

    public static boolean a(SQLiteDatabase sQLiteDatabase, String str, int i, String str2, boolean z) {
        Cursor a = a(sQLiteDatabase, str, (long) i, str2, z);
        try {
            boolean a2 = a(sQLiteDatabase, str, i, str2, z, a);
            if (a != null) {
                a.close();
            }
            return a2;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (r8 != null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r8 != null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (r8 != null) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.database.sqlite.SQLiteDatabase r8, java.lang.String r9, int r10, java.lang.String r11, boolean r12, android.database.Cursor r13) {
        /*
            int r0 = a(r13)
            r1 = -1
            r13.moveToPosition(r1)
            java.lang.String r7 = "flagsHash"
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            android.database.Cursor r8 = defpackage.yfo.a(r2, r3, r4, r5, r6, r7)
            boolean r9 = r8.moveToFirst()     // Catch:{ all -> 0x0048 }
            r10 = 0
            r11 = 0
            if (r9 == 0) goto L_0x002f
            boolean r9 = r8.isNull(r10)     // Catch:{ all -> 0x0048 }
            if (r9 != 0) goto L_0x002c
            int r9 = r8.getInt(r10)     // Catch:{ all -> 0x0048 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0048 }
            if (r8 == 0) goto L_0x0036
            goto L_0x0031
        L_0x002c:
            if (r8 == 0) goto L_0x0035
            goto L_0x0031
        L_0x002f:
            if (r8 == 0) goto L_0x0035
        L_0x0031:
            r8.close()
            goto L_0x0036
        L_0x0035:
        L_0x0036:
            r8 = 1
            if (r11 == 0) goto L_0x0047
            int r9 = r11.intValue()
            if (r9 == 0) goto L_0x0047
            int r9 = r11.intValue()
            if (r0 != r9) goto L_0x0046
            return r8
        L_0x0046:
            return r10
        L_0x0047:
            return r8
        L_0x0048:
            r9 = move-exception
            if (r8 == 0) goto L_0x0053
            r8.close()     // Catch:{ all -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r8 = move-exception
            defpackage.apev.a((java.lang.Throwable) r9, (java.lang.Throwable) r8)
        L_0x0053:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yfe.a(android.database.sqlite.SQLiteDatabase, java.lang.String, int, java.lang.String, boolean, android.database.Cursor):boolean");
    }
}
