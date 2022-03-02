package defpackage;

import java.io.File;
import java.util.Properties;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@Deprecated
/* renamed from: fzf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fzf {
    private final ReadWriteLock a = new ReentrantReadWriteLock();
    private final File b;
    private final Properties c;
    private boolean d;

    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0080 A[Catch:{ IOException -> 0x0089, all -> 0x0087 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fzf(java.io.File r5) {
        /*
            r4 = this;
            r4.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r4.a = r0
            defpackage.iva.a((java.lang.Object) r5)
            r4.b = r5
            java.util.Properties r5 = new java.util.Properties
            r5.<init>()
            r4.c = r5
            r5 = 0
            r4.d = r5
            java.io.File r5 = r4.b
            boolean r5 = r5.isFile()
            if (r5 != 0) goto L_0x0044
            java.io.File r5 = r4.b
            boolean r5 = r5.exists()
            if (r5 == 0) goto L_0x002e
            java.io.File r5 = r4.b
            r5.delete()
        L_0x002e:
            java.io.File r5 = r4.b
            r5.createNewFile()
            java.io.File r5 = r4.b
            boolean r5 = r5.isFile()
            if (r5 == 0) goto L_0x003c
            goto L_0x0044
        L_0x003c:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r0 = "Failed to create a new file"
            r5.<init>(r0)
            throw r5
        L_0x0044:
            java.util.concurrent.locks.ReadWriteLock r5 = r4.a
            java.util.concurrent.locks.Lock r5 = r5.writeLock()
            r5.lock()
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0075 }
            java.io.File r2 = r4.b     // Catch:{ all -> 0x0075 }
            r1.<init>(r2)     // Catch:{ all -> 0x0075 }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0073 }
            r2.<init>(r1)     // Catch:{ all -> 0x0073 }
            java.util.Properties r0 = r4.c     // Catch:{ all -> 0x006e }
            r0.load(r2)     // Catch:{ all -> 0x006e }
            r2.close()     // Catch:{ IOException -> 0x0068 }
            r5.unlock()
            return
        L_0x0066:
            r0 = move-exception
            goto L_0x006a
        L_0x0068:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x006a:
            r5.unlock()
            throw r0
        L_0x006e:
            r0 = move-exception
            r3 = r2
            r2 = r0
            r0 = r3
            goto L_0x0078
        L_0x0073:
            r2 = move-exception
            goto L_0x0078
        L_0x0075:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L_0x0078:
            if (r0 != 0) goto L_0x0080
            if (r1 == 0) goto L_0x0083
            r1.close()     // Catch:{ IOException -> 0x0089 }
            goto L_0x0083
        L_0x0080:
            r0.close()     // Catch:{ IOException -> 0x0089 }
        L_0x0083:
            r5.unlock()
            throw r2
        L_0x0087:
            r0 = move-exception
            goto L_0x008b
        L_0x0089:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0087 }
        L_0x008b:
            r5.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzf.<init>(java.io.File):void");
    }

    public final String a(String str) {
        iva.a((Object) str, (Object) "Supplied key cannot be null!");
        Lock readLock = this.a.readLock();
        readLock.lock();
        try {
            return this.c.getProperty(str);
        } finally {
            readLock.unlock();
        }
    }

    public final void b(String str) {
        Lock writeLock = this.a.writeLock();
        writeLock.lock();
        try {
            this.c.remove(str);
            this.d = true;
        } finally {
            writeLock.unlock();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0043 A[Catch:{ IOException -> 0x004c, all -> 0x004a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r6 = this;
            java.util.concurrent.locks.ReadWriteLock r0 = r6.a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            r1 = 0
            boolean r2 = r6.d     // Catch:{ all -> 0x0038 }
            if (r2 == 0) goto L_0x0025
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x0038 }
            java.io.File r3 = r6.b     // Catch:{ all -> 0x0038 }
            r2.<init>(r3)     // Catch:{ all -> 0x0038 }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0036 }
            r3.<init>(r2)     // Catch:{ all -> 0x0036 }
            java.util.Properties r4 = r6.c     // Catch:{ all -> 0x0031 }
            r4.store(r3, r1)     // Catch:{ all -> 0x0031 }
            r1 = 0
            r6.d = r1     // Catch:{ all -> 0x0031 }
            r3.close()     // Catch:{ IOException -> 0x002b }
        L_0x0025:
            r0.unlock()
            return
        L_0x0029:
            r1 = move-exception
            goto L_0x002d
        L_0x002b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0029 }
        L_0x002d:
            r0.unlock()
            throw r1
        L_0x0031:
            r1 = move-exception
            r5 = r3
            r3 = r1
            r1 = r5
            goto L_0x003b
        L_0x0036:
            r3 = move-exception
            goto L_0x003b
        L_0x0038:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x003b:
            if (r1 != 0) goto L_0x0043
            if (r2 == 0) goto L_0x0046
            r2.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x0046
        L_0x0043:
            r1.close()     // Catch:{ IOException -> 0x004c }
        L_0x0046:
            r0.unlock()
            throw r3
        L_0x004a:
            r1 = move-exception
            goto L_0x004e
        L_0x004c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004a }
        L_0x004e:
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzf.a():void");
    }

    public final boolean a(String str, String str2, String str3) {
        iva.a((Object) str, (Object) "Supplied key cannot be null!");
        Lock writeLock = this.a.writeLock();
        writeLock.lock();
        try {
            String property = this.c.getProperty(str);
            if (property != null || str3 != null) {
                if (property != null) {
                    if (!property.equals(str3)) {
                    }
                }
                writeLock.unlock();
                return false;
            }
            if (str2 == null) {
                if (this.c.remove(str) != null) {
                    this.d = true;
                }
            } else if (!str2.equals(property)) {
                this.c.setProperty(str, str2);
                this.d = true;
            }
            return true;
        } finally {
            writeLock.unlock();
        }
    }
}
