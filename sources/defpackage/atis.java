package defpackage;

/* renamed from: atis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atis {
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9 A[LOOP:2: B:30:0x00a7->B:31:0x00a9, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.location.WifiScan a(defpackage.aibr r19) {
        /*
            r0 = r19
            boolean r1 = r19.a()
            r2 = 0
            if (r1 == 0) goto L_0x0103
            int r1 = r19.b()
            long r3 = r19.d()
            boolean r5 = r19.f()
            java.util.concurrent.atomic.AtomicReference r6 = defpackage.rff.a
            java.lang.Object r6 = r6.getAndSet(r2)
            rff r6 = (defpackage.rff) r6
            if (r6 == 0) goto L_0x0023
            r6.a((int) r1, (long) r3, (boolean) r5)
            goto L_0x0028
        L_0x0023:
            rff r6 = new rff
            r6.<init>(r1, r3, r5)
        L_0x0028:
            if (r5 == 0) goto L_0x00a6
            aibv[] r4 = r0.c
            if (r4 != 0) goto L_0x0031
            r3 = 0
            goto L_0x00a7
        L_0x0031:
            r5 = 0
        L_0x0032:
            if (r5 >= r1) goto L_0x00bb
            long r7 = r0.a((int) r5)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x003e:
            int r15 = r4.length
            if (r9 >= r15) goto L_0x0062
            if (r10 != 0) goto L_0x0062
            r15 = r4[r9]
            r17 = r4
            long r3 = r15.a
            int r18 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r18 != 0) goto L_0x005c
            int r10 = r15.h
            int r11 = r15.i
            int r3 = r15.e
            int r12 = r3 * 10
            int r3 = r15.f
            int r13 = r3 * 10
            int r14 = r15.j
            goto L_0x005d
        L_0x005c:
        L_0x005d:
            int r9 = r9 + 1
            r4 = r17
            goto L_0x003e
        L_0x0062:
            r17 = r4
            if (r10 == 0) goto L_0x0096
            byte r3 = r0.b(r5)
            int r4 = r0.c(r5)
            boolean r9 = r6.k
            if (r9 == 0) goto L_0x008e
            r6.a((long) r7, (byte) r3, (int) r4)
            int r3 = r6.j
            int r3 = r3 + -1
            int[] r4 = r6.e
            r4[r3] = r10
            int[] r4 = r6.f
            r4[r3] = r11
            int[] r4 = r6.g
            r4[r3] = r12
            int[] r4 = r6.h
            r4[r3] = r13
            int[] r4 = r6.i
            r4[r3] = r14
            goto L_0x00a1
        L_0x008e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot add RTT information"
            r0.<init>(r1)
            throw r0
        L_0x0096:
            byte r3 = r0.b(r5)
            int r4 = r0.c(r5)
            r6.a((long) r7, (byte) r3, (int) r4)
        L_0x00a1:
            int r5 = r5 + 1
            r4 = r17
            goto L_0x0032
        L_0x00a6:
            r3 = 0
        L_0x00a7:
            if (r3 >= r1) goto L_0x00bb
            long r4 = r0.a((int) r3)
            byte r7 = r0.b(r3)
            int r8 = r0.c(r3)
            r6.a((long) r4, (byte) r7, (int) r8)
            int r3 = r3 + 1
            goto L_0x00a7
        L_0x00bb:
            int r0 = r6.j
            long[] r10 = r6.c
            int r1 = r10.length
            if (r0 != r1) goto L_0x00e2
            com.google.android.gms.location.WifiScan r0 = new com.google.android.gms.location.WifiScan
            long r8 = r6.b
            int[] r11 = r6.d
            int[] r12 = r6.e
            int[] r13 = r6.f
            int[] r14 = r6.g
            int[] r15 = r6.h
            int[] r1 = r6.i
            r7 = r0
            r16 = r1
            r7.<init>(r8, r10, r11, r12, r13, r14, r15, r16)
            r6.c = r2
            r6.d = r2
            java.util.concurrent.atomic.AtomicReference r1 = defpackage.rff.a
            r1.set(r6)
            return r0
        L_0x00e2:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 73
            r3.<init>(r4)
            java.lang.String r4 = "Haven't filled devices yet, expected "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " but received "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x0103:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atis.a(aibr):com.google.android.gms.location.WifiScan");
    }
}
