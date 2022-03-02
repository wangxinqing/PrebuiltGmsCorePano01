package com.android.volley.toolbox;

import com.android.volley.Cache;
import com.android.volley.VolleyLog;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DiskBasedCache implements Cache {
    private final Map a;
    private long b;
    private final FileSupplier c;
    private final int d;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface FileSupplier {
        File get();
    }

    public DiskBasedCache(FileSupplier fileSupplier) {
        this(fileSupplier, 5242880);
    }

    public static int a(InputStream inputStream) {
        return (c(inputStream) << 24) | c(inputStream) | (c(inputStream) << 8) | (c(inputStream) << 16);
    }

    public static long b(InputStream inputStream) {
        return (((long) c(inputStream)) & 255) | ((((long) c(inputStream)) & 255) << 8) | ((((long) c(inputStream)) & 255) << 16) | ((((long) c(inputStream)) & 255) << 24) | ((((long) c(inputStream)) & 255) << 32) | ((((long) c(inputStream)) & 255) << 40) | ((((long) c(inputStream)) & 255) << 48) | ((255 & ((long) c(inputStream))) << 56);
    }

    private static int c(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public synchronized void clear() {
        File[] listFiles = this.c.get().listFiles();
        if (listFiles != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
        this.a.clear();
        this.b = 0;
        VolleyLog.d("Cache cleared.", new Object[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.android.volley.Cache.Entry get(java.lang.String r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            java.util.Map r0 = r12.a     // Catch:{ all -> 0x00c2 }
            java.lang.Object r0 = r0.get(r13)     // Catch:{ all -> 0x00c2 }
            bfe r0 = (defpackage.bfe) r0     // Catch:{ all -> 0x00c2 }
            r1 = 0
            if (r0 == 0) goto L_0x004b
            java.io.File r2 = r12.getFileForKey(r13)     // Catch:{ all -> 0x00c2 }
            r3 = 1
            r4 = 0
            r5 = 2
            bff r6 = new bff     // Catch:{ IOException -> 0x00a9 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00a9 }
            java.io.InputStream r8 = a((java.io.File) r2)     // Catch:{ IOException -> 0x00a9 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x00a9 }
            long r8 = r2.length()     // Catch:{ IOException -> 0x00a9 }
            r6.<init>(r7, r8)     // Catch:{ IOException -> 0x00a9 }
            bfe r7 = defpackage.bfe.a(r6)     // Catch:{ all -> 0x00a4 }
            java.lang.String r8 = r7.b     // Catch:{ all -> 0x00a4 }
            boolean r8 = android.text.TextUtils.equals(r13, r8)     // Catch:{ all -> 0x00a4 }
            if (r8 != 0) goto L_0x004d
            java.lang.String r0 = "%s: key=%s, found=%s"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x00a4 }
            java.lang.String r9 = r2.getAbsolutePath()     // Catch:{ all -> 0x00a4 }
            r8[r4] = r9     // Catch:{ all -> 0x00a4 }
            r8[r3] = r13     // Catch:{ all -> 0x00a4 }
            java.lang.String r7 = r7.b     // Catch:{ all -> 0x00a4 }
            r8[r5] = r7     // Catch:{ all -> 0x00a4 }
            com.android.volley.VolleyLog.d(r0, r8)     // Catch:{ all -> 0x00a4 }
            r12.a((java.lang.String) r13)     // Catch:{ all -> 0x00a4 }
            r6.close()     // Catch:{ IOException -> 0x00a9 }
        L_0x004b:
            monitor-exit(r12)
            return r1
        L_0x004d:
            long r7 = r6.a()     // Catch:{ all -> 0x00a4 }
            byte[] r7 = a((defpackage.bff) r6, (long) r7)     // Catch:{ all -> 0x00a4 }
            com.android.volley.Cache$Entry r8 = new com.android.volley.Cache$Entry     // Catch:{ all -> 0x00a4 }
            r8.<init>()     // Catch:{ all -> 0x00a4 }
            r8.data = r7     // Catch:{ all -> 0x00a4 }
            java.lang.String r7 = r0.c     // Catch:{ all -> 0x00a4 }
            r8.etag = r7     // Catch:{ all -> 0x00a4 }
            long r9 = r0.d     // Catch:{ all -> 0x00a4 }
            r8.serverDate = r9     // Catch:{ all -> 0x00a4 }
            long r9 = r0.e     // Catch:{ all -> 0x00a4 }
            r8.lastModified = r9     // Catch:{ all -> 0x00a4 }
            long r9 = r0.f     // Catch:{ all -> 0x00a4 }
            r8.ttl = r9     // Catch:{ all -> 0x00a4 }
            long r9 = r0.g     // Catch:{ all -> 0x00a4 }
            r8.softTtl = r9     // Catch:{ all -> 0x00a4 }
            java.util.List r7 = r0.h     // Catch:{ all -> 0x00a4 }
            java.util.TreeMap r9 = new java.util.TreeMap     // Catch:{ all -> 0x00a4 }
            java.util.Comparator r10 = java.lang.String.CASE_INSENSITIVE_ORDER     // Catch:{ all -> 0x00a4 }
            r9.<init>(r10)     // Catch:{ all -> 0x00a4 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00a4 }
        L_0x007d:
            boolean r10 = r7.hasNext()     // Catch:{ all -> 0x00a4 }
            if (r10 == 0) goto L_0x0095
            java.lang.Object r10 = r7.next()     // Catch:{ all -> 0x00a4 }
            com.android.volley.Header r10 = (com.android.volley.Header) r10     // Catch:{ all -> 0x00a4 }
            java.lang.String r11 = r10.getName()     // Catch:{ all -> 0x00a4 }
            java.lang.String r10 = r10.getValue()     // Catch:{ all -> 0x00a4 }
            r9.put(r11, r10)     // Catch:{ all -> 0x00a4 }
            goto L_0x007d
        L_0x0095:
            r8.responseHeaders = r9     // Catch:{ all -> 0x00a4 }
            java.util.List r0 = r0.h     // Catch:{ all -> 0x00a4 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x00a4 }
            r8.allResponseHeaders = r0     // Catch:{ all -> 0x00a4 }
            r6.close()     // Catch:{ IOException -> 0x00a9 }
            monitor-exit(r12)
            return r8
        L_0x00a4:
            r0 = move-exception
            r6.close()     // Catch:{ IOException -> 0x00a9 }
            throw r0     // Catch:{ IOException -> 0x00a9 }
        L_0x00a9:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x00c2 }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ all -> 0x00c2 }
            r5[r4] = r2     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00c2 }
            r5[r3] = r0     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = "%s: %s"
            com.android.volley.VolleyLog.d(r0, r5)     // Catch:{ all -> 0x00c2 }
            r12.remove(r13)     // Catch:{ all -> 0x00c2 }
            monitor-exit(r12)
            return r1
        L_0x00c2:
            r13 = move-exception
            monitor-exit(r12)
            goto L_0x00c6
        L_0x00c5:
            throw r13
        L_0x00c6:
            goto L_0x00c5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.DiskBasedCache.get(java.lang.String):com.android.volley.Cache$Entry");
    }

    public File getFileForKey(String str) {
        return new File(this.c.get(), b(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void initialize() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.android.volley.toolbox.DiskBasedCache$FileSupplier r0 = r9.c     // Catch:{ all -> 0x005e }
            java.io.File r0 = r0.get()     // Catch:{ all -> 0x005e }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x005e }
            r2 = 0
            if (r1 != 0) goto L_0x0024
            boolean r1 = r0.mkdirs()     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x0022
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x005e }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x005e }
            r1[r2] = r0     // Catch:{ all -> 0x005e }
            java.lang.String r0 = "Unable to create cache dir %s"
            com.android.volley.VolleyLog.e(r0, r1)     // Catch:{ all -> 0x005e }
        L_0x0022:
            monitor-exit(r9)
            return
        L_0x0024:
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x005c
            int r1 = r0.length     // Catch:{ all -> 0x005e }
        L_0x002b:
            if (r2 >= r1) goto L_0x005c
            r3 = r0[r2]     // Catch:{ all -> 0x005e }
            long r4 = r3.length()     // Catch:{ IOException -> 0x0055 }
            bff r6 = new bff     // Catch:{ IOException -> 0x0055 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0055 }
            java.io.InputStream r8 = a((java.io.File) r3)     // Catch:{ IOException -> 0x0055 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0055 }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x0055 }
            bfe r7 = defpackage.bfe.a(r6)     // Catch:{ all -> 0x0050 }
            r7.a = r4     // Catch:{ all -> 0x0050 }
            java.lang.String r4 = r7.b     // Catch:{ all -> 0x0050 }
            r9.a((java.lang.String) r4, (defpackage.bfe) r7)     // Catch:{ all -> 0x0050 }
            r6.close()     // Catch:{ IOException -> 0x0055 }
            goto L_0x0059
        L_0x0050:
            r4 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0055 }
            throw r4     // Catch:{ IOException -> 0x0055 }
        L_0x0055:
            r4 = move-exception
            r3.delete()     // Catch:{ all -> 0x005e }
        L_0x0059:
            int r2 = r2 + 1
            goto L_0x002b
        L_0x005c:
            monitor-exit(r9)
            return
        L_0x005e:
            r0 = move-exception
            monitor-exit(r9)
            goto L_0x0062
        L_0x0061:
            throw r0
        L_0x0062:
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.DiskBasedCache.initialize():void");
    }

    public synchronized void invalidate(String str, boolean z) {
        Cache.Entry entry = get(str);
        if (entry != null) {
            entry.softTtl = 0;
            if (z) {
                entry.ttl = 0;
            }
            put(str, entry);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x019b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void put(java.lang.String r22, com.android.volley.Cache.Entry r23) {
        /*
            r21 = this;
            r1 = r21
            r0 = r23
            monitor-enter(r21)
            long r2 = r1.b     // Catch:{ all -> 0x01de }
            byte[] r4 = r0.data     // Catch:{ all -> 0x01de }
            int r4 = r4.length     // Catch:{ all -> 0x01de }
            int r5 = r1.d     // Catch:{ all -> 0x01de }
            long r6 = (long) r4
            long r2 = r2 + r6
            long r6 = (long) r5
            r8 = 1063675494(0x3f666666, float:0.9)
            int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x0021
            float r2 = (float) r4
            float r3 = (float) r5
            float r3 = r3 * r8
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            monitor-exit(r21)
            return
        L_0x0021:
            java.io.File r2 = r21.getFileForKey(r22)     // Catch:{ all -> 0x01de }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x01c4 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x01c4 }
            r6.<init>(r2)     // Catch:{ IOException -> 0x01c4 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x01c4 }
            bfe r6 = new bfe     // Catch:{ IOException -> 0x01c4 }
            java.lang.String r11 = r0.etag     // Catch:{ IOException -> 0x01c4 }
            long r12 = r0.serverDate     // Catch:{ IOException -> 0x01c4 }
            long r14 = r0.lastModified     // Catch:{ IOException -> 0x01c4 }
            long r9 = r0.ttl     // Catch:{ IOException -> 0x01c4 }
            long r3 = r0.softTtl     // Catch:{ IOException -> 0x01c4 }
            java.util.List r7 = r0.allResponseHeaders     // Catch:{ IOException -> 0x01c4 }
            if (r7 != 0) goto L_0x007e
            java.util.Map r7 = r0.responseHeaders     // Catch:{ IOException -> 0x01c4 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ IOException -> 0x01c4 }
            r16 = r9
            int r9 = r7.size()     // Catch:{ IOException -> 0x01c4 }
            r8.<init>(r9)     // Catch:{ IOException -> 0x01c4 }
            java.util.Set r7 = r7.entrySet()     // Catch:{ IOException -> 0x01c4 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ IOException -> 0x01c4 }
        L_0x0054:
            boolean r9 = r7.hasNext()     // Catch:{ IOException -> 0x01c4 }
            if (r9 == 0) goto L_0x007b
            java.lang.Object r9 = r7.next()     // Catch:{ IOException -> 0x01c4 }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ IOException -> 0x01c4 }
            com.android.volley.Header r10 = new com.android.volley.Header     // Catch:{ IOException -> 0x01c4 }
            java.lang.Object r18 = r9.getKey()     // Catch:{ IOException -> 0x01c4 }
            r19 = r7
            r7 = r18
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x01c4 }
            java.lang.Object r9 = r9.getValue()     // Catch:{ IOException -> 0x01c4 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ IOException -> 0x01c4 }
            r10.<init>(r7, r9)     // Catch:{ IOException -> 0x01c4 }
            r8.add(r10)     // Catch:{ IOException -> 0x01c4 }
            r7 = r19
            goto L_0x0054
        L_0x007b:
            r20 = r8
            goto L_0x0082
        L_0x007e:
            r16 = r9
            r20 = r7
        L_0x0082:
            r7 = r16
            r9 = r6
            r10 = r22
            r18 = r3
            r9.<init>(r10, r11, r12, r14, r16, r18, r20)     // Catch:{ IOException -> 0x01c4 }
            r3 = 538247942(0x20150306, float:1.2621791E-19)
            a((java.io.OutputStream) r5, (int) r3)     // Catch:{ IOException -> 0x019c }
            java.lang.String r3 = r6.b     // Catch:{ IOException -> 0x019c }
            a((java.io.OutputStream) r5, (java.lang.String) r3)     // Catch:{ IOException -> 0x019c }
            java.lang.String r3 = r6.c     // Catch:{ IOException -> 0x019c }
            if (r3 == 0) goto L_0x009c
            goto L_0x009e
        L_0x009c:
            java.lang.String r3 = ""
        L_0x009e:
            a((java.io.OutputStream) r5, (java.lang.String) r3)     // Catch:{ IOException -> 0x019c }
            long r3 = r6.d     // Catch:{ IOException -> 0x019c }
            a((java.io.OutputStream) r5, (long) r3)     // Catch:{ IOException -> 0x019c }
            long r3 = r6.e     // Catch:{ IOException -> 0x019c }
            a((java.io.OutputStream) r5, (long) r3)     // Catch:{ IOException -> 0x019c }
            long r3 = r6.f     // Catch:{ IOException -> 0x019c }
            a((java.io.OutputStream) r5, (long) r3)     // Catch:{ IOException -> 0x019c }
            long r3 = r6.g     // Catch:{ IOException -> 0x019c }
            a((java.io.OutputStream) r5, (long) r3)     // Catch:{ IOException -> 0x019c }
            java.util.List r3 = r6.h     // Catch:{ IOException -> 0x019c }
            if (r3 == 0) goto L_0x00df
            int r4 = r3.size()     // Catch:{ IOException -> 0x019c }
            a((java.io.OutputStream) r5, (int) r4)     // Catch:{ IOException -> 0x019c }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IOException -> 0x019c }
        L_0x00c4:
            boolean r4 = r3.hasNext()     // Catch:{ IOException -> 0x019c }
            if (r4 == 0) goto L_0x00e4
            java.lang.Object r4 = r3.next()     // Catch:{ IOException -> 0x019c }
            com.android.volley.Header r4 = (com.android.volley.Header) r4     // Catch:{ IOException -> 0x019c }
            java.lang.String r7 = r4.getName()     // Catch:{ IOException -> 0x019c }
            a((java.io.OutputStream) r5, (java.lang.String) r7)     // Catch:{ IOException -> 0x019c }
            java.lang.String r4 = r4.getValue()     // Catch:{ IOException -> 0x019c }
            a((java.io.OutputStream) r5, (java.lang.String) r4)     // Catch:{ IOException -> 0x019c }
            goto L_0x00c4
        L_0x00df:
            r3 = 0
            a((java.io.OutputStream) r5, (int) r3)     // Catch:{ IOException -> 0x019c }
        L_0x00e4:
            r5.flush()     // Catch:{ IOException -> 0x019c }
            byte[] r0 = r0.data     // Catch:{ IOException -> 0x01c4 }
            r5.write(r0)     // Catch:{ IOException -> 0x01c4 }
            r5.close()     // Catch:{ IOException -> 0x01c4 }
            long r3 = r2.length()     // Catch:{ IOException -> 0x01c4 }
            r6.a = r3     // Catch:{ IOException -> 0x01c4 }
            r0 = r22
            r1.a((java.lang.String) r0, (defpackage.bfe) r6)     // Catch:{ IOException -> 0x01c4 }
            long r3 = r1.b     // Catch:{ IOException -> 0x01c4 }
            int r0 = r1.d     // Catch:{ IOException -> 0x01c4 }
            long r5 = (long) r0     // Catch:{ IOException -> 0x01c4 }
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x019a
            boolean r0 = com.android.volley.VolleyLog.DEBUG     // Catch:{ IOException -> 0x01c4 }
            if (r0 != 0) goto L_0x0108
            goto L_0x0110
        L_0x0108:
            java.lang.String r0 = "Pruning old cache entries."
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x01c4 }
            com.android.volley.VolleyLog.v(r0, r4)     // Catch:{ IOException -> 0x01c4 }
        L_0x0110:
            long r3 = r1.b     // Catch:{ IOException -> 0x01c4 }
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x01c4 }
            java.util.Map r0 = r1.a     // Catch:{ IOException -> 0x01c4 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ IOException -> 0x01c4 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x01c4 }
            r8 = 0
        L_0x0121:
            boolean r7 = r0.hasNext()     // Catch:{ IOException -> 0x01c4 }
            r9 = 2
            if (r7 == 0) goto L_0x0170
            java.lang.Object r7 = r0.next()     // Catch:{ IOException -> 0x01c4 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ IOException -> 0x01c4 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ IOException -> 0x01c4 }
            r10 = r7
            bfe r10 = (defpackage.bfe) r10     // Catch:{ IOException -> 0x01c4 }
            java.lang.String r7 = r10.b     // Catch:{ IOException -> 0x01c4 }
            java.io.File r7 = r1.getFileForKey(r7)     // Catch:{ IOException -> 0x01c4 }
            boolean r7 = r7.delete()     // Catch:{ IOException -> 0x01c4 }
            if (r7 != 0) goto L_0x0155
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x01c4 }
            java.lang.String r7 = r10.b     // Catch:{ IOException -> 0x01c4 }
            r10 = 0
            r11[r10] = r7     // Catch:{ IOException -> 0x01c4 }
            java.lang.String r7 = b((java.lang.String) r7)     // Catch:{ IOException -> 0x01c4 }
            r10 = 1
            r11[r10] = r7     // Catch:{ IOException -> 0x01c4 }
            java.lang.String r10 = "Could not delete cache entry for key=%s, filename=%s"
            com.android.volley.VolleyLog.d(r10, r11)     // Catch:{ IOException -> 0x01c4 }
            goto L_0x015c
        L_0x0155:
            long r11 = r1.b     // Catch:{ IOException -> 0x01c4 }
            long r13 = r10.a     // Catch:{ IOException -> 0x01c4 }
            long r11 = r11 - r13
            r1.b = r11     // Catch:{ IOException -> 0x01c4 }
        L_0x015c:
            r0.remove()     // Catch:{ IOException -> 0x01c4 }
            int r8 = r8 + 1
            long r10 = r1.b     // Catch:{ IOException -> 0x01c4 }
            float r10 = (float) r10     // Catch:{ IOException -> 0x01c4 }
            int r11 = r1.d     // Catch:{ IOException -> 0x01c4 }
            float r11 = (float) r11     // Catch:{ IOException -> 0x01c4 }
            r12 = 1063675494(0x3f666666, float:0.9)
            float r11 = r11 * r12
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 >= 0) goto L_0x0121
        L_0x0170:
            boolean r0 = com.android.volley.VolleyLog.DEBUG     // Catch:{ IOException -> 0x01c4 }
            if (r0 == 0) goto L_0x019a
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IOException -> 0x01c4 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x01c4 }
            r10 = 0
            r0[r10] = r8     // Catch:{ IOException -> 0x01c4 }
            long r10 = r1.b     // Catch:{ IOException -> 0x01c4 }
            long r10 = r10 - r3
            java.lang.Long r3 = java.lang.Long.valueOf(r10)     // Catch:{ IOException -> 0x01c4 }
            r4 = 1
            r0[r4] = r3     // Catch:{ IOException -> 0x01c4 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x01c4 }
            long r3 = r3 - r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ IOException -> 0x01c4 }
            r0[r9] = r3     // Catch:{ IOException -> 0x01c4 }
            java.lang.String r3 = "pruned %d files, %d bytes, %d ms"
            com.android.volley.VolleyLog.v(r3, r0)     // Catch:{ IOException -> 0x01c4 }
            monitor-exit(r21)
            return
        L_0x019a:
            monitor-exit(r21)
            return
        L_0x019c:
            r0 = move-exception
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x01c4 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x01c4 }
            r3 = 0
            r4[r3] = r0     // Catch:{ IOException -> 0x01c4 }
            java.lang.String r0 = "%s"
            com.android.volley.VolleyLog.d(r0, r4)     // Catch:{ IOException -> 0x01c4 }
            r5.close()     // Catch:{ IOException -> 0x01c4 }
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x01c4 }
            java.lang.String r3 = r2.getAbsolutePath()     // Catch:{ IOException -> 0x01c4 }
            r4 = 0
            r0[r4] = r3     // Catch:{ IOException -> 0x01c4 }
            java.lang.String r3 = "Failed to write header for %s"
            com.android.volley.VolleyLog.d(r3, r0)     // Catch:{ IOException -> 0x01c4 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x01c4 }
            r0.<init>()     // Catch:{ IOException -> 0x01c4 }
            throw r0     // Catch:{ IOException -> 0x01c4 }
        L_0x01c4:
            r0 = move-exception
            boolean r0 = r2.delete()     // Catch:{ all -> 0x01de }
            if (r0 != 0) goto L_0x01dc
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x01de }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ all -> 0x01de }
            r3 = 0
            r0[r3] = r2     // Catch:{ all -> 0x01de }
            java.lang.String r2 = "Could not clean up file %s"
            com.android.volley.VolleyLog.d(r2, r0)     // Catch:{ all -> 0x01de }
            monitor-exit(r21)
            return
        L_0x01dc:
            monitor-exit(r21)
            return
        L_0x01de:
            r0 = move-exception
            monitor-exit(r21)
            goto L_0x01e2
        L_0x01e1:
            throw r0
        L_0x01e2:
            goto L_0x01e1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.DiskBasedCache.put(java.lang.String, com.android.volley.Cache$Entry):void");
    }

    public synchronized void remove(String str) {
        boolean delete = getFileForKey(str).delete();
        a(str);
        if (!delete) {
            VolleyLog.d("Could not delete cache entry for key=%s, filename=%s", str, b(str));
        }
    }

    public DiskBasedCache(FileSupplier fileSupplier, int i) {
        this.a = new LinkedHashMap(16, 0.75f, true);
        this.b = 0;
        this.c = fileSupplier;
        this.d = i;
    }

    static final InputStream a(File file) {
        return new FileInputStream(file);
    }

    private static final String b(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    public static String a(bff bff) {
        return new String(a(bff, b((InputStream) bff)), "UTF-8");
    }

    public DiskBasedCache(File file) {
        this(file, 5242880);
    }

    static void a(OutputStream outputStream, int i) {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    public DiskBasedCache(File file, int i) {
        this.a = new LinkedHashMap(16, 0.75f, true);
        this.b = 0;
        this.c = new bfd(file);
        this.d = i;
    }

    static void a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    static void a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        a(outputStream, (long) length);
        outputStream.write(bytes, 0, length);
    }

    private final void a(String str) {
        bfe bfe = (bfe) this.a.remove(str);
        if (bfe != null) {
            this.b -= bfe.a;
        }
    }

    private final void a(String str, bfe bfe) {
        if (this.a.containsKey(str)) {
            this.b += bfe.a - ((bfe) this.a.get(str)).a;
        } else {
            this.b += bfe.a;
        }
        this.a.put(str, bfe);
    }

    static byte[] a(bff bff, long j) {
        long a2 = bff.a();
        if (j >= 0 && j <= a2) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(bff).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(a2);
        throw new IOException(sb.toString());
    }
}
