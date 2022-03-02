package com.google.android.gms.checkin;

import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CheckinIntentOperation extends IntentOperation {
    private static final iwd a = gzk.a("CheckinIntentOperation");

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v119, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0301, code lost:
        if (defpackage.awrq.b() != false) goto L_0x0303;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0527 A[Catch:{ all -> 0x04f8, all -> 0x0554 }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x05db A[Catch:{ all -> 0x0ad6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x05dc A[Catch:{ all -> 0x0ad6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0602 A[SYNTHETIC, Splitter:B:217:0x0602] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0616 A[SYNTHETIC, Splitter:B:222:0x0616] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0626 A[Catch:{ all -> 0x0ad6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0627 A[Catch:{ all -> 0x0ad6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0667 A[Catch:{ all -> 0x0ad6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0668 A[Catch:{ all -> 0x0ad6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0676  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0695 A[SYNTHETIC, Splitter:B:242:0x0695] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x06a2 A[Catch:{ all -> 0x04f8, all -> 0x0554 }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x06ac  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x06ae  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x070b A[SYNTHETIC, Splitter:B:260:0x070b] */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0715 A[SYNTHETIC, Splitter:B:264:0x0715] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0726 A[SYNTHETIC, Splitter:B:268:0x0726] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0731 A[SYNTHETIC, Splitter:B:270:0x0731] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0782 A[Catch:{ all -> 0x0ab2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x078c A[Catch:{ all -> 0x0ab2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x079c A[SYNTHETIC, Splitter:B:289:0x079c] */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x087d A[Catch:{ all -> 0x0877, all -> 0x08eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0883 A[Catch:{ all -> 0x0877, all -> 0x08eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x08fc  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0903  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x092e A[SYNTHETIC, Splitter:B:354:0x092e] */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x0994  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x09d9  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0a09  */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0a6d  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x0a85  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x0aa0  */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x0b9a  */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0bc6  */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x0c28  */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x0c40  */
    /* JADX WARNING: Removed duplicated region for block: B:474:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r44) {
        /*
            r43 = this;
            r1 = r44
            java.lang.String r2 = "CheckinService_versionInfo"
            java.lang.String r3 = "CheckinService_networkRequest"
            java.lang.String r4 = "Default Task"
            java.lang.String r5 = "checkin_task_tag"
            java.lang.String r6 = "CheckinService_lastSim"
            java.lang.String r7 = "unspecified"
            java.lang.String r8 = "CheckinService_onStart_checkinReason"
            java.lang.String r9 = "CheckinService_forceCheckin"
            java.lang.String r10 = "Checkin rescheduled after failure at"
            java.lang.String r11 = "Show checkin complete notification."
            java.lang.String r12 = "Checkin Operation finished with result: %d finish time: %d."
            java.lang.String r13 = "CheckinService_onStart_showNotification"
            java.lang.String r14 = "CheckinTask:duration"
            java.lang.String r15 = "CheckinTask finished at: %d."
            r16 = r2
            java.lang.String r2 = "checkin_retry_count"
            r17 = r3
            iwd r3 = a
            r18 = r4
            r4 = 1
            r19 = r5
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r4 = 0
            r5[r4] = r1
            java.lang.String r4 = "onHandleIntent, %s"
            r3.b(r4, r5)
            java.lang.String r3 = "config_flags_bundle"
            android.os.Bundle r1 = r1.getBundleExtra(r3)
            gxw r3 = new gxw
            if (r1 == 0) goto L_0x0040
            goto L_0x0045
        L_0x0040:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
        L_0x0045:
            r4 = r43
            r3.<init>(r4, r1)
            android.content.Context r1 = r3.b
            android.content.Context r1 = r1.getApplicationContext()
            boolean r1 = defpackage.jnl.a((android.content.Context) r1)
            if (r1 == 0) goto L_0x0c6b
            int r1 = android.os.Build.VERSION.SDK_INT
            gzh r1 = r3.i
            android.os.Bundle r5 = r3.d
            r1.a((android.os.Bundle) r5)
            gzh r1 = r3.i
            r5 = 3
            r1.b(r5)
            gzh r1 = r3.i
            r1.g()
            gzh r1 = r3.i
            r1.c()
            amri r1 = r3.j
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x0090
            acrz r1 = new acrz
            android.content.Context r5 = r3.b
            r23 = 1
            r25 = 0
            java.lang.String r24 = "Checkin Service"
            java.lang.String r26 = "com.google.android.gms"
            r21 = r1
            r22 = r5
            r21.<init>(r22, r23, r24, r25, r26)
            amri r1 = defpackage.amri.b(r1)
            r3.j = r1
        L_0x0090:
            amri r1 = r3.j
            java.lang.Object r1 = r1.b()
            acrz r1 = (defpackage.acrz) r1
            r5 = 0
            r1.a((boolean) r5)
            amri r1 = r3.j
            java.lang.Object r1 = r1.b()
            acrz r1 = (defpackage.acrz) r1
            long r4 = defpackage.awrq.o()
            r1.a((long) r4)
            gyb r1 = r3.f
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.c
            r4 = 1
            r1.set(r4)
            long r4 = android.os.SystemClock.elapsedRealtime()
            gvx r1 = defpackage.gvx.a
            r21 = r7
            android.os.Bundle r7 = r3.d
            long r22 = android.os.SystemClock.elapsedRealtime()
            r24 = r6
            iwd r6 = defpackage.gxw.a
            r25 = r8
            r26 = r9
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Long r8 = java.lang.Long.valueOf(r22)
            r20 = 0
            r9[r20] = r8
            java.lang.String r8 = "CheckinTask started at: %d."
            r6.b(r8, r9)
            gyb r9 = r3.f     // Catch:{ all -> 0x0b56 }
            r44 = r7
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0b4f }
            r8 = r44
            r27 = r10
            android.os.Bundle r10 = r9.a(r8)     // Catch:{ all -> 0x0b42 }
            long r6 = r9.b(r6, r10)     // Catch:{ all -> 0x0b42 }
            r9 = 0
            int r28 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r28 <= 0) goto L_0x0201
            iwd r6 = defpackage.gxw.a     // Catch:{ all -> 0x0b42 }
            java.lang.String r7 = "Unable to run checkin now."
            r9 = 0
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x0b42 }
            r6.b(r7, r10)     // Catch:{ all -> 0x0b42 }
            long r6 = android.os.SystemClock.elapsedRealtime()
            iwd r10 = defpackage.gxw.a
            r28 = r2
            r9 = 1
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.Long r16 = java.lang.Long.valueOf(r6)
            r9 = 0
            r2[r9] = r16
            r10.b(r15, r2)
            r2 = 2
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r9] = r14
            long r6 = r6 - r22
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            r6 = 1
            r10[r6] = r2
            defpackage.gwd.a((java.lang.Object[]) r10)
            gyb r2 = r3.f
            r2.a((long) r4, (defpackage.gvx) r1)
            boolean r2 = r8.getBoolean(r13, r9)
            if (r2 == 0) goto L_0x013a
            iwd r2 = defpackage.gxw.a
            java.lang.Object[] r6 = new java.lang.Object[r9]
            r2.b(r11, r6)
            int r2 = r1.e
            r3.a((int) r2)
        L_0x013a:
            iwd r2 = defpackage.gxw.a
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            int r6 = r1.e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9 = 0
            r7[r9] = r6
            long r9 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            r9 = 1
            r7[r9] = r6
            r2.c(r12, r7)
            int r2 = r1.e
            if (r2 == 0) goto L_0x01be
            if (r2 == r9) goto L_0x0177
            r6 = 2
            if (r2 == r6) goto L_0x0177
            gyb r2 = r3.f
            long r6 = android.os.SystemClock.elapsedRealtime()
            r2.a((long) r6, (android.os.Bundle) r8)
            gzh r2 = r3.i
            long r6 = defpackage.gxw.a()
            r2.a((long) r6)
            gxs r2 = r3.g
            r2.c(r4)
            goto L_0x01c3
        L_0x0177:
            gxs r2 = r3.g
            r2.b(r4)
            r2 = 44
            amsk r2 = defpackage.amsk.a((char) r2)
            java.lang.String r4 = defpackage.awrq.m()
            java.util.List r2 = r2.c(r4)
            int r4 = r1.f
            java.lang.String r4 = java.lang.String.valueOf(r4)
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L_0x01c3
            r2 = r28
            r4 = 0
            int r5 = r8.getInt(r2, r4)
            r6 = 1
            int r5 = r5 + r6
            r8.putInt(r2, r5)
            iwd r2 = defpackage.gxw.a
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r6 = r27
            r2.b(r6, r4)
            gyb r2 = r3.f
            long r4 = android.os.SystemClock.elapsedRealtime()
            r2.a((long) r4, (android.os.Bundle) r8)
            gzh r2 = r3.i
            long r4 = defpackage.gxw.a()
            r2.a((long) r4)
            goto L_0x01c3
        L_0x01be:
            gxs r2 = r3.g
            r2.a(r4)
        L_0x01c3:
            gzh r2 = r3.i
            int r1 = r1.e
            r2.a((int) r1)
            gzh r1 = r3.i
            gzg r1 = r1.h()
            boolean r2 = defpackage.awrk.b()
            if (r2 == 0) goto L_0x01db
            gzj r2 = r3.h
            r2.a((defpackage.gzg) r1)
        L_0x01db:
            amri r1 = r3.j
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0aaf
            amri r1 = r3.j
            java.lang.Object r1 = r1.b()
            acrz r1 = (defpackage.acrz) r1
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x0aaf
            amri r1 = r3.j
            java.lang.Object r1 = r1.b()
            acrz r1 = (defpackage.acrz) r1
            r1.c()
            ampu r1 = defpackage.ampu.a
            r3.j = r1
            return
        L_0x0201:
            r6 = r27
            gyb r7 = r3.f     // Catch:{ all -> 0x0b32 }
            gyp r9 = r7.d     // Catch:{ all -> 0x0b32 }
            amri r9 = r9.b()     // Catch:{ all -> 0x0b32 }
            android.content.Context r10 = r7.b     // Catch:{ all -> 0x0b32 }
            gyv r10 = defpackage.gyw.a(r10)     // Catch:{ all -> 0x0b32 }
            r10.a()     // Catch:{ all -> 0x0b32 }
            boolean r9 = r9.a()     // Catch:{ all -> 0x0b32 }
            if (r9 == 0) goto L_0x0237
            android.os.Bundle r9 = r7.a(r8)     // Catch:{ all -> 0x0225 }
            gyp r7 = r7.d     // Catch:{ all -> 0x0225 }
            r7.a()     // Catch:{ all -> 0x0225 }
            r7 = r9
            goto L_0x0238
        L_0x0225:
            r0 = move-exception
            r44 = r1
            r1 = r3
            r10 = r11
            r3 = r13
            r38 = r14
            r9 = r15
            r11 = r2
            r2 = r0
            r42 = r12
            r12 = r6
            r6 = r42
            goto L_0x0b64
        L_0x0237:
            r7 = r8
        L_0x0238:
            awrq r8 = defpackage.awrq.a     // Catch:{ all -> 0x0b1d }
            awrr r8 = r8.a()     // Catch:{ all -> 0x0b1d }
            boolean r8 = r8.t()     // Catch:{ all -> 0x0b1d }
            if (r8 == 0) goto L_0x02d7
            android.content.Context r8 = r3.b     // Catch:{ all -> 0x02c5 }
            java.lang.String r9 = "connectivity"
            java.lang.Object r8 = r8.getSystemService(r9)     // Catch:{ all -> 0x02c5 }
            android.net.ConnectivityManager r8 = (android.net.ConnectivityManager) r8     // Catch:{ all -> 0x02c5 }
            android.net.NetworkInfo r8 = r8.getActiveNetworkInfo()     // Catch:{ all -> 0x02c5 }
            if (r8 == 0) goto L_0x027a
            iwd r9 = defpackage.gxw.a     // Catch:{ all -> 0x02c5 }
            boolean r10 = r8.isConnected()     // Catch:{ all -> 0x02c5 }
            r44 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0278 }
            r27 = r6
            r6 = 46
            r1.<init>(r6)     // Catch:{ all -> 0x0b11 }
            java.lang.String r6 = "checked scheduled: connected/background: "
            r1.append(r6)     // Catch:{ all -> 0x0b11 }
            r1.append(r10)     // Catch:{ all -> 0x0b11 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0b11 }
            r6 = 0
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x0b11 }
            r9.a(r1, r10)     // Catch:{ all -> 0x0b11 }
            goto L_0x0288
        L_0x0278:
            r0 = move-exception
            goto L_0x02c8
        L_0x027a:
            r44 = r1
            r27 = r6
            iwd r1 = defpackage.gxw.a     // Catch:{ all -> 0x0b11 }
            java.lang.String r6 = "checkin scheduled: no active network"
            r9 = 0
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x0b11 }
            r1.a(r6, r10)     // Catch:{ all -> 0x0b11 }
        L_0x0288:
            if (r8 != 0) goto L_0x028b
            goto L_0x0293
        L_0x028b:
            boolean r1 = r8.isConnected()     // Catch:{ all -> 0x0b11 }
            if (r1 == 0) goto L_0x0293
            goto L_0x02db
        L_0x0293:
            gvx r1 = new gvx     // Catch:{ all -> 0x0b11 }
            r1.<init>()     // Catch:{ all -> 0x0b11 }
            iwd r6 = defpackage.gxw.a     // Catch:{ all -> 0x02b4 }
            java.lang.String r8 = "Checkin will retry later, network is not available"
            r9 = 0
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x02b4 }
            r6.d(r8, r10)     // Catch:{ all -> 0x02b4 }
            r25 = r2
            r36 = r4
            r34 = r11
            r26 = r12
            r35 = r13
            r38 = r14
            r39 = r15
            r2 = r1
            r1 = r3
            goto L_0x09a5
        L_0x02b4:
            r0 = move-exception
            r6 = r0
            r8 = r7
            r10 = r11
            r38 = r14
            r9 = r15
            r11 = r2
            r7 = r6
            r6 = r12
            r12 = r27
            r2 = r1
            r1 = r3
            r3 = r13
            goto L_0x0b67
        L_0x02c5:
            r0 = move-exception
            r44 = r1
        L_0x02c8:
            r1 = r3
            r10 = r11
            r3 = r13
            r38 = r14
            r9 = r15
            r11 = r2
            r2 = r0
            r42 = r12
            r12 = r6
            r6 = r42
            goto L_0x0b2d
        L_0x02d7:
            r44 = r1
            r27 = r6
        L_0x02db:
            awrq r1 = defpackage.awrq.a     // Catch:{ all -> 0x0b11 }
            awrr r1 = r1.a()     // Catch:{ all -> 0x0b11 }
            boolean r1 = r1.b()     // Catch:{ all -> 0x0b11 }
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x02ea
            goto L_0x02ee
        L_0x02ea:
            r3.a((java.lang.String) r6)     // Catch:{ all -> 0x0b11 }
        L_0x02ee:
            gzh r1 = r3.i     // Catch:{ all -> 0x0b11 }
            r1.a()     // Catch:{ all -> 0x0b11 }
            r1 = r26
            r8 = 0
            boolean r9 = r7.getBoolean(r1, r8)     // Catch:{ all -> 0x0b11 }
            if (r9 != 0) goto L_0x02fd
            goto L_0x0303
        L_0x02fd:
            boolean r8 = defpackage.awrq.b()     // Catch:{ all -> 0x0b11 }
            if (r8 == 0) goto L_0x030a
        L_0x0303:
            android.content.Context r8 = r3.b     // Catch:{ all -> 0x0b11 }
            boolean r9 = r3.e     // Catch:{ all -> 0x0b11 }
            com.google.android.gms.checkin.eventlog.EventLogChimeraService.a((android.content.Context) r8, (boolean) r9)     // Catch:{ all -> 0x0b11 }
        L_0x030a:
            gzh r8 = r3.i     // Catch:{ all -> 0x0b11 }
            r8.b()     // Catch:{ all -> 0x0b11 }
            gym r8 = r3.c     // Catch:{ all -> 0x0b11 }
            android.content.Context r9 = r8.c     // Catch:{ all -> 0x0b11 }
            gwp r9 = defpackage.gwr.a((android.content.Context) r9)     // Catch:{ all -> 0x0b11 }
            android.content.Context r10 = r8.c     // Catch:{ all -> 0x0b11 }
            android.content.SharedPreferences r10 = defpackage.gwk.l(r10)     // Catch:{ all -> 0x0b11 }
            r26 = r12
            r12 = 0
            int r28 = r7.getInt(r2, r12)     // Catch:{ all -> 0x0b07 }
            r12 = r25
            boolean r25 = r7.containsKey(r12)     // Catch:{ all -> 0x0b07 }
            if (r25 == 0) goto L_0x0348
            r25 = r2
            r2 = 0
            int r12 = r7.getInt(r12, r2)     // Catch:{ all -> 0x0338 }
            int r2 = defpackage.haf.a(r12)     // Catch:{ all -> 0x0338 }
            goto L_0x034b
        L_0x0338:
            r0 = move-exception
            r2 = r0
            r1 = r3
            r10 = r11
            r3 = r13
            r38 = r14
            r9 = r15
            r11 = r25
            r6 = r26
            r12 = r27
            goto L_0x0b2d
        L_0x0348:
            r25 = r2
            r2 = 1
        L_0x034b:
            android.content.Context r12 = r8.c     // Catch:{ all -> 0x0af9 }
            boolean r12 = defpackage.jiw.a((android.content.Context) r12)     // Catch:{ all -> 0x0af9 }
            if (r12 != 0) goto L_0x0358
            r34 = r11
            r35 = r13
            goto L_0x0367
        L_0x0358:
            iwd r2 = defpackage.gym.a     // Catch:{ all -> 0x0af9 }
            java.lang.String r12 = "system was upgraded"
            r34 = r11
            r35 = r13
            r11 = 0
            java.lang.Object[] r13 = new java.lang.Object[r11]     // Catch:{ all -> 0x0ae9 }
            r2.a(r12, r13)     // Catch:{ all -> 0x0ae9 }
            r2 = 7
        L_0x0367:
            android.content.Context r11 = r8.c     // Catch:{ all -> 0x0ae9 }
            android.content.SharedPreferences r11 = defpackage.gwk.l(r11)     // Catch:{ all -> 0x0ae9 }
            android.content.Context r12 = r8.c     // Catch:{ all -> 0x0ae9 }
            boolean r12 = defpackage.gwd.f(r12)     // Catch:{ all -> 0x0ae9 }
            if (r12 == 0) goto L_0x057a
            gyq r12 = new gyq     // Catch:{ all -> 0x0568 }
            android.content.Context r13 = r8.c     // Catch:{ all -> 0x0568 }
            r12.<init>(r13)     // Catch:{ all -> 0x0568 }
            boolean r13 = defpackage.jkr.a()     // Catch:{ all -> 0x0568 }
            r29 = r2
            java.lang.String r2 = "no-sim"
            if (r13 == 0) goto L_0x050c
            android.content.Context r13 = r12.b     // Catch:{ all -> 0x0568 }
            r36 = r4
            java.lang.String r4 = "telephony_subscription_service"
            java.lang.Object r4 = r13.getSystemService(r4)     // Catch:{ all -> 0x04f8 }
            android.telephony.SubscriptionManager r4 = (android.telephony.SubscriptionManager) r4     // Catch:{ all -> 0x04f8 }
            java.util.List r4 = r4.getActiveSubscriptionInfoList()     // Catch:{ all -> 0x04f8 }
            if (r4 != 0) goto L_0x03b3
            iwd r4 = defpackage.gyq.a     // Catch:{ all -> 0x03ac }
            java.lang.String r5 = "No Subscriptions found on the device"
            r12 = 0
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ all -> 0x03ac }
            r4.a(r5, r13)     // Catch:{ all -> 0x03ac }
            r40 = r3
            r41 = r10
            r38 = r14
            r39 = r15
            goto L_0x051a
        L_0x03ac:
            r0 = move-exception
            r2 = r0
            r1 = r3
            r38 = r14
            goto L_0x04fd
        L_0x03b3:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x04f8 }
            r5 = r6
        L_0x03b8:
            boolean r13 = r4.hasNext()     // Catch:{ all -> 0x04f8 }
            if (r13 == 0) goto L_0x04d9
            java.lang.Object r13 = r4.next()     // Catch:{ all -> 0x04f8 }
            android.telephony.SubscriptionInfo r13 = (android.telephony.SubscriptionInfo) r13     // Catch:{ all -> 0x04f8 }
            if (r13 != 0) goto L_0x03dd
            iwd r13 = defpackage.gyq.a     // Catch:{ all -> 0x04f8 }
            r30 = r4
            java.lang.String r4 = "Null subscription info."
            r38 = r14
            r39 = r15
            r14 = 0
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ all -> 0x04ad }
            r13.a(r4, r15)     // Catch:{ all -> 0x04ad }
            r4 = r30
            r14 = r38
            r15 = r39
            goto L_0x03b8
        L_0x03dd:
            r30 = r4
            r38 = r14
            r39 = r15
            java.lang.String r4 = "[no-sim:no-imsi]"
            int r13 = r13.getSubscriptionId()     // Catch:{ NoSuchMethodException -> 0x04c4, IllegalAccessException -> 0x04c2, InvocationTargetException -> 0x04c0 }
            boolean r14 = defpackage.jkr.c()     // Catch:{ NoSuchMethodException -> 0x04c4, IllegalAccessException -> 0x04c2, InvocationTargetException -> 0x04c0 }
            if (r14 == 0) goto L_0x040a
            android.telephony.TelephonyManager r14 = r12.c     // Catch:{ NoSuchMethodException -> 0x0402, IllegalAccessException -> 0x0400, InvocationTargetException -> 0x03fe }
            android.telephony.TelephonyManager r14 = r14.createForSubscriptionId(r13)     // Catch:{ NoSuchMethodException -> 0x0402, IllegalAccessException -> 0x0400, InvocationTargetException -> 0x03fe }
            java.lang.String r14 = r14.getSimSerialNumber()     // Catch:{ NoSuchMethodException -> 0x0402, IllegalAccessException -> 0x0400, InvocationTargetException -> 0x03fe }
            r40 = r3
            r41 = r10
            goto L_0x0436
        L_0x03fe:
            r0 = move-exception
            goto L_0x0403
        L_0x0400:
            r0 = move-exception
            goto L_0x0403
        L_0x0402:
            r0 = move-exception
        L_0x0403:
            r2 = r0
            r40 = r3
            r41 = r10
            goto L_0x04ca
        L_0x040a:
            java.lang.Class<android.telephony.TelephonyManager> r14 = android.telephony.TelephonyManager.class
            r40 = r3
            r15 = 1
            java.lang.Class[] r3 = new java.lang.Class[r15]     // Catch:{ NoSuchMethodException -> 0x04ab, IllegalAccessException -> 0x04a9, InvocationTargetException -> 0x04a7 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x04ab, IllegalAccessException -> 0x04a9, InvocationTargetException -> 0x04a7 }
            r20 = 0
            r3[r20] = r15     // Catch:{ NoSuchMethodException -> 0x04ab, IllegalAccessException -> 0x04a9, InvocationTargetException -> 0x04a7 }
            java.lang.String r15 = "getSimSerialNumber"
            java.lang.reflect.Method r3 = r14.getDeclaredMethod(r15, r3)     // Catch:{ NoSuchMethodException -> 0x04ab, IllegalAccessException -> 0x04a9, InvocationTargetException -> 0x04a7 }
            r14 = 1
            r3.setAccessible(r14)     // Catch:{ NoSuchMethodException -> 0x04ab, IllegalAccessException -> 0x04a9, InvocationTargetException -> 0x04a7 }
            android.telephony.TelephonyManager r15 = r12.c     // Catch:{ NoSuchMethodException -> 0x04ab, IllegalAccessException -> 0x04a9, InvocationTargetException -> 0x04a7 }
            r41 = r10
            java.lang.Object[] r10 = new java.lang.Object[r14]     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
            r20 = 0
            r10[r20] = r14     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
            java.lang.Object r3 = r3.invoke(r15, r10)     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
            r14 = r3
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
        L_0x0436:
            if (r14 == 0) goto L_0x043d
            java.lang.String r4 = r4.replace(r2, r14)     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
            goto L_0x043e
        L_0x043d:
        L_0x043e:
            boolean r3 = defpackage.jkr.c()     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
            if (r3 == 0) goto L_0x044f
            android.telephony.TelephonyManager r3 = r12.c     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
            android.telephony.TelephonyManager r3 = r3.createForSubscriptionId(r13)     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
            java.lang.String r3 = r3.getSubscriberId()     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
            goto L_0x0474
        L_0x044f:
            java.lang.Class<android.telephony.TelephonyManager> r3 = android.telephony.TelephonyManager.class
            r10 = 1
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
            r15 = 0
            r14[r15] = r10     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
            java.lang.String r10 = "getSubscriberId"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r10, r14)     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
            r10 = 1
            r3.setAccessible(r10)     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
            android.telephony.TelephonyManager r14 = r12.c     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
            java.lang.Object[] r15 = new java.lang.Object[r10]     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
            r13 = 0
            r15[r13] = r10     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
            java.lang.Object r3 = r3.invoke(r14, r15)     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
        L_0x0474:
            if (r3 != 0) goto L_0x0477
            goto L_0x047d
        L_0x0477:
            java.lang.String r10 = "no-imsi"
            java.lang.String r4 = r4.replace(r10, r3)     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
        L_0x047d:
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
            int r5 = r4.length()     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
            if (r5 != 0) goto L_0x0491
            java.lang.String r5 = new java.lang.String     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
            r5.<init>(r3)     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
            goto L_0x0495
        L_0x0491:
            java.lang.String r5 = r3.concat(r4)     // Catch:{ NoSuchMethodException -> 0x04a5, IllegalAccessException -> 0x04a3, InvocationTargetException -> 0x04a1 }
        L_0x0495:
            r4 = r30
            r14 = r38
            r15 = r39
            r3 = r40
            r10 = r41
            goto L_0x03b8
        L_0x04a1:
            r0 = move-exception
            goto L_0x04c9
        L_0x04a3:
            r0 = move-exception
            goto L_0x04c9
        L_0x04a5:
            r0 = move-exception
            goto L_0x04c9
        L_0x04a7:
            r0 = move-exception
            goto L_0x04c7
        L_0x04a9:
            r0 = move-exception
            goto L_0x04c7
        L_0x04ab:
            r0 = move-exception
            goto L_0x04c7
        L_0x04ad:
            r0 = move-exception
            r2 = r0
            r1 = r3
        L_0x04b0:
            r11 = r25
            r6 = r26
            r12 = r27
            r10 = r34
            r3 = r35
            r4 = r36
            r9 = r39
            goto L_0x0b2d
        L_0x04c0:
            r0 = move-exception
            goto L_0x04c5
        L_0x04c2:
            r0 = move-exception
            goto L_0x04c5
        L_0x04c4:
            r0 = move-exception
        L_0x04c5:
            r40 = r3
        L_0x04c7:
            r41 = r10
        L_0x04c9:
            r2 = r0
        L_0x04ca:
            iwd r3 = defpackage.gyq.a     // Catch:{ all -> 0x0554 }
            java.lang.String r4 = "Exception from TelephonyManager methods for getting SIM IDs"
            r5 = 0
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x0554 }
            r3.d(r4, r2, r10)     // Catch:{ all -> 0x0554 }
            java.lang.String r2 = r12.a()     // Catch:{ all -> 0x0554 }
            goto L_0x051a
        L_0x04d9:
            r40 = r3
            r41 = r10
            r38 = r14
            r39 = r15
            boolean r2 = r5.isEmpty()     // Catch:{ all -> 0x0554 }
            if (r2 == 0) goto L_0x04f6
            iwd r2 = defpackage.gyq.a     // Catch:{ all -> 0x0554 }
            java.lang.String r3 = "SIM IDs not available by subscription"
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0554 }
            r2.d(r3, r5)     // Catch:{ all -> 0x0554 }
            java.lang.String r2 = r12.a()     // Catch:{ all -> 0x0554 }
            goto L_0x051a
        L_0x04f6:
            r2 = r5
            goto L_0x051a
        L_0x04f8:
            r0 = move-exception
            r38 = r14
            r2 = r0
            r1 = r3
        L_0x04fd:
            r9 = r15
            r11 = r25
            r6 = r26
            r12 = r27
            r10 = r34
            r3 = r35
            r4 = r36
            goto L_0x0b2d
        L_0x050c:
            r40 = r3
            r36 = r4
            r41 = r10
            r38 = r14
            r39 = r15
            java.lang.String r2 = r12.a()     // Catch:{ all -> 0x0554 }
        L_0x051a:
            r3 = 0
            r4 = r24
            java.lang.String r3 = r11.getString(r4, r3)     // Catch:{ all -> 0x0554 }
            boolean r3 = r2.equals(r3)     // Catch:{ all -> 0x0554 }
            if (r3 != 0) goto L_0x0590
            iwd r3 = defpackage.gym.a     // Catch:{ all -> 0x0554 }
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0554 }
            java.lang.String r10 = "subscriberid changed to "
            int r12 = r5.length()     // Catch:{ all -> 0x0554 }
            if (r12 != 0) goto L_0x053b
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0554 }
            r5.<init>(r10)     // Catch:{ all -> 0x0554 }
            goto L_0x053f
        L_0x053b:
            java.lang.String r5 = r10.concat(r5)     // Catch:{ all -> 0x0554 }
        L_0x053f:
            r10 = 0
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ all -> 0x0554 }
            r3.a(r5, r12)     // Catch:{ all -> 0x0554 }
            android.content.SharedPreferences$Editor r3 = r11.edit()     // Catch:{ all -> 0x0554 }
            android.content.SharedPreferences$Editor r2 = r3.putString(r4, r2)     // Catch:{ all -> 0x0554 }
            r2.apply()     // Catch:{ all -> 0x0554 }
            r2 = 6
            r29 = 6
            goto L_0x0590
        L_0x0554:
            r0 = move-exception
            r2 = r0
            r11 = r25
            r6 = r26
            r12 = r27
            r10 = r34
            r3 = r35
            r4 = r36
            r9 = r39
            r1 = r40
            goto L_0x0b2d
        L_0x0568:
            r0 = move-exception
            r38 = r14
            r2 = r0
            r1 = r3
            r9 = r15
            r11 = r25
            r6 = r26
            r12 = r27
            r10 = r34
            r3 = r35
            goto L_0x0b2d
        L_0x057a:
            r29 = r2
            r40 = r3
            r36 = r4
            r41 = r10
            r38 = r14
            r39 = r15
            iwd r2 = defpackage.gym.a     // Catch:{ all -> 0x0ad6 }
            java.lang.String r3 = "Gms missing READ_PHONE_STATE permission, cannot read hw info."
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0ad6 }
            r2.d(r3, r5)     // Catch:{ all -> 0x0ad6 }
        L_0x0590:
            r2 = 1
            int r30 = r28 + 1
            java.lang.String r2 = "checkin_source_package"
            r3 = r21
            java.lang.String r31 = r7.getString(r2, r3)     // Catch:{ all -> 0x0ad6 }
            java.lang.String r2 = "checkin_source_class"
            java.lang.String r32 = r7.getString(r2, r6)     // Catch:{ all -> 0x0ad6 }
            java.lang.String r2 = "checkin_source_force"
            r4 = 0
            boolean r33 = r7.getBoolean(r2, r4)     // Catch:{ all -> 0x0ad6 }
            r28 = r9
            r28.a(r29, r30, r31, r32, r33)     // Catch:{ all -> 0x0ad6 }
            long r4 = android.os.Build.TIME     // Catch:{ all -> 0x0ad6 }
            r10 = 1587020400000(0x17181c98580, double:7.84092258889E-312)
            long r4 = java.lang.Math.max(r4, r10)     // Catch:{ all -> 0x0ad6 }
            r9.a((long) r4)     // Catch:{ all -> 0x0ad6 }
            boolean r2 = r8.d     // Catch:{ all -> 0x0ad6 }
            r9.m = r2     // Catch:{ all -> 0x0ad6 }
            awrq r2 = defpackage.awrq.a     // Catch:{ all -> 0x0ad6 }
            awrr r2 = r2.a()     // Catch:{ all -> 0x0ad6 }
            long r4 = r2.c()     // Catch:{ all -> 0x0ad6 }
            int r2 = (int) r4     // Catch:{ all -> 0x0ad6 }
            r9.u = r2     // Catch:{ all -> 0x0ad6 }
            r2 = 0
            boolean r4 = r7.getBoolean(r1, r2)     // Catch:{ all -> 0x0ad6 }
            java.lang.String r2 = "CheckinService_logUploadPolicy"
            java.lang.String r5 = "UPLOAD_ALL"
            java.lang.String r2 = r7.getString(r2, r5)     // Catch:{ all -> 0x0ad6 }
            if (r4 != 0) goto L_0x05dc
            goto L_0x05e8
        L_0x05dc:
            boolean r4 = defpackage.awrq.b()     // Catch:{ all -> 0x0ad6 }
            if (r4 != 0) goto L_0x05e8
            r2 = 1
            r9.j = r2     // Catch:{ all -> 0x0554 }
            java.lang.String r2 = "UPLOAD_NONE"
            goto L_0x05f7
        L_0x05e8:
            r4 = 0
            r9.j = r4     // Catch:{ all -> 0x0ad6 }
            android.content.Context r4 = r8.c     // Catch:{ all -> 0x0ad6 }
            java.lang.String r5 = "dropbox"
            java.lang.Object r4 = r4.getSystemService(r5)     // Catch:{ all -> 0x0ad6 }
            android.os.DropBoxManager r4 = (android.os.DropBoxManager) r4     // Catch:{ all -> 0x0ad6 }
            r9.b = r4     // Catch:{ all -> 0x0ad6 }
        L_0x05f7:
            r9.a((java.lang.String) r2)     // Catch:{ all -> 0x0ad6 }
            android.content.Context r2 = r8.c     // Catch:{ all -> 0x0ad6 }
            boolean r2 = defpackage.jix.a((android.content.Context) r2)     // Catch:{ all -> 0x0ad6 }
            if (r2 != 0) goto L_0x0616
            android.content.Context r2 = r8.c     // Catch:{ all -> 0x0554 }
            boolean r2 = defpackage.jix.b(r2)     // Catch:{ all -> 0x0554 }
            if (r2 == 0) goto L_0x060f
            java.lang.String r2 = "https://checkin.gstatic.com/checkin"
            r9.k = r2     // Catch:{ all -> 0x0554 }
            goto L_0x061a
        L_0x060f:
            java.lang.String r2 = defpackage.awrn.b()     // Catch:{ all -> 0x0554 }
            r9.k = r2     // Catch:{ all -> 0x0554 }
            goto L_0x061a
        L_0x0616:
            java.lang.String r2 = defpackage.gym.b     // Catch:{ all -> 0x0ad6 }
            r9.k = r2     // Catch:{ all -> 0x0ad6 }
        L_0x061a:
            awrq r2 = defpackage.awrq.a     // Catch:{ all -> 0x0ad6 }
            awrr r2 = r2.a()     // Catch:{ all -> 0x0ad6 }
            boolean r2 = r2.j()     // Catch:{ all -> 0x0ad6 }
            if (r2 != 0) goto L_0x0627
            goto L_0x063c
        L_0x0627:
            gwq r2 = new gwq     // Catch:{ all -> 0x0ad6 }
            r2.<init>()     // Catch:{ all -> 0x0ad6 }
            r4 = 1
            r2.b = r4     // Catch:{ all -> 0x0ad6 }
            android.content.Context r4 = r8.c     // Catch:{ all -> 0x0ad6 }
            java.lang.String r5 = "dns_patcher"
            r10 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r5, r10)     // Catch:{ all -> 0x0ad6 }
            r2.a = r4     // Catch:{ all -> 0x0ad6 }
            r9.h = r2     // Catch:{ all -> 0x0ad6 }
        L_0x063c:
            r2 = r41
            r9.c = r2     // Catch:{ all -> 0x0ad6 }
            java.lang.String r2 = "CheckinService_fetchSystemUpdates"
            r4 = 0
            boolean r2 = r7.getBoolean(r2, r4)     // Catch:{ all -> 0x0ad6 }
            r9.f = r2     // Catch:{ all -> 0x0ad6 }
            boolean r2 = defpackage.awrq.i()     // Catch:{ all -> 0x0ad6 }
            r4 = 1
            r2 = r2 ^ r4
            r9.g = r2     // Catch:{ all -> 0x0ad6 }
            r4 = r18
            r2 = r19
            java.lang.String r5 = r7.getString(r2, r4)     // Catch:{ all -> 0x0ad6 }
            r9.i = r5     // Catch:{ all -> 0x0ad6 }
            awrq r5 = defpackage.awrq.a     // Catch:{ all -> 0x0ad6 }
            awrr r5 = r5.a()     // Catch:{ all -> 0x0ad6 }
            boolean r5 = r5.C()     // Catch:{ all -> 0x0ad6 }
            if (r5 != 0) goto L_0x0668
            goto L_0x066e
        L_0x0668:
            boolean r5 = r8.a()     // Catch:{ all -> 0x0ad6 }
            r9.r = r5     // Catch:{ all -> 0x0ad6 }
        L_0x066e:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0ad6 }
            boolean r5 = defpackage.awrq.s()     // Catch:{ all -> 0x0ad6 }
            if (r5 == 0) goto L_0x0687
            r5 = r17
            boolean r8 = r7.containsKey(r5)     // Catch:{ all -> 0x0554 }
            if (r8 == 0) goto L_0x0687
            android.os.Parcelable r5 = r7.getParcelable(r5)     // Catch:{ all -> 0x0554 }
            android.net.NetworkRequest r5 = (android.net.NetworkRequest) r5     // Catch:{ all -> 0x0554 }
            r9.a((android.net.NetworkRequest) r5)     // Catch:{ all -> 0x0554 }
        L_0x0687:
            gwr r5 = r9.a()     // Catch:{ all -> 0x0ad6 }
            iwd r8 = defpackage.gxw.a     // Catch:{ all -> 0x0ad6 }
            java.lang.String r2 = r7.getString(r2, r4)     // Catch:{ all -> 0x0ad6 }
            hag r4 = r5.p     // Catch:{ all -> 0x0ad6 }
            if (r4 == 0) goto L_0x06a2
            int r4 = r4.b     // Catch:{ all -> 0x0554 }
            int r4 = defpackage.haf.a(r4)     // Catch:{ all -> 0x0554 }
            if (r4 == 0) goto L_0x069e
            goto L_0x069f
        L_0x069e:
            r4 = 1
        L_0x069f:
            int r4 = r4 + -1
            goto L_0x06a3
        L_0x06a2:
            r4 = 0
        L_0x06a3:
            if (r7 == 0) goto L_0x06ae
            r9 = 0
            boolean r1 = r7.getBoolean(r1, r9)     // Catch:{ all -> 0x0554 }
            if (r1 == 0) goto L_0x06ae
            r1 = 1
            goto L_0x06af
        L_0x06ae:
            r1 = 0
        L_0x06af:
            jnl r9 = defpackage.jnl.a()     // Catch:{ all -> 0x0ad6 }
            int r9 = r9.c()     // Catch:{ all -> 0x0ad6 }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0ad6 }
            java.lang.String r12 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0ad6 }
            int r12 = r12.length()     // Catch:{ all -> 0x0ad6 }
            int r12 = r12 + 108
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad6 }
            r13.<init>(r12)     // Catch:{ all -> 0x0ad6 }
            java.lang.String r12 = "Starting Checkin: "
            r13.append(r12)     // Catch:{ all -> 0x0ad6 }
            r13.append(r2)     // Catch:{ all -> 0x0ad6 }
            java.lang.String r2 = " Reason : "
            r13.append(r2)     // Catch:{ all -> 0x0ad6 }
            r13.append(r4)     // Catch:{ all -> 0x0ad6 }
            java.lang.String r2 = " Force : "
            r13.append(r2)     // Catch:{ all -> 0x0ad6 }
            r13.append(r1)     // Catch:{ all -> 0x0ad6 }
            java.lang.String r1 = " UserId : "
            r13.append(r1)     // Catch:{ all -> 0x0ad6 }
            r13.append(r9)     // Catch:{ all -> 0x0ad6 }
            java.lang.String r1 = " Start time : "
            r13.append(r1)     // Catch:{ all -> 0x0ad6 }
            r13.append(r10)     // Catch:{ all -> 0x0ad6 }
            java.lang.String r1 = r13.toString()     // Catch:{ all -> 0x0ad6 }
            r2 = 0
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0ad6 }
            r8.c(r1, r4)     // Catch:{ all -> 0x0ad6 }
            r1 = r40
            gzh r2 = r1.i     // Catch:{ all -> 0x0ac5 }
            r2.d()     // Catch:{ all -> 0x0ac5 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0ac5 }
            boolean r2 = defpackage.awrq.s()     // Catch:{ all -> 0x0ac5 }
            if (r2 == 0) goto L_0x0715
            gwo r2 = new gwo     // Catch:{ all -> 0x0711 }
            r2.<init>(r5)     // Catch:{ all -> 0x0711 }
            goto L_0x071a
        L_0x0711:
            r0 = move-exception
            r2 = r0
            goto L_0x04b0
        L_0x0715:
            gwf r2 = new gwf     // Catch:{ all -> 0x0ac5 }
            r2.<init>(r5)     // Catch:{ all -> 0x0ac5 }
        L_0x071a:
            android.content.Context r4 = r1.b     // Catch:{ all -> 0x0ac5 }
            android.content.Context r4 = r4.getApplicationContext()     // Catch:{ all -> 0x0ac5 }
            boolean r8 = defpackage.awrt.b()     // Catch:{ all -> 0x0ac5 }
            if (r8 != 0) goto L_0x0731
            gvy r8 = new gvy     // Catch:{ all -> 0x0711 }
            r8.<init>(r4)     // Catch:{ all -> 0x0711 }
            gwa r9 = new gwa     // Catch:{ all -> 0x0711 }
            r9.<init>(r4, r2, r8)     // Catch:{ all -> 0x0711 }
            goto L_0x0736
        L_0x0731:
            gwa r9 = new gwa     // Catch:{ all -> 0x0ac5 }
            r9.<init>(r4, r2)     // Catch:{ all -> 0x0ac5 }
        L_0x0736:
            gvx r2 = r9.a((defpackage.gwr) r5)     // Catch:{ all -> 0x0ac5 }
            gzh r4 = r1.i     // Catch:{ all -> 0x0ab2 }
            amzy r8 = r2.g     // Catch:{ all -> 0x0ab2 }
            r4.a((java.util.List) r8)     // Catch:{ all -> 0x0ab2 }
            gzh r4 = r1.i     // Catch:{ all -> 0x0ab2 }
            gzo r8 = r2.h     // Catch:{ all -> 0x0ab2 }
            r4.a((defpackage.gzo) r8)     // Catch:{ all -> 0x0ab2 }
            gzh r4 = r1.i     // Catch:{ all -> 0x0ab2 }
            r4.e()     // Catch:{ all -> 0x0ab2 }
            gzr r4 = r2.d     // Catch:{ all -> 0x0ab2 }
            gzs r8 = r2.b     // Catch:{ all -> 0x0ab2 }
            int r9 = r2.e     // Catch:{ all -> 0x0ab2 }
            java.util.List r10 = r2.c     // Catch:{ all -> 0x0ab2 }
            if (r9 != 0) goto L_0x077e
            awrq r11 = defpackage.awrq.a     // Catch:{ all -> 0x0ab2 }
            awrr r11 = r11.a()     // Catch:{ all -> 0x0ab2 }
            boolean r11 = r11.p()     // Catch:{ all -> 0x0ab2 }
            if (r11 == 0) goto L_0x077e
            android.content.Context r11 = r1.b     // Catch:{ all -> 0x0ab2 }
            android.content.Context r11 = r11.getApplicationContext()     // Catch:{ all -> 0x0ab2 }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0ab2 }
            android.content.SharedPreferences r11 = defpackage.gwk.l(r11)     // Catch:{ all -> 0x0ab2 }
            android.content.SharedPreferences$Editor r11 = r11.edit()     // Catch:{ all -> 0x0ab2 }
            java.lang.String r14 = "CheckinService_lastCheckinSuccessTime"
            android.content.SharedPreferences$Editor r11 = r11.putLong(r14, r12)     // Catch:{ all -> 0x0ab2 }
            r11.apply()     // Catch:{ all -> 0x0ab2 }
        L_0x077e:
            gzr r11 = r2.d     // Catch:{ all -> 0x0ab2 }
            if (r11 == 0) goto L_0x078c
            had r11 = r11.l     // Catch:{ all -> 0x0ab2 }
            if (r11 == 0) goto L_0x0787
            goto L_0x0789
        L_0x0787:
            had r11 = defpackage.had.o     // Catch:{ all -> 0x0ab2 }
        L_0x0789:
            java.lang.String r11 = r11.g     // Catch:{ all -> 0x0ab2 }
            goto L_0x078d
        L_0x078c:
            r11 = r6
        L_0x078d:
            r1.a((java.lang.String) r11)     // Catch:{ all -> 0x0ab2 }
            android.content.Context r11 = r1.b     // Catch:{ all -> 0x0ab2 }
            android.content.Context r11 = r11.getApplicationContext()     // Catch:{ all -> 0x0ab2 }
            android.content.SharedPreferences r11 = defpackage.gwk.l(r11)     // Catch:{ all -> 0x0ab2 }
            if (r8 == 0) goto L_0x087d
            android.content.Intent[] r12 = defpackage.gwb.a(r8)     // Catch:{ all -> 0x0877 }
            int r13 = r12.length     // Catch:{ all -> 0x0877 }
            r14 = 0
        L_0x07a2:
            if (r14 >= r13) goto L_0x07db
            r15 = r12[r14]     // Catch:{ all -> 0x0877 }
            r44 = r2
            java.lang.String r2 = "com.google.android.checkin.INVALIDATE"
            r21 = r3
            java.lang.String r3 = r15.getAction()     // Catch:{ all -> 0x08eb }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x08eb }
            if (r2 != 0) goto L_0x07bc
            android.content.Context r2 = r1.b     // Catch:{ all -> 0x08eb }
            r2.sendBroadcast(r15)     // Catch:{ all -> 0x08eb }
            goto L_0x07d4
        L_0x07bc:
            if (r4 != 0) goto L_0x07bf
            goto L_0x07ca
        L_0x07bf:
            aucx r2 = r4.m     // Catch:{ all -> 0x08eb }
            int r2 = r2.size()     // Catch:{ all -> 0x08eb }
            if (r2 == 0) goto L_0x07ca
            aucx r2 = r4.m     // Catch:{ all -> 0x08eb }
            goto L_0x07cf
        L_0x07ca:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x08eb }
            r2.<init>()     // Catch:{ all -> 0x08eb }
        L_0x07cf:
            android.content.Context r3 = r1.b     // Catch:{ all -> 0x08eb }
            defpackage.gvu.a((android.content.Context) r3, (java.util.List) r2)     // Catch:{ all -> 0x08eb }
        L_0x07d4:
            int r14 = r14 + 1
            r2 = r44
            r3 = r21
            goto L_0x07a2
        L_0x07db:
            r44 = r2
            r21 = r3
            int r2 = r8.a     // Catch:{ all -> 0x08eb }
            r2 = r2 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0800
            java.lang.String r2 = r8.i     // Catch:{ all -> 0x08eb }
            r3 = r16
            java.lang.String r4 = r11.getString(r3, r6)     // Catch:{ all -> 0x08eb }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x08eb }
            if (r2 != 0) goto L_0x0800
            android.content.SharedPreferences$Editor r2 = r11.edit()     // Catch:{ all -> 0x08eb }
            java.lang.String r4 = r8.i     // Catch:{ all -> 0x08eb }
            android.content.SharedPreferences$Editor r2 = r2.putString(r3, r4)     // Catch:{ all -> 0x08eb }
            r2.apply()     // Catch:{ all -> 0x08eb }
        L_0x0800:
            int r2 = r8.a     // Catch:{ all -> 0x08eb }
            r2 = r2 & 256(0x100, float:3.59E-43)
            java.lang.String r3 = "CheckinService_deviceDataVersionInfo"
            if (r2 != 0) goto L_0x081e
            iwd r2 = defpackage.gxw.a     // Catch:{ all -> 0x08eb }
            java.lang.String r4 = "Clearing the deviceDataVersionInfo."
            r6 = 0
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x08eb }
            r2.a(r4, r12)     // Catch:{ all -> 0x08eb }
            android.content.SharedPreferences$Editor r2 = r11.edit()     // Catch:{ all -> 0x08eb }
            android.content.SharedPreferences$Editor r2 = r2.remove(r3)     // Catch:{ all -> 0x08eb }
            r2.apply()     // Catch:{ all -> 0x08eb }
            goto L_0x0841
        L_0x081e:
            java.lang.String r2 = r8.j     // Catch:{ all -> 0x08eb }
            java.lang.String r4 = r11.getString(r3, r6)     // Catch:{ all -> 0x08eb }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x08eb }
            if (r2 != 0) goto L_0x0841
            iwd r2 = defpackage.gxw.a     // Catch:{ all -> 0x08eb }
            java.lang.String r4 = "Storing the new deviceDataVersionInfo."
            r6 = 0
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x08eb }
            r2.a(r4, r12)     // Catch:{ all -> 0x08eb }
            android.content.SharedPreferences$Editor r2 = r11.edit()     // Catch:{ all -> 0x08eb }
            java.lang.String r4 = r8.j     // Catch:{ all -> 0x08eb }
            android.content.SharedPreferences$Editor r2 = r2.putString(r3, r4)     // Catch:{ all -> 0x08eb }
            r2.apply()     // Catch:{ all -> 0x08eb }
        L_0x0841:
            aucx r2 = r8.k     // Catch:{ all -> 0x08eb }
            int r2 = r2.size()     // Catch:{ all -> 0x08eb }
            if (r2 <= 0) goto L_0x0881
            iwd r2 = defpackage.gxw.a     // Catch:{ all -> 0x08eb }
            aucx r3 = r8.k     // Catch:{ all -> 0x08eb }
            int r3 = r3.size()     // Catch:{ all -> 0x08eb }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x08eb }
            r6 = 32
            r4.<init>(r6)     // Catch:{ all -> 0x08eb }
            java.lang.String r6 = "Invalidating "
            r4.append(r6)     // Catch:{ all -> 0x08eb }
            r4.append(r3)     // Catch:{ all -> 0x08eb }
            java.lang.String r3 = " tokens."
            r4.append(r3)     // Catch:{ all -> 0x08eb }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x08eb }
            r4 = 0
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x08eb }
            r2.a(r3, r6)     // Catch:{ all -> 0x08eb }
            android.content.Context r2 = r1.b     // Catch:{ all -> 0x08eb }
            aucx r3 = r8.k     // Catch:{ all -> 0x08eb }
            defpackage.gvu.a((android.content.Context) r2, (java.util.List) r3)     // Catch:{ all -> 0x08eb }
            goto L_0x0881
        L_0x0877:
            r0 = move-exception
            r44 = r2
        L_0x087a:
            r2 = r0
            goto L_0x04b0
        L_0x087d:
            r44 = r2
            r21 = r3
        L_0x0881:
            if (r9 != 0) goto L_0x08ed
            android.content.Context r2 = r1.b     // Catch:{ all -> 0x08eb }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x08eb }
            android.content.SharedPreferences r2 = defpackage.gwk.l(r2)     // Catch:{ all -> 0x08eb }
            hag r3 = r5.p     // Catch:{ all -> 0x08eb }
            int r4 = r3.a     // Catch:{ all -> 0x08eb }
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0898
            java.lang.String r3 = r3.d     // Catch:{ all -> 0x08eb }
            goto L_0x089a
        L_0x0898:
            r3 = r21
        L_0x089a:
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x08eb }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x08eb }
            java.lang.String r4 = "CheckinService_last_checkin_ms_"
            java.lang.String r6 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x08eb }
            int r8 = r6.length()     // Catch:{ all -> 0x08eb }
            if (r8 != 0) goto L_0x08b4
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x08eb }
            r6.<init>(r4)     // Catch:{ all -> 0x08eb }
            goto L_0x08b8
        L_0x08b4:
            java.lang.String r6 = r4.concat(r6)     // Catch:{ all -> 0x08eb }
        L_0x08b8:
            android.content.SharedPreferences$Editor r2 = r2.putLong(r6, r11)     // Catch:{ all -> 0x08eb }
            r2.apply()     // Catch:{ all -> 0x08eb }
            iwd r2 = defpackage.gxw.a     // Catch:{ all -> 0x08eb }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x08eb }
            int r4 = r4.length()     // Catch:{ all -> 0x08eb }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x08eb }
            int r4 = r4 + 64
            r6.<init>(r4)     // Catch:{ all -> 0x08eb }
            java.lang.String r4 = "Recording last checkin time for package "
            r6.append(r4)     // Catch:{ all -> 0x08eb }
            r6.append(r3)     // Catch:{ all -> 0x08eb }
            java.lang.String r3 = " as "
            r6.append(r3)     // Catch:{ all -> 0x08eb }
            r6.append(r11)     // Catch:{ all -> 0x08eb }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x08eb }
            r4 = 0
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x08eb }
            r2.b(r3, r6)     // Catch:{ all -> 0x08eb }
            goto L_0x08ed
        L_0x08eb:
            r0 = move-exception
            goto L_0x087a
        L_0x08ed:
            android.content.Context r2 = r1.b     // Catch:{ all -> 0x0ab0 }
            android.content.SharedPreferences r2 = defpackage.gwk.l(r2)     // Catch:{ all -> 0x0ab0 }
            android.content.Intent r3 = new android.content.Intent     // Catch:{ all -> 0x0ab0 }
            java.lang.String r4 = "com.google.android.checkin.CHECKIN_COMPLETE"
            r3.<init>(r4)     // Catch:{ all -> 0x0ab0 }
            if (r9 == 0) goto L_0x0903
            java.lang.String r4 = "success"
            r6 = 0
            r3.putExtra(r4, r6)     // Catch:{ all -> 0x08eb }
            goto L_0x0916
        L_0x0903:
            java.lang.String r4 = "success"
            r6 = 1
            r3.putExtra(r4, r6)     // Catch:{ all -> 0x0ab0 }
            if (r10 == 0) goto L_0x0916
            boolean r4 = r10.isEmpty()     // Catch:{ all -> 0x08eb }
            if (r4 != 0) goto L_0x0916
            android.content.Context r4 = r1.b     // Catch:{ all -> 0x08eb }
            defpackage.gyc.a(r4)     // Catch:{ all -> 0x08eb }
        L_0x0916:
            android.content.Context r4 = r1.b     // Catch:{ all -> 0x0ab0 }
            r4.sendBroadcast(r3)     // Catch:{ all -> 0x0ab0 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0ab0 }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x0ab0 }
            java.lang.String r6 = "CheckinService_checkinCompleteBroadcastTime"
            android.content.SharedPreferences$Editor r2 = r2.putLong(r6, r3)     // Catch:{ all -> 0x0ab0 }
            r2.apply()     // Catch:{ all -> 0x0ab0 }
            if (r9 != 0) goto L_0x0990
            android.content.Context r2 = r1.b     // Catch:{ all -> 0x08eb }
            android.content.SharedPreferences r2 = defpackage.gwk.l(r2)     // Catch:{ all -> 0x08eb }
            if (r10 != 0) goto L_0x0937
            goto L_0x0983
        L_0x0937:
            boolean r3 = r10.isEmpty()     // Catch:{ all -> 0x08eb }
            if (r3 != 0) goto L_0x0983
            ob r3 = new ob     // Catch:{ all -> 0x08eb }
            int r4 = r10.size()     // Catch:{ all -> 0x08eb }
            r3.<init>((int) r4)     // Catch:{ all -> 0x08eb }
            java.util.Iterator r4 = r10.iterator()     // Catch:{ all -> 0x08eb }
        L_0x094a:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x08eb }
            if (r6 != 0) goto L_0x095e
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x08eb }
            java.lang.String r4 = "CheckinService_accountsReceivedByServer"
            android.content.SharedPreferences$Editor r2 = r2.putStringSet(r4, r3)     // Catch:{ all -> 0x08eb }
            r2.apply()     // Catch:{ all -> 0x08eb }
            goto L_0x0990
        L_0x095e:
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x08eb }
            android.accounts.Account r6 = (android.accounts.Account) r6     // Catch:{ all -> 0x08eb }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0981 }
            r8.<init>()     // Catch:{ JSONException -> 0x0981 }
            java.lang.String r10 = "authAccount"
            java.lang.String r11 = r6.name     // Catch:{ JSONException -> 0x0981 }
            org.json.JSONObject r8 = r8.put(r10, r11)     // Catch:{ JSONException -> 0x0981 }
            java.lang.String r10 = "accountType"
            java.lang.String r6 = r6.type     // Catch:{ JSONException -> 0x0981 }
            org.json.JSONObject r6 = r8.put(r10, r6)     // Catch:{ JSONException -> 0x0981 }
            java.lang.String r6 = r6.toString()     // Catch:{ JSONException -> 0x0981 }
            r3.add(r6)     // Catch:{ JSONException -> 0x0981 }
            goto L_0x094a
        L_0x0981:
            r0 = move-exception
            goto L_0x094a
        L_0x0983:
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x08eb }
            java.lang.String r3 = "CheckinService_accountsReceivedByServer"
            android.content.SharedPreferences$Editor r2 = r2.remove(r3)     // Catch:{ all -> 0x08eb }
            r2.apply()     // Catch:{ all -> 0x08eb }
        L_0x0990:
            boolean r2 = r5.d     // Catch:{ all -> 0x0ab0 }
            if (r2 != 0) goto L_0x099e
            if (r9 == 0) goto L_0x0999
            r2 = 8
            goto L_0x099b
        L_0x0999:
            r2 = 24
        L_0x099b:
            defpackage.gwd.a((int) r2)     // Catch:{ all -> 0x08eb }
        L_0x099e:
            gzh r2 = r1.i     // Catch:{ all -> 0x0ab0 }
            r2.f()     // Catch:{ all -> 0x0ab0 }
            r2 = r44
        L_0x09a5:
            long r3 = android.os.SystemClock.elapsedRealtime()
            iwd r5 = defpackage.gxw.a
            r6 = 1
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.Long r9 = java.lang.Long.valueOf(r3)
            r10 = 0
            r8[r10] = r9
            r9 = r39
            r5.b(r9, r8)
            r5 = 2
            java.lang.Object[] r8 = new java.lang.Object[r5]
            r8[r10] = r38
            long r3 = r3 - r22
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r8[r6] = r3
            defpackage.gwd.a((java.lang.Object[]) r8)
            gyb r3 = r1.f
            r4 = r36
            r3.a((long) r4, (defpackage.gvx) r2)
            r3 = r35
            boolean r3 = r7.getBoolean(r3, r10)
            if (r3 == 0) goto L_0x09e7
            iwd r3 = defpackage.gxw.a
            java.lang.Object[] r6 = new java.lang.Object[r10]
            r10 = r34
            r3.b(r10, r6)
            int r3 = r2.e
            r1.a((int) r3)
        L_0x09e7:
            iwd r3 = defpackage.gxw.a
            r6 = 2
            java.lang.Object[] r8 = new java.lang.Object[r6]
            int r6 = r2.e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9 = 0
            r8[r9] = r6
            long r9 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            r9 = 1
            r8[r9] = r6
            r6 = r26
            r3.c(r6, r8)
            int r3 = r2.e
            if (r3 == 0) goto L_0x0a6d
            if (r3 == r9) goto L_0x0a26
            r6 = 2
            if (r3 == r6) goto L_0x0a26
            gyb r3 = r1.f
            long r8 = android.os.SystemClock.elapsedRealtime()
            r3.a((long) r8, (android.os.Bundle) r7)
            gzh r3 = r1.i
            long r6 = defpackage.gxw.a()
            r3.a((long) r6)
            gxs r3 = r1.g
            r3.c(r4)
            goto L_0x0a72
        L_0x0a26:
            gxs r3 = r1.g
            r3.b(r4)
            r3 = 44
            amsk r3 = defpackage.amsk.a((char) r3)
            java.lang.String r4 = defpackage.awrq.m()
            java.util.List r3 = r3.c(r4)
            int r4 = r2.f
            java.lang.String r4 = java.lang.String.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x0a72
            r11 = r25
            r3 = 0
            int r4 = r7.getInt(r11, r3)
            r5 = 1
            int r4 = r4 + r5
            r7.putInt(r11, r4)
            iwd r4 = defpackage.gxw.a
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r12 = r27
            r4.b(r12, r3)
            gyb r3 = r1.f
            long r4 = android.os.SystemClock.elapsedRealtime()
            r3.a((long) r4, (android.os.Bundle) r7)
            gzh r3 = r1.i
            long r4 = defpackage.gxw.a()
            r3.a((long) r4)
            goto L_0x0a72
        L_0x0a6d:
            gxs r3 = r1.g
            r3.a(r4)
        L_0x0a72:
            gzh r3 = r1.i
            int r2 = r2.e
            r3.a((int) r2)
            gzh r2 = r1.i
            gzg r2 = r2.h()
            boolean r3 = defpackage.awrk.b()
            if (r3 == 0) goto L_0x0a8a
            gzj r3 = r1.h
            r3.a((defpackage.gzg) r2)
        L_0x0a8a:
            amri r2 = r1.j
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x0aaf
            amri r2 = r1.j
            java.lang.Object r2 = r2.b()
            acrz r2 = (defpackage.acrz) r2
            boolean r2 = r2.e()
            if (r2 == 0) goto L_0x0aaf
            amri r2 = r1.j
            java.lang.Object r2 = r2.b()
            acrz r2 = (defpackage.acrz) r2
            r2.c()
            ampu r2 = defpackage.ampu.a
            r1.j = r2
        L_0x0aaf:
            return
        L_0x0ab0:
            r0 = move-exception
            goto L_0x0ab5
        L_0x0ab2:
            r0 = move-exception
            r44 = r2
        L_0x0ab5:
            r11 = r25
            r6 = r26
            r12 = r27
            r10 = r34
            r3 = r35
            r4 = r36
            r9 = r39
            goto L_0x0b2c
        L_0x0ac5:
            r0 = move-exception
            r11 = r25
            r6 = r26
            r12 = r27
            r10 = r34
            r3 = r35
            r4 = r36
            r9 = r39
            goto L_0x0b2c
        L_0x0ad6:
            r0 = move-exception
            r11 = r25
            r6 = r26
            r12 = r27
            r10 = r34
            r3 = r35
            r4 = r36
            r9 = r39
            r1 = r40
            goto L_0x0b2c
        L_0x0ae9:
            r0 = move-exception
            r1 = r3
            r38 = r14
            r9 = r15
            r11 = r25
            r6 = r26
            r12 = r27
            r10 = r34
            r3 = r35
            goto L_0x0b2c
        L_0x0af9:
            r0 = move-exception
            r1 = r3
            r10 = r11
            r3 = r13
            r38 = r14
            r9 = r15
            r11 = r25
            r6 = r26
            r12 = r27
            goto L_0x0b2c
        L_0x0b07:
            r0 = move-exception
            r1 = r3
            r10 = r11
            r3 = r13
            r38 = r14
            r9 = r15
            r6 = r26
            goto L_0x0b19
        L_0x0b11:
            r0 = move-exception
            r1 = r3
            r10 = r11
            r6 = r12
            r3 = r13
            r38 = r14
            r9 = r15
        L_0x0b19:
            r12 = r27
            r11 = r2
            goto L_0x0b2c
        L_0x0b1d:
            r0 = move-exception
            r44 = r1
            r1 = r3
            r10 = r11
            r3 = r13
            r38 = r14
            r9 = r15
            r11 = r2
            r42 = r12
            r12 = r6
            r6 = r42
        L_0x0b2c:
            r2 = r0
        L_0x0b2d:
            r8 = r7
            r7 = r2
            r2 = r44
            goto L_0x0b67
        L_0x0b32:
            r0 = move-exception
            r44 = r1
            r1 = r3
            r10 = r11
            r3 = r13
            r38 = r14
            r9 = r15
            r11 = r2
            r42 = r12
            r12 = r6
            r6 = r42
            goto L_0x0b63
        L_0x0b42:
            r0 = move-exception
            r44 = r1
            r1 = r3
            r10 = r11
            r6 = r12
            r3 = r13
            r38 = r14
            r9 = r15
            r12 = r27
            goto L_0x0b62
        L_0x0b4f:
            r0 = move-exception
            r8 = r44
            r44 = r1
            r1 = r3
            goto L_0x0b5b
        L_0x0b56:
            r0 = move-exception
            r44 = r1
            r1 = r3
            r8 = r7
        L_0x0b5b:
            r6 = r12
            r3 = r13
            r38 = r14
            r9 = r15
            r12 = r10
            r10 = r11
        L_0x0b62:
            r11 = r2
        L_0x0b63:
            r2 = r0
        L_0x0b64:
            r7 = r2
            r2 = r44
        L_0x0b67:
            long r13 = android.os.SystemClock.elapsedRealtime()
            iwd r15 = defpackage.gxw.a
            r44 = r7
            r27 = r12
            r7 = 1
            java.lang.Object[] r12 = new java.lang.Object[r7]
            java.lang.Long r16 = java.lang.Long.valueOf(r13)
            r7 = 0
            r12[r7] = r16
            r15.b(r9, r12)
            r9 = 2
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r7] = r38
            long r13 = r13 - r22
            java.lang.Long r9 = java.lang.Long.valueOf(r13)
            r13 = 1
            r12[r13] = r9
            defpackage.gwd.a((java.lang.Object[]) r12)
            gyb r9 = r1.f
            r9.a((long) r4, (defpackage.gvx) r2)
            boolean r3 = r8.getBoolean(r3, r7)
            if (r3 == 0) goto L_0x0ba6
            iwd r3 = defpackage.gxw.a
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r3.b(r10, r9)
            int r3 = r2.e
            r1.a((int) r3)
        L_0x0ba6:
            iwd r3 = defpackage.gxw.a
            r7 = 2
            java.lang.Object[] r9 = new java.lang.Object[r7]
            int r7 = r2.e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10 = 0
            r9[r10] = r7
            long r12 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r7 = java.lang.Long.valueOf(r12)
            r10 = 1
            r9[r10] = r7
            r3.c(r6, r9)
            int r3 = r2.e
            if (r3 == 0) goto L_0x0c28
            if (r3 == r10) goto L_0x0be3
            r6 = 2
            if (r3 == r6) goto L_0x0be3
            gyb r3 = r1.f
            long r6 = android.os.SystemClock.elapsedRealtime()
            r3.a((long) r6, (android.os.Bundle) r8)
            gzh r3 = r1.i
            long r6 = defpackage.gxw.a()
            r3.a((long) r6)
            gxs r3 = r1.g
            r3.c(r4)
            goto L_0x0c2d
        L_0x0be3:
            gxs r3 = r1.g
            r3.b(r4)
            r3 = 44
            amsk r3 = defpackage.amsk.a((char) r3)
            java.lang.String r4 = defpackage.awrq.m()
            java.util.List r3 = r3.c(r4)
            int r4 = r2.f
            java.lang.String r4 = java.lang.String.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x0c2d
            r3 = 0
            int r4 = r8.getInt(r11, r3)
            r5 = 1
            int r4 = r4 + r5
            r8.putInt(r11, r4)
            iwd r4 = defpackage.gxw.a
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r5 = r27
            r4.b(r5, r3)
            gyb r3 = r1.f
            long r4 = android.os.SystemClock.elapsedRealtime()
            r3.a((long) r4, (android.os.Bundle) r8)
            gzh r3 = r1.i
            long r4 = defpackage.gxw.a()
            r3.a((long) r4)
            goto L_0x0c2d
        L_0x0c28:
            gxs r3 = r1.g
            r3.a(r4)
        L_0x0c2d:
            gzh r3 = r1.i
            int r2 = r2.e
            r3.a((int) r2)
            gzh r2 = r1.i
            gzg r2 = r2.h()
            boolean r3 = defpackage.awrk.b()
            if (r3 == 0) goto L_0x0c45
            gzj r3 = r1.h
            r3.a((defpackage.gzg) r2)
        L_0x0c45:
            amri r2 = r1.j
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x0c6a
            amri r2 = r1.j
            java.lang.Object r2 = r2.b()
            acrz r2 = (defpackage.acrz) r2
            boolean r2 = r2.e()
            if (r2 == 0) goto L_0x0c6a
            amri r2 = r1.j
            java.lang.Object r2 = r2.b()
            acrz r2 = (defpackage.acrz) r2
            r2.c()
            ampu r2 = defpackage.ampu.a
            r1.j = r2
        L_0x0c6a:
            throw r44
        L_0x0c6b:
            iwd r1 = defpackage.gxw.a
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "GmsCore checkin is not enabled."
            r1.c(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.checkin.CheckinIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
