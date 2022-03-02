package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.BlockingQueue;

/* renamed from: asbk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asbk extends InputStream {
    private final Object a = new Object();
    private final BlockingQueue b;
    private byte[] c = null;
    private int d = 0;
    private boolean e = false;

    public asbk(BlockingQueue blockingQueue) {
        this.b = blockingQueue;
    }

    private final byte[] a() {
        try {
            asbm asbm = (asbm) this.b.take();
            Exception exc = asbm.a;
            if (exc == null) {
                return asbm.b;
            }
            throw new IOException(exc);
        } catch (InterruptedException e2) {
            throw new IOException(e2);
        }
    }

    public final void close() {
        synchronized (this.a) {
            if (!this.e) {
                this.e = true;
                super.close();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.a
            monitor-enter(r0)
            boolean r1 = r4.e     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0027
            byte[] r1 = r4.c     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x000c
            goto L_0x0015
        L_0x000c:
            byte[] r1 = r4.a()     // Catch:{ all -> 0x002a }
            r4.c = r1     // Catch:{ all -> 0x002a }
            r1 = 0
            r4.d = r1     // Catch:{ all -> 0x002a }
        L_0x0015:
            byte[] r1 = r4.c     // Catch:{ all -> 0x002a }
            int r2 = r4.d     // Catch:{ all -> 0x002a }
            int r3 = r2 + 1
            r4.d = r3     // Catch:{ all -> 0x002a }
            byte r2 = r1[r2]     // Catch:{ all -> 0x002a }
            int r1 = r1.length     // Catch:{ all -> 0x002a }
            if (r3 != r1) goto L_0x0025
            r1 = 0
            r4.c = r1     // Catch:{ all -> 0x002a }
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return r2
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r0 = -1
            return r0
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asbk.read():int");
    }

    public final int read(byte[] bArr, int i, int i2) {
        int min;
        synchronized (this.a) {
            if (!this.e) {
                if (this.c == null) {
                    this.c = a();
                    this.d = 0;
                }
                min = Math.min(i2, this.c.length - this.d);
                System.arraycopy(this.c, this.d, bArr, i, min);
                int i3 = this.d + min;
                this.d = i3;
                if (i3 == this.c.length) {
                    this.c = null;
                }
            } else {
                throw new IOException("Stream closed");
            }
        }
        return min;
    }
}
