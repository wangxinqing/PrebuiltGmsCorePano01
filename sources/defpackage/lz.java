package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: lz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lz {
    public static File a(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
            int i = 0;
            while (i < 100) {
                File file = new File(cacheDir, str + i);
                try {
                    if (file.createNewFile()) {
                        return file;
                    }
                    i++;
                } catch (IOException e) {
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        defpackage.apev.a(r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0044, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer a(android.content.Context r8, android.net.Uri r9) {
        /*
            android.content.ContentResolver r8 = r8.getContentResolver()
            r0 = 0
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r8 = r8.openFileDescriptor(r9, r1, r0)     // Catch:{ IOException -> 0x0046 }
            if (r8 == 0) goto L_0x0045
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ all -> 0x0039 }
            java.io.FileDescriptor r1 = r8.getFileDescriptor()     // Catch:{ all -> 0x0039 }
            r9.<init>(r1)     // Catch:{ all -> 0x0039 }
            java.nio.channels.FileChannel r2 = r9.getChannel()     // Catch:{ all -> 0x002d }
            long r6 = r2.size()     // Catch:{ all -> 0x002d }
            java.nio.channels.FileChannel$MapMode r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x002d }
            r4 = 0
            java.nio.MappedByteBuffer r1 = r2.map(r3, r4, r6)     // Catch:{ all -> 0x002d }
            r9.close()     // Catch:{ all -> 0x0039 }
            r8.close()     // Catch:{ IOException -> 0x0046 }
            return r1
        L_0x002d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002f }
        L_0x002f:
            r2 = move-exception
            r9.close()     // Catch:{ all -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            r9 = move-exception
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r9)     // Catch:{ all -> 0x0039 }
        L_0x0038:
            throw r2     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x003b }
        L_0x003b:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0040 }
            goto L_0x0044
        L_0x0040:
            r8 = move-exception
            defpackage.apev.a((java.lang.Throwable) r9, (java.lang.Throwable) r8)     // Catch:{ IOException -> 0x0046 }
        L_0x0044:
            throw r1     // Catch:{ IOException -> 0x0046 }
        L_0x0045:
            return r0
        L_0x0046:
            r8 = move-exception
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz.a(android.content.Context, android.net.Uri):java.nio.ByteBuffer");
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    public static boolean a(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean a = a(file, inputStream);
                a((Closeable) inputStream);
                return a;
            } catch (Throwable th) {
                th = th;
                a((Closeable) inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            a((Closeable) inputStream);
            throw th;
        }
    }

    public static boolean a(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        a((Closeable) fileOutputStream2);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                }
            } catch (IOException e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                try {
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    a((Closeable) fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    a((Closeable) fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                a((Closeable) fileOutputStream);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            a((Closeable) fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th3) {
            th = th3;
            a((Closeable) fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }
}
