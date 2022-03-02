package defpackage;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* renamed from: mbd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mbd implements man {
    protected static final byte[] a = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};
    protected static final byte[] b = {16, 57, 56, -18, 69, 55, -27, -98, -114, -25, -110, -10, 84, 80, 79, -72, 52, 111, -58, -77, 70, -48, -69, -60, 65, 95, -61, 57, -4, -4, -114, -63};
    private final byte[] c = b;
    private final byte[] d = a;

    public final boolean a(File file) {
        try {
            X509Certificate[][] a2 = bcx.a(file.getAbsolutePath());
            if (a2.length == 1) {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(a2[0][0].getEncoded());
                if (Arrays.equals(this.d, digest)) {
                    return true;
                }
                if ("user".equals(Build.TYPE) || !Arrays.equals(this.c, digest)) {
                    return false;
                }
                return true;
            }
            throw new GeneralSecurityException("APK has more than one signature.");
        } catch (bcu e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException | RuntimeException e2) {
            throw new GeneralSecurityException("Failed to verify signatures", e2);
        }
    }
}
