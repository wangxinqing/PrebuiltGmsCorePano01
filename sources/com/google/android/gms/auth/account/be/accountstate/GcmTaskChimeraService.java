package com.google.android.gms.auth.account.be.accountstate;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmTaskChimeraService extends qwf {
    private static final iwd a = ehv.a("GcmTaskChimeraService");
    private static final fze b = ele.a;

    /* JADX WARNING: Removed duplicated region for block: B:109:0x01c8 A[SYNTHETIC, Splitter:B:109:0x01c8] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0116 A[Catch:{ RemoteException -> 0x00c2, IOException -> 0x00c0, hxw -> 0x00af, hxx -> 0x00ad, eif -> 0x009c, all -> 0x02a6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.qxz r13) {
        /*
            r12 = this;
            boolean r0 = defpackage.awly.b()
            r1 = 2
            r2 = 0
            if (r0 != 0) goto L_0x0019
            boolean r0 = defpackage.awly.c()
            if (r0 == 0) goto L_0x000f
            goto L_0x0019
        L_0x000f:
            iwd r13 = a
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "As for now this service should only be used by the gcm broadcast receiver."
            r13.d(r2, r0)
            return r1
        L_0x0019:
            anpx r0 = defpackage.anpx.d
            aucd r0 = r0.o()
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x0024
            goto L_0x0029
        L_0x0024:
            r0.c()
            r0.c = r2
        L_0x0029:
            aucj r3 = r0.b
            anpx r3 = (defpackage.anpx) r3
            r3.b = r1
            int r4 = r3.a
            r5 = 1
            r4 = r4 | r5
            r3.a = r4
            android.os.Bundle r13 = r13.b     // Catch:{ all -> 0x02a6 }
            if (r13 != 0) goto L_0x0054
            r13 = 6
            r3.c = r13     // Catch:{ all -> 0x02a6 }
            r13 = r4 | 2
            r3.a = r13     // Catch:{ all -> 0x02a6 }
            fze r13 = b
        L_0x0042:
            java.lang.Object r13 = r13.a(r12)
            elg r13 = (defpackage.elg) r13
            iwd r2 = a
            aucj r0 = r0.i()
            anpx r0 = (defpackage.anpx) r0
            r13.a(r2, r0)
            return r1
        L_0x0054:
            java.lang.String r3 = "EXTRA_ACTION"
            java.lang.String r3 = r13.getString(r3)     // Catch:{ all -> 0x02a6 }
            r4 = 4
            if (r3 == 0) goto L_0x028d
            java.lang.String r6 = "EXTRA_GAIA_ID"
            java.lang.String r13 = r13.getString(r6)     // Catch:{ all -> 0x02a6 }
            if (r13 != 0) goto L_0x007d
            boolean r13 = r0.c     // Catch:{ all -> 0x02a6 }
            if (r13 != 0) goto L_0x006a
            goto L_0x006f
        L_0x006a:
            r0.c()     // Catch:{ all -> 0x02a6 }
            r0.c = r2     // Catch:{ all -> 0x02a6 }
        L_0x006f:
            aucj r13 = r0.b     // Catch:{ all -> 0x02a6 }
            anpx r13 = (defpackage.anpx) r13     // Catch:{ all -> 0x02a6 }
            r13.c = r1     // Catch:{ all -> 0x02a6 }
            int r2 = r13.a     // Catch:{ all -> 0x02a6 }
            r2 = r2 | r1
            r13.a = r2     // Catch:{ all -> 0x02a6 }
            fze r13 = b
            goto L_0x0042
        L_0x007d:
            r6 = 0
            java.lang.String r7 = "com.google"
            android.accounts.Account[] r7 = defpackage.eim.g(r12, r7)     // Catch:{ RemoteException -> 0x00c2, IOException -> 0x00c0, hxw -> 0x00af, hxx -> 0x00ad, eif -> 0x009c }
            int r8 = r7.length     // Catch:{ RemoteException -> 0x00c2, IOException -> 0x00c0, hxw -> 0x00af, hxx -> 0x00ad, eif -> 0x009c }
            r9 = 0
        L_0x0086:
            if (r9 >= r8) goto L_0x009b
            r10 = r7[r9]     // Catch:{ RemoteException -> 0x00c2, IOException -> 0x00c0, hxw -> 0x00af, hxx -> 0x00ad, eif -> 0x009c }
            java.lang.String r11 = r10.name     // Catch:{ RemoteException -> 0x00c2, IOException -> 0x00c0, hxw -> 0x00af, hxx -> 0x00ad, eif -> 0x009c }
            java.lang.String r11 = defpackage.eim.f(r12, r11)     // Catch:{ RemoteException -> 0x00c2, IOException -> 0x00c0, hxw -> 0x00af, hxx -> 0x00ad, eif -> 0x009c }
            boolean r11 = r13.equals(r11)     // Catch:{ RemoteException -> 0x00c2, IOException -> 0x00c0, hxw -> 0x00af, hxx -> 0x00ad, eif -> 0x009c }
            if (r11 != 0) goto L_0x0099
            int r9 = r9 + 1
            goto L_0x0086
        L_0x0099:
            r6 = r10
            goto L_0x00d2
        L_0x009b:
            goto L_0x00d2
        L_0x009c:
            r13 = move-exception
            iwd r7 = a     // Catch:{ all -> 0x02a6 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x02a6 }
            java.lang.String r9 = r13.getMessage()     // Catch:{ all -> 0x02a6 }
            r8[r2] = r9     // Catch:{ all -> 0x02a6 }
            java.lang.String r9 = "Auth exception - %s"
            r7.d(r9, r13, r8)     // Catch:{ all -> 0x02a6 }
            goto L_0x00d2
        L_0x00ad:
            r13 = move-exception
            goto L_0x00b0
        L_0x00af:
            r13 = move-exception
        L_0x00b0:
            iwd r7 = a     // Catch:{ all -> 0x02a6 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x02a6 }
            java.lang.String r9 = r13.getMessage()     // Catch:{ all -> 0x02a6 }
            r8[r2] = r9     // Catch:{ all -> 0x02a6 }
            java.lang.String r9 = "GMS is not available - %s"
            r7.d(r9, r13, r8)     // Catch:{ all -> 0x02a6 }
            goto L_0x00d2
        L_0x00c0:
            r13 = move-exception
            goto L_0x00c3
        L_0x00c2:
            r13 = move-exception
        L_0x00c3:
            iwd r7 = a     // Catch:{ all -> 0x02a6 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x02a6 }
            java.lang.String r9 = r13.getMessage()     // Catch:{ all -> 0x02a6 }
            r8[r2] = r9     // Catch:{ all -> 0x02a6 }
            java.lang.String r9 = "Unrecoverable exception - %s"
            r7.d(r9, r13, r8)     // Catch:{ all -> 0x02a6 }
        L_0x00d2:
            r13 = 3
            if (r6 != 0) goto L_0x00ee
            boolean r3 = r0.c     // Catch:{ all -> 0x02a6 }
            if (r3 != 0) goto L_0x00da
            goto L_0x00df
        L_0x00da:
            r0.c()     // Catch:{ all -> 0x02a6 }
            r0.c = r2     // Catch:{ all -> 0x02a6 }
        L_0x00df:
            aucj r2 = r0.b     // Catch:{ all -> 0x02a6 }
            anpx r2 = (defpackage.anpx) r2     // Catch:{ all -> 0x02a6 }
            r2.c = r13     // Catch:{ all -> 0x02a6 }
            int r13 = r2.a     // Catch:{ all -> 0x02a6 }
            r13 = r13 | r1
            r2.a = r13     // Catch:{ all -> 0x02a6 }
            fze r13 = b
            goto L_0x0042
        L_0x00ee:
            int r7 = r3.hashCode()     // Catch:{ all -> 0x02a6 }
            r8 = -857009880(0xffffffffcceb1128, float:-1.23242816E8)
            r9 = -1
            if (r7 == r8) goto L_0x0108
            r8 = 674017394(0x282cb072, float:9.5861785E-15)
            if (r7 == r8) goto L_0x00fe
        L_0x00fd:
            goto L_0x0111
        L_0x00fe:
            java.lang.String r7 = "CREDENTIAL_SYNC_ACTION"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x02a6 }
            if (r3 == 0) goto L_0x00fd
            r9 = 1
            goto L_0x0111
        L_0x0108:
            java.lang.String r7 = "ACCOUNT_SYNC_ACTION"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x02a6 }
            if (r3 == 0) goto L_0x00fd
            r9 = 0
        L_0x0111:
            r3 = 7
            r7 = 8
            if (r9 == 0) goto L_0x01c8
            if (r9 == r5) goto L_0x0132
            boolean r13 = r0.c     // Catch:{ all -> 0x02a6 }
            if (r13 != 0) goto L_0x011d
            goto L_0x0122
        L_0x011d:
            r0.c()     // Catch:{ all -> 0x02a6 }
            r0.c = r2     // Catch:{ all -> 0x02a6 }
        L_0x0122:
            aucj r13 = r0.b     // Catch:{ all -> 0x02a6 }
            anpx r13 = (defpackage.anpx) r13     // Catch:{ all -> 0x02a6 }
            r2 = 5
            r13.c = r2     // Catch:{ all -> 0x02a6 }
            int r2 = r13.a     // Catch:{ all -> 0x02a6 }
            r2 = r2 | r1
            r13.a = r2     // Catch:{ all -> 0x02a6 }
            fze r13 = b
            goto L_0x0042
        L_0x0132:
            boolean r13 = r0.c     // Catch:{ all -> 0x02a6 }
            if (r13 != 0) goto L_0x0137
            goto L_0x013c
        L_0x0137:
            r0.c()     // Catch:{ all -> 0x02a6 }
            r0.c = r2     // Catch:{ all -> 0x02a6 }
        L_0x013c:
            aucj r13 = r0.b     // Catch:{ all -> 0x02a6 }
            anpx r13 = (defpackage.anpx) r13     // Catch:{ all -> 0x02a6 }
            r13.b = r4     // Catch:{ all -> 0x02a6 }
            int r4 = r13.a     // Catch:{ all -> 0x02a6 }
            r4 = r4 | r5
            r13.a = r4     // Catch:{ all -> 0x02a6 }
            elw r13 = new elw     // Catch:{ all -> 0x02a6 }
            fyk r4 = new fyk     // Catch:{ all -> 0x02a6 }
            r4.<init>(r12)     // Catch:{ all -> 0x02a6 }
            r13.<init>(r4)     // Catch:{ all -> 0x02a6 }
            iwd r4 = a     // Catch:{ all -> 0x02a6 }
            java.lang.String r8 = "Credential sync starts."
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ all -> 0x02a6 }
            r4.a(r8, r9)     // Catch:{ all -> 0x02a6 }
            com.google.android.gms.auth.firstparty.dataservice.ReauthSettingsRequest r4 = new com.google.android.gms.auth.firstparty.dataservice.ReauthSettingsRequest     // Catch:{ all -> 0x02a6 }
            r4.<init>(r6, r5)     // Catch:{ all -> 0x02a6 }
            com.google.android.gms.auth.firstparty.dataservice.ReauthSettingsResponse r13 = r13.a((com.google.android.gms.auth.firstparty.dataservice.ReauthSettingsRequest) r4)     // Catch:{ all -> 0x02a6 }
            if (r13 != 0) goto L_0x017b
            boolean r13 = r0.c     // Catch:{ all -> 0x02a6 }
            if (r13 != 0) goto L_0x016a
            goto L_0x016f
        L_0x016a:
            r0.c()     // Catch:{ all -> 0x02a6 }
            r0.c = r2     // Catch:{ all -> 0x02a6 }
        L_0x016f:
            aucj r13 = r0.b     // Catch:{ all -> 0x02a6 }
            anpx r13 = (defpackage.anpx) r13     // Catch:{ all -> 0x02a6 }
            r13.c = r7     // Catch:{ all -> 0x02a6 }
            int r2 = r13.a     // Catch:{ all -> 0x02a6 }
            r2 = r2 | r1
            r13.a = r2     // Catch:{ all -> 0x02a6 }
            goto L_0x01c4
        L_0x017b:
            int r13 = r13.b     // Catch:{ all -> 0x02a6 }
            if (r13 == 0) goto L_0x01ae
            if (r13 == r1) goto L_0x0197
            boolean r13 = r0.c     // Catch:{ all -> 0x02a6 }
            if (r13 != 0) goto L_0x0186
            goto L_0x018b
        L_0x0186:
            r0.c()     // Catch:{ all -> 0x02a6 }
            r0.c = r2     // Catch:{ all -> 0x02a6 }
        L_0x018b:
            aucj r13 = r0.b     // Catch:{ all -> 0x02a6 }
            anpx r13 = (defpackage.anpx) r13     // Catch:{ all -> 0x02a6 }
            r13.c = r2     // Catch:{ all -> 0x02a6 }
            int r2 = r13.a     // Catch:{ all -> 0x02a6 }
            r2 = r2 | r1
            r13.a = r2     // Catch:{ all -> 0x02a6 }
            goto L_0x01c4
        L_0x0197:
            boolean r13 = r0.c     // Catch:{ all -> 0x02a6 }
            if (r13 != 0) goto L_0x019c
            goto L_0x01a1
        L_0x019c:
            r0.c()     // Catch:{ all -> 0x02a6 }
            r0.c = r2     // Catch:{ all -> 0x02a6 }
        L_0x01a1:
            aucj r13 = r0.b     // Catch:{ all -> 0x02a6 }
            anpx r13 = (defpackage.anpx) r13     // Catch:{ all -> 0x02a6 }
            r13.c = r3     // Catch:{ all -> 0x02a6 }
            int r2 = r13.a     // Catch:{ all -> 0x02a6 }
            r1 = r1 | r2
            r13.a = r1     // Catch:{ all -> 0x02a6 }
            r1 = 1
            goto L_0x01c4
        L_0x01ae:
            boolean r13 = r0.c     // Catch:{ all -> 0x02a6 }
            if (r13 != 0) goto L_0x01b3
            goto L_0x01b8
        L_0x01b3:
            r0.c()     // Catch:{ all -> 0x02a6 }
            r0.c = r2     // Catch:{ all -> 0x02a6 }
        L_0x01b8:
            aucj r13 = r0.b     // Catch:{ all -> 0x02a6 }
            anpx r13 = (defpackage.anpx) r13     // Catch:{ all -> 0x02a6 }
            r13.c = r5     // Catch:{ all -> 0x02a6 }
            int r3 = r13.a     // Catch:{ all -> 0x02a6 }
            r1 = r1 | r3
            r13.a = r1     // Catch:{ all -> 0x02a6 }
            r1 = 0
        L_0x01c4:
            fze r13 = b
            goto L_0x0042
        L_0x01c8:
            boolean r4 = r0.c     // Catch:{ all -> 0x02a6 }
            if (r4 != 0) goto L_0x01cd
            goto L_0x01d2
        L_0x01cd:
            r0.c()     // Catch:{ all -> 0x02a6 }
            r0.c = r2     // Catch:{ all -> 0x02a6 }
        L_0x01d2:
            aucj r4 = r0.b     // Catch:{ all -> 0x02a6 }
            anpx r4 = (defpackage.anpx) r4     // Catch:{ all -> 0x02a6 }
            r4.b = r13     // Catch:{ all -> 0x02a6 }
            int r13 = r4.a     // Catch:{ all -> 0x02a6 }
            r13 = r13 | r5
            r4.a = r13     // Catch:{ all -> 0x02a6 }
            ekz r13 = new ekz     // Catch:{ all -> 0x02a6 }
            r13.<init>(r12)     // Catch:{ all -> 0x02a6 }
            fzi r4 = defpackage.eny.a     // Catch:{ all -> 0x02a6 }
            java.lang.Object r4 = r4.b()     // Catch:{ all -> 0x02a6 }
            eny r4 = (defpackage.eny) r4     // Catch:{ all -> 0x02a6 }
            iwd r8 = a     // Catch:{ all -> 0x02a6 }
            java.lang.String r9 = "Account sync starts."
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ all -> 0x02a6 }
            r8.a(r9, r10)     // Catch:{ all -> 0x02a6 }
            java.lang.String r8 = defpackage.ent.aE()     // Catch:{ IOException -> 0x0269 }
            avpn r3 = r13.a(r6, r8)     // Catch:{ IOException -> 0x0269 }
            java.lang.String r8 = r6.name     // Catch:{ all -> 0x02a6 }
            java.lang.String r9 = r3.a     // Catch:{ all -> 0x02a6 }
            boolean r8 = android.text.TextUtils.equals(r8, r9)     // Catch:{ all -> 0x02a6 }
            if (r8 != 0) goto L_0x0213
            iwd r8 = a     // Catch:{ all -> 0x02a6 }
            java.lang.String r9 = "Renaming account as primary email different from existing account."
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ all -> 0x02a6 }
            r8.c(r9, r10)     // Catch:{ all -> 0x02a6 }
            java.lang.String r8 = r3.a     // Catch:{ all -> 0x02a6 }
            r13.b(r6, r8)     // Catch:{ all -> 0x02a6 }
        L_0x0213:
            java.util.HashSet r13 = new java.util.HashSet     // Catch:{ all -> 0x02a6 }
            aucx r3 = r3.b     // Catch:{ all -> 0x02a6 }
            r13.<init>(r3)     // Catch:{ all -> 0x02a6 }
            boolean r3 = r13.isEmpty()     // Catch:{ all -> 0x02a6 }
            if (r3 == 0) goto L_0x023f
            iwd r13 = a     // Catch:{ all -> 0x02a6 }
            java.lang.String r3 = "Existing services are unexpectedly empty. Skip updating."
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x02a6 }
            r13.d(r3, r4)     // Catch:{ all -> 0x02a6 }
            boolean r13 = r0.c     // Catch:{ all -> 0x02a6 }
            if (r13 != 0) goto L_0x022e
            goto L_0x0233
        L_0x022e:
            r0.c()     // Catch:{ all -> 0x02a6 }
            r0.c = r2     // Catch:{ all -> 0x02a6 }
        L_0x0233:
            aucj r13 = r0.b     // Catch:{ all -> 0x02a6 }
            anpx r13 = (defpackage.anpx) r13     // Catch:{ all -> 0x02a6 }
            r13.c = r7     // Catch:{ all -> 0x02a6 }
            int r2 = r13.a     // Catch:{ all -> 0x02a6 }
            r2 = r2 | r1
            r13.a = r2     // Catch:{ all -> 0x02a6 }
            goto L_0x0289
        L_0x023f:
            enx r3 = defpackage.eqb.f     // Catch:{ all -> 0x02a6 }
            java.lang.Object r3 = r4.a((android.accounts.Account) r6, (defpackage.enx) r3)     // Catch:{ all -> 0x02a6 }
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ all -> 0x02a6 }
            boolean r3 = r13.equals(r3)     // Catch:{ all -> 0x02a6 }
            if (r3 != 0) goto L_0x0252
            enx r3 = defpackage.eqb.f     // Catch:{ all -> 0x02a6 }
            r4.b(r6, r3, r13)     // Catch:{ all -> 0x02a6 }
        L_0x0252:
            boolean r13 = r0.c     // Catch:{ all -> 0x02a6 }
            if (r13 != 0) goto L_0x0257
            goto L_0x025c
        L_0x0257:
            r0.c()     // Catch:{ all -> 0x02a6 }
            r0.c = r2     // Catch:{ all -> 0x02a6 }
        L_0x025c:
            aucj r13 = r0.b     // Catch:{ all -> 0x02a6 }
            anpx r13 = (defpackage.anpx) r13     // Catch:{ all -> 0x02a6 }
            r13.c = r5     // Catch:{ all -> 0x02a6 }
            int r3 = r13.a     // Catch:{ all -> 0x02a6 }
            r1 = r1 | r3
            r13.a = r1     // Catch:{ all -> 0x02a6 }
            r1 = 0
            goto L_0x0289
        L_0x0269:
            r13 = move-exception
            iwd r4 = a     // Catch:{ all -> 0x02a6 }
            java.lang.String r6 = "Unable to look up account state from server."
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x02a6 }
            r4.d(r6, r13, r7)     // Catch:{ all -> 0x02a6 }
            boolean r13 = r0.c     // Catch:{ all -> 0x02a6 }
            if (r13 != 0) goto L_0x0278
            goto L_0x027d
        L_0x0278:
            r0.c()     // Catch:{ all -> 0x02a6 }
            r0.c = r2     // Catch:{ all -> 0x02a6 }
        L_0x027d:
            aucj r13 = r0.b     // Catch:{ all -> 0x02a6 }
            anpx r13 = (defpackage.anpx) r13     // Catch:{ all -> 0x02a6 }
            r13.c = r3     // Catch:{ all -> 0x02a6 }
            int r2 = r13.a     // Catch:{ all -> 0x02a6 }
            r1 = r1 | r2
            r13.a = r1     // Catch:{ all -> 0x02a6 }
            r1 = 1
        L_0x0289:
            fze r13 = b
            goto L_0x0042
        L_0x028d:
            boolean r13 = r0.c     // Catch:{ all -> 0x02a6 }
            if (r13 != 0) goto L_0x0292
            goto L_0x0297
        L_0x0292:
            r0.c()     // Catch:{ all -> 0x02a6 }
            r0.c = r2     // Catch:{ all -> 0x02a6 }
        L_0x0297:
            aucj r13 = r0.b     // Catch:{ all -> 0x02a6 }
            anpx r13 = (defpackage.anpx) r13     // Catch:{ all -> 0x02a6 }
            r13.c = r4     // Catch:{ all -> 0x02a6 }
            int r2 = r13.a     // Catch:{ all -> 0x02a6 }
            r2 = r2 | r1
            r13.a = r2     // Catch:{ all -> 0x02a6 }
            fze r13 = b
            goto L_0x0042
        L_0x02a6:
            r13 = move-exception
            fze r1 = b
            java.lang.Object r1 = r1.a(r12)
            elg r1 = (defpackage.elg) r1
            iwd r2 = a
            aucj r0 = r0.i()
            anpx r0 = (defpackage.anpx) r0
            r1.a(r2, r0)
            goto L_0x02bc
        L_0x02bb:
            throw r13
        L_0x02bc:
            goto L_0x02bb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.account.be.accountstate.GcmTaskChimeraService.a(qxz):int");
    }
}
