package defpackage;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: aibx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aibx {
    private final Cipher a;
    private final Cipher b;

    private aibx(Cipher cipher, Cipher cipher2) {
        this.a = cipher;
        this.b = cipher2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0088 A[SYNTHETIC, Splitter:B:58:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0090 A[Catch:{ IOException -> 0x008c }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:45:0x0070=Splitter:B:45:0x0070, B:64:0x0093=Splitter:B:64:0x0093} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized defpackage.aibx a(android.content.Context r4, java.security.SecureRandom r5) {
        /*
            java.lang.Class<aibx> r0 = defpackage.aibx.class
            monitor-enter(r0)
            java.io.File r4 = r4.getFilesDir()     // Catch:{ all -> 0x009a }
            if (r4 == 0) goto L_0x0094
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "EARStorage.ck"
            r1.<init>(r4, r2)     // Catch:{ all -> 0x009a }
            r4 = 0
            boolean r2 = r1.exists()     // Catch:{ IOException -> 0x007c, all -> 0x0078 }
            if (r2 != 0) goto L_0x0034
            r2 = 32
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x007c, all -> 0x0078 }
            r5.nextBytes(r2)     // Catch:{ IOException -> 0x007c, all -> 0x0078 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x007c, all -> 0x0078 }
            r5.<init>(r1)     // Catch:{ IOException -> 0x007c, all -> 0x0078 }
            r5.write(r2)     // Catch:{ IOException -> 0x002f, all -> 0x002a }
            r3 = r5
            r5 = r4
            r4 = r3
            goto L_0x003d
        L_0x002a:
            r1 = move-exception
            r3 = r5
            r5 = r4
            r4 = r3
            goto L_0x0086
        L_0x002f:
            r1 = move-exception
            r3 = r5
            r5 = r4
            r4 = r3
            goto L_0x007f
        L_0x0034:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x007c, all -> 0x0078 }
            r5.<init>(r1)     // Catch:{ IOException -> 0x007c, all -> 0x0078 }
            byte[] r2 = defpackage.anmr.a((java.io.InputStream) r5)     // Catch:{ IOException -> 0x0076 }
        L_0x003d:
            if (r4 == 0) goto L_0x0045
            r4.close()     // Catch:{ IOException -> 0x0043 }
            goto L_0x0045
        L_0x0043:
            r4 = move-exception
            goto L_0x004b
        L_0x0045:
            if (r5 != 0) goto L_0x0048
            goto L_0x004b
        L_0x0048:
            r5.close()     // Catch:{ IOException -> 0x0043 }
        L_0x004b:
            javax.crypto.spec.SecretKeySpec r4 = new javax.crypto.spec.SecretKeySpec     // Catch:{ IllegalArgumentException -> 0x006a }
            java.lang.String r5 = "AES"
            r4.<init>(r2, r5)     // Catch:{ IllegalArgumentException -> 0x006a }
            r5 = 1
            javax.crypto.Cipher r5 = a((int) r5, (javax.crypto.spec.SecretKeySpec) r4)     // Catch:{ GeneralSecurityException -> 0x0063 }
            r1 = 2
            javax.crypto.Cipher r4 = a((int) r1, (javax.crypto.spec.SecretKeySpec) r4)     // Catch:{ GeneralSecurityException -> 0x0063 }
            aibx r1 = new aibx     // Catch:{ GeneralSecurityException -> 0x0063 }
            r1.<init>(r5, r4)     // Catch:{ GeneralSecurityException -> 0x0063 }
            monitor-exit(r0)
            return r1
        L_0x0063:
            r4 = move-exception
            aicb r5 = new aicb     // Catch:{ all -> 0x009a }
            r5.<init>(r4)     // Catch:{ all -> 0x009a }
            throw r5     // Catch:{ all -> 0x009a }
        L_0x006a:
            r4 = move-exception
            r1.delete()     // Catch:{ SecurityException -> 0x006f }
            goto L_0x0070
        L_0x006f:
            r5 = move-exception
        L_0x0070:
            aicb r5 = new aicb     // Catch:{ all -> 0x009a }
            r5.<init>(r4)     // Catch:{ all -> 0x009a }
            throw r5     // Catch:{ all -> 0x009a }
        L_0x0076:
            r1 = move-exception
            goto L_0x007f
        L_0x0078:
            r5 = move-exception
            r1 = r5
            r5 = r4
            goto L_0x0086
        L_0x007c:
            r5 = move-exception
            r1 = r5
            r5 = r4
        L_0x007f:
            aicb r2 = new aicb     // Catch:{ all -> 0x0085 }
            r2.<init>(r1)     // Catch:{ all -> 0x0085 }
            throw r2     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r1 = move-exception
        L_0x0086:
            if (r4 == 0) goto L_0x008e
            r4.close()     // Catch:{ IOException -> 0x008c }
            goto L_0x008e
        L_0x008c:
            r4 = move-exception
            goto L_0x0093
        L_0x008e:
            if (r5 == 0) goto L_0x0093
            r5.close()     // Catch:{ IOException -> 0x008c }
        L_0x0093:
            throw r1     // Catch:{ all -> 0x009a }
        L_0x0094:
            aicb r4 = new aicb     // Catch:{ all -> 0x009a }
            r4.<init>()     // Catch:{ all -> 0x009a }
            throw r4     // Catch:{ all -> 0x009a }
        L_0x009a:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aibx.a(android.content.Context, java.security.SecureRandom):aibx");
    }

    public final byte[] b(byte[] bArr) {
        try {
            return this.b.doFinal(bArr);
        } catch (BadPaddingException | IllegalBlockSizeException e) {
            throw new aicb(e);
        }
    }

    private static Cipher a(int i, SecretKeySpec secretKeySpec) {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(i, secretKeySpec, new IvParameterSpec(new byte[16]));
        return instance;
    }

    public final byte[] a(byte[] bArr) {
        try {
            return this.a.doFinal(bArr);
        } catch (BadPaddingException | IllegalBlockSizeException e) {
            throw new aicb(e);
        }
    }
}
