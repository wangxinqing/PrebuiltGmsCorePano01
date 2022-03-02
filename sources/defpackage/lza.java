package defpackage;

/* renamed from: lza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lza {
    public static final int[] a = {114, 80, 15, 96, 114, 20, 15, 103, 99, 100, 84, 36, 57, 101, 91, 69, 6, 73, 117, 72, 44, 103, 18, 84, 2, 90, 57, 36, 116, 36, 109, 100, 100, 93, 15, 107, 105, 53, 57, 95, 56, 95, 111, 72, 53, 92, 57, 36, 44};
    public static final int[] b = {116, 50, 27, 45, 48, 86};
    public static final int[] c = {30, 72, 53, 57, 94, 101, 99, 36, 97, 44};
    public static final int[] d = {53, 57, 101, 44, 91, 93, 88, 88, 93, 28, 76, 94, 36, 44, 15, 107, 111, 76, 69, 57};
    static final byte[] e = {-14, 118, 2, 40, -123, 1, -2, -29, 65, -126, -79, -95, 103, 11, -16, 74};
    static final byte[] f = {-107, 23, 42, 52, 9, 57, 24, 63, -40, -59, -13, -8, 79, 77, -82, 22};
    private static final int[] h = {91, 90, 80, 15, 20, 15, 84, 36, 113, 57, 69, 109, 110, 94, 6, 73, 72, 44, 109, 18, 93, 84, 50, 57, 69, 6, 94, 114, 89, 73, 57, 9, 88, 94, 98, 102, 15, 76, 30, 62, 114, 98, 41};
    private static final int[] i = {76, 93, 57, 58, 110, 44, 43, 18, 44, 57, 36};
    final lzc g;

    public lza(lzc lzc) {
        this.g = lzc;
    }

    public static final byte[] a(byte[]... bArr) {
        int i2 = 0;
        for (byte[] length : bArr) {
            i2 += length.length;
        }
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i3, length2);
            i3 += length2;
        }
        return bArr2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] a(int r8) {
        /*
            r7 = this;
            lzc r0 = r7.g     // Catch:{ Exception -> 0x002e }
            int[] r1 = h     // Catch:{ Exception -> 0x002e }
            java.lang.String r0 = r0.a(r1)     // Catch:{ Exception -> 0x002e }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x002e }
            java.lang.Object r1 = r0.newInstance()     // Catch:{ Exception -> 0x002e }
            lzc r2 = r7.g     // Catch:{ Exception -> 0x002e }
            int[] r3 = i     // Catch:{ Exception -> 0x002e }
            java.lang.String r2 = r2.a(r3)     // Catch:{ Exception -> 0x002e }
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x002e }
            java.lang.Class<byte[]> r5 = byte[].class
            r6 = 0
            r4[r6] = r5     // Catch:{ Exception -> 0x002e }
            java.lang.reflect.Method r0 = r0.getMethod(r2, r4)     // Catch:{ Exception -> 0x002e }
            byte[] r8 = new byte[r8]     // Catch:{ Exception -> 0x002e }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x002e }
            r2[r6] = r8     // Catch:{ Exception -> 0x002e }
            r0.invoke(r1, r2)     // Catch:{ Exception -> 0x002e }
            return r8
        L_0x002e:
            r8 = move-exception
            lzb r0 = new lzb
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lza.a(int):byte[]");
    }
}
