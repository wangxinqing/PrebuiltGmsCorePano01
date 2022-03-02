package defpackage;

import android.util.Base64;
import com.google.android.chimera.FragmentTransaction;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: cqx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cqx {
    public static cqv a(InputStream inputStream, OutputStream outputStream, int i) {
        String str;
        if (i != 1) {
            str = "SHA-256";
        } else {
            str = "SHA-1";
        }
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            byte[] bArr = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
            long j = 0;
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        return new cqv(Base64.encodeToString(instance.digest(), 11), j);
                    }
                    if (outputStream != null) {
                        outputStream.write(bArr, 0, read);
                    }
                    instance.update(bArr, 0, read);
                    j += (long) read;
                } finally {
                    inputStream.close();
                }
            }
        } catch (NoSuchAlgorithmException e) {
            inputStream.close();
            return null;
        }
    }
}
