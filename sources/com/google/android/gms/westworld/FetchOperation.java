package com.google.android.gms.westworld;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FetchOperation extends IntentOperation {
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0072, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f4, code lost:
        return r5;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:76:0x0116=Splitter:B:76:0x0116, B:18:0x0047=Splitter:B:18:0x0047, B:68:0x0109=Splitter:B:68:0x0109} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized java.util.Set a(android.content.Context r5, android.content.Intent r6, int r7) {
        /*
            java.lang.Class<com.google.android.gms.westworld.FetchOperation> r0 = com.google.android.gms.westworld.FetchOperation.class
            monitor-enter(r0)
            android.content.SharedPreferences r1 = defpackage.aecq.d(r5)     // Catch:{ all -> 0x0124 }
            boolean r2 = defpackage.jkr.h()     // Catch:{ all -> 0x0124 }
            r3 = 3
            if (r2 == 0) goto L_0x0109
            java.lang.String r2 = "SENT_CONFIGS"
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0124 }
            if (r1 != 0) goto L_0x0018
            goto L_0x0109
        L_0x0018:
            java.lang.String r1 = "FETCH_CONFIG_ID"
            boolean r1 = r6.hasExtra(r1)     // Catch:{ all -> 0x0124 }
            if (r1 == 0) goto L_0x0083
            java.lang.String r1 = "FETCH_CONFIG_ID"
            long r2 = defpackage.azws.f()     // Catch:{ all -> 0x0124 }
            long r1 = r6.getLongExtra(r1, r2)     // Catch:{ all -> 0x0124 }
            java.lang.String r3 = r6.getAction()     // Catch:{ all -> 0x0124 }
            if (r3 == 0) goto L_0x0047
            java.lang.String r6 = r6.getAction()     // Catch:{ all -> 0x0124 }
            java.lang.String r3 = "com.google.android.gms.westworld.action.DEACTIVATE"
            boolean r6 = r6.equals(r3)     // Catch:{ all -> 0x0124 }
            if (r6 != 0) goto L_0x003d
            goto L_0x0047
        L_0x003d:
            java.lang.Long r5 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0124 }
            anax r5 = defpackage.anax.a((java.lang.Object) r5)     // Catch:{ all -> 0x0124 }
            monitor-exit(r0)
            return r5
        L_0x0047:
            android.content.SharedPreferences r5 = defpackage.aecq.d(r5)     // Catch:{ all -> 0x0124 }
            java.lang.String r6 = "ACTIVE_CONFIGS"
            anfv r3 = defpackage.anfv.a     // Catch:{ all -> 0x0124 }
            java.util.Set r5 = r5.getStringSet(r6, r3)     // Catch:{ all -> 0x0124 }
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0124 }
            boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x0124 }
            if (r5 == 0) goto L_0x0080
            boolean r5 = defpackage.azwv.h()     // Catch:{ all -> 0x0124 }
            if (r5 == 0) goto L_0x0076
            boolean r5 = defpackage.aecq.a((long) r1, (int) r7)     // Catch:{ all -> 0x0124 }
            if (r5 == 0) goto L_0x0073
            java.lang.Long r5 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0124 }
            anax r5 = defpackage.anax.a((java.lang.Object) r5)     // Catch:{ all -> 0x0124 }
        L_0x0071:
            monitor-exit(r0)
            return r5
        L_0x0073:
            anfv r5 = defpackage.anfv.a     // Catch:{ all -> 0x0124 }
            goto L_0x0071
        L_0x0076:
            java.lang.Long r5 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0124 }
            anax r5 = defpackage.anax.a((java.lang.Object) r5)     // Catch:{ all -> 0x0124 }
        L_0x007e:
            monitor-exit(r0)
            return r5
        L_0x0080:
            anfv r5 = defpackage.anfv.a     // Catch:{ all -> 0x0124 }
            goto L_0x007e
        L_0x0083:
            java.lang.String r1 = "FETCH_PERIOD_EXTRA"
            boolean r1 = r6.hasExtra(r1)     // Catch:{ all -> 0x0124 }
            if (r1 == 0) goto L_0x00f5
            android.content.SharedPreferences r5 = defpackage.aecq.d(r5)     // Catch:{ all -> 0x0124 }
            java.lang.String r1 = "SENT_CONFIGS"
            r2 = 0
            java.util.Set r1 = r5.getStringSet(r1, r2)     // Catch:{ all -> 0x0124 }
            boolean r3 = defpackage.jkr.h()     // Catch:{ all -> 0x0124 }
            if (r3 == 0) goto L_0x00a3
            java.lang.String r1 = "ACTIVE_CONFIGS"
            java.util.Set r1 = r5.getStringSet(r1, r2)     // Catch:{ all -> 0x0124 }
            goto L_0x00a4
        L_0x00a3:
        L_0x00a4:
            if (r1 != 0) goto L_0x00a7
            goto L_0x00f1
        L_0x00a7:
            boolean r5 = r1.isEmpty()     // Catch:{ all -> 0x0124 }
            if (r5 != 0) goto L_0x00f1
            java.lang.String r5 = "FETCH_PERIOD_EXTRA"
            r2 = -1
            int r5 = r6.getIntExtra(r5, r2)     // Catch:{ all -> 0x0124 }
            bbx r5 = defpackage.bbx.a(r5)     // Catch:{ all -> 0x0124 }
            anav r6 = defpackage.anax.j()     // Catch:{ all -> 0x0124 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0124 }
        L_0x00c0:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0124 }
            if (r2 == 0) goto L_0x00ec
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0124 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0124 }
            long r2 = java.lang.Long.parseLong(r2)     // Catch:{ all -> 0x0124 }
            boolean r4 = defpackage.azwv.h()     // Catch:{ all -> 0x0124 }
            if (r4 == 0) goto L_0x00dc
            boolean r4 = defpackage.aecq.a((long) r2, (int) r7)     // Catch:{ all -> 0x0124 }
            if (r4 == 0) goto L_0x00c0
        L_0x00dc:
            if (r5 == 0) goto L_0x00c0
            bbx r4 = defpackage.aecq.a((long) r2)     // Catch:{ all -> 0x0124 }
            if (r4 != r5) goto L_0x00c0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0124 }
            r6.b(r2)     // Catch:{ all -> 0x0124 }
            goto L_0x00c0
        L_0x00ec:
            anax r5 = r6.a()     // Catch:{ all -> 0x0124 }
            goto L_0x00f3
        L_0x00f1:
            anfv r5 = defpackage.anfv.a     // Catch:{ all -> 0x0124 }
        L_0x00f3:
            monitor-exit(r0)
            return r5
        L_0x00f5:
            if (r7 != r3) goto L_0x0105
            long r5 = defpackage.azws.f()     // Catch:{ all -> 0x0124 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0124 }
            anax r5 = defpackage.anax.a((java.lang.Object) r5)     // Catch:{ all -> 0x0124 }
            monitor-exit(r0)
            return r5
        L_0x0105:
            anfv r5 = defpackage.anfv.a     // Catch:{ all -> 0x0124 }
            monitor-exit(r0)
            return r5
        L_0x0109:
            boolean r5 = defpackage.azwv.h()     // Catch:{ all -> 0x0124 }
            if (r5 != 0) goto L_0x0110
            goto L_0x0116
        L_0x0110:
            if (r7 == r3) goto L_0x0116
            anfv r5 = defpackage.anfv.a     // Catch:{ all -> 0x0124 }
            monitor-exit(r0)
            return r5
        L_0x0116:
            long r5 = defpackage.azws.f()     // Catch:{ all -> 0x0124 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0124 }
            anax r5 = defpackage.anax.a((java.lang.Object) r5)     // Catch:{ all -> 0x0124 }
            monitor-exit(r0)
            return r5
        L_0x0124:
            r5 = move-exception
            monitor-exit(r0)
            goto L_0x0128
        L_0x0127:
            throw r5
        L_0x0128:
            goto L_0x0127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.westworld.FetchOperation.a(android.content.Context, android.content.Intent, int):java.util.Set");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f0, code lost:
        if (r17 == false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f3, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void b(android.content.Context r21, defpackage.iby r22, defpackage.aupy r23, defpackage.hph r24, android.content.Intent r25) {
        /*
            r0 = r21
            r9 = r22
            r10 = r23
            r11 = r25
            java.lang.Class<com.google.android.gms.westworld.FetchOperation> r12 = com.google.android.gms.westworld.FetchOperation.class
            monitor-enter(r12)
            java.lang.String r1 = "stats"
            java.lang.Object r1 = r0.getSystemService(r1)     // Catch:{ all -> 0x0125 }
            r13 = r1
            android.app.StatsManager r13 = (android.app.StatsManager) r13     // Catch:{ all -> 0x0125 }
            if (r13 != 0) goto L_0x0023
            java.lang.String r0 = "FetchDataFailsStatsManager"
            r14 = r24
            hox r0 = r14.c(r0)     // Catch:{ all -> 0x0125 }
            r0.a()     // Catch:{ all -> 0x0125 }
            monitor-exit(r12)
            return
        L_0x0023:
            r14 = r24
            boolean r1 = defpackage.azwp.b()     // Catch:{ all -> 0x0125 }
            r15 = 3
            r16 = 4
            r17 = 0
            r2 = 2
            r8 = 1
            if (r1 == 0) goto L_0x0081
            java.lang.String r1 = r25.getAction()     // Catch:{ all -> 0x0125 }
            if (r1 == 0) goto L_0x0081
            java.lang.String r1 = r25.getAction()     // Catch:{ all -> 0x0125 }
            int r3 = r1.hashCode()     // Catch:{ all -> 0x0125 }
            r4 = -320798471(0xffffffffece100f9, float:-2.1761032E27)
            if (r3 == r4) goto L_0x0064
            r4 = -18818161(0xfffffffffee0db8f, float:-1.4944354E38)
            if (r3 == r4) goto L_0x005a
            r4 = 447397516(0x1aaabe8c, float:7.06182E-23)
            if (r3 == r4) goto L_0x0050
            goto L_0x006e
        L_0x0050:
            java.lang.String r3 = "com.google.android.gms.westworld.action.ALARM"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0125 }
            if (r1 == 0) goto L_0x006e
            r1 = 1
            goto L_0x006f
        L_0x005a:
            java.lang.String r3 = "com.android.server.stats.action.TRIGGER_COLLECTION"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0125 }
            if (r1 == 0) goto L_0x006e
            r1 = 0
            goto L_0x006f
        L_0x0064:
            java.lang.String r3 = "com.google.android.gms.westworld.action.DEACTIVATE"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0125 }
            if (r1 == 0) goto L_0x006e
            r1 = 2
            goto L_0x006f
        L_0x006e:
            r1 = -1
        L_0x006f:
            if (r1 == 0) goto L_0x007e
            if (r1 == r8) goto L_0x007b
            if (r1 == r2) goto L_0x0078
            r18 = 1
            goto L_0x0083
        L_0x0078:
            r18 = 4
            goto L_0x0083
        L_0x007b:
            r18 = 2
            goto L_0x0083
        L_0x007e:
            r18 = 3
            goto L_0x0083
        L_0x0081:
            r18 = 1
        L_0x0083:
            boolean r1 = defpackage.jkr.h()     // Catch:{ all -> 0x0125 }
            if (r1 == 0) goto L_0x00f6
            boolean r1 = defpackage.azwv.h()     // Catch:{ all -> 0x0125 }
            if (r1 == 0) goto L_0x00f6
            java.util.Set r1 = a(r0, r11, r2)     // Catch:{ all -> 0x0125 }
            java.util.Iterator r19 = r1.iterator()     // Catch:{ all -> 0x0125 }
        L_0x0097:
            boolean r1 = r19.hasNext()     // Catch:{ all -> 0x0125 }
            if (r1 == 0) goto L_0x00b9
            java.lang.Object r1 = r19.next()     // Catch:{ all -> 0x0125 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0125 }
            long r6 = r1.longValue()     // Catch:{ all -> 0x0125 }
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r13
            r20 = 1
            r8 = r18
            a(r1, r2, r3, r4, r5, r6, r8)     // Catch:{ all -> 0x0125 }
            r8 = 1
            goto L_0x0097
        L_0x00b9:
            r20 = 1
            if (r9 == 0) goto L_0x00c8
            java.lang.String r1 = defpackage.azwv.m()     // Catch:{ all -> 0x0125 }
            boolean r1 = defpackage.aecq.a((defpackage.iby) r9, (java.lang.String) r1)     // Catch:{ all -> 0x0125 }
            if (r1 == 0) goto L_0x00f2
            goto L_0x00f6
        L_0x00c8:
            if (r10 == 0) goto L_0x00f4
            boolean r1 = r10.c     // Catch:{ all -> 0x0125 }
            if (r1 == 0) goto L_0x00e7
            boolean r1 = defpackage.azux.b()     // Catch:{ all -> 0x0125 }
            if (r1 != 0) goto L_0x00dc
            boolean r1 = r10.d     // Catch:{ all -> 0x0125 }
            if (r1 != 0) goto L_0x00d9
            goto L_0x00dc
        L_0x00d9:
            r17 = 1
            goto L_0x00e8
        L_0x00dc:
            boolean r1 = defpackage.azux.b()     // Catch:{ all -> 0x0125 }
            if (r1 == 0) goto L_0x00e7
            boolean r1 = r10.b     // Catch:{ all -> 0x0125 }
            if (r1 == 0) goto L_0x00e7
            goto L_0x00d9
        L_0x00e7:
        L_0x00e8:
            boolean r1 = r10.e     // Catch:{ all -> 0x0125 }
            if (r1 != 0) goto L_0x00f6
            boolean r1 = r10.b     // Catch:{ all -> 0x0125 }
            if (r1 != 0) goto L_0x00f6
            if (r17 != 0) goto L_0x00f6
        L_0x00f2:
            monitor-exit(r12)
            return
        L_0x00f4:
            monitor-exit(r12)
            return
        L_0x00f6:
            boolean r1 = defpackage.azux.b()     // Catch:{ all -> 0x0125 }
            if (r1 != 0) goto L_0x00fd
            goto L_0x00fe
        L_0x00fd:
            r15 = 4
        L_0x00fe:
            java.util.Set r1 = a(r0, r11, r15)     // Catch:{ all -> 0x0125 }
            java.util.Iterator r11 = r1.iterator()     // Catch:{ all -> 0x0125 }
        L_0x0106:
            boolean r1 = r11.hasNext()     // Catch:{ all -> 0x0125 }
            if (r1 == 0) goto L_0x00f2
            java.lang.Object r1 = r11.next()     // Catch:{ all -> 0x0125 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0125 }
            long r6 = r1.longValue()     // Catch:{ all -> 0x0125 }
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r13
            r8 = r18
            a(r1, r2, r3, r4, r5, r6, r8)     // Catch:{ all -> 0x0125 }
            goto L_0x0106
        L_0x0125:
            r0 = move-exception
            monitor-exit(r12)
            goto L_0x0129
        L_0x0128:
            throw r0
        L_0x0129:
            goto L_0x0128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.westworld.FetchOperation.b(android.content.Context, iby, aupy, hph, android.content.Intent):void");
    }

    public final void onHandleIntent(Intent intent) {
        iby iby;
        if (!aecm.a()) {
            ihs b = ihs.b();
            hph f = aecq.f(b);
            aupy aupy = null;
            if (azvd.b()) {
                iby = adrz.a(ihs.b(), new adry());
            } else {
                aupy = aecq.a((Context) ihs.b());
                iby = null;
            }
            try {
                f.c("FetchOperationEntered").a();
                if (aecq.a(aupy, iby)) {
                    f.c("FetchOperationCanCollect").a();
                    a(b, iby, aupy, f, intent);
                    if (!jkr.h()) {
                        DataAlarmOperation.a(b, Long.valueOf(azwc.b()), f, bbx.UNKNOWN_PERIOD, true);
                    }
                }
            } finally {
                f.d();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r14.c("FetchDataFailsStatsUnavailable").a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x019b, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0190 A[ExcHandler: StatsUnavailableException (e android.app.StatsManager$StatsUnavailableException), Splitter:B:2:0x0004] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void a(android.content.Context r11, defpackage.iby r12, defpackage.aupy r13, defpackage.hph r14, android.app.StatsManager r15, long r16, int r18) {
        /*
            r4 = r14
            java.lang.Class<com.google.android.gms.westworld.FetchOperation> r7 = com.google.android.gms.westworld.FetchOperation.class
            monitor-enter(r7)
            byte[] r0 = r15.getReports(r16)     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0184 }
            boolean r1 = defpackage.azuu.b()     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            r2 = 0
            if (r1 == 0) goto L_0x00a9
            android.content.SharedPreferences r1 = defpackage.aecq.d(r11)     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            java.lang.String r3 = "KEEP_UID_MAP_CONFIGS"
            anfv r5 = defpackage.anfv.a     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            java.util.Set r1 = r1.getStringSet(r3, r5)     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            java.lang.String r3 = java.lang.String.valueOf(r16)     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            boolean r1 = r1.contains(r3)     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            if (r1 == 0) goto L_0x0027
            goto L_0x00a9
        L_0x0027:
            aubs r1 = defpackage.aubs.c()     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            aupt r3 = defpackage.aupt.b     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r3, (byte[]) r0, (defpackage.aubs) r1)     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            aupt r0 = (defpackage.aupt) r0     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            aupt r1 = defpackage.aupt.b     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            aucd r1 = r1.o()     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            aucx r0 = r0.a     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
        L_0x003f:
            boolean r3 = r0.hasNext()     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            if (r3 != 0) goto L_0x0050
            aucj r0 = r1.i()     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            aupt r0 = (defpackage.aupt) r0     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            byte[] r0 = r0.k()     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            goto L_0x00a9
        L_0x0050:
            java.lang.Object r3 = r0.next()     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            aupu r3 = (defpackage.aupu) r3     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            r5 = 5
            java.lang.Object r5 = r3.c(r5)     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            aucd r5 = (defpackage.aucd) r5     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            r5.a((defpackage.aucj) r3)     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            boolean r3 = r5.c     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            if (r3 != 0) goto L_0x0065
            goto L_0x006a
        L_0x0065:
            r5.c()     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            r5.c = r2     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
        L_0x006a:
            aucj r3 = r5.b     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            aupu r3 = (defpackage.aupu) r3     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            aupu r6 = defpackage.aupu.c     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            int r6 = r3.a     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            r6 = r6 & -2
            r3.a = r6     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            aupu r6 = defpackage.aupu.c     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            auay r6 = r6.b     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            r3.b = r6     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            aucj r3 = r5.i()     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            aupu r3 = (defpackage.aupu) r3     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            boolean r5 = r1.c     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            if (r5 != 0) goto L_0x0087
            goto L_0x008c
        L_0x0087:
            r1.c()     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            r1.c = r2     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
        L_0x008c:
            aucj r5 = r1.b     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            aupt r5 = (defpackage.aupt) r5     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            r3.getClass()     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            aucx r6 = r5.a     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            boolean r6 = r6.a()     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            if (r6 != 0) goto L_0x00a3
            aucx r6 = r5.a     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            aucx r6 = defpackage.aucj.a((defpackage.aucx) r6)     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            r5.a = r6     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
        L_0x00a3:
            aucx r5 = r5.a     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            r5.add(r3)     // Catch:{ StatsUnavailableException -> 0x0190, auda -> 0x0180 }
            goto L_0x003f
        L_0x00a9:
            if (r0 == 0) goto L_0x0175
            auqa r1 = defpackage.auqa.g     // Catch:{ all -> 0x0182 }
            aucd r5 = r1.o()     // Catch:{ all -> 0x0182 }
            auay r0 = defpackage.auay.a((byte[]) r0)     // Catch:{ all -> 0x0182 }
            boolean r1 = r5.c     // Catch:{ all -> 0x0182 }
            if (r1 == 0) goto L_0x00be
            r5.c()     // Catch:{ all -> 0x0182 }
            r5.c = r2     // Catch:{ all -> 0x0182 }
        L_0x00be:
            aucj r1 = r5.b     // Catch:{ all -> 0x0182 }
            auqa r1 = (defpackage.auqa) r1     // Catch:{ all -> 0x0182 }
            r0.getClass()     // Catch:{ all -> 0x0182 }
            r3 = 1
            r1.b = r3     // Catch:{ all -> 0x0182 }
            r1.c = r0     // Catch:{ all -> 0x0182 }
            boolean r0 = defpackage.azwp.b()     // Catch:{ all -> 0x0182 }
            if (r0 == 0) goto L_0x00e8
            boolean r0 = r5.c     // Catch:{ all -> 0x0182 }
            if (r0 != 0) goto L_0x00d5
            goto L_0x00da
        L_0x00d5:
            r5.c()     // Catch:{ all -> 0x0182 }
            r5.c = r2     // Catch:{ all -> 0x0182 }
        L_0x00da:
            aucj r0 = r5.b     // Catch:{ all -> 0x0182 }
            auqa r0 = (defpackage.auqa) r0     // Catch:{ all -> 0x0182 }
            int r1 = r18 + -1
            r0.f = r1     // Catch:{ all -> 0x0182 }
            int r1 = r0.a     // Catch:{ all -> 0x0182 }
            r1 = r1 | 256(0x100, float:3.59E-43)
            r0.a = r1     // Catch:{ all -> 0x0182 }
        L_0x00e8:
            hol r0 = defpackage.aecq.e(r11)     // Catch:{ all -> 0x0182 }
            boolean r1 = defpackage.azwv.h()     // Catch:{ all -> 0x0182 }
            if (r1 == 0) goto L_0x0111
            int r1 = defpackage.aecq.b((long) r16)     // Catch:{ all -> 0x0182 }
            r2 = 2
            if (r1 == r2) goto L_0x00fb
            r3 = r11
            goto L_0x0112
        L_0x00fb:
            hol r0 = defpackage.aecq.c     // Catch:{ all -> 0x0182 }
            if (r0 != 0) goto L_0x010d
            hol r0 = new hol     // Catch:{ all -> 0x0182 }
            java.lang.String r1 = defpackage.azwv.n()     // Catch:{ all -> 0x0182 }
            r2 = 0
            r3 = r11
            r0.<init>(r11, r1, r2)     // Catch:{ all -> 0x0182 }
            defpackage.aecq.c = r0     // Catch:{ all -> 0x0182 }
            goto L_0x010e
        L_0x010d:
            r3 = r11
        L_0x010e:
            hol r0 = defpackage.aecq.c     // Catch:{ all -> 0x0182 }
            goto L_0x0112
        L_0x0111:
            r3 = r11
        L_0x0112:
            java.lang.String r1 = "DataUploaded"
            hox r1 = r14.c(r1)     // Catch:{ all -> 0x0182 }
            r1.a()     // Catch:{ all -> 0x0182 }
            long r1 = defpackage.azws.f()     // Catch:{ all -> 0x0182 }
            long r1 = r16 - r1
            r6 = 4
            long r1 = r1 >> r6
            r8 = 15
            long r1 = r1 & r8
            int r2 = (int) r1     // Catch:{ all -> 0x0182 }
            avsd r1 = defpackage.avsd.a(r2)     // Catch:{ all -> 0x0182 }
            if (r1 != 0) goto L_0x0138
            long r1 = defpackage.azvz.b()     // Catch:{ all -> 0x0182 }
            int r2 = (int) r1     // Catch:{ all -> 0x0182 }
            avsd r1 = defpackage.avsd.a(r2)     // Catch:{ all -> 0x0182 }
            r6 = r1
            goto L_0x0139
        L_0x0138:
            r6 = r1
        L_0x0139:
            boolean r1 = defpackage.azui.b()     // Catch:{ all -> 0x0182 }
            if (r1 == 0) goto L_0x016b
            long r1 = defpackage.azws.f()     // Catch:{ all -> 0x0182 }
            long r1 = r16 - r1
            r8 = 8192(0x2000, double:4.0474E-320)
            long r1 = r1 & r8
            r8 = 0
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x016b
            hol r0 = defpackage.aecq.b     // Catch:{ all -> 0x0182 }
            if (r0 != 0) goto L_0x0160
            android.content.Context r0 = r11.getApplicationContext()     // Catch:{ all -> 0x0182 }
            java.lang.String r1 = defpackage.azwv.b()     // Catch:{ all -> 0x0182 }
            hol r0 = defpackage.hol.a((android.content.Context) r0, (java.lang.String) r1)     // Catch:{ all -> 0x0182 }
            defpackage.aecq.b = r0     // Catch:{ all -> 0x0182 }
        L_0x0160:
            hol r0 = defpackage.aecq.b     // Catch:{ all -> 0x0182 }
            if (r12 != 0) goto L_0x0166
            r2 = r0
            goto L_0x016d
        L_0x0166:
            defpackage.aecq.a((defpackage.aucd) r5, (defpackage.avsd) r6)     // Catch:{ all -> 0x0182 }
            monitor-exit(r7)
            return
        L_0x016b:
            r2 = r0
        L_0x016d:
            r1 = r12
            r3 = r13
            r4 = r14
            defpackage.aecq.a(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0182 }
            monitor-exit(r7)
            return
        L_0x0175:
            java.lang.String r0 = "FetchDataFailsStatsUnavailable"
            hox r0 = r14.c(r0)     // Catch:{ all -> 0x0182 }
            r0.a()     // Catch:{ all -> 0x0182 }
            monitor-exit(r7)
            return
        L_0x0180:
            r0 = move-exception
            goto L_0x0185
        L_0x0182:
            r0 = move-exception
            goto L_0x019c
        L_0x0184:
            r0 = move-exception
        L_0x0185:
            java.lang.String r0 = "InvalidMetricsReportProto"
            hox r0 = r14.c(r0)     // Catch:{ all -> 0x0182 }
            r0.a()     // Catch:{ all -> 0x0182 }
            monitor-exit(r7)
            return
        L_0x0190:
            r0 = move-exception
            java.lang.String r0 = "FetchDataFailsStatsUnavailable"
            hox r0 = r14.c(r0)     // Catch:{ all -> 0x0182 }
            r0.a()     // Catch:{ all -> 0x0182 }
            monitor-exit(r7)
            return
        L_0x019c:
            monitor-exit(r7)
            goto L_0x019f
        L_0x019e:
            throw r0
        L_0x019f:
            goto L_0x019e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.westworld.FetchOperation.a(android.content.Context, iby, aupy, hph, android.app.StatsManager, long, int):void");
    }

    static synchronized void a(Context context, iby iby, aupy aupy, hph hph, Intent intent) {
        synchronized (FetchOperation.class) {
            long longExtra = intent.getLongExtra("android.app.extra.LAST_REPORT_TIME", 0);
            hph.c("FetchData").a();
            SharedPreferences d = aecq.d(context);
            if (longExtra == d.getLong("LAST_REPORT_TIME", 0)) {
                hph.c("FetchDataSameRequest").a();
                return;
            }
            d.edit().putLong("LAST_REPORT_TIME", longExtra).apply();
            b(context, iby, aupy, hph, intent);
        }
    }
}
