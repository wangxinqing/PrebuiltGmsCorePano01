package com.google.android.gms.phenotype.sync;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PackageUpdateTaskChimeraService extends qwf {
    private static final jjg a = jjg.a(iyc.PHENOTYPE);

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0060, code lost:
        if (r6 != null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        defpackage.apev.a(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r7 = (defpackage.anih) a.b();
        r7.a((java.lang.Throwable) r6);
        ((defpackage.anih) r7.a("com.google.android.gms.phenotype.sync.PackageUpdateTaskChimeraService", "a", 134, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unexpected package update task failure");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0089, code lost:
        if (r10.c == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008c, code lost:
        r10.c();
        r10.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0091, code lost:
        r0 = (defpackage.avtf) r10.b;
        r1 = defpackage.avtf.d;
        r0.c = 2;
        r0.a |= 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009e, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00af, code lost:
        r10.c();
        r10.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cb, code lost:
        r9.c();
        r9.c = false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e A[ExcHandler: RuntimeException (r6v0 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:1:0x000a] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ae A[Catch:{ SQLiteException -> 0x005c, RuntimeException -> 0x006e, all -> 0x006b }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00af A[Catch:{ SQLiteException -> 0x005c, RuntimeException -> 0x006e, all -> 0x006b }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int a(android.content.Context r9, defpackage.aucd r10) {
        /*
            java.lang.String r0 = "com.google.android.gms.phenotype.sync.PackageUpdateTaskChimeraService"
            java.lang.String r1 = "a"
            java.lang.String r2 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            r3 = 34
            r4 = 2
            r5 = 0
            yfg r6 = defpackage.yfg.a(r9)     // Catch:{ SQLiteException -> 0x009f, RuntimeException -> 0x006e }
            android.database.sqlite.SQLiteDatabase r7 = r6.getWritableDatabase()     // Catch:{ all -> 0x005f }
            anfv r8 = defpackage.anfv.a     // Catch:{ all -> 0x005f }
            a(r9, r8, r7)     // Catch:{ all -> 0x005f }
            if (r6 != 0) goto L_0x001a
            goto L_0x001d
        L_0x001a:
            r6.close()     // Catch:{ SQLiteException -> 0x005c, RuntimeException -> 0x006e }
        L_0x001d:
            aucd r9 = defpackage.yfd.a(r9)
            boolean r0 = r9.c
            if (r0 != 0) goto L_0x0026
            goto L_0x002b
        L_0x0026:
            r9.c()
            r9.c = r5
        L_0x002b:
            aucj r0 = r9.b
            avtk r0 = (defpackage.avtk) r0
            aucj r10 = r10.i()
            avtf r10 = (defpackage.avtf) r10
            avtk r1 = defpackage.avtk.k
            r10.getClass()
            r0.i = r10
            int r10 = r0.a
            r10 = r10 | 128(0x80, float:1.794E-43)
            r0.a = r10
            aucj r9 = r9.i()
            avtk r9 = (defpackage.avtk) r9
            hol r10 = defpackage.yfd.a()
            byte[] r9 = r9.k()
            hoi r9 = r10.a((byte[]) r9)
            r9.b((int) r3)
            r9.b()
            goto L_0x0100
        L_0x005c:
            r0 = move-exception
            r1 = 0
            goto L_0x00a1
        L_0x005f:
            r7 = move-exception
            if (r6 == 0) goto L_0x006a
            r6.close()     // Catch:{ all -> 0x0066 }
            goto L_0x006a
        L_0x0066:
            r6 = move-exception
            defpackage.apev.a((java.lang.Throwable) r7, (java.lang.Throwable) r6)     // Catch:{ SQLiteException -> 0x009f, RuntimeException -> 0x006e }
        L_0x006a:
            throw r7     // Catch:{ SQLiteException -> 0x009f, RuntimeException -> 0x006e }
        L_0x006b:
            r0 = move-exception
            goto L_0x0101
        L_0x006e:
            r6 = move-exception
            jjg r7 = a     // Catch:{ all -> 0x006b }
            anie r7 = r7.b()     // Catch:{ all -> 0x006b }
            anih r7 = (defpackage.anih) r7     // Catch:{ all -> 0x006b }
            r7.a((java.lang.Throwable) r6)     // Catch:{ all -> 0x006b }
            r8 = 134(0x86, float:1.88E-43)
            anie r0 = r7.a((java.lang.String) r0, (java.lang.String) r1, (int) r8, (java.lang.String) r2)     // Catch:{ all -> 0x006b }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x006b }
            java.lang.String r1 = "Unexpected package update task failure"
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x006b }
            boolean r0 = r10.c     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x008c
            goto L_0x0091
        L_0x008c:
            r10.c()     // Catch:{ all -> 0x006b }
            r10.c = r5     // Catch:{ all -> 0x006b }
        L_0x0091:
            aucj r0 = r10.b     // Catch:{ all -> 0x006b }
            avtf r0 = (defpackage.avtf) r0     // Catch:{ all -> 0x006b }
            avtf r1 = defpackage.avtf.d     // Catch:{ all -> 0x006b }
            r0.c = r4     // Catch:{ all -> 0x006b }
            int r1 = r0.a     // Catch:{ all -> 0x006b }
            r1 = r1 | r4
            r0.a = r1     // Catch:{ all -> 0x006b }
            throw r6     // Catch:{ all -> 0x006b }
        L_0x009f:
            r0 = move-exception
            r1 = 2
        L_0x00a1:
            java.lang.Class<com.google.android.gms.phenotype.sync.PackageUpdateTaskChimeraService> r2 = com.google.android.gms.phenotype.sync.PackageUpdateTaskChimeraService.class
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x006b }
            defpackage.ygu.a((android.content.Context) r9, (java.lang.String) r2, (android.database.sqlite.SQLiteException) r0)     // Catch:{ all -> 0x006b }
            boolean r0 = r10.c     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x00af
            goto L_0x00b4
        L_0x00af:
            r10.c()     // Catch:{ all -> 0x006b }
            r10.c = r5     // Catch:{ all -> 0x006b }
        L_0x00b4:
            aucj r0 = r10.b     // Catch:{ all -> 0x006b }
            avtf r0 = (defpackage.avtf) r0     // Catch:{ all -> 0x006b }
            avtf r2 = defpackage.avtf.d     // Catch:{ all -> 0x006b }
            r2 = 3
            r0.c = r2     // Catch:{ all -> 0x006b }
            int r2 = r0.a     // Catch:{ all -> 0x006b }
            r2 = r2 | r4
            r0.a = r2     // Catch:{ all -> 0x006b }
            aucd r9 = defpackage.yfd.a(r9)
            boolean r0 = r9.c
            if (r0 != 0) goto L_0x00cb
            goto L_0x00d0
        L_0x00cb:
            r9.c()
            r9.c = r5
        L_0x00d0:
            aucj r0 = r9.b
            avtk r0 = (defpackage.avtk) r0
            aucj r10 = r10.i()
            avtf r10 = (defpackage.avtf) r10
            avtk r2 = defpackage.avtk.k
            r10.getClass()
            r0.i = r10
            int r10 = r0.a
            r10 = r10 | 128(0x80, float:1.794E-43)
            r0.a = r10
            aucj r9 = r9.i()
            avtk r9 = (defpackage.avtk) r9
            hol r10 = defpackage.yfd.a()
            byte[] r9 = r9.k()
            hoi r9 = r10.a((byte[]) r9)
            r9.b((int) r3)
            r9.b()
            r5 = r1
        L_0x0100:
            return r5
        L_0x0101:
            aucd r9 = defpackage.yfd.a(r9)
            boolean r1 = r9.c
            if (r1 != 0) goto L_0x010a
            goto L_0x010f
        L_0x010a:
            r9.c()
            r9.c = r5
        L_0x010f:
            aucj r1 = r9.b
            avtk r1 = (defpackage.avtk) r1
            aucj r10 = r10.i()
            avtf r10 = (defpackage.avtf) r10
            avtk r2 = defpackage.avtk.k
            r10.getClass()
            r1.i = r10
            int r10 = r1.a
            r10 = r10 | 128(0x80, float:1.794E-43)
            r1.a = r10
            aucj r9 = r9.i()
            avtk r9 = (defpackage.avtk) r9
            hol r10 = defpackage.yfd.a()
            byte[] r9 = r9.k()
            hoi r9 = r10.a((byte[]) r9)
            r9.b((int) r3)
            r9.b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.sync.PackageUpdateTaskChimeraService.a(android.content.Context, aucd):int");
    }

    public final void aH() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e2, code lost:
        if (r24.equals(r7.getString(2)) == false) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r34, java.util.Set r35, android.database.sqlite.SQLiteDatabase r36) {
        /*
            java.lang.String r0 = "configHash"
            java.lang.String r1 = "serverToken"
            java.lang.String r2 = "experimentToken"
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r36.beginTransaction()
            r4 = 2
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x0140 }
            java.lang.String r5 = "packageName"
            r13 = 0
            r7[r13] = r5     // Catch:{ all -> 0x0140 }
            java.lang.String r5 = "version"
            r14 = 1
            r7[r14] = r5     // Catch:{ all -> 0x0140 }
            java.lang.String r6 = "Packages"
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r5 = r36
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0140 }
        L_0x0028:
            boolean r6 = r5.moveToNext()     // Catch:{ all -> 0x012e }
            if (r6 == 0) goto L_0x010a
            java.lang.String r6 = r5.getString(r13)     // Catch:{ all -> 0x012e }
            int r7 = r5.getInt(r14)     // Catch:{ all -> 0x012e }
            r8 = r35
            boolean r9 = r8.contains(r6)     // Catch:{ all -> 0x012e }
            if (r9 != 0) goto L_0x0028
            r9 = 4
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ all -> 0x012e }
            r9[r13] = r2     // Catch:{ all -> 0x012e }
            r9[r14] = r1     // Catch:{ all -> 0x012e }
            r9[r4] = r0     // Catch:{ all -> 0x012e }
            java.lang.String r10 = "user"
            r11 = 3
            r9[r11] = r10     // Catch:{ all -> 0x012e }
            java.lang.String[] r10 = new java.lang.String[r14]     // Catch:{ all -> 0x012e }
            r10[r13] = r6     // Catch:{ all -> 0x012e }
            java.lang.String r16 = "ExperimentTokens"
            java.lang.String r18 = "packageName = ? AND isCommitted = 1"
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r15 = r36
            r17 = r9
            r19 = r10
            android.database.Cursor r9 = r15.query(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x012e }
            boolean r10 = r9.moveToNext()     // Catch:{ all -> 0x00fc }
            java.lang.String r12 = ""
            if (r10 == 0) goto L_0x0086
            byte[] r10 = r9.getBlob(r13)     // Catch:{ all -> 0x00fc }
            java.lang.String r12 = r9.getString(r14)     // Catch:{ all -> 0x00fc }
            java.lang.String r15 = r9.getString(r4)     // Catch:{ all -> 0x00fc }
            java.lang.String r16 = r9.getString(r11)     // Catch:{ all -> 0x00fc }
            r24 = r15
            r15 = r12
            r12 = r16
            r16 = 1
            goto L_0x008c
        L_0x0086:
            r10 = 0
            r15 = r12
            r24 = r15
            r16 = 0
        L_0x008c:
            if (r9 != 0) goto L_0x008f
            goto L_0x0092
        L_0x008f:
            r9.close()     // Catch:{ all -> 0x012e }
        L_0x0092:
            java.lang.String[] r9 = new java.lang.String[r11]     // Catch:{ all -> 0x012e }
            r9[r13] = r2     // Catch:{ all -> 0x012e }
            r9[r14] = r1     // Catch:{ all -> 0x012e }
            r9[r4] = r0     // Catch:{ all -> 0x012e }
            java.lang.String[] r11 = new java.lang.String[r11]     // Catch:{ all -> 0x012e }
            r11[r13] = r6     // Catch:{ all -> 0x012e }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x012e }
            r11[r14] = r7     // Catch:{ all -> 0x012e }
            r11[r4] = r12     // Catch:{ all -> 0x012e }
            java.lang.String r26 = "ExperimentTokens"
            java.lang.String r28 = "packageName = ? AND version <= ? AND user = ? and isCommitted = 0"
            r30 = 0
            r31 = 0
            java.lang.String r32 = "version DESC"
            java.lang.String r33 = "1"
            r25 = r36
            r27 = r9
            r29 = r11
            android.database.Cursor r7 = r25.query(r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x012e }
            boolean r9 = r7.moveToNext()     // Catch:{ all -> 0x00ee }
            if (r9 == 0) goto L_0x00e7
            if (r16 == 0) goto L_0x00e4
            byte[] r9 = r7.getBlob(r13)     // Catch:{ all -> 0x00ee }
            boolean r9 = java.util.Arrays.equals(r10, r9)     // Catch:{ all -> 0x00ee }
            if (r9 == 0) goto L_0x00e4
            java.lang.String r9 = r7.getString(r14)     // Catch:{ all -> 0x00ee }
            boolean r9 = r15.equals(r9)     // Catch:{ all -> 0x00ee }
            if (r9 == 0) goto L_0x00e4
            java.lang.String r9 = r7.getString(r4)     // Catch:{ all -> 0x00ee }
            r15 = r24
            boolean r9 = r15.equals(r9)     // Catch:{ all -> 0x00ee }
            if (r9 != 0) goto L_0x00e7
        L_0x00e4:
            r3.add(r6)     // Catch:{ all -> 0x00ee }
        L_0x00e7:
            if (r7 == 0) goto L_0x0028
            r7.close()     // Catch:{ all -> 0x012e }
            goto L_0x0028
        L_0x00ee:
            r0 = move-exception
            r1 = r0
            if (r7 == 0) goto L_0x00fb
            r7.close()     // Catch:{ all -> 0x00f6 }
            goto L_0x00fb
        L_0x00f6:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ all -> 0x012e }
        L_0x00fb:
            throw r1     // Catch:{ all -> 0x012e }
        L_0x00fc:
            r0 = move-exception
            r1 = r0
            if (r9 == 0) goto L_0x0109
            r9.close()     // Catch:{ all -> 0x0104 }
            goto L_0x0109
        L_0x0104:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ all -> 0x012e }
        L_0x0109:
            throw r1     // Catch:{ all -> 0x012e }
        L_0x010a:
            r36.setTransactionSuccessful()     // Catch:{ all -> 0x012e }
            if (r5 != 0) goto L_0x0110
            goto L_0x0113
        L_0x0110:
            r5.close()     // Catch:{ all -> 0x0140 }
        L_0x0113:
            r36.endTransaction()
            r1 = r36
            java.util.Map r0 = defpackage.yfu.a((android.database.sqlite.SQLiteDatabase) r1, (java.util.Set) r3)
            r1 = r34
            a(r1, r3, r0, r4)
            qwq r0 = defpackage.qwq.a((android.content.Context) r34)
            java.lang.String r1 = "com.google.android.gms.phenotype.service.sync.PackageUpdateTaskService"
            r0.a((java.lang.String) r1)
            r3.size()
            return
        L_0x012e:
            r0 = move-exception
            r1 = r36
            r2 = r0
            if (r5 == 0) goto L_0x013d
            r5.close()     // Catch:{ all -> 0x0138 }
            goto L_0x013d
        L_0x0138:
            r0 = move-exception
            r3 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r3)     // Catch:{ all -> 0x013e }
        L_0x013d:
            throw r2     // Catch:{ all -> 0x013e }
        L_0x013e:
            r0 = move-exception
            goto L_0x0143
        L_0x0140:
            r0 = move-exception
            r1 = r36
        L_0x0143:
            r36.endTransaction()
            goto L_0x0148
        L_0x0147:
            throw r0
        L_0x0148:
            goto L_0x0147
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.sync.PackageUpdateTaskChimeraService.a(android.content.Context, java.util.Set, android.database.sqlite.SQLiteDatabase):void");
    }

    public static void a(Context context, Set set, Map map, int i) {
        aucd a2 = yfd.a(context);
        for (Map.Entry entry : map.entrySet()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (true) {
                if (it.hasNext()) {
                    String str = (String) it.next();
                    if (set.contains(str)) {
                        String str2 = (String) entry.getKey();
                        int i2 = i - 1;
                        if (i != 0) {
                            avsu a3 = ygc.a(context, str, str2, i2, false);
                            if (a3 != null) {
                                if (a2.c) {
                                    a2.c();
                                    a2.c = false;
                                }
                                avtk avtk = (avtk) a2.b;
                                avtk avtk2 = avtk.k;
                                a3.getClass();
                                avtk.c();
                                avtk.j.add(a3);
                            }
                        } else {
                            throw null;
                        }
                    }
                }
            }
        }
        avtk avtk3 = (avtk) a2.i();
        if (avtk3.j.size() > 0) {
            hoi a4 = yfd.a().a(avtk3.k());
            a4.b(39);
            a4.b();
        }
    }

    public static void a(Context context, boolean z) {
        qxf qxf;
        long e = ayzr.a.a().e();
        long d = ayzr.a.a().d();
        if (e >= 0) {
            if (e < d) {
                e = d;
            }
            ((anih) ((anih) a.d()).a("com.google.android.gms.phenotype.sync.PackageUpdateTaskChimeraService", "a", 65, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Scheduling Phenotype config package catchup updates to be %d seconds from now (%d)", e, System.currentTimeMillis());
            if (z) {
                qxf = new qxf();
                qxf.a(0, e);
                qxf.i = "com.google.android.gms.phenotype.service.sync.PackageUpdateTaskService";
                qxf.n = true;
                qxf.k = "PhenotypeCatchupPackageUpdate-OnChargerAndIdle";
                qxf.b(0, 0);
                qxf.a(1, 1);
                qxf.a(false);
                qxf.b(0);
                qxf.a(true);
                qwq.a(context).a("PhenotypeCatchupPackageUpdate-OnCharger", "com.google.android.gms.phenotype.service.sync.PackageUpdateTaskService");
            } else {
                qxf = new qxf();
                qxf.a(0, e);
                qxf.i = "com.google.android.gms.phenotype.service.sync.PackageUpdateTaskService";
                qxf.n = true;
                qxf.k = "PhenotypeCatchupPackageUpdate-OnCharger";
                qxf.b(0, 0);
                qxf.a(1, 1);
                qxf.a(false);
                qxf.b(0);
                qwq.a(context).a("PhenotypeCatchupPackageUpdate-OnChargerAndIdle", "com.google.android.gms.phenotype.service.sync.PackageUpdateTaskService");
            }
            qwq.a(context).a((qxx) qxf.b());
            qxf qxf2 = new qxf();
            qxf2.a(e - TimeUnit.HOURS.toSeconds(1), e);
            qxf2.i = "com.google.android.gms.phenotype.service.sync.PackageUpdateTaskService";
            qxf2.n = true;
            qxf2.k = "PhenotypeCatchupPackageUpdate-Timeout";
            qxf2.b(0, 0);
            qxf2.a(0, 0);
            qxf2.a(false);
            qxf2.b(0);
            qwq.a(context).a((qxx) qxf2.b());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0088, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0089, code lost:
        if (r7 != null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008f, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        defpackage.apev.a(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r8 = (defpackage.anih) a.b();
        r8.a((java.lang.Throwable) r7);
        ((defpackage.anih) r8.a("com.google.android.gms.phenotype.sync.PackageUpdateTaskChimeraService", "a", 134, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unexpected package update task failure");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b2, code lost:
        if (r0.c == false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b5, code lost:
        r0.c();
        r0.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ba, code lost:
        r1 = (defpackage.avtf) r0.b;
        r1.c = 2;
        r1.a |= 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c5, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c6, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c7, code lost:
        r3 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d6, code lost:
        r0.c();
        r0.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f0, code lost:
        r11.c();
        r11.c = false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097 A[ExcHandler: RuntimeException (r7v0 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:4:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d5 A[Catch:{ SQLiteException -> 0x0085, RuntimeException -> 0x0097, all -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d6 A[Catch:{ SQLiteException -> 0x0085, RuntimeException -> 0x0097, all -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.qxz r11) {
        /*
            r10 = this;
            avtf r0 = defpackage.avtf.d
            aucd r0 = r0.o()
            java.lang.String r11 = r11.a
            java.lang.String r11 = defpackage.amrk.b(r11)
            boolean r1 = r0.c
            r2 = 0
            if (r1 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r0.c()
            r0.c = r2
        L_0x0017:
            aucj r1 = r0.b
            avtf r1 = (defpackage.avtf) r1
            r11.getClass()
            int r3 = r1.a
            r3 = r3 | 1
            r1.a = r3
            r1.b = r11
            android.content.Context r11 = r10.getApplicationContext()
            java.lang.String r1 = "com.google.android.gms.phenotype.sync.PackageUpdateTaskChimeraService"
            java.lang.String r3 = "a"
            java.lang.String r4 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            r5 = 34
            r6 = 2
            yfg r7 = defpackage.yfg.a(r11)     // Catch:{ SQLiteException -> 0x00c6, RuntimeException -> 0x0097 }
            android.database.sqlite.SQLiteDatabase r8 = r7.getWritableDatabase()     // Catch:{ all -> 0x0088 }
            anfv r9 = defpackage.anfv.a     // Catch:{ all -> 0x0088 }
            a(r11, r9, r8)     // Catch:{ all -> 0x0088 }
            if (r7 != 0) goto L_0x0043
            goto L_0x0046
        L_0x0043:
            r7.close()     // Catch:{ SQLiteException -> 0x0085, RuntimeException -> 0x0097 }
        L_0x0046:
            aucd r11 = defpackage.yfd.a(r11)
            boolean r1 = r11.c
            if (r1 != 0) goto L_0x004f
            goto L_0x0054
        L_0x004f:
            r11.c()
            r11.c = r2
        L_0x0054:
            aucj r1 = r11.b
            avtk r1 = (defpackage.avtk) r1
            aucj r0 = r0.i()
            avtf r0 = (defpackage.avtf) r0
            avtk r3 = defpackage.avtk.k
            r0.getClass()
            r1.i = r0
            int r0 = r1.a
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.a = r0
            aucj r11 = r11.i()
            avtk r11 = (defpackage.avtk) r11
            hol r0 = defpackage.yfd.a()
            byte[] r11 = r11.k()
            hoi r11 = r0.a((byte[]) r11)
            r11.b((int) r5)
            r11.b()
            goto L_0x0125
        L_0x0085:
            r1 = move-exception
            r3 = 0
            goto L_0x00c8
        L_0x0088:
            r8 = move-exception
            if (r7 == 0) goto L_0x0093
            r7.close()     // Catch:{ all -> 0x008f }
            goto L_0x0093
        L_0x008f:
            r7 = move-exception
            defpackage.apev.a((java.lang.Throwable) r8, (java.lang.Throwable) r7)     // Catch:{ SQLiteException -> 0x00c6, RuntimeException -> 0x0097 }
        L_0x0093:
            throw r8     // Catch:{ SQLiteException -> 0x00c6, RuntimeException -> 0x0097 }
        L_0x0094:
            r1 = move-exception
            goto L_0x0126
        L_0x0097:
            r7 = move-exception
            jjg r8 = a     // Catch:{ all -> 0x0094 }
            anie r8 = r8.b()     // Catch:{ all -> 0x0094 }
            anih r8 = (defpackage.anih) r8     // Catch:{ all -> 0x0094 }
            r8.a((java.lang.Throwable) r7)     // Catch:{ all -> 0x0094 }
            r9 = 134(0x86, float:1.88E-43)
            anie r1 = r8.a((java.lang.String) r1, (java.lang.String) r3, (int) r9, (java.lang.String) r4)     // Catch:{ all -> 0x0094 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0094 }
            java.lang.String r3 = "Unexpected package update task failure"
            r1.a((java.lang.String) r3)     // Catch:{ all -> 0x0094 }
            boolean r1 = r0.c     // Catch:{ all -> 0x0094 }
            if (r1 != 0) goto L_0x00b5
            goto L_0x00ba
        L_0x00b5:
            r0.c()     // Catch:{ all -> 0x0094 }
            r0.c = r2     // Catch:{ all -> 0x0094 }
        L_0x00ba:
            aucj r1 = r0.b     // Catch:{ all -> 0x0094 }
            avtf r1 = (defpackage.avtf) r1     // Catch:{ all -> 0x0094 }
            r1.c = r6     // Catch:{ all -> 0x0094 }
            int r3 = r1.a     // Catch:{ all -> 0x0094 }
            r3 = r3 | r6
            r1.a = r3     // Catch:{ all -> 0x0094 }
            throw r7     // Catch:{ all -> 0x0094 }
        L_0x00c6:
            r1 = move-exception
            r3 = 2
        L_0x00c8:
            java.lang.Class<com.google.android.gms.phenotype.sync.PackageUpdateTaskChimeraService> r4 = com.google.android.gms.phenotype.sync.PackageUpdateTaskChimeraService.class
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x0094 }
            defpackage.ygu.a((android.content.Context) r11, (java.lang.String) r4, (android.database.sqlite.SQLiteException) r1)     // Catch:{ all -> 0x0094 }
            boolean r1 = r0.c     // Catch:{ all -> 0x0094 }
            if (r1 != 0) goto L_0x00d6
            goto L_0x00db
        L_0x00d6:
            r0.c()     // Catch:{ all -> 0x0094 }
            r0.c = r2     // Catch:{ all -> 0x0094 }
        L_0x00db:
            aucj r1 = r0.b     // Catch:{ all -> 0x0094 }
            avtf r1 = (defpackage.avtf) r1     // Catch:{ all -> 0x0094 }
            r4 = 3
            r1.c = r4     // Catch:{ all -> 0x0094 }
            int r4 = r1.a     // Catch:{ all -> 0x0094 }
            r4 = r4 | r6
            r1.a = r4     // Catch:{ all -> 0x0094 }
            aucd r11 = defpackage.yfd.a(r11)
            boolean r1 = r11.c
            if (r1 != 0) goto L_0x00f0
            goto L_0x00f5
        L_0x00f0:
            r11.c()
            r11.c = r2
        L_0x00f5:
            aucj r1 = r11.b
            avtk r1 = (defpackage.avtk) r1
            aucj r0 = r0.i()
            avtf r0 = (defpackage.avtf) r0
            avtk r2 = defpackage.avtk.k
            r0.getClass()
            r1.i = r0
            int r0 = r1.a
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.a = r0
            aucj r11 = r11.i()
            avtk r11 = (defpackage.avtk) r11
            hol r0 = defpackage.yfd.a()
            byte[] r11 = r11.k()
            hoi r11 = r0.a((byte[]) r11)
            r11.b((int) r5)
            r11.b()
            r2 = r3
        L_0x0125:
            return r2
        L_0x0126:
            aucd r11 = defpackage.yfd.a(r11)
            boolean r3 = r11.c
            if (r3 != 0) goto L_0x012f
            goto L_0x0134
        L_0x012f:
            r11.c()
            r11.c = r2
        L_0x0134:
            aucj r2 = r11.b
            avtk r2 = (defpackage.avtk) r2
            aucj r0 = r0.i()
            avtf r0 = (defpackage.avtf) r0
            avtk r3 = defpackage.avtk.k
            r0.getClass()
            r2.i = r0
            int r0 = r2.a
            r0 = r0 | 128(0x80, float:1.794E-43)
            r2.a = r0
            aucj r11 = r11.i()
            avtk r11 = (defpackage.avtk) r11
            hol r0 = defpackage.yfd.a()
            byte[] r11 = r11.k()
            hoi r11 = r0.a((byte[]) r11)
            r11.b((int) r5)
            r11.b()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.sync.PackageUpdateTaskChimeraService.a(qxz):int");
    }
}
