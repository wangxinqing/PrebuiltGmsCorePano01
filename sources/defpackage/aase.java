package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* renamed from: aase  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aase {
    public final Context a;
    public final String b;
    public final int c;
    public final boolean d;
    public final aarq e;

    static {
        aase.class.getSimpleName();
    }

    public aase(Context context, int i) {
        this.a = context;
        this.c = i;
        this.d = hxz.f(context);
        this.b = String.valueOf(context.getApplicationInfo().dataDir).concat("/snet");
        this.e = new aarq(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x008a A[SYNTHETIC, Splitter:B:37:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0093 A[SYNTHETIC, Splitter:B:43:0x0093] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a(java.io.File r8, defpackage.aasd r9, int r10) {
        /*
            long r0 = r8.length()
            r2 = 0
            r3 = 52428800(0x3200000, double:2.5903269E-316)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0099
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0084, all -> 0x0082 }
            r1.<init>(r8)     // Catch:{ Exception -> 0x0084, all -> 0x0082 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            java.lang.String r3 = "SHA512withRSA"
            java.security.Signature r3 = java.security.Signature.getInstance(r3)     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            r4 = 1
            if (r10 == r4) goto L_0x0026
            java.lang.String r10 = "MIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEAx6BVAlkSMqzfalpLdBSWJTmw9Sn6KH3yeITXQSjW930rKP8JyO4eDUKG/dKovjpgyryB2gKC8UrTc/H755T7DkCPWo8iolPGEU9wHad5L/cczatyXkfyzXdAlnm22gDm8hZNe5Uuhxp1lLJpYq6BXGa7inwCnqm3CzZH0GD7+GUEUJPiSUuRqsZ85W1ACQQkZ1Xx4DaUkQzdMQtmoYT5JKn2QIRAkROy17vWR3kgt59iVlLu0FoJHS4Qo9nL2q8y5aacEhDo9pT7b0MIVdHOZuHn5CygkBefD8wUlPfezKe7ixHxpXx4YO3lUfBmZDxmjLvkxIWPDq7V+SGpgEzYI0HficnCOO8iz3CiAB787G2iqSIVO95XwMz5k286NK8OZJo40aN6XLgQnn3OJe+Ff2ISIm/SHO3LfsDzffy/N38+zZVZhcW/wlag/dRL+ltB3Oyed3fNraSuw6s0e3FHBnSHDsSmrveBz3HKB65DEjuTlZEsRGt8VoPOfO4vRYaZSDVR6QR1lZAPlFQC787Q8k0YdzIIW0usHopP0QY4CHyY69ctdQbW1CFuYEJvEfYoUJbhgYaEP0HKIkWUkcIEVNwewRr+xuh0B0BFLVdqGtZUyQOUNoKUj+VM/Lo0Z6nXXVcln+not//YuLa8bugEVsuAUPFylQXaTahJsW3oyPUCAwEAAQ=="
            byte[] r10 = android.util.Base64.decode(r10, r2)     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            goto L_0x002c
        L_0x0026:
            java.lang.String r10 = "MIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEA9OT2I+Zh5gPONCNYTeMAI7FxnISQLa6ART9E30l7PCHMMU7a90n2piOLxGL4GNQkpPckjB4OYucSCFuro/2Hb2+qMBfomOKOEZYE+rkYckQEExQZcc8Htds05Hm/obWUlJS3pdM7Pt7F5Y854Md8xrjMCJoYGOkrVR/IwrfzmGrRSshr8wl8ho6wSyeShw1ZqCCRMUQCWWXhk0ZFxXtDtYGNeeIJvafeiL6rskHDh80Z4orTS4+ZyZaCXEidogWt6n/OYmCFxRBcWudo0daCjmosskIzjIbuaewXzJpygFRmCQoYOG7tGsgKtnyzT5KKAyRwXCN9vhw5R8pYd74cZMtaZoufT8DdIS5gzceKC0/GVXPFAzpw1fySpXML7Pw7lP6DpYn5vArex6JKFWJnwph8uK2EADnlTPWUC52EF0v7yieDLXwdWtK4PJbkPDucMG4PWv5b8jyhXcXCUJFOBfzVmSSci5Y7J4ak6QfIV5KbCvG08nZY50iv7FUStfK3vpt6HaiduWxudIgl+qdPiQH0hFbgPTBiwh6DXIj5akhBnwPR3ojAGZqU4QITJv+2ll8pk+fnIcXcaeSqXDVx4XWKnp22HZOaXOCK1krO2rYf32pRlk8jZ+e8rzC1tHmV3FSXmntB1PmclCvrAaQQGRjr6GW7nlMy0cLaWz/v6dMCAwEAAQ=="
            byte[] r10 = android.util.Base64.decode(r10, r2)     // Catch:{ Exception -> 0x007f, all -> 0x007c }
        L_0x002c:
            java.security.spec.X509EncodedKeySpec r4 = new java.security.spec.X509EncodedKeySpec     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            r4.<init>(r10)     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            java.lang.String r10 = "RSA"
            java.security.KeyFactory r10 = java.security.KeyFactory.getInstance(r10)     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            java.security.PublicKey r10 = r10.generatePublic(r4)     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            r3.initVerify(r10)     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            r10 = 0
        L_0x003f:
            int r4 = r1.read(r0)     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            r5 = -1
            if (r4 != r5) goto L_0x0076
            long r4 = (long) r10     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            long r6 = r8.length()     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0070
            long r4 = r9.b     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            java.lang.String r8 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            byte[] r8 = r8.getBytes()     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            r3.update(r8)     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            java.lang.String r8 = r9.a     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            byte[] r8 = r8.getBytes()     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            byte[] r8 = android.util.Base64.decode(r8, r2)     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            boolean r8 = r3.verify(r8)     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            r1.close()     // Catch:{ IOException -> 0x006e }
            goto L_0x006f
        L_0x006e:
            r9 = move-exception
        L_0x006f:
            return r8
        L_0x0070:
            r1.close()     // Catch:{ IOException -> 0x0074 }
            goto L_0x0075
        L_0x0074:
            r8 = move-exception
        L_0x0075:
            return r2
        L_0x0076:
            r3.update(r0, r2, r4)     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            int r10 = r10 + r4
            goto L_0x003f
        L_0x007c:
            r8 = move-exception
            r0 = r1
            goto L_0x0091
        L_0x007f:
            r8 = move-exception
            r0 = r1
            goto L_0x0085
        L_0x0082:
            r8 = move-exception
            goto L_0x0091
        L_0x0084:
            r8 = move-exception
        L_0x0085:
            defpackage.aaww.a((java.lang.Throwable) r8)     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x008f
            r0.close()     // Catch:{ IOException -> 0x008e }
            goto L_0x008f
        L_0x008e:
            r8 = move-exception
        L_0x008f:
            return r2
        L_0x0090:
            r8 = move-exception
        L_0x0091:
            if (r0 == 0) goto L_0x0098
            r0.close()     // Catch:{ IOException -> 0x0097 }
            goto L_0x0098
        L_0x0097:
            r9 = move-exception
        L_0x0098:
            throw r8
        L_0x0099:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aase.a(java.io.File, aasd, int):boolean");
    }

    /* access modifiers changed from: package-private */
    public final long b() {
        if (a()) {
            try {
                return new aasd(new File(this.b, "installed/metadata")).b;
            } catch (IOException e2) {
            }
        }
        return -1;
    }

    public final boolean b(File file, File file2) {
        try {
            aasd aasd = new aasd(file);
            if (aasd.b > b()) {
                return a(aasd, file2);
            }
            return false;
        } catch (Exception e2) {
            return false;
        }
    }

    static boolean a(File file, File file2) {
        return file.exists() && file2.exists();
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return a(new File(this.b, "installed/metadata"), new File(this.b, "installed/snet.jar"));
    }

    public final boolean a(aasd aasd, File file) {
        if (a(file, aasd, 2)) {
            return true;
        }
        if (!this.d) {
            return false;
        }
        boolean a2 = a(file, aasd, 1);
        if (a2) {
            new aaww(this.a, aasd.b, this.c);
            aaww.e = true;
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, String str2, String str3, String str4) {
        new File(this.b, "installed/").mkdirs();
        File file = new File(this.b, str2);
        File file2 = new File(this.b, str4);
        file.delete();
        file2.delete();
        return new File(this.b, str).renameTo(file) && new File(this.b, str3).renameTo(file2);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0061 A[SYNTHETIC, Splitter:B:29:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0068 A[SYNTHETIC, Splitter:B:33:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0073 A[SYNTHETIC, Splitter:B:40:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007a A[SYNTHETIC, Splitter:B:44:0x007a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(byte[] r9, java.lang.String r10, java.lang.String r11) {
        /*
            r8 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r8.b
            java.lang.String r2 = "download/"
            r0.<init>(r1, r2)
            r0.mkdirs()
            java.lang.String r0 = r8.b
            r1 = 1
            r2 = 4
            r3 = 0
            r4 = 0
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r9, r3, r2)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            java.nio.ByteOrder r6 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            java.nio.ByteBuffer r5 = r5.order(r6)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            int r5 = r5.getInt()     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            r7.<init>(r0, r10)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            r6.write(r9, r2, r5)     // Catch:{ Exception -> 0x0053, all -> 0x004f }
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0053, all -> 0x004f }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0053, all -> 0x004f }
            r2.<init>(r0, r11)     // Catch:{ Exception -> 0x0053, all -> 0x004f }
            r10.<init>(r2)     // Catch:{ Exception -> 0x0053, all -> 0x004f }
            int r11 = r5 + 4
            int r0 = r9.length     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            int r0 = r0 + -4
            int r0 = r0 - r5
            r10.write(r9, r11, r0)     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            r6.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x0045
        L_0x0044:
            r9 = move-exception
        L_0x0045:
            r10.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x006f
        L_0x0049:
            r9 = move-exception
            goto L_0x006f
        L_0x004b:
            r9 = move-exception
            goto L_0x0051
        L_0x004d:
            r9 = move-exception
            goto L_0x0055
        L_0x004f:
            r9 = move-exception
            r10 = r4
        L_0x0051:
            r4 = r6
            goto L_0x0071
        L_0x0053:
            r9 = move-exception
            r10 = r4
        L_0x0055:
            r4 = r6
            goto L_0x005c
        L_0x0057:
            r9 = move-exception
            r10 = r4
            goto L_0x0071
        L_0x005a:
            r9 = move-exception
            r10 = r4
        L_0x005c:
            defpackage.aaww.a((java.lang.Throwable) r9)     // Catch:{ all -> 0x0070 }
            if (r4 == 0) goto L_0x0066
            r4.close()     // Catch:{ IOException -> 0x0065 }
            goto L_0x0066
        L_0x0065:
            r9 = move-exception
        L_0x0066:
            if (r10 == 0) goto L_0x006e
            r10.close()     // Catch:{ IOException -> 0x006d }
            r1 = 0
            goto L_0x006f
        L_0x006d:
            r9 = move-exception
        L_0x006e:
            r1 = 0
        L_0x006f:
            return r1
        L_0x0070:
            r9 = move-exception
        L_0x0071:
            if (r4 == 0) goto L_0x0078
            r4.close()     // Catch:{ IOException -> 0x0077 }
            goto L_0x0078
        L_0x0077:
            r11 = move-exception
        L_0x0078:
            if (r10 == 0) goto L_0x007f
            r10.close()     // Catch:{ IOException -> 0x007e }
            goto L_0x007f
        L_0x007e:
            r10 = move-exception
        L_0x007f:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aase.a(byte[], java.lang.String, java.lang.String):boolean");
    }
}
