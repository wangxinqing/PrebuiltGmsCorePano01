package defpackage;

import com.google.android.gms.ads.identifier.c;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: dls  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dls extends dma {
    public static boolean a;
    private c b;
    private final dpw c;
    private String e;
    private boolean f = false;
    private final Object g = new Object();

    public dls(dmd dmd) {
        super(dmd);
        this.c = new dpw(dmd.c);
    }

    private static String a(String str) {
        MessageDigest c2 = dpx.c("MD5");
        if (c2 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, c2.digest(str.getBytes()))});
    }

    private final boolean f(String str) {
        try {
            String a2 = a(str);
            b("Storing hashed adid.");
            FileOutputStream openFileOutput = d().openFileOutput("gaClientIdData", 0);
            openFileOutput.write(a2.getBytes());
            openFileOutput.close();
            this.e = a2;
            return true;
        } catch (IOException e2) {
            e("Error creating hash file", e2);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:94:0x0175 A[Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x0094 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.ads.identifier.c b() {
        /*
            r11 = this;
            monitor-enter(r11)
            dpw r0 = r11.c     // Catch:{ all -> 0x0191 }
            r1 = 1000(0x3e8, double:4.94E-321)
            boolean r0 = r0.a(r1)     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x018d
            dpw r0 = r11.c     // Catch:{ all -> 0x0191 }
            r0.a()     // Catch:{ all -> 0x0191 }
            r0 = 1
            r1 = 0
            android.content.Context r2 = r11.d()     // Catch:{ IllegalStateException -> 0x002b, Exception -> 0x001b }
            com.google.android.gms.ads.identifier.c r2 = com.google.android.gms.ads.identifier.d.a((android.content.Context) r2)     // Catch:{ IllegalStateException -> 0x002b, Exception -> 0x001b }
            goto L_0x0032
        L_0x001b:
            r2 = move-exception
            boolean r3 = a     // Catch:{ all -> 0x0191 }
            if (r3 != 0) goto L_0x0029
            a = r0     // Catch:{ all -> 0x0191 }
            java.lang.String r3 = "Error getting advertiser id"
            r11.d(r3, r2)     // Catch:{ all -> 0x0191 }
            r2 = r1
            goto L_0x0032
        L_0x0029:
            r2 = r1
            goto L_0x0032
        L_0x002b:
            r2 = move-exception
            java.lang.String r2 = "IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details."
            r11.d(r2)     // Catch:{ all -> 0x0191 }
            r2 = r1
        L_0x0032:
            com.google.android.gms.ads.identifier.c r3 = r11.b     // Catch:{ all -> 0x0191 }
            if (r2 == 0) goto L_0x0039
            java.lang.String r4 = r2.a     // Catch:{ all -> 0x0191 }
            goto L_0x003a
        L_0x0039:
            r4 = r1
        L_0x003a:
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0191 }
            if (r5 != 0) goto L_0x018b
            dmv r5 = r11.m()     // Catch:{ all -> 0x0191 }
            java.lang.String r5 = r5.b()     // Catch:{ all -> 0x0191 }
            java.lang.Object r6 = r11.g     // Catch:{ all -> 0x0191 }
            monitor-enter(r6)     // Catch:{ all -> 0x0191 }
            boolean r7 = r11.f     // Catch:{ all -> 0x0188 }
            r8 = 0
            if (r7 != 0) goto L_0x00ac
            android.content.Context r3 = r11.d()     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x0094 }
            java.lang.String r7 = "gaClientIdData"
            java.io.FileInputStream r3 = r3.openFileInput(r7)     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x0094 }
            r7 = 128(0x80, float:1.794E-43)
            byte[] r9 = new byte[r7]     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x0094 }
            int r7 = r3.read(r9, r8, r7)     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x0094 }
            int r10 = r3.available()     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x0094 }
            if (r10 <= 0) goto L_0x007b
            java.lang.String r7 = "Hash file seems corrupted, deleting it."
            r11.d(r7)     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x0094 }
            r3.close()     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x0094 }
            android.content.Context r3 = r11.d()     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x0094 }
            java.lang.String r7 = "gaClientIdData"
            r3.deleteFile(r7)     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x0094 }
            r10 = r1
            goto L_0x00a7
        L_0x007b:
            if (r7 > 0) goto L_0x0087
            java.lang.String r7 = "Hash file is empty."
            r11.b(r7)     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x0094 }
            r3.close()     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x0094 }
            r10 = r1
            goto L_0x00a7
        L_0x0087:
            java.lang.String r10 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x0094 }
            r10.<init>(r9, r8, r7)     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x0094 }
            r3.close()     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0090 }
            goto L_0x00a7
        L_0x0090:
            r3 = move-exception
            goto L_0x0096
        L_0x0092:
            r3 = move-exception
            goto L_0x00a7
        L_0x0094:
            r3 = move-exception
            r10 = r1
        L_0x0096:
            java.lang.String r7 = "Error reading Hash file, deleting it"
            r11.d(r7, r3)     // Catch:{ all -> 0x0188 }
            android.content.Context r3 = r11.d()     // Catch:{ all -> 0x0188 }
            java.lang.String r7 = "gaClientIdData"
            r3.deleteFile(r7)     // Catch:{ all -> 0x0188 }
            goto L_0x00a7
        L_0x00a5:
            r3 = move-exception
            r10 = r1
        L_0x00a7:
            r11.e = r10     // Catch:{ all -> 0x0188 }
            r11.f = r0     // Catch:{ all -> 0x0188 }
            goto L_0x00fa
        L_0x00ac:
            java.lang.String r0 = r11.e     // Catch:{ all -> 0x0188 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0188 }
            if (r0 == 0) goto L_0x00fa
            if (r3 == 0) goto L_0x00b9
            java.lang.String r0 = r3.a     // Catch:{ all -> 0x0188 }
            goto L_0x00ba
        L_0x00b9:
            r0 = r1
        L_0x00ba:
            if (r0 == 0) goto L_0x00db
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0188 }
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0188 }
            int r7 = r3.length()     // Catch:{ all -> 0x0188 }
            if (r7 != 0) goto L_0x00d0
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0188 }
            r3.<init>(r0)     // Catch:{ all -> 0x0188 }
            goto L_0x00d4
        L_0x00d0:
            java.lang.String r3 = r0.concat(r3)     // Catch:{ all -> 0x0188 }
        L_0x00d4:
            java.lang.String r0 = a(r3)     // Catch:{ all -> 0x0188 }
            r11.e = r0     // Catch:{ all -> 0x0188 }
            goto L_0x00fa
        L_0x00db:
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0188 }
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0188 }
            int r3 = r1.length()     // Catch:{ all -> 0x0188 }
            if (r3 != 0) goto L_0x00ef
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0188 }
            r1.<init>(r0)     // Catch:{ all -> 0x0188 }
            goto L_0x00f3
        L_0x00ef:
            java.lang.String r1 = r0.concat(r1)     // Catch:{ all -> 0x0188 }
        L_0x00f3:
            boolean r0 = r11.f(r1)     // Catch:{ all -> 0x0188 }
            monitor-exit(r6)     // Catch:{ all -> 0x0188 }
            goto L_0x0173
        L_0x00fa:
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0188 }
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0188 }
            int r7 = r3.length()     // Catch:{ all -> 0x0188 }
            if (r7 != 0) goto L_0x010e
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0188 }
            r3.<init>(r0)     // Catch:{ all -> 0x0188 }
            goto L_0x0112
        L_0x010e:
            java.lang.String r3 = r0.concat(r3)     // Catch:{ all -> 0x0188 }
        L_0x0112:
            java.lang.String r0 = a(r3)     // Catch:{ all -> 0x0188 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0188 }
            if (r3 != 0) goto L_0x0178
            java.lang.String r3 = r11.e     // Catch:{ all -> 0x0188 }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0188 }
            if (r0 != 0) goto L_0x0176
            java.lang.String r0 = r11.e     // Catch:{ all -> 0x0188 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0188 }
            if (r0 != 0) goto L_0x0155
            java.lang.String r0 = "Resetting the client id because Advertising Id changed."
            r11.b(r0)     // Catch:{ all -> 0x0188 }
            dmv r0 = r11.m()     // Catch:{ all -> 0x0188 }
            monitor-enter(r0)     // Catch:{ all -> 0x0188 }
            r0.a = r1     // Catch:{ all -> 0x0152 }
            dkw r1 = r0.g()     // Catch:{ all -> 0x0152 }
            dmu r3 = new dmu     // Catch:{ all -> 0x0152 }
            r3.<init>(r0)     // Catch:{ all -> 0x0152 }
            java.util.concurrent.Future r1 = r1.a((java.util.concurrent.Callable) r3)     // Catch:{ all -> 0x0152 }
            r0.b = r1     // Catch:{ all -> 0x0152 }
            monitor-exit(r0)     // Catch:{ all -> 0x0152 }
            java.lang.String r5 = r0.b()     // Catch:{ all -> 0x0188 }
            java.lang.String r0 = "New client Id"
            r11.a(r0, r5)     // Catch:{ all -> 0x0188 }
            goto L_0x0156
        L_0x0152:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0152 }
            throw r1     // Catch:{ all -> 0x0188 }
        L_0x0155:
        L_0x0156:
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0188 }
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0188 }
            int r3 = r1.length()     // Catch:{ all -> 0x0188 }
            if (r3 != 0) goto L_0x016a
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0188 }
            r1.<init>(r0)     // Catch:{ all -> 0x0188 }
            goto L_0x016e
        L_0x016a:
            java.lang.String r1 = r0.concat(r1)     // Catch:{ all -> 0x0188 }
        L_0x016e:
            boolean r0 = r11.f(r1)     // Catch:{ all -> 0x0188 }
            monitor-exit(r6)     // Catch:{ all -> 0x0188 }
        L_0x0173:
            if (r0 != 0) goto L_0x018b
            goto L_0x0179
        L_0x0176:
            monitor-exit(r6)     // Catch:{ all -> 0x0188 }
            goto L_0x018b
        L_0x0178:
            monitor-exit(r6)     // Catch:{ all -> 0x0188 }
        L_0x0179:
            java.lang.String r0 = "Failed to reset client id on adid change. Not using adid"
            r11.e(r0)     // Catch:{ all -> 0x0191 }
            com.google.android.gms.ads.identifier.c r0 = new com.google.android.gms.ads.identifier.c     // Catch:{ all -> 0x0191 }
            java.lang.String r1 = ""
            r0.<init>(r1, r8)     // Catch:{ all -> 0x0191 }
            r11.b = r0     // Catch:{ all -> 0x0191 }
            goto L_0x018d
        L_0x0188:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0188 }
            throw r0     // Catch:{ all -> 0x0191 }
        L_0x018b:
            r11.b = r2     // Catch:{ all -> 0x0191 }
        L_0x018d:
            com.google.android.gms.ads.identifier.c r0 = r11.b     // Catch:{ all -> 0x0191 }
            monitor-exit(r11)
            return r0
        L_0x0191:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dls.b():com.google.android.gms.ads.identifier.c");
    }
}
