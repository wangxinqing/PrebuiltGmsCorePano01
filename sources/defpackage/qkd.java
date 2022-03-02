package defpackage;

import android.content.Context;

/* renamed from: qkd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qkd implements qkc {
    private final qfn a = new qfn("HashPrefixFilterImpl");
    private final Context b;
    private final qkb c;
    private final qfg d;
    private final qiz e;
    private final qfk f;
    private final qjt g;
    private final qex h;

    public qkd(Context context, qkb qkb, qfg qfg, qiz qiz, qfk qfk, qjt qjt, qex qex) {
        this.b = context;
        this.c = qkb;
        this.d = qfg;
        this.e = qiz;
        this.f = qfk;
        this.g = qjt;
        this.h = qex;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0182  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List a(int[] r26) {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
            qjt r0 = r1.g
            if (r0 == 0) goto L_0x0241
            qex r0 = r1.h
            qev r4 = r0.a()
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r2.length
            r5.<init>(r6)
            ob r7 = new ob
            r7.<init>()
            ob r8 = new ob
            r8.<init>()
            android.util.ArrayMap r9 = new android.util.ArrayMap
            r9.<init>()
            android.util.ArrayMap r10 = new android.util.ArrayMap
            r10.<init>()
            qfk r0 = r1.f
            boolean r11 = r0.a()
            axve r0 = defpackage.axve.a
            axvf r0 = r0.a()
            boolean r12 = r0.c()
            r0 = 0
            r13 = 0
        L_0x003a:
            if (r13 >= r6) goto L_0x01ec
            r15 = r2[r13]
            qkb r14 = r1.c     // Catch:{ IOException -> 0x01d5 }
            amri r14 = r14.a((int) r15)     // Catch:{ IOException -> 0x01d5 }
            boolean r16 = r14.a()
            if (r16 != 0) goto L_0x004b
            goto L_0x005e
        L_0x004b:
            java.lang.Object r16 = r14.b()
            java.util.Set r16 = (java.util.Set) r16
            boolean r16 = r16.isEmpty()
            if (r16 == 0) goto L_0x0068
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            r7.add(r14)
        L_0x005e:
            r18 = r6
            r20 = r9
            r22 = r11
            r23 = r12
            goto L_0x01c7
        L_0x0068:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r8.add(r15)
            java.lang.Object r14 = r14.b()
            java.util.Set r14 = (java.util.Set) r14
            java.util.Iterator r14 = r14.iterator()
        L_0x0079:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x01bd
            java.lang.Object r15 = r14.next()
            java.lang.String r15 = (java.lang.String) r15
            qjt r3 = r1.g
            qje r3 = r3.a((java.lang.String) r15)
            if (r3 != 0) goto L_0x009a
            qfn r3 = r1.a
            r17 = r0
            r15 = 0
            java.lang.Object[] r0 = new java.lang.Object[r15]
            java.lang.String r15 = "Domain entry missing for hash prefix match"
            r3.b(r15, r0)
            goto L_0x00e6
        L_0x009a:
            r17 = r0
            if (r12 != 0) goto L_0x009f
            goto L_0x00d2
        L_0x009f:
            aucx r0 = r3.b     // Catch:{ IOException -> 0x01a6 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x01a6 }
        L_0x00a5:
            boolean r18 = r0.hasNext()     // Catch:{ IOException -> 0x01a6 }
            if (r18 == 0) goto L_0x00d2
            java.lang.Object r18 = r0.next()     // Catch:{ IOException -> 0x01a6 }
            r19 = r0
            r0 = r18
            qjn r0 = (defpackage.qjn) r0     // Catch:{ IOException -> 0x01a6 }
            java.lang.String r2 = r0.a     // Catch:{ IOException -> 0x01a6 }
            boolean r2 = r9.containsKey(r2)     // Catch:{ IOException -> 0x01a6 }
            if (r2 != 0) goto L_0x00cd
            java.lang.String r0 = r0.a     // Catch:{ IOException -> 0x01a6 }
            qjt r2 = r1.g     // Catch:{ IOException -> 0x01a6 }
            byte[] r2 = r2.b((java.lang.String) r0)     // Catch:{ IOException -> 0x01a6 }
            r9.put(r0, r2)     // Catch:{ IOException -> 0x01a6 }
            r2 = r26
            r0 = r19
            goto L_0x00a5
        L_0x00cd:
            r2 = r26
            r0 = r19
            goto L_0x00a5
        L_0x00d2:
            java.lang.String r2 = defpackage.qjz.b(r15)
            java.util.List r3 = defpackage.qke.a(r2, r3, r9, r11)
            if (r3 != 0) goto L_0x00eb
            qfn r0 = r1.a
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r2 = "Found domain with no filters!"
            r0.b(r2, r3)
        L_0x00e6:
            r2 = r26
            r0 = r17
            goto L_0x0079
        L_0x00eb:
            int r15 = r3.size()
            r18 = r6
            r6 = 0
        L_0x00f2:
            if (r6 >= r15) goto L_0x0196
            java.lang.Object r0 = r3.get(r6)
            r19 = r3
            r3 = r0
            android.content.pm.InstantAppResolveInfo r3 = (android.content.pm.InstantAppResolveInfo) r3
            r20 = r9
            java.lang.String r9 = r3.getPackageName()
            boolean r0 = r10.containsKey(r9)
            if (r0 == 0) goto L_0x011a
            java.lang.Object r0 = r10.get(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r22 = r11
            r23 = r12
            r24 = r14
            goto L_0x0152
        L_0x011a:
            qiz r0 = r1.e     // Catch:{ IOException -> 0x0136 }
            boolean r21 = r0.i(r9)     // Catch:{ IOException -> 0x0136 }
            if (r21 == 0) goto L_0x012d
            r22 = r11
            r11 = 1
            java.lang.Object[] r0 = new java.lang.Object[r11]     // Catch:{ IOException -> 0x012b }
            r11 = 0
            r0[r11] = r9     // Catch:{ IOException -> 0x012b }
            goto L_0x012f
        L_0x012b:
            r0 = move-exception
            goto L_0x013b
        L_0x012d:
            r22 = r11
        L_0x012f:
            r23 = r12
            r24 = r14
            r0 = r21
            goto L_0x014b
        L_0x0136:
            r0 = move-exception
            r22 = r11
            r21 = 0
        L_0x013b:
            qfn r11 = r1.a
            r23 = r12
            r24 = r14
            r12 = 0
            java.lang.Object[] r14 = new java.lang.Object[r12]
            java.lang.String r12 = "getUserPrefersBrowser"
            r11.a(r0, r12, r14)
            r0 = r21
        L_0x014b:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
            r10.put(r9, r11)
        L_0x0152:
            if (r0 != 0) goto L_0x0182
            axve r0 = defpackage.axve.a
            axvf r0 = r0.a()
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x017c
            java.lang.String r0 = "instant.app"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x017c
            android.content.Context r0 = r1.b
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            boolean r0 = defpackage.qjz.a(r0, r9)
            if (r0 != 0) goto L_0x0175
            goto L_0x017c
        L_0x0175:
            java.lang.String r0 = "HashPrefixFilter.excludedPersistentAppInstalled"
            r4.a(r0)
            goto L_0x0188
        L_0x017c:
            int r17 = r17 + 1
            r5.add(r3)
            goto L_0x0188
        L_0x0182:
            java.lang.String r0 = "HashPrefixFilter.excludedUserPrefersBrowser"
            r4.a(r0)
        L_0x0188:
            int r6 = r6 + 1
            r3 = r19
            r9 = r20
            r11 = r22
            r12 = r23
            r14 = r24
            goto L_0x00f2
        L_0x0196:
            r20 = r9
            r22 = r11
            r23 = r12
            r24 = r14
            r2 = r26
            r0 = r17
            r6 = r18
            goto L_0x0079
        L_0x01a6:
            r0 = move-exception
            qfn r2 = r1.a
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "Couldn't fetch domain filter metadata, aborting!"
            r2.a(r0, r4, r3)
            qfg r0 = r1.d
            r2 = 14
            r0.a(r2)
            amzy r0 = defpackage.amzy.h()
            return r0
        L_0x01bd:
            r17 = r0
            r18 = r6
            r20 = r9
            r22 = r11
            r23 = r12
        L_0x01c7:
            int r13 = r13 + 1
            r2 = r26
            r6 = r18
            r9 = r20
            r11 = r22
            r12 = r23
            goto L_0x003a
        L_0x01d5:
            r0 = move-exception
            qfn r2 = r1.a
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "Couldn't fetch domains, aborting!"
            r2.a(r0, r4, r3)
            qfg r0 = r1.d
            r2 = 14
            r0.a(r2)
            amzy r0 = defpackage.amzy.h()
            return r0
        L_0x01ec:
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L_0x01f8
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x01fd
        L_0x01f8:
            qjt r2 = r1.g
            defpackage.qko.a(r7, r8, r2)
        L_0x01fd:
            qfg r2 = r1.d
            int r3 = r7.b
            r2.b(r0, r3)
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            int r2 = r5.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r0[r3] = r2
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0226
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x021f
            goto L_0x0226
        L_0x021f:
            java.lang.String r0 = "HashPrefixFilter.noMatch"
            r4.a(r0)
            goto L_0x0231
        L_0x0226:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0231
            java.lang.String r0 = "HashPrefixFilter.firstPhaseMatch"
            r4.a(r0)
        L_0x0231:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x023c
            java.lang.String r0 = "HashPrefixFilter.secondPhaseMatch"
            r4.a(r0)
        L_0x023c:
            amzy r0 = defpackage.amzy.a((java.util.Collection) r5)
            return r0
        L_0x0241:
            qfn r0 = r1.a
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "Not registered for domain filter, getDomainsForPrefixes skipped"
            r0.b(r3, r2)
            qfg r0 = r1.d
            r2 = 15
            r0.a(r2)
            amzy r0 = defpackage.amzy.h()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qkd.a(int[]):java.util.List");
    }
}
