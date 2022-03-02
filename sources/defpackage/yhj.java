package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: yhj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yhj {
    private static final byte[][] c = new byte[0][];
    private static final int[] d = {14900366};
    private static final yhh g = new yhh();
    private static final ExperimentTokens h = ExperimentTokens.a.a();
    private static final byte[][] i = new byte[0][];
    public String a;
    public final String b;
    private final String e;
    private final String f;

    static {
        iyc iyc = iyc.UNKNOWN;
    }

    public yhj(String str, String str2, String str3) {
        this(str, str2, (String) null, str3);
    }

    private static Map a(SQLiteDatabase sQLiteDatabase, int i2, String str) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT DISTINCT token, provenance, fromUser FROM CrossLoggedExperimentTokens WHERE isCommitted = 1 AND toPackageName = ? AND toVersion = ?", new String[]{str, Integer.toString(i2)});
        try {
            if (rawQuery.getCount() != 0) {
                HashMap hashMap = new HashMap();
                while (rawQuery.moveToNext()) {
                    ygv.a(hashMap, Integer.valueOf(rawQuery.getInt(1)), rawQuery.getBlob(0));
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return hashMap;
            } else if (rawQuery == null) {
                return null;
            } else {
                rawQuery.close();
                return null;
            }
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    private static Set b(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query(true, "Packages", new String[]{"packageName"}, "androidPackageName = ?", new String[]{str}, (String) null, (String) null, (String) null, (String) null);
        try {
            HashSet a2 = angm.a(query.getCount());
            while (query.moveToNext()) {
                a2.add(query.getString(0));
            }
            if (query != null) {
                query.close();
            }
            return a2;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    private static int c(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query("Packages", new String[]{"version"}, "packageName = ?", new String[]{str}, (String) null, (String) null, (String) null, (String) null);
        try {
            if (query.moveToFirst()) {
                int i2 = query.getInt(0);
                if (query != null) {
                    query.close();
                }
                return i2;
            } else if (query == null) {
                return -1;
            } else {
                query.close();
                return -1;
            }
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public yhj(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.e = str3 == null ? "" : str3;
        this.f = str4;
    }

    private static Set a(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query("Packages", new String[]{"packageName"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        try {
            HashSet a2 = angm.a(query.getCount());
            while (query.moveToNext()) {
                a2.add(query.getString(0));
            }
            if (query != null) {
                query.close();
            }
            return a2;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final ExperimentTokens b(yfw yfw) {
        String str = this.b;
        if (str == null && this.a == null) {
            throw new yfy(29500, "No package name or log source");
        } else if (str != null && this.a != null) {
            throw new yfy(29500, "Both package name and log source specified");
        } else if (this.f != null) {
            ExperimentTokens a2 = a(yfw);
            if (a2 != null) {
                return a2.a();
            }
            throw new yfy(29505, "No config packages for log source, or config package not registered");
        } else {
            throw new yfy(29500, "Calling package must be specified");
        }
    }

    private static Set a(SQLiteDatabase sQLiteDatabase, String str) {
        Set<String> b2 = b(sQLiteDatabase, str);
        aucx aucx = ayyx.a.a().a().a;
        HashSet hashSet = new HashSet();
        for (String str2 : b2) {
            if (aucx.contains(ygb.a(str2))) {
                hashSet.add(str2);
            }
        }
        return hashSet;
    }

    public static void a() {
        g.a();
    }

    private static byte[] a(SQLiteDatabase sQLiteDatabase, String str, String str2, int i2) {
        Cursor query = sQLiteDatabase.query("ExperimentTokens", new String[]{"experimentToken"}, "user = ? AND packageName = ? AND version = ? AND isCommitted = 1", new String[]{str, str2, Integer.toString(i2)}, (String) null, (String) null, (String) null);
        try {
            if (query.moveToFirst()) {
                byte[] blob = query.getBlob(0);
                if (query != null) {
                    query.close();
                }
                return blob;
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

    private static byte[][] a(Collection collection) {
        return collection != null ? (byte[][]) collection.toArray(i) : i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x016d, code lost:
        if (r4 != null) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0178, code lost:
        if (r4 != null) goto L_0x016f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0526 A[Catch:{ all -> 0x0511, all -> 0x0519, all -> 0x0467, all -> 0x046f, all -> 0x035b, all -> 0x0363, all -> 0x02d0, all -> 0x02d8, all -> 0x01a2, all -> 0x01aa, all -> 0x0562 }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0533 A[Catch:{ all -> 0x0511, all -> 0x0519, all -> 0x0467, all -> 0x046f, all -> 0x035b, all -> 0x0363, all -> 0x02d0, all -> 0x02d8, all -> 0x01a2, all -> 0x01aa, all -> 0x0562 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.phenotype.ExperimentTokens a(defpackage.yfw r46) {
        /*
            r45 = this;
            r1 = r45
            java.lang.String r0 = r1.a
            java.lang.String r2 = r1.f
            java.lang.String r0 = defpackage.ygb.a(r0, r2)
            r1.a = r0
            java.lang.String r2 = r1.b
            java.lang.String r3 = r1.e
            java.lang.String r4 = ":"
            r5 = 2
            r6 = 1
            if (r0 != 0) goto L_0x004c
            java.lang.String r0 = r1.f
            java.lang.String r7 = java.lang.String.valueOf(r2)
            int r7 = r7.length()
            java.lang.String r8 = java.lang.String.valueOf(r0)
            int r8 = r8.length()
            java.lang.String r9 = java.lang.String.valueOf(r3)
            int r9 = r9.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r7 = r7 + r5
            int r7 = r7 + r8
            int r7 = r7 + r9
            r10.<init>(r7)
            r10.append(r2)
            r10.append(r4)
            r10.append(r0)
            r10.append(r4)
            r10.append(r3)
            java.lang.String r0 = r10.toString()
            goto L_0x00a6
        L_0x004c:
            boolean r2 = defpackage.agvj.b(r0)
            if (r2 == 0) goto L_0x0084
            java.lang.String r2 = r1.f
            int r7 = r0.length()
            java.lang.String r8 = java.lang.String.valueOf(r2)
            int r8 = r8.length()
            java.lang.String r9 = java.lang.String.valueOf(r3)
            int r9 = r9.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r7 = r7 + r5
            int r7 = r7 + r8
            int r7 = r7 + r9
            r10.<init>(r7)
            r10.append(r0)
            r10.append(r4)
            r10.append(r2)
            r10.append(r4)
            r10.append(r3)
            java.lang.String r0 = r10.toString()
            goto L_0x00a6
        L_0x0084:
            java.lang.String r2 = r1.f
            int r3 = r0.length()
            java.lang.String r7 = java.lang.String.valueOf(r2)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r3 = r3 + r6
            int r3 = r3 + r7
            r8.<init>(r3)
            r8.append(r0)
            r8.append(r4)
            r8.append(r2)
            java.lang.String r0 = r8.toString()
        L_0x00a6:
            yhh r2 = g
            java.lang.Object r2 = r2.a((java.lang.Object) r0)
            com.google.android.gms.phenotype.ExperimentTokens r2 = (com.google.android.gms.phenotype.ExperimentTokens) r2
            if (r2 != 0) goto L_0x0567
            android.database.sqlite.SQLiteDatabase r2 = r46.getWritableDatabase()
            defpackage.yfw.a((android.database.sqlite.SQLiteDatabase) r2)
            java.lang.String r4 = r1.a     // Catch:{ all -> 0x0562 }
            java.lang.String r7 = r1.b     // Catch:{ all -> 0x0562 }
            java.lang.String r8 = r1.f     // Catch:{ all -> 0x0562 }
            r15 = 4
            r14 = 0
            if (r4 != 0) goto L_0x01b0
            auib r4 = defpackage.ayyg.b()     // Catch:{ all -> 0x0562 }
            aucx r4 = r4.a     // Catch:{ all -> 0x0562 }
            boolean r4 = r4.contains(r7)     // Catch:{ all -> 0x0562 }
            if (r4 == 0) goto L_0x00da
            android.util.Pair r4 = new android.util.Pair     // Catch:{ all -> 0x0562 }
            java.util.Set r7 = a((android.database.sqlite.SQLiteDatabase) r2)     // Catch:{ all -> 0x0562 }
            yhi r8 = defpackage.yhi.DEVICE     // Catch:{ all -> 0x0562 }
            r4.<init>(r7, r8)     // Catch:{ all -> 0x0562 }
            goto L_0x01e9
        L_0x00da:
            azap r4 = defpackage.azap.a     // Catch:{ all -> 0x0562 }
            azaq r4 = r4.a()     // Catch:{ all -> 0x0562 }
            boolean r4 = r4.a()     // Catch:{ all -> 0x0562 }
            if (r4 == 0) goto L_0x0145
            ayxv r4 = defpackage.ayxv.a     // Catch:{ all -> 0x0562 }
            ayxw r4 = r4.a()     // Catch:{ all -> 0x0562 }
            agxg r4 = r4.b()     // Catch:{ all -> 0x0562 }
            java.lang.String r9 = "ph_appcfg_"
            java.lang.String r10 = defpackage.ygb.b(r8)     // Catch:{ all -> 0x0562 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0562 }
            int r11 = r10.length()     // Catch:{ all -> 0x0562 }
            if (r11 != 0) goto L_0x0106
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x0562 }
            r10.<init>(r9)     // Catch:{ all -> 0x0562 }
            goto L_0x010a
        L_0x0106:
            java.lang.String r10 = r9.concat(r10)     // Catch:{ all -> 0x0562 }
        L_0x010a:
            auib r9 = defpackage.auib.b     // Catch:{ all -> 0x0562 }
            agvv r11 = defpackage.yga.a     // Catch:{ all -> 0x0562 }
            java.lang.Object r4 = r4.a(r10, r9, r11)     // Catch:{ all -> 0x0562 }
            auib r4 = (defpackage.auib) r4     // Catch:{ all -> 0x0562 }
            aucx r4 = r4.a     // Catch:{ all -> 0x0562 }
            boolean r9 = r4.contains(r7)     // Catch:{ all -> 0x0562 }
            if (r9 == 0) goto L_0x011d
            goto L_0x0138
        L_0x011d:
            java.lang.String r9 = "_ALL_APP_LOG_SOURCES"
            boolean r4 = r4.contains(r9)     // Catch:{ all -> 0x0562 }
            if (r4 != 0) goto L_0x0138
            ayxv r4 = defpackage.ayxv.a     // Catch:{ all -> 0x0562 }
            ayxw r4 = r4.a()     // Catch:{ all -> 0x0562 }
            auib r4 = r4.a()     // Catch:{ all -> 0x0562 }
            aucx r4 = r4.a     // Catch:{ all -> 0x0562 }
            boolean r4 = r4.contains(r7)     // Catch:{ all -> 0x0562 }
            if (r4 != 0) goto L_0x0138
            goto L_0x0145
        L_0x0138:
            android.util.Pair r4 = new android.util.Pair     // Catch:{ all -> 0x0562 }
            java.util.Set r7 = b(r2, r8)     // Catch:{ all -> 0x0562 }
            yhi r8 = defpackage.yhi.APP     // Catch:{ all -> 0x0562 }
            r4.<init>(r7, r8)     // Catch:{ all -> 0x0562 }
            goto L_0x01e9
        L_0x0145:
            java.lang.String[] r4 = new java.lang.String[r5]     // Catch:{ all -> 0x0562 }
            r4[r14] = r7     // Catch:{ all -> 0x0562 }
            r4[r6] = r8     // Catch:{ all -> 0x0562 }
            java.lang.String r7 = "SELECT DISTINCT LogSources.packageName FROM LogSources JOIN Packages ON LogSources.packageName = Packages.packageName WHERE logSourceName = ? AND androidPackageName = ?"
            android.database.Cursor r4 = r2.rawQuery(r7, r4)     // Catch:{ all -> 0x0562 }
            int r7 = r4.getCount()     // Catch:{ all -> 0x01a2 }
            if (r7 == 0) goto L_0x0174
            int r7 = r4.getCount()     // Catch:{ all -> 0x01a2 }
            java.util.HashSet r7 = defpackage.angm.a((int) r7)     // Catch:{ all -> 0x01a2 }
        L_0x015f:
            boolean r9 = r4.moveToNext()     // Catch:{ all -> 0x01a2 }
            if (r9 == 0) goto L_0x016d
            java.lang.String r9 = r4.getString(r14)     // Catch:{ all -> 0x01a2 }
            r7.add(r9)     // Catch:{ all -> 0x01a2 }
            goto L_0x015f
        L_0x016d:
            if (r4 == 0) goto L_0x0173
        L_0x016f:
            r4.close()     // Catch:{ all -> 0x0562 }
        L_0x0172:
            goto L_0x017b
        L_0x0173:
            goto L_0x017b
        L_0x0174:
            java.util.Set r7 = java.util.Collections.emptySet()     // Catch:{ all -> 0x01a2 }
            if (r4 == 0) goto L_0x0172
            goto L_0x016f
        L_0x017b:
            azam r4 = defpackage.azam.a     // Catch:{ all -> 0x0562 }
            azan r4 = r4.a()     // Catch:{ all -> 0x0562 }
            boolean r4 = r4.b()     // Catch:{ all -> 0x0562 }
            if (r4 != 0) goto L_0x0188
            goto L_0x019a
        L_0x0188:
            boolean r4 = r7.isEmpty()     // Catch:{ all -> 0x0562 }
            if (r4 != 0) goto L_0x0196
            java.util.Set r4 = a(r2, r8)     // Catch:{ all -> 0x0562 }
            r7.addAll(r4)     // Catch:{ all -> 0x0562 }
            goto L_0x019a
        L_0x0196:
            java.util.Set r7 = a(r2, r8)     // Catch:{ all -> 0x0562 }
        L_0x019a:
            android.util.Pair r4 = new android.util.Pair     // Catch:{ all -> 0x0562 }
            yhi r8 = defpackage.yhi.REGULAR     // Catch:{ all -> 0x0562 }
            r4.<init>(r7, r8)     // Catch:{ all -> 0x0562 }
            goto L_0x01e9
        L_0x01a2:
            r0 = move-exception
            r3 = r0
            if (r4 == 0) goto L_0x01af
            r4.close()     // Catch:{ all -> 0x01aa }
            goto L_0x01af
        L_0x01aa:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r4)     // Catch:{ all -> 0x0562 }
        L_0x01af:
            throw r3     // Catch:{ all -> 0x0562 }
        L_0x01b0:
            java.lang.String r7 = ".metrics"
            boolean r7 = r7.equals(r4)     // Catch:{ all -> 0x0562 }
            if (r7 == 0) goto L_0x01c4
            android.util.Pair r4 = new android.util.Pair     // Catch:{ all -> 0x0562 }
            java.util.Set r7 = a((android.database.sqlite.SQLiteDatabase) r2)     // Catch:{ all -> 0x0562 }
            yhi r8 = defpackage.yhi.DEVICE     // Catch:{ all -> 0x0562 }
            r4.<init>(r7, r8)     // Catch:{ all -> 0x0562 }
            goto L_0x01e9
        L_0x01c4:
            java.lang.String r7 = "app:"
            boolean r7 = r4.startsWith(r7)     // Catch:{ all -> 0x0562 }
            if (r7 == 0) goto L_0x01dd
            java.lang.String r4 = r4.substring(r15)     // Catch:{ all -> 0x0562 }
            android.util.Pair r7 = new android.util.Pair     // Catch:{ all -> 0x0562 }
            java.util.Set r4 = b(r2, r4)     // Catch:{ all -> 0x0562 }
            yhi r8 = defpackage.yhi.APP     // Catch:{ all -> 0x0562 }
            r7.<init>(r4, r8)     // Catch:{ all -> 0x0562 }
            r4 = r7
            goto L_0x01e9
        L_0x01dd:
            android.util.Pair r7 = new android.util.Pair     // Catch:{ all -> 0x0562 }
            java.util.Set r4 = java.util.Collections.singleton(r4)     // Catch:{ all -> 0x0562 }
            yhi r8 = defpackage.yhi.REGULAR     // Catch:{ all -> 0x0562 }
            r7.<init>(r4, r8)     // Catch:{ all -> 0x0562 }
            r4 = r7
        L_0x01e9:
            java.lang.Object r7 = r4.first     // Catch:{ all -> 0x0562 }
            java.util.Set r7 = (java.util.Set) r7     // Catch:{ all -> 0x0562 }
            java.lang.String r13 = r1.e     // Catch:{ all -> 0x0562 }
            java.lang.Object r4 = r4.second     // Catch:{ all -> 0x0562 }
            yhi r4 = (defpackage.yhi) r4     // Catch:{ all -> 0x0562 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0562 }
            int r8 = r7.size()     // Catch:{ all -> 0x0562 }
            r12.<init>(r8)     // Catch:{ all -> 0x0562 }
            java.util.Iterator r16 = r7.iterator()     // Catch:{ all -> 0x0562 }
        L_0x0200:
            boolean r7 = r16.hasNext()     // Catch:{ all -> 0x0562 }
            if (r7 == 0) goto L_0x053d
            java.lang.Object r7 = r16.next()     // Catch:{ all -> 0x0562 }
            r11 = r7
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0562 }
            boolean r7 = defpackage.agvj.b(r11)     // Catch:{ all -> 0x0562 }
            r17 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r18 = ""
            if (r7 != 0) goto L_0x025b
            android.util.Pair r7 = defpackage.yfl.a(r2, r11)     // Catch:{ all -> 0x0562 }
            if (r7 == 0) goto L_0x023b
            java.lang.Object r8 = r7.first     // Catch:{ all -> 0x0562 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0562 }
            java.lang.Object r7 = r7.second     // Catch:{ all -> 0x0562 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x0562 }
            int r7 = r7.intValue()     // Catch:{ all -> 0x0562 }
            byte[] r9 = a(r2, r8, r11, r7)     // Catch:{ all -> 0x0562 }
            r14 = r7
            r35 = r8
            r27 = r9
            r3 = r11
            r24 = r12
            r5 = r13
            r6 = 0
            r33 = 0
            goto L_0x030c
        L_0x023b:
            int r17 = c(r2, r11)     // Catch:{ all -> 0x0562 }
            if (r17 < 0) goto L_0x0250
            r3 = r11
            r24 = r12
            r5 = r13
            r14 = r17
            r35 = r18
            r6 = 0
            r27 = 0
            r33 = 0
            goto L_0x030c
        L_0x0250:
            r24 = r12
            r5 = r13
            r3 = 0
            r6 = 0
            r8 = 2
            r9 = 1
            r17 = 4
            goto L_0x0524
        L_0x025b:
            int r7 = r4.ordinal()     // Catch:{ all -> 0x0562 }
            if (r7 == 0) goto L_0x02de
            if (r7 == r6) goto L_0x0274
            if (r7 == r5) goto L_0x0274
            r3 = r11
            r24 = r12
            r5 = r13
            r35 = r18
            r6 = 0
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r27 = 0
            r33 = 0
            goto L_0x030c
        L_0x0274:
            java.lang.String[] r9 = new java.lang.String[r6]     // Catch:{ all -> 0x0562 }
            java.lang.String r7 = "experimentToken"
            r9[r14] = r7     // Catch:{ all -> 0x0562 }
            java.lang.String[] r10 = new java.lang.String[r6]     // Catch:{ all -> 0x0562 }
            r10[r14] = r11     // Catch:{ all -> 0x0562 }
            java.lang.String r8 = "ExperimentTokens"
            java.lang.String r19 = "packageName = ? AND isCommitted = 1"
            r20 = 0
            r21 = 0
            r22 = 0
            r7 = r2
            r23 = r10
            r10 = r19
            r3 = r11
            r11 = r23
            r24 = r12
            r12 = r20
            r5 = r13
            r13 = r21
            r6 = 0
            r14 = r22
            android.database.Cursor r7 = r7.query(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0562 }
            int r8 = r7.getCount()     // Catch:{ all -> 0x02d0 }
            if (r8 <= 0) goto L_0x02c1
            int r8 = r7.getCount()     // Catch:{ all -> 0x02d0 }
            byte[][] r8 = new byte[r8][]     // Catch:{ all -> 0x02d0 }
            r14 = 0
        L_0x02ab:
            boolean r9 = r7.moveToNext()     // Catch:{ all -> 0x02d0 }
            if (r9 == 0) goto L_0x02ba
            byte[] r9 = r7.getBlob(r6)     // Catch:{ all -> 0x02d0 }
            r8[r14] = r9     // Catch:{ all -> 0x02d0 }
            int r14 = r14 + 1
            goto L_0x02ab
        L_0x02ba:
            if (r7 != 0) goto L_0x02bd
            goto L_0x02c7
        L_0x02bd:
            r7.close()     // Catch:{ all -> 0x0562 }
            goto L_0x02c7
        L_0x02c1:
            if (r7 == 0) goto L_0x02c6
            r7.close()     // Catch:{ all -> 0x0562 }
        L_0x02c6:
            r8 = 0
        L_0x02c7:
            r33 = r8
            r35 = r18
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r27 = 0
            goto L_0x030c
        L_0x02d0:
            r0 = move-exception
            r3 = r0
            if (r7 == 0) goto L_0x02dd
            r7.close()     // Catch:{ all -> 0x02d8 }
            goto L_0x02dd
        L_0x02d8:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r4)     // Catch:{ all -> 0x0562 }
        L_0x02dd:
            throw r3     // Catch:{ all -> 0x0562 }
        L_0x02de:
            r3 = r11
            r24 = r12
            r5 = r13
            r6 = 0
            java.lang.Integer r7 = defpackage.yfs.a(r2, r3, r5)     // Catch:{ all -> 0x0562 }
            if (r7 == 0) goto L_0x02fe
            int r17 = r7.intValue()     // Catch:{ all -> 0x0562 }
            int r7 = r7.intValue()     // Catch:{ all -> 0x0562 }
            byte[] r9 = a(r2, r5, r3, r7)     // Catch:{ all -> 0x0562 }
            r35 = r5
            r27 = r9
            r14 = r17
            r33 = 0
            goto L_0x030c
        L_0x02fe:
            int r17 = c(r2, r3)     // Catch:{ all -> 0x0562 }
            if (r17 < 0) goto L_0x051f
            r35 = r5
            r14 = r17
            r27 = 0
            r33 = 0
        L_0x030c:
            if (r27 != 0) goto L_0x0369
            r7 = 1
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ all -> 0x0562 }
            r8[r6] = r3     // Catch:{ all -> 0x0562 }
            java.lang.String r7 = defpackage.yfw.b((java.lang.String[]) r8)     // Catch:{ all -> 0x0562 }
            java.lang.String r9 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0562 }
            int r9 = r9.length()     // Catch:{ all -> 0x0562 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0562 }
            int r9 = r9 + 66
            r10.<init>(r9)     // Catch:{ all -> 0x0562 }
            java.lang.String r9 = "SELECT experimentId FROM WeakExperimentIds WHERE packageName IN ("
            r10.append(r9)     // Catch:{ all -> 0x0562 }
            r10.append(r7)     // Catch:{ all -> 0x0562 }
            java.lang.String r7 = ")"
            r10.append(r7)     // Catch:{ all -> 0x0562 }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x0562 }
            android.database.Cursor r7 = r2.rawQuery(r7, r8)     // Catch:{ all -> 0x0562 }
            int r8 = r7.getCount()     // Catch:{ all -> 0x035b }
            int[] r8 = new int[r8]     // Catch:{ all -> 0x035b }
            r9 = 0
        L_0x0342:
            boolean r10 = r7.moveToNext()     // Catch:{ all -> 0x035b }
            if (r10 == 0) goto L_0x0352
            int r10 = r9 + 1
            int r11 = r7.getInt(r6)     // Catch:{ all -> 0x035b }
            r8[r9] = r11     // Catch:{ all -> 0x035b }
            r9 = r10
            goto L_0x0342
        L_0x0352:
            if (r7 == 0) goto L_0x0358
            r7.close()     // Catch:{ all -> 0x0562 }
            goto L_0x0359
        L_0x0358:
        L_0x0359:
            r13 = r8
            goto L_0x036a
        L_0x035b:
            r0 = move-exception
            r3 = r0
            if (r7 == 0) goto L_0x0368
            r7.close()     // Catch:{ all -> 0x0363 }
            goto L_0x0368
        L_0x0363:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r4)     // Catch:{ all -> 0x0562 }
        L_0x0368:
            throw r3     // Catch:{ all -> 0x0562 }
        L_0x0369:
            r13 = 0
        L_0x036a:
            r7 = 1
            java.lang.String[] r9 = new java.lang.String[r7]     // Catch:{ all -> 0x0562 }
            java.lang.String r7 = "packageName"
            r9[r6] = r7     // Catch:{ all -> 0x0562 }
            java.lang.String r8 = "FlagOverrides"
            java.lang.String r10 = "committed = 1"
            r11 = 0
            r12 = 0
            r17 = 0
            r18 = 0
            java.lang.String r22 = "1"
            r7 = r2
            r46 = r13
            r13 = r17
            r44 = r14
            r14 = r18
            r17 = 4
            r15 = r22
            android.database.Cursor r7 = r7.query(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0562 }
            int r8 = r7.getCount()     // Catch:{ all -> 0x0511 }
            if (r7 == 0) goto L_0x0397
            r7.close()     // Catch:{ all -> 0x0562 }
        L_0x0397:
            if (r8 > 0) goto L_0x04df
            yhi r7 = defpackage.yhi.DEVICE     // Catch:{ all -> 0x0562 }
            if (r4 != r7) goto L_0x03b6
            com.google.android.gms.phenotype.ExperimentTokens r3 = new com.google.android.gms.phenotype.ExperimentTokens     // Catch:{ all -> 0x0562 }
            byte[][] r28 = c     // Catch:{ all -> 0x0562 }
            byte[][] r29 = c     // Catch:{ all -> 0x0562 }
            byte[][] r30 = c     // Catch:{ all -> 0x0562 }
            byte[][] r31 = c     // Catch:{ all -> 0x0562 }
            r34 = 0
            r25 = r3
            r26 = r35
            r32 = r46
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0562 }
            r8 = 2
            r9 = 1
            goto L_0x0524
        L_0x03b6:
            boolean r7 = defpackage.agvj.b(r3)     // Catch:{ all -> 0x0562 }
            if (r7 == 0) goto L_0x0475
            yhi r7 = defpackage.yhi.APP     // Catch:{ all -> 0x0562 }
            if (r4 != r7) goto L_0x0475
            java.util.HashSet r15 = new java.util.HashSet     // Catch:{ all -> 0x0562 }
            r7 = 2
            java.lang.String[] r9 = new java.lang.String[r7]     // Catch:{ all -> 0x0562 }
            java.lang.String r7 = "user"
            r9[r6] = r7     // Catch:{ all -> 0x0562 }
            java.lang.String r7 = "version"
            r8 = 1
            r9[r8] = r7     // Catch:{ all -> 0x0562 }
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ all -> 0x0562 }
            r11[r6] = r3     // Catch:{ all -> 0x0562 }
            java.lang.String r8 = "MultiCommitApplicationStates"
            java.lang.String r10 = "packageName = ?"
            r12 = 0
            r13 = 0
            r14 = 0
            r7 = r2
            android.database.Cursor r7 = r7.query(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0562 }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x0467 }
            int r9 = r7.getCount()     // Catch:{ all -> 0x0467 }
            r8.<init>(r9)     // Catch:{ all -> 0x0467 }
        L_0x03e7:
            boolean r9 = r7.moveToNext()     // Catch:{ all -> 0x0467 }
            if (r9 == 0) goto L_0x03fe
            java.lang.String r9 = r7.getString(r6)     // Catch:{ all -> 0x0467 }
            r10 = 1
            int r11 = r7.getInt(r10)     // Catch:{ all -> 0x0467 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0467 }
            r8.put(r9, r10)     // Catch:{ all -> 0x0467 }
            goto L_0x03e7
        L_0x03fe:
            if (r7 != 0) goto L_0x0401
            goto L_0x0404
        L_0x0401:
            r7.close()     // Catch:{ all -> 0x0562 }
        L_0x0404:
            java.util.Collection r7 = r8.values()     // Catch:{ all -> 0x0562 }
            r15.<init>(r7)     // Catch:{ all -> 0x0562 }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0562 }
            r7.<init>()     // Catch:{ all -> 0x0562 }
            java.util.Iterator r8 = r15.iterator()     // Catch:{ all -> 0x0562 }
        L_0x0414:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0562 }
            if (r9 == 0) goto L_0x045e
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0562 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x0562 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x0562 }
            java.util.Map r9 = a(r2, r9, r3)     // Catch:{ all -> 0x0562 }
            if (r9 == 0) goto L_0x0414
            java.util.Set r9 = r9.entrySet()     // Catch:{ all -> 0x0562 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0562 }
        L_0x0432:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0562 }
            if (r10 == 0) goto L_0x0414
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0562 }
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ all -> 0x0562 }
            java.lang.Object r11 = r10.getValue()     // Catch:{ all -> 0x0562 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0562 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0562 }
        L_0x0448:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x0562 }
            if (r12 == 0) goto L_0x0432
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x0562 }
            byte[] r12 = (byte[]) r12     // Catch:{ all -> 0x0562 }
            java.lang.Object r13 = r10.getKey()     // Catch:{ all -> 0x0562 }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x0562 }
            defpackage.ygv.a(r7, r13, r12)     // Catch:{ all -> 0x0562 }
            goto L_0x0448
        L_0x045e:
            boolean r3 = r7.isEmpty()     // Catch:{ all -> 0x0562 }
            if (r3 == 0) goto L_0x0466
            r7 = 0
            goto L_0x047b
        L_0x0466:
            goto L_0x047b
        L_0x0467:
            r0 = move-exception
            r3 = r0
            if (r7 == 0) goto L_0x0474
            r7.close()     // Catch:{ all -> 0x046f }
            goto L_0x0474
        L_0x046f:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r4)     // Catch:{ all -> 0x0562 }
        L_0x0474:
            throw r3     // Catch:{ all -> 0x0562 }
        L_0x0475:
            r7 = r44
            java.util.Map r7 = a(r2, r7, r3)     // Catch:{ all -> 0x0562 }
        L_0x047b:
            if (r7 == 0) goto L_0x04c7
            com.google.android.gms.phenotype.ExperimentTokens r3 = new com.google.android.gms.phenotype.ExperimentTokens     // Catch:{ all -> 0x0562 }
            r8 = 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0562 }
            java.lang.Object r8 = r7.get(r9)     // Catch:{ all -> 0x0562 }
            java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ all -> 0x0562 }
            byte[][] r28 = a((java.util.Collection) r8)     // Catch:{ all -> 0x0562 }
            r8 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0562 }
            java.lang.Object r9 = r7.get(r9)     // Catch:{ all -> 0x0562 }
            java.util.Collection r9 = (java.util.Collection) r9     // Catch:{ all -> 0x0562 }
            byte[][] r29 = a((java.util.Collection) r9)     // Catch:{ all -> 0x0562 }
            r9 = 3
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0562 }
            java.lang.Object r9 = r7.get(r9)     // Catch:{ all -> 0x0562 }
            java.util.Collection r9 = (java.util.Collection) r9     // Catch:{ all -> 0x0562 }
            byte[][] r30 = a((java.util.Collection) r9)     // Catch:{ all -> 0x0562 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x0562 }
            java.lang.Object r7 = r7.get(r9)     // Catch:{ all -> 0x0562 }
            java.util.Collection r7 = (java.util.Collection) r7     // Catch:{ all -> 0x0562 }
            byte[][] r31 = a((java.util.Collection) r7)     // Catch:{ all -> 0x0562 }
            r34 = 0
            r25 = r3
            r26 = r35
            r32 = r46
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0562 }
            r9 = 1
            goto L_0x0524
        L_0x04c7:
            r8 = 2
            com.google.android.gms.phenotype.ExperimentTokens r3 = new com.google.android.gms.phenotype.ExperimentTokens     // Catch:{ all -> 0x0562 }
            byte[][] r28 = c     // Catch:{ all -> 0x0562 }
            byte[][] r29 = c     // Catch:{ all -> 0x0562 }
            byte[][] r30 = c     // Catch:{ all -> 0x0562 }
            byte[][] r31 = c     // Catch:{ all -> 0x0562 }
            r34 = 0
            r25 = r3
            r26 = r35
            r32 = r46
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0562 }
            r9 = 1
            goto L_0x0524
        L_0x04df:
            r8 = 2
            r3 = r46
            if (r3 == 0) goto L_0x04f6
            int r7 = r3.length     // Catch:{ all -> 0x0562 }
            r9 = 1
            int r7 = r7 + r9
            int[] r3 = java.util.Arrays.copyOf(r3, r7)     // Catch:{ all -> 0x0562 }
            int r7 = r3.length     // Catch:{ all -> 0x0562 }
            int r7 = r7 + -1
            r10 = 14900366(0xe35c8e, float:2.087986E-38)
            r3[r7] = r10     // Catch:{ all -> 0x0562 }
            r41 = r3
            goto L_0x04fb
        L_0x04f6:
            r9 = 1
            int[] r3 = d     // Catch:{ all -> 0x0562 }
            r41 = r3
        L_0x04fb:
            com.google.android.gms.phenotype.ExperimentTokens r3 = new com.google.android.gms.phenotype.ExperimentTokens     // Catch:{ all -> 0x0562 }
            r36 = 0
            byte[][] r37 = c     // Catch:{ all -> 0x0562 }
            byte[][] r38 = c     // Catch:{ all -> 0x0562 }
            byte[][] r39 = c     // Catch:{ all -> 0x0562 }
            byte[][] r40 = c     // Catch:{ all -> 0x0562 }
            r42 = 0
            r43 = 0
            r34 = r3
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x0562 }
            goto L_0x0524
        L_0x0511:
            r0 = move-exception
            r3 = r0
            if (r7 == 0) goto L_0x051e
            r7.close()     // Catch:{ all -> 0x0519 }
            goto L_0x051e
        L_0x0519:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r4)     // Catch:{ all -> 0x0562 }
        L_0x051e:
            throw r3     // Catch:{ all -> 0x0562 }
        L_0x051f:
            r8 = 2
            r9 = 1
            r17 = 4
            r3 = 0
        L_0x0524:
            if (r3 == 0) goto L_0x0533
            r7 = r24
            r7.add(r3)     // Catch:{ all -> 0x0562 }
            r13 = r5
            r12 = r7
            r5 = 2
            r6 = 1
            r14 = 0
            r15 = 4
            goto L_0x0200
        L_0x0533:
            r7 = r24
            r13 = r5
            r12 = r7
            r5 = 2
            r6 = 1
            r14 = 0
            r15 = 4
            goto L_0x0200
        L_0x053d:
            r7 = r12
            boolean r3 = r7.isEmpty()     // Catch:{ all -> 0x0562 }
            if (r3 != 0) goto L_0x054b
            com.google.android.gms.phenotype.ExperimentTokens r3 = com.google.android.gms.phenotype.ExperimentTokens.a((java.util.List) r7)     // Catch:{ all -> 0x0562 }
            r19 = r3
            goto L_0x054d
        L_0x054b:
            r19 = 0
        L_0x054d:
            yhh r3 = g     // Catch:{ all -> 0x0562 }
            if (r19 != 0) goto L_0x0554
            com.google.android.gms.phenotype.ExperimentTokens r4 = h     // Catch:{ all -> 0x0562 }
            goto L_0x0556
        L_0x0554:
            r4 = r19
        L_0x0556:
            r3.a((java.lang.Object) r0, (java.lang.Object) r4)     // Catch:{ all -> 0x0562 }
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x0562 }
            r2.endTransaction()
            r2 = r19
            goto L_0x056b
        L_0x0562:
            r0 = move-exception
            r2.endTransaction()
            throw r0
        L_0x0567:
            com.google.android.gms.phenotype.ExperimentTokens r0 = h
            if (r2 == r0) goto L_0x056c
        L_0x056b:
            return r2
        L_0x056c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yhj.a(yfw):com.google.android.gms.phenotype.ExperimentTokens");
    }
}
