package com.google.android.gms.smartdevice.service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SmartDeviceIntentHandlers$OnUpgradeOrBootOperation extends hec {
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0096, code lost:
        if (r12 > r9.c) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00c2, code lost:
        r9.a = r10;
        r1 = r9.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ca, code lost:
        if (r1 <= 0) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00cc, code lost:
        r1 = r1 - r12;
        r9.c = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d1, code lost:
        r14 = r9.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d5, code lost:
        if (r14 <= 0) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d9, code lost:
        if (r1 >= 0) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00db, code lost:
        r9.b = r14 + r1;
        r9.c = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e1, code lost:
        r9.b = r14 - r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e4, code lost:
        r0.a(r7, r8, r9);
        r2 = r17;
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x008d, code lost:
        if (r12 > (r9.b + r9.c)) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Intent r17, int r18) {
        /*
            r16 = this;
            iwd r0 = defpackage.achc.a
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r17
            java.lang.Integer r4 = java.lang.Integer.valueOf(r18)
            r5 = 1
            r2[r5] = r4
            java.lang.String r4 = "OnUpgradeOrBootOperation got intent: %s with flag %d"
            r0.a(r4, r2)
            android.content.Context r0 = r16.getBaseContext()
            acgc r0 = defpackage.acgc.a(r0)
            android.content.SharedPreferences r2 = defpackage.acgc.a()
            java.util.Map r2 = r2.getAll()
            int r4 = r2.size()
            if (r4 == 0) goto L_0x0111
            iwd r4 = defpackage.acgc.a
            java.lang.Object[] r6 = new java.lang.Object[r5]
            int r7 = r2.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r3] = r7
            java.lang.String r7 = "Found %s notifications."
            r4.a(r7, r6)
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x004a:
            boolean r6 = r2.hasNext()
            java.lang.String r7 = ":"
            if (r6 == 0) goto L_0x00ec
            java.lang.Object r6 = r2.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r8 = r6.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String[] r7 = r8.split(r7, r1)
            r8 = r7[r3]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r8 = r8.intValue()
            r7 = r7[r5]
            java.lang.Object r9 = r6.getValue()
            java.lang.String r9 = (java.lang.String) r9
            com.google.android.gms.smartdevice.notification.SerializableNotification r9 = com.google.android.gms.smartdevice.notification.SerializableNotification.a((java.lang.String) r9)
            long r10 = java.lang.System.currentTimeMillis()
            long r12 = r9.a
            long r12 = r10 - r12
            boolean r14 = r9.h
            if (r14 == 0) goto L_0x0090
            long r14 = r9.b
            r17 = r2
            long r1 = r9.c
            long r14 = r14 + r1
            int r1 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x00c2
            goto L_0x0098
        L_0x0090:
            r17 = r2
            long r1 = r9.c
            int r14 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r14 <= 0) goto L_0x00c2
        L_0x0098:
            iwd r1 = defpackage.acgc.a
            java.lang.String r2 = java.lang.String.valueOf(r7)
            java.lang.String r7 = "Not showing expired notification with tag: "
            int r8 = r2.length()
            if (r8 != 0) goto L_0x00ac
            java.lang.String r2 = new java.lang.String
            r2.<init>(r7)
            goto L_0x00b0
        L_0x00ac:
            java.lang.String r2 = r7.concat(r2)
        L_0x00b0:
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r1.c(r2, r7)
            java.lang.Object r1 = r6.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r4.add(r1)
            r2 = r17
            r1 = 2
            goto L_0x004a
        L_0x00c2:
            r9.a = r10
            long r1 = r9.c
            r10 = 0
            int r6 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d0
            long r1 = r1 - r12
            r9.c = r1
            goto L_0x00d1
        L_0x00d0:
        L_0x00d1:
            long r14 = r9.b
            int r6 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r6 <= 0) goto L_0x00e4
            int r6 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x00e1
            long r14 = r14 + r1
            r9.b = r14
            r9.c = r10
            goto L_0x00e4
        L_0x00e1:
            long r14 = r14 - r12
            r9.b = r14
        L_0x00e4:
            r0.a((java.lang.String) r7, (int) r8, (com.google.android.gms.smartdevice.notification.SerializableNotification) r9)
            r2 = r17
            r1 = 2
            goto L_0x004a
        L_0x00ec:
            java.util.Iterator r1 = r4.iterator()
        L_0x00f0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0111
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r4 = 2
            java.lang.String[] r2 = r2.split(r7, r4)
            r6 = r2[r3]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r6 = r6.intValue()
            r2 = r2[r5]
            r0.b(r2, r6)
            goto L_0x00f0
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.smartdevice.service.SmartDeviceIntentHandlers$OnUpgradeOrBootOperation.a(android.content.Intent, int):void");
    }
}
