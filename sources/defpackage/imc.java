package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: imc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class imc implements ily {
    static final String a = MessageFormat.format("CREATE TABLE IF NOT EXISTS {0} ({1} TEXT NOT NULL, {2} TEXT NOT NULL, {3} TEXT NOT NULL, {4} INTEGER NOT NULL, {5} INTEGER NOT NULL, {6} BLOB, {7} INTEGER NOT NULL, {8} BOOLEAN NOT NULL, {9} INTEGER NOT NULL, CONSTRAINT {0}_pk PRIMARY KEY ({1}, {3}));", new Object[]{"recent_fixes", "fixer_name", "condition_name", "fix_name", "execution_time_seconds", "valid_till_seconds", "data", "status", "entry_point", "is_log_deferred"});
    public static final /* synthetic */ int b = 0;
    private static final String[] c = {"fixer_name", "condition_name", "fix_name", "execution_time_seconds", "valid_till_seconds", "data", "status", "entry_point", "is_log_deferred"};

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List a(android.database.sqlite.SQLiteDatabase r13, java.lang.String r14, java.lang.String[] r15) {
        /*
            java.lang.String r1 = "recent_fixes"
            java.lang.String[] r2 = c     // Catch:{ all -> 0x00a2 }
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r13
            r3 = r14
            r4 = r15
            android.database.Cursor r13 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00a2 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x00a0 }
            r14.<init>()     // Catch:{ all -> 0x00a0 }
            boolean r15 = r13.moveToFirst()     // Catch:{ all -> 0x00a0 }
            if (r15 == 0) goto L_0x009a
        L_0x0019:
            java.lang.String r15 = "fixer_name"
            int r15 = r13.getColumnIndexOrThrow(r15)     // Catch:{ all -> 0x00a0 }
            java.lang.String r1 = r13.getString(r15)     // Catch:{ all -> 0x00a0 }
            java.lang.String r15 = "condition_name"
            int r15 = r13.getColumnIndexOrThrow(r15)     // Catch:{ all -> 0x00a0 }
            java.lang.String r2 = r13.getString(r15)     // Catch:{ all -> 0x00a0 }
            java.lang.String r15 = "fix_name"
            int r15 = r13.getColumnIndexOrThrow(r15)     // Catch:{ all -> 0x00a0 }
            java.lang.String r3 = r13.getString(r15)     // Catch:{ all -> 0x00a0 }
            java.lang.String r15 = "execution_time_seconds"
            int r15 = r13.getColumnIndexOrThrow(r15)     // Catch:{ all -> 0x00a0 }
            long r4 = r13.getLong(r15)     // Catch:{ all -> 0x00a0 }
            java.lang.String r15 = "valid_till_seconds"
            int r15 = r13.getColumnIndexOrThrow(r15)     // Catch:{ all -> 0x00a0 }
            long r6 = r13.getLong(r15)     // Catch:{ all -> 0x00a0 }
            java.lang.String r15 = "status"
            int r15 = r13.getColumnIndexOrThrow(r15)     // Catch:{ all -> 0x00a0 }
            long r8 = r13.getLong(r15)     // Catch:{ all -> 0x00a0 }
            java.lang.String r15 = "entry_point"
            int r15 = r13.getColumnIndexOrThrow(r15)     // Catch:{ all -> 0x00a0 }
            int r15 = r13.getInt(r15)     // Catch:{ all -> 0x00a0 }
            aogr r15 = defpackage.aogr.a(r15)     // Catch:{ all -> 0x00a0 }
            if (r15 == 0) goto L_0x0067
            r10 = r15
            goto L_0x006a
        L_0x0067:
            aogr r15 = defpackage.aogr.UNKNOWN     // Catch:{ all -> 0x00a0 }
            r10 = r15
        L_0x006a:
            java.lang.String r15 = "is_log_deferred"
            int r15 = r13.getColumnIndexOrThrow(r15)     // Catch:{ all -> 0x00a0 }
            int r15 = r13.getInt(r15)     // Catch:{ all -> 0x00a0 }
            if (r15 == 0) goto L_0x0079
            r15 = 1
            r11 = 1
            goto L_0x007b
        L_0x0079:
            r15 = 0
            r11 = 0
        L_0x007b:
            java.lang.String r15 = "data"
            int r15 = r13.getColumnIndexOrThrow(r15)     // Catch:{ all -> 0x00a0 }
            byte[] r12 = r13.getBlob(r15)     // Catch:{ all -> 0x00a0 }
            imb r15 = new imb     // Catch:{ all -> 0x00a0 }
            r0 = r15
            r0.<init>(r1, r2, r3, r4, r6, r8, r10, r11, r12)     // Catch:{ all -> 0x00a0 }
            r14.add(r15)     // Catch:{ all -> 0x00a0 }
            boolean r15 = r13.moveToNext()     // Catch:{ all -> 0x00a0 }
            if (r15 != 0) goto L_0x0019
            if (r13 == 0) goto L_0x0099
            r13.close()
        L_0x0099:
            return r14
        L_0x009a:
            if (r13 == 0) goto L_0x009f
            r13.close()
        L_0x009f:
            return r14
        L_0x00a0:
            r14 = move-exception
            goto L_0x00a5
        L_0x00a2:
            r13 = move-exception
            r14 = r13
            r13 = 0
        L_0x00a5:
            if (r13 == 0) goto L_0x00aa
            r13.close()
        L_0x00aa:
            goto L_0x00ac
        L_0x00ab:
            throw r14
        L_0x00ac:
            goto L_0x00ab
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.imc.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String[]):java.util.List");
    }

    public static final List e(SQLiteDatabase sQLiteDatabase) {
        return a(sQLiteDatabase, "is_log_deferred = ?", new String[]{"1"});
    }

    public final void b(SQLiteDatabase sQLiteDatabase) {
    }

    public final void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS recent_fixes");
        a(sQLiteDatabase);
    }

    public final void d(SQLiteDatabase sQLiteDatabase) {
        List<imb> arrayList = new ArrayList<>();
        try {
            arrayList = e(sQLiteDatabase);
        } catch (SQLiteException e) {
        }
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS recent_fixes");
        a(sQLiteDatabase);
        for (imb imb : arrayList) {
            a(sQLiteDatabase, imb.a, imb.b, imb.c, imb.d, imb.e, imb.f, aogv.a((int) imb.g), imb.h, imb.i);
        }
    }

    public static final void a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, long j, long j2, byte[] bArr, int i, aogr aogr, boolean z) {
        aogr aogr2;
        int i2 = i - 1;
        if (i != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("fixer_name", str);
            contentValues.put("condition_name", str2);
            contentValues.put("fix_name", str3);
            contentValues.put("execution_time_seconds", Long.valueOf(j));
            contentValues.put("valid_till_seconds", Long.valueOf(j2));
            contentValues.put("data", bArr);
            contentValues.put("status", Long.valueOf((long) i2));
            contentValues.put("entry_point", Integer.valueOf(aogr.j));
            contentValues.put("is_log_deferred", Boolean.valueOf(z));
            if (sQLiteDatabase.insertWithOnConflict("recent_fixes", (String) null, contentValues, 5) == -1) {
                Log.w("RecentFixesTable", "Insert of crash failed due to an unknown error.");
            } else if (!contentValues.containsKey("fixer_name") || !contentValues.containsKey("condition_name") || !contentValues.containsKey("fix_name") || !contentValues.containsKey("execution_time_seconds") || !contentValues.containsKey("valid_till_seconds") || !contentValues.containsKey("data") || !contentValues.containsKey("status") || !contentValues.containsKey("entry_point") || !contentValues.containsKey("is_log_deferred")) {
                Log.i("RecentFixesTable", "Missing an expected column from the database.");
            } else {
                aogr a2 = aogr.a(contentValues.getAsInteger("entry_point").intValue());
                if (a2 != null) {
                    aogr2 = a2;
                } else {
                    aogr2 = aogr.UNKNOWN;
                }
                new imb(contentValues.getAsString("fixer_name"), contentValues.getAsString("condition_name"), contentValues.getAsString("fix_name"), contentValues.getAsLong("execution_time_seconds").longValue(), contentValues.getAsLong("valid_till_seconds").longValue(), contentValues.getAsLong("status").longValue(), aogr2, contentValues.getAsBoolean("is_log_deferred").booleanValue(), contentValues.getAsByteArray("data"));
            }
        } else {
            throw null;
        }
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(a);
    }
}
