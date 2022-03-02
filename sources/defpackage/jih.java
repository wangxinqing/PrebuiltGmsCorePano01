package defpackage;

import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: jih  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jih implements Appendable, Closeable {
    public final ScheduledExecutorService a;
    public final long b;
    public final long c;
    public final TimeUnit d;
    public final Object e = new Object();
    public final FileOutputStream f;
    public final PrintStream g;
    public long h;
    public long i;
    public ScheduledFuture j;
    final Runnable k = new jif(this);

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public jih(java.io.File r7, java.util.concurrent.ScheduledExecutorService r8, long r9, java.util.concurrent.TimeUnit r11, int r12) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r6.e = r0
            jif r0 = new jif
            r0.<init>(r6)
            r6.k = r0
            java.lang.String r0 = "CachingFileWriter"
            if (r12 >= 0) goto L_0x001a
            java.lang.String r1 = "buffer size should be >= 0"
            android.util.Log.w(r0, r1)
        L_0x001a:
            r1 = 0
            r2 = 1
            if (r12 < 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            java.lang.String r4 = "bufferSize must be >= 0"
            defpackage.iva.b(r3, r4)
            ihs r3 = defpackage.ihs.b()
            boolean r3 = defpackage.jix.d(r3)
            r4 = 102400(0x19000, float:1.43493E-40)
            r5 = 20480(0x5000, float:2.8699E-41)
            if (r3 != 0) goto L_0x003d
            if (r12 > r4) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            r12 = 102400(0x19000, float:1.43493E-40)
            goto L_0x0041
        L_0x003d:
            if (r12 <= r5) goto L_0x0041
            r12 = 20480(0x5000, float:2.8699E-41)
        L_0x0041:
            long r3 = (long) r12
            r6.b = r3
            r3 = 0
            r6.h = r3
            r6.a = r8
            r6.c = r9
            r6.d = r11
            r8 = 0
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0069, IOException -> 0x0060 }
            r9.<init>(r7, r2)     // Catch:{ FileNotFoundException -> 0x0069, IOException -> 0x0060 }
            java.nio.channels.FileChannel r7 = r9.getChannel()     // Catch:{ FileNotFoundException -> 0x005e, IOException -> 0x005c }
            r7.force(r2)     // Catch:{ FileNotFoundException -> 0x005e, IOException -> 0x005c }
            goto L_0x0071
        L_0x005c:
            r7 = move-exception
            goto L_0x0062
        L_0x005e:
            r7 = move-exception
            goto L_0x006b
        L_0x0060:
            r7 = move-exception
            r9 = r8
        L_0x0062:
            java.lang.String r7 = "Couldn't set force on the output channel."
            android.util.Log.w(r0, r7)
            goto L_0x0071
        L_0x0069:
            r7 = move-exception
            r9 = r8
        L_0x006b:
            java.lang.String r10 = "Couldn't open stats file for appending"
            android.util.Log.e(r0, r10, r7)
        L_0x0071:
            r6.f = r9
            if (r9 != 0) goto L_0x0076
            goto L_0x0093
        L_0x0076:
            java.lang.String r7 = "UTF-8"
            if (r12 > 0) goto L_0x0081
            java.io.PrintStream r10 = new java.io.PrintStream     // Catch:{ UnsupportedEncodingException -> 0x008d }
            r10.<init>(r9, r2, r7)     // Catch:{ UnsupportedEncodingException -> 0x008d }
            r8 = r10
            goto L_0x0093
        L_0x0081:
            java.io.PrintStream r10 = new java.io.PrintStream     // Catch:{ UnsupportedEncodingException -> 0x008d }
            java.io.BufferedOutputStream r11 = new java.io.BufferedOutputStream     // Catch:{ UnsupportedEncodingException -> 0x008d }
            r11.<init>(r9, r12)     // Catch:{ UnsupportedEncodingException -> 0x008d }
            r10.<init>(r11, r1, r7)     // Catch:{ UnsupportedEncodingException -> 0x008d }
            r8 = r10
            goto L_0x0093
        L_0x008d:
            r7 = move-exception
            java.lang.String r9 = "Couldn't open print stats files for writing"
            android.util.Log.e(r0, r9, r7)
        L_0x0093:
            r6.g = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jih.<init>(java.io.File, java.util.concurrent.ScheduledExecutorService, long, java.util.concurrent.TimeUnit, int):void");
    }

    private final void a(byte[] bArr) {
        if (this.g != null) {
            this.a.execute(new jig(this, bArr));
        }
    }

    public final Appendable append(char c2) {
        synchronized (this.e) {
            if (this.g != null) {
                a(String.valueOf(c2).getBytes("UTF-8"));
            }
        }
        return this;
    }

    public final void b() {
        synchronized (this.e) {
            if (this.h != 0) {
                FileLock a2 = a();
                try {
                    PrintStream printStream = this.g;
                    if (printStream != null) {
                        printStream.flush();
                        this.i++;
                        this.h = 0;
                    }
                } finally {
                    a2.release();
                }
            }
        }
    }

    public final void close() {
        synchronized (this.e) {
            PrintStream printStream = this.g;
            if (printStream != null) {
                printStream.close();
            }
        }
    }

    public final FileLock a() {
        try {
            return this.f.getChannel().lock();
        } catch (OverlappingFileLockException e2) {
            throw new IOException("Unable to lock file exclusively", e2);
        }
    }

    public final Appendable append(CharSequence charSequence) {
        synchronized (this.e) {
            if (this.g != null) {
                a(charSequence.toString().getBytes("UTF-8"));
            }
        }
        return this;
    }

    public final Appendable append(CharSequence charSequence, int i2, int i3) {
        synchronized (this.e) {
            if (this.g != null) {
                a(charSequence.subSequence(i2, i3).toString().getBytes("UTF-8"));
            }
        }
        return this;
    }
}
