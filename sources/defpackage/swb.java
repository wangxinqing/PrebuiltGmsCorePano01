package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;

/* renamed from: swb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class swb implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ suf b;

    public swb(suf suf, AppMetadata appMetadata) {
        this.b = suf;
        this.a = appMetadata;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r37 = this;
            r1 = r37
            java.lang.String r2 = "Unknown"
            java.lang.String r0 = "app_id=?"
            suf r3 = r1.b
            sze r3 = r3.a
            r3.y()
            suf r3 = r1.b
            sze r3 = r3.a
            com.google.android.gms.measurement.internal.AppMetadata r4 = r1.a
            java.util.List r5 = r3.n
            if (r5 == 0) goto L_0x0025
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r3.o = r5
            java.util.List r5 = r3.o
            java.util.List r6 = r3.n
            r5.addAll(r6)
        L_0x0025:
            spj r5 = r3.h()
            java.lang.String r6 = r4.a
            defpackage.iva.c(r6)
            r5.h()
            r5.q()
            r7 = 0
            android.database.sqlite.SQLiteDatabase r8 = r5.e()     // Catch:{ SQLiteException -> 0x008f }
            r9 = 1
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x008f }
            r9[r7] = r6     // Catch:{ SQLiteException -> 0x008f }
            java.lang.String r10 = "apps"
            int r10 = r8.delete(r10, r0, r9)     // Catch:{ SQLiteException -> 0x008f }
            java.lang.String r11 = "events"
            int r11 = r8.delete(r11, r0, r9)     // Catch:{ SQLiteException -> 0x008f }
            int r10 = r10 + r11
            java.lang.String r11 = "user_attributes"
            int r11 = r8.delete(r11, r0, r9)     // Catch:{ SQLiteException -> 0x008f }
            int r10 = r10 + r11
            java.lang.String r11 = "conditional_properties"
            int r11 = r8.delete(r11, r0, r9)     // Catch:{ SQLiteException -> 0x008f }
            int r10 = r10 + r11
            java.lang.String r11 = "raw_events"
            int r11 = r8.delete(r11, r0, r9)     // Catch:{ SQLiteException -> 0x008f }
            int r10 = r10 + r11
            java.lang.String r11 = "raw_events_metadata"
            int r11 = r8.delete(r11, r0, r9)     // Catch:{ SQLiteException -> 0x008f }
            int r10 = r10 + r11
            java.lang.String r11 = "queue"
            int r11 = r8.delete(r11, r0, r9)     // Catch:{ SQLiteException -> 0x008f }
            int r10 = r10 + r11
            java.lang.String r11 = "audience_filter_values"
            int r11 = r8.delete(r11, r0, r9)     // Catch:{ SQLiteException -> 0x008f }
            int r10 = r10 + r11
            java.lang.String r11 = "main_event_params"
            int r0 = r8.delete(r11, r0, r9)     // Catch:{ SQLiteException -> 0x008f }
            int r10 = r10 + r0
            if (r10 > 0) goto L_0x007f
            goto L_0x009f
        L_0x007f:
            sut r0 = r5.E()     // Catch:{ SQLiteException -> 0x008f }
            sur r0 = r0.k     // Catch:{ SQLiteException -> 0x008f }
            java.lang.String r8 = "Reset analytics data. app, records"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)     // Catch:{ SQLiteException -> 0x008f }
            r0.a(r8, r6, r9)     // Catch:{ SQLiteException -> 0x008f }
            goto L_0x009f
        L_0x008f:
            r0 = move-exception
            sut r5 = r5.E()
            sur r5 = r5.c
            java.lang.Object r6 = defpackage.sut.a((java.lang.String) r6)
            java.lang.String r8 = "Error resetting analytics data. appId, error"
            r5.a(r8, r6, r0)
        L_0x009f:
            ayjf r0 = defpackage.ayjf.a
            ayjg r0 = r0.a()
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x00c0
            spg r0 = r3.d()
            suc r5 = defpackage.sud.az
            boolean r0 = r0.a((defpackage.suc) r5)
            if (r0 != 0) goto L_0x00b8
            goto L_0x00c0
        L_0x00b8:
            boolean r0 = r4.h
            if (r0 == 0) goto L_0x0190
            r3.a((com.google.android.gms.measurement.internal.AppMetadata) r4)
            return
        L_0x00c0:
            android.content.Context r5 = r3.n()
            java.lang.String r9 = r4.a
            java.lang.String r10 = r4.b
            boolean r6 = r4.h
            boolean r14 = r4.o
            boolean r11 = r4.p
            long r12 = r4.m
            java.lang.String r15 = r4.r
            java.lang.String r0 = r4.v
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            if (r0 != 0) goto L_0x00e8
            sut r0 = r3.E()
            sur r0 = r0.c
            java.lang.String r2 = "PackageManager is null, can not log app install information"
            r0.a(r2)
            r8 = 0
            goto L_0x0189
        L_0x00e8:
            java.lang.String r0 = r0.getInstallerPackageName(r9)     // Catch:{ IllegalArgumentException -> 0x00ed }
            goto L_0x00fe
        L_0x00ed:
            r0 = move-exception
            sut r0 = r3.E()
            sur r0 = r0.c
            java.lang.Object r8 = defpackage.sut.a((java.lang.String) r9)
            java.lang.String r7 = "Error retrieving installer package name. appId"
            r0.a(r7, r8)
            r0 = r2
        L_0x00fe:
            if (r0 != 0) goto L_0x0103
            java.lang.String r0 = "manual_install"
            goto L_0x010e
        L_0x0103:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x010e
            java.lang.String r0 = ""
        L_0x010e:
            jnh r7 = defpackage.jni.b(r5)     // Catch:{ NameNotFoundException -> 0x0178 }
            r8 = 0
            android.content.pm.PackageInfo r7 = r7.b(r9, r8)     // Catch:{ NameNotFoundException -> 0x0178 }
            if (r7 == 0) goto L_0x0134
            jnh r8 = defpackage.jni.b(r5)     // Catch:{ NameNotFoundException -> 0x0178 }
            java.lang.CharSequence r8 = r8.b((java.lang.String) r9)     // Catch:{ NameNotFoundException -> 0x0178 }
            boolean r17 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0178 }
            if (r17 == 0) goto L_0x0128
            goto L_0x012c
        L_0x0128:
            java.lang.String r2 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0178 }
        L_0x012c:
            java.lang.String r8 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0132 }
            int r2 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0132 }
            r7 = r8
            goto L_0x0139
        L_0x0132:
            r0 = move-exception
            goto L_0x0179
        L_0x0134:
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0139:
            com.google.android.gms.measurement.internal.AppMetadata r36 = new com.google.android.gms.measurement.internal.AppMetadata
            r8 = r36
            spg r16 = r3.d()
            long r16 = r16.b()
            r31 = r15
            r15 = r16
            szj r1 = r3.p()
            long r17 = r1.a((android.content.Context) r5, (java.lang.String) r9)
            defpackage.ayjy.c()
            long r1 = (long) r2
            r25 = r12
            r12 = r1
            r19 = 0
            r21 = 0
            r23 = 0
            r27 = 0
            r30 = 0
            r32 = 0
            r33 = 0
            r35 = 0
            java.lang.String r22 = ""
            r1 = r11
            r11 = r7
            r2 = r14
            r14 = r0
            r20 = r6
            r28 = r2
            r29 = r1
            r8.<init>(r9, r10, r11, r12, r14, r15, r17, r19, r20, r21, r22, r23, r25, r27, r28, r29, r30, r31, r32, r33, r35)
            goto L_0x0189
        L_0x0178:
            r0 = move-exception
        L_0x0179:
            sut r0 = r3.E()
            sur r0 = r0.c
            java.lang.Object r1 = defpackage.sut.a((java.lang.String) r9)
            java.lang.String r5 = "Error retrieving newly installed package info. appId, appName"
            r0.a(r5, r1, r2)
            r8 = 0
        L_0x0189:
            boolean r0 = r4.h
            if (r0 == 0) goto L_0x0190
            r3.a((com.google.android.gms.measurement.internal.AppMetadata) r8)
        L_0x0190:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.swb.run():void");
    }
}
