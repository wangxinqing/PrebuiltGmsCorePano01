package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jke {
    private static final Map a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("armeabi-v7a", "arm");
        a.put("x86", "x86");
        a.put("x86_64", "x86_64");
        a.put("arm64-v8a", "arm64");
    }

    public static File a(Context context) {
        Context d = aekv.d(context);
        if (!jim.a()) {
            return d.getDir("extracted_libs", 0);
        }
        File dir = d.getDir("extracted_libs", 0);
        if (!dir.isDirectory()) {
            String valueOf = String.valueOf(dir.getAbsolutePath());
            Log.e("CommonFileUtils", valueOf.length() == 0 ? new String("Cannot get or create directory: ") : "Cannot get or create directory: ".concat(valueOf));
            return null;
        } else if (!jjc.a(d, dir)) {
            String valueOf2 = String.valueOf(dir.getAbsolutePath());
            Log.e("CommonFileUtils", valueOf2.length() == 0 ? new String("Cannot set directory as world-readable: ") : "Cannot set directory as world-readable: ".concat(valueOf2));
            return null;
        } else {
            dir.setReadable(true, false);
            return dir;
        }
    }

    public static void b(Context context) {
        File a2;
        File[] listFiles;
        if ("com.google.android.gms".equals(context.getPackageName()) && (a2 = a(context)) != null && (listFiles = a2.listFiles()) != null) {
            for (File a3 : listFiles) {
                jjc.a(a3);
            }
        }
    }

    public static boolean c(Context context) {
        return jji.a(context);
    }

    private static SharedPreferences e(Context context) {
        return aekv.d(context).getSharedPreferences("native_lib", 4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01d4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01d5, code lost:
        r23 = r6;
        r24 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        defpackage.jjt.a((java.io.Closeable) r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01dc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01e0, code lost:
        r22 = r4;
        r23 = r6;
        r21 = r12;
        r24 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0349, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x034f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0352, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0354, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0355, code lost:
        r22 = r4;
        r23 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0381, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0382, code lost:
        r16 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x03b7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x03b8, code lost:
        r22 = r4;
        r23 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x03bc, code lost:
        r5 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x03be, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x03bf, code lost:
        r16 = r3;
        r22 = r4;
        r23 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x03ef, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d1, code lost:
        r0 = r2.getApplicationInfo().nativeLibraryDir;
        r3 = new java.io.File(r0);
        r7 = android.os.Build.VERSION.SDK_INT;
        r17 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ea, code lost:
        if ("lib".equals(r3.getName()) == false) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ec, code lost:
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ef, code lost:
        r0 = (java.lang.String) a.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f7, code lost:
        if (r0 != null) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f9, code lost:
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r10).length() + 34);
        r3.append("Instruction set for ");
        r3.append(r10);
        r3.append(" is not known.");
        android.util.Log.w("NativeLibraryUtils", r3.toString());
        r22 = r4;
        r23 = r6;
        r18 = r8;
        r21 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0128, code lost:
        r0 = new java.io.File(r3.getParentFile(), r0).getAbsolutePath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0135, code lost:
        r3 = new java.io.File(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013e, code lost:
        r18 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0142, code lost:
        if (r3.exists() != false) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0144, code lost:
        r22 = r4;
        r23 = r6;
        r21 = r12;
        r24 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r19 = r13.getCrc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0156, code lost:
        if (r3.exists() != false) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0158, code lost:
        r22 = r4;
        r23 = r6;
        r21 = r12;
        r24 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r0 = new java.util.zip.CRC32();
        r8 = new java.io.FileInputStream(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016c, code lost:
        r22 = r4;
        r21 = r12;
        r12 = com.google.android.chimera.FragmentTransaction.TRANSIT_ENTER_MASK;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r4 = new byte[com.google.android.chimera.FragmentTransaction.TRANSIT_ENTER_MASK];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0174, code lost:
        r23 = r6;
        r24 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r14 = r8.read(r4, 0, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x017f, code lost:
        if (r14 != -1) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        defpackage.jjt.a((java.io.Closeable) r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x018a, code lost:
        if (r0.getValue() != r19) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r0 = a(r2, r10, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0194, code lost:
        if (r0.exists() == false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x019a, code lost:
        if (r0.delete() == false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x019c, code lost:
        r0 = e(r2).edit();
        r3 = java.lang.String.valueOf(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ac, code lost:
        if (r3.length() != 0) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ae, code lost:
        r3 = new java.lang.String("crc_");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b4, code lost:
        r3 = "crc_".concat(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b8, code lost:
        r0.remove(r3);
        r0.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r0.update(r4, 0, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01cb, code lost:
        r6 = r23;
        r14 = r24;
        r12 = com.google.android.chimera.FragmentTransaction.TRANSIT_ENTER_MASK;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01d2, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x034f A[ExcHandler: all (th java.lang.Throwable), Splitter:B:174:0x02d5] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x03b7 A[ExcHandler: all (th java.lang.Throwable), PHI: r4 r6 
      PHI: (r4v6 java.io.RandomAccessFile) = (r4v3 java.io.RandomAccessFile), (r4v7 java.io.RandomAccessFile), (r4v14 java.io.RandomAccessFile), (r4v14 java.io.RandomAccessFile), (r4v14 java.io.RandomAccessFile), (r4v14 java.io.RandomAccessFile) binds: [B:35:0x0081, B:42:0x00a0, B:51:0x00c9, B:65:0x014e, B:69:0x0162, B:70:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r6v9 java.nio.channels.FileLock) = (r6v4 java.nio.channels.FileLock), (r6v10 java.nio.channels.FileLock), (r6v19 java.nio.channels.FileLock), (r6v19 java.nio.channels.FileLock), (r6v19 java.nio.channels.FileLock), (r6v19 java.nio.channels.FileLock) binds: [B:35:0x0081, B:42:0x00a0, B:51:0x00c9, B:65:0x014e, B:69:0x0162, B:70:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:35:0x0081] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x03df A[SYNTHETIC, Splitter:B:235:0x03df] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x03ef A[Catch:{ IOException -> 0x03f5, all -> 0x03f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x040c A[SYNTHETIC, Splitter:B:254:0x040c] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x041d A[SYNTHETIC, Splitter:B:265:0x041d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(android.content.Context r27) {
        /*
            java.lang.String r1 = "NativeLibraryUtils"
            boolean r0 = defpackage.jji.a(r27)
            if (r0 == 0) goto L_0x0440
            android.content.Context r2 = defpackage.aekv.d(r27)
            android.content.pm.ApplicationInfo r3 = r2.getApplicationInfo()
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0439 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0439 }
            java.io.File r5 = r2.getCacheDir()     // Catch:{ IOException -> 0x0439 }
            java.lang.String r6 = ".lib.lock"
            r0.<init>(r5, r6)     // Catch:{ IOException -> 0x0439 }
            java.lang.String r5 = "rw"
            r4.<init>(r0, r5)     // Catch:{ IOException -> 0x0439 }
            java.nio.channels.FileChannel r0 = r4.getChannel()
            java.nio.channels.FileLock r0 = r0.tryLock()     // Catch:{ IOException -> 0x0033, all -> 0x002c }
            r6 = r0
            goto L_0x0035
        L_0x002c:
            r0 = move-exception
            r1 = r0
            r22 = r4
            r5 = 0
            goto L_0x041b
        L_0x0033:
            r0 = move-exception
            r6 = 0
        L_0x0035:
            if (r6 == 0) goto L_0x0428
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IOException -> 0x0400, all -> 0x03f7 }
            r0.<init>()     // Catch:{ IOException -> 0x0400, all -> 0x03f7 }
            java.lang.String r7 = r3.sourceDir     // Catch:{ IOException -> 0x0400, all -> 0x03f7 }
            r0.add(r7)     // Catch:{ IOException -> 0x0400, all -> 0x03f7 }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x0400, all -> 0x03f7 }
            java.lang.String[] r7 = r3.splitSourceDirs     // Catch:{ IOException -> 0x0400, all -> 0x03f7 }
            if (r7 == 0) goto L_0x004c
            java.lang.String[] r3 = r3.splitSourceDirs     // Catch:{ IOException -> 0x0400, all -> 0x03f7 }
            java.util.Collections.addAll(r0, r3)     // Catch:{ IOException -> 0x0400, all -> 0x03f7 }
        L_0x004c:
            java.util.Iterator r3 = r0.iterator()     // Catch:{ IOException -> 0x0400, all -> 0x03f7 }
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x0053:
            boolean r0 = r3.hasNext()     // Catch:{ IOException -> 0x0400, all -> 0x03f7 }
            r10 = 1
            if (r0 != 0) goto L_0x0076
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IOException -> 0x0400, all -> 0x03f7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x0400, all -> 0x03f7 }
            r0[r7] = r2     // Catch:{ IOException -> 0x0400, all -> 0x03f7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x0400, all -> 0x03f7 }
            r0[r10] = r2     // Catch:{ IOException -> 0x0400, all -> 0x03f7 }
            if (r6 == 0) goto L_0x0070
            r6.release()     // Catch:{ IOException -> 0x006f }
            goto L_0x0070
        L_0x006f:
            r0 = move-exception
        L_0x0070:
            r4.close()     // Catch:{ IOException -> 0x0074 }
            return
        L_0x0074:
            r0 = move-exception
            return
        L_0x0076:
            java.lang.Object r0 = r3.next()     // Catch:{ IOException -> 0x0400, all -> 0x03f7 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x0400, all -> 0x03f7 }
            java.util.zip.ZipFile r11 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x03ce, all -> 0x03c7 }
            r11.<init>(r0)     // Catch:{ IOException -> 0x03ce, all -> 0x03c7 }
            java.util.Enumeration r12 = r11.entries()     // Catch:{ IOException -> 0x03be, all -> 0x03b7 }
        L_0x0085:
            boolean r0 = r12.hasMoreElements()     // Catch:{ IOException -> 0x03be, all -> 0x03b7 }
            if (r0 == 0) goto L_0x03a4
            java.lang.Object r0 = r12.nextElement()     // Catch:{ IOException -> 0x03be, all -> 0x03b7 }
            r13 = r0
            java.util.zip.ZipEntry r13 = (java.util.zip.ZipEntry) r13     // Catch:{ IOException -> 0x03be, all -> 0x03b7 }
            java.lang.String r14 = r13.getName()     // Catch:{ IOException -> 0x03be, all -> 0x03b7 }
            java.lang.String r0 = "lib/"
            boolean r0 = r14.startsWith(r0)     // Catch:{ IOException -> 0x03be, all -> 0x03b7 }
            if (r0 == 0) goto L_0x038e
            int r8 = r8 + 1
            boolean r0 = r13.isDirectory()     // Catch:{ IOException -> 0x0381, all -> 0x03b7 }
            if (r0 != 0) goto L_0x0372
            java.lang.String r15 = r13.getName()     // Catch:{ IOException -> 0x0381, all -> 0x03b7 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0381, all -> 0x03b7 }
            r0.<init>(r15)     // Catch:{ IOException -> 0x0381, all -> 0x03b7 }
            java.lang.String r5 = r0.getName()     // Catch:{ IOException -> 0x0381, all -> 0x03b7 }
            java.io.File r0 = r0.getParentFile()     // Catch:{ IOException -> 0x0381, all -> 0x03b7 }
            if (r0 == 0) goto L_0x0372
            java.lang.String r10 = r0.getName()     // Catch:{ IOException -> 0x0381, all -> 0x03b7 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x0381, all -> 0x03b7 }
            java.lang.String[] r0 = android.os.Build.SUPPORTED_ABIS     // Catch:{ IOException -> 0x0381, all -> 0x03b7 }
            int r7 = r0.length     // Catch:{ IOException -> 0x0381, all -> 0x03b7 }
            r16 = r3
            r3 = 0
        L_0x00c5:
            if (r3 >= r7) goto L_0x0374
            r17 = r7
            r7 = r0[r3]     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            boolean r7 = r7.equals(r10)     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            if (r7 == 0) goto L_0x035a
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo()     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            java.lang.String r0 = r0.nativeLibraryDir     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            java.lang.String r7 = "lib"
            r17 = r0
            java.lang.String r0 = r3.getName()     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            boolean r0 = r7.equals(r0)     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            if (r0 == 0) goto L_0x00ef
            r0 = r17
            goto L_0x0135
        L_0x00ef:
            java.util.Map r0 = a     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            if (r0 != 0) goto L_0x0128
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            int r0 = r0.length()     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            int r0 = r0 + 34
            r3.<init>(r0)     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            java.lang.String r0 = "Instruction set for "
            r3.append(r0)     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            r3.append(r10)     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            java.lang.String r0 = " is not known."
            r3.append(r0)     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            java.lang.String r0 = r3.toString()     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            android.util.Log.w(r1, r0)     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            r22 = r4
            r23 = r6
            r18 = r8
            r21 = r12
            r4 = 1
            r6 = 0
            goto L_0x037e
        L_0x0128:
            java.io.File r7 = new java.io.File     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            java.io.File r3 = r3.getParentFile()     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            r7.<init>(r3, r0)     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            java.lang.String r0 = r7.getAbsolutePath()     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
        L_0x0135:
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            r3.<init>(r0, r5)     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            boolean r0 = r3.exists()     // Catch:{ IOException -> 0x0370, all -> 0x03b7 }
            java.lang.String r7 = "crc_"
            r18 = r8
            if (r0 != 0) goto L_0x014e
            r22 = r4
            r23 = r6
            r21 = r12
            r24 = r14
            goto L_0x0226
        L_0x014e:
            long r19 = r13.getCrc()     // Catch:{ IOException -> 0x0354, all -> 0x03b7 }
            boolean r0 = r3.exists()     // Catch:{ IOException -> 0x0354, all -> 0x03b7 }
            if (r0 != 0) goto L_0x0162
            r22 = r4
            r23 = r6
            r21 = r12
            r24 = r14
            goto L_0x01e8
        L_0x0162:
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32     // Catch:{ IOException -> 0x01df, all -> 0x03b7 }
            r0.<init>()     // Catch:{ IOException -> 0x01df, all -> 0x03b7 }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ IOException -> 0x01df, all -> 0x03b7 }
            r8.<init>(r3)     // Catch:{ IOException -> 0x01df, all -> 0x03b7 }
            r22 = r4
            r21 = r12
            r12 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r12]     // Catch:{ all -> 0x01d4 }
        L_0x0174:
            r23 = r6
            r24 = r14
            r6 = 0
            int r14 = r8.read(r4, r6, r12)     // Catch:{ all -> 0x01d2 }
            r6 = -1
            if (r14 != r6) goto L_0x01c6
            defpackage.jjt.a((java.io.Closeable) r8)     // Catch:{ IOException -> 0x01dd, all -> 0x034f }
            long r25 = r0.getValue()     // Catch:{ IOException -> 0x01dd, all -> 0x034f }
            int r0 = (r25 > r19 ? 1 : (r25 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x01e8
            java.io.File r0 = a(r2, r10, r5)     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            boolean r3 = r0.exists()     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            if (r3 == 0) goto L_0x01c2
            boolean r0 = r0.delete()     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            if (r0 == 0) goto L_0x01c2
            android.content.SharedPreferences r0 = e(r2)     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            java.lang.String r3 = java.lang.String.valueOf(r15)     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            int r4 = r3.length()     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            if (r4 != 0) goto L_0x01b4
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            r3.<init>(r7)     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            goto L_0x01b8
        L_0x01b4:
            java.lang.String r3 = r7.concat(r3)     // Catch:{ IOException -> 0x0352, all -> 0x034f }
        L_0x01b8:
            r0.remove(r3)     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            r0.apply()     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            r4 = 1
            r6 = 0
            goto L_0x037e
        L_0x01c2:
            r4 = 1
            r6 = 0
            goto L_0x037e
        L_0x01c6:
            r6 = 0
            r0.update(r4, r6, r14)     // Catch:{ all -> 0x01d2 }
            r6 = r23
            r14 = r24
            r12 = 4096(0x1000, float:5.74E-42)
            goto L_0x0174
        L_0x01d2:
            r0 = move-exception
            goto L_0x01d9
        L_0x01d4:
            r0 = move-exception
            r23 = r6
            r24 = r14
        L_0x01d9:
            defpackage.jjt.a((java.io.Closeable) r8)     // Catch:{ IOException -> 0x01dd, all -> 0x034f }
            throw r0     // Catch:{ IOException -> 0x01dd, all -> 0x034f }
        L_0x01dd:
            r0 = move-exception
            goto L_0x01e8
        L_0x01df:
            r0 = move-exception
            r22 = r4
            r23 = r6
            r21 = r12
            r24 = r14
        L_0x01e8:
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            int r3 = r3.length()     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            int r3 = r3 + 24
            r4.<init>(r3)     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            java.lang.String r3 = "File "
            r4.append(r3)     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            r4.append(r0)     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            java.lang.String r0 = " is not up to date."
            r4.append(r0)     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            android.util.Log.w(r1, r0)     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            long r3 = r13.getCrc()     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            r4 = 0
            r0[r4] = r3     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            java.lang.String r3 = "ZipFile CRC32: %x"
            java.lang.String r0 = java.lang.String.format(r3, r0)     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            android.util.Log.w(r1, r0)     // Catch:{ IOException -> 0x0352, all -> 0x034f }
        L_0x0226:
            java.io.File r3 = a(r2, r10, r5)     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            android.content.SharedPreferences r0 = e(r2)     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            java.lang.String r4 = java.lang.String.valueOf(r15)     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            int r5 = r4.length()     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            if (r5 != 0) goto L_0x023e
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            r4.<init>(r7)     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            goto L_0x0242
        L_0x023e:
            java.lang.String r4 = r7.concat(r4)     // Catch:{ IOException -> 0x0352, all -> 0x034f }
        L_0x0242:
            r5 = 0
            long r4 = r0.getLong(r4, r5)     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            long r14 = r13.getCrc()     // Catch:{ IOException -> 0x0352, all -> 0x034f }
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x034b
            java.io.InputStream r0 = r11.getInputStream(r13)     // Catch:{ IOException -> 0x02e5, all -> 0x034f }
            java.io.File r4 = r3.getParentFile()     // Catch:{ IOException -> 0x02e5, all -> 0x034f }
            boolean r5 = r4.exists()     // Catch:{ IOException -> 0x02e5, all -> 0x034f }
            if (r5 == 0) goto L_0x025f
            goto L_0x026d
        L_0x025f:
            boolean r5 = r4.mkdirs()     // Catch:{ IOException -> 0x02e5, all -> 0x034f }
            if (r5 == 0) goto L_0x02e1
            r5 = 1
            r6 = 0
            r4.setReadable(r5, r6)     // Catch:{ IOException -> 0x02df, all -> 0x034f }
            r4.setExecutable(r5, r6)     // Catch:{ IOException -> 0x02df, all -> 0x034f }
        L_0x026d:
            java.lang.String r5 = r3.getName()     // Catch:{ IOException -> 0x02dc, all -> 0x034f }
            r6 = 0
            java.io.File r4 = java.io.File.createTempFile(r5, r6, r4)     // Catch:{ IOException -> 0x02dc, all -> 0x034f }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x02d2, all -> 0x034f }
            r5.<init>(r4)     // Catch:{ IOException -> 0x02d2, all -> 0x034f }
            r8 = 4096(0x1000, float:5.74E-42)
            byte[] r10 = new byte[r8]     // Catch:{ all -> 0x02c2 }
        L_0x027f:
            r12 = 0
            int r14 = r0.read(r10, r12, r8)     // Catch:{ all -> 0x02c2 }
            r12 = -1
            if (r14 != r12) goto L_0x02b9
            r5.flush()     // Catch:{ all -> 0x02b4 }
            java.io.FileDescriptor r0 = r5.getFD()     // Catch:{ all -> 0x02b4 }
            r0.sync()     // Catch:{ all -> 0x02b4 }
            r5.close()     // Catch:{ IOException -> 0x02b0, all -> 0x034f }
            boolean r0 = r4.renameTo(r3)     // Catch:{ IOException -> 0x02ac, all -> 0x034f }
            if (r0 == 0) goto L_0x02a4
            r4 = 0
            r15 = 1
            r3.setReadable(r15, r4)     // Catch:{ IOException -> 0x02aa, all -> 0x034f }
            r3.setExecutable(r15, r4)     // Catch:{ IOException -> 0x02aa, all -> 0x034f }
            goto L_0x02a8
        L_0x02a4:
            r15 = 1
            r4.delete()     // Catch:{ IOException -> 0x02aa, all -> 0x034f }
        L_0x02a8:
            r6 = 0
            goto L_0x02e9
        L_0x02aa:
            r0 = move-exception
            goto L_0x02ae
        L_0x02ac:
            r0 = move-exception
            r15 = 1
        L_0x02ae:
            r6 = 0
            goto L_0x02e8
        L_0x02b0:
            r0 = move-exception
            r15 = 1
            r6 = 0
            goto L_0x02d5
        L_0x02b4:
            r0 = move-exception
            r15 = 1
            r8 = r0
            r6 = 0
            goto L_0x02c6
        L_0x02b9:
            r15 = 1
            r6 = 0
            r5.write(r10, r6, r14)     // Catch:{ all -> 0x02c0 }
            r6 = 0
            goto L_0x027f
        L_0x02c0:
            r0 = move-exception
            goto L_0x02c5
        L_0x02c2:
            r0 = move-exception
            r6 = 0
            r15 = 1
        L_0x02c5:
            r8 = r0
        L_0x02c6:
            r5.close()     // Catch:{ all -> 0x02ca }
            goto L_0x02cf
        L_0x02ca:
            r0 = move-exception
            r5 = r0
            defpackage.apev.a((java.lang.Throwable) r8, (java.lang.Throwable) r5)     // Catch:{ IOException -> 0x02d0, all -> 0x034f }
        L_0x02cf:
            throw r8     // Catch:{ IOException -> 0x02d0, all -> 0x034f }
        L_0x02d0:
            r0 = move-exception
            goto L_0x02d5
        L_0x02d2:
            r0 = move-exception
            r6 = 0
            r15 = 1
        L_0x02d5:
            r4.delete()     // Catch:{ IOException -> 0x02da, all -> 0x034f }
            r0 = 0
            goto L_0x02e9
        L_0x02da:
            r0 = move-exception
            goto L_0x02e8
        L_0x02dc:
            r0 = move-exception
            r6 = 0
            goto L_0x02e7
        L_0x02df:
            r0 = move-exception
            goto L_0x02e7
        L_0x02e1:
            r6 = 0
            r15 = 1
            r0 = 0
            goto L_0x02e9
        L_0x02e5:
            r0 = move-exception
            r6 = 0
        L_0x02e7:
            r15 = 1
        L_0x02e8:
            r0 = 0
        L_0x02e9:
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x0349, all -> 0x034f }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x0349, all -> 0x034f }
            int r4 = r4.length()     // Catch:{ IOException -> 0x0349, all -> 0x034f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0349, all -> 0x034f }
            int r4 = r4 + 20
            r5.<init>(r4)     // Catch:{ IOException -> 0x0349, all -> 0x034f }
            java.lang.String r4 = "Extraction to "
            r5.append(r4)     // Catch:{ IOException -> 0x0349, all -> 0x034f }
            r5.append(r3)     // Catch:{ IOException -> 0x0349, all -> 0x034f }
            java.lang.String r3 = " "
            r5.append(r3)     // Catch:{ IOException -> 0x0349, all -> 0x034f }
            r5.append(r0)     // Catch:{ IOException -> 0x0349, all -> 0x034f }
            java.lang.String r3 = r5.toString()     // Catch:{ IOException -> 0x0349, all -> 0x034f }
            android.util.Log.i(r1, r3)     // Catch:{ IOException -> 0x0349, all -> 0x034f }
            if (r0 == 0) goto L_0x0347
            int r9 = r9 + 1
            long r3 = r13.getCrc()     // Catch:{ IOException -> 0x0342, all -> 0x034f }
            android.content.SharedPreferences r0 = e(r2)     // Catch:{ IOException -> 0x0342, all -> 0x034f }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ IOException -> 0x0342, all -> 0x034f }
            java.lang.String r5 = java.lang.String.valueOf(r24)     // Catch:{ IOException -> 0x0342, all -> 0x034f }
            int r8 = r5.length()     // Catch:{ IOException -> 0x0342, all -> 0x034f }
            if (r8 != 0) goto L_0x0333
            java.lang.String r5 = new java.lang.String     // Catch:{ IOException -> 0x0342, all -> 0x034f }
            r5.<init>(r7)     // Catch:{ IOException -> 0x0342, all -> 0x034f }
            goto L_0x0337
        L_0x0333:
            java.lang.String r5 = r7.concat(r5)     // Catch:{ IOException -> 0x0342, all -> 0x034f }
        L_0x0337:
            r0.putLong(r5, r3)     // Catch:{ IOException -> 0x0342, all -> 0x034f }
            r0.apply()     // Catch:{ IOException -> 0x0342, all -> 0x034f }
            r8 = r18
            r4 = 1
            goto L_0x0398
        L_0x0342:
            r0 = move-exception
            r8 = r18
            goto L_0x03d7
        L_0x0347:
            r4 = 1
            goto L_0x037e
        L_0x0349:
            r0 = move-exception
            goto L_0x038b
        L_0x034b:
            r6 = 0
            r15 = 1
            r4 = 1
            goto L_0x037e
        L_0x034f:
            r0 = move-exception
            goto L_0x03bc
        L_0x0352:
            r0 = move-exception
            goto L_0x038a
        L_0x0354:
            r0 = move-exception
            r22 = r4
            r23 = r6
            goto L_0x038a
        L_0x035a:
            r22 = r4
            r23 = r6
            r18 = r8
            r21 = r12
            r24 = r14
            r4 = 1
            r6 = 0
            int r3 = r3 + 1
            r7 = r17
            r4 = r22
            r6 = r23
            goto L_0x00c5
        L_0x0370:
            r0 = move-exception
            goto L_0x0384
        L_0x0372:
            r16 = r3
        L_0x0374:
            r22 = r4
            r23 = r6
            r18 = r8
            r21 = r12
            r4 = 1
            r6 = 0
        L_0x037e:
            r8 = r18
            goto L_0x0398
        L_0x0381:
            r0 = move-exception
            r16 = r3
        L_0x0384:
            r22 = r4
            r23 = r6
            r18 = r8
        L_0x038a:
            r6 = 0
        L_0x038b:
            r8 = r18
            goto L_0x03d7
        L_0x038e:
            r16 = r3
            r22 = r4
            r23 = r6
            r21 = r12
            r4 = 1
            r6 = 0
        L_0x0398:
            r3 = r16
            r12 = r21
            r4 = r22
            r6 = r23
            r7 = 0
            r10 = 1
            goto L_0x0085
        L_0x03a4:
            r16 = r3
            r22 = r4
            r23 = r6
            r6 = 0
            r11.close()     // Catch:{ IOException -> 0x03f5, all -> 0x03f3 }
            r3 = r16
            r4 = r22
            r6 = r23
            r7 = 0
            goto L_0x0053
        L_0x03b7:
            r0 = move-exception
            r22 = r4
            r23 = r6
        L_0x03bc:
            r5 = r11
            goto L_0x03ed
        L_0x03be:
            r0 = move-exception
            r16 = r3
            r22 = r4
            r23 = r6
            r6 = 0
            goto L_0x03d7
        L_0x03c7:
            r0 = move-exception
            r22 = r4
            r23 = r6
            r5 = 0
            goto L_0x03ed
        L_0x03ce:
            r0 = move-exception
            r16 = r3
            r22 = r4
            r23 = r6
            r6 = 0
            r11 = 0
        L_0x03d7:
            java.lang.String r3 = "Couldn't open apk source file."
            android.util.Log.e(r1, r3, r0)     // Catch:{ all -> 0x03eb }
            if (r11 != 0) goto L_0x03df
            goto L_0x03e2
        L_0x03df:
            r11.close()     // Catch:{ IOException -> 0x03f5, all -> 0x03f3 }
        L_0x03e2:
            r3 = r16
            r4 = r22
            r6 = r23
            r7 = 0
            goto L_0x0053
        L_0x03eb:
            r0 = move-exception
            r5 = r11
        L_0x03ed:
            if (r5 == 0) goto L_0x03f2
            r5.close()     // Catch:{ IOException -> 0x03f5, all -> 0x03f3 }
        L_0x03f2:
            throw r0     // Catch:{ IOException -> 0x03f5, all -> 0x03f3 }
        L_0x03f3:
            r0 = move-exception
            goto L_0x03fc
        L_0x03f5:
            r0 = move-exception
            goto L_0x0405
        L_0x03f7:
            r0 = move-exception
            r22 = r4
            r23 = r6
        L_0x03fc:
            r1 = r0
            r5 = r23
            goto L_0x041b
        L_0x0400:
            r0 = move-exception
            r22 = r4
            r23 = r6
        L_0x0405:
            java.lang.String r2 = "Install failed"
            android.util.Log.w(r1, r2, r0)     // Catch:{ all -> 0x0417 }
            if (r23 == 0) goto L_0x0411
            r23.release()     // Catch:{ IOException -> 0x0410 }
            goto L_0x0411
        L_0x0410:
            r0 = move-exception
        L_0x0411:
            r22.close()     // Catch:{ IOException -> 0x0415 }
            return
        L_0x0415:
            r0 = move-exception
            return
        L_0x0417:
            r0 = move-exception
            r1 = r0
            r5 = r23
        L_0x041b:
            if (r5 == 0) goto L_0x0422
            r5.release()     // Catch:{ IOException -> 0x0421 }
            goto L_0x0422
        L_0x0421:
            r0 = move-exception
        L_0x0422:
            r22.close()     // Catch:{ IOException -> 0x0426 }
            goto L_0x0427
        L_0x0426:
            r0 = move-exception
        L_0x0427:
            throw r1
        L_0x0428:
            r22 = r4
            r23 = r6
            if (r23 == 0) goto L_0x0433
            r23.release()     // Catch:{ IOException -> 0x0432 }
            goto L_0x0433
        L_0x0432:
            r0 = move-exception
        L_0x0433:
            r22.close()     // Catch:{ IOException -> 0x0437 }
            return
        L_0x0437:
            r0 = move-exception
            return
        L_0x0439:
            r0 = move-exception
            java.lang.String r2 = "Failed to open lock file"
            android.util.Log.w(r1, r2, r0)
            return
        L_0x0440:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jke.d(android.content.Context):void");
    }

    public static boolean b(Context context, String str) {
        return jji.b(context, str);
    }

    private static File a(Context context, String str, String str2) {
        File a2 = a(context);
        String str3 = File.separator;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str3).length() + String.valueOf(str2).length());
        sb.append(str);
        sb.append(str3);
        sb.append(str2);
        return new File(a2, sb.toString());
    }

    public static String a(Context context, String str) {
        return jji.a(context, str);
    }
}
