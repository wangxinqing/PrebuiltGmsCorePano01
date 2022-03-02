package defpackage;

import java.io.IOException;
import java.util.Arrays;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: ajbu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajbu implements aizz {
    private final long a;
    private final byte[] b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.io.DataOutputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ajbu(long r6, java.io.File r8) {
        /*
            r5 = this;
            r5.<init>()
            r5.a = r6
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream
            r6.<init>()
            r7 = 32
            r0 = 0
            if (r8 == 0) goto L_0x003e
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ FileNotFoundException -> 0x0039, Exception -> 0x0036, all -> 0x0031 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0039, Exception -> 0x0036, all -> 0x0031 }
            r2.<init>(r8)     // Catch:{ FileNotFoundException -> 0x0039, Exception -> 0x0036, all -> 0x0031 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0039, Exception -> 0x0036, all -> 0x0031 }
            r1.readUnsignedShort()     // Catch:{ FileNotFoundException -> 0x002f, Exception -> 0x002d, all -> 0x002a }
            byte[] r2 = new byte[r7]     // Catch:{ FileNotFoundException -> 0x002f, Exception -> 0x002d, all -> 0x002a }
        L_0x001e:
            int r3 = r1.read(r2)     // Catch:{ FileNotFoundException -> 0x002f, Exception -> 0x002d, all -> 0x002a }
            if (r3 >= 0) goto L_0x0025
            goto L_0x003b
        L_0x0025:
            r4 = 0
            r6.write(r2, r4, r3)     // Catch:{ FileNotFoundException -> 0x002f, Exception -> 0x002d, all -> 0x002a }
            goto L_0x001e
        L_0x002a:
            r6 = move-exception
            r0 = r1
            goto L_0x0032
        L_0x002d:
            r2 = move-exception
            goto L_0x003b
        L_0x002f:
            r2 = move-exception
            goto L_0x003b
        L_0x0031:
            r6 = move-exception
        L_0x0032:
            defpackage.ajre.a((java.io.Closeable) r0)
            throw r6
        L_0x0036:
            r1 = move-exception
            r1 = r0
            goto L_0x003b
        L_0x0039:
            r1 = move-exception
            r1 = r0
        L_0x003b:
            defpackage.ajre.a((java.io.Closeable) r1)
        L_0x003e:
            byte[] r6 = r6.toByteArray()
            if (r6 != 0) goto L_0x0045
        L_0x0044:
            goto L_0x0049
        L_0x0045:
            int r1 = r6.length
            if (r1 != r7) goto L_0x0044
            goto L_0x0081
        L_0x0049:
            java.security.SecureRandom r6 = new java.security.SecureRandom
            r6.<init>()
            byte[] r7 = new byte[r7]
            r6.nextBytes(r7)
            if (r8 == 0) goto L_0x007f
            java.io.DataOutputStream r6 = new java.io.DataOutputStream     // Catch:{ FileNotFoundException -> 0x007a, IOException -> 0x0078, all -> 0x0072 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x007a, IOException -> 0x0078, all -> 0x0072 }
            r1.<init>(r8)     // Catch:{ FileNotFoundException -> 0x007a, IOException -> 0x0078, all -> 0x0072 }
            r6.<init>(r1)     // Catch:{ FileNotFoundException -> 0x007a, IOException -> 0x0078, all -> 0x0072 }
            r8 = 1
            r6.writeShort(r8)     // Catch:{ FileNotFoundException -> 0x006f, IOException -> 0x006d, all -> 0x006a }
            r6.write(r7)     // Catch:{ FileNotFoundException -> 0x006f, IOException -> 0x006d, all -> 0x006a }
            defpackage.ajre.a((java.io.Closeable) r6)
            goto L_0x0080
        L_0x006a:
            r7 = move-exception
            r0 = r6
            goto L_0x0074
        L_0x006d:
            r8 = move-exception
            goto L_0x0070
        L_0x006f:
            r8 = move-exception
        L_0x0070:
            r0 = r6
            goto L_0x007b
        L_0x0072:
            r6 = move-exception
            r7 = r6
        L_0x0074:
            defpackage.ajre.a((java.io.Closeable) r0)
            throw r7
        L_0x0078:
            r6 = move-exception
            goto L_0x007b
        L_0x007a:
            r6 = move-exception
        L_0x007b:
            defpackage.ajre.a((java.io.Closeable) r0)
            goto L_0x0080
        L_0x007f:
        L_0x0080:
            r6 = r7
        L_0x0081:
            r5.b = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajbu.<init>(long, java.io.File):void");
    }

    public final SecretKey a() {
        try {
            long j = this.a;
            if (j != 0) {
                byte b2 = (byte) ((int) (j >>> 56));
                byte b3 = (byte) ((int) ((j >>> 48) & 255));
                byte b4 = (byte) ((int) ((j >>> 40) & 255));
                byte b5 = (byte) ((int) ((j >>> 32) & 255));
                byte b6 = (byte) ((int) ((j >>> 24) & 255));
                byte b7 = (byte) ((int) ((j >>> 16) & 255));
                byte b8 = b7;
                byte b9 = (byte) ((int) ((j >>> 8) & 255));
                byte b10 = (byte) ((int) (j & 255));
                return new SecretKeySpec(new byte[]{b2, b3, b4, b5, b6, b7, b9, b10, b2, b3, b4, b5, b6, b8, b9, b10, b2, b3, b4, b5, b6, b8, b9, b10, b2, b3, b4, b5, b6, b8, b9, b10}, "AES");
            }
            throw new IOException("no android ID; can't access encrypted cache");
        } catch (IOException e) {
            return null;
        }
    }

    public final byte[] b() {
        byte[] bArr = this.b;
        return Arrays.copyOf(bArr, bArr.length);
    }
}
