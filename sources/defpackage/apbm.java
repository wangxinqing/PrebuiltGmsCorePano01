package defpackage;

import java.security.interfaces.ECPrivateKey;

/* renamed from: apbm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apbm implements aouu {
    private final ECPrivateKey a;
    private final String b;
    private final int c;

    public apbm(ECPrivateKey eCPrivateKey, int i, int i2) {
        this.a = eCPrivateKey;
        this.b = apdb.a(i);
        this.c = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        r5 = r14[r8 + 2] & 255;
        r9 = r8 + 3;
        r10 = r9 + r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] a(byte[] r14) {
        /*
            r13 = this;
            apcf r0 = defpackage.apcf.c
            java.lang.String r1 = r13.b
            java.lang.Object r0 = r0.a(r1)
            java.security.Signature r0 = (java.security.Signature) r0
            java.security.interfaces.ECPrivateKey r1 = r13.a
            r0.initSign(r1)
            r0.update(r14)
            byte[] r14 = r0.sign()
            int r0 = r13.c
            r1 = 1
            if (r0 != r1) goto L_0x00dd
            java.security.interfaces.ECPrivateKey r0 = r13.a
            java.security.spec.ECParameterSpec r0 = r0.getParams()
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            int r0 = defpackage.apcd.b((java.security.spec.EllipticCurve) r0)
            int r0 = r0 + r0
            int r2 = r14.length
            r3 = 8
            if (r2 < r3) goto L_0x00d5
            r3 = 0
            byte r4 = r14[r3]
            r5 = 48
            if (r4 != r5) goto L_0x00d5
            byte r4 = r14[r1]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 129(0x81, float:1.81E-43)
            r6 = 128(0x80, float:1.794E-43)
            r7 = 2
            if (r4 != r5) goto L_0x0049
            byte r5 = r14[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            if (r5 < r6) goto L_0x00d5
            r8 = 2
            goto L_0x004f
        L_0x0049:
            if (r4 == r6) goto L_0x00d5
            if (r4 > r5) goto L_0x00d5
            r5 = r4
            r8 = 1
        L_0x004f:
            int r9 = r2 + -1
            int r9 = r9 - r8
            if (r5 != r9) goto L_0x00d5
            int r5 = r8 + 1
            byte r5 = r14[r5]
            if (r5 != r7) goto L_0x00d5
            int r5 = r8 + 2
            byte r5 = r14[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r9 = r8 + 3
            int r10 = r9 + r5
            int r11 = r10 + 1
            if (r11 >= r2) goto L_0x00d5
            if (r5 == 0) goto L_0x00d5
            byte r9 = r14[r9]
            r12 = r9 & 255(0xff, float:3.57E-43)
            if (r12 >= r6) goto L_0x00d5
            if (r5 > r1) goto L_0x0073
            goto L_0x007d
        L_0x0073:
            if (r9 != 0) goto L_0x007d
            int r9 = r8 + 4
            byte r9 = r14[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            if (r9 < r6) goto L_0x00d5
        L_0x007d:
            byte r9 = r14[r10]
            if (r9 != r7) goto L_0x00d5
            byte r9 = r14[r11]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r10 = r10 + r7
            int r10 = r10 + r9
            if (r10 != r2) goto L_0x00d5
            if (r9 == 0) goto L_0x00d5
            int r2 = r8 + 5
            int r2 = r2 + r5
            byte r2 = r14[r2]
            r10 = r2 & 255(0xff, float:3.57E-43)
            if (r10 >= r6) goto L_0x00d5
            if (r9 > r1) goto L_0x0098
            goto L_0x00a3
        L_0x0098:
            if (r2 != 0) goto L_0x00a3
            int r8 = r8 + 6
            int r8 = r8 + r5
            byte r2 = r14[r8]
            r2 = r2 & 255(0xff, float:3.57E-43)
            if (r2 < r6) goto L_0x00d5
        L_0x00a3:
            byte[] r2 = new byte[r0]
            if (r4 < r6) goto L_0x00a9
            r7 = 3
            goto L_0x00aa
        L_0x00a9:
        L_0x00aa:
            int r7 = r7 + r1
            int r4 = r7 + 1
            byte r5 = r14[r7]
            byte r6 = r14[r4]
            if (r6 != 0) goto L_0x00b5
            r6 = 1
            goto L_0x00b6
        L_0x00b5:
            r6 = 0
        L_0x00b6:
            int r7 = r4 + r6
            int r8 = r0 / 2
            int r8 = r8 - r5
            int r8 = r8 + r6
            int r6 = r5 - r6
            java.lang.System.arraycopy(r14, r7, r2, r8, r6)
            int r5 = r5 + r1
            int r4 = r4 + r5
            int r5 = r4 + 1
            byte r4 = r14[r4]
            byte r6 = r14[r5]
            if (r6 != 0) goto L_0x00cc
            goto L_0x00cd
        L_0x00cc:
            r1 = 0
        L_0x00cd:
            int r5 = r5 + r1
            int r0 = r0 - r4
            int r0 = r0 + r1
            int r4 = r4 - r1
            java.lang.System.arraycopy(r14, r5, r2, r0, r4)
            return r2
        L_0x00d5:
            java.security.GeneralSecurityException r14 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Invalid DER encoding"
            r14.<init>(r0)
            throw r14
        L_0x00dd:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apbm.a(byte[]):byte[]");
    }
}
