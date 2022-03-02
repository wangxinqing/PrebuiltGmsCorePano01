package defpackage;

/* renamed from: aeqi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeqi implements awdt {
    private final bapu a;

    public aeqi(bapu bapu) {
        this.a = bapu;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0129 A[SYNTHETIC, Splitter:B:38:0x0129] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012e A[Catch:{ IOException -> 0x0137 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0157  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.aorr a(defpackage.aeqd r20) {
        /*
            r1 = r20
            auke r0 = r1.h
            if (r0 != 0) goto L_0x01c9
            afgp r0 = r1.d
            aorr r2 = r0.d
            if (r2 != 0) goto L_0x0161
            r3 = 0
            aeqn r4 = r1.c     // Catch:{ IOException -> 0x0137 }
            java.lang.String[] r5 = r4.a()     // Catch:{ IOException -> 0x0137 }
            if (r5 == 0) goto L_0x0123
            int r0 = r5.length     // Catch:{ IOException -> 0x0137 }
            int r0 = r0 + -1
            r7 = r0
            r8 = 0
        L_0x001a:
            if (r7 < 0) goto L_0x0124
            r0 = r5[r7]     // Catch:{ IOException -> 0x011a }
            java.io.File r9 = new java.io.File     // Catch:{ IOException -> 0x011a }
            java.io.File r10 = r4.b     // Catch:{ IOException -> 0x011a }
            r9.<init>(r10, r0)     // Catch:{ IOException -> 0x011a }
            byte[] r0 = defpackage.anne.b(r9)     // Catch:{ IOException -> 0x011a }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ IOException -> 0x011a }
            afgk r9 = defpackage.aeqn.f     // Catch:{ IOException -> 0x011a }
            int r10 = r0.remaining()     // Catch:{ IOException -> 0x011a }
            r11 = 12
            r12 = 2
            java.lang.String r13 = "ChecksumStorageUtils"
            if (r10 < r11) goto L_0x00f6
            int r10 = r0.getInt()     // Catch:{ IOException -> 0x011a }
            int r11 = r0.position()     // Catch:{ IOException -> 0x011a }
            int r15 = r11 + r10
            int r6 = r10 + 8
            int r14 = r0.remaining()     // Catch:{ IOException -> 0x011a }
            if (r6 > r14) goto L_0x00cb
            if (r10 < 0) goto L_0x00b1
            long r16 = r0.getLong(r15)     // Catch:{ IOException -> 0x011a }
            byte[] r6 = r0.array()     // Catch:{ IOException -> 0x011a }
            int r14 = r0.arrayOffset()     // Catch:{ IOException -> 0x011a }
            int r14 = r14 + r11
            java.util.zip.CRC32 r11 = new java.util.zip.CRC32     // Catch:{ IOException -> 0x011a }
            r11.<init>()     // Catch:{ IOException -> 0x011a }
            r11.update(r6, r14, r10)     // Catch:{ IOException -> 0x011a }
            long r18 = r11.getValue()     // Catch:{ IOException -> 0x011a }
            int r6 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r6 != 0) goto L_0x0091
            java.nio.ByteBuffer r6 = r0.slice()     // Catch:{ IOException -> 0x011a }
            r6.limit(r10)     // Catch:{ IOException -> 0x011a }
            int r15 = r15 + 8
            r0.position(r15)     // Catch:{ IOException -> 0x011a }
            aubc r0 = defpackage.aubc.a((java.nio.ByteBuffer) r6)     // Catch:{ IOException -> 0x011a }
            audx r6 = r9.a     // Catch:{ IOException -> 0x011a }
            aucj r6 = (defpackage.aucj) r6     // Catch:{ IOException -> 0x011a }
            r9 = 7
            java.lang.Object r6 = r6.c(r9)     // Catch:{ IOException -> 0x011a }
            auef r6 = (defpackage.auef) r6     // Catch:{ IOException -> 0x011a }
            java.lang.Object r0 = r6.a((defpackage.aubc) r0)     // Catch:{ IOException -> 0x011a }
            audx r0 = (defpackage.audx) r0     // Catch:{ IOException -> 0x011a }
            auke r0 = (defpackage.auke) r0     // Catch:{ IOException -> 0x011a }
            r6 = r0
            goto L_0x0127
        L_0x0091:
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ IOException -> 0x011a }
            java.lang.Long r6 = java.lang.Long.valueOf(r16)     // Catch:{ IOException -> 0x011a }
            r0[r3] = r6     // Catch:{ IOException -> 0x011a }
            java.lang.Long r6 = java.lang.Long.valueOf(r18)     // Catch:{ IOException -> 0x011a }
            r9 = 1
            r0[r9] = r6     // Catch:{ IOException -> 0x011a }
            java.lang.String r6 = "Corrupt data, expected CRC: %d computed CRC: %d"
            java.lang.String r0 = java.lang.String.format(r6, r0)     // Catch:{ IOException -> 0x011a }
            android.util.Log.e(r13, r0)     // Catch:{ IOException -> 0x011a }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x011a }
            java.lang.String r6 = "Bad CRC (see logs)."
            r0.<init>(r6)     // Catch:{ IOException -> 0x011a }
            throw r0     // Catch:{ IOException -> 0x011a }
        L_0x00b1:
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IOException -> 0x011a }
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x011a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)     // Catch:{ IOException -> 0x011a }
            r6[r3] = r9     // Catch:{ IOException -> 0x011a }
            java.lang.String r9 = "Got negative payload size (%d) from input - probably corrupt."
            java.lang.String r0 = java.lang.String.format(r0, r9, r6)     // Catch:{ IOException -> 0x011a }
            android.util.Log.e(r13, r0)     // Catch:{ IOException -> 0x011a }
            java.io.IOException r6 = new java.io.IOException     // Catch:{ IOException -> 0x011a }
            r6.<init>(r0)     // Catch:{ IOException -> 0x011a }
            throw r6     // Catch:{ IOException -> 0x011a }
        L_0x00cb:
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ IOException -> 0x011a }
            r11 = 3
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ IOException -> 0x011a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x011a }
            r11[r3] = r6     // Catch:{ IOException -> 0x011a }
            int r0 = r0.remaining()     // Catch:{ IOException -> 0x011a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x011a }
            r6 = 1
            r11[r6] = r0     // Catch:{ IOException -> 0x011a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ IOException -> 0x011a }
            r11[r12] = r0     // Catch:{ IOException -> 0x011a }
            java.lang.String r0 = "Buffer underflow (need %d, have %d). Probably corrupt input giving us wrong length %d"
            java.lang.String r0 = java.lang.String.format(r9, r0, r11)     // Catch:{ IOException -> 0x011a }
            android.util.Log.e(r13, r0)     // Catch:{ IOException -> 0x011a }
            java.io.IOException r6 = new java.io.IOException     // Catch:{ IOException -> 0x011a }
            r6.<init>(r0)     // Catch:{ IOException -> 0x011a }
            throw r6     // Catch:{ IOException -> 0x011a }
        L_0x00f6:
            java.util.Locale r6 = java.util.Locale.US     // Catch:{ IOException -> 0x011a }
            java.lang.Object[] r9 = new java.lang.Object[r12]     // Catch:{ IOException -> 0x011a }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException -> 0x011a }
            r9[r3] = r10     // Catch:{ IOException -> 0x011a }
            int r0 = r0.remaining()     // Catch:{ IOException -> 0x011a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x011a }
            r10 = 1
            r9[r10] = r0     // Catch:{ IOException -> 0x011a }
            java.lang.String r0 = "Buffer underflow (metadata needs at least %d bytes, have %d)"
            java.lang.String r0 = java.lang.String.format(r6, r0, r9)     // Catch:{ IOException -> 0x011a }
            android.util.Log.e(r13, r0)     // Catch:{ IOException -> 0x011a }
            java.io.IOException r6 = new java.io.IOException     // Catch:{ IOException -> 0x011a }
            r6.<init>(r0)     // Catch:{ IOException -> 0x011a }
            throw r6     // Catch:{ IOException -> 0x011a }
        L_0x011a:
            r0 = move-exception
            if (r8 == 0) goto L_0x011e
            goto L_0x011f
        L_0x011e:
            r8 = r0
        L_0x011f:
            int r7 = r7 + -1
            goto L_0x001a
        L_0x0123:
            r8 = 0
        L_0x0124:
            if (r8 != 0) goto L_0x012f
            r6 = 0
        L_0x0127:
            if (r6 == 0) goto L_0x012e
            aorr r2 = defpackage.aorl.a((java.lang.Object) r6)     // Catch:{ IOException -> 0x0137 }
            goto L_0x0154
        L_0x012e:
            goto L_0x0154
        L_0x012f:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0137 }
            java.lang.String r4 = "Failure to read any locally stored ChannelConfigList. Cause contains first failure."
            r0.<init>(r4, r8)     // Catch:{ IOException -> 0x0137 }
            throw r0     // Catch:{ IOException -> 0x0137 }
        L_0x0137:
            r0 = move-exception
            awdn r4 = r1.b
            java.lang.Object r4 = r4.a()
            pia r4 = (defpackage.pia) r4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r5 = "Failed to read stored config"
            r4.e(r5, r3)
            awdn r3 = r1.f
            java.lang.Object r3 = r3.a()
            pdg r3 = (defpackage.pdg) r3
            java.lang.String r4 = "MDH channel config read failure"
            r3.a(r4, r0)
        L_0x0154:
            if (r2 == 0) goto L_0x0157
            goto L_0x015c
        L_0x0157:
            aorr r0 = r20.a()
            r2 = r0
        L_0x015c:
            afgp r0 = r1.d
            r0.a((defpackage.aorr) r2)
        L_0x0161:
            boolean r0 = r2.isDone()
            if (r0 == 0) goto L_0x01c8
            defpackage.aorl.a((java.util.concurrent.Future) r2)     // Catch:{ ExecutionException -> 0x016b }
            goto L_0x018a
        L_0x016b:
            r0 = move-exception
            afbt r3 = r1.e
            r4 = 0
            axrv r0 = defpackage.axrv.a
            axrw r0 = r0.a()
            long r5 = r0.c()
            axrv r0 = defpackage.axrv.a
            axrw r0 = r0.a()
            long r7 = r0.b()
            r9 = 1
            r10 = 0
            r11 = 0
            r12 = 0
            r3.a(r4, r5, r7, r9, r10, r11, r12)
        L_0x018a:
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r1.i
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c8
            afbt r3 = r1.e
            r4 = 0
            axrv r0 = defpackage.axrv.a
            axrw r0 = r0.a()
            long r5 = r0.e()
            axrv r0 = defpackage.axrv.a
            axrw r0 = r0.a()
            long r7 = r0.d()
            r9 = 1
            r10 = 1
            r11 = 1
            r12 = 0
            r3.a(r4, r5, r7, r9, r10, r11, r12)
            long r3 = android.os.SystemClock.elapsedRealtime()
            axrv r0 = defpackage.axrv.a
            axrw r0 = r0.a()
            long r5 = r0.g()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            long r3 = r3 + r5
            r1.i = r3
            goto L_0x01cd
        L_0x01c8:
            goto L_0x01cd
        L_0x01c9:
            aorr r2 = defpackage.aorl.a((java.lang.Object) r0)
        L_0x01cd:
            java.lang.String r0 = "Cannot return null from a non-@Nullable @Provides method"
            defpackage.awdx.a((java.lang.Object) r2, (java.lang.String) r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeqi.a(aeqd):aorr");
    }

    /* renamed from: b */
    public final aorr a() {
        return a((aeqd) this.a.a());
    }
}
