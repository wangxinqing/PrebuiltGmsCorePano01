package defpackage;

/* renamed from: aauo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aauo implements Runnable {
    final /* synthetic */ aaur a;

    public aauo(aaur aaur) {
        this.a = aaur;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008c, code lost:
        if (r10 != false) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r0 = r18
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            aauz r3 = new aauz
            r3.<init>()
            aavb r4 = new aavb
            aaur r5 = r0.a
            aauv r5 = r5.m
            r4.<init>(r5)
            aaus r5 = new aaus
            aaur r6 = r0.a
            aauv r6 = r6.m
            r5.<init>(r6)
            r5.a(r3)
            aaur r6 = r0.a
            aawl r6 = r6.n
            java.util.Set r6 = r6.a()
            java.util.Iterator r6 = r6.iterator()
        L_0x0032:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0099
            java.lang.Object r7 = r6.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            aaun r8 = new aaun
            aaur r9 = r0.a
            android.content.Context r10 = r9.f
            aauv r9 = r9.m
            r8.<init>(r10, r7, r9)
            java.util.List r12 = r8.c()
            if (r12 == 0) goto L_0x0095
            boolean r9 = r12.isEmpty()
            if (r9 != 0) goto L_0x0095
            aauw r9 = new aauw
            r9.<init>(r7)
            aava r10 = r4.a(r7)
            if (r10 == 0) goto L_0x0095
            anax r11 = defpackage.aaur.b
            java.lang.Integer r15 = java.lang.Integer.valueOf(r7)
            boolean r11 = r11.contains(r15)
            if (r11 != 0) goto L_0x008e
            r13 = 0
            byte[] r14 = r10.a
            byte[] r10 = r10.b
            r16 = 1
            r11 = r9
            r17 = r15
            r15 = r10
            boolean r10 = r11.a(r12, r13, r14, r15, r16)
            anax r11 = defpackage.aaur.a
            r12 = r17
            boolean r11 = r11.contains(r12)
            if (r11 == 0) goto L_0x008c
            r9.b()
        L_0x008c:
            if (r10 == 0) goto L_0x0095
        L_0x008e:
            r1.put(r7, r9)
            r2.put(r7, r8)
            goto L_0x0032
        L_0x0095:
            r8.a()
            goto L_0x0032
        L_0x0099:
            aaur r6 = r0.a
            r6.g = r4
            r6.i = r3
            r6.h = r5
            r6.j = r1
            r6.k = r2
            aarq r1 = new aarq
            android.content.Context r2 = r6.f
            r1.<init>(r2)
            aaur r2 = r0.a
            android.content.SharedPreferences r3 = r1.a
            r4 = 0
            java.lang.String r6 = "snet_safe_browsing_last_cache_write_ms"
            long r3 = r3.getLong(r6, r4)
            r2.p = r3
            aaur r2 = r0.a
            long r3 = r1.c()
            long r5 = r1.b()
            long r7 = defpackage.aaur.c
            long r5 = r5 + r7
            long r3 = java.lang.Math.max(r3, r5)
            r2.q = r3
            java.util.concurrent.CountDownLatch r1 = defpackage.aaum.d
            if (r1 == 0) goto L_0x00d6
            java.util.concurrent.CountDownLatch r1 = defpackage.aaum.d
            r1.countDown()
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aauo.run():void");
    }
}
