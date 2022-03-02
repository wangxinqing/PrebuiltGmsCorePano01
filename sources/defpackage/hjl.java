package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: hjl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hjl {
    private static final byte[] a = "|".getBytes();

    public static String a(audx audx, String... strArr) {
        byte[] bArr;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(audx.k());
            for (int i = 0; i < strArr.length; i++) {
                if (i > 0) {
                    instance.update(a);
                }
                String str = strArr[i];
                if (str == null) {
                    bArr = new byte[0];
                } else {
                    bArr = Uri.encode(str, "!$&'()*+,-./;=@_~ ").replace(" ", "%20").getBytes();
                }
                instance.update(bArr);
            }
            return Base64.encodeToString(instance.digest(), 2);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }
}
