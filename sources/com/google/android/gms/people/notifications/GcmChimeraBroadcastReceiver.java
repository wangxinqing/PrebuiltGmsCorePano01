package com.google.android.gms.people.notifications;

import com.google.android.chimera.WakefulBroadcastReceiver;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmChimeraBroadcastReceiver extends WakefulBroadcastReceiver {
    /* JADX WARNING: Removed duplicated region for block: B:91:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0242  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r18, android.content.Intent r19) {
        /*
            r17 = this;
            r1 = r18
            r0 = r19
            boolean r2 = defpackage.aytx.b()
            java.lang.String r3 = "People_GcmBroadcastReceiver"
            if (r2 != 0) goto L_0x0012
            java.lang.String r0 = "New tickle sync is not enabled."
            android.util.Log.e(r3, r0)
            return
        L_0x0012:
            if (r0 == 0) goto L_0x024a
            java.lang.String r2 = java.lang.String.valueOf(r19)
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 40
            r5.<init>(r4)
            java.lang.String r4 = "Intent message received from chime is ["
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = "]"
            r5.append(r2)
            r5.toString()
            boolean r4 = defpackage.xfp.a(r18, r19)
            if (r4 != 0) goto L_0x004a
            boolean r4 = defpackage.xfp.a((android.content.Intent) r19)
            if (r4 == 0) goto L_0x0044
            goto L_0x004a
        L_0x0044:
            java.lang.String r0 = "Not a valid Contact tickle message."
        L_0x0046:
            android.util.Log.e(r3, r0)
            return
        L_0x004a:
            nsp r4 = defpackage.nsp.a((android.content.Context) r18)
            java.lang.String r4 = r4.a((android.content.Intent) r0)
            java.lang.String r5 = "gcm"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0246
            android.os.Bundle r4 = r19.getExtras()
            java.lang.String r0 = "notification_type"
            java.lang.String r5 = r4.getString(r0)
            anaf r0 = defpackage.xfp.a
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r6 = r4.getString(r0)
            boolean r0 = defpackage.amrk.a((java.lang.String) r6)
            r9 = 0
            if (r0 != 0) goto L_0x01ba
            xfo r10 = new xfo
            r10.<init>(r1)
            wss r0 = r10.a
            android.content.SharedPreferences r0 = r0.a
            java.lang.String r11 = java.lang.String.valueOf(r6)
            int r12 = r11.length()
            java.lang.String r13 = "tickle_sync_gaia_cache_account_name_"
            if (r12 != 0) goto L_0x0093
            java.lang.String r11 = new java.lang.String
            r11.<init>(r13)
            goto L_0x0097
        L_0x0093:
            java.lang.String r11 = r13.concat(r11)
        L_0x0097:
            java.lang.String r11 = r0.getString(r11, r9)
            long r14 = java.lang.System.currentTimeMillis()
            wss r0 = r10.a
            android.content.SharedPreferences r0 = r0.a
            java.lang.String r12 = java.lang.String.valueOf(r6)
            int r16 = r12.length()
            java.lang.String r7 = "tickle_sync_gaia_id_cache_last_update_timestamp_"
            if (r16 != 0) goto L_0x00b5
            java.lang.String r12 = new java.lang.String
            r12.<init>(r7)
            goto L_0x00b9
        L_0x00b5:
            java.lang.String r12 = r7.concat(r12)
        L_0x00b9:
            r8 = 0
            long r8 = r0.getLong(r12, r8)
            long r14 = r14 - r8
            r8 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 / r8
            aytx r0 = defpackage.aytx.a
            ayty r0 = r0.a()
            long r8 = r0.d()
            int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d6
            if (r11 == 0) goto L_0x00d6
            r1 = 0
            goto L_0x01b8
        L_0x00d6:
            if (r11 == 0) goto L_0x0159
            wss r0 = r10.a
            r8 = 0
            defpackage.iva.b((java.lang.String) r8)
            android.content.SharedPreferences r9 = r0.a
            java.lang.String r12 = java.lang.String.valueOf(r6)
            int r14 = r12.length()
            if (r14 != 0) goto L_0x00f0
            java.lang.String r12 = new java.lang.String
            r12.<init>(r13)
            goto L_0x00f4
        L_0x00f0:
            java.lang.String r12 = r13.concat(r12)
        L_0x00f4:
            boolean r9 = r9.contains(r12)
            if (r9 == 0) goto L_0x011b
            android.content.SharedPreferences r9 = r0.a
            android.content.SharedPreferences$Editor r9 = r9.edit()
            java.lang.String r12 = java.lang.String.valueOf(r6)
            int r14 = r12.length()
            if (r14 != 0) goto L_0x0110
            java.lang.String r12 = new java.lang.String
            r12.<init>(r13)
            goto L_0x0114
        L_0x0110:
            java.lang.String r12 = r13.concat(r12)
        L_0x0114:
            android.content.SharedPreferences$Editor r9 = r9.remove(r12)
            r9.commit()
        L_0x011b:
            android.content.SharedPreferences r9 = r0.a
            java.lang.String r12 = java.lang.String.valueOf(r6)
            int r13 = r12.length()
            if (r13 != 0) goto L_0x012d
            java.lang.String r12 = new java.lang.String
            r12.<init>(r7)
            goto L_0x0131
        L_0x012d:
            java.lang.String r12 = r7.concat(r12)
        L_0x0131:
            boolean r9 = r9.contains(r12)
            if (r9 == 0) goto L_0x015a
            android.content.SharedPreferences r0 = r0.a
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r9 = java.lang.String.valueOf(r6)
            int r12 = r9.length()
            if (r12 != 0) goto L_0x014d
            java.lang.String r9 = new java.lang.String
            r9.<init>(r7)
            goto L_0x0151
        L_0x014d:
            java.lang.String r9 = r7.concat(r9)
        L_0x0151:
            android.content.SharedPreferences$Editor r0 = r0.remove(r9)
            r0.commit()
            goto L_0x015a
        L_0x0159:
            r8 = 0
        L_0x015a:
            java.lang.String r0 = r18.getPackageName()
            java.util.List r0 = defpackage.jgu.d(r1, r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x0166:
            boolean r0 = r7.hasNext()
            java.lang.String r9 = "People_AccountUtil"
            if (r0 == 0) goto L_0x01a8
            java.lang.Object r0 = r7.next()
            r12 = r0
            android.accounts.Account r12 = (android.accounts.Account) r12
            xfm r0 = new xfm
            r0.<init>(r1, r12, r10)
            r0.start()
            aytx r0 = defpackage.aytx.a
            ayty r0 = r0.a()
            long r13 = r0.b()
            java.lang.Thread.sleep(r13)     // Catch:{ InterruptedException -> 0x018b }
            goto L_0x019c
        L_0x018b:
            r0 = move-exception
            r13 = r0
            r14 = 1
            java.lang.Object[] r0 = new java.lang.Object[r14]
            java.lang.String r13 = r13.getMessage()
            r14 = 0
            r0[r14] = r13
            java.lang.String r13 = "Current thread is interrupted. %s"
            defpackage.xdt.b(r9, r13, r0)
        L_0x019c:
            java.lang.String r0 = defpackage.xfn.a
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0166
            java.lang.String r9 = r12.name
            r1 = 0
            goto L_0x01c1
        L_0x01a8:
            if (r11 != 0) goto L_0x01b7
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r1 = 0
            r0[r1] = r6
            java.lang.String r6 = "Failed to find account name for ID %s"
            defpackage.xdt.b(r9, r6, r0)
            r9 = r8
            goto L_0x01c1
        L_0x01b7:
            r1 = 0
        L_0x01b8:
            r9 = r11
            goto L_0x01c1
        L_0x01ba:
            r8 = r9
            r1 = 0
            java.lang.String r0 = "Did not specify obfuscated Gaia Id in the tickle message payload."
            android.util.Log.e(r3, r0)
        L_0x01c1:
            boolean r0 = defpackage.amrk.a((java.lang.String) r9)
            if (r0 == 0) goto L_0x01db
            aytx r0 = defpackage.aytx.a
            ayty r0 = r0.a()
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x01d4
            goto L_0x01db
        L_0x01d4:
            java.lang.String r0 = "account name not found. cancel tickle sync."
            android.util.Log.e(r3, r0)
            return
        L_0x01db:
            java.lang.String r0 = java.lang.String.valueOf(r9)
            int r0 = r0.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r0 = r0 + 18
            r3.<init>(r0)
            java.lang.String r0 = "Account name is ["
            r3.append(r0)
            r3.append(r9)
            r3.append(r2)
            r3.toString()
            int r0 = r5.hashCode()
            r2 = -1484389806(0xffffffffa7860252, float:-3.7194987E-15)
            r3 = 2
            if (r0 == r2) goto L_0x0221
            r2 = -556418767(0xffffffffded5b931, float:-7.7001971E18)
            if (r0 == r2) goto L_0x0217
            r2 = 1549625307(0x5c5d67db, float:2.49280641E17)
            if (r0 == r2) goto L_0x020d
            goto L_0x022b
        L_0x020d:
            java.lang.String r0 = "sgbe_update_profile"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x022b
            r7 = 0
            goto L_0x022c
        L_0x0217:
            java.lang.String r0 = "sgbe_update_group"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x022b
            r7 = 2
            goto L_0x022c
        L_0x0221:
            java.lang.String r0 = "sgbe_update_contact"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x022b
            r7 = 1
            goto L_0x022c
        L_0x022b:
            r7 = -1
        L_0x022c:
            if (r7 == 0) goto L_0x0242
            r1 = 1
            if (r7 == r1) goto L_0x0238
            if (r7 == r3) goto L_0x0234
            return
        L_0x0234:
            defpackage.xfp.a((java.lang.String) r9)
            return
        L_0x0238:
            java.lang.String r0 = "contact_ids"
            r4.getString(r0)
            defpackage.xfp.c(r9)
            return
        L_0x0242:
            defpackage.xfp.b(r9)
            return
        L_0x0246:
            java.lang.String r0 = "Not a Google Cloud Message."
            goto L_0x0046
        L_0x024a:
            java.lang.String r0 = "Received intent message is null."
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.people.notifications.GcmChimeraBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
