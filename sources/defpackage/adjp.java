package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import java.io.File;

/* renamed from: adjp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adjp extends AsyncTask {
    private final Context a;
    private File b;
    private acrz c;

    public adjp(Context context) {
        this.a = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.Map a(java.io.File r7) {
        /*
            r0 = 0
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch:{ ZipException -> 0x0063, all -> 0x0061 }
            r1.<init>(r7)     // Catch:{ ZipException -> 0x0063, all -> 0x0061 }
            java.lang.String r7 = "META-INF/com/android/metadata"
            java.util.zip.ZipEntry r7 = r1.getEntry(r7)     // Catch:{ ZipException -> 0x005f, all -> 0x005c }
            if (r7 == 0) goto L_0x0058
            java.io.InputStream r7 = r1.getInputStream(r7)     // Catch:{ ZipException -> 0x005f, all -> 0x005c }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ ZipException -> 0x005f, all -> 0x005c }
            r2.<init>()     // Catch:{ ZipException -> 0x005f, all -> 0x005c }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ ZipException -> 0x005f, all -> 0x005c }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ ZipException -> 0x005f, all -> 0x005c }
            r4.<init>(r7)     // Catch:{ ZipException -> 0x005f, all -> 0x005c }
            r3.<init>(r4)     // Catch:{ ZipException -> 0x005f, all -> 0x005c }
        L_0x0021:
            java.lang.String r7 = r3.readLine()     // Catch:{ ZipException -> 0x005f, all -> 0x005c }
            if (r7 == 0) goto L_0x0051
            int r4 = r7.length()     // Catch:{ ZipException -> 0x005f, all -> 0x005c }
            if (r4 == 0) goto L_0x0021
            r4 = 0
            char r5 = r7.charAt(r4)     // Catch:{ ZipException -> 0x005f, all -> 0x005c }
            r6 = 35
            if (r5 == r6) goto L_0x0021
            java.lang.String r5 = "="
            r6 = 2
            java.lang.String[] r7 = r7.split(r5, r6)     // Catch:{ ZipException -> 0x005f, all -> 0x005c }
            int r5 = r7.length     // Catch:{ ZipException -> 0x005f, all -> 0x005c }
            if (r5 != r6) goto L_0x0049
            r4 = r7[r4]     // Catch:{ ZipException -> 0x005f, all -> 0x005c }
            r5 = 1
            r7 = r7[r5]     // Catch:{ ZipException -> 0x005f, all -> 0x005c }
            r2.put(r4, r7)     // Catch:{ ZipException -> 0x005f, all -> 0x005c }
            goto L_0x0021
        L_0x0049:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ ZipException -> 0x005f, all -> 0x005c }
            java.lang.String r2 = "bad key-value pair line"
            r7.<init>(r2)     // Catch:{ ZipException -> 0x005f, all -> 0x005c }
            throw r7     // Catch:{ ZipException -> 0x005f, all -> 0x005c }
        L_0x0051:
            r3.close()     // Catch:{ ZipException -> 0x005f, all -> 0x005c }
            r1.close()
            return r2
        L_0x0058:
            r1.close()
            return r0
        L_0x005c:
            r7 = move-exception
            r0 = r1
            goto L_0x0074
        L_0x005f:
            r7 = move-exception
            goto L_0x0065
        L_0x0061:
            r7 = move-exception
            goto L_0x0074
        L_0x0063:
            r7 = move-exception
            r1 = r0
        L_0x0065:
            java.lang.String r2 = "UpdateFromSdCardVerifierTask"
            java.lang.String r3 = "cannot read zip file"
            android.util.Log.w(r2, r3, r7)     // Catch:{ all -> 0x0072 }
            if (r1 == 0) goto L_0x0071
            r1.close()
        L_0x0071:
            return r0
        L_0x0072:
            r7 = move-exception
            r0 = r1
        L_0x0074:
            if (r0 == 0) goto L_0x0079
            r0.close()
        L_0x0079:
            goto L_0x007b
        L_0x007a:
            throw r7
        L_0x007b:
            goto L_0x007a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adjp.a(java.io.File):java.util.Map");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d2 A[SYNTHETIC, Splitter:B:41:0x00d2] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d7 A[Catch:{ IOException -> 0x00e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00dc A[Catch:{ IOException -> 0x00e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e3 A[Catch:{ IOException -> 0x00e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00eb A[Catch:{ IOException -> 0x00e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f8 A[Catch:{ all -> 0x0283, IOException -> 0x02b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ff A[Catch:{ all -> 0x0283, IOException -> 0x02b8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r20) {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r2 = "verification of "
            java.lang.String r0 = "copy_of_update_file.zip"
            java.lang.String r3 = "post-timestamp"
            java.lang.String r4 = "pre-build"
            java.lang.String r5 = "pre-device"
            java.lang.String r6 = "UpdateFromSdCardVerifierTask"
            r7 = r20
            java.lang.String[] r7 = (java.lang.String[]) r7
            r8 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)
            r10 = r7[r8]
            java.lang.String r10 = java.lang.String.valueOf(r10)
            int r11 = r10.length()
            java.lang.String r12 = "running verify task for: "
            if (r11 != 0) goto L_0x002b
            java.lang.String r10 = new java.lang.String
            r10.<init>(r12)
            goto L_0x002e
        L_0x002b:
            r12.concat(r10)
        L_0x002e:
            java.io.File r10 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r10 = r10.getAbsolutePath()     // Catch:{ IOException -> 0x02b8 }
            r7 = r7[r8]     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r11 = java.lang.String.valueOf(r10)     // Catch:{ IOException -> 0x02b8 }
            int r11 = r11.length()     // Catch:{ IOException -> 0x02b8 }
            r12 = 1
            int r11 = r11 + r12
            java.lang.String r13 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x02b8 }
            int r13 = r13.length()     // Catch:{ IOException -> 0x02b8 }
            int r11 = r11 + r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02b8 }
            r13.<init>(r11)     // Catch:{ IOException -> 0x02b8 }
            r13.append(r10)     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r10 = "/"
            r13.append(r10)     // Catch:{ IOException -> 0x02b8 }
            r13.append(r7)     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r7 = r13.toString()     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r10 = "Verify file at path: "
            java.lang.String r11 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x02b8 }
            int r13 = r11.length()     // Catch:{ IOException -> 0x02b8 }
            if (r13 != 0) goto L_0x0071
            java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x02b8 }
            r11.<init>(r10)     // Catch:{ IOException -> 0x02b8 }
            goto L_0x0074
        L_0x0071:
            r10.concat(r11)     // Catch:{ IOException -> 0x02b8 }
        L_0x0074:
            java.io.File r10 = new java.io.File     // Catch:{ IOException -> 0x02b8 }
            r10.<init>(r7)     // Catch:{ IOException -> 0x02b8 }
            r7 = 0
            android.content.Context r11 = r1.a     // Catch:{ IOException -> 0x00c8, all -> 0x00c4 }
            java.lang.String r13 = "download"
            java.io.File r11 = r11.getDir(r13, r8)     // Catch:{ IOException -> 0x00c8, all -> 0x00c4 }
            java.io.File r13 = new java.io.File     // Catch:{ IOException -> 0x00c8, all -> 0x00c4 }
            r13.<init>(r11, r0)     // Catch:{ IOException -> 0x00c8, all -> 0x00c4 }
            boolean r14 = r13.exists()     // Catch:{ IOException -> 0x00c8, all -> 0x00c4 }
            if (r14 == 0) goto L_0x0096
            r13.delete()     // Catch:{ IOException -> 0x00c8, all -> 0x00c4 }
            java.io.File r13 = new java.io.File     // Catch:{ IOException -> 0x00c8, all -> 0x00c4 }
            r13.<init>(r11, r0)     // Catch:{ IOException -> 0x00c8, all -> 0x00c4 }
            goto L_0x0097
        L_0x0096:
        L_0x0097:
            r13.createNewFile()     // Catch:{ IOException -> 0x00c8, all -> 0x00c4 }
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00c8, all -> 0x00c4 }
            r11.<init>(r10)     // Catch:{ IOException -> 0x00c8, all -> 0x00c4 }
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00c1, all -> 0x00be }
            r10.<init>(r13)     // Catch:{ IOException -> 0x00c1, all -> 0x00be }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x00bc, all -> 0x00ba }
        L_0x00a8:
            int r14 = r11.read(r0)     // Catch:{ IOException -> 0x00bc, all -> 0x00ba }
            if (r14 > 0) goto L_0x00b5
            r11.close()     // Catch:{ IOException -> 0x00e7 }
            r10.close()     // Catch:{ IOException -> 0x00e7 }
            goto L_0x00dd
        L_0x00b5:
            r10.write(r0, r8, r14)     // Catch:{ IOException -> 0x00bc, all -> 0x00ba }
            goto L_0x00a8
        L_0x00ba:
            r0 = move-exception
            goto L_0x00e1
        L_0x00bc:
            r0 = move-exception
            goto L_0x00cb
        L_0x00be:
            r0 = move-exception
            r10 = r7
            goto L_0x00e1
        L_0x00c1:
            r0 = move-exception
            r10 = r7
            goto L_0x00cb
        L_0x00c4:
            r0 = move-exception
            r10 = r7
            r11 = r10
            goto L_0x00e1
        L_0x00c8:
            r0 = move-exception
            r10 = r7
            r11 = r10
        L_0x00cb:
            java.lang.String r8 = "Exception while copying file over to data."
            android.util.Log.e(r6, r8, r0)     // Catch:{ all -> 0x00e0 }
            if (r11 == 0) goto L_0x00d5
            r11.close()     // Catch:{ IOException -> 0x00e7 }
        L_0x00d5:
            if (r10 == 0) goto L_0x00dc
            r10.close()     // Catch:{ IOException -> 0x00e7 }
            r13 = r7
            goto L_0x00dd
        L_0x00dc:
            r13 = r7
        L_0x00dd:
            r1.b = r13     // Catch:{ IOException -> 0x00e7 }
            goto L_0x00f4
        L_0x00e0:
            r0 = move-exception
        L_0x00e1:
            if (r11 == 0) goto L_0x00e9
            r11.close()     // Catch:{ IOException -> 0x00e7 }
            goto L_0x00e9
        L_0x00e7:
            r0 = move-exception
            goto L_0x00ef
        L_0x00e9:
            if (r10 == 0) goto L_0x00ee
            r10.close()     // Catch:{ IOException -> 0x00e7 }
        L_0x00ee:
            throw r0     // Catch:{ IOException -> 0x00e7 }
        L_0x00ef:
            java.lang.String r8 = "Caught exception while copying update file."
            android.util.Log.e(r6, r8, r0)     // Catch:{ IOException -> 0x02b8 }
        L_0x00f4:
            java.io.File r0 = r1.b     // Catch:{ IOException -> 0x02b8 }
            if (r0 != 0) goto L_0x00ff
            java.lang.String r0 = "Verify failed because we were not able to copy the file."
            android.util.Log.e(r6, r0)     // Catch:{ IOException -> 0x02b8 }
            goto L_0x02bf
        L_0x00ff:
            java.util.Map r8 = a(r0)     // Catch:{ IOException -> 0x02b8 }
            if (r8 == 0) goto L_0x02b6
            boolean r0 = r8.containsKey(r5)     // Catch:{ IOException -> 0x02b8 }
            if (r0 == 0) goto L_0x0162
            java.lang.Object r0 = r8.get(r5)     // Catch:{ IOException -> 0x02b8 }
            if (r0 == 0) goto L_0x0162
            java.lang.Object r0 = r8.get(r5)     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x02b8 }
            boolean r0 = r0.isEmpty()     // Catch:{ IOException -> 0x02b8 }
            if (r0 != 0) goto L_0x0162
            java.lang.String r0 = android.os.Build.DEVICE     // Catch:{ IOException -> 0x02b8 }
            java.lang.Object r10 = r8.get(r5)     // Catch:{ IOException -> 0x02b8 }
            boolean r0 = r0.equals(r10)     // Catch:{ IOException -> 0x02b8 }
            if (r0 != 0) goto L_0x0162
            java.lang.Object r0 = r8.get(r5)     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r2 = android.os.Build.DEVICE     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x02b8 }
            int r3 = r3.length()     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x02b8 }
            int r4 = r4.length()     // Catch:{ IOException -> 0x02b8 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02b8 }
            int r3 = r3 + 67
            int r3 = r3 + r4
            r5.<init>(r3)     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r3 = "Verification failure: device does not match. Pre-device: "
            r5.append(r3)     // Catch:{ IOException -> 0x02b8 }
            r5.append(r0)     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r0 = ", device: "
            r5.append(r0)     // Catch:{ IOException -> 0x02b8 }
            r5.append(r2)     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r0 = r5.toString()     // Catch:{ IOException -> 0x02b8 }
            android.util.Log.w(r6, r0)     // Catch:{ IOException -> 0x02b8 }
            goto L_0x02b6
        L_0x0162:
            boolean r0 = r8.containsKey(r4)     // Catch:{ IOException -> 0x02b8 }
            if (r0 == 0) goto L_0x01c0
            java.lang.Object r0 = r8.get(r4)     // Catch:{ IOException -> 0x02b8 }
            if (r0 == 0) goto L_0x01c0
            java.lang.Object r0 = r8.get(r4)     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x02b8 }
            boolean r0 = r0.isEmpty()     // Catch:{ IOException -> 0x02b8 }
            if (r0 != 0) goto L_0x01c0
            java.lang.String r0 = android.os.Build.FINGERPRINT     // Catch:{ IOException -> 0x02b8 }
            java.lang.Object r5 = r8.get(r4)     // Catch:{ IOException -> 0x02b8 }
            boolean r0 = r0.equals(r5)     // Catch:{ IOException -> 0x02b8 }
            if (r0 != 0) goto L_0x01c0
            java.lang.Object r0 = r8.get(r4)     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r2 = android.os.Build.FINGERPRINT     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x02b8 }
            int r3 = r3.length()     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x02b8 }
            int r4 = r4.length()     // Catch:{ IOException -> 0x02b8 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02b8 }
            int r3 = r3 + 86
            int r3 = r3 + r4
            r5.<init>(r3)     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r3 = "Verification failure: fingerprint does not match. Pre-build: "
            r5.append(r3)     // Catch:{ IOException -> 0x02b8 }
            r5.append(r0)     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r0 = ", fingerprint on device: "
            r5.append(r0)     // Catch:{ IOException -> 0x02b8 }
            r5.append(r2)     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r0 = r5.toString()     // Catch:{ IOException -> 0x02b8 }
            android.util.Log.w(r6, r0)     // Catch:{ IOException -> 0x02b8 }
            goto L_0x02b6
        L_0x01c0:
            boolean r0 = r8.containsKey(r3)     // Catch:{ IOException -> 0x02b8 }
            if (r0 != 0) goto L_0x01c8
            goto L_0x022f
        L_0x01c8:
            java.lang.Object r0 = r8.get(r3)     // Catch:{ IOException -> 0x02b8 }
            if (r0 == 0) goto L_0x022f
            java.lang.Object r0 = r8.get(r3)     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x02b8 }
            boolean r0 = r0.isEmpty()     // Catch:{ IOException -> 0x02b8 }
            if (r0 != 0) goto L_0x022f
            java.lang.Object r0 = r8.get(r3)     // Catch:{ NumberFormatException -> 0x020d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x020d }
            long r3 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x020d }
            long r10 = android.os.Build.TIME     // Catch:{ IOException -> 0x02b8 }
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x022f
            long r7 = android.os.Build.TIME     // Catch:{ IOException -> 0x02b8 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02b8 }
            r2 = 116(0x74, float:1.63E-43)
            r0.<init>(r2)     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r2 = "Verification failure: older build. Update timestamp: "
            r0.append(r2)     // Catch:{ IOException -> 0x02b8 }
            r0.append(r3)     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r2 = ", timestamp on device: "
            r0.append(r2)     // Catch:{ IOException -> 0x02b8 }
            r0.append(r7)     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x02b8 }
            android.util.Log.w(r6, r0)     // Catch:{ IOException -> 0x02b8 }
            goto L_0x02b6
        L_0x020d:
            r0 = move-exception
            java.lang.String r0 = "Bad timestamp format: "
            java.lang.Object r2 = r8.get(r3)     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x02b8 }
            int r3 = r2.length()     // Catch:{ IOException -> 0x02b8 }
            if (r3 != 0) goto L_0x0226
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x02b8 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x02b8 }
            goto L_0x022a
        L_0x0226:
            java.lang.String r2 = r0.concat(r2)     // Catch:{ IOException -> 0x02b8 }
        L_0x022a:
            android.util.Log.w(r6, r2)     // Catch:{ IOException -> 0x02b8 }
            goto L_0x02b6
        L_0x022f:
            r0 = 10
            android.os.Process.setThreadPriority(r0)     // Catch:{ IOException -> 0x02b8 }
            acrz r0 = r1.c     // Catch:{ IOException -> 0x02b8 }
            if (r0 != 0) goto L_0x0249
            acrz r0 = new acrz     // Catch:{ IOException -> 0x02b8 }
            android.content.Context r14 = r1.a     // Catch:{ IOException -> 0x02b8 }
            r15 = 1
            java.lang.String r16 = "UpdateFromSdCardVerifierTask"
            r17 = 0
            java.lang.String r18 = "com.google.android.gms"
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x02b8 }
            r1.c = r0     // Catch:{ IOException -> 0x02b8 }
        L_0x0249:
            acrz r3 = r1.c     // Catch:{ IOException -> 0x02b8 }
            r3.b()     // Catch:{ IOException -> 0x02b8 }
            java.io.File r0 = r1.b     // Catch:{ Exception -> 0x0285 }
            android.os.RecoverySystem.verifyPackage(r0, r7, r7)     // Catch:{ Exception -> 0x0285 }
            java.io.File r0 = r1.b     // Catch:{ Exception -> 0x0285 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0285 }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0285 }
            int r4 = r4.length()     // Catch:{ Exception -> 0x0285 }
            int r4 = r4 + 27
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0285 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0285 }
            r5.append(r2)     // Catch:{ Exception -> 0x0285 }
            r5.append(r0)     // Catch:{ Exception -> 0x0285 }
            java.lang.String r0 = " succeeded."
            r5.append(r0)     // Catch:{ Exception -> 0x0285 }
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x0285 }
            android.util.Log.i(r6, r0)     // Catch:{ Exception -> 0x0285 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)     // Catch:{ Exception -> 0x0285 }
            r3.c()     // Catch:{ IOException -> 0x02b8 }
            r9 = r0
            goto L_0x02bf
        L_0x0283:
            r0 = move-exception
            goto L_0x02b2
        L_0x0285:
            r0 = move-exception
            java.io.File r4 = r1.b     // Catch:{ all -> 0x0283 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0283 }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0283 }
            int r5 = r5.length()     // Catch:{ all -> 0x0283 }
            int r5 = r5 + 24
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0283 }
            r7.<init>(r5)     // Catch:{ all -> 0x0283 }
            r7.append(r2)     // Catch:{ all -> 0x0283 }
            r7.append(r4)     // Catch:{ all -> 0x0283 }
            java.lang.String r2 = " failed."
            r7.append(r2)     // Catch:{ all -> 0x0283 }
            java.lang.String r2 = r7.toString()     // Catch:{ all -> 0x0283 }
            android.util.Log.e(r6, r2, r0)     // Catch:{ all -> 0x0283 }
            r3.c()     // Catch:{ IOException -> 0x02b8 }
            goto L_0x02bf
        L_0x02b2:
            r3.c()     // Catch:{ IOException -> 0x02b8 }
            throw r0     // Catch:{ IOException -> 0x02b8 }
        L_0x02b6:
            goto L_0x02bf
        L_0x02b8:
            r0 = move-exception
            java.lang.String r2 = "IOException in VerifyTask"
            android.util.Log.w(r6, r2, r0)
        L_0x02bf:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adjp.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        File file;
        Boolean bool = (Boolean) obj;
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.update.UpdateFromSdCard.VERIFIER_RESULT_CHANGED");
        intent.putExtra("verifier_task_result", bool);
        adjl.a(this.a, intent);
        try {
            if (!bool.booleanValue() && (file = this.b) != null && file.exists()) {
                this.b.delete();
            }
        } catch (Exception e) {
            Log.e("UpdateFromSdCardVerifierTask", "Failed to delete the copy of the update file.", e);
        }
    }
}
