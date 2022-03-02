package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: aiab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiab {
    private final SecretKeySpec a;
    private final Mac b;
    private final Cipher c;

    private aiab(byte[] bArr, byte[] bArr2, ajrh ajrh) {
        Cipher cipher;
        this.a = new SecretKeySpec(bArr, "AES");
        if (ajrh == null) {
            ajrf.a();
        }
        this.b = a(bArr2);
        try {
            cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        } catch (GeneralSecurityException e) {
            cipher = null;
        }
        this.c = cipher;
    }

    public static aiab a(byte[] bArr, ajrh ajrh) {
        if (bArr != null && bArr.length == 32) {
            return new aiab(Arrays.copyOf(bArr, 16), Arrays.copyOfRange(bArr, 16, 32), ajrh);
        }
        throw new IllegalArgumentException("Cipher & Signing Key must be 32 bytes.");
    }

    private static Mac a(byte[] bArr) {
        int i = 0;
        while (i < 2) {
            try {
                Mac instance = Mac.getInstance("HmacSHA1");
                instance.init(new SecretKeySpec(bArr, "HmacSHA1"));
                return instance;
            } catch (NoSuchAlgorithmException e) {
                i++;
            } catch (InvalidKeyException e2) {
                return null;
            }
        }
        return null;
    }

    private static final byte[] a(InputStream inputStream, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i];
        while (true) {
            if (i <= 0) {
                break;
            }
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i -= read;
            } catch (IOException e) {
                return null;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    private final byte[] a(byte[] bArr, IvParameterSpec ivParameterSpec, int i) {
        Cipher cipher = this.c;
        if (cipher != null) {
            try {
                cipher.init(i, this.a, ivParameterSpec);
                return this.c.doFinal(bArr);
            } catch (GeneralSecurityException e) {
                throw new IOException("Failed to encrypt or decrypt.");
            }
        } else {
            throw new IOException("Unable to create cipher.");
        }
    }

    public final synchronized aiaa a(DataInputStream dataInputStream) {
        IvParameterSpec ivParameterSpec;
        byte[] a2;
        int length;
        int i;
        if (this.b != null) {
            int readInt = dataInputStream.readInt();
            if (readInt > 2097152 || readInt < 0) {
                throw new IOException(String.format("Invalid data length or too long: %d bytes.", new Object[]{Integer.valueOf(readInt)}));
            }
            byte[] a3 = a((InputStream) dataInputStream, 20);
            if (a3 == null || a3.length != 20) {
                throw new IOException("Unable to read HMAC.");
            }
            byte[] a4 = a((InputStream) dataInputStream, 16);
            if (a4 == null || a4.length != 16) {
                throw new IOException("Unable to read IV.");
            }
            ivParameterSpec = new IvParameterSpec(a4);
            a2 = a((InputStream) dataInputStream, readInt);
            if (a2 == null || (length = a2.length) != readInt) {
                throw new IOException("Unable to read ciphertext.");
            }
            i = length + 40;
            if (Arrays.equals(this.b.doFinal(a2), a3)) {
            } else {
                throw new IOException("HMAC does not match.");
            }
        } else {
            throw new IOException("Unable to create HMAC generator.");
        }
        return new aiaa(i, a(a2, ivParameterSpec, 2));
    }

    public final synchronized void a(DataOutputStream dataOutputStream, byte[] bArr) {
        if (this.b == null) {
            throw new IOException("Unable to create HMAC, data can not be signed.");
        } else if (bArr == null || bArr.length > 2097152) {
            throw new IOException("Invalid data: data is empty or too long.");
        } else {
            byte[] bArr2 = new byte[16];
            new SecureRandom().nextBytes(bArr2);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            byte[] a2 = a(bArr, ivParameterSpec, 1);
            byte[] doFinal = this.b.doFinal(a2);
            dataOutputStream.writeInt(a2.length);
            dataOutputStream.write(doFinal);
            dataOutputStream.write(ivParameterSpec.getIV());
            dataOutputStream.write(a2);
        }
    }
}
