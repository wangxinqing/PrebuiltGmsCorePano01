package defpackage;

/* renamed from: dlu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dlu implements Runnable {
    final /* synthetic */ dpc a;
    final /* synthetic */ dly b;

    public dlu(dly dly, dpc dpc) {
        this.b = dly;
        this.a = dpc;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            dly r0 = r14.b
            dms r0 = r0.a
            dpc r1 = r14.a
            defpackage.iva.a((java.lang.Object) r1)
            defpackage.dkw.a()
            r0.q()
            boolean r2 = r0.h
            if (r2 == 0) goto L_0x0019
            java.lang.String r2 = "Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions"
            r0.c(r2)
            goto L_0x001f
        L_0x0019:
            java.lang.String r2 = "Delivering hit"
            r0.a(r2, r1)
        L_0x001f:
            java.lang.String r2 = "_m"
            java.lang.String r3 = ""
            java.lang.String r2 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r11 = 1
            r12 = 0
            if (r2 == 0) goto L_0x00e2
            dpp r2 = r0.l()
            dpo r2 = r2.b
            long r3 = r2.b()
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0050
            dpp r7 = r2.b
            jiq r7 = r7.c()
            long r7 = r7.a()
            long r3 = r3 - r7
            long r3 = java.lang.Math.abs(r3)
            goto L_0x0051
        L_0x0050:
            r3 = r5
        L_0x0051:
            long r7 = r2.a
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x008d
            long r7 = r7 + r7
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x0089
            dpp r3 = r2.b
            android.content.SharedPreferences r3 = r3.a
            java.lang.String r4 = r2.d()
            java.lang.String r3 = r3.getString(r4, r12)
            dpp r4 = r2.b
            android.content.SharedPreferences r4 = r4.a
            java.lang.String r7 = r2.c()
            long r7 = r4.getLong(r7, r5)
            r2.a()
            if (r3 == 0) goto L_0x0087
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x0087
            android.util.Pair r2 = new android.util.Pair
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            r2.<init>(r3, r4)
            goto L_0x008f
        L_0x0087:
            r2 = r12
            goto L_0x008f
        L_0x0089:
            r2.a()
            goto L_0x008e
        L_0x008d:
        L_0x008e:
            r2 = r12
        L_0x008f:
            if (r2 == 0) goto L_0x00e1
            java.lang.Object r3 = r2.second
            java.lang.Long r3 = (java.lang.Long) r3
            java.lang.Object r2 = r2.first
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            java.lang.String r5 = java.lang.String.valueOf(r2)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + r11
            int r4 = r4 + r5
            r6.<init>(r4)
            r6.append(r3)
            java.lang.String r3 = ":"
            r6.append(r3)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            java.util.HashMap r3 = new java.util.HashMap
            java.util.Map r4 = r1.a
            r3.<init>(r4)
            java.lang.String r4 = "_m"
            r3.put(r4, r2)
            dpc r13 = new dpc
            long r4 = r1.d
            boolean r6 = r1.f
            long r7 = r1.c
            int r9 = r1.e
            java.util.List r10 = r1.b
            r1 = r13
            r2 = r0
            r1.<init>(r2, r3, r4, r6, r7, r9, r10)
            goto L_0x00e3
        L_0x00e1:
            goto L_0x00e3
        L_0x00e2:
        L_0x00e3:
            boolean r2 = r0.h
            if (r2 == 0) goto L_0x00e9
            goto L_0x01c2
        L_0x00e9:
            r0.f()
            doy r2 = defpackage.doz.a
            java.lang.Object r2 = r2.a()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x01c2
            dmk r2 = r0.c
            boolean r2 = r2.b()
            if (r2 != 0) goto L_0x01c2
            r0.f()
            doy r2 = defpackage.doz.E
            java.lang.Object r2 = r2.a()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            dpw r4 = r0.f
            boolean r2 = r4.a(r2)
            if (r2 == 0) goto L_0x01c2
            dpw r2 = r0.f
            r2.a()
            java.lang.String r2 = "Connecting to service"
            r0.b(r2)
            dmk r2 = r0.c
            defpackage.dkw.a()
            r2.q()
            dpf r3 = r2.b
            if (r3 != 0) goto L_0x01b4
            dmj r3 = r2.a
            defpackage.dkw.a()
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "com.google.android.gms.analytics.service.START"
            r4.<init>(r5)
            android.content.ComponentName r5 = new android.content.ComponentName
            java.lang.String r6 = "com.google.android.gms"
            java.lang.String r7 = "com.google.android.gms.analytics.service.AnalyticsService"
            r5.<init>(r6, r7)
            r4.setComponent(r5)
            dmk r5 = r3.c
            android.content.Context r5 = r5.d()
            java.lang.String r6 = r5.getPackageName()
            java.lang.String r7 = "app_package_name"
            r4.putExtra(r7, r6)
            jca r6 = defpackage.jca.a()
            monitor-enter(r3)
            r3.a = r12     // Catch:{ all -> 0x01b1 }
            r3.b = r11     // Catch:{ all -> 0x01b1 }
            dmk r7 = r3.c     // Catch:{ all -> 0x01b1 }
            dmj r7 = r7.a     // Catch:{ all -> 0x01b1 }
            r8 = 129(0x81, float:1.81E-43)
            boolean r4 = r6.a(r5, r4, r7, r8)     // Catch:{ all -> 0x01b1 }
            dmk r5 = r3.c     // Catch:{ all -> 0x01b1 }
            java.lang.String r6 = "Bind to service requested"
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x01b1 }
            r5.a(r6, r7)     // Catch:{ all -> 0x01b1 }
            r5 = 0
            if (r4 == 0) goto L_0x01a6
            dmk r4 = r3.c     // Catch:{ InterruptedException -> 0x018c }
            r4.f()     // Catch:{ InterruptedException -> 0x018c }
            doy r4 = defpackage.doz.D     // Catch:{ InterruptedException -> 0x018c }
            java.lang.Object r4 = r4.a()     // Catch:{ InterruptedException -> 0x018c }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ InterruptedException -> 0x018c }
            long r6 = r4.longValue()     // Catch:{ InterruptedException -> 0x018c }
            r3.wait(r6)     // Catch:{ InterruptedException -> 0x018c }
            goto L_0x0194
        L_0x018c:
            r4 = move-exception
            dmk r4 = r3.c     // Catch:{ all -> 0x01b1 }
            java.lang.String r6 = "Wait for service connect was interrupted"
            r4.d(r6)     // Catch:{ all -> 0x01b1 }
        L_0x0194:
            r3.b = r5     // Catch:{ all -> 0x01b1 }
            dpf r4 = r3.a     // Catch:{ all -> 0x01b1 }
            r3.a = r12     // Catch:{ all -> 0x01b1 }
            if (r4 != 0) goto L_0x01a3
            dmk r5 = r3.c     // Catch:{ all -> 0x01b1 }
            java.lang.String r6 = "Successfully bound to service but never got onServiceConnected callback"
            r5.e(r6)     // Catch:{ all -> 0x01b1 }
        L_0x01a3:
            monitor-exit(r3)     // Catch:{ all -> 0x01b1 }
            r12 = r4
            goto L_0x01a9
        L_0x01a6:
            r3.b = r5     // Catch:{ all -> 0x01b1 }
            monitor-exit(r3)     // Catch:{ all -> 0x01b1 }
        L_0x01a9:
            if (r12 == 0) goto L_0x01c2
            r2.b = r12
            r2.s()
            goto L_0x01b4
        L_0x01b1:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01b1 }
            throw r0
        L_0x01b4:
            java.lang.String r2 = "Connected to service"
            r0.b(r2)
            dpw r2 = r0.f
            r2.b()
            r0.b()
        L_0x01c2:
            dmk r2 = r0.c
            defpackage.iva.a((java.lang.Object) r1)
            defpackage.dkw.a()
            r2.q()
            dpf r3 = r2.b
            if (r3 != 0) goto L_0x01d2
            goto L_0x0201
        L_0x01d2:
            boolean r4 = r1.f
            if (r4 == 0) goto L_0x01df
            r2.f()
            java.lang.String r4 = defpackage.dmy.g()
            r7 = r4
            goto L_0x01e7
        L_0x01df:
            r2.f()
            java.lang.String r4 = defpackage.dmy.i()
            r7 = r4
        L_0x01e7:
            java.util.List r8 = java.util.Collections.emptyList()
            java.util.Map r4 = r1.a     // Catch:{ RemoteException -> 0x01fb }
            long r5 = r1.d     // Catch:{ RemoteException -> 0x01fb }
            r3.a(r4, r5, r7, r8)     // Catch:{ RemoteException -> 0x01fb }
            r2.s()     // Catch:{ RemoteException -> 0x01fb }
            java.lang.String r1 = "Hit sent to the device AnalyticsService for delivery"
            r0.c(r1)
            return
        L_0x01fb:
            r3 = move-exception
            java.lang.String r3 = "Failed to send hits to AnalyticsService"
            r2.b(r3)
        L_0x0201:
            r0.f()
            dpk r0 = r0.e()
            java.lang.String r2 = "Service unavailable on package side"
            r0.a((defpackage.dpc) r1, (java.lang.String) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlu.run():void");
    }
}
