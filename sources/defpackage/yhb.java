package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.phenotype.Flag;

/* renamed from: yhb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yhb {
    public String a;
    public final String b;

    static {
        iyc iyc = iyc.UNKNOWN;
    }

    public yhb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static boolean a(SQLiteDatabase sQLiteDatabase, String str) {
        boolean z = true;
        Cursor query = sQLiteDatabase.query("Packages", new String[]{"packageName"}, "packageName = ?", new String[]{str}, (String) null, (String) null, (String) null);
        try {
            if (query.getCount() == 0) {
                z = false;
            }
            if (query != null) {
                query.close();
            }
            return z;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        if (r2 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b8, code lost:
        if (r2 != null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c1, code lost:
        if (r2 != null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0043, code lost:
        if (r2 != null) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.phenotype.Configurations b(android.database.sqlite.SQLiteDatabase r19, java.lang.String r20) {
        /*
            r0 = r20
            com.google.android.gms.phenotype.Flag[] r1 = c(r19, r20)
            java.lang.String r2 = "serverToken"
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x0061
            r5 = 3
            java.lang.String[] r8 = new java.lang.String[r5]
            java.lang.String r5 = "experimentToken"
            r8[r4] = r5
            r8[r3] = r2
            java.lang.String r2 = "servingVersion"
            r5 = 2
            r8[r5] = r2
            java.lang.String[] r10 = new java.lang.String[r3]
            r10[r4] = r0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.String r7 = "ExperimentTokens"
            java.lang.String r9 = "packageName = ? AND isCommitted = 1"
            r6 = r19
            android.database.Cursor r2 = r6.query(r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r6 = r2.moveToFirst()     // Catch:{ all -> 0x0053 }
            if (r6 == 0) goto L_0x004c
            yhd r6 = new yhd     // Catch:{ all -> 0x0053 }
            byte[] r7 = r2.getBlob(r4)     // Catch:{ all -> 0x0053 }
            java.lang.String r8 = r2.getString(r3)     // Catch:{ all -> 0x0053 }
            long r9 = r2.getLong(r5)     // Catch:{ all -> 0x0053 }
            r6.<init>(r7, r8, r9)     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x004a
        L_0x0045:
            r2.close()
            goto L_0x00c4
        L_0x004a:
            goto L_0x00c4
        L_0x004c:
            yhd r6 = defpackage.yhd.a     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x0051
            goto L_0x0045
        L_0x0051:
            goto L_0x00c4
        L_0x0053:
            r0 = move-exception
            r1 = r0
            if (r2 == 0) goto L_0x0060
            r2.close()     // Catch:{ all -> 0x005b }
            goto L_0x0060
        L_0x005b:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)
        L_0x0060:
            throw r1
        L_0x0061:
            int r5 = r1.length
            r6 = 0
        L_0x0063:
            r7 = 0
            r9 = 0
            if (r6 >= r5) goto L_0x0087
            r10 = r1[r6]
            java.lang.String r11 = r10.a
            java.lang.String r12 = "__phenotype_server_token"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0075
        L_0x0074:
            goto L_0x0084
        L_0x0075:
            int r11 = r10.g
            r12 = 4
            if (r11 != r12) goto L_0x0074
            yhd r6 = new yhd
            java.lang.String r2 = r10.d()
            r6.<init>(r9, r2, r7)
            goto L_0x00c4
        L_0x0084:
            int r6 = r6 + 1
            goto L_0x0063
        L_0x0087:
            boolean r5 = defpackage.ayzv.i()
            if (r5 != 0) goto L_0x0090
            yhd r6 = defpackage.yhd.a
            goto L_0x00c4
        L_0x0090:
            java.lang.String[] r12 = new java.lang.String[r3]
            r12[r4] = r2
            java.lang.String[] r14 = new java.lang.String[r3]
            r14[r4] = r0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            java.lang.String r11 = "ExperimentTokens"
            java.lang.String r13 = "packageName = ? AND isCommitted = 1"
            r10 = r19
            android.database.Cursor r2 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r5 = r2.moveToFirst()     // Catch:{ all -> 0x0162 }
            if (r5 == 0) goto L_0x00bf
            yhd r6 = new yhd     // Catch:{ all -> 0x0162 }
            java.lang.String r5 = r2.getString(r4)     // Catch:{ all -> 0x0162 }
            r6.<init>(r9, r5, r7)     // Catch:{ all -> 0x0162 }
            if (r2 == 0) goto L_0x00be
        L_0x00ba:
            r2.close()
            goto L_0x00c4
        L_0x00be:
            goto L_0x00c4
        L_0x00bf:
            yhd r6 = defpackage.yhd.a     // Catch:{ all -> 0x0162 }
            if (r2 == 0) goto L_0x00be
            goto L_0x00ba
        L_0x00c4:
            java.util.TreeSet r2 = new java.util.TreeSet
            java.util.Comparator r5 = com.google.android.gms.phenotype.Flag.j
            r2.<init>(r5)
            java.lang.String[] r9 = defpackage.yfq.b
            java.lang.String[] r11 = new java.lang.String[r3]
            r11[r4] = r0
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.String r8 = "Flags"
            java.lang.String r10 = "packageName = ? AND committed = 1"
            r7 = r19
            android.database.Cursor r5 = r7.query(r8, r9, r10, r11, r12, r13, r14)
        L_0x00de:
            boolean r7 = r5.moveToNext()     // Catch:{ all -> 0x0154 }
            if (r7 == 0) goto L_0x00ec
            com.google.android.gms.phenotype.Flag r7 = defpackage.yhe.a((android.database.Cursor) r5)     // Catch:{ all -> 0x0154 }
            r2.add(r7)     // Catch:{ all -> 0x0154 }
            goto L_0x00de
        L_0x00ec:
            boolean r7 = defpackage.azaf.c()     // Catch:{ all -> 0x0154 }
            if (r7 == 0) goto L_0x0133
            android.util.Pair r7 = defpackage.yfl.a(r19, r20)     // Catch:{ all -> 0x0154 }
            if (r7 == 0) goto L_0x0133
            java.lang.Object r8 = r7.second     // Catch:{ all -> 0x0154 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x0154 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x0154 }
            java.lang.Object r7 = r7.first     // Catch:{ all -> 0x0154 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0154 }
            r9 = r19
            boolean r3 = defpackage.yfe.a((android.database.sqlite.SQLiteDatabase) r9, (java.lang.String) r0, (int) r8, (java.lang.String) r7, (boolean) r3)     // Catch:{ all -> 0x0154 }
            if (r3 == 0) goto L_0x010d
            goto L_0x0133
        L_0x010d:
            yfx r1 = new yfx     // Catch:{ all -> 0x0154 }
            java.lang.String r2 = java.lang.String.valueOf(r20)     // Catch:{ all -> 0x0154 }
            int r2 = r2.length()     // Catch:{ all -> 0x0154 }
            int r2 = r2 + 71
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0154 }
            r3.<init>(r2)     // Catch:{ all -> 0x0154 }
            java.lang.String r2 = "Can't return configuration for package "
            r3.append(r2)     // Catch:{ all -> 0x0154 }
            r3.append(r0)     // Catch:{ all -> 0x0154 }
            java.lang.String r0 = " due to detected flag corruption"
            r3.append(r0)     // Catch:{ all -> 0x0154 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0154 }
            r1.<init>(r0)     // Catch:{ all -> 0x0154 }
            throw r1     // Catch:{ all -> 0x0154 }
        L_0x0133:
            if (r5 == 0) goto L_0x0138
            r5.close()
        L_0x0138:
            if (r1 == 0) goto L_0x0149
            int r0 = r1.length
            r3 = 0
        L_0x013c:
            if (r3 >= r0) goto L_0x0149
            r5 = r1[r3]
            r2.remove(r5)
            r2.add(r5)
            int r3 = r3 + 1
            goto L_0x013c
        L_0x0149:
            java.util.Set r0 = java.util.Collections.emptySet()
            java.lang.String r1 = ""
            com.google.android.gms.phenotype.Configurations r0 = defpackage.yhe.a((java.util.Set) r2, (java.util.Set) r0, (java.lang.String) r1, (defpackage.yhd) r6, (boolean) r4)
            return r0
        L_0x0154:
            r0 = move-exception
            r1 = r0
            if (r5 == 0) goto L_0x0161
            r5.close()     // Catch:{ all -> 0x015c }
            goto L_0x0161
        L_0x015c:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)
        L_0x0161:
            throw r1
        L_0x0162:
            r0 = move-exception
            r1 = r0
            if (r2 == 0) goto L_0x016f
            r2.close()     // Catch:{ all -> 0x016a }
            goto L_0x016f
        L_0x016a:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)
        L_0x016f:
            goto L_0x0171
        L_0x0170:
            throw r1
        L_0x0171:
            goto L_0x0170
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yhb.b(android.database.sqlite.SQLiteDatabase, java.lang.String):com.google.android.gms.phenotype.Configurations");
    }

    static Flag[] c(SQLiteDatabase sQLiteDatabase, String str) {
        int i = 0;
        Cursor query = sQLiteDatabase.query("FlagOverrides", yfq.b, "packageName = ? AND committed = 1", new String[]{str}, (String) null, (String) null, (String) null);
        try {
            if (query.getCount() != 0) {
                Flag[] flagArr = new Flag[query.getCount()];
                while (query.moveToNext()) {
                    int i2 = i + 1;
                    flagArr[i] = yhe.a(query);
                    i = i2;
                }
                if (query != null) {
                    query.close();
                }
                return flagArr;
            } else if (query == null) {
                return null;
            } else {
                query.close();
                return null;
            }
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
