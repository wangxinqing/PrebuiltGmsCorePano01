package defpackage;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: autp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class autp {
    private static final byte[] a = b("SecureMessage");

    static String a(autn autn) {
        int i = autn.d;
        if (i != 0) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("ENC:");
            sb.append(i);
            return sb.toString();
        }
        throw null;
    }

    public static byte[] b(String str) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(a(str));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("No security provider initialized yet?", e);
        }
    }

    private static byte[] c(byte[] bArr, byte[] bArr2) {
        Mac instance = Mac.getInstance("HmacSHA256");
        try {
            instance.init(new SecretKeySpec(bArr, "AES"));
            byte[] bArr3 = new byte[32];
            instance.reset();
            instance.update(bArr2);
            System.arraycopy(instance.doFinal(new byte[]{1}), 0, bArr3, 0, 32);
            return a(bArr3, 32);
        } catch (InvalidKeyException e) {
            throw new AssertionError(e);
        }
    }

    static String a(auto auto) {
        int i = auto.f;
        if (i != 0) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("SIG:");
            sb.append(i);
            return sb.toString();
        }
        throw null;
    }

    static SecretKey a(SecretKey secretKey, String str) {
        return new SecretKeySpec(a(secretKey, a, a(str)), "AES");
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr == null && bArr2 == null) {
            return new byte[0];
        }
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null) {
            return bArr;
        }
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[(length + length2)];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr2, 0, bArr3, length, length2);
        return bArr3;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.security.Key, javax.crypto.SecretKey] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a(java.security.Key r1, defpackage.auto r2, byte[] r3, byte[] r4) {
        /*
            if (r3 == 0) goto L_0x0046
            if (r4 == 0) goto L_0x0046
            boolean r0 = r2.e
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = r2.d
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r0)
            java.lang.String r2 = a((defpackage.auto) r2)
            javax.crypto.SecretKey r1 = a((javax.crypto.SecretKey) r1, (java.lang.String) r2)
            r0.init(r1)
            byte[] r1 = r0.doFinal(r4)
            boolean r1 = a((byte[]) r3, (byte[]) r1)
            return r1
        L_0x0022:
            boolean r0 = r1 instanceof java.security.PublicKey
            if (r0 == 0) goto L_0x003e
            java.lang.String r2 = r2.d
            java.security.Signature r2 = java.security.Signature.getInstance(r2)
            java.security.PublicKey r1 = (java.security.PublicKey) r1
            r2.initVerify(r1)
            byte[] r1 = a
            r2.update(r1)
            r2.update(r4)
            boolean r1 = r2.verify(r3)
            return r1
        L_0x003e:
            java.security.InvalidKeyException r1 = new java.security.InvalidKeyException
            java.lang.String r2 = "Expected a PublicKey"
            r1.<init>(r2)
            throw r1
        L_0x0046:
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.autp.a(java.security.Key, auto, byte[], byte[]):boolean");
    }

    static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length == bArr2.length) {
            byte b = 0;
            for (int i = 0; i < bArr2.length; i++) {
                b = (byte) (b | (bArr[i] ^ bArr2[i]));
            }
            if (b == 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[] a(autn autn, SecureRandom secureRandom) {
        try {
            byte[] bArr = new byte[Cipher.getInstance(autn.c).getBlockSize()];
            secureRandom.nextBytes(bArr);
            return bArr;
        } catch (NoSuchPaddingException e) {
            throw new NoSuchAlgorithmException(e);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.security.Key, javax.crypto.SecretKey] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(defpackage.auto r1, java.security.Key r2, java.security.SecureRandom r3, byte[] r4) {
        /*
            if (r4 == 0) goto L_0x0047
            boolean r0 = r1.e
            if (r0 != 0) goto L_0x001c
            java.lang.String r3 = r1.d
            javax.crypto.Mac r3 = javax.crypto.Mac.getInstance(r3)
            java.lang.String r1 = a((defpackage.auto) r1)
            javax.crypto.SecretKey r1 = a((javax.crypto.SecretKey) r2, (java.lang.String) r1)
            r3.init(r1)
            byte[] r1 = r3.doFinal(r4)
            return r1
        L_0x001c:
            boolean r0 = r2 instanceof java.security.PrivateKey
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r1.d
            java.security.Signature r1 = java.security.Signature.getInstance(r1)
            java.security.PrivateKey r2 = (java.security.PrivateKey) r2
            r1.initSign(r2, r3)
            byte[] r2 = a     // Catch:{ SignatureException -> 0x0038 }
            r1.update(r2)     // Catch:{ SignatureException -> 0x0038 }
            r1.update(r4)     // Catch:{ SignatureException -> 0x0038 }
            byte[] r1 = r1.sign()     // Catch:{ SignatureException -> 0x0038 }
            return r1
        L_0x0038:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r1)
            throw r2
        L_0x003f:
            java.security.InvalidKeyException r1 = new java.security.InvalidKeyException
            java.lang.String r2 = "Expected a PrivateKey"
            r1.<init>(r2)
            throw r1
        L_0x0047:
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.autp.a(auto, java.security.Key, java.security.SecureRandom, byte[]):byte[]");
    }

    public static byte[] a(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.security.Key, javax.crypto.SecretKey] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(java.security.Key r1, defpackage.autn r2, java.security.SecureRandom r3, byte[] r4, byte[] r5) {
        /*
            if (r5 == 0) goto L_0x0046
            autn r0 = defpackage.autn.NONE
            if (r2 == r0) goto L_0x003e
            java.lang.String r0 = r2.c     // Catch:{ InvalidAlgorithmParameterException -> 0x0037, IllegalBlockSizeException -> 0x0030, BadPaddingException -> 0x0029, NoSuchPaddingException -> 0x0022 }
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException -> 0x0037, IllegalBlockSizeException -> 0x0030, BadPaddingException -> 0x0029, NoSuchPaddingException -> 0x0022 }
            java.lang.String r2 = a((defpackage.autn) r2)     // Catch:{ InvalidAlgorithmParameterException -> 0x0037, IllegalBlockSizeException -> 0x0030, BadPaddingException -> 0x0029, NoSuchPaddingException -> 0x0022 }
            javax.crypto.SecretKey r1 = a((javax.crypto.SecretKey) r1, (java.lang.String) r2)     // Catch:{ InvalidAlgorithmParameterException -> 0x0037, IllegalBlockSizeException -> 0x0030, BadPaddingException -> 0x0029, NoSuchPaddingException -> 0x0022 }
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec     // Catch:{ InvalidAlgorithmParameterException -> 0x0037, IllegalBlockSizeException -> 0x0030, BadPaddingException -> 0x0029, NoSuchPaddingException -> 0x0022 }
            r2.<init>(r4)     // Catch:{ InvalidAlgorithmParameterException -> 0x0037, IllegalBlockSizeException -> 0x0030, BadPaddingException -> 0x0029, NoSuchPaddingException -> 0x0022 }
            r4 = 1
            r0.init(r4, r1, r2, r3)     // Catch:{ InvalidAlgorithmParameterException -> 0x0037, IllegalBlockSizeException -> 0x0030, BadPaddingException -> 0x0029, NoSuchPaddingException -> 0x0022 }
            byte[] r1 = r0.doFinal(r5)     // Catch:{ InvalidAlgorithmParameterException -> 0x0037, IllegalBlockSizeException -> 0x0030, BadPaddingException -> 0x0029, NoSuchPaddingException -> 0x0022 }
            return r1
        L_0x0022:
            r1 = move-exception
            java.security.NoSuchAlgorithmException r2 = new java.security.NoSuchAlgorithmException
            r2.<init>(r1)
            throw r2
        L_0x0029:
            r1 = move-exception
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>(r1)
            throw r2
        L_0x0030:
            r1 = move-exception
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>(r1)
            throw r2
        L_0x0037:
            r1 = move-exception
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>(r1)
            throw r2
        L_0x003e:
            java.security.NoSuchAlgorithmException r1 = new java.security.NoSuchAlgorithmException
            java.lang.String r2 = "Cannot use NONE type here"
            r1.<init>(r2)
            throw r1
        L_0x0046:
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.autp.a(java.security.Key, autn, java.security.SecureRandom, byte[], byte[]):byte[]");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.security.Key, javax.crypto.SecretKey] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static byte[] a(java.security.Key r1, defpackage.autn r2, byte[] r3, byte[] r4) {
        /*
            if (r3 == 0) goto L_0x0033
            if (r4 == 0) goto L_0x0033
            autn r0 = defpackage.autn.NONE
            if (r2 == r0) goto L_0x002b
            java.lang.String r0 = r2.c     // Catch:{ NoSuchPaddingException -> 0x0024 }
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ NoSuchPaddingException -> 0x0024 }
            java.lang.String r2 = a((defpackage.autn) r2)     // Catch:{ NoSuchPaddingException -> 0x0024 }
            javax.crypto.SecretKey r1 = a((javax.crypto.SecretKey) r1, (java.lang.String) r2)     // Catch:{ NoSuchPaddingException -> 0x0024 }
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec     // Catch:{ NoSuchPaddingException -> 0x0024 }
            r2.<init>(r3)     // Catch:{ NoSuchPaddingException -> 0x0024 }
            r3 = 2
            r0.init(r3, r1, r2)     // Catch:{ NoSuchPaddingException -> 0x0024 }
            byte[] r1 = r0.doFinal(r4)     // Catch:{ NoSuchPaddingException -> 0x0024 }
            return r1
        L_0x0024:
            r1 = move-exception
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>(r1)
            throw r2
        L_0x002b:
            java.security.NoSuchAlgorithmException r1 = new java.security.NoSuchAlgorithmException
            java.lang.String r2 = "Cannot use NONE type here"
            r1.<init>(r2)
            throw r1
        L_0x0033:
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.autp.a(java.security.Key, autn, byte[], byte[]):byte[]");
    }

    private static byte[] a(SecretKey secretKey, byte[] bArr) {
        Mac instance = Mac.getInstance("HmacSHA256");
        try {
            instance.init(new SecretKeySpec(bArr, "AES"));
            byte[] encoded = secretKey.getEncoded();
            if (encoded != null) {
                return instance.doFinal(encoded);
            }
            throw new InvalidKeyException("Cannot get encoded form of SecretKey");
        } catch (InvalidKeyException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] a(SecretKey secretKey, byte[] bArr, byte[] bArr2) {
        if (secretKey != null && bArr != null && bArr2 != null) {
            return c(a(secretKey, bArr), bArr2);
        }
        throw null;
    }

    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[20];
        System.arraycopy(MessageDigest.getInstance("SHA-256").digest(bArr), 0, bArr2, 0, 20);
        return bArr2;
    }

    static byte[] a(byte[] bArr, int i) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 0 || i > length) {
                throw new IndexOutOfBoundsException();
            }
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            return bArr2;
        }
        throw null;
    }
}
