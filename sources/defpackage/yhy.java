package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: yhy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yhy {
    private static Set a(Collection collection, String str) {
        HashSet hashSet = new HashSet(collection);
        if (!azam.a.a().c()) {
            return hashSet;
        }
        apgj c = ygb.c(str);
        if ((c.a & 1) == 0) {
            String a = ygb.a(str);
            if (!str.equals(a)) {
                c = ygb.c(a);
            }
        }
        if ((c.a & 1) == 0) {
            return hashSet;
        }
        apgi apgi = c.b;
        if (apgi == null) {
            apgi = apgi.c;
        }
        if (apgi.a) {
            return new HashSet(apgi.b);
        }
        hashSet.addAll(apgi.b);
        return hashSet;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.yhx b(android.content.Context r13, defpackage.apgu r14, java.lang.String r15) {
        /*
            a(r14)
            apgk r0 = defpackage.apgk.e
            aucd r0 = r0.o()
            r1 = 5
            java.lang.Object r1 = r14.c(r1)
            aucd r1 = (defpackage.aucd) r1
            r1.a((defpackage.aucj) r14)
            apgq r1 = (defpackage.apgq) r1
            java.lang.String r2 = r14.d
            int r3 = r14.b
            java.lang.String r4 = ""
            r5 = 7
            if (r3 != r5) goto L_0x0023
            java.lang.Object r3 = r14.c
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0024
        L_0x0023:
            r3 = r4
        L_0x0024:
            java.lang.String r3 = defpackage.ygb.a(r2, r3)
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x002f
            goto L_0x0032
        L_0x002f:
            defpackage.yhj.a()
        L_0x0032:
            boolean r2 = r1.c
            r6 = 0
            if (r2 != 0) goto L_0x0038
            goto L_0x003d
        L_0x0038:
            r1.c()
            r1.c = r6
        L_0x003d:
            aucj r2 = r1.b
            apgu r2 = (defpackage.apgu) r2
            apgu r7 = defpackage.apgu.l
            r3.getClass()
            int r7 = r2.a
            r8 = 1
            r7 = r7 | r8
            r2.a = r7
            r2.d = r3
            java.util.HashSet r2 = new java.util.HashSet
            aucx r7 = r14.f
            r2.<init>(r7)
            java.util.Set r7 = a((java.util.Collection) r2, (java.lang.String) r3)
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x0076
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x0064
            goto L_0x0069
        L_0x0064:
            r1.c()
            r1.c = r6
        L_0x0069:
            aucj r2 = r1.b
            apgu r2 = (defpackage.apgu) r2
            aucx r9 = defpackage.aucj.s()
            r2.f = r9
            r1.a((java.lang.Iterable) r7)
        L_0x0076:
            aucj r1 = r1.i()
            apgu r1 = (defpackage.apgu) r1
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x0081
            goto L_0x0086
        L_0x0081:
            r0.c()
            r0.c = r6
        L_0x0086:
            aucj r2 = r0.b
            apgk r2 = (defpackage.apgk) r2
            r1.getClass()
            r2.b = r1
            int r9 = r2.a
            r9 = r9 | r8
            r2.a = r9
            int r2 = r1.j
            int r2 = defpackage.apgt.a(r2)
            r9 = 2
            if (r2 != 0) goto L_0x009e
            goto L_0x00c2
        L_0x009e:
            if (r2 != r9) goto L_0x00c2
            byte[] r2 = a((android.content.Context) r13, (defpackage.apgu) r1)
            if (r2 == 0) goto L_0x00c2
            auay r2 = defpackage.auay.a((byte[]) r2)
            boolean r10 = r0.c
            if (r10 != 0) goto L_0x00af
            goto L_0x00b4
        L_0x00af:
            r0.c()
            r0.c = r6
        L_0x00b4:
            aucj r10 = r0.b
            apgk r10 = (defpackage.apgk) r10
            r2.getClass()
            int r11 = r10.a
            r11 = r11 | r9
            r10.a = r11
            r10.c = r2
        L_0x00c2:
            r2 = 0
            yff r10 = defpackage.yff.REGISTRATION     // Catch:{ FileNotFoundException -> 0x00f1 }
            apgk r11 = defpackage.apgk.e     // Catch:{ FileNotFoundException -> 0x00f1 }
            java.lang.Object r11 = r11.c(r5)     // Catch:{ FileNotFoundException -> 0x00f1 }
            auef r11 = (defpackage.auef) r11     // Catch:{ FileNotFoundException -> 0x00f1 }
            java.io.File r12 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00f1 }
            java.io.File r10 = r10.a(r13)     // Catch:{ FileNotFoundException -> 0x00f1 }
            r12.<init>(r10, r3)     // Catch:{ FileNotFoundException -> 0x00f1 }
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00f1 }
            r10.<init>(r12)     // Catch:{ FileNotFoundException -> 0x00f1 }
            java.lang.Object r11 = r11.a((java.io.InputStream) r10)     // Catch:{ all -> 0x00e7 }
            aucj r11 = (defpackage.aucj) r11     // Catch:{ all -> 0x00e7 }
            r10.close()     // Catch:{ FileNotFoundException -> 0x00f1 }
            apgk r11 = (defpackage.apgk) r11     // Catch:{ FileNotFoundException -> 0x00f1 }
            goto L_0x00f3
        L_0x00e7:
            r11 = move-exception
            r10.close()     // Catch:{ all -> 0x00ec }
            goto L_0x00f0
        L_0x00ec:
            r10 = move-exception
            defpackage.apev.a((java.lang.Throwable) r11, (java.lang.Throwable) r10)     // Catch:{ FileNotFoundException -> 0x00f1 }
        L_0x00f0:
            throw r11     // Catch:{ FileNotFoundException -> 0x00f1 }
        L_0x00f1:
            r10 = move-exception
            r11 = r2
        L_0x00f3:
            if (r11 == 0) goto L_0x0116
            int r10 = r11.a
            r10 = r10 & 4
            if (r10 == 0) goto L_0x0116
            auay r10 = r11.d
            boolean r12 = r0.c
            if (r12 != 0) goto L_0x0102
            goto L_0x0107
        L_0x0102:
            r0.c()
            r0.c = r6
        L_0x0107:
            aucj r6 = r0.b
            apgk r6 = (defpackage.apgk) r6
            r10.getClass()
            int r12 = r6.a
            r12 = r12 | 4
            r6.a = r12
            r6.d = r10
        L_0x0116:
            if (r11 != 0) goto L_0x011a
            goto L_0x018b
        L_0x011a:
            apgu r6 = r11.b
            if (r6 == 0) goto L_0x011f
            goto L_0x0121
        L_0x011f:
            apgu r6 = defpackage.apgu.l
        L_0x0121:
            int r10 = r6.b
            if (r10 != r5) goto L_0x012a
            java.lang.Object r6 = r6.c
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x012b
        L_0x012a:
            r6 = r4
        L_0x012b:
            int r10 = r1.b
            if (r10 != r5) goto L_0x0134
            java.lang.Object r10 = r1.c
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x0135
        L_0x0134:
            r10 = r4
        L_0x0135:
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L_0x018b
            yfy r13 = new yfy
            int r14 = r1.b
            if (r14 != r5) goto L_0x0146
            java.lang.Object r14 = r1.c
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x0147
        L_0x0146:
            r14 = r4
        L_0x0147:
            apgu r15 = r11.b
            if (r15 == 0) goto L_0x014c
            goto L_0x014e
        L_0x014c:
            apgu r15 = defpackage.apgu.l
        L_0x014e:
            int r0 = r15.b
            if (r0 != r5) goto L_0x0158
            java.lang.Object r15 = r15.c
            r4 = r15
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0159
        L_0x0158:
        L_0x0159:
            java.lang.String r15 = java.lang.String.valueOf(r14)
            int r15 = r15.length()
            java.lang.String r0 = java.lang.String.valueOf(r4)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r15 = r15 + 111
            int r15 = r15 + r0
            r1.<init>(r15)
            java.lang.String r15 = "Failed registering with Android package: "
            r1.append(r15)
            r1.append(r14)
            java.lang.String r14 = ". Config package already registered with a different Android package: "
            r1.append(r14)
            r1.append(r4)
            r14 = 29506(0x7342, float:4.1347E-41)
            java.lang.String r15 = r1.toString()
            r13.<init>(r14, r15)
            throw r13
        L_0x018b:
            int r4 = r14.j
            int r4 = defpackage.apgt.a(r4)
            if (r4 != 0) goto L_0x0194
            goto L_0x01ad
        L_0x0194:
            r6 = 3
            if (r4 != r6) goto L_0x01ad
            if (r11 == 0) goto L_0x01ad
            int r4 = r11.a
            r4 = r4 & r9
            if (r4 == 0) goto L_0x01ad
            auay r4 = r11.c
            auay r14 = r14.au()
            boolean r14 = r4.equals(r14)
            if (r14 == 0) goto L_0x01ad
            r5 = 1
            goto L_0x0236
        L_0x01ad:
            aucj r14 = r0.i()
            apgk r14 = (defpackage.apgk) r14
            if (r11 == 0) goto L_0x01bb
            boolean r0 = r11.equals(r14)
            if (r0 != 0) goto L_0x01f2
        L_0x01bb:
            yff r0 = defpackage.yff.REGISTRATION
            java.io.File r0 = r0.a(r13)
            java.io.File r4 = new java.io.File
            r4.<init>(r0, r3)
            boolean r3 = r0.exists()
            if (r3 != 0) goto L_0x01cf
            r0.mkdirs()
        L_0x01cf:
            java.io.File r13 = r13.getCacheDir()
            java.lang.String r0 = "phenotype-"
            java.io.File r13 = java.io.File.createTempFile(r0, r2, r13)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x02a0 }
            r0.<init>(r13)     // Catch:{ IOException -> 0x02a0 }
            r14.a(r0)     // Catch:{ all -> 0x0296 }
            java.io.FileDescriptor r2 = r0.getFD()     // Catch:{ all -> 0x0296 }
            r2.sync()     // Catch:{ all -> 0x0296 }
            r0.close()     // Catch:{ IOException -> 0x02a0 }
            boolean r0 = r13.renameTo(r4)
            if (r0 == 0) goto L_0x0259
        L_0x01f2:
            if (r11 == 0) goto L_0x0231
            apgu r13 = r14.b
            if (r13 == 0) goto L_0x01f9
            goto L_0x01fb
        L_0x01f9:
            apgu r13 = defpackage.apgu.l
        L_0x01fb:
            int r13 = r13.e
            apgu r0 = r11.b
            if (r0 != 0) goto L_0x0203
            apgu r0 = defpackage.apgu.l
        L_0x0203:
            int r0 = r0.e
            if (r13 != r0) goto L_0x0229
            apgu r13 = r14.b
            if (r13 == 0) goto L_0x020c
            goto L_0x020e
        L_0x020c:
            apgu r13 = defpackage.apgu.l
        L_0x020e:
            auay r13 = r13.h
            apgu r14 = r11.b
            if (r14 == 0) goto L_0x0215
            goto L_0x0217
        L_0x0215:
            apgu r14 = defpackage.apgu.l
        L_0x0217:
            auay r14 = r14.h
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x0227
            if (r15 == 0) goto L_0x0224
            r5 = 16
            goto L_0x0236
        L_0x0224:
            r5 = 9
            goto L_0x0236
        L_0x0227:
            r5 = 1
            goto L_0x0236
        L_0x0229:
            if (r15 == 0) goto L_0x022e
            r5 = 15
            goto L_0x0236
        L_0x022e:
            r5 = 8
            goto L_0x0236
        L_0x0231:
            if (r15 != 0) goto L_0x0234
            goto L_0x0236
        L_0x0234:
            r5 = 14
        L_0x0236:
            if (r11 == 0) goto L_0x0247
            java.util.HashSet r13 = new java.util.HashSet
            apgu r14 = r11.b
            if (r14 == 0) goto L_0x023f
            goto L_0x0241
        L_0x023f:
            apgu r14 = defpackage.apgu.l
        L_0x0241:
            aucx r14 = r14.f
            r13.<init>(r14)
            goto L_0x024c
        L_0x0247:
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
        L_0x024c:
            boolean r13 = r13.equals(r7)
            yhx r14 = new yhx
            java.lang.String r15 = r1.d
            r13 = r13 ^ r8
            r14.<init>(r15, r5, r13)
            return r14
        L_0x0259:
            r13.delete()
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r15 = java.lang.String.valueOf(r4)
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r0 = r0.length()
            java.lang.String r1 = java.lang.String.valueOf(r15)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r0 = r0 + 31
            int r0 = r0 + r1
            r2.<init>(r0)
            java.lang.String r0 = "Failed to rename file from "
            r2.append(r0)
            r2.append(r13)
            java.lang.String r13 = " to "
            r2.append(r13)
            r2.append(r15)
            java.lang.String r13 = r2.toString()
            r14.<init>(r13)
            throw r14
        L_0x0296:
            r14 = move-exception
            r0.close()     // Catch:{ all -> 0x029b }
            goto L_0x029f
        L_0x029b:
            r15 = move-exception
            defpackage.apev.a((java.lang.Throwable) r14, (java.lang.Throwable) r15)     // Catch:{ IOException -> 0x02a0 }
        L_0x029f:
            throw r14     // Catch:{ IOException -> 0x02a0 }
        L_0x02a0:
            r14 = move-exception
            r13.delete()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yhy.b(android.content.Context, apgu, java.lang.String):yhx");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x03d7 A[LOOP:2: B:179:0x03cf->B:181:0x03d7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03fa A[LOOP:3: B:183:0x03f4->B:185:0x03fa, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.yhx a(android.content.Context r29, android.database.sqlite.SQLiteDatabase r30, defpackage.apgu r31, java.lang.String r32) {
        /*
            r0 = r30
            r1 = r31
            a(r31)
            java.lang.String r2 = r1.d
            int r3 = r1.b
            r10 = 7
            java.lang.String r9 = ""
            if (r3 != r10) goto L_0x0015
            java.lang.Object r3 = r1.c
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0016
        L_0x0015:
            r3 = r9
        L_0x0016:
            java.lang.String r3 = defpackage.ygb.a(r2, r3)
            boolean r4 = r3.equals(r2)
            if (r4 != 0) goto L_0x0026
            defpackage.yih.b(r0, r2)
            defpackage.yhj.a()
        L_0x0026:
            java.lang.String r2 = r1.d
            boolean r2 = r2.equals(r3)
            r11 = 1
            r12 = 0
            if (r2 == 0) goto L_0x0032
            r13 = r1
            goto L_0x0059
        L_0x0032:
            apgu r2 = defpackage.apgu.l
            aucd r1 = r2.a((defpackage.aucj) r1)
            apgq r1 = (defpackage.apgq) r1
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x003f
            goto L_0x0044
        L_0x003f:
            r1.c()
            r1.c = r12
        L_0x0044:
            aucj r2 = r1.b
            apgu r2 = (defpackage.apgu) r2
            r3.getClass()
            int r4 = r2.a
            r4 = r4 | r11
            r2.a = r4
            r2.d = r3
            aucj r1 = r1.i()
            apgu r1 = (defpackage.apgu) r1
            r13 = r1
        L_0x0059:
            java.lang.String r1 = r13.d
            int r2 = r13.b
            if (r2 != r10) goto L_0x0065
            java.lang.Object r2 = r13.c
            java.lang.String r2 = (java.lang.String) r2
            r14 = r2
            goto L_0x0066
        L_0x0065:
            r14 = r9
        L_0x0066:
            java.lang.String[] r3 = new java.lang.String[r11]
            java.lang.String r15 = "androidPackageName"
            r3[r12] = r15
            java.lang.String[] r5 = new java.lang.String[r11]
            r5[r12] = r1
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r2 = "Packages"
            java.lang.String r4 = "packageName = ?"
            r1 = r30
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)
            int r2 = r1.getCount()     // Catch:{ all -> 0x0444 }
            if (r2 != r11) goto L_0x00c5
            r1.moveToFirst()     // Catch:{ all -> 0x0444 }
            java.lang.String r2 = r1.getString(r12)     // Catch:{ all -> 0x0444 }
            boolean r3 = r14.equals(r2)     // Catch:{ all -> 0x0444 }
            if (r3 == 0) goto L_0x0091
            goto L_0x00c5
        L_0x0091:
            yfy r0 = new yfy     // Catch:{ all -> 0x0444 }
            java.lang.String r3 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0444 }
            int r3 = r3.length()     // Catch:{ all -> 0x0444 }
            int r3 = r3 + 111
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0444 }
            int r4 = r4.length()     // Catch:{ all -> 0x0444 }
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0444 }
            r4.<init>(r3)     // Catch:{ all -> 0x0444 }
            java.lang.String r3 = "Failed registering with Android package: "
            r4.append(r3)     // Catch:{ all -> 0x0444 }
            r4.append(r14)     // Catch:{ all -> 0x0444 }
            java.lang.String r3 = ". Config package already registered with a different Android package: "
            r4.append(r3)     // Catch:{ all -> 0x0444 }
            r4.append(r2)     // Catch:{ all -> 0x0444 }
            r2 = 29506(0x7342, float:4.1347E-41)
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0444 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0444 }
            throw r0     // Catch:{ all -> 0x0444 }
        L_0x00c5:
            if (r1 != 0) goto L_0x00c8
            goto L_0x00cb
        L_0x00c8:
            r1.close()
        L_0x00cb:
            java.lang.String r1 = r13.d
            java.lang.String[] r2 = defpackage.yfr.a
            java.lang.String[] r3 = new java.lang.String[r11]
            java.lang.String r14 = "logSourceName"
            r3[r12] = r14
            java.lang.String[] r5 = new java.lang.String[r11]
            r5[r12] = r1
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r2 = "LogSources"
            java.lang.String r4 = "packageName = ?"
            r1 = r30
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)
            int r2 = r1.getCount()     // Catch:{ all -> 0x0436 }
            java.util.HashSet r8 = defpackage.angm.a((int) r2)     // Catch:{ all -> 0x0436 }
        L_0x00ee:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x0436 }
            if (r2 == 0) goto L_0x00fc
            java.lang.String r2 = r1.getString(r12)     // Catch:{ all -> 0x0436 }
            r8.add(r2)     // Catch:{ all -> 0x0436 }
            goto L_0x00ee
        L_0x00fc:
            if (r1 != 0) goto L_0x00ff
            goto L_0x0102
        L_0x00ff:
            r1.close()
        L_0x0102:
            int r1 = r13.j
            int r1 = defpackage.apgt.a(r1)
            java.lang.String r7 = "packageName"
            java.lang.String r5 = "serializedDeclarativeRegInfo"
            r4 = 3
            r3 = 2
            if (r1 != 0) goto L_0x0116
            r23 = r5
            r10 = r7
            r11 = r8
            goto L_0x0186
        L_0x0116:
            if (r1 != r4) goto L_0x0182
            java.lang.String[] r1 = new java.lang.String[r11]
            r1[r12] = r5
            java.lang.String[] r6 = new java.lang.String[r11]
            java.lang.String r2 = r13.d
            r6[r12] = r2
            r16 = 0
            r17 = 0
            r18 = 0
            java.lang.String r2 = "Packages"
            java.lang.String r19 = "packageName = ?"
            r20 = r1
            r1 = r30
            r10 = 0
            r3 = r20
            r4 = r19
            r23 = r5
            r5 = r6
            r6 = r16
            r10 = r7
            r7 = r17
            r11 = r8
            r8 = r18
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x0174 }
            if (r2 == 0) goto L_0x016e
            byte[] r2 = r1.getBlob(r12)     // Catch:{ all -> 0x0174 }
            if (r2 == 0) goto L_0x016e
            int r3 = r2.length     // Catch:{ all -> 0x0174 }
            if (r3 <= 0) goto L_0x016e
            byte[] r3 = r13.k()     // Catch:{ all -> 0x0174 }
            boolean r2 = java.util.Arrays.equals(r3, r2)     // Catch:{ all -> 0x0174 }
            if (r2 == 0) goto L_0x016e
            if (r1 != 0) goto L_0x0160
            goto L_0x0163
        L_0x0160:
            r1.close()
        L_0x0163:
            java.lang.String r1 = r13.d
            java.util.Set r1 = a((java.util.Collection) r11, (java.lang.String) r1)
            r3 = 1
            r12 = 2
            r15 = 5
            goto L_0x03be
        L_0x016e:
            if (r1 == 0) goto L_0x0186
            r1.close()
            goto L_0x0186
        L_0x0174:
            r0 = move-exception
            r2 = r0
            if (r1 == 0) goto L_0x0181
            r1.close()     // Catch:{ all -> 0x017c }
            goto L_0x0181
        L_0x017c:
            r0 = move-exception
            r1 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r1)
        L_0x0181:
            throw r2
        L_0x0182:
            r23 = r5
            r10 = r7
            r11 = r8
        L_0x0186:
            java.lang.String r1 = r13.d
            aucs r2 = r13.g
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]
            r4[r12] = r1
            java.lang.String r3 = "WeakExperimentIds"
            java.lang.String r5 = "packageName = ?"
            r0.delete(r3, r5, r4)
            if (r2 != 0) goto L_0x0199
            goto L_0x01c3
        L_0x0199:
            int r4 = r2.size()
            r6 = 0
        L_0x019e:
            if (r6 >= r4) goto L_0x01c3
            java.lang.Object r7 = r2.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            android.content.ContentValues r8 = new android.content.ContentValues
            r8.<init>()
            r8.put(r10, r1)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r12 = "experimentId"
            r8.put(r12, r7)
            r7 = 0
            r0.insert(r3, r7, r8)
            int r6 = r6 + 1
            r12 = 0
            goto L_0x019e
        L_0x01c3:
            auay r1 = r13.h
            byte[] r2 = r1.k()
            int r1 = r2.length
            if (r1 == 0) goto L_0x01ce
            r12 = r2
            goto L_0x01cf
        L_0x01ce:
            r12 = 0
        L_0x01cf:
            r8 = 5
            java.lang.String[] r3 = new java.lang.String[r8]
            java.lang.String r7 = "version"
            r1 = 0
            r3[r1] = r7
            java.lang.String r6 = "params"
            r1 = 1
            r3[r1] = r6
            java.lang.String r4 = "dynamicParams"
            r2 = 2
            r3[r2] = r4
            java.lang.String r1 = "weak"
            r8 = 3
            r3[r8] = r1
            r8 = 4
            r31 = r7
            r7 = r23
            r3[r8] = r7
            if (r32 != 0) goto L_0x01f2
            r19 = r9
            goto L_0x01f6
        L_0x01f2:
            java.lang.String r18 = " AND isSynced = 1"
            r19 = r18
        L_0x01f6:
            int r18 = r19.length()
            if (r18 != 0) goto L_0x0203
            java.lang.String r2 = new java.lang.String
            r2.<init>(r5)
            goto L_0x0209
        L_0x0203:
            r2 = r19
            java.lang.String r2 = r5.concat(r2)
        L_0x0209:
            r5 = r2
            r2 = 1
            java.lang.String[] r8 = new java.lang.String[r2]
            java.lang.String r2 = r13.d
            r17 = 0
            r8[r17] = r2
            r19 = 0
            r20 = 0
            r23 = 0
            java.lang.String r2 = "Packages"
            r24 = r1
            r1 = r30
            r25 = r4
            r4 = r5
            r5 = r8
            r8 = r6
            r6 = r19
            r26 = r31
            r27 = r7
            r7 = r20
            r28 = r8
            r19 = r9
            r9 = 3
            r8 = r23
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x0428 }
            if (r2 != 0) goto L_0x0247
            r2 = 0
            r3 = 0
            r5 = 0
            r8 = 2
            r9 = 0
            r18 = 0
            r20 = 0
            goto L_0x0280
        L_0x0247:
            r2 = 0
            int r3 = r1.getInt(r2)     // Catch:{ all -> 0x0428 }
            int r2 = r13.e     // Catch:{ all -> 0x0428 }
            if (r3 != r2) goto L_0x0253
            r2 = 1
            goto L_0x0254
        L_0x0253:
            r2 = 0
        L_0x0254:
            r3 = 1
            byte[] r4 = r1.getBlob(r3)     // Catch:{ all -> 0x0428 }
            boolean r3 = java.util.Arrays.equals(r12, r4)     // Catch:{ all -> 0x0428 }
            r8 = 2
            byte[] r4 = r1.getBlob(r8)     // Catch:{ all -> 0x0428 }
            boolean r5 = r13.i     // Catch:{ all -> 0x0428 }
            int r6 = r1.getInt(r9)     // Catch:{ all -> 0x0428 }
            if (r6 != 0) goto L_0x026d
            r6 = 0
            goto L_0x026e
        L_0x026d:
            r6 = 1
        L_0x026e:
            if (r5 != r6) goto L_0x0272
            r5 = 1
            goto L_0x0273
        L_0x0272:
            r5 = 0
        L_0x0273:
            r6 = 4
            byte[] r6 = r1.getBlob(r6)     // Catch:{ all -> 0x0428 }
            r18 = r3
            r9 = r4
            r20 = 1
            r3 = r2
            r2 = r6
        L_0x0280:
            if (r1 != 0) goto L_0x0283
            goto L_0x0286
        L_0x0283:
            r1.close()
        L_0x0286:
            int r1 = r13.j
            int r1 = defpackage.apgt.a(r1)
            if (r1 != 0) goto L_0x0290
            r1 = 0
            goto L_0x029a
        L_0x0290:
            if (r1 != r8) goto L_0x0299
            r1 = r29
            byte[] r1 = a((android.content.Context) r1, (defpackage.apgu) r13)
            goto L_0x029a
        L_0x0299:
            r1 = 0
        L_0x029a:
            if (r20 != 0) goto L_0x029d
            goto L_0x02af
        L_0x029d:
            if (r3 == 0) goto L_0x02af
            if (r18 == 0) goto L_0x02af
            if (r5 == 0) goto L_0x02af
            boolean r2 = java.util.Arrays.equals(r2, r1)
            if (r2 != 0) goto L_0x02aa
            goto L_0x02af
        L_0x02aa:
            r5 = r26
            r12 = 7
            r15 = 5
            goto L_0x02ff
        L_0x02af:
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.String r4 = r13.d
            r2.put(r10, r4)
            int r4 = r13.e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = r26
            r2.put(r5, r4)
            r4 = r28
            r2.put(r4, r12)
            r4 = r25
            r2.put(r4, r9)
            boolean r4 = r13.i
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = r24
            r2.put(r6, r4)
            int r4 = r13.b
            r12 = 7
            if (r4 != r12) goto L_0x02e3
            java.lang.Object r4 = r13.c
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x02e5
        L_0x02e3:
            r4 = r19
        L_0x02e5:
            r2.put(r15, r4)
            r4 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "isSynced"
            r2.put(r4, r6)
            r4 = r27
            r2.put(r4, r1)
            java.lang.String r1 = "Packages"
            r4 = 0
            r15 = 5
            r0.insertWithOnConflict(r1, r4, r2, r15)
        L_0x02ff:
            if (r3 == 0) goto L_0x0303
            r12 = 2
            goto L_0x0352
        L_0x0303:
            if (r18 != 0) goto L_0x0309
            if (r9 != 0) goto L_0x0309
            r12 = 2
            goto L_0x0352
        L_0x0309:
            if (r32 != 0) goto L_0x0351
            r1 = 1
            java.lang.String[] r3 = new java.lang.String[r1]
            r2 = 0
            r3[r2] = r5
            java.lang.String[] r5 = new java.lang.String[r8]
            java.lang.String r4 = r13.d
            r5[r2] = r4
            int r2 = r13.e
            java.lang.String r2 = java.lang.Integer.toString(r2)
            r5[r1] = r2
            r6 = 0
            r7 = 0
            r19 = 0
            java.lang.String r2 = "ExperimentTokens"
            java.lang.String r4 = "packageName = ? AND version = ?"
            r1 = r30
            r12 = 2
            r8 = r19
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)
            int r2 = r1.getCount()     // Catch:{ all -> 0x0343 }
            if (r2 <= 0) goto L_0x0338
            r2 = 0
            goto L_0x0339
        L_0x0338:
            r2 = 1
        L_0x0339:
            r3 = 1
            r2 = r2 ^ r3
            if (r1 == 0) goto L_0x0340
            r1.close()
        L_0x0340:
            r19 = r2
            goto L_0x0354
        L_0x0343:
            r0 = move-exception
            r2 = r0
            if (r1 == 0) goto L_0x0350
            r1.close()     // Catch:{ all -> 0x034b }
            goto L_0x0350
        L_0x034b:
            r0 = move-exception
            r1 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r1)
        L_0x0350:
            throw r2
        L_0x0351:
            r12 = 2
        L_0x0352:
            r19 = r3
        L_0x0354:
            if (r32 == 0) goto L_0x0392
            r1 = 1
            java.lang.String[] r3 = new java.lang.String[r1]
            java.lang.String r2 = "user"
            r4 = 0
            r3[r4] = r2
            java.lang.String[] r5 = new java.lang.String[r1]
            r5[r4] = r32
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r2 = "RequestTags"
            java.lang.String r4 = "user = ?"
            java.lang.String r21 = "1"
            r1 = r30
            r22 = r9
            r9 = r21
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)
            int r2 = r1.getCount()     // Catch:{ all -> 0x0384 }
            if (r1 != 0) goto L_0x037c
            goto L_0x037f
        L_0x037c:
            r1.close()
        L_0x037f:
            if (r2 != 0) goto L_0x0394
            r1 = 13
            goto L_0x03b4
        L_0x0384:
            r0 = move-exception
            r2 = r0
            if (r1 == 0) goto L_0x0391
            r1.close()     // Catch:{ all -> 0x038c }
            goto L_0x0391
        L_0x038c:
            r0 = move-exception
            r1 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r1)
        L_0x0391:
            throw r2
        L_0x0392:
            r22 = r9
        L_0x0394:
            if (r20 != 0) goto L_0x039d
            if (r32 != 0) goto L_0x039a
            r1 = 7
            goto L_0x03b4
        L_0x039a:
            r1 = 14
            goto L_0x03b4
        L_0x039d:
            if (r19 != 0) goto L_0x03a7
            if (r32 == 0) goto L_0x03a4
            r1 = 15
            goto L_0x03b4
        L_0x03a4:
            r1 = 8
            goto L_0x03b4
        L_0x03a7:
            if (r18 == 0) goto L_0x03ab
        L_0x03a9:
            r1 = 1
            goto L_0x03b4
        L_0x03ab:
            if (r22 != 0) goto L_0x03a9
            if (r32 == 0) goto L_0x03b2
            r1 = 16
            goto L_0x03b4
        L_0x03b2:
            r1 = 9
        L_0x03b4:
            aucx r2 = r13.f
            java.lang.String r3 = r13.d
            java.util.Set r2 = a((java.util.Collection) r2, (java.lang.String) r3)
            r3 = r1
            r1 = r2
        L_0x03be:
            java.lang.String r2 = r13.d
            angk r4 = defpackage.angm.c(r11, r1)
            angk r1 = defpackage.angm.c(r1, r11)
            r5 = r4
            angg r5 = (defpackage.angg) r5
            anhj r5 = r5.iterator()
        L_0x03cf:
            boolean r6 = r5.hasNext()
            java.lang.String r7 = "LogSources"
            if (r6 == 0) goto L_0x03eb
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String[] r8 = new java.lang.String[r12]
            r9 = 0
            r8[r9] = r2
            r11 = 1
            r8[r11] = r6
            java.lang.String r6 = "packageName = ? AND logSourceName = ?"
            r0.delete(r7, r6, r8)
            goto L_0x03cf
        L_0x03eb:
            r9 = 0
            r11 = 1
            r5 = r1
            angg r5 = (defpackage.angg) r5
            anhj r5 = r5.iterator()
        L_0x03f4:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0410
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            android.content.ContentValues r8 = new android.content.ContentValues
            r8.<init>()
            r8.put(r10, r2)
            r8.put(r14, r6)
            r6 = 0
            r0.insertWithOnConflict(r7, r6, r8, r15)
            goto L_0x03f4
        L_0x0410:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x041f
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x041d
            goto L_0x0420
        L_0x041d:
            r11 = 0
            goto L_0x0420
        L_0x041f:
        L_0x0420:
            yhx r0 = new yhx
            java.lang.String r1 = r13.d
            r0.<init>(r1, r3, r11)
            return r0
        L_0x0428:
            r0 = move-exception
            r2 = r0
            if (r1 == 0) goto L_0x0435
            r1.close()     // Catch:{ all -> 0x0430 }
            goto L_0x0435
        L_0x0430:
            r0 = move-exception
            r1 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r1)
        L_0x0435:
            throw r2
        L_0x0436:
            r0 = move-exception
            r2 = r0
            if (r1 == 0) goto L_0x0443
            r1.close()     // Catch:{ all -> 0x043e }
            goto L_0x0443
        L_0x043e:
            r0 = move-exception
            r1 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r1)
        L_0x0443:
            throw r2
        L_0x0444:
            r0 = move-exception
            r2 = r0
            if (r1 == 0) goto L_0x0451
            r1.close()     // Catch:{ all -> 0x044c }
            goto L_0x0451
        L_0x044c:
            r0 = move-exception
            r1 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r1)
        L_0x0451:
            goto L_0x0453
        L_0x0452:
            throw r2
        L_0x0453:
            goto L_0x0452
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yhy.a(android.content.Context, android.database.sqlite.SQLiteDatabase, apgu, java.lang.String):yhx");
    }

    static yhx a(Context context, apgu apgu, String str) {
        yhx b = b(context, apgu, str);
        if (b.b || apgu.i) {
            yhj.a();
        }
        return b;
    }

    /* JADX INFO: finally extract failed */
    static yhx a(Context context, yfw yfw, apgu apgu, String str) {
        if (apgu != null) {
            SQLiteDatabase writableDatabase = yfw.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                yhx a = a(context, writableDatabase, apgu, str);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                if (a.b || apgu.i) {
                    yhj.a();
                }
                return a;
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Null RegistrationInfo");
        }
    }

    private static void a(apgu apgu) {
        String str;
        if (!apgu.d.isEmpty()) {
            aucx aucx = apgu.f;
            int size = aucx.size();
            int i = 0;
            while (i < size) {
                String str2 = (String) aucx.get(i);
                if (str2 != null) {
                    i++;
                    if (str2.isEmpty()) {
                    }
                }
                throw new yfy(29500, "Invalid log source");
            }
            if (!apgu.i && !apgu.g.isEmpty()) {
                throw new yfy(29500, "Experiment ids for weak registration only");
            }
            if (apgu.b == 7) {
                str = (String) apgu.c;
            } else {
                str = "";
            }
            if (!str.isEmpty()) {
                int a = apgt.a(apgu.j);
                if (a == 0 || a == 1) {
                    throw new yfy(29500, "Unknown registration type");
                }
                return;
            }
            throw new yfy(29500, "No Android package");
        }
        throw new yfy(29500, "No package name");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] a(android.content.Context r5, defpackage.apgu r6) {
        /*
            java.lang.String r0 = ""
            agxh r1 = new agxh
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            r1.<init>(r2)
            r2 = 7
            boolean r3 = defpackage.ayzz.b()     // Catch:{ NameNotFoundException -> 0x004d }
            if (r3 != 0) goto L_0x0015
            r3 = 128(0x80, float:1.794E-43)
            goto L_0x0017
        L_0x0015:
            r3 = 132(0x84, float:1.85E-43)
        L_0x0017:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x004d }
            int r4 = r6.b     // Catch:{ NameNotFoundException -> 0x004d }
            if (r4 == r2) goto L_0x0021
            r4 = r0
            goto L_0x0025
        L_0x0021:
            java.lang.Object r4 = r6.c     // Catch:{ NameNotFoundException -> 0x004d }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ NameNotFoundException -> 0x004d }
        L_0x0025:
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r4, r3)     // Catch:{ NameNotFoundException -> 0x004d }
            java.util.List r5 = r1.a((android.content.pm.PackageInfo) r5)     // Catch:{ NameNotFoundException -> 0x004d }
            int r0 = r5.size()
            r1 = 0
        L_0x0032:
            if (r1 >= r0) goto L_0x004b
            java.lang.Object r2 = r5.get(r1)
            apgu r2 = (defpackage.apgu) r2
            int r1 = r1 + 1
            java.lang.String r3 = r2.d
            java.lang.String r4 = r6.d
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0032
            byte[] r5 = r2.k()
            return r5
        L_0x004b:
            r5 = 0
            return r5
        L_0x004d:
            r5 = move-exception
            yfy r1 = new yfy
            int r3 = r6.b
            if (r3 == r2) goto L_0x0055
            goto L_0x005a
        L_0x0055:
            java.lang.Object r6 = r6.c
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
        L_0x005a:
            r6 = 29500(0x733c, float:4.1338E-41)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = " not found!."
            java.lang.String r0 = r0.concat(r2)
            r1.<init>(r6, r0, r5)
            goto L_0x006b
        L_0x006a:
            throw r1
        L_0x006b:
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yhy.a(android.content.Context, apgu):byte[]");
    }
}
