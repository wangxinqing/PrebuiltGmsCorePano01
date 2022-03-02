package defpackage;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: aemg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aemg {
    public static byte[] a(String str, int i) {
        try {
            byte[] a = a(str.getBytes("UTF-8"));
            int length = a.length;
            if (i > length) {
                return a;
            }
            try {
                byte[] bArr = new byte[i];
                System.arraycopy(a, length - i, bArr, 0, i);
                return bArr;
            } catch (ArrayStoreException | IndexOutOfBoundsException | NullPointerException e) {
                Log.e("ImsiHashUtil", "Exception while copying the hash for truncation");
                throw new RuntimeException(e);
            }
        } catch (UnsupportedEncodingException e2) {
            Log.e("ImsiHashUtil", "Exception while converting the input string to byte array");
            throw new RuntimeException(e2);
        }
    }

    public static byte[] a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr);
            return instance.digest();
        } catch (NoSuchAlgorithmException e) {
            Log.w("ImsiHashUtil", "SHA-256 not supported");
            throw new RuntimeException(e);
        }
    }
}
