package defpackage;

import android.net.Uri;
import com.google.android.chimera.FragmentTransaction;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: afru  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afru {
    public static final /* synthetic */ int a = 0;
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(agzs agzs, Uri uri) {
        InputStream inputStream;
        try {
            inputStream = (InputStream) agzs.a(uri, ahcj.a(), new agzk[0]);
            String a2 = a(inputStream, "SHA1");
            if (inputStream != null) {
                inputStream.close();
            }
            return a2;
        } catch (IOException e) {
            afsh.a("%s: Failed to open file, uri = %s", (Object) "FileValidator", (Object) uri);
            return "";
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    private static String a(InputStream inputStream, String str) {
        MessageDigest a2 = a(str);
        if (a2 == null) {
            return "";
        }
        byte[] bArr = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
        int read = inputStream.read(bArr);
        while (read != -1) {
            a2.update(bArr, 0, read);
            read = inputStream.read(bArr);
        }
        return a(a2.digest());
    }

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length + length)];
        int i = 0;
        for (byte b2 : bArr) {
            byte b3 = b2 & 255;
            int i2 = i + 1;
            char[] cArr2 = b;
            cArr[i] = cArr2[b3 >>> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b3 & 15];
        }
        return new String(cArr);
    }

    public static MessageDigest a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            if (instance != null) {
                return instance;
            }
            return null;
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    public static boolean a(agzs agzs, Uri uri, String str, int i) {
        String str2;
        InputStream inputStream;
        if (i - 1 != 2) {
            str2 = a(agzs, uri);
        } else {
            try {
                inputStream = (InputStream) agzs.a(uri, ahcj.a(), new agzk[0]);
                String a2 = a(inputStream, "SHA-256");
                if (inputStream != null) {
                    inputStream.close();
                }
                str2 = a2;
            } catch (IOException e) {
                afsh.a("%s: Failed to open file, uri = %s", (Object) "FileValidator", (Object) uri);
                str2 = "";
            } catch (Throwable th) {
                apev.a(th, th);
            }
        }
        if (str2 != null) {
            return str2.equals(str);
        }
        return false;
        throw th;
    }
}
