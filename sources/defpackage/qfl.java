package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: qfl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qfl {
    private static final qfn a = new qfn("SignatureVerifier");
    private static final byte[] b = {-26, 38, 73, -86, -29, 23, 110, 31, -50, -34, 96, 19, -58, -24, -70, 63, -1, -45, 41, 53, -6, -100, -86, -64, -44, 43, -64, -125, 81, 76, -53, -15};
    private static final byte[] c = {58, -1, 119, 121, -71, 17, 11, -54, 46, 10, 44, -125, 44, -108, 73, -15, -126, 47, Byte.MAX_VALUE, -38, -55, -36, -50, -110, 11, -41, -69, -86, 44, 106, 6, 56};
    private static final byte[] d = {-16, -3, 108, 91, 65, 15, 37, -53, 37, -61, -75, 51, 70, -56, -105, 47, -82, 48, -8, -18, 116, 17, -33, -111, 4, Byte.MIN_VALUE, -83, 107, 45, 96, -37, -125};
    private static final byte[] e = {25, 117, -78, -15, 113, 119, -68, -119, -91, -33, -13, 31, -98, 100, -90, -54, -30, -127, -91, 61, -63, -47, -43, -101, 29, 20, Byte.MAX_VALUE, -31, -56, 42, -6, 0};
    private final Context f;

    public qfl(Context context) {
        this.f = context;
    }

    private final boolean a(PackageInfo packageInfo) {
        if (packageInfo.signatures.length == 1) {
            try {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(packageInfo.signatures[0].toByteArray());
                if (Arrays.equals(digest, c)) {
                    return true;
                }
                if (Arrays.equals(digest, b)) {
                    if (axuy.a.a().j() || hxy.a(this.f)) {
                        return true;
                    }
                    a.c("Test-keys are not supported on this device.", new Object[0]);
                }
                return false;
            } catch (NoSuchAlgorithmException e2) {
            }
        }
        return false;
    }

    private final boolean b(PackageInfo packageInfo) {
        if (packageInfo.signatures.length == 1) {
            try {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(packageInfo.signatures[0].toByteArray());
                if (Arrays.equals(digest, d)) {
                    return true;
                }
                if (Arrays.equals(digest, e)) {
                    if (hxy.a(this.f)) {
                        return true;
                    }
                    a.c("Test-keys are not supported on this device.", new Object[0]);
                }
                return false;
            } catch (NoSuchAlgorithmException e2) {
            }
        }
        return false;
    }

    public final boolean b(int i) {
        String[] packagesForUid = this.f.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && packagesForUid.length == 1) {
            try {
                if (b(this.f.getPackageManager().getPackageInfo(packagesForUid[0], 64))) {
                    return true;
                }
            } catch (PackageManager.NameNotFoundException e2) {
            }
        }
        return false;
    }

    public final boolean a(int i) {
        String[] packagesForUid = this.f.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && packagesForUid.length == 1) {
            try {
                if (a(this.f.getPackageManager().getPackageInfo(packagesForUid[0], 64))) {
                    return true;
                }
            } catch (PackageManager.NameNotFoundException e2) {
            }
        }
        return false;
    }
}
