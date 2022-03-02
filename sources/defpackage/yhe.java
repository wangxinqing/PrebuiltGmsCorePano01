package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: yhe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yhe {
    private static final Flag[] e = new Flag[0];
    private static final String[] f = new String[0];
    private static final Configurations g = new Configurations("", "", new Configuration[0], false, (byte[]) null, 0);
    public String a;
    public final String b;
    public final String c;
    String d;
    private final String h;
    private final boolean i = azaf.c();

    static {
        iyc iyc = iyc.UNKNOWN;
    }

    public yhe(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.h = str5;
    }

    /* JADX INFO: finally extract failed */
    private final Configurations a(SQLiteDatabase sQLiteDatabase, int i2, String str, yhd yhd, Flag[] flagArr) {
        Throwable th;
        Throwable th2;
        Flag[] flagArr2 = flagArr;
        TreeSet treeSet = new TreeSet(Flag.j);
        Cursor query = sQLiteDatabase.query("Flags", yfq.b, "packageName = ?", new String[]{this.a}, (String) null, (String) null, (String) null);
        while (query.moveToNext()) {
            try {
                treeSet.add(a(query));
            } catch (Throwable th3) {
                apev.a(th, th3);
            }
        }
        if (query != null) {
            query.close();
        }
        TreeSet treeSet2 = new TreeSet(Flag.j);
        Cursor query2 = sQLiteDatabase.query("Flags", yfq.b, "packageName = ? AND version = ? AND user = ? AND committed = 0", new String[]{this.a, Integer.toString(i2), this.b}, (String) null, (String) null, "name");
        try {
            if (this.i) {
                if (!yfe.a(sQLiteDatabase, this.a, i2, this.b, false, query2)) {
                    String str2 = this.a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 71);
                    sb.append("Can't return configuration for package ");
                    sb.append(str2);
                    sb.append(" due to detected flag corruption");
                    throw new yfx(sb.toString());
                }
            }
            while (query2.moveToNext()) {
                Flag a2 = a(query2);
                treeSet2.add(a2);
                treeSet.remove(a2);
            }
            if (query2 != null) {
                query2.close();
            }
            if (flagArr2 != null) {
                for (Flag flag : flagArr2) {
                    treeSet2.remove(flag);
                    treeSet2.add(flag);
                    treeSet.remove(flag);
                }
            }
            return a((Set) treeSet2, (Set) treeSet, str, yhd, false);
        } catch (Throwable th4) {
            apev.a(th2, th4);
        }
        throw th;
        throw th2;
    }

    /* JADX INFO: finally extract failed */
    static int b(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        Throwable th;
        Throwable th2;
        String str3 = str;
        if (str3.equals("com.google.EMPTY")) {
            return 0;
        }
        Cursor query = sQLiteDatabase.query("Packages", new String[]{"version"}, "packageName = ?", new String[]{str3}, (String) null, (String) null, (String) null);
        try {
            if (query.moveToFirst()) {
                int i2 = query.getInt(0);
                if (query != null) {
                    query.close();
                }
                Cursor query2 = sQLiteDatabase.query("ExperimentTokens", new String[]{"version"}, "packageName = ? AND version <= ? AND user = ? AND isCommitted = 0", new String[]{str3, Integer.toString(i2), str2}, (String) null, (String) null, "version DESC", "1");
                try {
                    if (query2.moveToFirst()) {
                        int i3 = query2.getInt(0);
                        if (query2 != null) {
                            query2.close();
                        }
                        return i3;
                    }
                    if (query2 != null) {
                        query2.close();
                    }
                    return i2;
                } catch (Throwable th3) {
                    apev.a(th2, th3);
                }
            } else {
                throw new yfy(29503);
            }
        } catch (Throwable th4) {
            apev.a(th, th4);
        }
        throw th;
        throw th2;
    }

    public static boolean b(String str) {
        if (a()) {
            return ayyk.b().a.contains(str);
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r3v8, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.phenotype.Configurations a(java.util.Set r9, java.util.Set r10, java.lang.String r11, defpackage.yhd r12, boolean r13) {
        /*
            java.lang.String r0 = ", "
            android.text.TextUtils.join(r0, r9)
            android.text.TextUtils.join(r0, r10)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0011:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0027
            java.lang.Object r1 = r9.next()
            com.google.android.gms.phenotype.Flag r1 = (com.google.android.gms.phenotype.Flag) r1
            int r2 = r1.h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            defpackage.ygv.a(r0, r2, r1)
            goto L_0x0011
        L_0x0027:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x0030:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0046
            java.lang.Object r1 = r10.next()
            com.google.android.gms.phenotype.Flag r1 = (com.google.android.gms.phenotype.Flag) r1
            int r2 = r1.h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            defpackage.ygv.a(r9, r2, r1)
            goto L_0x0030
        L_0x0046:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Set r2 = r0.keySet()
            r1.addAll(r2)
            java.util.Set r2 = r9.keySet()
            r1.addAll(r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0062:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00bf
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r3 = r0.get(r2)
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r4 = r9.get(r2)
            java.util.Collection r4 = (java.util.Collection) r4
            com.google.android.gms.phenotype.Flag[] r5 = e
            if (r3 == 0) goto L_0x008c
            int r5 = r3.size()
            com.google.android.gms.phenotype.Flag[] r5 = new com.google.android.gms.phenotype.Flag[r5]
            java.lang.Object[] r3 = r3.toArray(r5)
            r5 = r3
            com.google.android.gms.phenotype.Flag[] r5 = (com.google.android.gms.phenotype.Flag[]) r5
            goto L_0x008d
        L_0x008c:
        L_0x008d:
            java.lang.String[] r3 = f
            if (r4 == 0) goto L_0x00b1
            int r3 = r4.size()
            java.lang.String[] r3 = new java.lang.String[r3]
            java.util.Iterator r4 = r4.iterator()
            r6 = 0
        L_0x009c:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x00b0
            int r7 = r6 + 1
            java.lang.Object r8 = r4.next()
            com.google.android.gms.phenotype.Flag r8 = (com.google.android.gms.phenotype.Flag) r8
            java.lang.String r8 = r8.a
            r3[r6] = r8
            r6 = r7
            goto L_0x009c
        L_0x00b0:
            goto L_0x00b2
        L_0x00b1:
        L_0x00b2:
            com.google.android.gms.phenotype.Configuration r4 = new com.google.android.gms.phenotype.Configuration
            int r2 = r2.intValue()
            r4.<init>(r2, r5, r3)
            r10.add(r4)
            goto L_0x0062
        L_0x00bf:
            int r9 = r10.size()
            com.google.android.gms.phenotype.Configuration[] r9 = new com.google.android.gms.phenotype.Configuration[r9]
            java.lang.Object[] r9 = r10.toArray(r9)
            r3 = r9
            com.google.android.gms.phenotype.Configuration[] r3 = (com.google.android.gms.phenotype.Configuration[]) r3
            com.google.android.gms.phenotype.Configurations r9 = new com.google.android.gms.phenotype.Configurations
            java.lang.String r2 = r12.c
            byte[] r5 = r12.b
            long r6 = r12.d
            r0 = r9
            r1 = r11
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yhe.a(java.util.Set, java.util.Set, java.lang.String, yhd, boolean):com.google.android.gms.phenotype.Configurations");
    }

    static Flag a(Cursor cursor) {
        boolean z;
        int i2 = cursor.getInt(0);
        String string = cursor.getString(1);
        if (!cursor.isNull(2)) {
            return new Flag(new HashSet(), string, cursor.getLong(2), false, 0.0d, "", new byte[0], 1, i2);
        } else if (!cursor.isNull(3)) {
            if (cursor.getInt(3) != 0) {
                z = true;
            } else {
                z = false;
            }
            return new Flag(new HashSet(), string, 0, z, 0.0d, "", new byte[0], 2, i2);
        } else if (!cursor.isNull(4)) {
            return new Flag(new HashSet(), string, 0, false, cursor.getDouble(4), "", new byte[0], 3, i2);
        } else if (!cursor.isNull(5)) {
            return new Flag(new HashSet(), string, 0, false, 0.0d, cursor.getString(5), new byte[0], 4, i2);
        } else if (!cursor.isNull(6)) {
            return new Flag(string, cursor.getBlob(6), i2);
        } else {
            String valueOf = String.valueOf(string);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Flag without value: ") : "Flag without value: ".concat(valueOf));
        }
    }

    public static boolean a() {
        return aekv.a() && ayyk.c();
    }

    static Flag[] a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        Cursor query;
        Cursor query2 = sQLiteDatabase.query("FlagOverrides", yfq.b, (String) null, (String[]) null, (String) null, (String) null, "1");
        try {
            if (query2.getCount() != 0) {
                if (query2 != null) {
                    query2.close();
                }
                int i2 = 0;
                Cursor query3 = sQLiteDatabase.query("FlagOverrides", yfq.b, "packageName = ? AND user = '*' AND committed = 0", new String[]{str}, (String) null, (String) null, (String) null);
                try {
                    Cursor query4 = sQLiteDatabase.query("FlagOverrides", yfq.b, "packageName = ? AND user = ? AND committed = 0", new String[]{str, str2}, (String) null, (String) null, (String) null);
                    try {
                        if (query3.getCount() + query4.getCount() == 0) {
                            query = sQLiteDatabase.query("FlagOverrides", yfq.b, "packageName != ? AND committed = 1", (String[]) null, (String) null, (String) null, (String) null, "1");
                            if (query.getCount() != 0) {
                                Flag[] flagArr = e;
                                query.close();
                                if (query4 != null) {
                                    query4.close();
                                }
                                if (query3 != null) {
                                    query3.close();
                                }
                                return flagArr;
                            }
                            query.close();
                            if (query4 != null) {
                                query4.close();
                            }
                            if (query3 != null) {
                                query3.close();
                            }
                            return null;
                        }
                        Flag[] flagArr2 = new Flag[(query3.getCount() + query4.getCount())];
                        while (query3.moveToNext()) {
                            int i3 = i2 + 1;
                            flagArr2[i2] = a(query3);
                            i2 = i3;
                        }
                        while (query4.moveToNext()) {
                            int i4 = i2 + 1;
                            flagArr2[i2] = a(query4);
                            i2 = i4;
                        }
                        if (query4 != null) {
                            query4.close();
                        }
                        if (query3 != null) {
                            query3.close();
                        }
                        return flagArr2;
                    } catch (Throwable th) {
                        if (query4 != null) {
                            query4.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (query3 != null) {
                        try {
                            query3.close();
                        } catch (Throwable th3) {
                            apev.a(th2, th3);
                        }
                    }
                    throw th2;
                }
            } else {
                if (query2 != null) {
                    query2.close();
                }
                return null;
            }
        } catch (Throwable th4) {
            apev.a(th, th4);
        }
        throw th;
    }

    public static String[] a(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(" ", 9);
        int length = split.length;
        if (length == 8 || length == 7) {
            return split;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01d9, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r8.close();
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01dc, code lost:
        r5 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01df, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r5 = defpackage.yhd.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e2, code lost:
        if (r8 == null) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01e4, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        r8.close();
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01f6, code lost:
        r22 = r6;
        r10 = null;
        r3 = r14;
        r17 = 4;
        r18 = 2;
        r5 = defpackage.yhd.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0217, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0218, code lost:
        r1 = r0;
        r22 = r15;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0498, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0499, code lost:
        r1 = r0;
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x04a2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x04a3, code lost:
        r1 = r0;
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x050a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x050b, code lost:
        r1 = r0;
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x050e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x050f, code lost:
        r1 = r0;
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x051c, code lost:
        r22.endTransaction();
        defpackage.yfw.a(r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0526, code lost:
        r4 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0528, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:?, code lost:
        defpackage.yfw.a(r4, r7.a, r7.b, b(r4, r7.a, r7.b));
        r4.setTransactionSuccessful();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0537, code lost:
        r4 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0551, code lost:
        r1 = g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0553, code lost:
        r4.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0557, code lost:
        r4 = r4;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0131, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0132, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0133, code lost:
        if (r8 != null) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0139, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        defpackage.apev.a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x013f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0140, code lost:
        r1 = r0;
        r22 = r6;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0185, code lost:
        if (defpackage.ayzv.i() == false) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01a3, code lost:
        r22 = r6;
        r3 = r14;
        r17 = 4;
        r18 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01c2, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r8 = r6.query("ExperimentTokens", new java.lang.String[]{"serverToken"}, "packageName = ? AND version = ? AND user = ? AND isCommitted = 0", new java.lang.String[]{r7.a, java.lang.Integer.toString(r2), r7.b}, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01ca, code lost:
        if (r8.moveToFirst() == false) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01cc, code lost:
        r10 = null;
        r9 = new defpackage.yhd((byte[]) null, r8.getString(0), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01d7, code lost:
        if (r8 == null) goto L_0x01dc;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0221 A[SYNTHETIC, Splitter:B:133:0x0221] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0241 A[SYNTHETIC, Splitter:B:139:0x0241] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02f2 A[Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0465 A[SYNTHETIC, Splitter:B:243:0x0465] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0480 A[Catch:{ all -> 0x04fa, all -> 0x0504, all -> 0x044d, all -> 0x0455, all -> 0x01e8, all -> 0x01f0, yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0498 A[ExcHandler: all (r0v14 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r15 
      PHI: (r15v5 android.database.sqlite.SQLiteDatabase) = (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v7 android.database.sqlite.SQLiteDatabase), (r15v11 android.database.sqlite.SQLiteDatabase), (r15v11 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase) binds: [B:122:0x0206, B:123:?, B:136:0x0236, B:144:0x0248, B:154:0x0261, B:155:?, B:162:0x027c, B:172:0x0321, B:173:?, B:205:0x03b6, B:189:0x0386, B:190:?, B:167:0x0312, B:149:0x0252, B:139:0x0241, B:140:?, B:133:0x0221, B:125:0x020e] A[DONT_GENERATE, DONT_INLINE], Splitter:B:136:0x0236] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x04a2 A[ExcHandler: yfy (r0v12 'e' yfy A[CUSTOM_DECLARE]), PHI: r15 
      PHI: (r15v3 android.database.sqlite.SQLiteDatabase) = (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v7 android.database.sqlite.SQLiteDatabase), (r15v11 android.database.sqlite.SQLiteDatabase), (r15v11 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase) binds: [B:122:0x0206, B:123:?, B:136:0x0236, B:144:0x0248, B:154:0x0261, B:155:?, B:162:0x027c, B:172:0x0321, B:173:?, B:205:0x03b6, B:189:0x0386, B:190:?, B:167:0x0312, B:149:0x0252, B:139:0x0241, B:140:?, B:133:0x0221, B:125:0x020e] A[DONT_GENERATE, DONT_INLINE], Splitter:B:122:0x0206] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x050e A[ExcHandler: all (r0v6 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:19:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x051c A[Catch:{ all -> 0x053a, all -> 0x0558 }] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0537 A[Catch:{ all -> 0x053a, all -> 0x0558 }] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0551 A[Catch:{ all -> 0x053a, all -> 0x0558 }] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0557 A[SYNTHETIC, Splitter:B:314:0x0557] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:294:0x0516=Splitter:B:294:0x0516, B:314:0x0557=Splitter:B:314:0x0557} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.phenotype.Configurations a(android.content.Context r26, defpackage.yfw r27) {
        /*
            r25 = this;
            r7 = r25
            java.lang.String r1 = " "
            java.lang.String r2 = r7.a
            r3 = 29500(0x733c, float:4.1338E-41)
            if (r2 == 0) goto L_0x0570
            java.lang.String r4 = r7.d
            if (r4 == 0) goto L_0x0568
            boolean r2 = r2.endsWith(r4)
            if (r2 != 0) goto L_0x0027
            java.lang.String r2 = r7.a
            java.lang.String r4 = "com.google.EMPTY"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x001f
            goto L_0x0027
        L_0x001f:
            yfy r1 = new yfy
            java.lang.String r2 = "Invalid alternate configuration name"
            r1.<init>(r3, r2)
            throw r1
        L_0x0027:
            java.lang.String r2 = r7.b
            if (r2 == 0) goto L_0x055e
            java.lang.String r4 = ""
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0047
            java.lang.String r2 = r7.b
            r5 = r26
            boolean r2 = defpackage.ygd.a(r2, r5)
            if (r2 == 0) goto L_0x003f
            goto L_0x0047
        L_0x003f:
            yfy r1 = new yfy
            java.lang.String r2 = "Invalid user"
            r1.<init>(r3, r2)
            throw r1
        L_0x0047:
            android.database.sqlite.SQLiteDatabase r6 = r27.getWritableDatabase()
            defpackage.yfw.a((android.database.sqlite.SQLiteDatabase) r6)
            java.lang.String r2 = r7.a
            java.lang.String r5 = r7.h
            java.lang.String r2 = defpackage.ygb.a(r2, r5)
            r7.a = r2
            java.lang.String r2 = r7.d
            java.lang.String r5 = r7.h
            java.lang.String r2 = defpackage.ygb.a(r2, r5)
            r7.d = r2
            java.lang.String r5 = r7.a     // Catch:{ yfy -> 0x053e, yfx -> 0x0512, all -> 0x050e }
            boolean r2 = r5.equals(r2)     // Catch:{ yfy -> 0x050a, yfx -> 0x0512, all -> 0x050e }
            r5 = 1
            r15 = 0
            if (r2 == 0) goto L_0x006e
            r3 = 0
            goto L_0x0094
        L_0x006e:
            java.lang.String r2 = r7.a     // Catch:{ yfy -> 0x050a, yfx -> 0x0512, all -> 0x050e }
            java.lang.String[] r10 = new java.lang.String[r5]     // Catch:{ yfy -> 0x050a, yfx -> 0x0512, all -> 0x050e }
            java.lang.String r8 = "packageName"
            r10[r15] = r8     // Catch:{ yfy -> 0x050a, yfx -> 0x0512, all -> 0x050e }
            java.lang.String[] r12 = new java.lang.String[r5]     // Catch:{ yfy -> 0x050a, yfx -> 0x0512, all -> 0x050e }
            r12[r15] = r2     // Catch:{ yfy -> 0x050a, yfx -> 0x0512, all -> 0x050e }
            java.lang.String r9 = "LogSources"
            java.lang.String r11 = "packageName = ?"
            r13 = 0
            r14 = 0
            java.lang.String r2 = "1"
            r8 = r6
            r3 = 0
            r15 = r2
            android.database.Cursor r2 = r8.query(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ yfy -> 0x050a, yfx -> 0x0512, all -> 0x050e }
            int r8 = r2.getCount()     // Catch:{ all -> 0x04fa }
            if (r2 == 0) goto L_0x0092
            r2.close()     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
        L_0x0092:
            if (r8 > 0) goto L_0x04ee
        L_0x0094:
            java.lang.String r2 = r7.d     // Catch:{ yfy -> 0x050a, yfx -> 0x0512, all -> 0x050e }
            boolean r2 = b(r2)     // Catch:{ yfy -> 0x050a, yfx -> 0x0512, all -> 0x050e }
            if (r2 != 0) goto L_0x009d
        L_0x009c:
            goto L_0x00a6
        L_0x009d:
            java.lang.String r2 = r7.b     // Catch:{ yfy -> 0x050a, yfx -> 0x0512, all -> 0x050e }
            boolean r2 = r2.equals(r4)     // Catch:{ yfy -> 0x050a, yfx -> 0x0512, all -> 0x050e }
            if (r2 == 0) goto L_0x04a7
            goto L_0x009c
        L_0x00a6:
            java.lang.String r2 = r7.a     // Catch:{ yfy -> 0x050a, yfx -> 0x0512, all -> 0x050e }
            java.lang.String r8 = r7.b     // Catch:{ yfy -> 0x050a, yfx -> 0x0512, all -> 0x050e }
            int r2 = b(r6, r2, r8)     // Catch:{ yfy -> 0x050a, yfx -> 0x0512, all -> 0x050e }
            java.lang.String r8 = r7.d     // Catch:{ yfy -> 0x050a, yfx -> 0x0512, all -> 0x050e }
            java.lang.String r9 = r7.b     // Catch:{ yfy -> 0x050a, yfx -> 0x0512, all -> 0x050e }
            com.google.android.gms.phenotype.Flag[] r15 = a(r6, r8, r9)     // Catch:{ yfy -> 0x050a, yfx -> 0x0512, all -> 0x050e }
            r14 = 4
            java.lang.String r8 = "serverToken"
            r13 = 0
            r12 = 3
            r11 = 2
            if (r15 != 0) goto L_0x0145
            java.lang.String[] r10 = new java.lang.String[r12]     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            java.lang.String r9 = "experimentToken"
            r10[r3] = r9     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            r10[r5] = r8     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            java.lang.String r8 = "servingVersion"
            r10[r11] = r8     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            java.lang.String[] r9 = new java.lang.String[r12]     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            java.lang.String r8 = r7.a     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            r9[r3] = r8     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            java.lang.String r8 = java.lang.Integer.toString(r2)     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            r9[r5] = r8     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            java.lang.String r8 = r7.b     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            r9[r11] = r8     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            java.lang.String r16 = "ExperimentTokens"
            java.lang.String r17 = "packageName = ? AND version = ? AND user = ? AND isCommitted = 0"
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r8 = r6
            r22 = r9
            r9 = r16
            r11 = r17
            r12 = r22
            r13 = r18
            r14 = r19
            r23 = r15
            r15 = r20
            r16 = r21
            android.database.Cursor r8 = r8.query(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            boolean r9 = r8.moveToFirst()     // Catch:{ all -> 0x0131 }
            if (r9 == 0) goto L_0x011c
            yhd r9 = new yhd     // Catch:{ all -> 0x0131 }
            byte[] r10 = r8.getBlob(r3)     // Catch:{ all -> 0x0131 }
            java.lang.String r11 = r8.getString(r5)     // Catch:{ all -> 0x0131 }
            r15 = 2
            long r12 = r8.getLong(r15)     // Catch:{ all -> 0x0131 }
            r9.<init>(r10, r11, r12)     // Catch:{ all -> 0x0131 }
            if (r8 == 0) goto L_0x011b
            r8.close()     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            goto L_0x0124
        L_0x011b:
            goto L_0x0125
        L_0x011c:
            r15 = 2
            yhd r9 = defpackage.yhd.a     // Catch:{ all -> 0x0131 }
            if (r8 == 0) goto L_0x0124
            r8.close()     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
        L_0x0124:
        L_0x0125:
            r22 = r6
            r5 = r9
            r3 = r23
            r10 = 0
            r17 = 4
            r18 = 2
            goto L_0x0200
        L_0x0131:
            r0 = move-exception
            r1 = r0
            if (r8 == 0) goto L_0x013e
            r8.close()     // Catch:{ all -> 0x0139 }
            goto L_0x013e
        L_0x0139:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
        L_0x013e:
            throw r1     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
        L_0x013f:
            r0 = move-exception
            r1 = r0
            r22 = r6
            goto L_0x0516
        L_0x0145:
            r23 = r15
            r15 = 2
            r14 = r23
            int r9 = r14.length     // Catch:{ yfy -> 0x050a, yfx -> 0x0512, all -> 0x050e }
            r10 = 0
        L_0x014c:
            r12 = 0
            if (r10 >= r9) goto L_0x017f
            r11 = r14[r10]     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            java.lang.String r15 = r11.a     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            java.lang.String r3 = "__phenotype_server_token"
            boolean r3 = r15.equals(r3)     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            if (r3 != 0) goto L_0x015f
            r11 = 0
            r15 = 4
            goto L_0x017a
        L_0x015f:
            int r3 = r11.g     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            r15 = 4
            if (r3 != r15) goto L_0x0179
            yhd r3 = new yhd     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            java.lang.String r8 = r11.d()     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            r11 = 0
            r3.<init>(r11, r8, r12)     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            r5 = r3
            r22 = r6
            r10 = r11
            r3 = r14
            r17 = 4
            r18 = 2
            goto L_0x0200
        L_0x0179:
            r11 = 0
        L_0x017a:
            int r10 = r10 + 1
            r3 = 0
            r15 = 2
            goto L_0x014c
        L_0x017f:
            r11 = 0
            r15 = 4
            boolean r3 = defpackage.ayzv.i()     // Catch:{ yfy -> 0x050a, yfx -> 0x0512, all -> 0x050e }
            if (r3 == 0) goto L_0x01f6
            java.lang.String[] r10 = new java.lang.String[r5]     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            r3 = 0
            r10[r3] = r8     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            r9 = 3
            java.lang.String[] r8 = new java.lang.String[r9]     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            java.lang.String r9 = r7.a     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            r8[r3] = r9     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            java.lang.String r3 = java.lang.Integer.toString(r2)     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            r8[r5] = r3     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            java.lang.String r3 = r7.b     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            r16 = 2
            r8[r16] = r3     // Catch:{ yfy -> 0x050a, yfx -> 0x013f, all -> 0x050e }
            java.lang.String r9 = "ExperimentTokens"
            java.lang.String r3 = "packageName = ? AND version = ? AND user = ? AND isCommitted = 0"
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = r8
            r8 = r6
            r5 = r11
            r11 = r3
            r22 = r6
            r5 = r12
            r12 = r21
            r13 = r17
            r3 = r14
            r14 = r18
            r17 = 4
            r18 = 2
            r15 = r19
            r16 = r20
            android.database.Cursor r8 = r8.query(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
            boolean r9 = r8.moveToFirst()     // Catch:{ all -> 0x01e8 }
            if (r9 == 0) goto L_0x01df
            yhd r9 = new yhd     // Catch:{ all -> 0x01e8 }
            r10 = 0
            java.lang.String r11 = r8.getString(r10)     // Catch:{ all -> 0x01e8 }
            r10 = 0
            r9.<init>(r10, r11, r5)     // Catch:{ all -> 0x01e8 }
            if (r8 == 0) goto L_0x01dc
            r8.close()     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
        L_0x01dc:
            r5 = r9
            goto L_0x0200
        L_0x01df:
            r10 = 0
            yhd r5 = defpackage.yhd.a     // Catch:{ all -> 0x01e8 }
            if (r8 == 0) goto L_0x01e7
            r8.close()     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
        L_0x01e7:
            goto L_0x0200
        L_0x01e8:
            r0 = move-exception
            r1 = r0
            if (r8 == 0) goto L_0x01f5
            r8.close()     // Catch:{ all -> 0x01f0 }
            goto L_0x01f5
        L_0x01f0:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
        L_0x01f5:
            throw r1     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
        L_0x01f6:
            r22 = r6
            r10 = r11
            r3 = r14
            r17 = 4
            r18 = 2
            yhd r5 = defpackage.yhd.a     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
        L_0x0200:
            java.lang.String r6 = r7.d     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
            java.lang.String r8 = r7.b     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
            r15 = r22
            android.util.Pair r6 = defpackage.yfw.a((android.database.sqlite.SQLiteDatabase) r15, (java.lang.String) r6, (java.lang.String) r8)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            java.lang.String r8 = r7.c     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            if (r8 == 0) goto L_0x021d
            java.lang.String[] r8 = a((java.lang.String) r8)     // Catch:{ yfy -> 0x04a2, yfx -> 0x0217, all -> 0x0498 }
            if (r8 == 0) goto L_0x021d
            r8 = r8[r17]     // Catch:{ yfy -> 0x04a2, yfx -> 0x0217, all -> 0x0498 }
            goto L_0x021f
        L_0x0217:
            r0 = move-exception
            r1 = r0
            r22 = r15
            goto L_0x0516
        L_0x021d:
            java.lang.String r8 = "!"
        L_0x021f:
            if (r6 == 0) goto L_0x0235
            java.lang.String r9 = r7.d     // Catch:{ yfy -> 0x04a2, yfx -> 0x0217, all -> 0x0498 }
            java.lang.Object r10 = r6.second     // Catch:{ yfy -> 0x04a2, yfx -> 0x0217, all -> 0x0498 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ yfy -> 0x04a2, yfx -> 0x0217, all -> 0x0498 }
            int r10 = r10.intValue()     // Catch:{ yfy -> 0x04a2, yfx -> 0x0217, all -> 0x0498 }
            java.lang.Object r11 = r6.first     // Catch:{ yfy -> 0x04a2, yfx -> 0x0217, all -> 0x0498 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ yfy -> 0x04a2, yfx -> 0x0217, all -> 0x0498 }
            r12 = 1
            java.lang.String r13 = defpackage.yfo.a(r15, r9, r10, r11, r12)     // Catch:{ yfy -> 0x04a2, yfx -> 0x0217, all -> 0x0498 }
            goto L_0x0236
        L_0x0235:
            r13 = r10
        L_0x0236:
            java.lang.String r9 = r7.a     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            java.lang.String r10 = r7.b     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r11 = 0
            java.lang.String r9 = defpackage.yfo.a(r15, r9, r2, r10, r11)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            if (r3 == 0) goto L_0x0247
            com.google.android.gms.phenotype.Flag[] r10 = e     // Catch:{ yfy -> 0x04a2, yfx -> 0x0217, all -> 0x0498 }
            if (r3 == r10) goto L_0x0247
            r10 = 0
            goto L_0x0248
        L_0x0247:
            r10 = 1
        L_0x0248:
            boolean r8 = r8.equals(r13)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            if (r10 != 0) goto L_0x0250
            r8 = 0
            goto L_0x0261
        L_0x0250:
            if (r8 == 0) goto L_0x0260
            ayzv r8 = defpackage.ayzv.a     // Catch:{ yfy -> 0x04a2, yfx -> 0x0217, all -> 0x0498 }
            ayzw r8 = r8.a()     // Catch:{ yfy -> 0x04a2, yfx -> 0x0217, all -> 0x0498 }
            boolean r8 = r8.i()     // Catch:{ yfy -> 0x04a2, yfx -> 0x0217, all -> 0x0498 }
            if (r8 == 0) goto L_0x0260
            r8 = 1
            goto L_0x0261
        L_0x0260:
            r8 = 0
        L_0x0261:
            java.lang.String r10 = r7.b     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            java.lang.String r11 = r7.a     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r23 = r3
            r12 = r4
            long r3 = defpackage.yfm.a(r15, r11)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            java.lang.String r14 = r7.d     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            if (r13 != 0) goto L_0x0271
            r13 = r12
        L_0x0271:
            java.lang.String r12 = "0"
            if (r8 != 0) goto L_0x0278
            r17 = r12
            goto L_0x027c
        L_0x0278:
            java.lang.String r16 = "1"
            r17 = r16
        L_0x027c:
            java.lang.String r16 = java.lang.String.valueOf(r10)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            int r16 = r16.length()     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            int r16 = r16 + 38
            java.lang.String r19 = java.lang.String.valueOf(r11)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            int r19 = r19.length()     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            int r16 = r16 + r19
            java.lang.String r19 = java.lang.String.valueOf(r9)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            int r19 = r19.length()     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            int r16 = r16 + r19
            java.lang.String r19 = java.lang.String.valueOf(r14)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            int r19 = r19.length()     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            int r16 = r16 + r19
            java.lang.String r19 = java.lang.String.valueOf(r13)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            int r19 = r19.length()     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            int r16 = r16 + r19
            int r19 = r17.length()     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r20 = r12
            int r12 = r16 + r19
            r16 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r5.<init>(r12)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r5.append(r10)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r5.append(r1)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r5.append(r11)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r5.append(r1)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r5.append(r2)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r5.append(r1)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r5.append(r3)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r5.append(r1)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r5.append(r9)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r5.append(r1)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r5.append(r14)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r5.append(r1)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r5.append(r13)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r5.append(r1)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r12 = r17
            r5.append(r12)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            java.lang.String r4 = r5.toString()     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            if (r8 == 0) goto L_0x0480
            java.lang.Object r1 = r6.first     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            java.lang.Object r3 = r6.second     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            int r3 = r3.intValue()     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            java.util.TreeSet r5 = new java.util.TreeSet     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r5.<init>()     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            java.util.TreeSet r6 = new java.util.TreeSet     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            java.util.Comparator r8 = com.google.android.gms.phenotype.Flag.j     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r6.<init>(r8)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            java.lang.String r8 = r7.d     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            com.google.android.gms.phenotype.Flag[] r8 = defpackage.yhb.c(r15, r8)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            if (r8 == 0) goto L_0x0321
            int r9 = r8.length     // Catch:{ yfy -> 0x04a2, yfx -> 0x0217, all -> 0x0498 }
            r10 = 0
        L_0x0314:
            if (r10 >= r9) goto L_0x0321
            r11 = r8[r10]     // Catch:{ yfy -> 0x04a2, yfx -> 0x0217, all -> 0x0498 }
            r5.add(r11)     // Catch:{ yfy -> 0x04a2, yfx -> 0x0217, all -> 0x0498 }
            r6.add(r11)     // Catch:{ yfy -> 0x04a2, yfx -> 0x0217, all -> 0x0498 }
            int r10 = r10 + 1
            goto L_0x0314
        L_0x0321:
            java.lang.String[] r10 = defpackage.yfq.b     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r14 = 3
            java.lang.String[] r12 = new java.lang.String[r14]     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            java.lang.String r8 = r7.d     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r9 = 0
            r12[r9] = r8     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            java.lang.String r8 = java.lang.Integer.toString(r3)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r9 = 1
            r12[r9] = r8     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r12[r18] = r1     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            java.lang.String r9 = "Flags"
            java.lang.String r11 = "packageName = ? AND version = ? AND user = ? AND committed = 1"
            r13 = 0
            r17 = 0
            java.lang.String r19 = "name"
            r8 = r15
            r24 = r20
            r14 = r17
            r17 = r15
            r15 = r19
            android.database.Cursor r14 = r8.query(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ yfy -> 0x047a, yfx -> 0x0475, all -> 0x046f }
            boolean r8 = r7.i     // Catch:{ all -> 0x045f }
            if (r8 != 0) goto L_0x0352
            r3 = r2
            r15 = r17
            goto L_0x0396
        L_0x0352:
            java.lang.String r9 = r7.d     // Catch:{ all -> 0x045f }
            r12 = 1
            r8 = r17
            r10 = r3
            r11 = r1
            r13 = r14
            boolean r1 = defpackage.yfe.a(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x045f }
            if (r1 != 0) goto L_0x0393
            int r1 = r4.length()     // Catch:{ all -> 0x038d }
            int r1 = r1 + -1
            r3 = 0
            java.lang.String r1 = r4.substring(r3, r1)     // Catch:{ all -> 0x038d }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x038d }
            r3 = r24
            java.lang.String r4 = r1.concat(r3)     // Catch:{ all -> 0x038d }
            com.google.android.gms.phenotype.Flag[] r6 = e     // Catch:{ all -> 0x038d }
            r1 = r25
            r3 = r2
            r2 = r17
            r5 = r16
            r15 = r17
            com.google.android.gms.phenotype.Configurations r1 = r1.a((android.database.sqlite.SQLiteDatabase) r2, (int) r3, (java.lang.String) r4, (defpackage.yhd) r5, (com.google.android.gms.phenotype.Flag[]) r6)     // Catch:{ all -> 0x03ad }
            if (r14 == 0) goto L_0x0389
            r14.close()     // Catch:{ yfy -> 0x04a2, yfx -> 0x0217, all -> 0x0498 }
        L_0x0389:
            r22 = r15
            goto L_0x0490
        L_0x038d:
            r0 = move-exception
            r1 = r0
            r22 = r17
            goto L_0x0463
        L_0x0393:
            r3 = r2
            r15 = r17
        L_0x0396:
            boolean r1 = r14.moveToNext()     // Catch:{ all -> 0x045b }
            if (r1 == 0) goto L_0x03b3
            com.google.android.gms.phenotype.Flag r1 = a((android.database.Cursor) r14)     // Catch:{ all -> 0x03ad }
            boolean r2 = r6.contains(r1)     // Catch:{ all -> 0x03ad }
            if (r2 != 0) goto L_0x0396
            r5.add(r1)     // Catch:{ all -> 0x03ad }
            r6.add(r1)     // Catch:{ all -> 0x03ad }
            goto L_0x0396
        L_0x03ad:
            r0 = move-exception
            r1 = r0
            r22 = r15
            goto L_0x0463
        L_0x03b3:
            if (r14 != 0) goto L_0x03b6
            goto L_0x03b9
        L_0x03b6:
            r14.close()     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
        L_0x03b9:
            java.util.TreeSet r1 = new java.util.TreeSet     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r1.<init>()     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            java.util.TreeSet r2 = new java.util.TreeSet     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            java.util.Comparator r8 = com.google.android.gms.phenotype.Flag.j     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r2.<init>(r8)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            java.lang.String[] r10 = defpackage.yfq.b     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r8 = 3
            java.lang.String[] r12 = new java.lang.String[r8]     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            java.lang.String r8 = r7.a     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r9 = 0
            r12[r9] = r8     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            java.lang.String r8 = java.lang.Integer.toString(r3)     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r9 = 1
            r12[r9] = r8     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            java.lang.String r8 = r7.b     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            r12[r18] = r8     // Catch:{ yfy -> 0x04a2, yfx -> 0x049d, all -> 0x0498 }
            java.lang.String r9 = "Flags"
            java.lang.String r11 = "packageName = ? AND version = ? AND user = ? AND committed = 0"
            r13 = 0
            r14 = 0
            java.lang.String r17 = "name"
            r8 = r15
            r22 = r15
            r15 = r17
            android.database.Cursor r14 = r8.query(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
            boolean r8 = r7.i     // Catch:{ all -> 0x044d }
            if (r8 != 0) goto L_0x03f0
            goto L_0x03ff
        L_0x03f0:
            java.lang.String r9 = r7.a     // Catch:{ all -> 0x044d }
            java.lang.String r11 = r7.b     // Catch:{ all -> 0x044d }
            r12 = 0
            r8 = r22
            r10 = r3
            r13 = r14
            boolean r3 = defpackage.yfe.a(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x044d }
            if (r3 == 0) goto L_0x0425
        L_0x03ff:
            boolean r3 = r14.moveToNext()     // Catch:{ all -> 0x044d }
            if (r3 == 0) goto L_0x0410
            com.google.android.gms.phenotype.Flag r3 = a((android.database.Cursor) r14)     // Catch:{ all -> 0x044d }
            r1.add(r3)     // Catch:{ all -> 0x044d }
            r2.add(r3)     // Catch:{ all -> 0x044d }
            goto L_0x03ff
        L_0x0410:
            if (r14 != 0) goto L_0x0413
            goto L_0x0416
        L_0x0413:
            r14.close()     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
        L_0x0416:
            r1.removeAll(r5)     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
            r6.removeAll(r2)     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
            r9 = r16
            r2 = 1
            com.google.android.gms.phenotype.Configurations r1 = a((java.util.Set) r1, (java.util.Set) r6, (java.lang.String) r4, (defpackage.yhd) r9, (boolean) r2)     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
            goto L_0x0490
        L_0x0425:
            yfx r1 = new yfx     // Catch:{ all -> 0x044d }
            java.lang.String r2 = r7.a     // Catch:{ all -> 0x044d }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x044d }
            int r3 = r3.length()     // Catch:{ all -> 0x044d }
            int r3 = r3 + 71
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x044d }
            r4.<init>(r3)     // Catch:{ all -> 0x044d }
            java.lang.String r3 = "Can't return configuration for package "
            r4.append(r3)     // Catch:{ all -> 0x044d }
            r4.append(r2)     // Catch:{ all -> 0x044d }
            java.lang.String r2 = " due to detected flag corruption"
            r4.append(r2)     // Catch:{ all -> 0x044d }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x044d }
            r1.<init>(r2)     // Catch:{ all -> 0x044d }
            throw r1     // Catch:{ all -> 0x044d }
        L_0x044d:
            r0 = move-exception
            r1 = r0
            if (r14 == 0) goto L_0x045a
            r14.close()     // Catch:{ all -> 0x0455 }
            goto L_0x045a
        L_0x0455:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
        L_0x045a:
            throw r1     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
        L_0x045b:
            r0 = move-exception
            r22 = r15
            goto L_0x0462
        L_0x045f:
            r0 = move-exception
            r22 = r17
        L_0x0462:
            r1 = r0
        L_0x0463:
            if (r14 == 0) goto L_0x046e
            r14.close()     // Catch:{ all -> 0x0469 }
            goto L_0x046e
        L_0x0469:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
        L_0x046e:
            throw r1     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
        L_0x046f:
            r0 = move-exception
            r1 = r0
            r4 = r17
            goto L_0x055a
        L_0x0475:
            r0 = move-exception
            r22 = r17
            goto L_0x0515
        L_0x047a:
            r0 = move-exception
            r1 = r0
            r4 = r17
            goto L_0x0541
        L_0x0480:
            r3 = r2
            r22 = r15
            r9 = r16
            r1 = r25
            r2 = r22
            r6 = r23
            r5 = r9
            com.google.android.gms.phenotype.Configurations r1 = r1.a((android.database.sqlite.SQLiteDatabase) r2, (int) r3, (java.lang.String) r4, (defpackage.yhd) r5, (com.google.android.gms.phenotype.Flag[]) r6)     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
        L_0x0490:
            r22.setTransactionSuccessful()     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
            r22.endTransaction()
            goto L_0x0556
        L_0x0498:
            r0 = move-exception
            r1 = r0
            r4 = r15
            goto L_0x055a
        L_0x049d:
            r0 = move-exception
            r22 = r15
            goto L_0x0515
        L_0x04a2:
            r0 = move-exception
            r1 = r0
            r4 = r15
            goto L_0x0541
        L_0x04a7:
            r22 = r6
            yfy r1 = new yfy     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
            java.lang.String r2 = r7.b     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
            java.lang.String r3 = r7.d     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
            int r4 = r4.length()     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
            int r4 = r4 + 47
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
            int r5 = r5.length()     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
            int r4 = r4 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
            r5.<init>(r4)     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
            java.lang.String r4 = "Can't commit to "
            r5.append(r4)     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
            r5.append(r2)     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
            java.lang.String r2 = " for direct boot aware package "
            r5.append(r2)     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
            r5.append(r3)     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
            java.lang.String r2 = r5.toString()     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
            r3 = 29500(0x733c, float:4.1338E-41)
            r1.<init>(r3, r2)     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
            throw r1     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
        L_0x04e1:
            r0 = move-exception
            r1 = r0
            r4 = r22
            goto L_0x055a
        L_0x04e7:
            r0 = move-exception
            goto L_0x0515
        L_0x04e9:
            r0 = move-exception
            r1 = r0
            r4 = r22
            goto L_0x0541
        L_0x04ee:
            r22 = r6
            yfy r1 = new yfy     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
            java.lang.String r2 = "Alternate package cannot have log sources"
            r3 = 29500(0x733c, float:4.1338E-41)
            r1.<init>(r3, r2)     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
            throw r1     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
        L_0x04fa:
            r0 = move-exception
            r22 = r6
            r1 = r0
            if (r2 == 0) goto L_0x0509
            r2.close()     // Catch:{ all -> 0x0504 }
            goto L_0x0509
        L_0x0504:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
        L_0x0509:
            throw r1     // Catch:{ yfy -> 0x04e9, yfx -> 0x04e7, all -> 0x04e1 }
        L_0x050a:
            r0 = move-exception
            r1 = r0
            r4 = r6
            goto L_0x0541
        L_0x050e:
            r0 = move-exception
            r1 = r0
            r4 = r6
            goto L_0x055a
        L_0x0512:
            r0 = move-exception
            r22 = r6
        L_0x0515:
            r1 = r0
        L_0x0516:
            int r2 = r1.a     // Catch:{ all -> 0x053a }
            r3 = 29512(0x7348, float:4.1355E-41)
            if (r2 != r3) goto L_0x0537
            r22.endTransaction()     // Catch:{ all -> 0x053a }
            defpackage.yfw.a((android.database.sqlite.SQLiteDatabase) r22)     // Catch:{ all -> 0x053a }
            java.lang.String r2 = r7.a     // Catch:{ all -> 0x053a }
            java.lang.String r3 = r7.b     // Catch:{ all -> 0x053a }
            r4 = r22
            int r2 = b(r4, r2, r3)     // Catch:{ all -> 0x0558 }
            java.lang.String r3 = r7.a     // Catch:{ all -> 0x0558 }
            java.lang.String r5 = r7.b     // Catch:{ all -> 0x0558 }
            defpackage.yfw.a((android.database.sqlite.SQLiteDatabase) r4, (java.lang.String) r3, (java.lang.String) r5, (int) r2)     // Catch:{ all -> 0x0558 }
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x0558 }
            goto L_0x0539
        L_0x0537:
            r4 = r22
        L_0x0539:
            throw r1     // Catch:{ all -> 0x0558 }
        L_0x053a:
            r0 = move-exception
            r4 = r22
            goto L_0x0559
        L_0x053e:
            r0 = move-exception
            r4 = r6
            r1 = r0
        L_0x0541:
            int r2 = r1.a     // Catch:{ all -> 0x0558 }
            r3 = 29503(0x733f, float:4.1343E-41)
            if (r2 != r3) goto L_0x0557
            java.lang.String r2 = r7.a     // Catch:{ all -> 0x0558 }
            java.lang.String r3 = r7.d     // Catch:{ all -> 0x0558 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0558 }
            if (r2 == 0) goto L_0x0557
            com.google.android.gms.phenotype.Configurations r1 = g     // Catch:{ all -> 0x0558 }
            r4.endTransaction()
        L_0x0556:
            return r1
        L_0x0557:
            throw r1     // Catch:{ all -> 0x0558 }
        L_0x0558:
            r0 = move-exception
        L_0x0559:
            r1 = r0
        L_0x055a:
            r4.endTransaction()
            throw r1
        L_0x055e:
            yfy r1 = new yfy
            java.lang.String r2 = "No user"
            r3 = 29500(0x733c, float:4.1338E-41)
            r1.<init>(r3, r2)
            throw r1
        L_0x0568:
            yfy r1 = new yfy
            java.lang.String r2 = "No target package"
            r1.<init>(r3, r2)
            throw r1
        L_0x0570:
            yfy r1 = new yfy
            java.lang.String r2 = "No source package"
            r1.<init>(r3, r2)
            goto L_0x0579
        L_0x0578:
            throw r1
        L_0x0579:
            goto L_0x0578
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yhe.a(android.content.Context, yfw):com.google.android.gms.phenotype.Configurations");
    }
}
