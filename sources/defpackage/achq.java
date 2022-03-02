package defpackage;

import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;

/* renamed from: achq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class achq implements Runnable {
    final /* synthetic */ ExchangeSessionCheckpointsForUserCredentialsRequest a;
    final /* synthetic */ acjs b;
    final /* synthetic */ achr c;

    public achq(achr achr, ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest, acjs acjs) {
        this.c = achr;
        this.a = exchangeSessionCheckpointsForUserCredentialsRequest;
        this.b = acjs;
    }

    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r5v3, types: [int, boolean] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r2 = "Error executing callback"
            com.google.android.gms.common.api.Status r3 = new com.google.android.gms.common.api.Status
            r0 = 13
            r3.<init>(r0)
            r5 = 0
            acjz r0 = new acjz     // Catch:{ all -> 0x0195 }
            achr r6 = r1.c     // Catch:{ all -> 0x0195 }
            android.content.Context r7 = r6.b     // Catch:{ all -> 0x0195 }
            lya r6 = r6.b()     // Catch:{ all -> 0x0195 }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x0195 }
            r8.<init>()     // Catch:{ all -> 0x0195 }
            r0.<init>(r7, r6, r8, r5)     // Catch:{ all -> 0x0195 }
            com.google.android.gms.smartdevice.setup.accounts.DeviceRiskSignals r0 = r0.a()     // Catch:{ all -> 0x0195 }
            com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest r6 = r1.a     // Catch:{ all -> 0x0195 }
            r6.a((com.google.android.gms.smartdevice.setup.accounts.DeviceRiskSignals) r0)     // Catch:{ all -> 0x0195 }
            achr r0 = r1.c     // Catch:{ all -> 0x0195 }
            aboo r0 = r0.d     // Catch:{ all -> 0x0195 }
            com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest r6 = r1.a     // Catch:{ all -> 0x0195 }
            avpb r7 = defpackage.avpb.c     // Catch:{ all -> 0x0195 }
            aucd r7 = r7.o()     // Catch:{ all -> 0x0195 }
            aqdu r8 = defpackage.aqdu.f     // Catch:{ all -> 0x0195 }
            aucd r8 = r8.o()     // Catch:{ all -> 0x0195 }
            java.util.ArrayList r9 = r6.b     // Catch:{ all -> 0x0195 }
            int r10 = r9.size()     // Catch:{ all -> 0x0195 }
            aqdn[] r10 = new defpackage.aqdn[r10]     // Catch:{ all -> 0x0195 }
            r11 = 0
        L_0x0042:
            int r12 = r9.size()     // Catch:{ all -> 0x0195 }
            r13 = 1
            if (r11 < r12) goto L_0x0157
            java.util.List r9 = java.util.Arrays.asList(r10)     // Catch:{ all -> 0x0195 }
            boolean r10 = r8.c     // Catch:{ all -> 0x0195 }
            if (r10 != 0) goto L_0x0052
            goto L_0x0057
        L_0x0052:
            r8.c()     // Catch:{ all -> 0x0195 }
            r8.c = r5     // Catch:{ all -> 0x0195 }
        L_0x0057:
            aucj r10 = r8.b     // Catch:{ all -> 0x0195 }
            aqdu r10 = (defpackage.aqdu) r10     // Catch:{ all -> 0x0195 }
            aucx r11 = r10.b     // Catch:{ all -> 0x0195 }
            boolean r11 = r11.a()     // Catch:{ all -> 0x0195 }
            if (r11 == 0) goto L_0x0064
            goto L_0x006c
        L_0x0064:
            aucx r11 = r10.b     // Catch:{ all -> 0x0195 }
            aucx r11 = defpackage.aucj.a((defpackage.aucx) r11)     // Catch:{ all -> 0x0195 }
            r10.b = r11     // Catch:{ all -> 0x0195 }
        L_0x006c:
            aucx r10 = r10.b     // Catch:{ all -> 0x0195 }
            defpackage.auab.a((java.lang.Iterable) r9, (java.util.List) r10)     // Catch:{ all -> 0x0195 }
            boolean r9 = r8.c     // Catch:{ all -> 0x0195 }
            if (r9 != 0) goto L_0x0076
            goto L_0x007b
        L_0x0076:
            r8.c()     // Catch:{ all -> 0x0195 }
            r8.c = r5     // Catch:{ all -> 0x0195 }
        L_0x007b:
            aucj r9 = r8.b     // Catch:{ all -> 0x0195 }
            aqdu r9 = (defpackage.aqdu) r9     // Catch:{ all -> 0x0195 }
            r9.c = r13     // Catch:{ all -> 0x0195 }
            int r10 = r9.a     // Catch:{ all -> 0x0195 }
            r10 = r10 | r13
            r9.a = r10     // Catch:{ all -> 0x0195 }
            aqdz r9 = defpackage.aqdz.a     // Catch:{ all -> 0x0195 }
            boolean r10 = r8.c     // Catch:{ all -> 0x0195 }
            if (r10 != 0) goto L_0x008d
            goto L_0x0092
        L_0x008d:
            r8.c()     // Catch:{ all -> 0x0195 }
            r8.c = r5     // Catch:{ all -> 0x0195 }
        L_0x0092:
            aucj r10 = r8.b     // Catch:{ all -> 0x0195 }
            aqdu r10 = (defpackage.aqdu) r10     // Catch:{ all -> 0x0195 }
            r9.getClass()     // Catch:{ all -> 0x0195 }
            r10.d = r9     // Catch:{ all -> 0x0195 }
            int r9 = r10.a     // Catch:{ all -> 0x0195 }
            r9 = r9 | 2
            r10.a = r9     // Catch:{ all -> 0x0195 }
            com.google.android.gms.smartdevice.setup.accounts.DeviceRiskSignals r6 = r6.c     // Catch:{ all -> 0x0195 }
            aurq r6 = defpackage.achr.a((com.google.android.gms.smartdevice.setup.accounts.DeviceRiskSignals) r6)     // Catch:{ all -> 0x0195 }
            boolean r9 = r8.c     // Catch:{ all -> 0x0195 }
            if (r9 != 0) goto L_0x00ac
            goto L_0x00b1
        L_0x00ac:
            r8.c()     // Catch:{ all -> 0x0195 }
            r8.c = r5     // Catch:{ all -> 0x0195 }
        L_0x00b1:
            aucj r9 = r8.b     // Catch:{ all -> 0x0195 }
            aqdu r9 = (defpackage.aqdu) r9     // Catch:{ all -> 0x0195 }
            r6.getClass()     // Catch:{ all -> 0x0195 }
            r9.e = r6     // Catch:{ all -> 0x0195 }
            int r6 = r9.a     // Catch:{ all -> 0x0195 }
            r6 = r6 | 4
            r9.a = r6     // Catch:{ all -> 0x0195 }
            boolean r6 = r7.c     // Catch:{ all -> 0x0195 }
            if (r6 != 0) goto L_0x00c5
            goto L_0x00ca
        L_0x00c5:
            r7.c()     // Catch:{ all -> 0x0195 }
            r7.c = r5     // Catch:{ all -> 0x0195 }
        L_0x00ca:
            aucj r6 = r7.b     // Catch:{ all -> 0x0195 }
            avpb r6 = (defpackage.avpb) r6     // Catch:{ all -> 0x0195 }
            aucj r8 = r8.i()     // Catch:{ all -> 0x0195 }
            aqdu r8 = (defpackage.aqdu) r8     // Catch:{ all -> 0x0195 }
            r8.getClass()     // Catch:{ all -> 0x0195 }
            r6.b = r8     // Catch:{ all -> 0x0195 }
            int r8 = r6.a     // Catch:{ all -> 0x0195 }
            r8 = r8 | r13
            r6.a = r8     // Catch:{ all -> 0x0195 }
            aucj r6 = r7.i()     // Catch:{ all -> 0x0195 }
            r12 = r6
            avpb r12 = (defpackage.avpb) r12     // Catch:{ all -> 0x0195 }
            abor r6 = new abor     // Catch:{ all -> 0x0195 }
            r7 = r0
            abot r7 = (defpackage.abot) r7     // Catch:{ all -> 0x0195 }
            int r9 = r7.d     // Catch:{ all -> 0x0195 }
            r7 = r0
            abot r7 = (defpackage.abot) r7     // Catch:{ all -> 0x0195 }
            int r10 = r7.e     // Catch:{ all -> 0x0195 }
            r7 = r0
            abot r7 = (defpackage.abot) r7     // Catch:{ all -> 0x0195 }
            float r11 = r7.f     // Catch:{ all -> 0x0195 }
            r8 = r0
            abot r8 = (defpackage.abot) r8     // Catch:{ all -> 0x0195 }
            r7 = r6
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0195 }
            java.lang.Object r0 = r6.b()     // Catch:{ all -> 0x0195 }
            avpc r0 = (defpackage.avpc) r0     // Catch:{ all -> 0x0195 }
            if (r0 != 0) goto L_0x0106
            goto L_0x0132
        L_0x0106:
            int r6 = r0.a     // Catch:{ all -> 0x0195 }
            r7 = r6 & 2
            if (r7 != 0) goto L_0x0132
            r6 = r6 & r13
            if (r6 == 0) goto L_0x0132
            achr r6 = r1.c     // Catch:{ all -> 0x0195 }
            aqdv r7 = r0.b     // Catch:{ all -> 0x0195 }
            if (r7 == 0) goto L_0x0116
            goto L_0x0118
        L_0x0116:
            aqdv r7 = defpackage.aqdv.b     // Catch:{ all -> 0x0195 }
        L_0x0118:
            aucx r7 = r7.a     // Catch:{ all -> 0x0195 }
            aucx r0 = r0.d     // Catch:{ all -> 0x0195 }
            avpd[] r8 = new defpackage.avpd[r5]     // Catch:{ all -> 0x0195 }
            java.lang.Object[] r0 = r0.toArray(r8)     // Catch:{ all -> 0x0195 }
            avpd[] r0 = (defpackage.avpd[]) r0     // Catch:{ all -> 0x0195 }
            com.google.android.gms.smartdevice.setup.accounts.UserCredential[] r4 = r6.a((java.util.List) r7, (defpackage.avpd[]) r0)     // Catch:{ all -> 0x0195 }
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x012e }
            r0.<init>(r5)     // Catch:{ all -> 0x012e }
            goto L_0x0144
        L_0x012e:
            r0 = move-exception
            r6 = r3
            r3 = r0
            goto L_0x0199
        L_0x0132:
            com.google.android.gms.common.api.Status r6 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x0195 }
            r0 = 10652(0x299c, float:1.4927E-41)
            r6.<init>(r0)     // Catch:{ all -> 0x0195 }
            achr r0 = r1.c     // Catch:{ all -> 0x0153 }
            abna r0 = r0.e     // Catch:{ all -> 0x0153 }
            int r3 = r6.i     // Catch:{ all -> 0x0153 }
            r0.a(r3)     // Catch:{ all -> 0x0153 }
            r0 = r6
            r4 = 0
        L_0x0144:
            acjs r3 = r1.b     // Catch:{ RemoteException -> 0x014a }
            r3.a((com.google.android.gms.common.api.Status) r0, (com.google.android.gms.smartdevice.setup.accounts.UserCredential[]) r4)     // Catch:{ RemoteException -> 0x014a }
            return
        L_0x014a:
            r0 = move-exception
            iwd r3 = defpackage.achr.a
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r3.e(r2, r0, r4)
            return
        L_0x0153:
            r0 = move-exception
            r3 = r0
            r4 = 0
            goto L_0x0199
        L_0x0157:
            java.lang.Object r12 = r9.get(r11)     // Catch:{ all -> 0x0195 }
            com.google.android.gms.smartdevice.setup.accounts.SessionCheckpoint r12 = (com.google.android.gms.smartdevice.setup.accounts.SessionCheckpoint) r12     // Catch:{ all -> 0x0195 }
            aqdn r14 = defpackage.aqdn.d     // Catch:{ all -> 0x0195 }
            aucd r14 = r14.o()     // Catch:{ all -> 0x0195 }
            java.lang.String r15 = r12.b     // Catch:{ all -> 0x0195 }
            boolean r4 = r14.c     // Catch:{ all -> 0x0195 }
            if (r4 != 0) goto L_0x016a
            goto L_0x016f
        L_0x016a:
            r14.c()     // Catch:{ all -> 0x0195 }
            r14.c = r5     // Catch:{ all -> 0x0195 }
        L_0x016f:
            aucj r4 = r14.b     // Catch:{ all -> 0x0195 }
            aqdn r4 = (defpackage.aqdn) r4     // Catch:{ all -> 0x0195 }
            r15.getClass()     // Catch:{ all -> 0x0195 }
            int r5 = r4.a     // Catch:{ all -> 0x0195 }
            r5 = r5 | r13
            r4.a = r5     // Catch:{ all -> 0x0195 }
            r4.b = r15     // Catch:{ all -> 0x0195 }
            java.lang.String r12 = r12.c     // Catch:{ all -> 0x0195 }
            r12.getClass()     // Catch:{ all -> 0x0195 }
            r5 = r5 | 2
            r4.a = r5     // Catch:{ all -> 0x0195 }
            r4.c = r12     // Catch:{ all -> 0x0195 }
            aucj r4 = r14.i()     // Catch:{ all -> 0x0195 }
            aqdn r4 = (defpackage.aqdn) r4     // Catch:{ all -> 0x0195 }
            r10[r11] = r4     // Catch:{ all -> 0x0195 }
            int r11 = r11 + 1
            r5 = 0
            goto L_0x0042
        L_0x0195:
            r0 = move-exception
            r6 = r3
            r4 = 0
            r3 = r0
        L_0x0199:
            acjs r0 = r1.b     // Catch:{ RemoteException -> 0x019f }
            r0.a((com.google.android.gms.common.api.Status) r6, (com.google.android.gms.smartdevice.setup.accounts.UserCredential[]) r4)     // Catch:{ RemoteException -> 0x019f }
            goto L_0x01a8
        L_0x019f:
            r0 = move-exception
            iwd r4 = defpackage.achr.a
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r4.e(r2, r0, r5)
        L_0x01a8:
            goto L_0x01aa
        L_0x01a9:
            throw r3
        L_0x01aa:
            goto L_0x01a9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.achq.run():void");
    }
}
