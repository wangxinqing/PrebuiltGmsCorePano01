package defpackage;

import android.util.Base64;
import android.util.Log;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;

/* renamed from: fym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fym {
    private static int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        android.util.Log.e("GoogleLoginService.Pass", "received bad google_login_public_key: ", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
        android.util.Log.e("GoogleLoginService.Pass", "error encrypting password: ", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007d, code lost:
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0085, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009a, code lost:
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069 A[ExcHandler: InvalidKeyException (r0v10 'e' java.security.InvalidKeyException A[CUSTOM_DECLARE]), Splitter:B:7:0x0023] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070 A[ExcHandler: IllegalBlockSizeException (r0v9 'e' javax.crypto.IllegalBlockSizeException A[CUSTOM_DECLARE]), Splitter:B:7:0x0023] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0077 A[ExcHandler: UnsupportedEncodingException (r0v8 'e' java.io.UnsupportedEncodingException A[CUSTOM_DECLARE]), Splitter:B:7:0x0023] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e A[ExcHandler: BadPaddingException (r0v7 'e' javax.crypto.BadPaddingException A[CUSTOM_DECLARE]), Splitter:B:7:0x0023] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085 A[ExcHandler: NoSuchPaddingException (r0v6 'e' javax.crypto.NoSuchPaddingException A[CUSTOM_DECLARE]), Splitter:B:7:0x0023] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0091 A[LOOP:0: B:6:0x0021->B:40:0x0091, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0095 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r16, android.content.Context r17) {
        /*
            java.lang.String r0 = "google_login_public_key"
            r1 = r17
            java.lang.String r0 = defpackage.iqi.a(r1, r0)
            java.lang.String r1 = "GoogleLoginService.Pass"
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = "no public key available, using default"
            android.util.Log.i(r1, r0)
            java.lang.String r0 = "AAAAgMom/1a/v0lblO2Ubrt60J2gcuXSljGFQXgcyZWveWLEwo6prwgi3iJIZdodyhKZQrNWp5nKJ3srRXcUW+F1BD3baEVGcmEgqaLZUNBjm057pKRI16kB0YppeGx5qIQ5QjKzsR8ETQbKLNWgRY0QRNVz34kMJR3P/LgHax/6rmf5AAAAAwEAAQ=="
        L_0x0013:
            r2 = 5
            byte[] r3 = new byte[r2]
            java.security.PublicKey r4 = a((java.lang.String) r0, (byte[]) r3)
            r5 = 0
            if (r4 == 0) goto L_0x009b
            r6 = 1
            r7 = 0
            r8 = 0
        L_0x0021:
            java.lang.String r0 = "RSA/ECB/OAEPWITHSHA1ANDMGF1PADDING"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x008c, NoSuchPaddingException -> 0x0085, BadPaddingException -> 0x007e, UnsupportedEncodingException -> 0x0077, IllegalBlockSizeException -> 0x0070, InvalidKeyException -> 0x0069 }
            java.lang.String r9 = "UTF-8"
            r10 = r16
            byte[] r9 = r10.getBytes(r9)     // Catch:{ NoSuchAlgorithmException -> 0x0067, NoSuchPaddingException -> 0x0085, BadPaddingException -> 0x007e, UnsupportedEncodingException -> 0x0077, IllegalBlockSizeException -> 0x0070, InvalidKeyException -> 0x0069 }
            int r11 = r9.length     // Catch:{ NoSuchAlgorithmException -> 0x0067, NoSuchPaddingException -> 0x0085, BadPaddingException -> 0x007e, UnsupportedEncodingException -> 0x0077, IllegalBlockSizeException -> 0x0070, InvalidKeyException -> 0x0069 }
            int r11 = r11 + -1
            r12 = 86
            int r11 = r11 / r12
            int r11 = r11 + r6
            int r13 = r11 * 133
            byte[] r13 = new byte[r13]     // Catch:{ NoSuchAlgorithmException -> 0x0067, NoSuchPaddingException -> 0x0085, BadPaddingException -> 0x007e, UnsupportedEncodingException -> 0x0077, IllegalBlockSizeException -> 0x0070, InvalidKeyException -> 0x0069 }
            r14 = 0
        L_0x003b:
            if (r14 < r11) goto L_0x0044
            r0 = 10
            java.lang.String r0 = android.util.Base64.encodeToString(r13, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0067, NoSuchPaddingException -> 0x0085, BadPaddingException -> 0x007e, UnsupportedEncodingException -> 0x0077, IllegalBlockSizeException -> 0x0070, InvalidKeyException -> 0x0069 }
            return r0
        L_0x0044:
            r0.init(r6, r4)     // Catch:{ NoSuchAlgorithmException -> 0x0067, NoSuchPaddingException -> 0x0085, BadPaddingException -> 0x007e, UnsupportedEncodingException -> 0x0077, IllegalBlockSizeException -> 0x0070, InvalidKeyException -> 0x0069 }
            int r15 = r14 * 86
            int r6 = r11 + -1
            if (r14 != r6) goto L_0x0051
            int r6 = r9.length     // Catch:{ NoSuchAlgorithmException -> 0x0067, NoSuchPaddingException -> 0x0085, BadPaddingException -> 0x007e, UnsupportedEncodingException -> 0x0077, IllegalBlockSizeException -> 0x0070, InvalidKeyException -> 0x0069 }
            int r6 = r6 - r15
            goto L_0x0053
        L_0x0051:
            r6 = 86
        L_0x0053:
            byte[] r6 = r0.doFinal(r9, r15, r6)     // Catch:{ NoSuchAlgorithmException -> 0x0067, NoSuchPaddingException -> 0x0085, BadPaddingException -> 0x007e, UnsupportedEncodingException -> 0x0077, IllegalBlockSizeException -> 0x0070, InvalidKeyException -> 0x0069 }
            int r15 = r14 * 133
            java.lang.System.arraycopy(r3, r7, r13, r15, r2)     // Catch:{ NoSuchAlgorithmException -> 0x0067, NoSuchPaddingException -> 0x0085, BadPaddingException -> 0x007e, UnsupportedEncodingException -> 0x0077, IllegalBlockSizeException -> 0x0070, InvalidKeyException -> 0x0069 }
            int r15 = r15 + 5
            int r2 = r6.length     // Catch:{ NoSuchAlgorithmException -> 0x0067, NoSuchPaddingException -> 0x0085, BadPaddingException -> 0x007e, UnsupportedEncodingException -> 0x0077, IllegalBlockSizeException -> 0x0070, InvalidKeyException -> 0x0069 }
            java.lang.System.arraycopy(r6, r7, r13, r15, r2)     // Catch:{ NoSuchAlgorithmException -> 0x0067, NoSuchPaddingException -> 0x0085, BadPaddingException -> 0x007e, UnsupportedEncodingException -> 0x0077, IllegalBlockSizeException -> 0x0070, InvalidKeyException -> 0x0069 }
            int r14 = r14 + 1
            r2 = 5
            r6 = 1
            goto L_0x003b
        L_0x0067:
            r0 = move-exception
            goto L_0x008f
        L_0x0069:
            r0 = move-exception
            java.lang.String r2 = "received bad google_login_public_key: "
            android.util.Log.e(r1, r2, r0)
            return r5
        L_0x0070:
            r0 = move-exception
            java.lang.String r2 = "error encrypting password: "
            android.util.Log.e(r1, r2, r0)
            return r5
        L_0x0077:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x007e:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0085:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x008c:
            r0 = move-exception
            r10 = r16
        L_0x008f:
            if (r8 > 0) goto L_0x0095
            r2 = 5
            r6 = 1
            r8 = 1
            goto L_0x0021
        L_0x0095:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x009b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fym.a(java.lang.String, android.content.Context):java.lang.String");
    }

    public static PublicKey a(String str, byte[] bArr) {
        byte[] decode = Base64.decode(str, 0);
        int length = decode.length;
        if (length >= 8) {
            int a = a(decode, 0);
            int a2 = a(decode, a + 4);
            if (length == a + a2 + 8) {
                byte[] bArr2 = new byte[a];
                System.arraycopy(decode, 4, bArr2, 0, a);
                BigInteger bigInteger = new BigInteger(1, bArr2);
                byte[] bArr3 = new byte[a2];
                System.arraycopy(decode, a + 8, bArr3, 0, a2);
                fyl fyl = new fyl(bigInteger, new BigInteger(1, bArr3));
                char c = 0;
                while (true) {
                    try {
                        byte[] digest = MessageDigest.getInstance("SHA-1").digest(decode);
                        bArr[0] = 0;
                        System.arraycopy(digest, 0, bArr, 1, 4);
                        return KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(fyl.a, fyl.b));
                    } catch (NoSuchAlgorithmException e) {
                        if (c <= 0) {
                            c = 1;
                        } else {
                            throw new RuntimeException(e);
                        }
                    } catch (InvalidKeySpecException e2) {
                        Log.e("GoogleLoginService.Pass", "received bad google_login_public_key: ", e2);
                        return null;
                    }
                }
            } else {
                throw new IllegalStateException("Illegally formatted Key, expected length does not match actual length");
            }
        } else {
            throw new IllegalStateException("Illegally formated key: key is too short");
        }
    }
}
