package defpackage;

import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;

/* renamed from: achp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class achp implements Runnable {
    final /* synthetic */ ExchangeAssertionsForUserCredentialsRequest a;
    final /* synthetic */ acjs b;
    final /* synthetic */ achr c;

    public achp(achr achr, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest, acjs acjs) {
        this.c = achr;
        this.a = exchangeAssertionsForUserCredentialsRequest;
        this.b = acjs;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.google.android.gms.smartdevice.setup.accounts.UserCredential[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.google.android.gms.smartdevice.setup.accounts.UserCredential[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.google.android.gms.smartdevice.setup.accounts.UserCredential[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.google.android.gms.smartdevice.setup.accounts.UserCredential[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.google.android.gms.smartdevice.setup.accounts.UserCredential[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: com.google.android.gms.smartdevice.setup.accounts.UserCredential[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: com.google.android.gms.smartdevice.setup.accounts.UserCredential[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: com.google.android.gms.smartdevice.setup.accounts.UserCredential[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "Error executing callback"
            com.google.android.gms.common.api.Status r3 = new com.google.android.gms.common.api.Status
            r0 = 13
            r3.<init>(r0)
            com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest r0 = r1.a
            java.util.ArrayList r4 = r0.b
            r5 = 0
            if (r4 != 0) goto L_0x001f
            acjs r0 = r1.b     // Catch:{ RemoteException -> 0x0018 }
            r0.a(r3, r5, r5, r5)     // Catch:{ RemoteException -> 0x0018 }
            return
        L_0x0018:
            r0 = move-exception
            iwd r2 = defpackage.achr.a
            r2.a((java.lang.Throwable) r0)
            return
        L_0x001f:
            r4 = 0
            achr r6 = r1.c     // Catch:{ all -> 0x01fe }
            aboo r7 = r6.d     // Catch:{ all -> 0x01fe }
            avoz r8 = defpackage.avoz.e     // Catch:{ all -> 0x01fe }
            aucd r8 = r8.o()     // Catch:{ all -> 0x01fe }
            int r9 = r0.d     // Catch:{ all -> 0x01fe }
            int r9 = defpackage.aqdp.a(r9)     // Catch:{ all -> 0x01fe }
            aqds r10 = defpackage.aqds.j     // Catch:{ all -> 0x01fe }
            aucd r10 = r10.o()     // Catch:{ all -> 0x01fe }
            aqdr r10 = (defpackage.aqdr) r10     // Catch:{ all -> 0x01fe }
            java.util.ArrayList r11 = r0.b     // Catch:{ all -> 0x01fe }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x01fe }
            int r13 = r11.size()     // Catch:{ all -> 0x01fe }
            r12.<init>(r13)     // Catch:{ all -> 0x01fe }
            int r13 = r11.size()     // Catch:{ all -> 0x01fe }
            r14 = 0
        L_0x0048:
            if (r14 < r13) goto L_0x01ed
            r10.a(r12)     // Catch:{ all -> 0x01fe }
            java.lang.String r6 = r0.e     // Catch:{ all -> 0x01fe }
            boolean r11 = r10.c     // Catch:{ all -> 0x01fe }
            if (r11 != 0) goto L_0x0054
            goto L_0x0059
        L_0x0054:
            r10.c()     // Catch:{ all -> 0x01fe }
            r10.c = r4     // Catch:{ all -> 0x01fe }
        L_0x0059:
            aucj r11 = r10.b     // Catch:{ all -> 0x01fe }
            aqds r11 = (defpackage.aqds) r11     // Catch:{ all -> 0x01fe }
            r6.getClass()     // Catch:{ all -> 0x01fe }
            int r12 = r11.a     // Catch:{ all -> 0x01fe }
            r12 = r12 | 32
            r11.a = r12     // Catch:{ all -> 0x01fe }
            r11.g = r6     // Catch:{ all -> 0x01fe }
            r6 = 1
            r11.c = r6     // Catch:{ all -> 0x01fe }
            r12 = r12 | r6
            r11.a = r12     // Catch:{ all -> 0x01fe }
            aqdz r11 = defpackage.aqdz.a     // Catch:{ all -> 0x01fe }
            boolean r12 = r10.c     // Catch:{ all -> 0x01fe }
            if (r12 != 0) goto L_0x0075
            goto L_0x007a
        L_0x0075:
            r10.c()     // Catch:{ all -> 0x01fe }
            r10.c = r4     // Catch:{ all -> 0x01fe }
        L_0x007a:
            aucj r12 = r10.b     // Catch:{ all -> 0x01fe }
            aqds r12 = (defpackage.aqds) r12     // Catch:{ all -> 0x01fe }
            r11.getClass()     // Catch:{ all -> 0x01fe }
            r12.d = r11     // Catch:{ all -> 0x01fe }
            int r11 = r12.a     // Catch:{ all -> 0x01fe }
            r11 = r11 | 2
            r12.a = r11     // Catch:{ all -> 0x01fe }
            java.lang.String r13 = r0.f     // Catch:{ all -> 0x01fe }
            r13.getClass()     // Catch:{ all -> 0x01fe }
            r11 = r11 | 128(0x80, float:1.794E-43)
            r12.a = r11     // Catch:{ all -> 0x01fe }
            r12.i = r13     // Catch:{ all -> 0x01fe }
            com.google.android.gms.smartdevice.setup.accounts.DeviceSignals r11 = r0.c     // Catch:{ all -> 0x01fe }
            aqdq r12 = defpackage.aqdq.i     // Catch:{ all -> 0x01fe }
            aucd r12 = r12.o()     // Catch:{ all -> 0x01fe }
            java.lang.String r13 = r11.b     // Catch:{ all -> 0x01fe }
            boolean r14 = r12.c     // Catch:{ all -> 0x01fe }
            if (r14 != 0) goto L_0x00a3
            goto L_0x00a8
        L_0x00a3:
            r12.c()     // Catch:{ all -> 0x01fe }
            r12.c = r4     // Catch:{ all -> 0x01fe }
        L_0x00a8:
            aucj r14 = r12.b     // Catch:{ all -> 0x01fe }
            aqdq r14 = (defpackage.aqdq) r14     // Catch:{ all -> 0x01fe }
            r13.getClass()     // Catch:{ all -> 0x01fe }
            int r15 = r14.a     // Catch:{ all -> 0x01fe }
            r15 = r15 | r6
            r14.a = r15     // Catch:{ all -> 0x01fe }
            r14.b = r13     // Catch:{ all -> 0x01fe }
            java.lang.String r13 = r11.d     // Catch:{ all -> 0x01fe }
            r13.getClass()     // Catch:{ all -> 0x01fe }
            r15 = r15 | 4
            r14.a = r15     // Catch:{ all -> 0x01fe }
            r14.d = r13     // Catch:{ all -> 0x01fe }
            java.lang.String r13 = r11.c     // Catch:{ all -> 0x01fe }
            r13.getClass()     // Catch:{ all -> 0x01fe }
            r15 = r15 | 2
            r14.a = r15     // Catch:{ all -> 0x01fe }
            r14.c = r13     // Catch:{ all -> 0x01fe }
            java.lang.String r13 = r11.g     // Catch:{ all -> 0x01fe }
            r13.getClass()     // Catch:{ all -> 0x01fe }
            r15 = r15 | 32
            r14.a = r15     // Catch:{ all -> 0x01fe }
            r14.g = r13     // Catch:{ all -> 0x01fe }
            java.lang.String r13 = r11.f     // Catch:{ all -> 0x01fe }
            r13.getClass()     // Catch:{ all -> 0x01fe }
            r15 = r15 | 16
            r14.a = r15     // Catch:{ all -> 0x01fe }
            r14.f = r13     // Catch:{ all -> 0x01fe }
            java.lang.String r11 = r11.e     // Catch:{ all -> 0x01fe }
            r11.getClass()     // Catch:{ all -> 0x01fe }
            r13 = r15 | 8
            r14.a = r13     // Catch:{ all -> 0x01fe }
            r14.e = r11     // Catch:{ all -> 0x01fe }
            aucj r11 = r12.i()     // Catch:{ all -> 0x01fe }
            aqdq r11 = (defpackage.aqdq) r11     // Catch:{ all -> 0x01fe }
            boolean r12 = r10.c     // Catch:{ all -> 0x01fe }
            if (r12 != 0) goto L_0x00f8
            goto L_0x00fd
        L_0x00f8:
            r10.c()     // Catch:{ all -> 0x01fe }
            r10.c = r4     // Catch:{ all -> 0x01fe }
        L_0x00fd:
            aucj r12 = r10.b     // Catch:{ all -> 0x01fe }
            aqds r12 = (defpackage.aqds) r12     // Catch:{ all -> 0x01fe }
            r11.getClass()     // Catch:{ all -> 0x01fe }
            r12.e = r11     // Catch:{ all -> 0x01fe }
            int r11 = r12.a     // Catch:{ all -> 0x01fe }
            r11 = r11 | 4
            r12.a = r11     // Catch:{ all -> 0x01fe }
            boolean r13 = r0.i     // Catch:{ all -> 0x01fe }
            r11 = r11 | 64
            r12.a = r11     // Catch:{ all -> 0x01fe }
            r12.h = r13     // Catch:{ all -> 0x01fe }
            if (r9 == 0) goto L_0x011c
            r12.f = r9     // Catch:{ all -> 0x01fe }
            r9 = r11 | 16
            r12.a = r9     // Catch:{ all -> 0x01fe }
        L_0x011c:
            boolean r9 = r8.c     // Catch:{ all -> 0x01fe }
            if (r9 != 0) goto L_0x0121
            goto L_0x0126
        L_0x0121:
            r8.c()     // Catch:{ all -> 0x01fe }
            r8.c = r4     // Catch:{ all -> 0x01fe }
        L_0x0126:
            aucj r9 = r8.b     // Catch:{ all -> 0x01fe }
            avoz r9 = (defpackage.avoz) r9     // Catch:{ all -> 0x01fe }
            aucj r10 = r10.i()     // Catch:{ all -> 0x01fe }
            aqds r10 = (defpackage.aqds) r10     // Catch:{ all -> 0x01fe }
            r10.getClass()     // Catch:{ all -> 0x01fe }
            r9.b = r10     // Catch:{ all -> 0x01fe }
            int r10 = r9.a     // Catch:{ all -> 0x01fe }
            r10 = r10 | r6
            r9.a = r10     // Catch:{ all -> 0x01fe }
            java.lang.String r9 = r0.h     // Catch:{ all -> 0x01fe }
            boolean r10 = r8.c     // Catch:{ all -> 0x01fe }
            if (r10 != 0) goto L_0x0141
            goto L_0x0146
        L_0x0141:
            r8.c()     // Catch:{ all -> 0x01fe }
            r8.c = r4     // Catch:{ all -> 0x01fe }
        L_0x0146:
            aucj r10 = r8.b     // Catch:{ all -> 0x01fe }
            avoz r10 = (defpackage.avoz) r10     // Catch:{ all -> 0x01fe }
            r9.getClass()     // Catch:{ all -> 0x01fe }
            int r11 = r10.a     // Catch:{ all -> 0x01fe }
            r11 = r11 | 4
            r10.a = r11     // Catch:{ all -> 0x01fe }
            r10.d = r9     // Catch:{ all -> 0x01fe }
            java.lang.String r0 = r0.g     // Catch:{ all -> 0x01fe }
            r0.getClass()     // Catch:{ all -> 0x01fe }
            r9 = r11 | 2
            r10.a = r9     // Catch:{ all -> 0x01fe }
            r10.c = r0     // Catch:{ all -> 0x01fe }
            aucj r0 = r8.i()     // Catch:{ all -> 0x01fe }
            r13 = r0
            avoz r13 = (defpackage.avoz) r13     // Catch:{ all -> 0x01fe }
            aboq r0 = new aboq     // Catch:{ all -> 0x01fe }
            r8 = r7
            abot r8 = (defpackage.abot) r8     // Catch:{ all -> 0x01fe }
            int r10 = r8.d     // Catch:{ all -> 0x01fe }
            r8 = r7
            abot r8 = (defpackage.abot) r8     // Catch:{ all -> 0x01fe }
            int r11 = r8.e     // Catch:{ all -> 0x01fe }
            r8 = r7
            abot r8 = (defpackage.abot) r8     // Catch:{ all -> 0x01fe }
            float r12 = r8.f     // Catch:{ all -> 0x01fe }
            r9 = r7
            abot r9 = (defpackage.abot) r9     // Catch:{ all -> 0x01fe }
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01fe }
            java.lang.Object r0 = r0.b()     // Catch:{ all -> 0x01fe }
            avpa r0 = (defpackage.avpa) r0     // Catch:{ all -> 0x01fe }
            if (r0 != 0) goto L_0x0188
            goto L_0x01c6
        L_0x0188:
            int r7 = r0.a     // Catch:{ all -> 0x01fe }
            r8 = r7 & 2
            if (r8 != 0) goto L_0x01c6
            r6 = r6 & r7
            if (r6 == 0) goto L_0x01c6
            achr r6 = r1.c     // Catch:{ all -> 0x01fe }
            aqdt r7 = r0.b     // Catch:{ all -> 0x01fe }
            if (r7 == 0) goto L_0x0198
            goto L_0x019a
        L_0x0198:
            aqdt r7 = defpackage.aqdt.b     // Catch:{ all -> 0x01fe }
        L_0x019a:
            aucx r7 = r7.a     // Catch:{ all -> 0x01fe }
            aucx r8 = r0.f     // Catch:{ all -> 0x01fe }
            avpd[] r9 = new defpackage.avpd[r4]     // Catch:{ all -> 0x01fe }
            java.lang.Object[] r8 = r8.toArray(r9)     // Catch:{ all -> 0x01fe }
            avpd[] r8 = (defpackage.avpd[]) r8     // Catch:{ all -> 0x01fe }
            com.google.android.gms.smartdevice.setup.accounts.UserCredential[] r6 = r6.a((java.util.List) r7, (defpackage.avpd[]) r8)     // Catch:{ all -> 0x01fe }
            java.lang.String r7 = r0.d     // Catch:{ all -> 0x01bf }
            java.lang.String r5 = r0.e     // Catch:{ all -> 0x01b6 }
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x01b6 }
            r0.<init>(r4)     // Catch:{ all -> 0x01b6 }
            r3 = r5
            r5 = r6
            goto L_0x01d9
        L_0x01b6:
            r0 = move-exception
            r16 = r3
            r3 = r0
            r0 = r5
            r5 = r6
            r6 = r16
            goto L_0x0203
        L_0x01bf:
            r0 = move-exception
            r7 = r5
            r5 = r6
            r6 = r3
            r3 = r0
            r0 = r7
            goto L_0x0203
        L_0x01c6:
            com.google.android.gms.common.api.Status r6 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x01fe }
            r0 = 10652(0x299c, float:1.4927E-41)
            r6.<init>(r0)     // Catch:{ all -> 0x01fe }
            achr r0 = r1.c     // Catch:{ all -> 0x01e8 }
            abna r0 = r0.e     // Catch:{ all -> 0x01e8 }
            int r3 = r6.i     // Catch:{ all -> 0x01e8 }
            r0.a(r3)     // Catch:{ all -> 0x01e8 }
            r3 = r5
            r7 = r3
            r0 = r6
        L_0x01d9:
            acjs r6 = r1.b     // Catch:{ RemoteException -> 0x01df }
            r6.a(r0, r5, r7, r3)     // Catch:{ RemoteException -> 0x01df }
            return
        L_0x01df:
            r0 = move-exception
            iwd r3 = defpackage.achr.a
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r3.e(r2, r0, r4)
            return
        L_0x01e8:
            r0 = move-exception
            r3 = r0
            r0 = r5
            r7 = r0
            goto L_0x0203
        L_0x01ed:
            java.lang.Object r15 = r11.get(r14)     // Catch:{ all -> 0x01fe }
            com.google.android.gms.smartdevice.setup.accounts.Assertion r15 = (com.google.android.gms.smartdevice.setup.accounts.Assertion) r15     // Catch:{ all -> 0x01fe }
            aqdi r15 = r6.a((com.google.android.gms.smartdevice.setup.accounts.Assertion) r15)     // Catch:{ all -> 0x01fe }
            r12.add(r15)     // Catch:{ all -> 0x01fe }
            int r14 = r14 + 1
            goto L_0x0048
        L_0x01fe:
            r0 = move-exception
            r6 = r3
            r7 = r5
            r3 = r0
            r0 = r7
        L_0x0203:
            acjs r8 = r1.b     // Catch:{ RemoteException -> 0x0209 }
            r8.a(r6, r5, r7, r0)     // Catch:{ RemoteException -> 0x0209 }
            goto L_0x0211
        L_0x0209:
            r0 = move-exception
            iwd r5 = defpackage.achr.a
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5.e(r2, r0, r4)
        L_0x0211:
            goto L_0x0213
        L_0x0212:
            throw r3
        L_0x0213:
            goto L_0x0212
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.achp.run():void");
    }
}
