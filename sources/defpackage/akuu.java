package defpackage;

import java.io.Closeable;
import java.io.File;

/* renamed from: akuu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akuu {
    public final byte[] a;
    private final File b;
    private final int c = 1;
    private final int d = 32;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.io.DataOutputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public akuu(java.io.File r7) {
        /*
            r6 = this;
            r6.<init>()
            r6.b = r7
            r7 = 1
            r6.c = r7
            r7 = 32
            r6.d = r7
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.File r1 = r6.b
            r2 = 0
            if (r1 == 0) goto L_0x0047
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x003f, all -> 0x003a }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x003f, all -> 0x003a }
            r4.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x003f, all -> 0x003a }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x003f, all -> 0x003a }
            r3.readUnsignedShort()     // Catch:{ FileNotFoundException -> 0x0038, IOException -> 0x0036, all -> 0x0033 }
            int r1 = r6.d     // Catch:{ FileNotFoundException -> 0x0038, IOException -> 0x0036, all -> 0x0033 }
            byte[] r1 = new byte[r1]     // Catch:{ FileNotFoundException -> 0x0038, IOException -> 0x0036, all -> 0x0033 }
        L_0x0027:
            int r4 = r3.read(r1)     // Catch:{ FileNotFoundException -> 0x0038, IOException -> 0x0036, all -> 0x0033 }
            if (r4 >= 0) goto L_0x002e
            goto L_0x0044
        L_0x002e:
            r5 = 0
            r0.write(r1, r5, r4)     // Catch:{ FileNotFoundException -> 0x0038, IOException -> 0x0036, all -> 0x0033 }
            goto L_0x0027
        L_0x0033:
            r7 = move-exception
            r2 = r3
            goto L_0x003b
        L_0x0036:
            r1 = move-exception
            goto L_0x0044
        L_0x0038:
            r1 = move-exception
            goto L_0x0044
        L_0x003a:
            r7 = move-exception
        L_0x003b:
            a(r2)
            throw r7
        L_0x003f:
            r1 = move-exception
            r3 = r2
            goto L_0x0044
        L_0x0042:
            r1 = move-exception
            r3 = r2
        L_0x0044:
            a(r3)
        L_0x0047:
            byte[] r0 = r0.toByteArray()
            if (r0 != 0) goto L_0x004e
            goto L_0x0051
        L_0x004e:
            int r1 = r0.length
            if (r1 == r7) goto L_0x008b
        L_0x0051:
            java.security.SecureRandom r7 = new java.security.SecureRandom
            r7.<init>()
            int r0 = r6.d
            byte[] r0 = new byte[r0]
            r7.nextBytes(r0)
            java.io.File r7 = r6.b
            if (r7 == 0) goto L_0x008b
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x0084, all -> 0x007f }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x0084, all -> 0x007f }
            r3.<init>(r7)     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x0084, all -> 0x007f }
            r1.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x0084, all -> 0x007f }
            int r7 = r6.c     // Catch:{ FileNotFoundException -> 0x007c, IOException -> 0x007a, all -> 0x0077 }
            r1.writeShort(r7)     // Catch:{ FileNotFoundException -> 0x007c, IOException -> 0x007a, all -> 0x0077 }
            r1.write(r0)     // Catch:{ FileNotFoundException -> 0x007c, IOException -> 0x007a, all -> 0x0077 }
            a(r1)
            goto L_0x008c
        L_0x0077:
            r7 = move-exception
            r2 = r1
            goto L_0x0080
        L_0x007a:
            r7 = move-exception
            goto L_0x007d
        L_0x007c:
            r7 = move-exception
        L_0x007d:
            r2 = r1
            goto L_0x0087
        L_0x007f:
            r7 = move-exception
        L_0x0080:
            a(r2)
            throw r7
        L_0x0084:
            r7 = move-exception
            goto L_0x0087
        L_0x0086:
            r7 = move-exception
        L_0x0087:
            a(r2)
            goto L_0x008c
        L_0x008b:
        L_0x008c:
            r6.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akuu.<init>(java.io.File):void");
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
            }
        }
    }
}
