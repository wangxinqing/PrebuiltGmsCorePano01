package defpackage;

import android.content.Context;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: acut  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acut {
    final Context a;

    public acut(Context context) {
        this.a = context;
    }

    private final void a(int i, acus acus) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(this.a.getResources().openRawResource(i)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    acus.a(Base64.decode(readLine, 0));
                } else {
                    bufferedReader.close();
                    return;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("gsf.res", e);
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    private static final void a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
        try {
            fileOutputStream.write(bArr);
        } finally {
            fileOutputStream.close();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01bb A[Catch:{ NameNotFoundException | NotFoundException | IOException -> 0x01d1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = " new signatures"
            java.lang.String r3 = "Wrote "
            java.lang.String r4 = "SubscribedFeeds"
            boolean r0 = defpackage.jkr.b()
            if (r0 == 0) goto L_0x01dc
            azps r0 = defpackage.azps.a
            azpt r0 = r0.a()
            long r5 = r0.a()
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x01dc
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            android.content.Context r5 = r1.a     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            java.lang.String r6 = "com.google.android.gsf"
            r7 = 0
            android.content.Context r5 = r5.createPackageContext(r6, r7)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            java.io.File r5 = r5.getFilesDir()     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            java.lang.String r6 = "signatures"
            r0.<init>(r5, r6)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            r0.mkdirs()     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            azps r5 = defpackage.azps.a     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            azpt r5 = r5.a()     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            boolean r5 = r5.b()     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            android.content.Context r6 = r1.a     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            boolean r6 = defpackage.hxz.g(r6)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            acus r8 = new acus     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            r8.<init>()     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            r11 = 2131886086(0x7f120006, float:1.940674E38)
            r1.a((int) r11, (defpackage.acus) r8)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            if (r6 == 0) goto L_0x005c
            r6 = 2131886085(0x7f120005, float:1.9406739E38)
            r1.a((int) r6, (defpackage.acus) r8)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
        L_0x005c:
            r6 = 1
            if (r5 == 0) goto L_0x0060
            goto L_0x00b5
        L_0x0060:
            android.content.Context r5 = r1.a     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            hya r5 = defpackage.hya.a((android.content.Context) r5)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            android.content.Context r11 = r1.a     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            android.content.pm.PackageManager r11 = r11.getPackageManager()     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            r12 = 64
            java.util.List r11 = r11.getInstalledPackages(r12)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            if (r11 != 0) goto L_0x007a
            java.lang.String r5 = "null getInstallPackages"
            android.util.Log.e(r4, r5)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            goto L_0x00b5
        L_0x007a:
            java.util.Iterator r11 = r11.iterator()     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
        L_0x007e:
            boolean r12 = r11.hasNext()     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            if (r12 == 0) goto L_0x00b5
            java.lang.Object r12 = r11.next()     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            android.content.pm.PackageInfo r12 = (android.content.pm.PackageInfo) r12     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            android.content.pm.Signature[] r13 = r12.signatures     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            int r13 = r13.length     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            if (r13 != r6) goto L_0x007e
            android.content.pm.Signature[] r13 = r12.signatures     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            r13 = r13[r7]     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            byte[] r13 = r13.toByteArray()     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            java.util.Map r14 = r8.a     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            java.lang.String r15 = defpackage.acus.b(r13)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            java.lang.Object r14 = r14.get(r15)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            byte[] r14 = (byte[]) r14     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            if (r14 == 0) goto L_0x00ab
            boolean r14 = java.util.Arrays.equals(r13, r14)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            if (r14 != 0) goto L_0x007e
        L_0x00ab:
            boolean r12 = r5.a((android.content.pm.PackageInfo) r12)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            if (r12 == 0) goto L_0x007e
            r8.a(r13)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            goto L_0x007e
        L_0x00b5:
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            java.util.Map r11 = r8.a     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            java.util.Collection r11 = r11.values()     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            int r11 = r11.size()     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            r5[r7] = r11     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            long r11 = r11 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r11)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            r5[r6] = r9     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            java.lang.String r6 = "Collected %d certs in %dms"
            java.lang.String r5 = java.lang.String.format(r6, r5)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            android.util.Log.i(r4, r5)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            r5 = 32
            java.util.Map r6 = r8.a()     // Catch:{ all -> 0x01b7 }
            java.util.Set r6 = r6.entrySet()     // Catch:{ all -> 0x01b7 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x01b7 }
            r9 = 0
        L_0x00eb:
            boolean r10 = r6.hasNext()     // Catch:{ all -> 0x01b4 }
            if (r10 == 0) goto L_0x014e
            java.lang.Object r10 = r6.next()     // Catch:{ all -> 0x01b4 }
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ all -> 0x01b4 }
            java.lang.Object r11 = r10.getValue()     // Catch:{ all -> 0x01b4 }
            byte[] r11 = (byte[]) r11     // Catch:{ all -> 0x01b4 }
            java.io.File r12 = new java.io.File     // Catch:{ all -> 0x01b4 }
            java.lang.Object r10 = r10.getKey()     // Catch:{ all -> 0x01b4 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x01b4 }
            r12.<init>(r0, r10)     // Catch:{ all -> 0x01b4 }
            boolean r10 = r12.createNewFile()     // Catch:{ all -> 0x01b4 }
            if (r10 != 0) goto L_0x0143
            long r13 = r12.length()     // Catch:{ all -> 0x01b4 }
            int r10 = r11.length     // Catch:{ all -> 0x01b4 }
            r16 = r8
            long r7 = (long) r10     // Catch:{ all -> 0x01b4 }
            int r10 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x013f
            java.lang.String r7 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x01b4 }
            java.lang.String r8 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x01b4 }
            int r8 = r8.length()     // Catch:{ all -> 0x01b4 }
            int r8 = r8 + 44
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b4 }
            r10.<init>(r8)     // Catch:{ all -> 0x01b4 }
            java.lang.String r8 = "Signature file has wrong size, overwriting: "
            r10.append(r8)     // Catch:{ all -> 0x01b4 }
            r10.append(r7)     // Catch:{ all -> 0x01b4 }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x01b4 }
            android.util.Log.i(r4, r7)     // Catch:{ all -> 0x01b4 }
            a((java.io.File) r12, (byte[]) r11)     // Catch:{ all -> 0x01b4 }
        L_0x013f:
            r8 = r16
            r7 = 0
            goto L_0x00eb
        L_0x0143:
            r16 = r8
            a((java.io.File) r12, (byte[]) r11)     // Catch:{ all -> 0x01b4 }
            int r9 = r9 + 1
            r8 = r16
            r7 = 0
            goto L_0x00eb
        L_0x014e:
            r16 = r8
            if (r9 <= 0) goto L_0x0167
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            r6.<init>(r5)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            r6.append(r3)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            r6.append(r9)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            r6.append(r2)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            java.lang.String r2 = r6.toString()     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            android.util.Log.i(r4, r2)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
        L_0x0167:
            java.util.Map r2 = r16.a()     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            java.io.File[] r0 = r0.listFiles()     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            int r3 = r0.length     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            r7 = 0
        L_0x0171:
            if (r7 >= r3) goto L_0x01b3
            r5 = r0[r7]     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            java.lang.String r6 = r5.getName()     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            boolean r8 = r2.containsKey(r6)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            if (r8 != 0) goto L_0x01b0
            java.lang.String r8 = "sig"
            boolean r6 = r6.startsWith(r8)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            if (r6 != 0) goto L_0x0188
            goto L_0x01b0
        L_0x0188:
            boolean r6 = r5.delete()     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            if (r6 != 0) goto L_0x01b0
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            int r6 = r6.length()     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            int r6 = r6 + 15
            r8.<init>(r6)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            java.lang.String r6 = "Cannot delete: "
            r8.append(r6)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            r8.append(r5)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            java.lang.String r5 = r8.toString()     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            android.util.Log.e(r4, r5)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
        L_0x01b0:
            int r7 = r7 + 1
            goto L_0x0171
        L_0x01b3:
            return
        L_0x01b4:
            r0 = move-exception
            r7 = r9
            goto L_0x01b9
        L_0x01b7:
            r0 = move-exception
            r7 = 0
        L_0x01b9:
            if (r7 <= 0) goto L_0x01d0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            r6.<init>(r5)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            r6.append(r3)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            r6.append(r7)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            r6.append(r2)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            java.lang.String r2 = r6.toString()     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
            android.util.Log.i(r4, r2)     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
        L_0x01d0:
            throw r0     // Catch:{ IOException -> 0x01d5, NameNotFoundException -> 0x01d3, NotFoundException -> 0x01d1 }
        L_0x01d1:
            r0 = move-exception
            goto L_0x01d6
        L_0x01d3:
            r0 = move-exception
            goto L_0x01d6
        L_0x01d5:
            r0 = move-exception
        L_0x01d6:
            java.lang.String r2 = "Failed to write GSF signatures to disk!"
            android.util.Log.w(r4, r2, r0)
            return
        L_0x01dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acut.a():void");
    }
}
