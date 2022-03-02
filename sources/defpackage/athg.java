package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: athg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class athg extends InputStream {
    protected final InputStream a;
    protected athe b;
    protected int c;
    protected final Object d = new Object();
    protected volatile boolean e;

    public athg(InputStream inputStream, int i) {
        this.a = inputStream;
        this.c = i;
    }

    private final int a(byte[] bArr, int i, int i2) {
        int i3 = this.c;
        if (i3 <= 0) {
            return -1;
        }
        try {
            int read = this.a.read(bArr, i, Math.min(i3, i2));
            if (read > 0) {
                this.c -= read;
            }
            if (read > 0 && this.c != 0) {
                return read;
            }
            b();
            return read;
        } catch (IOException e2) {
            b();
            throw e2;
        }
    }

    private final void b() {
        synchronized (this.d) {
            if (!this.e) {
                this.e = true;
                this.d.notifyAll();
                try {
                    this.a.close();
                } catch (IOException e2) {
                }
            }
        }
    }

    public final synchronized void close() {
        super.close();
        do {
        } while (read() >= 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0053, code lost:
        if (r2 == 0) goto L_0x0055;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read() {
        /*
            r7 = this;
            monitor-enter(r7)
            athe r0 = r7.b     // Catch:{ all -> 0x0062 }
            r1 = -1
            if (r0 == 0) goto L_0x0042
            java.lang.Object r2 = r0.a     // Catch:{ all -> 0x0062 }
            monitor-enter(r2)     // Catch:{ all -> 0x0062 }
        L_0x0009:
            int r3 = r0.c     // Catch:{ all -> 0x003f }
            if (r3 < 0) goto L_0x0031
            byte[] r4 = r0.b     // Catch:{ all -> 0x003f }
            int r5 = r3 + 1
            r0.c = r5     // Catch:{ all -> 0x003f }
            byte r3 = r4[r3]     // Catch:{ all -> 0x003f }
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r4.length     // Catch:{ all -> 0x003f }
            r6 = 0
            if (r5 != r4) goto L_0x001f
            r0.c = r6     // Catch:{ all -> 0x003f }
            r5 = 0
            goto L_0x0020
        L_0x001f:
        L_0x0020:
            int r4 = r0.d     // Catch:{ all -> 0x003f }
            if (r5 == r4) goto L_0x0025
            goto L_0x0029
        L_0x0025:
            r0.c = r1     // Catch:{ all -> 0x003f }
            r0.d = r6     // Catch:{ all -> 0x003f }
        L_0x0029:
            java.lang.Object r0 = r0.a     // Catch:{ all -> 0x003f }
            r0.notifyAll()     // Catch:{ all -> 0x003f }
            monitor-exit(r2)     // Catch:{ all -> 0x003f }
            r1 = r3
            goto L_0x0060
        L_0x0031:
            boolean r3 = r0.e     // Catch:{ all -> 0x003f }
            if (r3 != 0) goto L_0x003d
            java.lang.Object r3 = r0.a     // Catch:{ InterruptedException -> 0x003b }
            r3.wait()     // Catch:{ InterruptedException -> 0x003b }
            goto L_0x0009
        L_0x003b:
            r3 = move-exception
            goto L_0x0009
        L_0x003d:
            monitor-exit(r2)     // Catch:{ all -> 0x003f }
            goto L_0x0060
        L_0x003f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003f }
            throw r0     // Catch:{ all -> 0x0062 }
        L_0x0042:
            int r0 = r7.c     // Catch:{ all -> 0x0062 }
            if (r0 <= 0) goto L_0x005f
            java.io.InputStream r0 = r7.a     // Catch:{ IOException -> 0x005a }
            int r0 = r0.read()     // Catch:{ IOException -> 0x005a }
            if (r0 < 0) goto L_0x0055
            int r2 = r7.c     // Catch:{ IOException -> 0x005a }
            int r2 = r2 + r1
            r7.c = r2     // Catch:{ IOException -> 0x005a }
            if (r2 != 0) goto L_0x0058
        L_0x0055:
            r7.b()     // Catch:{ IOException -> 0x005a }
        L_0x0058:
            r1 = r0
            goto L_0x0060
        L_0x005a:
            r0 = move-exception
            r7.b()     // Catch:{ all -> 0x0062 }
            throw r0     // Catch:{ all -> 0x0062 }
        L_0x005f:
        L_0x0060:
            monitor-exit(r7)
            return r1
        L_0x0062:
            r0 = move-exception
            monitor-exit(r7)
            goto L_0x0066
        L_0x0065:
            throw r0
        L_0x0066:
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.athg.read():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r10.c <= 0) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r3 = a(r1, 0, 1024);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r3 <= 0) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r4 = r10.b;
        r5 = r4.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (r3 <= 0) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r7 = r4.c;
        r8 = r4.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        if (r7 != r8) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.a.notifyAll();
        r4.a.wait();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        if (r7 < 0) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r4.c = 0;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0047, code lost:
        if (r8 >= r7) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0049, code lost:
        r7 = r7 - r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004b, code lost:
        r7 = r4.b.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004f, code lost:
        if (r7 > r3) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0052, code lost:
        r7 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0053, code lost:
        java.lang.System.arraycopy(r1, r6, r4.b, r8, r7);
        r6 = r6 + r7;
        r3 = r3 - r7;
        r8 = r4.d + r7;
        r4.d = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0062, code lost:
        if (r8 != r4.b.length) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0064, code lost:
        r4.d = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0069, code lost:
        r4.a.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006e, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0079, code lost:
        throw new java.io.IOException("Premature EOF");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x007a, code lost:
        r0 = r10.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0080, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0081, code lost:
        r10.b.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0086, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0088, code lost:
        r0 = r10.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r1 = new byte[1024];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r10 = this;
            monitor-enter(r10)
            int r0 = r10.c     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x008b
            athe r1 = r10.b     // Catch:{ all -> 0x008d }
            if (r1 != 0) goto L_0x008b
            athe r1 = new athe     // Catch:{ all -> 0x008d }
            r2 = 65536(0x10000, float:9.18355E-41)
            int r0 = java.lang.Math.min(r2, r0)     // Catch:{ all -> 0x008d }
            r1.<init>(r0)     // Catch:{ all -> 0x008d }
            r10.b = r1     // Catch:{ all -> 0x008d }
            monitor-exit(r10)     // Catch:{ all -> 0x008d }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r0]
        L_0x001b:
            int r2 = r10.c     // Catch:{ IOException -> 0x0087, all -> 0x0080 }
            if (r2 <= 0) goto L_0x007a
            r2 = 0
            int r3 = r10.a(r1, r2, r0)     // Catch:{ IOException -> 0x0087, all -> 0x0080 }
            if (r3 <= 0) goto L_0x0072
            athe r4 = r10.b     // Catch:{ IOException -> 0x0087, all -> 0x0080 }
            java.lang.Object r5 = r4.a     // Catch:{ IOException -> 0x0087, all -> 0x0080 }
            monitor-enter(r5)     // Catch:{ IOException -> 0x0087, all -> 0x0080 }
            r6 = 0
        L_0x002c:
            if (r3 <= 0) goto L_0x0069
        L_0x002e:
            int r7 = r4.c     // Catch:{ all -> 0x0067 }
            int r8 = r4.d     // Catch:{ all -> 0x0067 }
            if (r7 != r8) goto L_0x0041
            java.lang.Object r7 = r4.a     // Catch:{ InterruptedException -> 0x003f }
            r7.notifyAll()     // Catch:{ InterruptedException -> 0x003f }
            java.lang.Object r7 = r4.a     // Catch:{ InterruptedException -> 0x003f }
            r7.wait()     // Catch:{ InterruptedException -> 0x003f }
            goto L_0x002e
        L_0x003f:
            r7 = move-exception
            goto L_0x002e
        L_0x0041:
            if (r7 < 0) goto L_0x0044
            goto L_0x0047
        L_0x0044:
            r4.c = r2     // Catch:{ all -> 0x0067 }
            r7 = 0
        L_0x0047:
            if (r8 >= r7) goto L_0x004b
        L_0x0049:
            int r7 = r7 - r8
            goto L_0x004f
        L_0x004b:
            byte[] r7 = r4.b     // Catch:{ all -> 0x0067 }
            int r7 = r7.length     // Catch:{ all -> 0x0067 }
            goto L_0x0049
        L_0x004f:
            if (r7 > r3) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r7 = r3
        L_0x0053:
            byte[] r9 = r4.b     // Catch:{ all -> 0x0067 }
            java.lang.System.arraycopy(r1, r6, r9, r8, r7)     // Catch:{ all -> 0x0067 }
            int r6 = r6 + r7
            int r3 = r3 - r7
            int r8 = r4.d     // Catch:{ all -> 0x0067 }
            int r8 = r8 + r7
            r4.d = r8     // Catch:{ all -> 0x0067 }
            byte[] r7 = r4.b     // Catch:{ all -> 0x0067 }
            int r7 = r7.length     // Catch:{ all -> 0x0067 }
            if (r8 != r7) goto L_0x002c
            r4.d = r2     // Catch:{ all -> 0x0067 }
            goto L_0x002c
        L_0x0067:
            r0 = move-exception
            goto L_0x0070
        L_0x0069:
            java.lang.Object r2 = r4.a     // Catch:{ all -> 0x0067 }
            r2.notifyAll()     // Catch:{ all -> 0x0067 }
            monitor-exit(r5)     // Catch:{ all -> 0x0067 }
            goto L_0x001b
        L_0x0070:
            monitor-exit(r5)     // Catch:{ all -> 0x0067 }
            throw r0     // Catch:{ IOException -> 0x0087, all -> 0x0080 }
        L_0x0072:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0087, all -> 0x0080 }
            java.lang.String r1 = "Premature EOF"
            r0.<init>(r1)     // Catch:{ IOException -> 0x0087, all -> 0x0080 }
            throw r0     // Catch:{ IOException -> 0x0087, all -> 0x0080 }
        L_0x007a:
            athe r0 = r10.b
        L_0x007c:
            r0.a()
            return
        L_0x0080:
            r0 = move-exception
            athe r1 = r10.b
            r1.a()
            throw r0
        L_0x0087:
            r0 = move-exception
            athe r0 = r10.b
            goto L_0x007c
        L_0x008b:
            monitor-exit(r10)     // Catch:{ all -> 0x008d }
            return
        L_0x008d:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x008d }
            goto L_0x0091
        L_0x0090:
            throw r0
        L_0x0091:
            goto L_0x0090
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.athg.a():void");
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        athe athe = this.b;
        i3 = -1;
        if (athe == null) {
            i3 = a(bArr, i, i2);
        } else if (i2 != 0) {
            synchronized (athe.a) {
                while (true) {
                    int i6 = athe.c;
                    if (i6 < 0) {
                        if (athe.e) {
                            break;
                        }
                        try {
                            athe.a.wait();
                        } catch (InterruptedException e2) {
                        }
                    } else {
                        int i7 = athe.d;
                        if (i6 < i7) {
                            i5 = i7 - i6;
                            i4 = 0;
                        } else {
                            byte[] bArr2 = athe.b;
                            i4 = bArr2.length - i6;
                            if (i4 >= i2) {
                                i5 = i4;
                                i4 = 0;
                            } else {
                                System.arraycopy(bArr2, i6, bArr, i, i4);
                                i += i4;
                                i2 -= i4;
                                i5 = athe.d;
                                athe.c = 0;
                                i6 = 0;
                            }
                        }
                        if (i5 <= i2) {
                            i2 = i5;
                        }
                        System.arraycopy(athe.b, i6, bArr, i, i2);
                        int i8 = i4 + i2;
                        int i9 = athe.c + i2;
                        athe.c = i9;
                        if (i9 == athe.b.length) {
                            athe.c = 0;
                            i9 = 0;
                        }
                        if (i9 == athe.d) {
                            athe.c = -1;
                            athe.d = 0;
                        }
                        athe.a.notifyAll();
                        i3 = i8;
                    }
                }
            }
        } else {
            i3 = 0;
        }
        return i3;
    }
}
