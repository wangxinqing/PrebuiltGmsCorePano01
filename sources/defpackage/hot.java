package defpackage;

import java.util.concurrent.locks.Lock;

/* renamed from: hot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class hot {
    public final String a;
    ov b;
    final /* synthetic */ hph c;
    private final Object d;
    private int e;
    private int f;

    protected hot(hph hph, hot hot) {
        this(hph, hot.a);
        synchronized (hot.d) {
            this.e = hot.e;
            ov ovVar = this.b;
            this.b = hot.b;
            hot.b = ovVar;
            hot.e = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(long r8, long r10, java.lang.Integer r12) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.d
            monitor-enter(r0)
            ov r1 = r7.b     // Catch:{ all -> 0x0080 }
            int r2 = r12.intValue()     // Catch:{ all -> 0x0080 }
            java.lang.Object r1 = r1.a(r2)     // Catch:{ all -> 0x0080 }
            oh r1 = (defpackage.oh) r1     // Catch:{ all -> 0x0080 }
            if (r1 != 0) goto L_0x0020
            oh r1 = new oh     // Catch:{ all -> 0x0080 }
            r1.<init>()     // Catch:{ all -> 0x0080 }
            ov r2 = r7.b     // Catch:{ all -> 0x0080 }
            int r12 = r12.intValue()     // Catch:{ all -> 0x0080 }
            r2.b(r12, r1)     // Catch:{ all -> 0x0080 }
            goto L_0x0021
        L_0x0020:
        L_0x0021:
            int r12 = r7.e     // Catch:{ all -> 0x0080 }
            hph r2 = r7.c     // Catch:{ all -> 0x0080 }
            hpa r3 = defpackage.hph.a     // Catch:{ all -> 0x0080 }
            int r3 = r2.c     // Catch:{ all -> 0x0080 }
            r4 = 0
            if (r12 >= r3) goto L_0x002d
            goto L_0x0052
        L_0x002d:
            boolean r2 = r2.f     // Catch:{ all -> 0x0080 }
            if (r2 != 0) goto L_0x0052
            if (r12 != r3) goto L_0x0050
            java.lang.String r8 = "Counters"
            java.lang.String r9 = "exceeded sample count in "
            java.lang.String r10 = r7.a     // Catch:{ all -> 0x0080 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0080 }
            int r11 = r10.length()     // Catch:{ all -> 0x0080 }
            if (r11 != 0) goto L_0x0049
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x0080 }
            r10.<init>(r9)     // Catch:{ all -> 0x0080 }
            goto L_0x004d
        L_0x0049:
            java.lang.String r10 = r9.concat(r10)     // Catch:{ all -> 0x0080 }
        L_0x004d:
            android.util.Log.i(r8, r10)     // Catch:{ all -> 0x0080 }
        L_0x0050:
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            return r4
        L_0x0052:
            r2 = 1
            int r12 = r12 + r2
            r7.e = r12     // Catch:{ all -> 0x0080 }
            java.lang.Object r12 = r1.a((long) r8)     // Catch:{ all -> 0x0080 }
            long[] r12 = (long[]) r12     // Catch:{ all -> 0x0080 }
            if (r12 != 0) goto L_0x0068
            long[] r12 = new long[r2]     // Catch:{ all -> 0x0080 }
            r5 = 0
            r12[r4] = r5     // Catch:{ all -> 0x0080 }
            r1.b(r8, r12)     // Catch:{ all -> 0x0080 }
            goto L_0x0069
        L_0x0068:
        L_0x0069:
            r8 = r12[r4]     // Catch:{ all -> 0x0080 }
            long r8 = r8 + r10
            r12[r4] = r8     // Catch:{ all -> 0x0080 }
            hph r8 = r7.c     // Catch:{ all -> 0x0080 }
            boolean r8 = r8.f     // Catch:{ all -> 0x0080 }
            if (r8 == 0) goto L_0x007d
            int r8 = r7.e     // Catch:{ all -> 0x0080 }
            int r9 = r7.f     // Catch:{ all -> 0x0080 }
            if (r8 < r9) goto L_0x007d
            r4 = 1
            goto L_0x007e
        L_0x007d:
        L_0x007e:
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            return r4
        L_0x0080:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hot.a(long, long, java.lang.Integer):boolean");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AbstractCounter(");
        sb.append(this.a);
        sb.append(")[");
        synchronized (this.d) {
            for (int i = 0; i < this.b.c(); i++) {
                oh ohVar = (oh) this.b.d(i);
                sb.append(this.b.c(i));
                sb.append(" -> [");
                for (int i2 = 0; i2 < ohVar.b(); i2++) {
                    sb.append(ohVar.a(i2));
                    sb.append(" = ");
                    sb.append(((long[]) ohVar.b(i2))[0]);
                    sb.append(", ");
                }
                sb.append("], ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected hot(hph hph, String str) {
        this.c = hph;
        this.d = new Object();
        this.f = this.c.c;
        this.b = new ov();
        if (hph.j.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("counter/histogram already exists: ") : "counter/histogram already exists: ".concat(valueOf));
        }
        hph.j.put(str, this);
        this.a = str;
    }

    public final void a(long j, long j2, hpa hpa) {
        Integer num;
        boolean z;
        Integer num2;
        if (hpa == null) {
            hpa = hph.a;
        }
        hph hph = this.c;
        hpa hpa2 = hph.a;
        hph.e.readLock().lock();
        try {
            if (hpa != hph.b) {
                num = (Integer) this.c.l.get(hpa);
            } else {
                num = this.c.m;
            }
            boolean z2 = false;
            if (num != null) {
                z = a(j, j2, num);
            } else {
                z2 = true;
                z = false;
            }
            if (z2) {
                Lock writeLock = this.c.e.writeLock();
                writeLock.lock();
                try {
                    if (hpa == hph.b) {
                        hph hph2 = this.c;
                        hph2.m = hph2.b(hph2.k);
                        num2 = this.c.m;
                    } else {
                        num2 = this.c.b(hpa);
                    }
                    Integer num3 = num2;
                    this.c.e.readLock().lock();
                    writeLock.unlock();
                    writeLock = this.c.e.readLock();
                    try {
                        z = a(j, j2, num3);
                        writeLock.unlock();
                    } catch (Throwable th) {
                        th = th;
                        writeLock.unlock();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    writeLock.unlock();
                    throw th;
                }
            }
            if (z) {
                this.c.d();
            }
            if (this.c.g > 0 && this.c.h == null) {
                this.c.b();
            }
        } finally {
            this.c.e.readLock().unlock();
        }
    }
}
