package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: lrk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lrk {
    public static CipherInputStream a(lro lro, InputStream inputStream) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, lro.a, new IvParameterSpec((byte[]) iva.a((Object) lro.c)));
            return new CipherInputStream(inputStream, instance);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new lrn(e);
        }
    }

    public static CipherOutputStream a(lro lro, OutputStream outputStream) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, lro.a, new IvParameterSpec((byte[]) iva.a((Object) lro.c)));
            return new CipherOutputStream(outputStream, instance);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new lrn(e);
        }
    }

    public static void a(lro lro, InputStream inputStream, OutputStream outputStream) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, lro.a, new IvParameterSpec((byte[]) iva.a((Object) lro.c)));
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byte[] update = instance.update(bArr, 0, read);
                    if (update != null) {
                        outputStream.write(update);
                    }
                } else {
                    outputStream.write(instance.doFinal());
                    return;
                }
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new lrn(e);
        }
    }
}
