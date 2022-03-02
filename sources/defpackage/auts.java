package defpackage;

/* renamed from: auts  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auts {
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ad A[Catch:{ auda -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ae A[Catch:{ auda -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00b4 A[Catch:{ auda -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00b5 A[Catch:{ auda -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.autz a(defpackage.auud r8, java.security.Key r9, defpackage.auto r10, java.security.Key r11, defpackage.autn r12) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x019d
            if (r10 == 0) goto L_0x019d
            if (r12 == 0) goto L_0x019d
            autn r1 = defpackage.autn.NONE
            if (r12 == r1) goto L_0x0195
            boolean r1 = defpackage.autr.a(r9, r10, r11)
            int r2 = r8.a
            r3 = r2 & 1
            java.lang.String r4 = "Signature failed verification"
            if (r3 == 0) goto L_0x018f
            r2 = r2 & 2
            if (r2 == 0) goto L_0x018f
            auay r2 = r8.c
            byte[] r2 = r2.k()
            auay r3 = r8.b
            byte[] r3 = r3.k()
            if (r1 != 0) goto L_0x002d
            byte[] r3 = defpackage.autp.b(r3, r0)
        L_0x002d:
            boolean r9 = defpackage.autp.a((java.security.Key) r9, (defpackage.auto) r10, (byte[]) r2, (byte[]) r3)
            r2 = 0
            auay r3 = r8.b     // Catch:{ auda -> 0x00c0 }
            autz r5 = defpackage.autz.d     // Catch:{ auda -> 0x00c0 }
            aucj r3 = defpackage.aucj.a((defpackage.aucj) r5, (defpackage.auay) r3)     // Catch:{ auda -> 0x00c0 }
            autz r3 = (defpackage.autz) r3     // Catch:{ auda -> 0x00c0 }
            int r5 = r3.a     // Catch:{ auda -> 0x00be }
            r6 = r5 & 1
            if (r6 == 0) goto L_0x00b8
            r5 = r5 & 2
            if (r5 == 0) goto L_0x00b8
            auty r5 = r3.b     // Catch:{ auda -> 0x00be }
            if (r5 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            auty r5 = defpackage.auty.h     // Catch:{ auda -> 0x00be }
        L_0x004d:
            int r5 = r5.b     // Catch:{ auda -> 0x00be }
            int r5 = defpackage.auuf.a(r5)     // Catch:{ auda -> 0x00be }
            r6 = 1
            if (r5 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r5 = 1
        L_0x0058:
            int r7 = r10.f     // Catch:{ auda -> 0x00be }
            if (r5 != r7) goto L_0x005e
            r5 = 1
            goto L_0x005f
        L_0x005e:
            r5 = 0
        L_0x005f:
            r9 = r9 & r5
            auty r5 = r3.b     // Catch:{ auda -> 0x00be }
            if (r5 == 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            auty r5 = defpackage.auty.h     // Catch:{ auda -> 0x00be }
        L_0x0067:
            int r5 = r5.c     // Catch:{ auda -> 0x00be }
            int r5 = defpackage.autw.a(r5)     // Catch:{ auda -> 0x00be }
            if (r5 == 0) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            r5 = 1
        L_0x0071:
            int r7 = r12.d     // Catch:{ auda -> 0x00be }
            if (r5 != r7) goto L_0x0077
            r5 = 1
            goto L_0x0078
        L_0x0077:
            r5 = 0
        L_0x0078:
            r9 = r9 & r5
            autn r5 = defpackage.autn.NONE     // Catch:{ auda -> 0x00be }
            if (r12 != r5) goto L_0x008e
            auty r5 = r3.b     // Catch:{ auda -> 0x00be }
            if (r5 == 0) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            auty r5 = defpackage.auty.h     // Catch:{ auda -> 0x00be }
        L_0x0084:
            int r5 = r5.a     // Catch:{ auda -> 0x00be }
            r5 = r5 & 8
            if (r5 != 0) goto L_0x008c
            r5 = 1
            goto L_0x008f
        L_0x008c:
            r5 = 0
            goto L_0x008f
        L_0x008e:
            r5 = 1
        L_0x008f:
            r9 = r9 & r5
            autn r5 = defpackage.autn.NONE     // Catch:{ auda -> 0x00be }
            if (r12 == r5) goto L_0x00a7
            boolean r10 = r10.e     // Catch:{ auda -> 0x00be }
            if (r10 == 0) goto L_0x00a7
            auty r10 = r3.b     // Catch:{ auda -> 0x00be }
            if (r10 == 0) goto L_0x009d
            goto L_0x009f
        L_0x009d:
            auty r10 = defpackage.auty.h     // Catch:{ auda -> 0x00be }
        L_0x009f:
            int r10 = r10.a     // Catch:{ auda -> 0x00be }
            r10 = r10 & 4
            if (r10 != 0) goto L_0x00a7
            r10 = 0
            goto L_0x00a8
        L_0x00a7:
            r10 = 1
        L_0x00a8:
            r9 = r9 & r10
            auty r10 = r3.b     // Catch:{ auda -> 0x00be }
            if (r10 == 0) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            auty r10 = defpackage.auty.h     // Catch:{ auda -> 0x00be }
        L_0x00b0:
            int r10 = r10.g     // Catch:{ auda -> 0x00be }
            if (r10 != 0) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            r6 = 0
        L_0x00b6:
            r9 = r9 & r6
            goto L_0x00c3
        L_0x00b8:
            java.security.SignatureException r9 = new java.security.SignatureException     // Catch:{ auda -> 0x00be }
            r9.<init>(r4)     // Catch:{ auda -> 0x00be }
            throw r9     // Catch:{ auda -> 0x00be }
        L_0x00be:
            r9 = move-exception
            goto L_0x00c2
        L_0x00c0:
            r9 = move-exception
            r3 = r0
        L_0x00c2:
            r9 = 0
        L_0x00c3:
            if (r9 == 0) goto L_0x0189
            auty r9 = r3.b
            if (r9 == 0) goto L_0x00ca
            goto L_0x00cc
        L_0x00ca:
            auty r9 = defpackage.auty.h
        L_0x00cc:
            int r10 = r9.a
            r10 = r10 & 16
            if (r10 == 0) goto L_0x0183
            auay r9 = r9.e     // Catch:{ InvalidAlgorithmParameterException -> 0x017c, IllegalBlockSizeException -> 0x0175, BadPaddingException -> 0x016e }
            byte[] r9 = r9.k()     // Catch:{ InvalidAlgorithmParameterException -> 0x017c, IllegalBlockSizeException -> 0x0175, BadPaddingException -> 0x016e }
            auay r10 = r3.c     // Catch:{ InvalidAlgorithmParameterException -> 0x017c, IllegalBlockSizeException -> 0x0175, BadPaddingException -> 0x016e }
            byte[] r10 = r10.k()     // Catch:{ InvalidAlgorithmParameterException -> 0x017c, IllegalBlockSizeException -> 0x0175, BadPaddingException -> 0x016e }
            byte[] r9 = defpackage.autp.a((java.security.Key) r11, (defpackage.autn) r12, (byte[]) r9, (byte[]) r10)     // Catch:{ InvalidAlgorithmParameterException -> 0x017c, IllegalBlockSizeException -> 0x0175, BadPaddingException -> 0x016e }
            if (r1 != 0) goto L_0x010e
            autz r8 = defpackage.autz.d
            aucd r8 = r8.a((defpackage.aucj) r3)
            auay r9 = defpackage.auay.a((byte[]) r9)
            boolean r10 = r8.c
            if (r10 != 0) goto L_0x00f3
            goto L_0x00f8
        L_0x00f3:
            r8.c()
            r8.c = r2
        L_0x00f8:
            aucj r10 = r8.b
            autz r10 = (defpackage.autz) r10
            r9.getClass()
            int r11 = r10.a
            r11 = r11 | 2
            r10.a = r11
            r10.c = r9
            aucj r8 = r8.i()
            autz r8 = (defpackage.autz) r8
            return r8
        L_0x010e:
            auay r8 = r8.b     // Catch:{ auda -> 0x0167 }
            auua r10 = defpackage.auua.d     // Catch:{ auda -> 0x0167 }
            aucj r8 = defpackage.aucj.a((defpackage.aucj) r10, (defpackage.auay) r8)     // Catch:{ auda -> 0x0167 }
            auua r8 = (defpackage.auua) r8     // Catch:{ auda -> 0x0167 }
            auay r8 = r8.b     // Catch:{ auda -> 0x0167 }
            byte[] r8 = r8.k()     // Catch:{ auda -> 0x0167 }
            byte[] r8 = defpackage.autp.b(r8, r0)
            byte[] r8 = defpackage.autp.a((byte[]) r8)
            int r10 = r9.length
            r11 = 20
            if (r10 < r11) goto L_0x0161
            byte[] r12 = defpackage.autp.a((byte[]) r9, (int) r11)
            boolean r8 = defpackage.autp.a((byte[]) r12, (byte[]) r8)
            if (r8 == 0) goto L_0x0161
            autz r8 = defpackage.autz.d
            aucd r8 = r8.a((defpackage.aucj) r3)
            int r10 = r10 + -20
            auay r9 = defpackage.auay.a((byte[]) r9, (int) r11, (int) r10)
            boolean r10 = r8.c
            if (r10 != 0) goto L_0x0146
            goto L_0x014b
        L_0x0146:
            r8.c()
            r8.c = r2
        L_0x014b:
            aucj r10 = r8.b
            autz r10 = (defpackage.autz) r10
            r9.getClass()
            int r11 = r10.a
            r11 = r11 | 2
            r10.a = r11
            r10.c = r9
            aucj r8 = r8.i()
            autz r8 = (defpackage.autz) r8
            return r8
        L_0x0161:
            java.security.SignatureException r8 = new java.security.SignatureException
            r8.<init>()
            throw r8
        L_0x0167:
            r8 = move-exception
            java.security.SignatureException r9 = new java.security.SignatureException
            r9.<init>(r8)
            throw r9
        L_0x016e:
            r8 = move-exception
            java.security.SignatureException r8 = new java.security.SignatureException
            r8.<init>()
            throw r8
        L_0x0175:
            r8 = move-exception
            java.security.SignatureException r8 = new java.security.SignatureException
            r8.<init>()
            throw r8
        L_0x017c:
            r8 = move-exception
            java.security.SignatureException r8 = new java.security.SignatureException
            r8.<init>()
            throw r8
        L_0x0183:
            java.security.SignatureException r8 = new java.security.SignatureException
            r8.<init>()
            throw r8
        L_0x0189:
            java.security.SignatureException r8 = new java.security.SignatureException
            r8.<init>(r4)
            throw r8
        L_0x018f:
            java.security.SignatureException r8 = new java.security.SignatureException
            r8.<init>(r4)
            throw r8
        L_0x0195:
            java.security.SignatureException r8 = new java.security.SignatureException
            java.lang.String r9 = "Not a signcrypted message"
            r8.<init>(r9)
            throw r8
        L_0x019d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auts.a(auud, java.security.Key, auto, java.security.Key, autn):autz");
    }
}
