package defpackage;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: aavb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aavb {
    private static final String[] a = {"threat_type", "checksum", "state"};
    private final aauv b;
    private SQLiteDatabase c;

    static {
        aavb.class.getSimpleName();
    }

    public aavb(aauv aauv) {
        this.b = aauv;
    }

    private final void a() {
        aauv aauv = this.b;
        if (aauv != null) {
            try {
                this.c = aauv.getWritableDatabase();
                return;
            } catch (SQLException e) {
            }
        }
        this.c = null;
    }

    private final void b() {
        SQLiteDatabase sQLiteDatabase = this.c;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
    }

    static final synchronized void a(SQLiteDatabase sQLiteDatabase, int i, byte[] bArr, byte[] bArr2) {
        synchronized (aavb.class) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("threat_type", Integer.valueOf(i));
            contentValues.put("checksum", bArr);
            contentValues.put("state", bArr2);
            try {
                sQLiteDatabase.replace("metadata", (String) null, contentValues);
            } catch (SQLException e) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006a A[Catch:{ SQLException -> 0x0067, IllegalArgumentException -> 0x0065, all -> 0x005a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.aava a(int r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r10.a()     // Catch:{ all -> 0x0070 }
            android.database.sqlite.SQLiteDatabase r0 = r10.c     // Catch:{ all -> 0x0070 }
            r8 = 0
            if (r0 == 0) goto L_0x0058
            java.lang.String[] r2 = a     // Catch:{ SQLException -> 0x006e }
            r9 = 1
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch:{ SQLException -> 0x006e }
            r1 = 0
            java.lang.String r11 = java.lang.Integer.toString(r11)     // Catch:{ SQLException -> 0x006e }
            r4[r1] = r11     // Catch:{ SQLException -> 0x006e }
            java.lang.String r1 = "metadata"
            java.lang.String r3 = "threat_type=?"
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r11 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLException -> 0x006e }
            int r0 = r11.getCount()     // Catch:{ SQLException -> 0x0067, IllegalArgumentException -> 0x0065, all -> 0x005a }
            if (r0 != r9) goto L_0x0050
            aava r0 = new aava     // Catch:{ SQLException -> 0x0067, IllegalArgumentException -> 0x0065, all -> 0x005a }
            r0.<init>()     // Catch:{ SQLException -> 0x0067, IllegalArgumentException -> 0x0065, all -> 0x005a }
            r11.moveToNext()     // Catch:{ SQLException -> 0x0067, IllegalArgumentException -> 0x0065, all -> 0x005a }
            java.lang.String r1 = "checksum"
            int r1 = r11.getColumnIndexOrThrow(r1)     // Catch:{ SQLException -> 0x0067, IllegalArgumentException -> 0x0065, all -> 0x005a }
            byte[] r1 = r11.getBlob(r1)     // Catch:{ SQLException -> 0x0067, IllegalArgumentException -> 0x0065, all -> 0x005a }
            r0.a = r1     // Catch:{ SQLException -> 0x0067, IllegalArgumentException -> 0x0065, all -> 0x005a }
            java.lang.String r1 = "state"
            int r1 = r11.getColumnIndexOrThrow(r1)     // Catch:{ SQLException -> 0x0067, IllegalArgumentException -> 0x0065, all -> 0x005a }
            byte[] r1 = r11.getBlob(r1)     // Catch:{ SQLException -> 0x0067, IllegalArgumentException -> 0x0065, all -> 0x005a }
            r0.b = r1     // Catch:{ SQLException -> 0x0067, IllegalArgumentException -> 0x0065, all -> 0x005a }
            if (r11 == 0) goto L_0x004b
            r11.close()     // Catch:{ all -> 0x0070 }
        L_0x004b:
            r10.b()     // Catch:{ all -> 0x0070 }
            monitor-exit(r10)
            return r0
        L_0x0050:
            if (r11 == 0) goto L_0x0055
            r11.close()     // Catch:{ all -> 0x0070 }
        L_0x0055:
            r10.b()     // Catch:{ all -> 0x0070 }
        L_0x0058:
            monitor-exit(r10)
            return r8
        L_0x005a:
            r0 = move-exception
            if (r11 != 0) goto L_0x005e
            goto L_0x0061
        L_0x005e:
            r11.close()     // Catch:{ all -> 0x0070 }
        L_0x0061:
            r10.b()     // Catch:{ all -> 0x0070 }
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x0065:
            r0 = move-exception
            goto L_0x0068
        L_0x0067:
            r0 = move-exception
        L_0x0068:
            if (r11 == 0) goto L_0x0055
            r11.close()     // Catch:{ all -> 0x0070 }
            goto L_0x0055
        L_0x006e:
            r11 = move-exception
            goto L_0x0058
        L_0x0070:
            r11 = move-exception
            monitor-exit(r10)
            goto L_0x0074
        L_0x0073:
            throw r11
        L_0x0074:
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aavb.a(int):aava");
    }
}
