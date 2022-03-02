package defpackage;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: bgt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bgt {
    private static Cipher a = null;
    private static final Object b = new Object();
    private static final Object c = new Object();

    public static final String a(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv;
        if (bArr.length == 16) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (b) {
                    a().init(1, secretKeySpec, (SecureRandom) null);
                    doFinal = a().doFinal(bArr2);
                    iv = a().getIV();
                }
                int length = doFinal.length + iv.length;
                ByteBuffer allocate = ByteBuffer.allocate(length);
                allocate.put(iv).put(doFinal);
                allocate.flip();
                byte[] bArr3 = new byte[length];
                allocate.get(bArr3);
                return bfr.a(bArr3, false);
            } catch (NoSuchAlgorithmException e) {
                throw new bgs(e);
            } catch (InvalidKeyException e2) {
                throw new bgs(e2);
            } catch (IllegalBlockSizeException e3) {
                throw new bgs(e3);
            } catch (NoSuchPaddingException e4) {
                throw new bgs(e4);
            } catch (BadPaddingException e5) {
                throw new bgs(e5);
            }
        } else {
            throw new bgs();
        }
    }

    private static final Cipher a() {
        Cipher cipher;
        synchronized (c) {
            if (a == null) {
                a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = a;
        }
        return cipher;
    }

    public static final byte[] a(byte[] bArr, String str) {
        byte[] doFinal;
        if (bArr.length == 16) {
            try {
                byte[] a2 = bfr.a(str, false);
                int length = a2.length;
                if (length > 16) {
                    ByteBuffer allocate = ByteBuffer.allocate(length);
                    allocate.put(a2);
                    allocate.flip();
                    byte[] bArr2 = new byte[16];
                    byte[] bArr3 = new byte[(length - 16)];
                    allocate.get(bArr2);
                    allocate.get(bArr3);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                    synchronized (b) {
                        a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                        doFinal = a().doFinal(bArr3);
                    }
                    return doFinal;
                }
                throw new bgs();
            } catch (NoSuchAlgorithmException e) {
                throw new bgs(e);
            } catch (InvalidKeyException e2) {
                throw new bgs(e2);
            } catch (IllegalBlockSizeException e3) {
                throw new bgs(e3);
            } catch (NoSuchPaddingException e4) {
                throw new bgs(e4);
            } catch (BadPaddingException e5) {
                throw new bgs(e5);
            } catch (InvalidAlgorithmParameterException e6) {
                throw new bgs(e6);
            } catch (IllegalArgumentException e7) {
                throw new bgs(e7);
            }
        } else {
            throw new bgs();
        }
    }
}
