package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.security.verifier.ApkUploadEntry;
import java.util.Iterator;

/* renamed from: aazk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aazk implements Iterable {
    private static final String[] a = {"id", "package_name", "version_code", "sha256_digest", "token", "timestamp", "state", "last_update_time", "upload_attempts", "upload_reason"};
    private final aazj b;
    private SQLiteDatabase c;

    public aazk(Context context) {
        this.b = new aazj(context);
    }

    private final void b() {
        aann.a();
        try {
            this.c = this.b.getWritableDatabase();
        } catch (SQLiteException e) {
            this.c = null;
            abaa.a(e.getMessage(), new Object[0]);
        }
    }

    private final void c() {
        aann.a();
        SQLiteDatabase sQLiteDatabase = this.c;
        if (sQLiteDatabase == null || sQLiteDatabase.isOpen()) {
            this.b.close();
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0093 A[SYNTHETIC, Splitter:B:34:0x0093] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.security.verifier.ApkUploadEntry a(long r28) {
        /*
            r27 = this;
            r1 = r27
            monitor-enter(r27)
            r27.b()     // Catch:{ all -> 0x009a }
            android.database.sqlite.SQLiteDatabase r2 = r1.c     // Catch:{ all -> 0x009a }
            r11 = 0
            if (r2 == 0) goto L_0x008b
            java.lang.String[] r4 = a     // Catch:{ all -> 0x0090 }
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x0090 }
            java.lang.String r3 = java.lang.Long.toString(r28)     // Catch:{ all -> 0x0090 }
            r12 = 0
            r6[r12] = r3     // Catch:{ all -> 0x0090 }
            java.lang.String r3 = "upload_queue"
            java.lang.String r5 = "id > ?"
            r7 = 0
            r8 = 0
            java.lang.String r9 = "id"
            java.lang.String r10 = "1"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0090 }
            int r3 = r2.getCount()     // Catch:{ all -> 0x008d }
            if (r3 != r0) goto L_0x0083
            r2.moveToNext()     // Catch:{ all -> 0x008d }
            long r14 = r2.getLong(r12)     // Catch:{ all -> 0x008d }
            java.lang.String r16 = r2.getString(r0)     // Catch:{ all -> 0x008d }
            r3 = 2
            int r17 = r2.getInt(r3)     // Catch:{ all -> 0x008d }
            r3 = 3
            byte[] r18 = r2.getBlob(r3)     // Catch:{ all -> 0x008d }
            r3 = 4
            byte[] r19 = r2.getBlob(r3)     // Catch:{ all -> 0x008d }
            r3 = 5
            long r20 = r2.getLong(r3)     // Catch:{ all -> 0x008d }
            r3 = 6
            int r22 = r2.getInt(r3)     // Catch:{ all -> 0x008d }
            r3 = 7
            long r23 = r2.getLong(r3)     // Catch:{ all -> 0x008d }
            r3 = 8
            int r25 = r2.getInt(r3)     // Catch:{ all -> 0x008d }
            boolean r3 = defpackage.azfv.u()     // Catch:{ all -> 0x008d }
            if (r3 == 0) goto L_0x006b
            r3 = 9
            int r3 = r2.getInt(r3)     // Catch:{ all -> 0x008d }
            int r12 = defpackage.aazs.a(r3)     // Catch:{ all -> 0x008d }
            goto L_0x006c
        L_0x006b:
        L_0x006c:
            if (r12 == 0) goto L_0x0071
            r26 = r12
            goto L_0x0073
        L_0x0071:
            r26 = 1
        L_0x0073:
            com.google.android.gms.security.verifier.ApkUploadEntry r0 = new com.google.android.gms.security.verifier.ApkUploadEntry     // Catch:{ all -> 0x008d }
            r13 = r0
            r13.<init>(r14, r16, r17, r18, r19, r20, r22, r23, r25, r26)     // Catch:{ all -> 0x008d }
            if (r2 == 0) goto L_0x007e
            r2.close()     // Catch:{ all -> 0x009a }
        L_0x007e:
            r27.c()     // Catch:{ all -> 0x009a }
            monitor-exit(r27)
            return r0
        L_0x0083:
            if (r2 == 0) goto L_0x0088
            r2.close()     // Catch:{ all -> 0x009a }
        L_0x0088:
            r27.c()     // Catch:{ all -> 0x009a }
        L_0x008b:
            monitor-exit(r27)
            return r11
        L_0x008d:
            r0 = move-exception
            r11 = r2
            goto L_0x0091
        L_0x0090:
            r0 = move-exception
        L_0x0091:
            if (r11 == 0) goto L_0x0096
            r11.close()     // Catch:{ all -> 0x009a }
        L_0x0096:
            r27.c()     // Catch:{ all -> 0x009a }
            throw r0     // Catch:{ all -> 0x009a }
        L_0x009a:
            r0 = move-exception
            monitor-exit(r27)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aazk.a(long):com.google.android.gms.security.verifier.ApkUploadEntry");
    }

    public final Iterator iterator() {
        return new aazi(this);
    }

    public final synchronized void b(ApkUploadEntry apkUploadEntry) {
        b();
        if (this.c != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("timestamp", Long.valueOf(apkUploadEntry.f));
                contentValues.put("upload_attempts", 0);
                if (this.c.update("upload_queue", contentValues, "package_name = ? AND version_code = ? AND hex(sha256_digest) = ?", new String[]{apkUploadEntry.b, Integer.toString(apkUploadEntry.c), jjp.d(apkUploadEntry.d)}) == 0) {
                    contentValues.put("package_name", apkUploadEntry.b);
                    contentValues.put("version_code", Integer.valueOf(apkUploadEntry.c));
                    contentValues.put("sha256_digest", apkUploadEntry.d);
                    contentValues.put("token", apkUploadEntry.e);
                    contentValues.put("state", Integer.valueOf(apkUploadEntry.g));
                    contentValues.put("last_update_time", Long.valueOf(apkUploadEntry.h));
                    if (azfv.u()) {
                        int i = apkUploadEntry.j;
                        int i2 = i - 1;
                        if (i != 0) {
                            contentValues.put("upload_reason", Integer.valueOf(i2));
                        } else {
                            throw null;
                        }
                    }
                    this.c.insert("upload_queue", (String) null, contentValues);
                }
            } finally {
                c();
            }
        }
    }

    public final synchronized void c(ApkUploadEntry apkUploadEntry) {
        b();
        if (this.c != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("upload_attempts", Integer.valueOf(apkUploadEntry.i + 1));
                this.c.update("upload_queue", contentValues, "id=?", new String[]{Long.toString(apkUploadEntry.a)});
            } finally {
                c();
            }
        }
    }

    public final synchronized void a(ApkUploadEntry apkUploadEntry) {
        b();
        SQLiteDatabase sQLiteDatabase = this.c;
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.delete("upload_queue", "id=?", new String[]{Long.toString(apkUploadEntry.a)});
            } finally {
                c();
            }
        }
    }

    public final synchronized void b(ApkUploadEntry apkUploadEntry, long j) {
        b();
        if (this.c != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("state", 1);
                contentValues.put("last_update_time", Long.valueOf(j));
                this.c.update("upload_queue", contentValues, "id=?", new String[]{Long.toString(apkUploadEntry.a)});
            } finally {
                c();
            }
        }
    }

    public final synchronized void a(ApkUploadEntry apkUploadEntry, long j) {
        b();
        if (this.c != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("last_update_time", Long.valueOf(j));
                this.c.update("upload_queue", contentValues, "id=?", new String[]{Long.toString(apkUploadEntry.a)});
            } finally {
                c();
            }
        }
    }

    public final synchronized boolean a() {
        b();
        SQLiteDatabase sQLiteDatabase = this.c;
        boolean z = true;
        if (sQLiteDatabase == null) {
            return true;
        }
        try {
            Cursor query = sQLiteDatabase.query("upload_queue", new String[]{"count(*)"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            query.moveToFirst();
            int i = query.getInt(0);
            query.close();
            if (i != 0) {
                z = false;
            }
            return z;
        } finally {
            c();
        }
    }
}
