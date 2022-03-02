package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.SyncFailedException;

/* renamed from: kie  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kie {
    private static final ith a = new ith("PendingContent", "");
    private final kkb b;
    private final kkf c;
    private final khx d;
    private final String e;
    private final ParcelFileDescriptor f;
    private volatile boolean g;
    private volatile boolean h;
    private boolean i = false;
    private kic j;

    public kie(kkb kkb, kkf kkf, jiq jiq, khx khx, String str, int i2) {
        iva.a((Object) kkb);
        this.b = kkb;
        iva.a((Object) kkf);
        this.c = kkf;
        iva.a((Object) jiq);
        iva.a((Object) khx);
        this.d = khx;
        iva.c(str);
        this.e = str;
        this.f = ParcelFileDescriptor.open(d(), i2);
    }

    private final synchronized kid f() {
        if (!this.i) {
            kic kic = this.j;
            if (kic != null) {
                kic.flush();
                kic.close();
                return new kid(jjp.d(kic.a.digest()), this.j.b);
            }
        }
        anmy anmy = new anmy(new FileInputStream(d()));
        try {
            return new kid(lru.a((InputStream) anmy), anmy.a);
        } finally {
            jjt.a((Closeable) anmy);
        }
    }

    public final synchronized ParcelFileDescriptor a() {
        boolean z = false;
        if (!this.g && !this.h) {
            z = true;
        }
        iva.a(z, (Object) "Cannot get the file descriptor for committed or abandoned content.");
        this.i = true;
        return this.f;
    }

    public final synchronized kic b() {
        boolean z = false;
        if (!this.g && !this.h) {
            z = true;
        }
        iva.a(z, (Object) "Cannot get an OutputStream for committed or abandoned content.");
        if (this.j == null) {
            this.j = new kic(new FileOutputStream(this.f.getFileDescriptor()));
        }
        return this.j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r6.f.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        a.b("PendingContent", java.lang.String.format("Ignored IOException while closing abandoned content: %s", new java.lang.Object[]{r6.e}), (java.lang.Throwable) r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.h     // Catch:{ all -> 0x004e }
            if (r0 != 0) goto L_0x004c
            boolean r0 = r6.g     // Catch:{ all -> 0x004e }
            if (r0 != 0) goto L_0x004c
            r0 = 1
            r6.h = r0     // Catch:{ all -> 0x004e }
            monitor-exit(r6)     // Catch:{ all -> 0x004e }
            r1 = 0
            android.os.ParcelFileDescriptor r2 = r6.f     // Catch:{ IOException -> 0x0014 }
            r2.close()     // Catch:{ IOException -> 0x0014 }
            goto L_0x0028
        L_0x0014:
            r2 = move-exception
            ith r3 = a
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r5 = r6.e
            r4[r1] = r5
            java.lang.String r5 = "Ignored IOException while closing abandoned content: %s"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            java.lang.String r5 = "PendingContent"
            r3.b((java.lang.String) r5, (java.lang.String) r4, (java.lang.Throwable) r2)
        L_0x0028:
            kkf r2 = r6.c
            java.lang.String r3 = r6.e
            r2.f((java.lang.String) r3)
            java.io.File r2 = r6.d()     // Catch:{ IOException -> 0x0037 }
            r2.delete()     // Catch:{ IOException -> 0x0037 }
            return
        L_0x0037:
            r2 = move-exception
            ith r3 = a
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r4 = r6.e
            r0[r1] = r4
            java.lang.String r1 = "Unable to delete abandoned content; will be garbage collected later: %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            java.lang.String r1 = "PendingContent"
            r3.a((java.lang.String) r1, (java.lang.String) r0, (java.lang.Throwable) r2)
            return
        L_0x004c:
            monitor-exit(r6)     // Catch:{ all -> 0x004e }
            return
        L_0x004e:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x004e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kie.c():void");
    }

    public final File d() {
        return this.d.a(this.e, 0);
    }

    public final long e() {
        return d().length();
    }

    public final Object a(khy khy) {
        boolean z;
        String str;
        synchronized (this) {
            iva.a(!this.g, (Object) "Content has already been committed.");
            iva.a(!this.h, (Object) "Cannot commit content that has already been abandoned.");
            this.g = true;
        }
        FileDescriptor fileDescriptor = this.f.getFileDescriptor();
        if (!fileDescriptor.valid()) {
            a.c("PendingContent", "File FileDescriptor invalid");
        }
        try {
            fileDescriptor.sync();
        } catch (SyncFailedException e2) {
            a.b("PendingContent", "Unable to sync file descriptor, ignoring as best effort", (Throwable) e2);
        }
        this.f.close();
        kid f2 = f();
        long e3 = e();
        if (f2.b != e3) {
            a.b("PendingContent", "Inconsistent file length! viaHash=%d, viaLength=%d", Long.valueOf(f2.b), Long.valueOf(e3));
        }
        this.c.d();
        try {
            knh d2 = this.c.d(f2.a);
            if (d2 == null) {
                kng a2 = knh.a(this.b, f2.a, System.currentTimeMillis(), f2.b);
                a2.c = this.e;
                new knh(a2, false).t();
            } else {
                if (d2.f != f2.b) {
                    a.b("PendingContent", "Matching hash but different fileSize! viaHash=%d, inDB=%d", Long.valueOf(f2.b), Long.valueOf(d2.f));
                }
                d2.e = System.currentTimeMillis();
                String str2 = d2.b;
                if (str2 == null) {
                    d2.a(this.e);
                } else if (!this.d.a(str2, 0).exists()) {
                    a.b("PendingContent", "Content file %s was deleted outside of the content manager; using identical new file %s instead.", str2, this.e);
                    d2.a(this.e);
                } else {
                    try {
                        z = d().delete();
                    } catch (Exception e4) {
                        z = false;
                    }
                    ith ith = a;
                    if (!z) {
                        str = "Unable to delete redundant content; will be garbage collected later: %s";
                    } else {
                        str = "Deleted duplicate successfully: %s";
                    }
                    ith.a("PendingContent", str, this.e);
                }
                d2.t();
            }
            Object a3 = khy.a(f2.a);
            if (a3 != null) {
                this.c.f();
            }
            return a3;
        } finally {
            this.c.e();
            this.c.f(this.e);
        }
    }
}
