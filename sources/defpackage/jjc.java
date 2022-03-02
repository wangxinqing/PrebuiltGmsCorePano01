package defpackage;

import android.os.Build;
import android.os.Process;
import android.system.Os;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

/* renamed from: jjc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jjc {
    private static FileLock a(RandomAccessFile randomAccessFile) {
        int i = 0;
        while (true) {
            try {
                return randomAccessFile.getChannel().lock();
            } catch (OverlappingFileLockException e) {
                if (i == 3) {
                    return null;
                }
                i++;
                try {
                    Thread.sleep(awxs.a.a().B());
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    return null;
                }
            }
        }
    }

    public static void a() {
        String a = jkt.a();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 29);
        sb.append("=== Listing open FDs for ");
        sb.append(a);
        sb.append(" ===");
        Log.i("CommonFileUtils", sb.toString());
        int myPid = Process.myPid();
        StringBuilder sb2 = new StringBuilder(21);
        sb2.append("/proc/");
        sb2.append(myPid);
        sb2.append("/fd/");
        String sb3 = sb2.toString();
        int i = 0;
        int i2 = 0;
        while (i < 1024) {
            try {
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb3).length() + 11);
                sb4.append(sb3);
                sb4.append(i);
                File file = new File(sb4.toString());
                if (!file.exists()) {
                    i++;
                } else {
                    int i3 = Build.VERSION.SDK_INT;
                    String readlink = Os.readlink(file.getAbsolutePath());
                    StringBuilder sb5 = new StringBuilder(String.valueOf(readlink).length() + 15);
                    sb5.append(i);
                    sb5.append(" -> ");
                    sb5.append(readlink);
                    Log.i("CommonFileUtils", sb5.toString());
                    i2++;
                    i++;
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf).length() + 15);
                sb6.append(i);
                sb6.append(" -> ");
                sb6.append(valueOf);
                Log.w("CommonFileUtils", sb6.toString());
            }
        }
        StringBuilder sb7 = new StringBuilder(29);
        sb7.append("Listed ");
        sb7.append(i2);
        sb7.append(" open files");
        Log.i("CommonFileUtils", sb7.toString());
    }

    public static void a(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file);
            jjt.a(inputStream, fileOutputStream);
            fileOutputStream.close();
            jjt.a((Closeable) inputStream);
        } catch (IOException e) {
            file.delete();
            throw e;
        } catch (Throwable th) {
            jjt.a((Closeable) inputStream);
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.nio.channels.FileLock} */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0249, code lost:
        if (r9 != false) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02d1, code lost:
        r2 = r0;
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02d5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02d6, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        r7.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0310, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        r0 = java.lang.String.valueOf(r0);
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r3.append("Failed to release file lock: ");
        r3.append(r0);
        android.util.Log.w("CommonFileUtils", r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        r5.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0346, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:?, code lost:
        r0 = java.lang.String.valueOf(r0);
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r4.append("Failed to release file lock: ");
        r4.append(r0);
        android.util.Log.w("CommonFileUtils", r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ac, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01bc, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bd, code lost:
        r21 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c5, code lost:
        r0 = java.lang.String.valueOf(r0);
        r19 = r11;
        r11 = new java.lang.StringBuilder((java.lang.String.valueOf(r2).length() + 41) + java.lang.String.valueOf(r0).length());
        r11.append("Failed to reset executable bits on dir ");
        r11.append(r2);
        r11.append(": ");
        r11.append(r0);
        android.util.Log.w("CommonFileUtils", r11.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ff, code lost:
        throw ((java.lang.RuntimeException) r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02d0 A[ExcHandler: all (r0v19 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:32:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x030c A[SYNTHETIC, Splitter:B:142:0x030c] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0342 A[SYNTHETIC, Splitter:B:154:0x0342] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01fd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c5 A[Catch:{ IOException -> 0x02d5, all -> 0x02d0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean a(android.content.Context r20, java.io.File r21) {
        /*
            java.lang.Class<jjc> r1 = defpackage.jjc.class
            monitor-enter(r1)
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0370 }
            boolean r0 = r21.isDirectory()     // Catch:{ all -> 0x0370 }
            r2 = 0
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = r21.getAbsolutePath()     // Catch:{ all -> 0x0370 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0370 }
            java.lang.String r3 = "Not a directory: "
            int r4 = r0.length()     // Catch:{ all -> 0x0370 }
            if (r4 != 0) goto L_0x0023
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0370 }
            r0.<init>(r3)     // Catch:{ all -> 0x0370 }
            goto L_0x0027
        L_0x0023:
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x0370 }
        L_0x0027:
            java.lang.String r3 = "CommonFileUtils"
            android.util.Log.e(r3, r0)     // Catch:{ all -> 0x0370 }
            monitor-exit(r1)
            return r2
        L_0x002e:
            java.io.File r0 = r20.getCacheDir()     // Catch:{ all -> 0x0370 }
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = "CommonFileUtils"
            java.lang.String r3 = "Failed to get cache directory."
            android.util.Log.w(r0, r3)     // Catch:{ all -> 0x0370 }
            monitor-exit(r1)
            return r2
        L_0x003d:
            java.io.File r3 = r20.getFilesDir()     // Catch:{ all -> 0x0370 }
            if (r3 != 0) goto L_0x004c
            java.lang.String r0 = "CommonFileUtils"
            java.lang.String r3 = "Failed to get files directory."
            android.util.Log.w(r0, r3)     // Catch:{ all -> 0x0370 }
            monitor-exit(r1)
            return r2
        L_0x004c:
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0370 }
            java.io.File r5 = r20.getFilesDir()     // Catch:{ all -> 0x0370 }
            java.lang.String r6 = "gmscore_global_dirs.txt"
            r4.<init>(r5, r6)     // Catch:{ all -> 0x0370 }
            r5 = 0
            r4.createNewFile()     // Catch:{ IOException -> 0x02e4, all -> 0x02e0 }
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x02e4, all -> 0x02e0 }
            java.lang.String r7 = "rw"
            r6.<init>(r4, r7)     // Catch:{ IOException -> 0x02e4, all -> 0x02e0 }
            java.nio.channels.FileLock r7 = a((java.io.RandomAccessFile) r6)     // Catch:{ IOException -> 0x02dc, all -> 0x02d8 }
            if (r7 == 0) goto L_0x02b0
            long r8 = r6.length()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            int r4 = (int) r8     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            r6.readFully(r4)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.lang.String r8 = new java.lang.String     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.lang.String r9 = "UTF-8"
            r8.<init>(r4, r9)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            r4 = 58
            amsk r9 = defpackage.amsk.a((char) r4)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            amsk r9 = r9.b()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            amsk r9 = r9.a()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.lang.Iterable r8 = r9.a((java.lang.CharSequence) r8)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.util.HashSet r8 = defpackage.angm.a((java.lang.Iterable) r8)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            amsk r9 = defpackage.amsk.a((char) r4)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            amsk r9 = r9.b()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            amsk r9 = r9.a()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            awzc r10 = defpackage.awzc.a     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            awzd r10 = r10.a()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.lang.String r10 = r10.b()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.util.List r9 = r9.c(r10)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            boolean r9 = r8.addAll(r9)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.io.File r10 = r3.getParentFile()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            r11 = 2
            java.lang.String[] r12 = new java.lang.String[r11]     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.lang.String r3 = r3.getName()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            r12[r2] = r3     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.lang.String r0 = r0.getName()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            r3 = 1
            r12[r3] = r0     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.io.File r10 = r10.getCanonicalFile()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.io.File r0 = r21.getCanonicalFile()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.lang.String r13 = r0.getPath()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.lang.String r14 = r10.getPath()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            boolean r13 = r13.startsWith(r14)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            if (r13 == 0) goto L_0x0293
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            r13.<init>()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
        L_0x00dc:
            if (r0 == 0) goto L_0x022a
            r13.add(r0)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            boolean r14 = r10.equals(r0)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            if (r14 != 0) goto L_0x022a
            java.io.File r14 = r0.getParentFile()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            boolean r15 = r10.equals(r14)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            if (r15 != 0) goto L_0x00f3
            goto L_0x0222
        L_0x00f3:
            java.lang.String r5 = r0.getName()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            r0 = 0
        L_0x00f8:
            if (r0 >= r11) goto L_0x011b
            r15 = r12[r0]     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            boolean r15 = r15.equals(r5)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            if (r15 != 0) goto L_0x0105
            int r0 = r0 + 1
            goto L_0x00f8
        L_0x0105:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            r4[r2] = r5     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.lang.String r5 = java.util.Arrays.toString(r12)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            r4[r3] = r5     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.lang.String r3 = "Cannot make directory (%s) world-executable. Forbidden list: %s"
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            throw r0     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
        L_0x011b:
            int r15 = android.os.Process.myUid()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            awzc r0 = defpackage.awzc.a     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            awzd r0 = r0.a()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            boolean r0 = r0.a()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            if (r0 == 0) goto L_0x021e
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            if (r10 == 0) goto L_0x021b
            java.io.File[] r4 = r10.listFiles()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            if (r4 == 0) goto L_0x0218
            int r11 = r4.length     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            r3 = 0
        L_0x0137:
            if (r3 >= r11) goto L_0x0218
            r0 = r4[r3]     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.lang.String r2 = r0.getName()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            boolean r2 = r2.equals(r5)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            if (r2 == 0) goto L_0x014d
            r21 = r4
            r18 = r5
            r19 = r11
            goto L_0x020d
        L_0x014d:
            boolean r2 = r0.isDirectory()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            if (r2 == 0) goto L_0x0207
            java.lang.String r2 = r0.getName()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            boolean r2 = r8.contains(r2)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            if (r2 != 0) goto L_0x0200
            java.lang.String r2 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            android.system.StructStat r0 = android.system.Os.stat(r2)     // Catch:{ Exception -> 0x01bc, all -> 0x02d0 }
            int r0 = r0.st_uid     // Catch:{ Exception -> 0x01bc, all -> 0x02d0 }
            if (r0 != r15) goto L_0x01b5
            android.system.StructStat r0 = android.system.Os.stat(r2)     // Catch:{ Exception -> 0x01bc, all -> 0x02d0 }
            int r0 = r0.st_mode     // Catch:{ Exception -> 0x01bc, all -> 0x02d0 }
            int r18 = android.system.OsConstants.S_IXGRP     // Catch:{ Exception -> 0x01bc, all -> 0x02d0 }
            r18 = r18 ^ -1
            r18 = r0 & r18
            int r19 = android.system.OsConstants.S_IXOTH     // Catch:{ Exception -> 0x01bc, all -> 0x02d0 }
            r19 = r19 ^ -1
            r18 = r18 & r19
            int r19 = android.system.OsConstants.S_IXUSR     // Catch:{ Exception -> 0x01bc, all -> 0x02d0 }
            r21 = r4
            r4 = r18 | r19
            if (r4 == r0) goto L_0x01b0
            android.system.Os.chmod(r2, r4)     // Catch:{ Exception -> 0x01ae, all -> 0x02d0 }
            r18 = r5
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01ac, all -> 0x02d0 }
            r17 = 0
            r5[r17] = r2     // Catch:{ Exception -> 0x01ac, all -> 0x02d0 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x01ac, all -> 0x02d0 }
            r16 = 1
            r5[r16] = r0     // Catch:{ Exception -> 0x01ac, all -> 0x02d0 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x01ac, all -> 0x02d0 }
            r4 = 2
            r5[r4] = r0     // Catch:{ Exception -> 0x01ac, all -> 0x02d0 }
            java.lang.String r0 = "CommonFileUtils"
            java.lang.String r4 = "Reset dir mode %s: %o to %o"
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch:{ Exception -> 0x01ac, all -> 0x02d0 }
            android.util.Log.i(r0, r4)     // Catch:{ Exception -> 0x01ac, all -> 0x02d0 }
            r19 = r11
            goto L_0x020d
        L_0x01ac:
            r0 = move-exception
            goto L_0x01c1
        L_0x01ae:
            r0 = move-exception
            goto L_0x01bf
        L_0x01b0:
            r18 = r5
            r19 = r11
            goto L_0x020d
        L_0x01b5:
            r21 = r4
            r18 = r5
            r19 = r11
            goto L_0x020d
        L_0x01bc:
            r0 = move-exception
            r21 = r4
        L_0x01bf:
            r18 = r5
        L_0x01c1:
            boolean r4 = r0 instanceof java.lang.RuntimeException     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            if (r4 != 0) goto L_0x01fd
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            int r4 = r4.length()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            int r5 = r5.length()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            r19 = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            int r4 = r4 + 41
            int r4 = r4 + r5
            r11.<init>(r4)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.lang.String r4 = "Failed to reset executable bits on dir "
            r11.append(r4)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            r11.append(r2)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.lang.String r2 = ": "
            r11.append(r2)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            r11.append(r0)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.lang.String r0 = "CommonFileUtils"
            java.lang.String r2 = r11.toString()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            android.util.Log.w(r0, r2)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            goto L_0x020d
        L_0x01fd:
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            throw r0     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
        L_0x0200:
            r21 = r4
            r18 = r5
            r19 = r11
            goto L_0x020d
        L_0x0207:
            r21 = r4
            r18 = r5
            r19 = r11
        L_0x020d:
            int r3 = r3 + 1
            r4 = r21
            r5 = r18
            r11 = r19
            r2 = 0
            goto L_0x0137
        L_0x0218:
            r18 = r5
            goto L_0x0220
        L_0x021b:
            r18 = r5
            goto L_0x0220
        L_0x021e:
            r18 = r5
        L_0x0220:
            r5 = r18
        L_0x0222:
            r0 = r14
            r2 = 0
            r3 = 1
            r4 = 58
            r11 = 2
            goto L_0x00dc
        L_0x022a:
            java.util.Iterator r0 = r13.iterator()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
        L_0x022e:
            boolean r2 = r0.hasNext()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            if (r2 == 0) goto L_0x0240
            java.lang.Object r2 = r0.next()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            r3 = 1
            r4 = 0
            r2.setExecutable(r3, r4)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            goto L_0x022e
        L_0x0240:
            if (r5 == 0) goto L_0x0249
            boolean r0 = r8.add(r5)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            if (r0 == 0) goto L_0x0249
            goto L_0x024b
        L_0x0249:
            if (r9 == 0) goto L_0x0263
        L_0x024b:
            r2 = 0
            r6.seek(r2)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            r2 = 58
            amre r0 = defpackage.amre.a((char) r2)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.lang.String r0 = r0.a((java.lang.Iterable) r8)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.lang.String r2 = "UTF-8"
            byte[] r0 = r0.getBytes(r2)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            r6.write(r0)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
        L_0x0263:
            r7.release()     // Catch:{ IOException -> 0x0267 }
            goto L_0x028d
        L_0x0267:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0370 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0370 }
            int r2 = r2.length()     // Catch:{ all -> 0x0370 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0370 }
            int r2 = r2 + 29
            r3.<init>(r2)     // Catch:{ all -> 0x0370 }
            java.lang.String r2 = "Failed to release file lock: "
            r3.append(r2)     // Catch:{ all -> 0x0370 }
            r3.append(r0)     // Catch:{ all -> 0x0370 }
            java.lang.String r0 = "CommonFileUtils"
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0370 }
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x0370 }
        L_0x028d:
            defpackage.jjt.a((java.io.Closeable) r6)     // Catch:{ all -> 0x0370 }
            monitor-exit(r1)
            r1 = 1
            return r1
        L_0x0293:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.lang.String r4 = r10.getPath()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            r5 = 0
            r3[r5] = r4     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.lang.String r0 = r0.getPath()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            r4 = 1
            r3[r4] = r0     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.lang.String r0 = "Not an ancestor directory: %s, %s"
            java.lang.String r0 = java.lang.String.format(r0, r3)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            throw r2     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
        L_0x02b0:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.lang.String r2 = "Cannot lock file: "
            java.lang.String r3 = r4.getCanonicalPath()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            int r4 = r3.length()     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            if (r4 != 0) goto L_0x02c8
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            goto L_0x02cc
        L_0x02c8:
            java.lang.String r3 = r2.concat(r3)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
        L_0x02cc:
            r0.<init>(r3)     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
            throw r0     // Catch:{ IOException -> 0x02d5, all -> 0x02d0 }
        L_0x02d0:
            r0 = move-exception
            r2 = r0
            r5 = r7
            goto L_0x0340
        L_0x02d5:
            r0 = move-exception
            r5 = r6
            goto L_0x02e6
        L_0x02d8:
            r0 = move-exception
            r2 = r0
            goto L_0x0340
        L_0x02dc:
            r0 = move-exception
            r7 = r5
            r5 = r6
            goto L_0x02e6
        L_0x02e0:
            r0 = move-exception
            r2 = r0
            r6 = r5
            goto L_0x0340
        L_0x02e4:
            r0 = move-exception
            r7 = r5
        L_0x02e6:
            java.lang.String r2 = "CommonFileUtils"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x033c }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x033c }
            int r3 = r3.length()     // Catch:{ all -> 0x033c }
            int r3 = r3 + 36
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x033c }
            r4.<init>(r3)     // Catch:{ all -> 0x033c }
            java.lang.String r3 = "Failed to set dir world executable: "
            r4.append(r3)     // Catch:{ all -> 0x033c }
            r4.append(r0)     // Catch:{ all -> 0x033c }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x033c }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x033c }
            if (r7 == 0) goto L_0x0336
            r7.release()     // Catch:{ IOException -> 0x0310 }
            goto L_0x0336
        L_0x0310:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0370 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0370 }
            int r2 = r2.length()     // Catch:{ all -> 0x0370 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0370 }
            int r2 = r2 + 29
            r3.<init>(r2)     // Catch:{ all -> 0x0370 }
            java.lang.String r2 = "Failed to release file lock: "
            r3.append(r2)     // Catch:{ all -> 0x0370 }
            r3.append(r0)     // Catch:{ all -> 0x0370 }
            java.lang.String r0 = "CommonFileUtils"
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0370 }
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x0370 }
        L_0x0336:
            defpackage.jjt.a((java.io.Closeable) r5)     // Catch:{ all -> 0x0370 }
            monitor-exit(r1)
            r1 = 0
            return r1
        L_0x033c:
            r0 = move-exception
            r2 = r0
            r6 = r5
            r5 = r7
        L_0x0340:
            if (r5 == 0) goto L_0x036c
            r5.release()     // Catch:{ IOException -> 0x0346 }
            goto L_0x036c
        L_0x0346:
            r0 = move-exception
            r3 = r0
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0370 }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0370 }
            int r3 = r3.length()     // Catch:{ all -> 0x0370 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0370 }
            int r3 = r3 + 29
            r4.<init>(r3)     // Catch:{ all -> 0x0370 }
            java.lang.String r3 = "Failed to release file lock: "
            r4.append(r3)     // Catch:{ all -> 0x0370 }
            r4.append(r0)     // Catch:{ all -> 0x0370 }
            java.lang.String r0 = "CommonFileUtils"
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0370 }
            android.util.Log.w(r0, r3)     // Catch:{ all -> 0x0370 }
        L_0x036c:
            defpackage.jjt.a((java.io.Closeable) r6)     // Catch:{ all -> 0x0370 }
            throw r2     // Catch:{ all -> 0x0370 }
        L_0x0370:
            r0 = move-exception
            monitor-exit(r1)
            goto L_0x0374
        L_0x0373:
            throw r0
        L_0x0374:
            goto L_0x0373
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jjc.a(android.content.Context, java.io.File):boolean");
    }

    public static boolean a(File file) {
        if (!file.exists() || file.delete()) {
            return true;
        }
        if (file.isDirectory()) {
            String[] list = file.list();
            if (list != null) {
                for (String file2 : list) {
                    a(new File(file, file2));
                }
            }
            if (file.delete()) {
                return true;
            }
        }
        return false;
    }
}
