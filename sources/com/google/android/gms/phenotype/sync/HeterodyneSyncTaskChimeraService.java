package com.google.android.gms.phenotype.sync;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import java.io.File;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class HeterodyneSyncTaskChimeraService extends qwf {
    public static final jjg a = jjg.a(iyc.PHENOTYPE);
    public static final yik m = yik.a;
    public Context b;
    public yfg c;
    public yfg d;
    public hol e;
    public hph g;
    public agwa h;
    ygg i;
    public yiz j;
    public yin k;
    public jiq l;
    private yey n;
    private PackageManager o;
    private hya p;
    private agxh q;

    public HeterodyneSyncTaskChimeraService() {
    }

    public static final /* synthetic */ yiu b(Context context) {
        HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService = new HeterodyneSyncTaskChimeraService();
        heterodyneSyncTaskChimeraService.a(context);
        return heterodyneSyncTaskChimeraService.k;
    }

    private final long c() {
        try {
            return new File(this.c.getWritableDatabase().getPath()).length();
        } catch (SQLiteException e2) {
            ygu.a(this.b, getClass().getName(), e2);
            return 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v27, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v29, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v30, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v31, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v32, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r9v17, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02a3 A[Catch:{ SQLiteException -> 0x0368, yfy -> 0x0283, RuntimeException -> 0x024e, all -> 0x0248, all -> 0x0364 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02a4 A[Catch:{ SQLiteException -> 0x0368, yfy -> 0x0283, RuntimeException -> 0x024e, all -> 0x0248, all -> 0x0364 }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x037d A[Catch:{ all -> 0x043e }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x037e A[Catch:{ all -> 0x043e }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0404  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0474  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0491  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x026e A[Catch:{ SQLiteException -> 0x0368, yfy -> 0x0283, RuntimeException -> 0x024e, all -> 0x0248, all -> 0x0364 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x026f A[Catch:{ SQLiteException -> 0x0368, yfy -> 0x0283, RuntimeException -> 0x024e, all -> 0x0248, all -> 0x0364 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r18, java.lang.String r19, defpackage.avta r20, java.lang.String r21) {
        /*
            r17 = this;
            r1 = r17
            r2 = r21
            java.lang.String r3 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r4 = "com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService"
            jiq r0 = r1.l
            long r5 = r0.b()
            avth r0 = defpackage.avth.g
            aucd r7 = r0.o()
            java.lang.String r0 = defpackage.amrk.b(r21)
            java.lang.String r8 = "a"
            boolean r9 = r7.c
            r10 = 0
            if (r9 != 0) goto L_0x0020
            goto L_0x0025
        L_0x0020:
            r7.c()
            r7.c = r10
        L_0x0025:
            aucj r9 = r7.b
            avth r9 = (defpackage.avth) r9
            r0.getClass()
            int r11 = r9.a
            r12 = 1
            r11 = r11 | r12
            r9.a = r11
            r9.b = r0
            jiq r0 = r1.l
            r0.a()
            ygg r0 = r1.i
            r0.b()
            java.lang.String r0 = "b"
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ Exception -> 0x00b9 }
            r9.<init>()     // Catch:{ Exception -> 0x00b9 }
            boolean r11 = defpackage.ayzz.b()     // Catch:{ Exception -> 0x00b9 }
            if (r11 != 0) goto L_0x004e
            r11 = 192(0xc0, float:2.69E-43)
            goto L_0x0050
        L_0x004e:
            r11 = 196(0xc4, float:2.75E-43)
        L_0x0050:
            android.content.pm.PackageManager r13 = r1.o     // Catch:{ Exception -> 0x00b9 }
            java.util.List r11 = r13.getInstalledPackages(r11)     // Catch:{ Exception -> 0x00b9 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ Exception -> 0x00b9 }
        L_0x005a:
            boolean r13 = r11.hasNext()     // Catch:{ Exception -> 0x00b9 }
            if (r13 == 0) goto L_0x007b
            java.lang.Object r13 = r11.next()     // Catch:{ Exception -> 0x00b9 }
            android.content.pm.PackageInfo r13 = (android.content.pm.PackageInfo) r13     // Catch:{ Exception -> 0x00b9 }
            hya r14 = r1.p     // Catch:{ Exception -> 0x00b9 }
            boolean r14 = r14.a((android.content.pm.PackageInfo) r13)     // Catch:{ Exception -> 0x00b9 }
            if (r14 == 0) goto L_0x0078
            agxh r14 = r1.q     // Catch:{ Exception -> 0x00b9 }
            java.util.List r13 = r14.a((android.content.pm.PackageInfo) r13)     // Catch:{ Exception -> 0x00b9 }
            r9.addAll(r13)     // Catch:{ Exception -> 0x00b9 }
            goto L_0x005a
        L_0x0078:
            java.lang.String r13 = r13.packageName     // Catch:{ Exception -> 0x00b9 }
            goto L_0x005a
        L_0x007b:
            boolean r11 = r9.isEmpty()     // Catch:{ Exception -> 0x00b9 }
            if (r11 == 0) goto L_0x0082
            goto L_0x00d2
        L_0x0082:
            yio r11 = new yio     // Catch:{ Exception -> 0x00b9 }
            r11.<init>()     // Catch:{ Exception -> 0x00b9 }
            yhq r13 = new yhq     // Catch:{ Exception -> 0x00b9 }
            apgu[] r14 = new defpackage.apgu[r10]     // Catch:{ Exception -> 0x00b9 }
            java.lang.Object[] r9 = r9.toArray(r14)     // Catch:{ Exception -> 0x00b9 }
            apgu[] r9 = (defpackage.apgu[]) r9     // Catch:{ Exception -> 0x00b9 }
            r13.<init>(r11, r9)     // Catch:{ Exception -> 0x00b9 }
            android.content.Context r9 = r1.b     // Catch:{ Exception -> 0x00b9 }
            yfg r14 = r1.c     // Catch:{ Exception -> 0x00b9 }
            r13.a(r9, r14)     // Catch:{ Exception -> 0x00b9 }
            com.google.android.gms.common.api.Status r9 = r11.a     // Catch:{ Exception -> 0x00b9 }
            boolean r9 = r9.c()     // Catch:{ Exception -> 0x00b9 }
            if (r9 != 0) goto L_0x00d2
            jjg r9 = a     // Catch:{ Exception -> 0x00b9 }
            anie r9 = r9.b()     // Catch:{ Exception -> 0x00b9 }
            anih r9 = (defpackage.anih) r9     // Catch:{ Exception -> 0x00b9 }
            r11 = 394(0x18a, float:5.52E-43)
            anie r0 = r9.a((java.lang.String) r4, (java.lang.String) r0, (int) r11, (java.lang.String) r3)     // Catch:{ Exception -> 0x00b9 }
            anih r0 = (defpackage.anih) r0     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r9 = "Failed to bulk register phenotype registrants"
            r0.a((java.lang.String) r9)     // Catch:{ Exception -> 0x00b9 }
            goto L_0x00d2
        L_0x00b9:
            r0 = move-exception
            jjg r9 = a
            anie r9 = r9.b()
            anih r9 = (defpackage.anih) r9
            r9.a((java.lang.Throwable) r0)
            r0 = 278(0x116, float:3.9E-43)
            anie r0 = r9.a((java.lang.String) r4, (java.lang.String) r8, (int) r0, (java.lang.String) r3)
            anih r0 = (defpackage.anih) r0
            java.lang.String r9 = "Encountered an exception while processing phenotype registration resources: "
            r0.a((java.lang.String) r9)
        L_0x00d2:
            yin r0 = r1.k     // Catch:{ SQLiteException -> 0x0368, yfy -> 0x0283, RuntimeException -> 0x024e, all -> 0x0248 }
            r9 = r18
            r11 = r19
            r13 = r20
            r0.a((int) r9, (java.lang.String) r11, (defpackage.avta) r13)     // Catch:{ SQLiteException -> 0x0245, yfy -> 0x0243, RuntimeException -> 0x0241, all -> 0x023f }
            ayzv r0 = defpackage.ayzv.a     // Catch:{ SQLiteException -> 0x023b, yfy -> 0x0238, RuntimeException -> 0x0235, all -> 0x0231 }
            ayzw r0 = r0.a()     // Catch:{ SQLiteException -> 0x023b, yfy -> 0x0238, RuntimeException -> 0x0235, all -> 0x0231 }
            boolean r0 = r0.g()     // Catch:{ SQLiteException -> 0x023b, yfy -> 0x0238, RuntimeException -> 0x0235, all -> 0x0231 }
            if (r0 == 0) goto L_0x0182
            yfg r0 = r1.c     // Catch:{ SQLiteException -> 0x023b, yfy -> 0x0238, RuntimeException -> 0x0235, all -> 0x0231 }
            android.database.sqlite.SQLiteDatabase r9 = r0.getWritableDatabase()     // Catch:{ SQLiteException -> 0x023b, yfy -> 0x0238, RuntimeException -> 0x0235, all -> 0x0231 }
            r9.beginTransaction()     // Catch:{ SQLiteException -> 0x023b, yfy -> 0x0238, RuntimeException -> 0x0235, all -> 0x0231 }
            java.lang.String r0 = "SELECT packageName, MAX(servingVersion) FROM ExperimentTokens WHERE isCommitted=1 GROUP BY packageName"
            java.lang.String[] r11 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x023b, yfy -> 0x0238, RuntimeException -> 0x0235, all -> 0x0231 }
            android.database.Cursor r11 = r9.rawQuery(r0, r11)     // Catch:{ SQLiteException -> 0x023b, yfy -> 0x0238, RuntimeException -> 0x0235, all -> 0x0231 }
        L_0x00fa:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x0170
            avsv r0 = defpackage.avsv.d     // Catch:{ all -> 0x017a }
            aucd r0 = r0.o()     // Catch:{ all -> 0x017a }
            java.lang.String r14 = r11.getString(r10)     // Catch:{ all -> 0x017a }
            boolean r15 = r0.c     // Catch:{ all -> 0x017a }
            if (r15 != 0) goto L_0x010f
            goto L_0x0114
        L_0x010f:
            r0.c()     // Catch:{ all -> 0x017a }
            r0.c = r10     // Catch:{ all -> 0x017a }
        L_0x0114:
            aucj r15 = r0.b     // Catch:{ all -> 0x017a }
            avsv r15 = (defpackage.avsv) r15     // Catch:{ all -> 0x017a }
            r14.getClass()     // Catch:{ all -> 0x017a }
            int r10 = r15.a     // Catch:{ all -> 0x017a }
            r10 = r10 | r12
            r15.a = r10     // Catch:{ all -> 0x017a }
            r15.b = r14     // Catch:{ all -> 0x017a }
            int r10 = r11.getInt(r12)     // Catch:{ all -> 0x017a }
            long r14 = (long) r10     // Catch:{ all -> 0x017a }
            boolean r10 = r0.c     // Catch:{ all -> 0x017a }
            if (r10 != 0) goto L_0x012c
            goto L_0x0132
        L_0x012c:
            r0.c()     // Catch:{ all -> 0x017a }
            r10 = 0
            r0.c = r10     // Catch:{ all -> 0x017a }
        L_0x0132:
            aucj r10 = r0.b     // Catch:{ all -> 0x017a }
            avsv r10 = (defpackage.avsv) r10     // Catch:{ all -> 0x017a }
            int r12 = r10.a     // Catch:{ all -> 0x017a }
            r16 = 2
            r12 = r12 | 2
            r10.a = r12     // Catch:{ all -> 0x017a }
            r10.c = r14     // Catch:{ all -> 0x017a }
            aucj r0 = r0.i()     // Catch:{ all -> 0x017a }
            avsv r0 = (defpackage.avsv) r0     // Catch:{ all -> 0x017a }
            boolean r10 = r7.c     // Catch:{ all -> 0x017a }
            if (r10 != 0) goto L_0x014b
            goto L_0x0151
        L_0x014b:
            r7.c()     // Catch:{ all -> 0x017a }
            r10 = 0
            r7.c = r10     // Catch:{ all -> 0x017a }
        L_0x0151:
            aucj r10 = r7.b     // Catch:{ all -> 0x017a }
            avth r10 = (defpackage.avth) r10     // Catch:{ all -> 0x017a }
            r0.getClass()     // Catch:{ all -> 0x017a }
            aucx r12 = r10.f     // Catch:{ all -> 0x017a }
            boolean r12 = r12.a()     // Catch:{ all -> 0x017a }
            if (r12 != 0) goto L_0x0168
            aucx r12 = r10.f     // Catch:{ all -> 0x017a }
            aucx r12 = defpackage.aucj.a((defpackage.aucx) r12)     // Catch:{ all -> 0x017a }
            r10.f = r12     // Catch:{ all -> 0x017a }
        L_0x0168:
            aucx r10 = r10.f     // Catch:{ all -> 0x017a }
            r10.add(r0)     // Catch:{ all -> 0x017a }
            r10 = 0
            r12 = 1
            goto L_0x00fa
        L_0x0170:
            r9.setTransactionSuccessful()     // Catch:{ all -> 0x017a }
            r11.close()     // Catch:{ SQLiteException -> 0x023b, yfy -> 0x0238, RuntimeException -> 0x0235, all -> 0x0231 }
            r9.endTransaction()     // Catch:{ SQLiteException -> 0x023b, yfy -> 0x0238, RuntimeException -> 0x0235, all -> 0x0231 }
            goto L_0x0182
        L_0x017a:
            r0 = move-exception
            r11.close()     // Catch:{ SQLiteException -> 0x023b, yfy -> 0x0238, RuntimeException -> 0x0235, all -> 0x0231 }
            r9.endTransaction()     // Catch:{ SQLiteException -> 0x023b, yfy -> 0x0238, RuntimeException -> 0x0235, all -> 0x0231 }
            throw r0     // Catch:{ SQLiteException -> 0x023b, yfy -> 0x0238, RuntimeException -> 0x0235, all -> 0x0231 }
        L_0x0182:
            android.content.Context r0 = r1.b
            r3 = 0
            defpackage.yij.a((android.content.Context) r0, (java.lang.String) r2, (int) r3)
            long r2 = r17.c()
            r8 = 0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0193
            goto L_0x01aa
        L_0x0193:
            boolean r0 = r7.c
            if (r0 != 0) goto L_0x0198
            goto L_0x019e
        L_0x0198:
            r7.c()
            r4 = 0
            r7.c = r4
        L_0x019e:
            aucj r0 = r7.b
            avth r0 = (defpackage.avth) r0
            int r4 = r0.a
            r4 = r4 | 8
            r0.a = r4
            r0.e = r2
        L_0x01aa:
            jiq r0 = r1.l
            long r2 = r0.b()
            long r2 = r2 - r5
            int r0 = (int) r2
            boolean r2 = r7.c
            if (r2 != 0) goto L_0x01b7
            goto L_0x01bd
        L_0x01b7:
            r7.c()
            r2 = 0
            r7.c = r2
        L_0x01bd:
            aucj r2 = r7.b
            avth r2 = (defpackage.avth) r2
            int r3 = r2.a
            r4 = 4
            r3 = r3 | r4
            r2.a = r3
            r2.d = r0
            android.content.Context r0 = r1.b
            aucd r0 = defpackage.yfd.a(r0)
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x01d4
            goto L_0x01da
        L_0x01d4:
            r0.c()
            r2 = 0
            r0.c = r2
        L_0x01da:
            aucj r2 = r0.b
            avtk r2 = (defpackage.avtk) r2
            aucj r3 = r20.i()
            avtd r3 = (defpackage.avtd) r3
            avtk r4 = defpackage.avtk.k
            r3.getClass()
            r2.g = r3
            int r3 = r2.a
            r3 = r3 | 32
            r2.a = r3
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x01f6
            goto L_0x01fc
        L_0x01f6:
            r0.c()
            r2 = 0
            r0.c = r2
        L_0x01fc:
            aucj r2 = r0.b
            avtk r2 = (defpackage.avtk) r2
            aucj r3 = r7.i()
            avth r3 = (defpackage.avth) r3
            r3.getClass()
            r2.h = r3
            int r3 = r2.a
            r3 = r3 | 64
            r2.a = r3
            aucj r0 = r0.i()
            avtk r0 = (defpackage.avtk) r0
            hol r2 = r1.e
            byte[] r0 = r0.k()
            hoi r0 = r2.a((byte[]) r0)
            r2 = 33
            r0.b((int) r2)
            r0.b()
            ygg r0 = r1.i
            r0.a()
            r10 = 0
            goto L_0x043d
        L_0x0231:
            r0 = move-exception
            r15 = 0
            goto L_0x0440
        L_0x0235:
            r0 = move-exception
            r9 = 0
            goto L_0x0252
        L_0x0238:
            r0 = move-exception
            r9 = 0
            goto L_0x0287
        L_0x023b:
            r0 = move-exception
            r3 = 0
            goto L_0x036c
        L_0x023f:
            r0 = move-exception
            goto L_0x024b
        L_0x0241:
            r0 = move-exception
            goto L_0x0251
        L_0x0243:
            r0 = move-exception
            goto L_0x0286
        L_0x0245:
            r0 = move-exception
            goto L_0x036b
        L_0x0248:
            r0 = move-exception
            r13 = r20
        L_0x024b:
            r15 = 2
            goto L_0x0440
        L_0x024e:
            r0 = move-exception
            r13 = r20
        L_0x0251:
            r9 = 2
        L_0x0252:
            jjg r10 = a     // Catch:{ all -> 0x0364 }
            anie r10 = r10.b()     // Catch:{ all -> 0x0364 }
            anih r10 = (defpackage.anih) r10     // Catch:{ all -> 0x0364 }
            r10.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0364 }
            r11 = 296(0x128, float:4.15E-43)
            anie r3 = r10.a((java.lang.String) r4, (java.lang.String) r8, (int) r11, (java.lang.String) r3)     // Catch:{ all -> 0x0364 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0364 }
            java.lang.String r4 = "Unexpected sync task failure"
            r3.a((java.lang.String) r4)     // Catch:{ all -> 0x0364 }
            boolean r3 = r7.c     // Catch:{ all -> 0x0364 }
            if (r3 != 0) goto L_0x026f
            goto L_0x0275
        L_0x026f:
            r7.c()     // Catch:{ all -> 0x0364 }
            r3 = 0
            r7.c = r3     // Catch:{ all -> 0x0364 }
        L_0x0275:
            aucj r3 = r7.b     // Catch:{ all -> 0x0364 }
            avth r3 = (defpackage.avth) r3     // Catch:{ all -> 0x0364 }
            r4 = 3
            r3.c = r4     // Catch:{ all -> 0x0364 }
            int r4 = r3.a     // Catch:{ all -> 0x0364 }
            r8 = 2
            r4 = r4 | r8
            r3.a = r4     // Catch:{ all -> 0x0364 }
            throw r0     // Catch:{ all -> 0x0364 }
        L_0x0283:
            r0 = move-exception
            r13 = r20
        L_0x0286:
            r9 = 2
        L_0x0287:
            jjg r10 = a     // Catch:{ all -> 0x0364 }
            anie r10 = r10.b()     // Catch:{ all -> 0x0364 }
            anih r10 = (defpackage.anih) r10     // Catch:{ all -> 0x0364 }
            r10.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0364 }
            r0 = 292(0x124, float:4.09E-43)
            anie r0 = r10.a((java.lang.String) r4, (java.lang.String) r8, (int) r0, (java.lang.String) r3)     // Catch:{ all -> 0x0364 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0364 }
            java.lang.String r3 = "Sync task failure"
            r0.a((java.lang.String) r3)     // Catch:{ all -> 0x0364 }
            boolean r0 = r7.c     // Catch:{ all -> 0x0364 }
            if (r0 != 0) goto L_0x02a4
            goto L_0x02aa
        L_0x02a4:
            r7.c()     // Catch:{ all -> 0x0364 }
            r3 = 0
            r7.c = r3     // Catch:{ all -> 0x0364 }
        L_0x02aa:
            aucj r0 = r7.b     // Catch:{ all -> 0x0364 }
            avth r0 = (defpackage.avth) r0     // Catch:{ all -> 0x0364 }
            r3 = 2
            r0.c = r3     // Catch:{ all -> 0x0364 }
            int r4 = r0.a     // Catch:{ all -> 0x0364 }
            r3 = r3 | r4
            r0.a = r3     // Catch:{ all -> 0x0364 }
            android.content.Context r0 = r1.b
            defpackage.yij.a((android.content.Context) r0, (java.lang.String) r2, (int) r9)
            long r2 = r17.c()
            r10 = 0
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x02c6
            goto L_0x02dd
        L_0x02c6:
            boolean r0 = r7.c
            if (r0 != 0) goto L_0x02cb
            goto L_0x02d1
        L_0x02cb:
            r7.c()
            r4 = 0
            r7.c = r4
        L_0x02d1:
            aucj r0 = r7.b
            avth r0 = (defpackage.avth) r0
            int r4 = r0.a
            r4 = r4 | 8
            r0.a = r4
            r0.e = r2
        L_0x02dd:
            jiq r0 = r1.l
            long r2 = r0.b()
            long r2 = r2 - r5
            int r0 = (int) r2
            boolean r2 = r7.c
            if (r2 != 0) goto L_0x02ea
            goto L_0x02f0
        L_0x02ea:
            r7.c()
            r2 = 0
            r7.c = r2
        L_0x02f0:
            aucj r2 = r7.b
            avth r2 = (defpackage.avth) r2
            int r3 = r2.a
            r4 = 4
            r3 = r3 | r4
            r2.a = r3
            r2.d = r0
            android.content.Context r0 = r1.b
            aucd r0 = defpackage.yfd.a(r0)
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x0307
            goto L_0x030d
        L_0x0307:
            r0.c()
            r2 = 0
            r0.c = r2
        L_0x030d:
            aucj r2 = r0.b
            avtk r2 = (defpackage.avtk) r2
            aucj r3 = r20.i()
            avtd r3 = (defpackage.avtd) r3
            avtk r4 = defpackage.avtk.k
            r3.getClass()
            r2.g = r3
            int r3 = r2.a
            r3 = r3 | 32
            r2.a = r3
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x0329
            goto L_0x032f
        L_0x0329:
            r0.c()
            r2 = 0
            r0.c = r2
        L_0x032f:
            aucj r2 = r0.b
            avtk r2 = (defpackage.avtk) r2
            aucj r3 = r7.i()
            avth r3 = (defpackage.avth) r3
            r3.getClass()
            r2.h = r3
            int r3 = r2.a
            r3 = r3 | 64
            r2.a = r3
            aucj r0 = r0.i()
            avtk r0 = (defpackage.avtk) r0
            hol r2 = r1.e
            byte[] r0 = r0.k()
            hoi r0 = r2.a((byte[]) r0)
            r2 = 33
            r0.b((int) r2)
            r0.b()
            ygg r0 = r1.i
            r0.a()
            r10 = r9
            goto L_0x043d
        L_0x0364:
            r0 = move-exception
            r15 = r9
            goto L_0x0440
        L_0x0368:
            r0 = move-exception
            r13 = r20
        L_0x036b:
            r3 = 2
        L_0x036c:
            android.content.Context r4 = r1.b     // Catch:{ all -> 0x043e }
            java.lang.Class r8 = r17.getClass()     // Catch:{ all -> 0x043e }
            java.lang.String r8 = r8.getName()     // Catch:{ all -> 0x043e }
            defpackage.ygu.a((android.content.Context) r4, (java.lang.String) r8, (android.database.sqlite.SQLiteException) r0)     // Catch:{ all -> 0x043e }
            boolean r0 = r7.c     // Catch:{ all -> 0x043e }
            if (r0 != 0) goto L_0x037e
            goto L_0x0384
        L_0x037e:
            r7.c()     // Catch:{ all -> 0x043e }
            r4 = 0
            r7.c = r4     // Catch:{ all -> 0x043e }
        L_0x0384:
            aucj r0 = r7.b     // Catch:{ all -> 0x043e }
            avth r0 = (defpackage.avth) r0     // Catch:{ all -> 0x043e }
            r4 = 4
            r0.c = r4     // Catch:{ all -> 0x043e }
            int r4 = r0.a     // Catch:{ all -> 0x043e }
            r8 = 2
            r4 = r4 | r8
            r0.a = r4     // Catch:{ all -> 0x043e }
            android.content.Context r0 = r1.b
            defpackage.yij.a((android.content.Context) r0, (java.lang.String) r2, (int) r3)
            long r8 = r17.c()
            r10 = 0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x03a1
            goto L_0x03b8
        L_0x03a1:
            boolean r0 = r7.c
            if (r0 != 0) goto L_0x03a6
            goto L_0x03ac
        L_0x03a6:
            r7.c()
            r2 = 0
            r7.c = r2
        L_0x03ac:
            aucj r0 = r7.b
            avth r0 = (defpackage.avth) r0
            int r2 = r0.a
            r2 = r2 | 8
            r0.a = r2
            r0.e = r8
        L_0x03b8:
            jiq r0 = r1.l
            long r8 = r0.b()
            long r8 = r8 - r5
            int r0 = (int) r8
            boolean r2 = r7.c
            if (r2 != 0) goto L_0x03c5
            goto L_0x03cb
        L_0x03c5:
            r7.c()
            r2 = 0
            r7.c = r2
        L_0x03cb:
            aucj r2 = r7.b
            avth r2 = (defpackage.avth) r2
            int r4 = r2.a
            r5 = 4
            r4 = r4 | r5
            r2.a = r4
            r2.d = r0
            android.content.Context r0 = r1.b
            aucd r0 = defpackage.yfd.a(r0)
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x03e2
            goto L_0x03e8
        L_0x03e2:
            r0.c()
            r2 = 0
            r0.c = r2
        L_0x03e8:
            aucj r2 = r0.b
            avtk r2 = (defpackage.avtk) r2
            aucj r4 = r20.i()
            avtd r4 = (defpackage.avtd) r4
            avtk r5 = defpackage.avtk.k
            r4.getClass()
            r2.g = r4
            int r4 = r2.a
            r4 = r4 | 32
            r2.a = r4
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x0404
            goto L_0x040a
        L_0x0404:
            r0.c()
            r2 = 0
            r0.c = r2
        L_0x040a:
            aucj r2 = r0.b
            avtk r2 = (defpackage.avtk) r2
            aucj r4 = r7.i()
            avth r4 = (defpackage.avth) r4
            r4.getClass()
            r2.h = r4
            int r4 = r2.a
            r4 = r4 | 64
            r2.a = r4
            aucj r0 = r0.i()
            avtk r0 = (defpackage.avtk) r0
            hol r2 = r1.e
            byte[] r0 = r0.k()
            hoi r0 = r2.a((byte[]) r0)
            r2 = 33
            r0.b((int) r2)
            r0.b()
            ygg r0 = r1.i
            r0.a()
            r10 = r3
        L_0x043d:
            return r10
        L_0x043e:
            r0 = move-exception
            r15 = r3
        L_0x0440:
            android.content.Context r3 = r1.b
            defpackage.yij.a((android.content.Context) r3, (java.lang.String) r2, (int) r15)
            long r2 = r17.c()
            r8 = 0
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0450
            goto L_0x0467
        L_0x0450:
            boolean r4 = r7.c
            if (r4 != 0) goto L_0x0455
            goto L_0x045b
        L_0x0455:
            r7.c()
            r4 = 0
            r7.c = r4
        L_0x045b:
            aucj r4 = r7.b
            avth r4 = (defpackage.avth) r4
            int r8 = r4.a
            r8 = r8 | 8
            r4.a = r8
            r4.e = r2
        L_0x0467:
            jiq r2 = r1.l
            long r2 = r2.b()
            long r2 = r2 - r5
            int r3 = (int) r2
            boolean r2 = r7.c
            if (r2 != 0) goto L_0x0474
            goto L_0x047a
        L_0x0474:
            r7.c()
            r2 = 0
            r7.c = r2
        L_0x047a:
            aucj r2 = r7.b
            avth r2 = (defpackage.avth) r2
            int r4 = r2.a
            r5 = 4
            r4 = r4 | r5
            r2.a = r4
            r2.d = r3
            android.content.Context r2 = r1.b
            aucd r2 = defpackage.yfd.a(r2)
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x0491
            goto L_0x0497
        L_0x0491:
            r2.c()
            r3 = 0
            r2.c = r3
        L_0x0497:
            aucj r3 = r2.b
            avtk r3 = (defpackage.avtk) r3
            aucj r4 = r20.i()
            avtd r4 = (defpackage.avtd) r4
            avtk r5 = defpackage.avtk.k
            r4.getClass()
            r3.g = r4
            int r4 = r3.a
            r4 = r4 | 32
            r3.a = r4
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x04b3
            goto L_0x04b9
        L_0x04b3:
            r2.c()
            r3 = 0
            r2.c = r3
        L_0x04b9:
            aucj r3 = r2.b
            avtk r3 = (defpackage.avtk) r3
            aucj r4 = r7.i()
            avth r4 = (defpackage.avth) r4
            r4.getClass()
            r3.h = r4
            int r4 = r3.a
            r4 = r4 | 64
            r3.a = r4
            aucj r2 = r2.i()
            avtk r2 = (defpackage.avtk) r2
            hol r3 = r1.e
            byte[] r2 = r2.k()
            hoi r2 = r3.a((byte[]) r2)
            r3 = 33
            r2.b((int) r3)
            r2.b()
            ygg r2 = r1.i
            r2.a()
            goto L_0x04ed
        L_0x04ec:
            throw r0
        L_0x04ed:
            goto L_0x04ec
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService.a(int, java.lang.String, avta, java.lang.String):int");
    }

    public final void aH() {
        yij.a((Context) this);
    }

    public final void onCreate() {
        super.onCreate();
        a((Context) this);
    }

    public final void onDestroy() {
        this.g.d();
        this.c.close();
        yfg yfg = this.d;
        if (yfg != null) {
            yfg.close();
        }
        super.onDestroy();
    }

    public HeterodyneSyncTaskChimeraService(yfg yfg, yfg yfg2, agwa agwa, hph hph, Context context, hol hol, yey yey, PackageManager packageManager, hya hya, agxh agxh, jiq jiq) {
        this.c = yfg;
        this.d = yfg2;
        this.h = agwa;
        this.g = hph;
        this.b = context;
        this.e = hol;
        this.n = yey;
        this.o = packageManager;
        this.p = hya;
        this.q = agxh;
        this.l = jiq;
        this.i = new ygg(yey, context);
        this.k = new yin(this);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        int i2;
        ArrayList arrayList = new ArrayList();
        if (!ayzz.b()) {
            i2 = 192;
        } else {
            i2 = 196;
        }
        for (PackageInfo next : this.o.getInstalledPackages(i2)) {
            if (!this.p.a(next)) {
                String str = next.packageName;
            } else {
                arrayList.addAll(this.q.a(next));
            }
        }
        if (!arrayList.isEmpty()) {
            yio yio = new yio();
            new yhq(yio, (apgu[]) arrayList.toArray(new apgu[0])).a(this.b, this.c);
            if (!yio.a.c()) {
                ((anih) ((anih) a.b()).a("com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService", "b", 394, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to bulk register phenotype registrants");
            }
        }
    }

    public final int a(qxz qxz) {
        int i2;
        avta avta = (avta) avtd.h.o();
        Bundle bundle = qxz.b;
        if (bundle != null) {
            i2 = apfn.a(bundle.getInt("fetchReason"));
        } else {
            i2 = 1;
        }
        Bundle bundle2 = qxz.b;
        return a(i2, bundle2 != null ? bundle2.getString("fetchPackage") : null, avta, qxz.a);
    }

    public final void a(Context context) {
        yiz yiz;
        this.b = context;
        this.e = yfd.a();
        this.g = new hph(this.e, "CLEARCUT_LOG_LOSS", 1024);
        this.c = yfg.a(context);
        if (yhe.a()) {
            this.d = yfg.b(context);
        }
        this.h = new yil(context);
        this.n = yef.a(context);
        this.i = new ygg(this.n, context);
        this.o = context.getPackageManager();
        this.p = hya.a(context);
        this.q = new agxh(this.o);
        if (!azaf.a.a().z()) {
            Context context2 = this.b;
            opc opc = new opc(context2, yfi.a(context2), true, hxz.g(this.b) ? opd.PERMIT_ALL : opd.PERMIT_NONE);
            opc.b.setParameter("http.connection.timeout", Integer.valueOf(Math.max((int) azaf.b(), 30000)));
            yiz = new yiv(opc, yiu.e());
        } else {
            yiz = new yix(yiu.e());
        }
        this.j = yiz;
        this.l = jiu.a;
        this.k = new yin(this);
    }
}
