package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: ajcc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajcc {
    final long a;
    ahqo b;
    public long c;
    long d;
    private final String e;
    private final ajcb f = new ajcb();

    public ajcc(String str, ahqo ahqo, long j, long j2) {
        this.e = str;
        this.b = ahqo;
        this.a = j;
        a(j2);
    }

    private static long a(long j, long j2, long j3, long j4) {
        return Math.min(j4, (j + j2) - j3);
    }

    private final void d() {
        this.c = 0;
        this.d = -1;
    }

    public final synchronized long b(long j) {
        e(j);
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void c() {
        this.f.a();
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean c(long j) {
        return j <= this.c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void e(long r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            long r0 = r8.d     // Catch:{ all -> 0x005b }
            r2 = -1
            r4 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x001f
            ahqo r2 = r8.b     // Catch:{ all -> 0x005b }
            long r6 = r2.b     // Catch:{ all -> 0x005b }
            long r9 = r9 - r0
            long r9 = r9 / r6
            int r3 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r3 < 0) goto L_0x0025
            long r2 = r2.a     // Catch:{ all -> 0x005b }
            long r4 = r2 * r9
            long r9 = r9 * r6
            long r9 = r9 + r0
            r8.d = r9     // Catch:{ all -> 0x005b }
            goto L_0x0026
        L_0x001f:
            ahqo r2 = r8.b     // Catch:{ all -> 0x005b }
            long r4 = r2.a     // Catch:{ all -> 0x005b }
            r8.d = r9     // Catch:{ all -> 0x005b }
        L_0x0025:
        L_0x0026:
            long r9 = r8.c     // Catch:{ all -> 0x005b }
            long r4 = r4 + r9
            ahqo r2 = r8.b     // Catch:{ all -> 0x005b }
            long r2 = r2.c     // Catch:{ all -> 0x005b }
            long r2 = java.lang.Math.min(r4, r2)     // Catch:{ all -> 0x005b }
            r8.c = r2     // Catch:{ all -> 0x005b }
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x0038
            goto L_0x0040
        L_0x0038:
            long r9 = r8.d     // Catch:{ all -> 0x005b }
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0040
            monitor-exit(r8)
            return
        L_0x0040:
            java.lang.String r9 = r8.toString()     // Catch:{ all -> 0x005b }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x005b }
            java.lang.String r10 = "Adjusted: "
            int r0 = r9.length()     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x0057
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x005b }
            r9.<init>(r10)     // Catch:{ all -> 0x005b }
        L_0x0055:
            monitor-exit(r8)
            return
        L_0x0057:
            r10.concat(r9)     // Catch:{ all -> 0x005b }
            goto L_0x0055
        L_0x005b:
            r9 = move-exception
            monitor-exit(r8)
            goto L_0x005f
        L_0x005e:
            throw r9
        L_0x005f:
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajcc.e(long):void");
    }

    public final synchronized String toString() {
        SimpleDateFormat simpleDateFormat;
        simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.ENGLISH);
        return String.format(Locale.ENGLISH, "%s - current tokens: %d, last refill: %s, params: %s", new Object[]{this.e, Long.valueOf(this.c), simpleDateFormat.format(new Date(this.a + this.d)), this.b});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.ajca a(long r11, long r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            r1 = 0
            int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x0025
            r10.e(r13)     // Catch:{ all -> 0x0027 }
            r9 = 0
            r4 = r10
            r5 = r11
            r7 = r13
            boolean r13 = r4.a(r5, r7, r9)     // Catch:{ all -> 0x0027 }
            if (r13 == 0) goto L_0x0025
            long r13 = r10.c     // Catch:{ all -> 0x0027 }
            long r13 = r13 - r11
            long r13 = java.lang.Math.max(r1, r13)     // Catch:{ all -> 0x0027 }
            r10.c = r13     // Catch:{ all -> 0x0027 }
            ajca r13 = new ajca     // Catch:{ all -> 0x0027 }
            r13.<init>(r10, r11)     // Catch:{ all -> 0x0027 }
            monitor-exit(r10)
            return r13
        L_0x0025:
            monitor-exit(r10)
            return r0
        L_0x0027:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajcc.a(long, long):ajca");
    }

    /* access modifiers changed from: package-private */
    public final synchronized artr b() {
        return this.f.c();
    }

    public final synchronized long d(long j) {
        if (j < 0) {
            return 0;
        }
        long min = Math.min(j, this.b.c - this.c);
        this.c = Math.min(this.c + min, this.b.c);
        return min;
    }

    public final synchronized void b(long j, long j2) {
        if (j >= 0) {
            e(j2);
            this.c = Math.max(0, this.c - j);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized aqek a() {
        return this.f.b();
    }

    public final synchronized void a(long j) {
        d();
        e(j);
    }

    public final synchronized void a(long j, long j2, long j3, aqek aqek) {
        aqek aqek2 = aqek;
        synchronized (this) {
            if (aqek2 != null) {
                long c2 = aqek2.c(2);
                long c3 = aqek2.c(1);
                if (a(j2, j3, this.a, j) + 86400000 < j || c2 == -1) {
                    d();
                } else {
                    this.d = a(j2, c2, this.a, j);
                    this.c = Math.min(this.b.c, c3);
                }
                e(j);
                return;
            }
            a(j);
        }
    }

    public final synchronized void a(ahqo ahqo, long j) {
        e(j);
        long j2 = this.c;
        long j3 = ahqo.c;
        if (j2 > j3) {
            this.c = j3;
        }
        String valueOf = String.valueOf(ahqo.toString());
        if (valueOf.length() == 0) {
            new String("Updated bucket parameters to ");
        } else {
            "Updated bucket parameters to ".concat(valueOf);
        }
        this.b = ahqo;
    }

    public final synchronized void a(aqek aqek) {
        aqek.b(1, this.c);
        aqek.b(2, this.d);
    }

    public final synchronized boolean a(long j, long j2, boolean z) {
        boolean c2;
        e(j2);
        c2 = c(j);
        if (z) {
            this.f.a(!c2);
        }
        return c2;
    }
}
