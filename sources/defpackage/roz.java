package defpackage;

/* renamed from: roz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class roz implements acvp {
    final /* synthetic */ rpa a;

    public roz(rpa rpa) {
        this.a = rpa;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008a, code lost:
        if (((android.os.UserManager) defpackage.ihs.b().getSystemService("user")).getUserCount() <= 1) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.acwa r20) {
        /*
            r19 = this;
            r1 = r19
            boolean r0 = r20.b()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 21
            r2.<init>(r3)
            java.lang.String r3 = "Completed task: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "LockboxService"
            android.util.Log.i(r2, r0)
            boolean r0 = r20.b()
            if (r0 == 0) goto L_0x0165
            java.lang.Object r0 = r20.d()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0032
            goto L_0x0165
        L_0x0032:
            anuv r0 = defpackage.anuv.g
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            rpa r3 = r1.a
            com.google.android.gms.lockbox.LockboxChimeraService r3 = r3.a
            boolean r4 = defpackage.jkr.a()
            if (r4 == 0) goto L_0x005b
            rpk r4 = new rpk
            java.lang.String r5 = "usagestats"
            java.lang.Object r5 = r3.getSystemService(r5)
            android.app.usage.UsageStatsManager r5 = (android.app.usage.UsageStatsManager) r5
            r4.<init>(r5)
            rpg r5 = new rpg
            rpm r6 = new rpm
            r6.<init>(r3, r0, r4)
            r5.<init>(r6)
            goto L_0x005c
        L_0x005b:
            r5 = 0
        L_0x005c:
            r2.add(r5)
            aygc r3 = defpackage.aygc.a
            aygd r3 = r3.a()
            boolean r3 = r3.a()
            r4 = 1
            if (r3 == 0) goto L_0x00ae
            ayfn r3 = defpackage.ayfn.a
            ayfo r3 = r3.a()
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x008c
            int r3 = android.os.Build.VERSION.SDK_INT
            ihs r3 = defpackage.ihs.b()
            java.lang.String r5 = "user"
            java.lang.Object r3 = r3.getSystemService(r5)
            android.os.UserManager r3 = (android.os.UserManager) r3
            int r3 = r3.getUserCount()
            if (r3 > r4) goto L_0x00ae
        L_0x008c:
            rpa r3 = r1.a
            com.google.android.gms.lockbox.LockboxChimeraService r3 = r3.a
            rpg r5 = new rpg
            rqg r6 = new rqg
            r6.<init>(r3, r0)
            r5.<init>(r6)
            r2.add(r5)
            rpa r3 = r1.a
            com.google.android.gms.lockbox.LockboxChimeraService r3 = r3.a
            rpg r5 = new rpg
            rpq r6 = new rpq
            r6.<init>(r3, r0)
            r5.<init>(r6)
            r2.add(r5)
        L_0x00ae:
            rpa r0 = r1.a
            aygc r3 = defpackage.aygc.a
            aygd r3 = r3.a()
            long r5 = r3.b()
            r7 = 60000(0xea60, double:2.9644E-319)
            long r5 = java.lang.Math.max(r7, r5)
            com.google.android.gms.lockbox.LockboxChimeraService r0 = r0.a
            r0.a((long) r5)
            rpa r0 = r1.a
            long r5 = java.lang.System.currentTimeMillis()
            int r3 = r2.size()
            r7 = 0
            r8 = 0
        L_0x00d2:
            if (r8 >= r3) goto L_0x0164
            java.lang.Object r9 = r2.get(r8)
            rpg r9 = (defpackage.rpg) r9
            if (r9 == 0) goto L_0x015e
            com.google.android.gms.lockbox.LockboxChimeraService r10 = r0.a
            iby r10 = r10.c
            rpf r11 = r9.a
            rpe r17 = r11.a((long) r5)
        L_0x00e6:
            boolean r11 = r17.hasNext()     // Catch:{ all -> 0x0159 }
            if (r11 == 0) goto L_0x0154
            java.lang.Object r11 = r17.next()     // Catch:{ all -> 0x0159 }
            android.util.Pair r11 = (android.util.Pair) r11     // Catch:{ all -> 0x0159 }
            java.lang.Object r12 = r11.first     // Catch:{ all -> 0x0159 }
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0159 }
            java.lang.Object r11 = r11.second     // Catch:{ all -> 0x0159 }
            audx r11 = (defpackage.audx) r11     // Catch:{ all -> 0x0159 }
            rpf r12 = r9.a     // Catch:{ all -> 0x0159 }
            java.lang.String r15 = r12.a((defpackage.audx) r11)     // Catch:{ all -> 0x0159 }
            rpf r12 = r9.a     // Catch:{ all -> 0x0159 }
            adsa r14 = r12.a()     // Catch:{ all -> 0x0159 }
            rpf r12 = r9.a     // Catch:{ all -> 0x0159 }
            boolean r12 = r12.b()     // Catch:{ all -> 0x0159 }
            if (r12 != 0) goto L_0x0119
            byte[] r11 = r11.k()     // Catch:{ all -> 0x0159 }
            acwa r11 = r10.a((java.lang.String) r13, (byte[]) r11, (defpackage.adsa) r14, (int) r7)     // Catch:{ all -> 0x0159 }
            r13 = 0
            goto L_0x014a
        L_0x0119:
            byte[] r16 = r11.k()     // Catch:{ all -> 0x0159 }
            java.lang.String r11 = "filteredField cannot be null. Use the other upload method to explicitly indicate that whitelisting filtering is not applicable."
            defpackage.iva.a((java.lang.Object) r15, (java.lang.Object) r11)     // Catch:{ all -> 0x0159 }
            iha r12 = defpackage.ihb.b()     // Catch:{ all -> 0x0159 }
            adsf r11 = new adsf     // Catch:{ all -> 0x0159 }
            r20 = r11
            r7 = r12
            r12 = r10
            r18 = r14
            r14 = r16
            r16 = r18
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0159 }
            r11 = r20
            r7.a = r11     // Catch:{ all -> 0x0159 }
            com.google.android.gms.common.Feature[] r11 = new com.google.android.gms.common.Feature[r4]     // Catch:{ all -> 0x0159 }
            com.google.android.gms.common.Feature r12 = defpackage.adru.b     // Catch:{ all -> 0x0159 }
            r13 = 0
            r11[r13] = r12     // Catch:{ all -> 0x0159 }
            r7.b = r11     // Catch:{ all -> 0x0159 }
            ihb r7 = r7.a()     // Catch:{ all -> 0x0159 }
            acwa r11 = r10.b((defpackage.ihb) r7)     // Catch:{ all -> 0x0159 }
        L_0x014a:
            rpd r7 = new rpd     // Catch:{ all -> 0x0159 }
            r7.<init>()     // Catch:{ all -> 0x0159 }
            r11.a((defpackage.acvp) r7)     // Catch:{ all -> 0x0159 }
            r7 = 0
            goto L_0x00e6
        L_0x0154:
            r13 = 0
            r17.a()
            goto L_0x015f
        L_0x0159:
            r0 = move-exception
            r17.a()
            throw r0
        L_0x015e:
            r13 = 0
        L_0x015f:
            int r8 = r8 + 1
            r7 = 0
            goto L_0x00d2
        L_0x0164:
            return
        L_0x0165:
            rpa r0 = r1.a
            com.google.android.gms.lockbox.LockboxChimeraService r0 = r0.a
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            r0.a((long) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.roz.a(acwa):void");
    }
}
