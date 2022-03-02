package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: jis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jis {
    private static final String[] a = {"android.", "com.android.", "dalvik.", "java.", "javax."};
    private static int b = 0;
    private static int c = 0;

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x017b, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058 A[Catch:{ RuntimeException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00aa A[Catch:{ RuntimeException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b1 A[Catch:{ RuntimeException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c9 A[Catch:{ RuntimeException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d2 A[Catch:{ RuntimeException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e7 A[Catch:{ RuntimeException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ea A[Catch:{ RuntimeException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x017b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:54:0x0151] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0187 A[SYNTHETIC, Splitter:B:77:0x0187] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0190 A[SYNTHETIC, Splitter:B:82:0x0190] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized java.lang.String a(android.content.Context r7, java.lang.String r8, java.lang.String r9, int r10) {
        /*
            java.lang.Class<jis> r0 = defpackage.jis.class
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x019c }
            r2 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2)     // Catch:{ all -> 0x019c }
            java.lang.String r2 = "Process: "
            r1.append(r2)     // Catch:{ all -> 0x019c }
            java.lang.String r9 = defpackage.jlh.a(r9)     // Catch:{ all -> 0x019c }
            r1.append(r9)     // Catch:{ all -> 0x019c }
            java.lang.String r9 = "\nPackage: com.google.android.gms"
            r1.append(r9)     // Catch:{ all -> 0x019c }
            java.lang.String r9 = "20.12.16 (080306-{{cl}})"
            boolean r2 = defpackage.jim.a()     // Catch:{ all -> 0x019c }
            r3 = 201216073(0xbfe5049, float:9.795804E-32)
            r4 = 0
            if (r2 == 0) goto L_0x0049
            jnh r2 = defpackage.jni.b(r7)     // Catch:{ Exception -> 0x0040 }
            java.lang.String r5 = r7.getPackageName()     // Catch:{ Exception -> 0x0040 }
            android.content.pm.PackageInfo r2 = r2.b(r5, r4)     // Catch:{ Exception -> 0x0040 }
            int r3 = r2.versionCode     // Catch:{ Exception -> 0x0040 }
            java.lang.String r5 = r2.versionName     // Catch:{ Exception -> 0x003e }
            if (r5 == 0) goto L_0x003c
            java.lang.String r9 = r2.versionName     // Catch:{ Exception -> 0x003e }
            goto L_0x003d
        L_0x003c:
        L_0x003d:
            goto L_0x004a
        L_0x003e:
            r2 = move-exception
            goto L_0x0041
        L_0x0040:
            r2 = move-exception
        L_0x0041:
            java.lang.String r5 = "CrashUtils"
            java.lang.String r6 = "Error while trying to get the package information! Using static version."
            android.util.Log.w(r5, r6, r2)     // Catch:{ all -> 0x019c }
            goto L_0x004a
        L_0x0049:
        L_0x004a:
            java.lang.String r2 = " v"
            r1.append(r2)     // Catch:{ all -> 0x019c }
            r1.append(r3)     // Catch:{ all -> 0x019c }
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x019c }
            if (r2 != 0) goto L_0x0095
            java.lang.String r2 = "("
            boolean r2 = r9.contains(r2)     // Catch:{ all -> 0x019c }
            if (r2 == 0) goto L_0x0087
            java.lang.String r2 = ")"
            boolean r2 = r9.contains(r2)     // Catch:{ all -> 0x019c }
            if (r2 != 0) goto L_0x0087
            java.lang.String r2 = "-"
            boolean r2 = r9.endsWith(r2)     // Catch:{ all -> 0x019c }
            if (r2 == 0) goto L_0x007b
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x019c }
            java.lang.String r2 = "111111111"
            java.lang.String r9 = r9.concat(r2)     // Catch:{ all -> 0x019c }
            goto L_0x007c
        L_0x007b:
        L_0x007c:
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x019c }
            java.lang.String r2 = ")"
            java.lang.String r9 = r9.concat(r2)     // Catch:{ all -> 0x019c }
            goto L_0x0088
        L_0x0087:
        L_0x0088:
            java.lang.String r2 = " ("
            r1.append(r2)     // Catch:{ all -> 0x019c }
            r1.append(r9)     // Catch:{ all -> 0x019c }
            java.lang.String r9 = ")"
            r1.append(r9)     // Catch:{ all -> 0x019c }
        L_0x0095:
            java.lang.String r9 = "\nBuild: "
            r1.append(r9)     // Catch:{ all -> 0x019c }
            java.lang.String r9 = android.os.Build.FINGERPRINT     // Catch:{ all -> 0x019c }
            r1.append(r9)     // Catch:{ all -> 0x019c }
            java.lang.String r9 = "\n"
            r1.append(r9)     // Catch:{ all -> 0x019c }
            boolean r9 = android.os.Debug.isDebuggerConnected()     // Catch:{ all -> 0x019c }
            if (r9 == 0) goto L_0x00af
            java.lang.String r9 = "Debugger: Connected\n"
            r1.append(r9)     // Catch:{ all -> 0x019c }
        L_0x00af:
            if (r10 == 0) goto L_0x00be
            java.lang.String r9 = "DD-EDD: "
            r1.append(r9)     // Catch:{ all -> 0x019c }
            r1.append(r10)     // Catch:{ all -> 0x019c }
            java.lang.String r9 = "\n"
            r1.append(r9)     // Catch:{ all -> 0x019c }
        L_0x00be:
            java.lang.String r9 = "\n"
            r1.append(r9)     // Catch:{ all -> 0x019c }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x019c }
            if (r9 != 0) goto L_0x00cc
            r1.append(r8)     // Catch:{ all -> 0x019c }
        L_0x00cc:
            boolean r8 = defpackage.jim.a()     // Catch:{ all -> 0x019c }
            if (r8 == 0) goto L_0x00e7
            java.lang.String r8 = "logcat_for_system_app_crash"
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ RuntimeException -> 0x00dd }
            int r7 = android.provider.Settings.Secure.getInt(r7, r8, r4)     // Catch:{ RuntimeException -> 0x00dd }
            goto L_0x00e8
        L_0x00dd:
            r7 = move-exception
            java.lang.String r8 = "CrashUtils"
            java.lang.String r9 = "Error detecting allowed logcat lines."
            android.util.Log.e(r8, r9, r7)     // Catch:{ all -> 0x019c }
            r7 = 0
            goto L_0x00e8
        L_0x00e7:
            r7 = 0
        L_0x00e8:
            if (r7 <= 0) goto L_0x0196
            java.lang.String r8 = "\n"
            r1.append(r8)     // Catch:{ all -> 0x019c }
            r8 = 0
            java.lang.ProcessBuilder r9 = new java.lang.ProcessBuilder     // Catch:{ IOException -> 0x017d, all -> 0x017b }
            r10 = 13
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch:{ IOException -> 0x017d, all -> 0x017b }
            java.lang.String r2 = "/system/bin/logcat"
            r10[r4] = r2     // Catch:{ IOException -> 0x017d, all -> 0x017b }
            java.lang.String r2 = "-v"
            r3 = 1
            r10[r3] = r2     // Catch:{ IOException -> 0x017d, all -> 0x017b }
            r2 = 2
            java.lang.String r5 = "time"
            r10[r2] = r5     // Catch:{ IOException -> 0x017d, all -> 0x017b }
            r2 = 3
            java.lang.String r5 = "-b"
            r10[r2] = r5     // Catch:{ IOException -> 0x017d, all -> 0x017b }
            r2 = 4
            java.lang.String r5 = "events"
            r10[r2] = r5     // Catch:{ IOException -> 0x017d, all -> 0x017b }
            r2 = 5
            java.lang.String r5 = "-b"
            r10[r2] = r5     // Catch:{ IOException -> 0x017d, all -> 0x017b }
            r2 = 6
            java.lang.String r5 = "system"
            r10[r2] = r5     // Catch:{ IOException -> 0x017d, all -> 0x017b }
            r2 = 7
            java.lang.String r5 = "-b"
            r10[r2] = r5     // Catch:{ IOException -> 0x017d, all -> 0x017b }
            r2 = 8
            java.lang.String r5 = "main"
            r10[r2] = r5     // Catch:{ IOException -> 0x017d, all -> 0x017b }
            r2 = 9
            java.lang.String r5 = "-b"
            r10[r2] = r5     // Catch:{ IOException -> 0x017d, all -> 0x017b }
            r2 = 10
            java.lang.String r5 = "crash"
            r10[r2] = r5     // Catch:{ IOException -> 0x017d, all -> 0x017b }
            r2 = 11
            java.lang.String r5 = "-t"
            r10[r2] = r5     // Catch:{ IOException -> 0x017d, all -> 0x017b }
            r2 = 12
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x017d, all -> 0x017b }
            r10[r2] = r7     // Catch:{ IOException -> 0x017d, all -> 0x017b }
            r9.<init>(r10)     // Catch:{ IOException -> 0x017d, all -> 0x017b }
            java.lang.ProcessBuilder r7 = r9.redirectErrorStream(r3)     // Catch:{ IOException -> 0x017d, all -> 0x017b }
            java.lang.Process r7 = r7.start()     // Catch:{ IOException -> 0x017d, all -> 0x017b }
            java.io.OutputStream r9 = r7.getOutputStream()     // Catch:{ IOException -> 0x0150, all -> 0x017b }
            r9.close()     // Catch:{ IOException -> 0x0150, all -> 0x017b }
            goto L_0x0151
        L_0x0150:
            r9 = move-exception
        L_0x0151:
            java.io.InputStream r9 = r7.getErrorStream()     // Catch:{ IOException -> 0x0159, all -> 0x017b }
            r9.close()     // Catch:{ IOException -> 0x0159, all -> 0x017b }
            goto L_0x015a
        L_0x0159:
            r9 = move-exception
        L_0x015a:
            java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x017d, all -> 0x017b }
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ IOException -> 0x017d, all -> 0x017b }
            r9.<init>(r7)     // Catch:{ IOException -> 0x017d, all -> 0x017b }
            r7 = 8192(0x2000, float:1.14794E-41)
            char[] r7 = new char[r7]     // Catch:{ IOException -> 0x0178, all -> 0x0175 }
        L_0x0167:
            int r8 = r9.read(r7)     // Catch:{ IOException -> 0x0178, all -> 0x0175 }
            if (r8 <= 0) goto L_0x0171
            r1.append(r7, r4, r8)     // Catch:{ IOException -> 0x0178, all -> 0x0175 }
            goto L_0x0167
        L_0x0171:
            r9.close()     // Catch:{ IOException -> 0x018b }
            goto L_0x0196
        L_0x0175:
            r7 = move-exception
            r8 = r9
            goto L_0x018e
        L_0x0178:
            r7 = move-exception
            r8 = r9
            goto L_0x017e
        L_0x017b:
            r7 = move-exception
            goto L_0x018e
        L_0x017d:
            r7 = move-exception
        L_0x017e:
            java.lang.String r9 = "CrashUtils"
            java.lang.String r10 = "Error running logcat"
            android.util.Log.e(r9, r10, r7)     // Catch:{ all -> 0x018d }
            if (r8 == 0) goto L_0x0196
            r8.close()     // Catch:{ IOException -> 0x018b }
            goto L_0x0196
        L_0x018b:
            r7 = move-exception
            goto L_0x0196
        L_0x018d:
            r7 = move-exception
        L_0x018e:
            if (r8 == 0) goto L_0x0195
            r8.close()     // Catch:{ IOException -> 0x0194 }
            goto L_0x0195
        L_0x0194:
            r8 = move-exception
        L_0x0195:
            throw r7     // Catch:{ all -> 0x019c }
        L_0x0196:
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x019c }
            monitor-exit(r0)
            return r7
        L_0x019c:
            r7 = move-exception
            monitor-exit(r0)
            goto L_0x01a0
        L_0x019f:
            throw r7
        L_0x01a0:
            goto L_0x019f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jis.a(android.content.Context, java.lang.String, java.lang.String, int):java.lang.String");
    }

    public static synchronized Throwable a(Throwable th) {
        Throwable th2;
        boolean z;
        boolean z2;
        synchronized (jis.class) {
            LinkedList linkedList = new LinkedList();
            while (th != null) {
                linkedList.push(th);
                th = th.getCause();
            }
            th2 = null;
            z = false;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    String className = stackTraceElement.getClassName();
                    String fileName = stackTraceElement.getFileName();
                    if ((TextUtils.isEmpty(fileName) || !fileName.startsWith(":com.google.android.gms")) && !jim.a()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    z |= z2;
                    if (!z2 && !a(className)) {
                        stackTraceElement = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
                    }
                    arrayList.add(stackTraceElement);
                }
                if (th2 != null) {
                    th2 = new Throwable("<filtered>", th2);
                } else {
                    th2 = new Throwable("<filtered>");
                }
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        if (z) {
            return th2;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r3, java.lang.String r4, java.lang.String r5, int r6, java.lang.Throwable r7) {
        /*
            java.lang.Class<jis> r0 = defpackage.jis.class
            monitor-enter(r0)
            defpackage.iva.a((java.lang.Object) r3)     // Catch:{ all -> 0x0045 }
            boolean r1 = defpackage.jlh.d(r4)     // Catch:{ all -> 0x0045 }
            if (r1 != 0) goto L_0x0043
            int r1 = r4.hashCode()     // Catch:{ all -> 0x0045 }
            if (r7 == 0) goto L_0x0017
            int r7 = r7.hashCode()     // Catch:{ all -> 0x0045 }
            goto L_0x0019
        L_0x0017:
            int r7 = c     // Catch:{ all -> 0x0045 }
        L_0x0019:
            int r2 = b     // Catch:{ all -> 0x0045 }
            if (r2 == r1) goto L_0x001e
            goto L_0x0024
        L_0x001e:
            int r2 = c     // Catch:{ all -> 0x0045 }
            if (r2 != r7) goto L_0x0024
            monitor-exit(r0)
            return
        L_0x0024:
            b = r1     // Catch:{ all -> 0x0045 }
            c = r7     // Catch:{ all -> 0x0045 }
            java.lang.String r7 = "dropbox"
            java.lang.Object r7 = r3.getSystemService(r7)     // Catch:{ all -> 0x0045 }
            android.os.DropBoxManager r7 = (android.os.DropBoxManager) r7     // Catch:{ all -> 0x0045 }
            if (r7 == 0) goto L_0x0043
            java.lang.String r1 = "system_app_crash"
            boolean r1 = r7.isTagEnabled(r1)     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0043
            java.lang.String r1 = "system_app_crash"
            java.lang.String r3 = a(r3, r4, r5, r6)     // Catch:{ all -> 0x0045 }
            r7.addText(r1, r3)     // Catch:{ all -> 0x0045 }
        L_0x0043:
            monitor-exit(r0)
            return
        L_0x0045:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jis.a(android.content.Context, java.lang.String, java.lang.String, int, java.lang.Throwable):void");
    }

    public static void a(Context context, Throwable th) {
        a(context, th, 536870912);
    }

    public static void a(Context context, Throwable th, int i) {
        try {
            iva.a((Object) context);
            iva.a((Object) th);
            if (!jim.a()) {
                th = a(th);
                if (th == null) {
                    return;
                }
            }
            a(context, Log.getStackTraceString(th), jkt.a(), i, th);
        } catch (Exception e) {
            try {
                if (jim.a()) {
                    throw e;
                }
            } catch (Exception e2) {
                Log.e("CrashUtils", "Error determining which process we're running in!", e2);
            }
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }

    public static boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String startsWith : a) {
                if (str.startsWith(startsWith)) {
                    return true;
                }
            }
        }
        return false;
    }
}
