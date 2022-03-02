package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: prn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class prn {
    private static final Object a = new Object();
    private static final Map b = new HashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0153, code lost:
        r1 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x015b, code lost:
        if (r1.hasNext() == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015d, code lost:
        r2 = (java.lang.String) r1.next();
        r4 = new android.content.Intent("com.google.firebase.appindexing.USER_ACTION_NOTIFICATION");
        r4.putExtra("reportingPackageName", r0);
        defpackage.ivy.a((java.lang.Iterable) r3, r4, "usageInfoBytes");
        r4.setPackage(r2);
        r16.sendBroadcast(r4);
        defpackage.oso.a("Sent notification %s to %s.", (java.lang.Object) r4.getAction(), (java.lang.Object) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0188, code lost:
        return defpackage.aono.NOTIFICATION_BROADCAST;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.aono a(android.content.Context r16, java.lang.String r17, com.google.android.gms.appdatasearch.UsageInfo[] r18, defpackage.hya r19) {
        /*
            r0 = r17
            r1 = r18
            agvx r2 = defpackage.ozx.F
            java.lang.Object r2 = r2.c()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0015
            aono r0 = defpackage.aono.FEATURE_DISABLED
            return r0
        L_0x0015:
            boolean r2 = defpackage.ozx.a((java.lang.String) r17)
            if (r2 == 0) goto L_0x0197
            if (r1 == 0) goto L_0x0194
            int r2 = r1.length
            if (r2 <= 0) goto L_0x0194
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Set r3 = defpackage.ozx.a()
            java.util.Iterator r3 = r3.iterator()
        L_0x002d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0045
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r5 = r19
            boolean r6 = r5.b((java.lang.String) r4)
            if (r6 == 0) goto L_0x002d
            r2.add(r4)
            goto L_0x002d
        L_0x0045:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x004e
            aono r0 = defpackage.aono.NO_IME_PACKAGES
            return r0
        L_0x004e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r1.length
            r6 = 0
        L_0x0055:
            if (r6 >= r4) goto L_0x00c5
            r7 = r1[r6]
            if (r7 != 0) goto L_0x005c
        L_0x005b:
            goto L_0x00c0
        L_0x005c:
            com.google.android.gms.appdatasearch.DocumentId r8 = r7.a
            if (r8 == 0) goto L_0x005b
            int r9 = r7.c
            r10 = 5
            if (r9 != r10) goto L_0x005b
            java.lang.String r9 = r8.a
            java.lang.String r8 = r8.b
            boolean r10 = r8.isEmpty()
            if (r10 == 0) goto L_0x00bd
            duo r10 = new duo
            r10.<init>()
            com.google.android.gms.appdatasearch.DocumentId r11 = new com.google.android.gms.appdatasearch.DocumentId
            if (r7 == 0) goto L_0x009b
            com.google.android.gms.appdatasearch.DocumentContents r13 = r7.e
            if (r13 == 0) goto L_0x009b
            com.google.android.gms.appdatasearch.DocumentSection[] r13 = r13.a
            int r14 = r13.length
            r15 = 0
        L_0x0080:
            if (r15 >= r14) goto L_0x0095
            r5 = r13[r15]
            com.google.android.gms.appdatasearch.RegisterSectionInfo r12 = r5.d
            java.lang.String r12 = r12.a
            java.lang.String r1 = "intent_data"
            boolean r1 = r12.equals(r1)
            if (r1 != 0) goto L_0x0096
            int r15 = r15 + 1
            r1 = r18
            goto L_0x0080
        L_0x0095:
            r5 = 0
        L_0x0096:
            if (r5 == 0) goto L_0x009b
            java.lang.String r12 = r5.c
            goto L_0x009c
        L_0x009b:
            r12 = 0
        L_0x009c:
            r11.<init>(r9, r8, r12)
            r10.a = r11
            int r1 = r7.h
            r10.f = r1
            boolean r1 = r7.f
            r10.e = r1
            long r8 = r7.b
            r10.b = r8
            int r1 = r7.c
            r10.c = r1
            java.lang.String r1 = r7.i
            r10.g = r1
            com.google.android.gms.appdatasearch.UsageInfo r1 = r10.a()
            r3.add(r1)
            goto L_0x00c0
        L_0x00bd:
            r3.add(r7)
        L_0x00c0:
            int r6 = r6 + 1
            r1 = r18
            goto L_0x0055
        L_0x00c5:
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x00ce
            aono r0 = defpackage.aono.NO_FIREBASE_USER_ACTIONS
            return r0
        L_0x00ce:
            java.lang.Object r1 = a
            monitor-enter(r1)
            java.util.Map r4 = b     // Catch:{ all -> 0x0191 }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ all -> 0x0191 }
            pri r4 = (defpackage.pri) r4     // Catch:{ all -> 0x0191 }
            if (r4 != 0) goto L_0x00e5
            pri r4 = new pri     // Catch:{ all -> 0x0191 }
            r4.<init>()     // Catch:{ all -> 0x0191 }
            java.util.Map r5 = b     // Catch:{ all -> 0x0191 }
            r5.put(r0, r4)     // Catch:{ all -> 0x0191 }
        L_0x00e5:
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0191 }
            long r7 = r4.a     // Catch:{ all -> 0x0191 }
            long r7 = r5 - r7
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0191 }
            r10 = 1
            long r12 = r9.toMillis(r10)     // Catch:{ all -> 0x0191 }
            int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r9 <= 0) goto L_0x010e
            java.lang.String r7 = "Per second quota for UserActionNotification gets refreshed."
            defpackage.oso.d(r7)     // Catch:{ all -> 0x0191 }
            agvx r7 = defpackage.ozx.G     // Catch:{ all -> 0x0191 }
            java.lang.Object r7 = r7.c()     // Catch:{ all -> 0x0191 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0191 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0191 }
            r4.b = r7     // Catch:{ all -> 0x0191 }
            r4.a = r5     // Catch:{ all -> 0x0191 }
        L_0x010e:
            long r7 = r4.c     // Catch:{ all -> 0x0191 }
            long r7 = r5 - r7
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ all -> 0x0191 }
            long r9 = r9.toMillis(r10)     // Catch:{ all -> 0x0191 }
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0131
            java.lang.String r7 = "Daily quota for UserActionNotification gets refreshed."
            defpackage.oso.d(r7)     // Catch:{ all -> 0x0191 }
            agvx r7 = defpackage.ozx.H     // Catch:{ all -> 0x0191 }
            java.lang.Object r7 = r7.c()     // Catch:{ all -> 0x0191 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0191 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0191 }
            r4.d = r7     // Catch:{ all -> 0x0191 }
            r4.c = r5     // Catch:{ all -> 0x0191 }
        L_0x0131:
            long r5 = r4.b     // Catch:{ all -> 0x0191 }
            r7 = 2
            r8 = 0
            r10 = 1
            int r11 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r11 == 0) goto L_0x014d
            long r11 = r4.d     // Catch:{ all -> 0x0191 }
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 == 0) goto L_0x014b
            r8 = -1
            long r5 = r5 + r8
            r4.b = r5     // Catch:{ all -> 0x0191 }
            long r11 = r11 + r8
            r4.d = r11     // Catch:{ all -> 0x0191 }
            r5 = 0
            goto L_0x014e
        L_0x014b:
            r5 = 2
            goto L_0x014e
        L_0x014d:
            r5 = 1
        L_0x014e:
            if (r5 == r10) goto L_0x018d
            if (r5 == r7) goto L_0x0189
            monitor-exit(r1)     // Catch:{ all -> 0x0191 }
            java.util.Iterator r1 = r2.iterator()
        L_0x0157:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0186
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "com.google.firebase.appindexing.USER_ACTION_NOTIFICATION"
            r4.<init>(r5)
            java.lang.String r5 = "reportingPackageName"
            r4.putExtra(r5, r0)
            java.lang.String r5 = "usageInfoBytes"
            defpackage.ivy.a((java.lang.Iterable) r3, (android.content.Intent) r4, (java.lang.String) r5)
            r4.setPackage(r2)
            r5 = r16
            r5.sendBroadcast(r4)
            java.lang.String r4 = r4.getAction()
            java.lang.String r6 = "Sent notification %s to %s."
            defpackage.oso.a((java.lang.String) r6, (java.lang.Object) r4, (java.lang.Object) r2)
            goto L_0x0157
        L_0x0186:
            aono r0 = defpackage.aono.NOTIFICATION_BROADCAST
            return r0
        L_0x0189:
            aono r0 = defpackage.aono.THROTTLED_DUE_TO_DAILY_QUOTA     // Catch:{ all -> 0x0191 }
            monitor-exit(r1)     // Catch:{ all -> 0x0191 }
            return r0
        L_0x018d:
            aono r0 = defpackage.aono.THROTTLED_DUE_TO_PER_SECOND_QUOTA     // Catch:{ all -> 0x0191 }
            monitor-exit(r1)     // Catch:{ all -> 0x0191 }
            return r0
        L_0x0191:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0191 }
            throw r0
        L_0x0194:
            aono r0 = defpackage.aono.USAGE_INFO_IS_EMPTY
            return r0
        L_0x0197:
            aono r0 = defpackage.aono.CLIENT_NOT_WHITELISTED
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prn.a(android.content.Context, java.lang.String, com.google.android.gms.appdatasearch.UsageInfo[], hya):aono");
    }
}
