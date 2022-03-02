package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: zak  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zak {
    private final PackageManager a;

    public zak(PackageManager packageManager) {
        this.a = packageManager;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.pm.PackageManager r6, java.lang.String r7) {
        /*
            zak r0 = new zak
            r0.<init>(r6)
            android.net.Uri$Builder r6 = new android.net.Uri$Builder
            r6.<init>()
            java.lang.String r1 = "http"
            r6.scheme(r1)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 1
            r3 = 0
            android.content.pm.PackageManager r0 = r0.a     // Catch:{ NameNotFoundException -> 0x002e }
            r4 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x002e }
            android.content.pm.Signature[] r4 = r0.signatures     // Catch:{ NameNotFoundException -> 0x002e }
            if (r4 == 0) goto L_0x0045
            android.content.pm.Signature[] r4 = r0.signatures     // Catch:{ NameNotFoundException -> 0x002e }
            int r4 = r4.length     // Catch:{ NameNotFoundException -> 0x002e }
            if (r4 <= 0) goto L_0x0045
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x002e }
            r0 = r0[r3]     // Catch:{ NameNotFoundException -> 0x002e }
            java.lang.String r0 = a(r0)     // Catch:{ NameNotFoundException -> 0x002e }
            goto L_0x0047
        L_0x002e:
            r0 = move-exception
            r0 = 5
            java.lang.String r4 = "ContainerParam"
            boolean r0 = android.util.Log.isLoggable(r4, r0)
            if (r0 == 0) goto L_0x0045
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r7
            java.lang.String r5 = "Name not found while getting certificate for package: %s, returning zero"
            java.lang.String r0 = java.lang.String.format(r5, r0)
            android.util.Log.w(r4, r0)
        L_0x0045:
            java.lang.String r0 = "0"
        L_0x0047:
            r1[r3] = r0
            java.lang.String r0 = "apps.googleusercontent.com"
            r1[r2] = r0
            java.lang.String r0 = "%s.%s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r6.authority(r0)
            java.lang.String r0 = "/"
            r6.path(r0)
            java.lang.String r0 = "pkg"
            r6.appendQueryParameter(r0, r7)
            ikz r7 = defpackage.ysu.g
            java.lang.Object r7 = r7.c()
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x007b
            ikz r7 = defpackage.ysu.g
            java.lang.Object r7 = r7.c()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r0 = "api_key"
            r6.appendQueryParameter(r0, r7)
        L_0x007b:
            java.lang.String r6 = r6.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zak.a(android.content.pm.PackageManager, java.lang.String):java.lang.String");
    }

    private static String a(Signature signature) {
        MessageDigest messageDigest;
        byte[] digest;
        int i = 0;
        while (true) {
            if (i > 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA1");
                break;
            } catch (NoSuchAlgorithmException e) {
                if (i > 0 && Log.isLoggable("ContainerParam", 5)) {
                    Log.w("ContainerParam", String.format("Failed to get message digest for %s, returning zero", new Object[]{"SHA1"}), e);
                }
                i++;
            }
        }
        if (messageDigest == null || (digest = messageDigest.digest(signature.toByteArray())) == null) {
            return "0";
        }
        return Base64.encodeToString(digest, 2);
    }
}
