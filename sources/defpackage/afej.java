package defpackage;

import java.util.List;

/* renamed from: afej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afej implements aoqb {
    private final afek a;
    private final List b;

    public afej(afek afek, List list) {
        this.a = afek;
        this.b = list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aorr a(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            afek r2 = r1.a
            java.util.List r0 = r1.b
            r3 = r18
            auke r3 = (defpackage.auke) r3
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            aucx r3 = r3.a
            int r5 = r3.size()
            r7 = 0
        L_0x0016:
            if (r7 >= r5) goto L_0x008e
            java.lang.Object r8 = r3.get(r7)
            aukd r8 = (defpackage.aukd) r8
            aukh r9 = r8.c
            if (r9 != 0) goto L_0x0024
            aukh r9 = defpackage.aukh.c
        L_0x0024:
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            aucx r8 = r8.d
            int r11 = r8.size()
            r12 = 0
        L_0x0030:
            if (r12 >= r11) goto L_0x0082
            java.lang.Object r13 = r8.get(r12)
            aujy r13 = (defpackage.aujy) r13
            int r14 = r13.a
            java.lang.String r15 = ""
            r6 = 1
            if (r14 == r6) goto L_0x0041
            r14 = r15
            goto L_0x0045
        L_0x0041:
            java.lang.Object r14 = r13.b
            java.lang.String r14 = (java.lang.String) r14
        L_0x0045:
            int r6 = r13.e
            boolean r16 = r10.containsKey(r14)
            if (r16 == 0) goto L_0x0069
            java.lang.Object r14 = r10.get(r14)
            java.lang.Integer r14 = (java.lang.Integer) r14
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r6 = r14.equals(r6)
            if (r6 == 0) goto L_0x005e
            goto L_0x0069
        L_0x005e:
            aetj r6 = r2.b
            r14 = 10019(0x2723, float:1.404E-41)
            aokg r1 = defpackage.afgq.a(r9)
            r6.a(r14, r1)
        L_0x0069:
            int r1 = r13.a
            r6 = 1
            if (r1 == r6) goto L_0x006f
            goto L_0x0074
        L_0x006f:
            java.lang.Object r1 = r13.b
            r15 = r1
            java.lang.String r15 = (java.lang.String) r15
        L_0x0074:
            int r1 = r13.e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.put(r15, r1)
            int r12 = r12 + 1
            r1 = r17
            goto L_0x0030
        L_0x0082:
            anaf r1 = defpackage.anaf.a((java.util.Map) r10)
            r4.put(r9, r1)
            int r7 = r7 + 1
            r1 = r17
            goto L_0x0016
        L_0x008e:
            anaf r1 = defpackage.anaf.a((java.util.Map) r4)
            java.util.Iterator r3 = r0.iterator()     // Catch:{ afdy -> 0x0149 }
        L_0x0096:
            boolean r0 = r3.hasNext()     // Catch:{ afdy -> 0x0149 }
            if (r0 == 0) goto L_0x0143
            java.lang.Object r0 = r3.next()     // Catch:{ afdy -> 0x0149 }
            r4 = r0
            afdx r4 = (defpackage.afdx) r4     // Catch:{ afdy -> 0x0149 }
            aukh r0 = r4.c()     // Catch:{ afdy -> 0x0149 }
            boolean r0 = r1.containsKey(r0)     // Catch:{ afdy -> 0x0149 }
            if (r0 != 0) goto L_0x00af
            goto L_0x012e
        L_0x00af:
            aukh r0 = r4.c()     // Catch:{ afdy -> 0x0149 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ afdy -> 0x0149 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ afdy -> 0x0149 }
            java.lang.String r5 = r4.a()     // Catch:{ afdy -> 0x0149 }
            boolean r5 = r0.containsKey(r5)     // Catch:{ afdy -> 0x0149 }
            if (r5 == 0) goto L_0x012e
            java.lang.String r5 = r4.a()     // Catch:{ afdy -> 0x0149 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ afdy -> 0x0149 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ afdy -> 0x0149 }
            int r5 = r0.intValue()     // Catch:{ afdy -> 0x0149 }
            r6 = -1
            int r0 = r4.g()     // Catch:{ IOException -> 0x0102 }
            afgs r8 = r2.e     // Catch:{ IOException -> 0x0102 }
            java.lang.Object r8 = r8.a()     // Catch:{ IOException -> 0x0102 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ IOException -> 0x0102 }
            int r8 = r8.intValue()     // Catch:{ IOException -> 0x0102 }
            if (r0 != r8) goto L_0x0110
            long r8 = r4.f()     // Catch:{ IOException -> 0x0102 }
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x012e
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0102 }
            long r10 = r4.f()     // Catch:{ IOException -> 0x0102 }
            long r8 = r8 - r10
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ IOException -> 0x0102 }
            long r10 = (long) r5     // Catch:{ IOException -> 0x0102 }
            long r5 = r0.toMillis(r10)     // Catch:{ IOException -> 0x0102 }
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x012e
            goto L_0x0096
        L_0x0102:
            r0 = move-exception
            awdn r8 = r2.f     // Catch:{ afdy -> 0x0149 }
            java.lang.Object r8 = r8.a()     // Catch:{ afdy -> 0x0149 }
            pdg r8 = (defpackage.pdg) r8     // Catch:{ afdy -> 0x0149 }
            java.lang.String r9 = "Failed to retrieve boot count"
            r8.a(r9, r0)     // Catch:{ afdy -> 0x0149 }
        L_0x0110:
            long r8 = r4.h()     // Catch:{ afdy -> 0x0149 }
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x012e
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ afdy -> 0x0149 }
            long r8 = r4.h()     // Catch:{ afdy -> 0x0149 }
            long r6 = r6 - r8
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ afdy -> 0x0149 }
            long r8 = (long) r5     // Catch:{ afdy -> 0x0149 }
            long r8 = r0.toMillis(r8)     // Catch:{ afdy -> 0x0149 }
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x012e
            goto L_0x0096
        L_0x012e:
            afeb r0 = r2.c     // Catch:{ afdy -> 0x0149 }
            java.lang.String r5 = r4.a()     // Catch:{ afdy -> 0x0149 }
            android.accounts.Account r6 = r4.b()     // Catch:{ afdy -> 0x0149 }
            aukh r4 = r4.c()     // Catch:{ afdy -> 0x0149 }
            afdz r7 = defpackage.afdz.SUBSCRIPTION_CLEANUP     // Catch:{ afdy -> 0x0149 }
            r0.a(r5, r6, r4, r7)     // Catch:{ afdy -> 0x0149 }
            goto L_0x0096
        L_0x0143:
            r0 = 0
            aorr r0 = defpackage.aorl.a((java.lang.Object) r0)
            return r0
        L_0x0149:
            r0 = move-exception
            awdn r1 = r2.a
            java.lang.Object r1 = r1.a()
            pia r1 = (defpackage.pia) r1
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "Failed to delete subscription."
            r1.e(r3, r0, r2)
            goto L_0x015c
        L_0x015b:
            throw r0
        L_0x015c:
            goto L_0x015b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afej.a(java.lang.Object):aorr");
    }
}
