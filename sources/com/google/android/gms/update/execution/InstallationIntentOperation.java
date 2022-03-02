package com.google.android.gms.update.execution;

import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InstallationIntentOperation extends IntentOperation {
    private static final iwd a = adnt.e("InstallationIntentOperation");
    private static final anax b = anax.a((Object) "com.google.android.gms.update.INSTALL_UPDATE", (Object) "com.google.android.gms.update.SCHEDULED_INSTALL");

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0071, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x013d, code lost:
        r2.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0141, code lost:
        if (r5 == null) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r0 = r5.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0145, code lost:
        if (r0 == null) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r0.call();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x014b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        defpackage.adlp.a.e("Error when executing onStatePersistedCallback.", r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0158, code lost:
        if (r5 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r0 = r5.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015c, code lost:
        if (r0 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r0.call();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0163, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        defpackage.adlp.a.e("Error when executing onStatePersistedCallback.", r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r2.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0174, code lost:
        if (r5 == null) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r0 = r5.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0178, code lost:
        if (r0 == null) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r0.call();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x017e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        defpackage.adlp.a.e("Error when executing onStatePersistedCallback.", r0, new java.lang.Object[0]);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r17) {
        /*
            r16 = this;
            iwd r0 = a
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r17
            java.lang.String r4 = "Received intent: %s."
            r0.c(r4, r2)
            anax r0 = b
            java.lang.String r2 = r17.getAction()
            java.lang.String r2 = defpackage.amrk.b(r2)
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x01af
            boolean r0 = defpackage.adke.a(r16)
            if (r0 == 0) goto L_0x01af
            adqz r0 = defpackage.adlp.b
            java.lang.Object r0 = r0.b()
            r2 = r0
            adlp r2 = (defpackage.adlp) r2
            java.lang.Object r4 = r2.g
            monitor-enter(r4)
            java.lang.Object r5 = r2.f     // Catch:{ all -> 0x01ac }
            monitor-enter(r5)     // Catch:{ all -> 0x01ac }
            adrn r0 = r2.d     // Catch:{ all -> 0x01a9 }
            adro r6 = defpackage.adls.a     // Catch:{ all -> 0x01a9 }
            java.lang.Object r0 = r0.b(r6)     // Catch:{ all -> 0x01a9 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01a9 }
            boolean r6 = defpackage.amrk.a((java.lang.String) r0)     // Catch:{ all -> 0x01a9 }
            if (r6 == 0) goto L_0x006d
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01a9 }
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x01a9 }
            adrn r6 = r2.d     // Catch:{ all -> 0x01a9 }
            adrc[] r7 = new defpackage.adrc[r1]     // Catch:{ all -> 0x01a9 }
            adrc r8 = new adrc     // Catch:{ all -> 0x01a9 }
            adro r9 = defpackage.adls.a     // Catch:{ all -> 0x01a9 }
            r8.<init>(r9, r0)     // Catch:{ all -> 0x01a9 }
            r7[r3] = r8     // Catch:{ all -> 0x01a9 }
            r6.a((defpackage.adrc[]) r7)     // Catch:{ all -> 0x01a9 }
            adns r6 = r2.e     // Catch:{ all -> 0x01a9 }
            adrn r6 = r6.b     // Catch:{ all -> 0x01a9 }
            adrc[] r7 = new defpackage.adrc[r1]     // Catch:{ all -> 0x01a9 }
            adro r8 = defpackage.adns.a     // Catch:{ all -> 0x01a9 }
            adrc r8 = r8.b(r0)     // Catch:{ all -> 0x01a9 }
            r7[r3] = r8     // Catch:{ all -> 0x01a9 }
            r6.a((defpackage.adrc[]) r7)     // Catch:{ all -> 0x01a9 }
            r6 = r0
            goto L_0x006e
        L_0x006d:
            r6 = r0
        L_0x006e:
            r2.i = r3     // Catch:{ all -> 0x01a9 }
            monitor-exit(r5)     // Catch:{ all -> 0x01a9 }
        L_0x0071:
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01ac }
            adlm r0 = r2.c()     // Catch:{ all -> 0x01ac }
            adln r5 = new adln     // Catch:{ all -> 0x01ac }
            r5.<init>(r2)     // Catch:{ all -> 0x01ac }
            java.lang.Object r9 = r0.b     // Catch:{ all -> 0x01ac }
            monitor-enter(r9)     // Catch:{ all -> 0x01ac }
            amri r5 = defpackage.amri.b(r5)     // Catch:{ all -> 0x01a6 }
            r0.c = r5     // Catch:{ all -> 0x01a6 }
            monitor-exit(r9)     // Catch:{ all -> 0x01a6 }
            adll r5 = r0.c()     // Catch:{ all -> 0x01ac }
            iwd r9 = defpackage.adlp.a     // Catch:{ all -> 0x01ac }
            r10 = 2
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ all -> 0x01ac }
            java.lang.String r12 = r0.a     // Catch:{ all -> 0x01ac }
            r11[r3] = r12     // Catch:{ all -> 0x01ac }
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01ac }
            long r12 = r12 - r7
            double r12 = (double) r12
            r14 = 4652007308841189376(0x408f400000000000, double:1000.0)
            java.lang.Double.isNaN(r12)
            double r12 = r12 / r14
            java.lang.Double r12 = java.lang.Double.valueOf(r12)     // Catch:{ all -> 0x01ac }
            r11[r1] = r12     // Catch:{ all -> 0x01ac }
            java.lang.String r12 = "Action %s executed for %.2f seconds."
            r9.c(r12, r11)     // Catch:{ all -> 0x01ac }
            java.lang.String r0 = r0.a     // Catch:{ all -> 0x01ac }
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01ac }
            long r11 = r11 - r7
            anqc r7 = defpackage.anqc.d     // Catch:{ all -> 0x01ac }
            aucd r7 = r7.o()     // Catch:{ all -> 0x01ac }
            boolean r8 = r7.c     // Catch:{ all -> 0x01ac }
            if (r8 != 0) goto L_0x00c1
            goto L_0x00c6
        L_0x00c1:
            r7.c()     // Catch:{ all -> 0x01ac }
            r7.c = r3     // Catch:{ all -> 0x01ac }
        L_0x00c6:
            aucj r8 = r7.b     // Catch:{ all -> 0x01ac }
            anqc r8 = (defpackage.anqc) r8     // Catch:{ all -> 0x01ac }
            r0.getClass()     // Catch:{ all -> 0x01ac }
            int r9 = r8.a     // Catch:{ all -> 0x01ac }
            r9 = r9 | r1
            r8.a = r9     // Catch:{ all -> 0x01ac }
            r8.b = r0     // Catch:{ all -> 0x01ac }
            r0 = r9 | 2
            r8.a = r0     // Catch:{ all -> 0x01ac }
            r8.c = r11     // Catch:{ all -> 0x01ac }
            aucj r0 = r7.i()     // Catch:{ all -> 0x01ac }
            anqc r0 = (defpackage.anqc) r0     // Catch:{ all -> 0x01ac }
            adns r7 = r2.e     // Catch:{ all -> 0x01ac }
            r8 = 5
            aucd r8 = r7.a((int) r8)     // Catch:{ all -> 0x01ac }
            boolean r9 = r8.c     // Catch:{ all -> 0x01ac }
            if (r9 != 0) goto L_0x00ec
            goto L_0x00f1
        L_0x00ec:
            r8.c()     // Catch:{ all -> 0x01ac }
            r8.c = r3     // Catch:{ all -> 0x01ac }
        L_0x00f1:
            aucj r9 = r8.b     // Catch:{ all -> 0x01ac }
            anqb r9 = (defpackage.anqb) r9     // Catch:{ all -> 0x01ac }
            anqb r11 = defpackage.anqb.l     // Catch:{ all -> 0x01ac }
            r0.getClass()     // Catch:{ all -> 0x01ac }
            r9.h = r0     // Catch:{ all -> 0x01ac }
            int r0 = r9.a     // Catch:{ all -> 0x01ac }
            r0 = r0 | 64
            r9.a = r0     // Catch:{ all -> 0x01ac }
            aucj r0 = r8.i()     // Catch:{ all -> 0x01ac }
            anqb r0 = (defpackage.anqb) r0     // Catch:{ all -> 0x01ac }
            r7.a((defpackage.anqb) r0)     // Catch:{ all -> 0x01ac }
            java.lang.Object r7 = r2.f     // Catch:{ all -> 0x018e }
            monitor-enter(r7)     // Catch:{ all -> 0x018e }
            adrn r0 = r2.d     // Catch:{ all -> 0x018b }
            adro r8 = defpackage.adls.a     // Catch:{ all -> 0x018b }
            java.lang.Object r0 = r0.b(r8)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x018b }
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x018b }
            if (r0 == 0) goto L_0x0170
            adrn r0 = r2.d     // Catch:{ all -> 0x018b }
            adrc[] r8 = new defpackage.adrc[r10]     // Catch:{ all -> 0x018b }
            adro r9 = defpackage.adls.b     // Catch:{ all -> 0x018b }
            java.lang.String r10 = r5.a     // Catch:{ all -> 0x018b }
            adrc r9 = r9.b(r10)     // Catch:{ all -> 0x018b }
            r8[r3] = r9     // Catch:{ all -> 0x018b }
            adrf r9 = defpackage.adls.c     // Catch:{ all -> 0x018b }
            adre r10 = r5.b     // Catch:{ all -> 0x018b }
            adrc r9 = r9.b(r10)     // Catch:{ all -> 0x018b }
            r8[r1] = r9     // Catch:{ all -> 0x018b }
            r0.a((defpackage.adrc[]) r8)     // Catch:{ all -> 0x018b }
            boolean r0 = r5.c     // Catch:{ all -> 0x018b }
            if (r0 == 0) goto L_0x0157
            r2.a()     // Catch:{ all -> 0x018b }
            monitor-exit(r7)     // Catch:{ all -> 0x018b }
            if (r5 == 0) goto L_0x0189
            java.util.concurrent.Callable r0 = r5.d     // Catch:{ all -> 0x01ac }
            if (r0 == 0) goto L_0x0189
            r0.call()     // Catch:{ Exception -> 0x014b }
            goto L_0x0189
        L_0x014b:
            r0 = move-exception
            r1 = r0
            iwd r0 = defpackage.adlp.a     // Catch:{ all -> 0x01ac }
            java.lang.String r2 = "Error when executing onStatePersistedCallback."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x01ac }
            r0.e(r2, r1, r3)     // Catch:{ all -> 0x01ac }
            goto L_0x0189
        L_0x0157:
            monitor-exit(r7)     // Catch:{ all -> 0x018b }
            if (r5 == 0) goto L_0x0071
            java.util.concurrent.Callable r0 = r5.d     // Catch:{ all -> 0x01ac }
            if (r0 == 0) goto L_0x0071
            r0.call()     // Catch:{ Exception -> 0x0163 }
            goto L_0x0071
        L_0x0163:
            r0 = move-exception
            r5 = r0
            iwd r0 = defpackage.adlp.a     // Catch:{ all -> 0x01ac }
            java.lang.String r7 = "Error when executing onStatePersistedCallback."
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ all -> 0x01ac }
            r0.e(r7, r5, r8)     // Catch:{ all -> 0x01ac }
            goto L_0x0071
        L_0x0170:
            r2.b()     // Catch:{ all -> 0x018b }
            monitor-exit(r7)     // Catch:{ all -> 0x018b }
            if (r5 == 0) goto L_0x0189
            java.util.concurrent.Callable r0 = r5.d     // Catch:{ all -> 0x01ac }
            if (r0 == 0) goto L_0x0189
            r0.call()     // Catch:{ Exception -> 0x017e }
            goto L_0x0189
        L_0x017e:
            r0 = move-exception
            r1 = r0
            iwd r0 = defpackage.adlp.a     // Catch:{ all -> 0x01ac }
            java.lang.String r2 = "Error when executing onStatePersistedCallback."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x01ac }
            r0.e(r2, r1, r3)     // Catch:{ all -> 0x01ac }
        L_0x0189:
            monitor-exit(r4)     // Catch:{ all -> 0x01ac }
            return
        L_0x018b:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x018b }
            throw r0     // Catch:{ all -> 0x018e }
        L_0x018e:
            r0 = move-exception
            r1 = r0
            if (r5 == 0) goto L_0x01a5
            java.util.concurrent.Callable r0 = r5.d     // Catch:{ all -> 0x01ac }
            if (r0 == 0) goto L_0x01a5
            r0.call()     // Catch:{ Exception -> 0x019a }
            goto L_0x01a5
        L_0x019a:
            r0 = move-exception
            r2 = r0
            iwd r0 = defpackage.adlp.a     // Catch:{ all -> 0x01ac }
            java.lang.String r5 = "Error when executing onStatePersistedCallback."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x01ac }
            r0.e(r5, r2, r3)     // Catch:{ all -> 0x01ac }
        L_0x01a5:
            throw r1     // Catch:{ all -> 0x01ac }
        L_0x01a6:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01a6 }
            throw r0     // Catch:{ all -> 0x01ac }
        L_0x01a9:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01a9 }
            throw r0     // Catch:{ all -> 0x01ac }
        L_0x01ac:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01ac }
            throw r0
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.update.execution.InstallationIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
