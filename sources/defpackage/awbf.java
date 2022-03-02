package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;

/* renamed from: awbf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awbf {
    long a = 0;
    long b;
    public final int c;
    public final awbb d;
    public List e;
    public final awbd f;
    final awbc g;
    public final awbe h = new awbe(this);
    public final awbe i = new awbe(this);
    public awak j = null;

    public awbf(int i2, awbb awbb, boolean z, boolean z2) {
        if (awbb != null) {
            this.c = i2;
            this.d = awbb;
            this.b = (long) awbb.m.c();
            this.f = new awbd(this, (long) awbb.l.c());
            this.g = new awbc(this);
            this.f.e = z2;
            this.g.b = z;
            return;
        }
        throw new NullPointerException("connection == null");
    }

    private final boolean d(awak awak) {
        synchronized (this) {
            if (this.j != null) {
                return false;
            }
            if (this.f.e) {
                awbc awbc = this.g;
                int i2 = awbc.d;
                if (awbc.b) {
                    return false;
                }
            }
            this.j = awak;
            notifyAll();
            this.d.b(this.c);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        this.b += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }

    public final void b(awak awak) {
        if (d(awak)) {
            this.d.a(this.c, awak);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        r4.h.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List c() {
        /*
            r4 = this;
            monitor-enter(r4)
            awbe r0 = r4.h     // Catch:{ all -> 0x004c }
            r0.c()     // Catch:{ all -> 0x004c }
        L_0x0006:
            java.util.List r0 = r4.e     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x000b
            goto L_0x0013
        L_0x000b:
            awak r0 = r4.j     // Catch:{ all -> 0x0045 }
            if (r0 != 0) goto L_0x0013
            r4.h()     // Catch:{ all -> 0x0045 }
            goto L_0x0006
        L_0x0013:
            awbe r0 = r4.h     // Catch:{ all -> 0x004c }
            r0.b()     // Catch:{ all -> 0x004c }
            java.util.List r0 = r4.e     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x001e
            monitor-exit(r4)
            return r0
        L_0x001e:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x004c }
            awak r1 = r4.j     // Catch:{ all -> 0x004c }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x004c }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x004c }
            int r2 = r2.length()     // Catch:{ all -> 0x004c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            int r2 = r2 + 18
            r3.<init>(r2)     // Catch:{ all -> 0x004c }
            java.lang.String r2 = "stream was reset: "
            r3.append(r2)     // Catch:{ all -> 0x004c }
            r3.append(r1)     // Catch:{ all -> 0x004c }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x004c }
            r0.<init>(r1)     // Catch:{ all -> 0x004c }
            throw r0     // Catch:{ all -> 0x004c }
        L_0x0045:
            r0 = move-exception
            awbe r1 = r4.h     // Catch:{ all -> 0x004c }
            r1.b()     // Catch:{ all -> 0x004c }
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
            monitor-exit(r4)
            goto L_0x0050
        L_0x004f:
            throw r0
        L_0x0050:
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awbf.c():java.util.List");
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        boolean a2;
        synchronized (this) {
            this.f.e = true;
            a2 = a();
            notifyAll();
        }
        if (!a2) {
            this.d.b(this.c);
        }
    }

    public final void f() {
        boolean z;
        boolean a2;
        synchronized (this) {
            awbd awbd = this.f;
            z = true;
            if (!awbd.e && awbd.d) {
                awbc awbc = this.g;
                int i2 = awbc.d;
                if (!awbc.b) {
                    if (awbc.a) {
                    }
                }
                a2 = a();
            }
            z = false;
            a2 = a();
        }
        if (z) {
            a(awak.CANCEL);
        } else if (!a2) {
            this.d.b(this.c);
        }
    }

    public final void g() {
        awbc awbc = this.g;
        int i2 = awbc.d;
        if (awbc.a) {
            throw new IOException("stream closed");
        } else if (!awbc.b) {
            awak awak = this.j;
            if (awak != null) {
                String valueOf = String.valueOf(awak);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("stream was reset: ");
                sb.append(valueOf);
                throw new IOException(sb.toString());
            }
        } else {
            throw new IOException("stream finished");
        }
    }

    public final void h() {
        try {
            wait();
        } catch (InterruptedException e2) {
            throw new InterruptedIOException();
        }
    }

    public final void a(awak awak) {
        if (d(awak)) {
            this.d.b(this.c, awak);
        }
    }

    public final boolean b() {
        return this.d.c == (this.c & true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r0.a == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        if (r3.e == null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a() {
        /*
            r3 = this;
            monitor-enter(r3)
            awak r0 = r3.j     // Catch:{ all -> 0x0025 }
            r1 = 0
            if (r0 != 0) goto L_0x0023
            awbd r0 = r3.f     // Catch:{ all -> 0x0025 }
            boolean r2 = r0.e     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x0010
            boolean r0 = r0.d     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0020
        L_0x0010:
            awbc r0 = r3.g     // Catch:{ all -> 0x0025 }
            int r2 = defpackage.awbc.d     // Catch:{ all -> 0x0025 }
            boolean r2 = r0.b     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x001c
            boolean r0 = r0.a     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0020
        L_0x001c:
            java.util.List r0 = r3.e     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x0023
        L_0x0020:
            r0 = 1
            monitor-exit(r3)
            return r0
        L_0x0023:
            monitor-exit(r3)
            return r1
        L_0x0025:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awbf.a():boolean");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void c(awak awak) {
        if (this.j == null) {
            this.j = awak;
            notifyAll();
        }
    }

    public final batz d() {
        synchronized (this) {
            if (this.e == null) {
                if (!b()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.g;
    }
}
