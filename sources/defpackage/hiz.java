package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: hiz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hiz {
    public final SecretKey a;
    public final SecretKey b;

    public hiz(SecretKey secretKey, SecretKey secretKey2) {
        iva.a((Object) secretKey, (Object) "encryptionKey cannot be null");
        this.a = secretKey;
        iva.a((Object) secretKey2, (Object) "macKey cannot be null");
        this.b = secretKey2;
    }

    public static hiz a(byte[] bArr, String str) {
        try {
            byte[] bytes = str.getBytes(amqn.c);
            iva.b(true, "cpuMemCost must be a power of 2 greater than 1");
            iva.b(true, "Memory consumption is too large");
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(bytes, "HmacSHA256"));
            byte[] a2 = hja.a(instance, bArr, 11264);
            for (int i = 0; i < 11; i++) {
                int i2 = i * 1024;
                int[] iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
                int[] iArr2 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
                int[] iArr3 = new int[2097152];
                for (int i3 = 0; i3 < 256; i3++) {
                    int i4 = (i3 * 4) + i2;
                    iArr[i3] = ((a2[i4 + 3] << 24) & -16777216) | (a2[i4] & 255) | ((a2[i4 + 1] << 8) & 65280) | ((a2[i4 + 2] << 16) & 16711680);
                }
                for (int i5 = 0; ((long) i5) < 8192; i5 += 2) {
                    System.arraycopy(iArr, 0, iArr3, i5 * PSKKeyManager.MAX_KEY_LENGTH_BYTES, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                    hja.a(iArr, iArr2);
                    System.arraycopy(iArr2, 0, iArr3, (i5 + 1) * PSKKeyManager.MAX_KEY_LENGTH_BYTES, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                    hja.a(iArr2, iArr);
                }
                for (int i6 = 0; ((long) i6) < 8192; i6 += 2) {
                    hja.a(iArr, iArr3, (int) ((hja.a(iArr) & 8191) * 256), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                    hja.a(iArr, iArr2);
                    hja.a(iArr2, iArr3, (int) ((hja.a(iArr2) & 8191) * 256), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                    hja.a(iArr2, iArr);
                }
                for (int i7 = 0; i7 < 256; i7++) {
                    int i8 = (i7 * 4) + i2;
                    int i9 = iArr[i7];
                    a2[i8] = (byte) i9;
                    a2[i8 + 1] = (byte) (i9 >> 8);
                    a2[i8 + 2] = (byte) (i9 >> 16);
                    a2[i8 + 3] = (byte) (i9 >> 24);
                }
            }
            byte[] a3 = hja.a(instance, a2, 32);
            return new hiz(new SecretKeySpec(a3, 0, 16, "AES"), new SecretKeySpec(a3, 16, 16, "AES"));
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new hit("Failed to generate the secret key.", e);
        }
    }

    public final byte[] b(byte[] bArr) {
        iva.a((Object) bArr, (Object) "encrypted cannot be null");
        int length = bArr.length;
        if (length >= 64) {
            try {
                Mac instance = Mac.getInstance("HmacSHA256");
                instance.init(this.b);
                int i = length - 48;
                instance.update(bArr, 16, i);
                if (Arrays.equals(instance.doFinal(), Arrays.copyOfRange(bArr, length - 32, length))) {
                    try {
                        Cipher instance2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
                        instance2.init(2, this.a, new IvParameterSpec(bArr, 0, 16));
                        try {
                            return instance2.doFinal(bArr, 16, i);
                        } catch (BadPaddingException | IllegalBlockSizeException e) {
                            throw new hix("Unable to decrypt the data.", e);
                        }
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e2) {
                        throw new hit("Unable to create the decryptor.", e2);
                    }
                } else {
                    throw new hix("Invalid signature.");
                }
            } catch (InvalidKeyException | NoSuchAlgorithmException e3) {
                throw new hit("Unable to create the hasher.", e3);
            }
        } else {
            throw new hix("Input too short for a valid encrypted blob.");
        }
    }

    public static SecretKey a(String str, byte[] bArr, int i) {
        try {
            byte[] array = amqn.a.newEncoder().encode(CharBuffer.wrap(str)).array();
            char[] cArr = new char[array.length];
            for (int i2 = 0; i2 < array.length; i2++) {
                cArr[i2] = (char) array[i2];
            }
            try {
                return SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(cArr, bArr, i, 128));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                throw new hit("Failed to generate the secret key.", e);
            }
        } catch (CharacterCodingException e2) {
            throw new hix("Unable to encode the password.", e2);
        }
    }

    public static byte[] a(String str, String str2) {
        return ByteBuffer.allocate(str.length() + str2.length() + 8).putInt(str.length()).put(str.getBytes(amqn.c)).putInt(str2.length()).put(str2.getBytes(amqn.c)).array();
    }

    public final byte[] a(hiy hiy, String str) {
        iva.a((Object) hiy, (Object) "type cannot be null");
        iva.a(str, (Object) "name cannot be empty");
        ByteBuffer allocate = ByteBuffer.allocate(4);
        hiy hiy2 = hiy.a;
        byte[] a2 = a(new String(allocate.putInt(hiy.b).array()), str);
        int length = a2.length;
        int i = (length + 16) - (length & 15);
        byte[] bArr = new byte[(i + 32)];
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, this.a, new IvParameterSpec(new byte[16]));
            instance.doFinal(a2, 0, length, bArr, 0);
            try {
                Mac instance2 = Mac.getInstance("HmacSHA256");
                instance2.init(this.b);
                instance2.update(bArr, 0, i);
                instance2.doFinal(bArr, i);
                return bArr;
            } catch (InvalidKeyException | NoSuchAlgorithmException | ShortBufferException e) {
                throw new hit("Unable to sign the data.", e);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException | ShortBufferException e2) {
            throw new hit("Unable to encrypt the data.", e2);
        }
    }

    public final byte[] a(byte[] bArr) {
        iva.a((Object) bArr, (Object) "value cannot be null");
        int length = bArr.length;
        int i = (length + 16) - (length & 15);
        byte[] bArr2 = new byte[(i + 48)];
        byte[] bArr3 = new byte[16];
        new SecureRandom().nextBytes(bArr3);
        System.arraycopy(bArr3, 0, bArr2, 0, 16);
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, this.a, new IvParameterSpec(bArr3));
            instance.doFinal(bArr, 0, length, bArr2, 16);
            try {
                Mac instance2 = Mac.getInstance("HmacSHA256");
                instance2.init(this.b);
                instance2.update(bArr2, 16, i);
                instance2.doFinal(bArr2, i + 16);
                return bArr2;
            } catch (InvalidKeyException | NoSuchAlgorithmException | ShortBufferException e) {
                throw new hit("Unable to sign the data.", e);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException | ShortBufferException e2) {
            throw new hit("Unable to encrypt the data.", e2);
        }
    }
}
