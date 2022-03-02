package defpackage;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;

/* renamed from: pxd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pxd {
    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0bdf  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0be5  */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0c11  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r33, java.io.PrintWriter r34, java.lang.String[] r35, defpackage.osf r36) {
        /*
            r1 = r33
            r2 = r34
            r3 = r35
            r4 = r36
            axsd r5 = defpackage.axsd.a
            axse r5 = r5.a()
            boolean r5 = r5.f()
            if (r5 == 0) goto L_0x0cab
            if (r4 == 0) goto L_0x0cab
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x0045
            int r7 = r3.length
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x001f:
            if (r8 >= r7) goto L_0x0044
            r12 = r3[r8]
            java.lang.String r13 = "native"
            boolean r13 = r12.equals(r13)
            if (r13 == 0) goto L_0x002d
            r9 = 1
            goto L_0x0041
        L_0x002d:
            java.lang.String r13 = "gmsfiles"
            boolean r13 = r12.equals(r13)
            if (r13 == 0) goto L_0x0037
            r10 = 1
            goto L_0x0041
        L_0x0037:
            java.lang.String r13 = "verbose"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0041
            int r11 = r11 + 1
        L_0x0041:
            int r8 = r8 + 1
            goto L_0x001f
        L_0x0044:
            goto L_0x0048
        L_0x0045:
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0048:
            java.lang.Object[] r3 = new java.lang.Object[r5]
            int r7 = defpackage.oyq.a((android.content.Context) r33)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3[r6] = r7
            java.lang.String r7 = "Icing on the Cake with module_version %d\n"
            r2.format(r7, r3)
            r36.e()     // Catch:{ paw -> 0x005d }
            goto L_0x0063
        L_0x005d:
            r0 = move-exception
            java.lang.String r3 = "Error initializing IndexManager for dump."
            defpackage.oso.b(r3)
        L_0x0063:
            boolean r3 = r36.d()
            if (r3 != 0) goto L_0x0072
            java.lang.String r3 = "Init failed"
            r2.println(r3)
            r29 = r10
            goto L_0x0b7b
        L_0x0072:
            android.content.Context r3 = r4.b     // Catch:{ NameNotFoundException -> 0x009d }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x009d }
            android.content.Context r8 = r4.b     // Catch:{ NameNotFoundException -> 0x009d }
            java.lang.String r8 = r8.getPackageName()     // Catch:{ NameNotFoundException -> 0x009d }
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r8, r6)     // Catch:{ NameNotFoundException -> 0x009d }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ NameNotFoundException -> 0x009d }
            int r12 = r3.versionCode     // Catch:{ NameNotFoundException -> 0x009d }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NameNotFoundException -> 0x009d }
            r8[r6] = r12     // Catch:{ NameNotFoundException -> 0x009d }
            java.lang.String r12 = "Apk version code: %d\n"
            r2.format(r12, r8)     // Catch:{ NameNotFoundException -> 0x009d }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ NameNotFoundException -> 0x009d }
            java.lang.String r3 = r3.versionName     // Catch:{ NameNotFoundException -> 0x009d }
            r8[r6] = r3     // Catch:{ NameNotFoundException -> 0x009d }
            java.lang.String r3 = "Apk version name: %s\n"
            r2.format(r3, r8)     // Catch:{ NameNotFoundException -> 0x009d }
            goto L_0x009e
        L_0x009d:
            r0 = move-exception
        L_0x009e:
            java.lang.Object[] r3 = new java.lang.Object[r5]
            prp r8 = r4.g
            int r8 = r8.b()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3[r6] = r8
            java.lang.String r8 = "Version: %d\n"
            r2.format(r8, r3)
            ovk r3 = r4.i
            com.google.android.gms.icing.nativeindex.NativeIndex r8 = r4.n
            double r12 = r8.g()
            java.lang.Object[] r8 = new java.lang.Object[r5]
            int r14 = r3.a((double) r12)
            java.lang.String r14 = defpackage.ovk.a((int) r14)
            r8[r6] = r14
            java.lang.String r14 = "Storage state: %s\n"
            r2.format(r14, r8)
            long r14 = r3.c()
            long r7 = r3.d()
            r3 = 4
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r17 = defpackage.plc.a((long) r14)
            r5[r6] = r17
            java.lang.String r17 = defpackage.plc.a((long) r7)
            r16 = 1
            r5[r16] = r17
            r17 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r19 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r19 > 0) goto L_0x00fa
            double r7 = (double) r7
            double r14 = (double) r14
            java.lang.Double.isNaN(r7)
            java.lang.Double.isNaN(r14)
            double r14 = r7 - r14
            java.lang.Double.isNaN(r7)
            double r14 = r14 / r7
            double r14 = r14 * r17
            goto L_0x00fc
        L_0x00fa:
            r14 = 0
        L_0x00fc:
            java.lang.Double r7 = java.lang.Double.valueOf(r14)
            r8 = 2
            r5[r8] = r7
            double r12 = r12 * r17
            java.lang.Double r7 = java.lang.Double.valueOf(r12)
            r12 = 3
            r5[r12] = r7
            java.lang.String r7 = "Disk usage %s budget %s free frac %.3f%% index free frac %.3f%%\n"
            r2.format(r7, r5)
            com.google.android.gms.icing.nativeindex.NativeIndex r5 = r4.n
            anth r5 = r5.d()
            java.util.Date r7 = new java.util.Date
            ozs r13 = r36.a()
            r14 = r13
            ozq r14 = (defpackage.ozq) r14
            java.lang.Object r14 = r14.a()
            monitor-enter(r14)
            ozq r13 = (defpackage.ozq) r13     // Catch:{ all -> 0x0ca7 }
            paq r13 = r13.b     // Catch:{ all -> 0x0ca7 }
            par r13 = (defpackage.par) r13     // Catch:{ all -> 0x0ca7 }
            android.content.SharedPreferences r13 = r13.a     // Catch:{ all -> 0x0ca7 }
            java.lang.String r15 = "created"
            r17 = r9
            r8 = 0
            long r12 = r13.getLong(r15, r8)     // Catch:{ all -> 0x0ca7 }
            monitor-exit(r14)     // Catch:{ all -> 0x0ca7 }
            r7.<init>(r12)
            com.google.android.gms.icing.nativeindex.NativeIndex r12 = r4.n
            long r13 = r12.b
            byte[] r13 = com.google.android.gms.icing.nativeindex.NativeIndex.nativeGetStatus(r13, r6)
            oti r12 = r12.a((byte[]) r13)
            com.google.android.gms.icing.nativeindex.NativeIndex r13 = r4.n
            long r14 = r13.b
            r3 = 1
            byte[] r14 = com.google.android.gms.icing.nativeindex.NativeIndex.nativeGetStatus(r14, r3)
            oti r3 = r13.a((byte[]) r14)
            java.util.Date r13 = new java.util.Date
            long r14 = r3.a
            r21 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r21
            r13.<init>(r14)
            java.util.Date r14 = new java.util.Date
            prp r15 = r4.g
            long r8 = r15.c()
            r14.<init>(r8)
            java.util.Date r8 = new java.util.Date
            r15 = r7
            long r6 = r3.a
            long r6 = r6 * r21
            r8.<init>(r6)
            java.util.Date r6 = new java.util.Date
            r7 = r10
            long r9 = r5.a
            long r9 = r9 * r21
            r6.<init>(r9)
            java.util.Locale r9 = java.util.Locale.US
            r10 = 2
            java.text.DateFormat r9 = java.text.SimpleDateFormat.getDateTimeInstance(r10, r10, r9)
            r16 = r15
            r10 = 1
            java.lang.Object[] r15 = new java.lang.Object[r10]
            r10 = r16
            java.lang.String r10 = r9.format(r10)
            r22 = 0
            r15[r22] = r10
            java.lang.String r10 = "Created \"%s\"\n"
            r2.format(r10, r15)
            r10 = 1
            java.lang.Object[] r15 = new java.lang.Object[r10]
            java.lang.String r13 = r9.format(r13)
            r15[r22] = r13
            java.lang.String r13 = "Committed \"%s\"\n"
            r2.format(r13, r15)
            java.lang.Object[] r13 = new java.lang.Object[r10]
            java.lang.String r10 = r9.format(r14)
            r13[r22] = r10
            java.lang.String r10 = "Maintained \"%s\"\n"
            r2.format(r10, r13)
            r10 = 2
            java.lang.Object[] r13 = new java.lang.Object[r10]
            java.lang.String r8 = r9.format(r8)
            r13[r22] = r8
            int r8 = r3.c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10 = 1
            r13[r10] = r8
            java.lang.String r8 = "Flushed \"%s\" num docs %d\n"
            r2.format(r8, r13)
            r8 = 3
            java.lang.Object[] r13 = new java.lang.Object[r8]
            java.lang.String r6 = r9.format(r6)
            r13[r22] = r6
            r6 = r9
            int r8 = r5.b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r13[r10] = r8
            int r5 = r5.c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8 = 2
            r13[r8] = r5
            java.lang.String r5 = "Compacted \"%s\" num docs %d err %d\n"
            r2.format(r5, r13)
            r5 = 3
            java.lang.Object[] r8 = new java.lang.Object[r5]
            prp r5 = r4.g
            boolean r5 = r5.e()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r9 = 0
            r8[r9] = r5
            java.util.Date r5 = new java.util.Date
            prp r10 = r4.g
            java.lang.Object r13 = r10.g
            monitor-enter(r13)
            android.content.SharedPreferences r10 = r10.b     // Catch:{ all -> 0x0ca3 }
            java.lang.String r14 = "app-params-last-update"
            r15 = r11
            r21 = r12
            r11 = 0
            long r9 = r10.getLong(r14, r11)     // Catch:{ all -> 0x0ca3 }
            monitor-exit(r13)     // Catch:{ all -> 0x0ca3 }
            r5.<init>(r9)
            java.lang.String r5 = r6.format(r5)
            r6 = 1
            r8[r6] = r5
            prp r5 = r4.g
            java.lang.Object r6 = r5.g
            monitor-enter(r6)
            int r5 = r5.f     // Catch:{ all -> 0x0c9f }
            monitor-exit(r6)     // Catch:{ all -> 0x0c9f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 2
            r8[r6] = r5
            java.lang.String r5 = "App params: %s lu: %s ttl: %d\n"
            r2.format(r5, r8)
            prp r5 = r4.g
            java.lang.Object r8 = r5.g
            monitor-enter(r8)
            android.content.SharedPreferences r5 = r5.b     // Catch:{ all -> 0x0c9b }
            java.lang.String r6 = "app-history-upload-status"
            r9 = 0
            java.lang.String r5 = r5.getString(r6, r9)     // Catch:{ all -> 0x0c9b }
            osy r6 = defpackage.osy.c     // Catch:{ all -> 0x0c9b }
            r10 = 7
            java.lang.Object r6 = r6.c(r10)     // Catch:{ all -> 0x0c9b }
            auef r6 = (defpackage.auef) r6     // Catch:{ all -> 0x0c9b }
            audx r5 = defpackage.plc.a((java.lang.String) r5, (defpackage.auef) r6)     // Catch:{ all -> 0x0c9b }
            osy r5 = (defpackage.osy) r5     // Catch:{ all -> 0x0c9b }
            monitor-exit(r8)     // Catch:{ all -> 0x0c9b }
            r6 = 4
            java.lang.Object[] r8 = new java.lang.Object[r6]
            agvx r6 = defpackage.ozx.Q
            java.lang.Object r6 = r6.c()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x0261
            java.lang.String r6 = "DISABLED "
            goto L_0x0263
        L_0x0261:
            java.lang.String r6 = ""
        L_0x0263:
            r9 = 0
            r8[r9] = r6
            prp r6 = r4.g
            boolean r6 = r6.f()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r13 = 1
            r8[r13] = r6
            long r13 = r5.a
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
            r13 = 2
            r8[r13] = r6
            long r5 = r5.b
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 3
            r8[r6] = r5
            java.lang.String r5 = "App history upl %sp: %s ls: %d/%d\n"
            r2.format(r5, r8)
            java.lang.String r5 = "\nCorpora:"
            r2.println(r5)
            ozs r5 = r36.a()
            r6 = r21
            aucx r6 = r6.b
            aucx r3 = r3.b
            r8 = r5
            ozq r8 = (defpackage.ozq) r8
            java.lang.Object r13 = r8.a()
            monitor-enter(r13)
            r8 = r5
            ozq r8 = (defpackage.ozq) r8     // Catch:{ all -> 0x0c97 }
            java.util.Map r8 = r8.f     // Catch:{ all -> 0x0c97 }
            int r8 = r8.size()     // Catch:{ all -> 0x0c97 }
            if (r8 != 0) goto L_0x02b7
            java.lang.String r3 = "No corpora\n"
            r2.append(r3)     // Catch:{ all -> 0x0c97 }
            r29 = r7
            r28 = r15
            goto L_0x0793
        L_0x02b7:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0c97 }
            ozq r5 = (defpackage.ozq) r5     // Catch:{ all -> 0x0c97 }
            java.util.Map r5 = r5.f     // Catch:{ all -> 0x0c97 }
            java.util.Set r5 = r5.entrySet()     // Catch:{ all -> 0x0c97 }
            r8.<init>(r5)     // Catch:{ all -> 0x0c97 }
            ozh r5 = new ozh     // Catch:{ all -> 0x0c97 }
            r5.<init>()     // Catch:{ all -> 0x0c97 }
            java.util.Collections.sort(r8, r5)     // Catch:{ all -> 0x0c97 }
            java.util.Iterator r5 = r8.iterator()     // Catch:{ all -> 0x0c97 }
        L_0x02d0:
            boolean r8 = r5.hasNext()     // Catch:{ all -> 0x0c97 }
            if (r8 == 0) goto L_0x078f
            java.lang.Object r8 = r5.next()     // Catch:{ all -> 0x0c97 }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ all -> 0x0c97 }
            java.lang.Object r14 = r8.getValue()     // Catch:{ all -> 0x0c97 }
            ota r14 = (defpackage.ota) r14     // Catch:{ all -> 0x0c97 }
            osz r14 = r14.b     // Catch:{ all -> 0x0c97 }
            if (r14 == 0) goto L_0x02e7
            goto L_0x02e9
        L_0x02e7:
            osz r14 = defpackage.osz.s     // Catch:{ all -> 0x0c97 }
        L_0x02e9:
            int r14 = r14.b     // Catch:{ all -> 0x0c97 }
            int r9 = r6.size()     // Catch:{ all -> 0x0c97 }
            if (r14 >= r9) goto L_0x02fa
            java.lang.Object r9 = r6.get(r14)     // Catch:{ all -> 0x0c97 }
            oth r9 = (defpackage.oth) r9     // Catch:{ all -> 0x0c97 }
            long r11 = r9.a     // Catch:{ all -> 0x0c97 }
            goto L_0x02fc
        L_0x02fa:
            r11 = 0
        L_0x02fc:
            int r9 = r3.size()     // Catch:{ all -> 0x0c97 }
            if (r14 >= r9) goto L_0x030d
            java.lang.Object r9 = r3.get(r14)     // Catch:{ all -> 0x0c97 }
            oth r9 = (defpackage.oth) r9     // Catch:{ all -> 0x0c97 }
            r23 = r11
            long r10 = r9.a     // Catch:{ all -> 0x0c97 }
            goto L_0x0311
        L_0x030d:
            r23 = r11
            r10 = 0
        L_0x0311:
            r9 = 2
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch:{ all -> 0x0c97 }
            java.lang.Object r9 = r8.getKey()     // Catch:{ all -> 0x0c97 }
            pao r9 = (defpackage.pao) r9     // Catch:{ all -> 0x0c97 }
            java.lang.String r9 = r9.a()     // Catch:{ all -> 0x0c97 }
            r21 = 0
            r12[r21] = r9     // Catch:{ all -> 0x0c97 }
            java.lang.Object r8 = r8.getValue()     // Catch:{ all -> 0x0c97 }
            ota r8 = (defpackage.ota) r8     // Catch:{ all -> 0x0c97 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c97 }
            r9.<init>()     // Catch:{ all -> 0x0c97 }
            osz r14 = r8.b     // Catch:{ all -> 0x0c97 }
            if (r14 == 0) goto L_0x0332
            goto L_0x0334
        L_0x0332:
            osz r14 = defpackage.osz.s     // Catch:{ all -> 0x0c97 }
        L_0x0334:
            aucx r14 = r14.j     // Catch:{ all -> 0x0c97 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ all -> 0x0c97 }
            r25 = r3
            r3 = 0
        L_0x033d:
            boolean r26 = r14.hasNext()     // Catch:{ all -> 0x0c97 }
            r27 = r5
            if (r26 != 0) goto L_0x065e
            java.lang.String r3 = "Global Search Sections: "
            r9.append(r3)     // Catch:{ all -> 0x0c97 }
            osz r3 = r8.b     // Catch:{ all -> 0x0c97 }
            if (r3 == 0) goto L_0x034f
            goto L_0x0351
        L_0x034f:
            osz r3 = defpackage.osz.s     // Catch:{ all -> 0x0c97 }
        L_0x0351:
            aucx r3 = r3.k     // Catch:{ all -> 0x0c97 }
            int r3 = r3.size()     // Catch:{ all -> 0x0c97 }
            r9.append(r3)     // Catch:{ all -> 0x0c97 }
            java.lang.String r3 = "\n"
            r9.append(r3)     // Catch:{ all -> 0x0c97 }
            osz r3 = r8.b     // Catch:{ all -> 0x0c97 }
            if (r3 == 0) goto L_0x0364
            goto L_0x0366
        L_0x0364:
            osz r3 = defpackage.osz.s     // Catch:{ all -> 0x0c97 }
        L_0x0366:
            aucx r3 = r3.k     // Catch:{ all -> 0x0c97 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0c97 }
        L_0x036c:
            boolean r14 = r3.hasNext()     // Catch:{ all -> 0x0c97 }
            r26 = 8
            if (r14 == 0) goto L_0x047b
            java.lang.Object r14 = r3.next()     // Catch:{ all -> 0x0c97 }
            ovb r14 = (defpackage.ovb) r14     // Catch:{ all -> 0x0c97 }
            java.lang.String r5 = "    "
            r9.append(r5)     // Catch:{ all -> 0x0c97 }
            int r5 = r14.b     // Catch:{ all -> 0x0c97 }
            java.lang.String r5 = defpackage.dtb.a((int) r5)     // Catch:{ all -> 0x0c97 }
            r9.append(r5)     // Catch:{ all -> 0x0c97 }
            java.lang.String r5 = ": 0x"
            r9.append(r5)     // Catch:{ all -> 0x0c97 }
            int r5 = r14.d     // Catch:{ all -> 0x0c97 }
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch:{ all -> 0x0c97 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0c97 }
            r28 = r3
            int r3 = r14.d     // Catch:{ all -> 0x0c97 }
            if (r3 == 0) goto L_0x03a0
            java.lang.String r3 = ""
            goto L_0x03a2
        L_0x03a0:
            java.lang.String r3 = " (template literal)"
        L_0x03a2:
            int r29 = r3.length()     // Catch:{ all -> 0x0c97 }
            if (r29 != 0) goto L_0x03ae
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0c97 }
            r3.<init>(r5)     // Catch:{ all -> 0x0c97 }
            goto L_0x03b2
        L_0x03ae:
            java.lang.String r3 = r5.concat(r3)     // Catch:{ all -> 0x0c97 }
        L_0x03b2:
            r9.append(r3)     // Catch:{ all -> 0x0c97 }
            java.lang.String r3 = " parts: \""
            r9.append(r3)     // Catch:{ all -> 0x0c97 }
            ova r3 = r14.c     // Catch:{ all -> 0x0c97 }
            if (r3 == 0) goto L_0x03bf
            goto L_0x03c1
        L_0x03bf:
            ova r3 = defpackage.ova.b     // Catch:{ all -> 0x0c97 }
        L_0x03c1:
            aucx r3 = r3.a     // Catch:{ all -> 0x0c97 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0c97 }
        L_0x03c7:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0c97 }
            if (r5 == 0) goto L_0x0472
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0c97 }
            ouz r5 = (defpackage.ouz) r5     // Catch:{ all -> 0x0c97 }
            int r14 = r5.a     // Catch:{ all -> 0x0c97 }
            r29 = r14 & 4
            if (r29 == 0) goto L_0x03df
            java.lang.String r5 = "%$bestMatch"
            r9.append(r5)     // Catch:{ all -> 0x0c97 }
            goto L_0x03c7
        L_0x03df:
            r14 = r14 & 2
            if (r14 != 0) goto L_0x0403
            java.lang.String r14 = r5.b     // Catch:{ all -> 0x0c97 }
            boolean r14 = r14.isEmpty()     // Catch:{ all -> 0x0c97 }
            if (r14 != 0) goto L_0x03f1
            java.lang.String r5 = r5.b     // Catch:{ all -> 0x0c97 }
            r9.append(r5)     // Catch:{ all -> 0x0c97 }
            goto L_0x03c7
        L_0x03f1:
            int r5 = r5.a     // Catch:{ all -> 0x0c97 }
            r5 = r5 & 8
            if (r5 == 0) goto L_0x03fd
            java.lang.String r5 = "%$uri"
            r9.append(r5)     // Catch:{ all -> 0x0c97 }
            goto L_0x03c7
        L_0x03fd:
            java.lang.String r5 = "[?unknown template part]"
            r9.append(r5)     // Catch:{ all -> 0x0c97 }
            goto L_0x03c7
        L_0x0403:
            oux r14 = r5.c     // Catch:{ all -> 0x0c97 }
            if (r14 == 0) goto L_0x0408
            goto L_0x040a
        L_0x0408:
            oux r14 = defpackage.oux.f     // Catch:{ all -> 0x0c97 }
        L_0x040a:
            int r14 = r14.b     // Catch:{ all -> 0x0c97 }
            r29 = r3
            osz r3 = r8.b     // Catch:{ all -> 0x0c97 }
            if (r3 == 0) goto L_0x0413
            goto L_0x0415
        L_0x0413:
            osz r3 = defpackage.osz.s     // Catch:{ all -> 0x0c97 }
        L_0x0415:
            aucx r3 = r3.j     // Catch:{ all -> 0x0c97 }
            int r3 = r3.size()     // Catch:{ all -> 0x0c97 }
            if (r14 < r3) goto L_0x044c
            java.lang.String r3 = "[?invalid section ID:"
            r9.append(r3)     // Catch:{ all -> 0x0c97 }
            oux r3 = r5.c     // Catch:{ all -> 0x0c97 }
            if (r3 == 0) goto L_0x0427
            goto L_0x0429
        L_0x0427:
            oux r3 = defpackage.oux.f     // Catch:{ all -> 0x0c97 }
        L_0x0429:
            int r3 = r3.b     // Catch:{ all -> 0x0c97 }
            r9.append(r3)     // Catch:{ all -> 0x0c97 }
            java.lang.String r3 = " (total:"
            r9.append(r3)     // Catch:{ all -> 0x0c97 }
            osz r3 = r8.b     // Catch:{ all -> 0x0c97 }
            if (r3 == 0) goto L_0x0438
            goto L_0x043a
        L_0x0438:
            osz r3 = defpackage.osz.s     // Catch:{ all -> 0x0c97 }
        L_0x043a:
            aucx r3 = r3.j     // Catch:{ all -> 0x0c97 }
            int r3 = r3.size()     // Catch:{ all -> 0x0c97 }
            r9.append(r3)     // Catch:{ all -> 0x0c97 }
            java.lang.String r3 = ")]"
            r9.append(r3)     // Catch:{ all -> 0x0c97 }
            r3 = r29
            goto L_0x03c7
        L_0x044c:
            java.lang.String r3 = "$"
            r9.append(r3)     // Catch:{ all -> 0x0c97 }
            osz r3 = r8.b     // Catch:{ all -> 0x0c97 }
            if (r3 == 0) goto L_0x0456
            goto L_0x0458
        L_0x0456:
            osz r3 = defpackage.osz.s     // Catch:{ all -> 0x0c97 }
        L_0x0458:
            oux r5 = r5.c     // Catch:{ all -> 0x0c97 }
            if (r5 == 0) goto L_0x045d
            goto L_0x045f
        L_0x045d:
            oux r5 = defpackage.oux.f     // Catch:{ all -> 0x0c97 }
        L_0x045f:
            int r5 = r5.b     // Catch:{ all -> 0x0c97 }
            aucx r3 = r3.j     // Catch:{ all -> 0x0c97 }
            java.lang.Object r3 = r3.get(r5)     // Catch:{ all -> 0x0c97 }
            oqy r3 = (defpackage.oqy) r3     // Catch:{ all -> 0x0c97 }
            java.lang.String r3 = r3.b     // Catch:{ all -> 0x0c97 }
            r9.append(r3)     // Catch:{ all -> 0x0c97 }
            r3 = r29
            goto L_0x03c7
        L_0x0472:
            java.lang.String r3 = "\"\n"
            r9.append(r3)     // Catch:{ all -> 0x0c97 }
            r3 = r28
            goto L_0x036c
        L_0x047b:
            java.lang.String r3 = ""
            osz r5 = r8.b     // Catch:{ all -> 0x0c97 }
            if (r5 == 0) goto L_0x0482
            goto L_0x0484
        L_0x0482:
            osz r5 = defpackage.osz.s     // Catch:{ all -> 0x0c97 }
        L_0x0484:
            java.lang.String r5 = r5.p     // Catch:{ all -> 0x0c97 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0c97 }
            if (r5 != 0) goto L_0x04ee
            java.lang.String r3 = android.os.Build.TYPE     // Catch:{ all -> 0x0c97 }
            java.lang.String r5 = "eng"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x0c97 }
            if (r3 != 0) goto L_0x04a5
            java.lang.String r3 = android.os.Build.TYPE     // Catch:{ all -> 0x0c97 }
            java.lang.String r5 = "userdebug"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x0c97 }
            if (r3 != 0) goto L_0x04a5
            java.lang.String r3 = "  account:<redacted>\n"
            r31 = r6
            goto L_0x04f0
        L_0x04a5:
            osz r3 = r8.b     // Catch:{ all -> 0x0c97 }
            if (r3 == 0) goto L_0x04aa
            goto L_0x04ac
        L_0x04aa:
            osz r3 = defpackage.osz.s     // Catch:{ all -> 0x0c97 }
        L_0x04ac:
            java.lang.String r3 = r3.p     // Catch:{ all -> 0x0c97 }
            osz r5 = r8.b     // Catch:{ all -> 0x0c97 }
            if (r5 == 0) goto L_0x04b3
            goto L_0x04b5
        L_0x04b3:
            osz r5 = defpackage.osz.s     // Catch:{ all -> 0x0c97 }
        L_0x04b5:
            java.lang.String r5 = r5.o     // Catch:{ all -> 0x0c97 }
            java.lang.String r28 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0c97 }
            int r28 = r28.length()     // Catch:{ all -> 0x0c97 }
            java.lang.String r29 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0c97 }
            int r29 = r29.length()     // Catch:{ all -> 0x0c97 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c97 }
            r30 = 13
            int r28 = r28 + 13
            r31 = r6
            int r6 = r28 + r29
            r14.<init>(r6)     // Catch:{ all -> 0x0c97 }
            java.lang.String r6 = "  account:"
            r14.append(r6)     // Catch:{ all -> 0x0c97 }
            r14.append(r3)     // Catch:{ all -> 0x0c97 }
            java.lang.String r3 = "("
            r14.append(r3)     // Catch:{ all -> 0x0c97 }
            r14.append(r5)     // Catch:{ all -> 0x0c97 }
            java.lang.String r3 = ")\n"
            r14.append(r3)     // Catch:{ all -> 0x0c97 }
            java.lang.String r3 = r14.toString()     // Catch:{ all -> 0x0c97 }
            goto L_0x04f0
        L_0x04ee:
            r31 = r6
        L_0x04f0:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c97 }
            r5.<init>()     // Catch:{ all -> 0x0c97 }
            otg r6 = r8.c     // Catch:{ all -> 0x0c97 }
            if (r6 == 0) goto L_0x04fa
            goto L_0x04fc
        L_0x04fa:
            otg r6 = defpackage.otg.h     // Catch:{ all -> 0x0c97 }
        L_0x04fc:
            aucx r6 = r6.b     // Catch:{ all -> 0x0c97 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0c97 }
        L_0x0502:
            boolean r14 = r6.hasNext()     // Catch:{ all -> 0x0c97 }
            if (r14 == 0) goto L_0x052c
            java.lang.Object r14 = r6.next()     // Catch:{ all -> 0x0c97 }
            otc r14 = (defpackage.otc) r14     // Catch:{ all -> 0x0c97 }
            r28 = r6
            java.lang.String r6 = "    "
            r5.append(r6)     // Catch:{ all -> 0x0c97 }
            java.lang.String r6 = r14.b     // Catch:{ all -> 0x0c97 }
            r5.append(r6)     // Catch:{ all -> 0x0c97 }
            java.lang.String r6 = ": "
            r5.append(r6)     // Catch:{ all -> 0x0c97 }
            int r6 = r14.c     // Catch:{ all -> 0x0c97 }
            r5.append(r6)     // Catch:{ all -> 0x0c97 }
            r6 = 10
            r5.append(r6)     // Catch:{ all -> 0x0c97 }
            r6 = r28
            goto L_0x0502
        L_0x052c:
            oqx r6 = defpackage.oqx.VARIANT_NICKNAME     // Catch:{ all -> 0x0c97 }
            oqv r6 = defpackage.oqv.TOKENIZER_TEXT     // Catch:{ all -> 0x0c97 }
            otg r6 = r8.c     // Catch:{ all -> 0x0c97 }
            if (r6 == 0) goto L_0x0535
            goto L_0x0537
        L_0x0535:
            otg r6 = defpackage.otg.h     // Catch:{ all -> 0x0c97 }
        L_0x0537:
            int r6 = r6.c     // Catch:{ all -> 0x0c97 }
            int r6 = defpackage.otf.a(r6)     // Catch:{ all -> 0x0c97 }
            if (r6 == 0) goto L_0x0540
            goto L_0x0541
        L_0x0540:
            r6 = 1
        L_0x0541:
            int r6 = r6 + -1
            if (r6 == 0) goto L_0x054e
            r14 = 1
            if (r6 == r14) goto L_0x054b
            java.lang.String r6 = "DELETED"
            goto L_0x0550
        L_0x054b:
            java.lang.String r6 = "LIMBO"
            goto L_0x0550
        L_0x054e:
            java.lang.String r6 = "active"
        L_0x0550:
            java.util.Locale r14 = java.util.Locale.US     // Catch:{ all -> 0x0c97 }
            r28 = r15
            java.lang.String r15 = "  id:%d\n  name:%s\n  version:\"%s\"\n  package:%s\n  uri:%s\n  trimmable:%s\n  state:%s\n  last indexed/committed:%d/%d\n  source:%s\n  sourcedTime:%s\n  usageReportId:%d\n  content incarnation:[%s]\n  type:%s\n  %s  sections:\n%s  counters:\n%s"
            r1 = 17
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0c97 }
            r29 = r7
            osz r7 = r8.b     // Catch:{ all -> 0x0c97 }
            if (r7 == 0) goto L_0x0561
            goto L_0x0563
        L_0x0561:
            osz r7 = defpackage.osz.s     // Catch:{ all -> 0x0c97 }
        L_0x0563:
            int r7 = r7.b     // Catch:{ all -> 0x0c97 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0c97 }
            r22 = 0
            r1[r22] = r7     // Catch:{ all -> 0x0c97 }
            osz r7 = r8.b     // Catch:{ all -> 0x0c97 }
            if (r7 == 0) goto L_0x0572
            goto L_0x0574
        L_0x0572:
            osz r7 = defpackage.osz.s     // Catch:{ all -> 0x0c97 }
        L_0x0574:
            java.lang.String r7 = r7.c     // Catch:{ all -> 0x0c97 }
            r16 = 1
            r1[r16] = r7     // Catch:{ all -> 0x0c97 }
            osz r7 = r8.b     // Catch:{ all -> 0x0c97 }
            if (r7 == 0) goto L_0x057f
            goto L_0x0581
        L_0x057f:
            osz r7 = defpackage.osz.s     // Catch:{ all -> 0x0c97 }
        L_0x0581:
            java.lang.String r7 = r7.d     // Catch:{ all -> 0x0c97 }
            r18 = 2
            r1[r18] = r7     // Catch:{ all -> 0x0c97 }
            osz r7 = r8.b     // Catch:{ all -> 0x0c97 }
            if (r7 == 0) goto L_0x058c
            goto L_0x058e
        L_0x058c:
            osz r7 = defpackage.osz.s     // Catch:{ all -> 0x0c97 }
        L_0x058e:
            java.lang.String r7 = r7.e     // Catch:{ all -> 0x0c97 }
            r19 = 3
            r1[r19] = r7     // Catch:{ all -> 0x0c97 }
            osz r7 = r8.b     // Catch:{ all -> 0x0c97 }
            if (r7 == 0) goto L_0x0599
            goto L_0x059b
        L_0x0599:
            osz r7 = defpackage.osz.s     // Catch:{ all -> 0x0c97 }
        L_0x059b:
            java.lang.String r7 = r7.f     // Catch:{ all -> 0x0c97 }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0c97 }
            if (r7 != 0) goto L_0x05ad
            osz r7 = r8.b     // Catch:{ all -> 0x0c97 }
            if (r7 == 0) goto L_0x05a8
            goto L_0x05aa
        L_0x05a8:
            osz r7 = defpackage.osz.s     // Catch:{ all -> 0x0c97 }
        L_0x05aa:
            java.lang.String r7 = r7.f     // Catch:{ all -> 0x0c97 }
            goto L_0x05af
        L_0x05ad:
            java.lang.String r7 = "(push)"
        L_0x05af:
            r20 = 4
            r1[r20] = r7     // Catch:{ all -> 0x0c97 }
            osz r7 = r8.b     // Catch:{ all -> 0x0c97 }
            if (r7 == 0) goto L_0x05b8
            goto L_0x05ba
        L_0x05b8:
            osz r7 = defpackage.osz.s     // Catch:{ all -> 0x0c97 }
        L_0x05ba:
            r32 = 5
            boolean r7 = r7.g     // Catch:{ all -> 0x0c97 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0c97 }
            r1[r32] = r7     // Catch:{ all -> 0x0c97 }
            r7 = 6
            r1[r7] = r6     // Catch:{ all -> 0x0c97 }
            java.lang.Long r6 = java.lang.Long.valueOf(r23)     // Catch:{ all -> 0x0c97 }
            r7 = 7
            r1[r7] = r6     // Catch:{ all -> 0x0c97 }
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0c97 }
            r1[r26] = r6     // Catch:{ all -> 0x0c97 }
            osz r6 = r8.b     // Catch:{ all -> 0x0c97 }
            if (r6 == 0) goto L_0x05d9
            goto L_0x05db
        L_0x05d9:
            osz r6 = defpackage.osz.s     // Catch:{ all -> 0x0c97 }
        L_0x05db:
            int r6 = r6.l     // Catch:{ all -> 0x0c97 }
            r10 = 9
            java.lang.String r6 = defpackage.ozv.b(r6)     // Catch:{ all -> 0x0c97 }
            r1[r10] = r6     // Catch:{ all -> 0x0c97 }
            java.text.DateFormat r6 = java.text.DateFormat.getInstance()     // Catch:{ all -> 0x0c97 }
            osz r10 = r8.b     // Catch:{ all -> 0x0c97 }
            if (r10 == 0) goto L_0x05ee
            goto L_0x05f0
        L_0x05ee:
            osz r10 = defpackage.osz.s     // Catch:{ all -> 0x0c97 }
        L_0x05f0:
            long r10 = r10.n     // Catch:{ all -> 0x0c97 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0c97 }
            java.lang.String r6 = r6.format(r10)     // Catch:{ all -> 0x0c97 }
            r10 = 10
            r1[r10] = r6     // Catch:{ all -> 0x0c97 }
            osz r6 = r8.b     // Catch:{ all -> 0x0c97 }
            if (r6 == 0) goto L_0x0603
            goto L_0x0605
        L_0x0603:
            osz r6 = defpackage.osz.s     // Catch:{ all -> 0x0c97 }
        L_0x0605:
            r10 = 11
            r21 = r8
            long r7 = r6.i     // Catch:{ all -> 0x0c97 }
            java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0c97 }
            r1[r10] = r6     // Catch:{ all -> 0x0c97 }
            r8 = r21
            otg r6 = r8.c     // Catch:{ all -> 0x0c97 }
            if (r6 == 0) goto L_0x0618
            goto L_0x061a
        L_0x0618:
            otg r6 = defpackage.otg.h     // Catch:{ all -> 0x0c97 }
        L_0x061a:
            r7 = 12
            java.lang.String r6 = r6.g     // Catch:{ all -> 0x0c97 }
            r1[r7] = r6     // Catch:{ all -> 0x0c97 }
            osz r6 = r8.b     // Catch:{ all -> 0x0c97 }
            if (r6 == 0) goto L_0x0625
            goto L_0x0627
        L_0x0625:
            osz r6 = defpackage.osz.s     // Catch:{ all -> 0x0c97 }
        L_0x0627:
            java.lang.String r6 = r6.q     // Catch:{ all -> 0x0c97 }
            r7 = 13
            r1[r7] = r6     // Catch:{ all -> 0x0c97 }
            r6 = 14
            r1[r6] = r3     // Catch:{ all -> 0x0c97 }
            r3 = 15
            java.lang.String r6 = r9.toString()     // Catch:{ all -> 0x0c97 }
            r1[r3] = r6     // Catch:{ all -> 0x0c97 }
            r3 = 16
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0c97 }
            r1[r3] = r5     // Catch:{ all -> 0x0c97 }
            java.lang.String r1 = java.lang.String.format(r14, r15, r1)     // Catch:{ all -> 0x0c97 }
            r3 = 1
            r12[r3] = r1     // Catch:{ all -> 0x0c97 }
            java.lang.String r1 = "%s:\n%s\n"
            r2.format(r1, r12)     // Catch:{ all -> 0x0c97 }
            r1 = r33
            r3 = r25
            r5 = r27
            r15 = r28
            r7 = r29
            r6 = r31
            r10 = 7
            r11 = 0
            goto L_0x02d0
        L_0x065e:
            r31 = r6
            r29 = r7
            r28 = r15
            java.lang.Object r1 = r14.next()     // Catch:{ all -> 0x0c97 }
            oqy r1 = (defpackage.oqy) r1     // Catch:{ all -> 0x0c97 }
            int r5 = r3 + 1
            java.lang.String r6 = "    "
            r9.append(r6)     // Catch:{ all -> 0x0c97 }
            r9.append(r3)     // Catch:{ all -> 0x0c97 }
            r3 = 32
            r9.append(r3)     // Catch:{ all -> 0x0c97 }
            java.lang.String r6 = r1.b     // Catch:{ all -> 0x0c97 }
            r9.append(r6)     // Catch:{ all -> 0x0c97 }
            boolean r6 = r1.c     // Catch:{ all -> 0x0c97 }
            if (r6 != 0) goto L_0x0687
            java.lang.String r6 = "(noindex)"
            r9.append(r6)     // Catch:{ all -> 0x0c97 }
        L_0x0687:
            oqx r6 = defpackage.oqx.VARIANT_NICKNAME     // Catch:{ all -> 0x0c97 }
            oqv r6 = defpackage.oqv.TOKENIZER_TEXT     // Catch:{ all -> 0x0c97 }
            int r6 = r1.d     // Catch:{ all -> 0x0c97 }
            oqv r6 = defpackage.oqv.a(r6)     // Catch:{ all -> 0x0c97 }
            if (r6 != 0) goto L_0x0695
            oqv r6 = defpackage.oqv.TOKENIZER_TEXT     // Catch:{ all -> 0x0c97 }
        L_0x0695:
            int r6 = r6.ordinal()     // Catch:{ all -> 0x0c97 }
            r7 = 41
            if (r6 == 0) goto L_0x06d9
            r15 = 1
            if (r6 == r15) goto L_0x06d4
            r15 = 2
            if (r6 == r15) goto L_0x06ce
            r15 = 3
            if (r6 == r15) goto L_0x06c8
            r15 = 4
            if (r6 == r15) goto L_0x06c2
            java.lang.String r6 = "(unknown: "
            r9.append(r6)     // Catch:{ all -> 0x0c97 }
            int r6 = r1.d     // Catch:{ all -> 0x0c97 }
            oqv r6 = defpackage.oqv.a(r6)     // Catch:{ all -> 0x0c97 }
            if (r6 == 0) goto L_0x06b7
            goto L_0x06b9
        L_0x06b7:
            oqv r6 = defpackage.oqv.TOKENIZER_TEXT     // Catch:{ all -> 0x0c97 }
        L_0x06b9:
            int r6 = r6.g     // Catch:{ all -> 0x0c97 }
            r9.append(r6)     // Catch:{ all -> 0x0c97 }
            r9.append(r7)     // Catch:{ all -> 0x0c97 }
            goto L_0x06d9
        L_0x06c2:
            java.lang.String r6 = "(none)"
            r9.append(r6)     // Catch:{ all -> 0x0c97 }
            goto L_0x06d9
        L_0x06c8:
            java.lang.String r6 = "(url)"
            r9.append(r6)     // Catch:{ all -> 0x0c97 }
            goto L_0x06d9
        L_0x06ce:
            java.lang.String r6 = "(rfc822)"
            r9.append(r6)     // Catch:{ all -> 0x0c97 }
            goto L_0x06d9
        L_0x06d4:
            java.lang.String r6 = "(html)"
            r9.append(r6)     // Catch:{ all -> 0x0c97 }
        L_0x06d9:
            int r6 = r1.e     // Catch:{ all -> 0x0c97 }
            r15 = 1
            if (r6 == r15) goto L_0x06e8
            java.lang.String r6 = " w:"
            r9.append(r6)     // Catch:{ all -> 0x0c97 }
            int r6 = r1.e     // Catch:{ all -> 0x0c97 }
            r9.append(r6)     // Catch:{ all -> 0x0c97 }
        L_0x06e8:
            aucu r6 = new aucu     // Catch:{ all -> 0x0c97 }
            aucs r15 = r1.h     // Catch:{ all -> 0x0c97 }
            auct r7 = defpackage.oqy.i     // Catch:{ all -> 0x0c97 }
            r6.<init>(r15, r7)     // Catch:{ all -> 0x0c97 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0c97 }
            if (r6 != 0) goto L_0x0736
            java.lang.String r6 = " (variants"
            r9.append(r6)     // Catch:{ all -> 0x0c97 }
            aucu r6 = new aucu     // Catch:{ all -> 0x0c97 }
            aucs r7 = r1.h     // Catch:{ all -> 0x0c97 }
            auct r15 = defpackage.oqy.i     // Catch:{ all -> 0x0c97 }
            r6.<init>(r7, r15)     // Catch:{ all -> 0x0c97 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0c97 }
        L_0x0709:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0c97 }
            if (r7 == 0) goto L_0x0730
            java.lang.String r7 = "unknown"
            java.lang.Object r15 = r6.next()     // Catch:{ all -> 0x0c97 }
            oqx r15 = (defpackage.oqx) r15     // Catch:{ all -> 0x0c97 }
            int r15 = r15.ordinal()     // Catch:{ all -> 0x0c97 }
            if (r15 == 0) goto L_0x0724
            r3 = 2
            if (r15 == r3) goto L_0x0721
            goto L_0x0726
        L_0x0721:
            java.lang.String r7 = "annotation"
            goto L_0x0726
        L_0x0724:
            java.lang.String r7 = "nick"
        L_0x0726:
            r3 = 32
            r9.append(r3)     // Catch:{ all -> 0x0c97 }
            r9.append(r7)     // Catch:{ all -> 0x0c97 }
            goto L_0x0709
        L_0x0730:
            r3 = 41
            r9.append(r3)     // Catch:{ all -> 0x0c97 }
        L_0x0736:
            int r3 = r1.o     // Catch:{ all -> 0x0c97 }
            int r3 = defpackage.oqr.a(r3)     // Catch:{ all -> 0x0c97 }
            if (r3 != 0) goto L_0x073f
            goto L_0x076a
        L_0x073f:
            r6 = 1
            if (r3 == r6) goto L_0x076a
            java.lang.String r3 = " (omni "
            r9.append(r3)     // Catch:{ all -> 0x0c97 }
            int r3 = r1.o     // Catch:{ all -> 0x0c97 }
            int r3 = defpackage.oqr.a(r3)     // Catch:{ all -> 0x0c97 }
            if (r3 == 0) goto L_0x0750
            goto L_0x0751
        L_0x0750:
            r3 = 1
        L_0x0751:
            int r3 = r3 + -1
            r6 = 1
            if (r3 == r6) goto L_0x0765
            r6 = 2
            if (r3 == r6) goto L_0x075f
            java.lang.String r3 = "?)"
            r9.append(r3)     // Catch:{ all -> 0x0c97 }
            goto L_0x076a
        L_0x075f:
            java.lang.String r3 = "title)"
            r9.append(r3)     // Catch:{ all -> 0x0c97 }
            goto L_0x076a
        L_0x0765:
            java.lang.String r3 = "url)"
            r9.append(r3)     // Catch:{ all -> 0x0c97 }
        L_0x076a:
            java.lang.String r3 = r1.m     // Catch:{ all -> 0x0c97 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0c97 }
            if (r3 != 0) goto L_0x077c
            java.lang.String r3 = " p:"
            r9.append(r3)     // Catch:{ all -> 0x0c97 }
            java.lang.String r1 = r1.m     // Catch:{ all -> 0x0c97 }
            r9.append(r1)     // Catch:{ all -> 0x0c97 }
        L_0x077c:
            r1 = 10
            r9.append(r1)     // Catch:{ all -> 0x0c97 }
            r1 = r33
            r3 = r5
            r5 = r27
            r15 = r28
            r7 = r29
            r6 = r31
            goto L_0x033d
        L_0x078f:
            r29 = r7
            r28 = r15
        L_0x0793:
            monitor-exit(r13)     // Catch:{ all -> 0x0c97 }
            java.lang.String r1 = "\nInternal Corpora:"
            r2.println(r1)
            android.content.Context r1 = r4.b
            java.lang.String r3 = "Gservices flags:"
            r2.println(r3)
            r3 = 4
            java.lang.Object[] r5 = new java.lang.Object[r3]
            boolean r3 = defpackage.axsd.b()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r6 = 0
            r5[r6] = r3
            agvx r3 = defpackage.ozx.ac
            java.lang.Object r3 = r3.c()
            r6 = 1
            r5[r6] = r3
            agvx r3 = defpackage.ozx.ag
            java.lang.Object r3 = r3.c()
            r6 = 2
            r5[r6] = r3
            agvx r3 = defpackage.ozx.aO
            java.lang.Object r3 = r3.c()
            r6 = 3
            r5[r6] = r3
            java.lang.String r3 = "  disableSMS: %b disableApps: %b disableContacts: %b clearInternalCorporaOnContentIncarnationMismatch: %b\n"
            r2.format(r3, r5)
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]
            agvx r3 = defpackage.ozx.ad
            java.lang.Object r3 = r3.c()
            r6 = 0
            r5[r6] = r3
            java.lang.String r3 = "  Min AGSA version: %d\n"
            r2.format(r3, r5)
            poo r3 = defpackage.poo.c(r1)
            if (r3 == 0) goto L_0x08c1
            poq r5 = r3.a()
            java.lang.String r6 = "SMS:"
            r2.println(r6)
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r6 = 4
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r6 = 0
            r7[r6] = r8
            java.lang.String r8 = "  Db version: %d\n"
            r2.format(r8, r7)
            r7 = 3
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r7 = "sms"
            int r7 = r5.a((java.lang.String) r7, (boolean) r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8[r6] = r7
            java.lang.String r6 = "sms"
            r7 = 1
            int r6 = r5.a((java.lang.String) r6, (boolean) r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8[r7] = r6
            long r6 = r3.b()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 2
            r8[r7] = r6
            java.lang.String r6 = "  total: %d Unread SMS: %d (lastDate: %d)\n"
            r2.format(r6, r8)
            r6 = 3
            java.lang.Object[] r7 = new java.lang.Object[r6]
            pou r6 = r3.f
            android.net.Uri r8 = defpackage.poo.a
            r9 = 0
            int r6 = r6.a(r8, r9)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7[r9] = r6
            pou r6 = r3.f
            android.net.Uri r8 = defpackage.poo.a
            r10 = 1
            int r6 = r6.a(r8, r10)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7[r10] = r6
            pou r6 = r3.f
            android.net.Uri r8 = defpackage.poo.a
            int r6 = r6.b(r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8 = 2
            r7[r8] = r6
            java.lang.String r6 = "  SMS CP stats: total: %d unread: %d lastId: %d\n"
            r2.format(r6, r7)
            r6 = 3
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r6 = "mms"
            r8 = 0
            int r6 = r5.a((java.lang.String) r6, (boolean) r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7[r8] = r6
            java.lang.String r6 = "mms"
            r8 = 1
            int r5 = r5.a((java.lang.String) r6, (boolean) r8)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7[r8] = r5
            long r5 = r3.c()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 2
            r7[r6] = r5
            java.lang.String r5 = "  total: %d Unread MMS: %d (lastDate: %d)\n"
            r2.format(r5, r7)
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            pou r6 = r3.f
            android.net.Uri r7 = defpackage.poo.b
            r8 = 0
            int r6 = r6.a(r7, r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r8] = r6
            pou r6 = r3.f
            android.net.Uri r7 = defpackage.poo.b
            r8 = 1
            int r6 = r6.a(r7, r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r8] = r6
            pou r3 = r3.f
            android.net.Uri r6 = defpackage.poo.b
            int r3 = r3.b(r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 2
            r5[r6] = r3
            java.lang.String r3 = "  MMS CP stats: total: %d unread: %d lastId: %d\n"
            r2.format(r3, r5)
        L_0x08c1:
            plt r1 = defpackage.plt.a((android.content.Context) r1)
            if (r1 == 0) goto L_0x092a
            java.lang.String r3 = "Apps:"
            r2.println(r3)
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r6 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 0
            r5[r7] = r6
            java.lang.String r6 = "  File version: %d\n"
            r2.format(r6, r5)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            long r8 = r1.e()
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            r5[r7] = r3
            java.lang.String r3 = "  Last seqno: %d\n"
            r2.format(r3, r5)
            pnr r1 = r1.b
            java.lang.Object r3 = defpackage.pnr.a
            monitor-enter(r3)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0926 }
            android.content.Context r5 = r1.b     // Catch:{ all -> 0x0926 }
            java.lang.String r7 = r1.c     // Catch:{ all -> 0x0926 }
            java.io.File r5 = r5.getFileStreamPath(r7)     // Catch:{ all -> 0x0926 }
            long r7 = r5.length()     // Catch:{ all -> 0x0926 }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0926 }
            r7 = 0
            r6[r7] = r5     // Catch:{ all -> 0x0926 }
            java.lang.String r5 = "  Size of journal: %d bytes\n"
            r2.format(r5, r6)     // Catch:{ all -> 0x0926 }
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0926 }
            java.util.List r1 = r1.b()     // Catch:{ all -> 0x0926 }
            int r1 = r1.size()     // Catch:{ all -> 0x0926 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0926 }
            r5 = 0
            r6[r5] = r1     // Catch:{ all -> 0x0926 }
            java.lang.String r1 = "  Number of component names: %d\n"
            r2.format(r1, r6)     // Catch:{ all -> 0x0926 }
            monitor-exit(r3)     // Catch:{ all -> 0x0926 }
            goto L_0x092a
        L_0x0926:
            r0 = move-exception
            r1 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x0926 }
            throw r1
        L_0x092a:
            java.lang.String r1 = "\nClientInfo:"
            r2.println(r1)
            ozb r1 = r4.m
            java.lang.Object r3 = r1.b
            monitor-enter(r3)
            java.lang.String r5 = "\nRegistered client info:"
            r2.write(r5)     // Catch:{ all -> 0x0c93 }
            java.util.Map r1 = r1.c     // Catch:{ all -> 0x0c93 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0c93 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0c93 }
        L_0x0944:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x0c93 }
            if (r5 == 0) goto L_0x0a92
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x0c93 }
            oyz r5 = (defpackage.oyz) r5     // Catch:{ all -> 0x0c93 }
            prp r6 = r5.d     // Catch:{ all -> 0x0c93 }
            java.lang.Object r6 = r6.g     // Catch:{ all -> 0x0c93 }
            monitor-enter(r6)     // Catch:{ all -> 0x0c93 }
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x0a8e }
            java.lang.String r7 = r5.b     // Catch:{ all -> 0x0a8e }
            r9 = 0
            r8[r9] = r7     // Catch:{ all -> 0x0a8e }
            java.lang.String r7 = "\nInfo for package %s"
            r2.format(r7, r8)     // Catch:{ all -> 0x0a8e }
            prp r7 = r5.d     // Catch:{ all -> 0x0a8e }
            java.lang.String r8 = r5.b     // Catch:{ all -> 0x0a8e }
            oq r7 = r7.n(r8)     // Catch:{ all -> 0x0a8e }
            r8 = 2
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ all -> 0x0a8e }
            java.lang.Object r8 = r7.a     // Catch:{ all -> 0x0a8e }
            r9 = 0
            r10[r9] = r8     // Catch:{ all -> 0x0a8e }
            java.lang.Object r7 = r7.b     // Catch:{ all -> 0x0a8e }
            r8 = 1
            r10[r8] = r7     // Catch:{ all -> 0x0a8e }
            java.lang.String r7 = "\n  version code: %d cert: %s"
            r2.format(r7, r10)     // Catch:{ all -> 0x0a8e }
            oza r7 = r5.c     // Catch:{ NameNotFoundException -> 0x0994 }
            android.content.pm.PackageManager r7 = r7.c     // Catch:{ NameNotFoundException -> 0x0994 }
            java.lang.String r8 = r5.b     // Catch:{ NameNotFoundException -> 0x0994 }
            r9 = 0
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r8, r9)     // Catch:{ NameNotFoundException -> 0x0994 }
            r8 = 1
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ NameNotFoundException -> 0x0994 }
            java.lang.String r7 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0994 }
            r10[r9] = r7     // Catch:{ NameNotFoundException -> 0x0994 }
            java.lang.String r7 = "\n  version name: %s"
            r2.format(r7, r10)     // Catch:{ NameNotFoundException -> 0x0994 }
            goto L_0x099a
        L_0x0994:
            r0 = move-exception
            java.lang.String r7 = "\n  failed to get package info for this client."
            r2.print(r7)     // Catch:{ all -> 0x0a8e }
        L_0x099a:
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x0a8e }
            prp r7 = r5.d     // Catch:{ all -> 0x0a8e }
            java.lang.String r10 = r5.b     // Catch:{ all -> 0x0a8e }
            java.lang.String r7 = r7.e(r10)     // Catch:{ all -> 0x0a8e }
            r9 = 0
            r8[r9] = r7     // Catch:{ all -> 0x0a8e }
            java.lang.String r7 = "\n  fingerprint: %s"
            r2.format(r7, r8)     // Catch:{ all -> 0x0a8e }
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x0a8e }
            prp r7 = r5.d     // Catch:{ all -> 0x0a8e }
            java.lang.String r10 = r5.b     // Catch:{ all -> 0x0a8e }
            java.lang.String r7 = r7.f(r10)     // Catch:{ all -> 0x0a8e }
            r9 = 0
            r8[r9] = r7     // Catch:{ all -> 0x0a8e }
            java.lang.String r7 = "\n  resource fingerprint: %s"
            r2.format(r7, r8)     // Catch:{ all -> 0x0a8e }
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x0a8e }
            prp r7 = r5.d     // Catch:{ all -> 0x0a8e }
            java.lang.String r10 = r5.b     // Catch:{ all -> 0x0a8e }
            boolean r7 = r7.h(r10)     // Catch:{ all -> 0x0a8e }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0a8e }
            r9 = 0
            r8[r9] = r7     // Catch:{ all -> 0x0a8e }
            java.lang.String r7 = "\n  blocked: %s"
            r2.format(r7, r8)     // Catch:{ all -> 0x0a8e }
            prp r7 = r5.d     // Catch:{ all -> 0x0a8e }
            java.lang.String r8 = r5.b     // Catch:{ all -> 0x0a8e }
            java.lang.Object r10 = r7.g     // Catch:{ all -> 0x0a8e }
            monitor-enter(r10)     // Catch:{ all -> 0x0a8e }
            java.util.Map r7 = r7.e     // Catch:{ all -> 0x0a8a }
            java.lang.Object r7 = r7.get(r8)     // Catch:{ all -> 0x0a8a }
            pqq r7 = (defpackage.pqq) r7     // Catch:{ all -> 0x0a8a }
            monitor-exit(r10)     // Catch:{ all -> 0x0a8a }
            if (r7 == 0) goto L_0x09f5
            boolean r7 = r7.b     // Catch:{ all -> 0x0a8e }
            if (r7 == 0) goto L_0x09f5
            java.lang.String r7 = "\n  ***blacklisted***"
            r8 = 0
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ all -> 0x0a8e }
            r2.format(r7, r10)     // Catch:{ all -> 0x0a8e }
        L_0x09f5:
            boolean r7 = r5.q()     // Catch:{ all -> 0x0a8e }
            if (r7 != 0) goto L_0x09fc
            goto L_0x0a04
        L_0x09fc:
            java.lang.String r7 = "\n  per-acct-template"
            r8 = 0
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ all -> 0x0a8e }
            r2.format(r7, r10)     // Catch:{ all -> 0x0a8e }
        L_0x0a04:
            java.lang.String r7 = "\n  global search info:"
            r2.print(r7)     // Catch:{ all -> 0x0a8e }
            java.lang.String r7 = "\n    sourced at %d %s"
            r8 = 2
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ all -> 0x0a8e }
            prp r8 = r5.d     // Catch:{ all -> 0x0a8e }
            java.lang.String r11 = r5.b     // Catch:{ all -> 0x0a8e }
            long r11 = r8.k(r11)     // Catch:{ all -> 0x0a8e }
            java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0a8e }
            r9 = 0
            r10[r9] = r8     // Catch:{ all -> 0x0a8e }
            prp r8 = r5.d     // Catch:{ all -> 0x0a8e }
            java.lang.String r11 = r5.b     // Catch:{ all -> 0x0a8e }
            int r8 = r8.j(r11)     // Catch:{ all -> 0x0a8e }
            java.lang.String r8 = defpackage.ozv.b(r8)     // Catch:{ all -> 0x0a8e }
            r11 = 1
            r10[r11] = r8     // Catch:{ all -> 0x0a8e }
            r2.format(r7, r10)     // Catch:{ all -> 0x0a8e }
            java.lang.String r7 = "com.google.android.gms"
            java.lang.String r8 = r5.b     // Catch:{ all -> 0x0a8e }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0a8e }
            if (r7 != 0) goto L_0x0a59
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x0a8e }
            prp r7 = r5.d     // Catch:{ all -> 0x0a8e }
            java.lang.String r10 = r5.b     // Catch:{ all -> 0x0a8e }
            com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo r7 = r7.i(r10)     // Catch:{ all -> 0x0a8e }
            r9 = 0
            r8[r9] = r7     // Catch:{ all -> 0x0a8e }
            prp r7 = r5.d     // Catch:{ all -> 0x0a8e }
            java.lang.String r5 = r5.b     // Catch:{ all -> 0x0a8e }
            otn r5 = r7.l(r5)     // Catch:{ all -> 0x0a8e }
            r7 = 1
            r8[r7] = r5     // Catch:{ all -> 0x0a8e }
            java.lang.String r5 = "\n    %s (%s)"
            r2.format(r5, r8)     // Catch:{ all -> 0x0a8e }
            r10 = 2
            goto L_0x0a87
        L_0x0a59:
            prp r7 = r5.d     // Catch:{ all -> 0x0a8e }
            java.util.Set r7 = r7.i()     // Catch:{ all -> 0x0a8e }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0a8e }
        L_0x0a63:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0a8e }
            if (r8 == 0) goto L_0x0a86
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0a8e }
            com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo r8 = (com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo) r8     // Catch:{ all -> 0x0a8e }
            r10 = 2
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ all -> 0x0a8e }
            r9 = 0
            r11[r9] = r8     // Catch:{ all -> 0x0a8e }
            prp r12 = r5.d     // Catch:{ all -> 0x0a8e }
            java.lang.String r8 = r8.b     // Catch:{ all -> 0x0a8e }
            otn r8 = r12.m(r8)     // Catch:{ all -> 0x0a8e }
            r12 = 1
            r11[r12] = r8     // Catch:{ all -> 0x0a8e }
            java.lang.String r8 = "\n    %s (%s)"
            r2.format(r8, r11)     // Catch:{ all -> 0x0a8e }
            goto L_0x0a63
        L_0x0a86:
            r10 = 2
        L_0x0a87:
            monitor-exit(r6)     // Catch:{ all -> 0x0a8e }
            goto L_0x0944
        L_0x0a8a:
            r0 = move-exception
            r1 = r0
            monitor-exit(r10)     // Catch:{ all -> 0x0a8a }
            throw r1     // Catch:{ all -> 0x0a8e }
        L_0x0a8e:
            r0 = move-exception
            r1 = r0
            monitor-exit(r6)     // Catch:{ all -> 0x0a8e }
            throw r1     // Catch:{ all -> 0x0c93 }
        L_0x0a92:
            monitor-exit(r3)     // Catch:{ all -> 0x0c93 }
            java.lang.String r1 = "\nCorpus Usage Stats:"
            r2.println(r1)
            com.google.android.gms.icing.nativeindex.NativeIndex r1 = r4.n
            ove r1 = r1.h()
            if (r1 == 0) goto L_0x0b02
            aucx r1 = r1.a
            int r3 = r1.size()
            r5 = 0
        L_0x0aa7:
            if (r5 >= r3) goto L_0x0b08
            java.lang.Object r6 = r1.get(r5)
            ovd r6 = (defpackage.ovd) r6
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            int r10 = r6.a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9 = 0
            r8[r9] = r10
            java.lang.String r10 = "id: %d\n"
            r2.format(r10, r8)
            java.lang.Object[] r8 = new java.lang.Object[r7]
            int r10 = r6.b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r8[r9] = r10
            java.lang.String r10 = "docs: %d\n"
            r2.format(r10, r8)
            java.lang.Object[] r8 = new java.lang.Object[r7]
            long r10 = r6.d
            java.lang.String r10 = defpackage.plc.a((long) r10)
            r8[r9] = r10
            java.lang.String r10 = "size: %s\n"
            r2.format(r10, r8)
            java.lang.Object[] r8 = new java.lang.Object[r7]
            int r10 = r6.c
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r8[r9] = r10
            java.lang.String r10 = "deleted docs: %d\n"
            r2.format(r10, r8)
            java.lang.Object[] r8 = new java.lang.Object[r7]
            long r6 = r6.e
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r8[r9] = r6
            java.lang.String r6 = "deleted size: %d\n"
            r2.format(r6, r8)
            r34.println()
            int r5 = r5 + 1
            goto L_0x0aa7
        L_0x0b02:
            java.lang.String r1 = "\nError getting usage stats"
            r2.println(r1)
        L_0x0b08:
            if (r17 == 0) goto L_0x0b2d
            java.lang.String r1 = "\nNative Index:"
            r2.println(r1)
            com.google.android.gms.icing.nativeindex.NativeIndex r1 = r4.n
            long r5 = r1.b
            r11 = r28
            byte[] r1 = com.google.android.gms.icing.nativeindex.NativeIndex.nativeGetDebugInfo(r5, r11)
            java.lang.String r3 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0b21 }
            java.lang.String r5 = "UTF-8"
            r3.<init>(r1, r5)     // Catch:{ UnsupportedEncodingException -> 0x0b21 }
            goto L_0x0b2a
        L_0x0b21:
            r0 = move-exception
            r1 = r0
            java.lang.String r3 = "Can't convert byte array to String"
            defpackage.oso.a((java.lang.Throwable) r1, (java.lang.String) r3)
            java.lang.String r3 = ""
        L_0x0b2a:
            r2.println(r3)
        L_0x0b2d:
            pxo r1 = r4.y
            java.lang.Object r4 = r1.a
            monitor-enter(r4)
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x0c8f }
            boolean r3 = r1.b     // Catch:{ all -> 0x0c8f }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0c8f }
            r6 = 0
            r5[r6] = r3     // Catch:{ all -> 0x0c8f }
            java.lang.String r3 = "QueryRecorder recording mode: %s\n"
            r2.format(r3, r5)     // Catch:{ all -> 0x0c8f }
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x0c8f }
            java.io.File r3 = r1.c     // Catch:{ all -> 0x0c8f }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0c8f }
            r6 = 0
            r5[r6] = r3     // Catch:{ all -> 0x0c8f }
            java.lang.String r3 = "Records file path %s\n"
            r2.format(r3, r5)     // Catch:{ all -> 0x0c8f }
            monitor-exit(r4)     // Catch:{ all -> 0x0c8f }
            java.util.List r1 = r1.b()
            if (r1 == 0) goto L_0x0b7b
            java.util.Iterator r1 = r1.iterator()
        L_0x0b5f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0b7b
            java.lang.Object r3 = r1.next()
            oub r3 = (defpackage.oub) r3
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r3 = r3.toString()
            r4 = 0
            r5[r4] = r3
            java.lang.String r3 = "record: {\n%s\n}\n"
            r2.format(r3, r5)
            goto L_0x0b5f
        L_0x0b7b:
            defpackage.ppz.a((java.io.PrintWriter) r34)
            if (r29 == 0) goto L_0x0bf0
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0bcb }
            java.io.File r3 = r33.getFilesDir()     // Catch:{ IOException -> 0x0bcb }
            java.lang.String r3 = r3.getPath()     // Catch:{ IOException -> 0x0bcb }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x0bcb }
            java.lang.String r4 = "/.."
            java.lang.String r3 = r3.concat(r4)     // Catch:{ IOException -> 0x0bcb }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0bcb }
            java.lang.String r1 = r1.getCanonicalPath()     // Catch:{ IOException -> 0x0bcb }
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x0bcb }
            r3 = 0
            r4[r3] = r1     // Catch:{ IOException -> 0x0bcb }
            java.lang.String r3 = "\nGoogle Play Services Files (in %s):\n"
            r2.format(r3, r4)     // Catch:{ IOException -> 0x0bcb }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x0bcb }
            r3.<init>()     // Catch:{ IOException -> 0x0bcb }
            r4 = r33
            a(r4, r3, r1)     // Catch:{ IOException -> 0x0bc9 }
            java.util.Collections.sort(r3)     // Catch:{ IOException -> 0x0bc9 }
            java.util.Iterator r1 = r3.iterator()     // Catch:{ IOException -> 0x0bc9 }
        L_0x0bb7:
            boolean r3 = r1.hasNext()     // Catch:{ IOException -> 0x0bc9 }
            if (r3 != 0) goto L_0x0bbf
            r3 = 0
            goto L_0x0bf3
        L_0x0bbf:
            java.lang.Object r3 = r1.next()     // Catch:{ IOException -> 0x0bc9 }
            pxc r3 = (defpackage.pxc) r3     // Catch:{ IOException -> 0x0bc9 }
            r2.println(r3)     // Catch:{ IOException -> 0x0bc9 }
            goto L_0x0bb7
        L_0x0bc9:
            r0 = move-exception
            goto L_0x0bce
        L_0x0bcb:
            r0 = move-exception
            r4 = r33
        L_0x0bce:
            r1 = r0
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "\nError getting path of package directory: "
            int r5 = r1.length()
            if (r5 != 0) goto L_0x0be5
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
            goto L_0x0be9
        L_0x0be5:
            java.lang.String r1 = r3.concat(r1)
        L_0x0be9:
            r3 = 0
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r2.format(r1, r5)
            goto L_0x0bf3
        L_0x0bf0:
            r4 = r33
            r3 = 0
        L_0x0bf3:
            defpackage.ovw.a((java.io.PrintWriter) r2, (android.content.Context) r4)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r3 = "\n\nFeatures:\n"
            r2.format(r3, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Class<pba> r4 = defpackage.pba.class
            java.lang.reflect.Method[] r4 = r4.getDeclaredMethods()
            int r5 = r4.length
            r6 = 0
        L_0x0c0f:
            if (r6 >= r5) goto L_0x0c7a
            r7 = r4[r6]
            r8 = 1
            r7.setAccessible(r8)
            r8 = 0
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0c3d }
            r8 = 0
            java.lang.Object r10 = r7.invoke(r8, r10)     // Catch:{ Exception -> 0x0c3b }
            boolean r11 = r10 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x0c3b }
            if (r11 == 0) goto L_0x0c77
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ Exception -> 0x0c3b }
            boolean r10 = r10.booleanValue()     // Catch:{ Exception -> 0x0c3b }
            if (r10 != 0) goto L_0x0c33
            java.lang.String r10 = r7.getName()     // Catch:{ Exception -> 0x0c3b }
            r3.add(r10)     // Catch:{ Exception -> 0x0c3b }
            goto L_0x0c77
        L_0x0c33:
            java.lang.String r10 = r7.getName()     // Catch:{ Exception -> 0x0c3b }
            r1.add(r10)     // Catch:{ Exception -> 0x0c3b }
            goto L_0x0c77
        L_0x0c3b:
            r0 = move-exception
            goto L_0x0c3f
        L_0x0c3d:
            r0 = move-exception
            r8 = 0
        L_0x0c3f:
            r10 = r0
            java.lang.String r7 = r7.getName()
            java.lang.String r10 = r10.getMessage()
            java.lang.String r11 = java.lang.String.valueOf(r7)
            int r11 = r11.length()
            java.lang.String r12 = java.lang.String.valueOf(r10)
            int r12 = r12.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r11 = r11 + 24
            int r11 = r11 + r12
            r13.<init>(r11)
            java.lang.String r11 = "Error accessing method "
            r13.append(r11)
            r13.append(r7)
            java.lang.String r7 = "."
            r13.append(r7)
            r13.append(r10)
            java.lang.String r7 = r13.toString()
            defpackage.oso.b(r7)
        L_0x0c77:
            int r6 = r6 + 1
            goto L_0x0c0f
        L_0x0c7a:
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r5[r6] = r1
            java.lang.String r1 = "Enabled: %s\n\n"
            r2.format(r1, r5)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r6] = r3
            java.lang.String r3 = "Disabled: %s\n\n"
            r2.format(r3, r1)
            return
        L_0x0c8f:
            r0 = move-exception
            r1 = r0
            monitor-exit(r4)     // Catch:{ all -> 0x0c8f }
            throw r1
        L_0x0c93:
            r0 = move-exception
            r1 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x0c93 }
            throw r1
        L_0x0c97:
            r0 = move-exception
            r1 = r0
            monitor-exit(r13)     // Catch:{ all -> 0x0c97 }
            throw r1
        L_0x0c9b:
            r0 = move-exception
            r1 = r0
            monitor-exit(r8)     // Catch:{ all -> 0x0c9b }
            throw r1
        L_0x0c9f:
            r0 = move-exception
            r1 = r0
            monitor-exit(r6)     // Catch:{ all -> 0x0c9f }
            throw r1
        L_0x0ca3:
            r0 = move-exception
            r1 = r0
            monitor-exit(r13)     // Catch:{ all -> 0x0ca3 }
            throw r1
        L_0x0ca7:
            r0 = move-exception
            r1 = r0
            monitor-exit(r14)     // Catch:{ all -> 0x0ca7 }
            throw r1
        L_0x0cab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pxd.a(android.content.Context, java.io.PrintWriter, java.lang.String[], osf):void");
    }

    private static void a(Context context, ArrayList arrayList, String str) {
        for (String str2 : new File(str).list()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
            sb.append(str);
            sb.append("/");
            sb.append(str2);
            String sb2 = sb.toString();
            File file = new File(sb2);
            if (file.isFile()) {
                arrayList.add(new pxc(context, sb2, "FILE", Long.valueOf(file.length())));
            } else if (file.isDirectory()) {
                arrayList.add(new pxc(context, sb2, "DIR", Long.valueOf(file.length())));
                a(context, arrayList, sb2);
            } else {
                String valueOf = String.valueOf(sb2);
                oso.a(valueOf.length() == 0 ? new String("Unknown type of file: ") : "Unknown type of file: ".concat(valueOf));
            }
        }
    }
}
