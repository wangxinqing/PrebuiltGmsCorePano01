package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.TimeZone;

/* renamed from: bzf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bzf {
    public static final bzf a;
    private final bzd b;
    private final bza c;

    static {
        bzd a2 = bzd.a();
        a2.b();
        a = new bzf(a2, bza.b());
    }

    public bzf(bzd bzd, bza bza) {
        this.b = bzd;
        this.c = bza;
    }

    private final void a(atmd atmd, bzc bzc) {
        atmd atmd2 = atmd.UNKNOWN_TIME_FENCE_TRIGGER_TYPE;
        switch (atmd.ordinal()) {
            case 1:
                bza bza = this.c;
                bza.a(bzc, (Set) bza.a);
                return;
            case 2:
                this.b.a(bzc, 0, 1, 2, 3, 4, 5, 6);
                return;
            case 3:
                this.b.a(bzc, 5, 6);
                return;
            case 4:
                this.b.a(bzc, 0, 1, 2, 3, 4);
                return;
            case 5:
                this.b.a(bzc, 6);
                return;
            case 6:
                this.b.a(bzc, 0);
                return;
            case 7:
                this.b.a(bzc, 1);
                return;
            case 8:
                this.b.a(bzc, 2);
                return;
            case 9:
                this.b.a(bzc, 3);
                return;
            case 10:
                this.b.a(bzc, 4);
                return;
            case 11:
                this.b.a(bzc, 5);
                return;
            default:
                ((anih) ((anih) bxk.a.c()).a("bzf", "a", 292, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ScheduledFenceTime] Invalid time fence type = %s", (Object) atmd);
                return;
        }
    }

    private final void b(atmd atmd, bzc bzc) {
        atmd atmd2 = atmd.UNKNOWN_TIME_FENCE_TRIGGER_TYPE;
        switch (atmd.ordinal()) {
            case 1:
                this.c.a(bzc);
                return;
            case 2:
                this.b.b(bzc, 0, 1, 2, 3, 4, 5, 6);
                return;
            case 3:
                this.b.b(bzc, 5, 6);
                return;
            case 4:
                this.b.b(bzc, 0, 1, 2, 3, 4);
                return;
            case 5:
                this.b.b(bzc, 6);
                return;
            case 6:
                this.b.b(bzc, 0);
                return;
            case 7:
                this.b.b(bzc, 1);
                return;
            case 8:
                this.b.b(bzc, 2);
                return;
            case 9:
                this.b.b(bzc, 3);
                return;
            case 10:
                this.b.b(bzc, 4);
                return;
            case 11:
                this.b.b(bzc, 5);
                return;
            default:
                ((anih) ((anih) bxk.a.c()).a("bzf", "b", 344, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ScheduledFenceTime] Invalid time fence type for inverse = %s", (Object) atmd);
                return;
        }
    }

    private static final void a(bzc bzc, TimeZone timeZone) {
        long a2 = bvl.a(timeZone, bvl.a);
        Object[] objArr = {timeZone.getID(), Long.valueOf(a2)};
        bzc.a(a2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fa, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x011d, code lost:
        if (r0.c < r14.c) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x011f, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0120, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.bzb b(long r14) {
        /*
            r13 = this;
            monitor-enter(r13)
            bza r0 = r13.c     // Catch:{ all -> 0x0121 }
            java.util.TreeSet r1 = r0.a     // Catch:{ all -> 0x0121 }
            int r1 = r1.size()     // Catch:{ all -> 0x0121 }
            r2 = 1
            if (r1 != r2) goto L_0x0023
            java.util.TreeSet r0 = r0.a     // Catch:{ all -> 0x0121 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0121 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0121 }
            bzc r0 = (defpackage.bzc) r0     // Catch:{ all -> 0x0121 }
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            boolean r0 = r0.d(r3)     // Catch:{ all -> 0x0121 }
            if (r0 != 0) goto L_0x0043
        L_0x0023:
            bzd r0 = r13.b     // Catch:{ all -> 0x0121 }
            java.util.TreeSet r1 = r0.a     // Catch:{ all -> 0x0121 }
            int r1 = r1.size()     // Catch:{ all -> 0x0121 }
            r3 = 604800000(0x240c8400, double:2.988109026E-315)
            if (r1 != r2) goto L_0x0047
            java.util.TreeSet r0 = r0.a     // Catch:{ all -> 0x0121 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0121 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0121 }
            bzc r0 = (defpackage.bzc) r0     // Catch:{ all -> 0x0121 }
            boolean r0 = r0.d(r3)     // Catch:{ all -> 0x0121 }
            if (r0 != 0) goto L_0x0043
            goto L_0x0047
        L_0x0043:
            bzb r14 = defpackage.bzb.b     // Catch:{ all -> 0x0121 }
            monitor-exit(r13)
            return r14
        L_0x0047:
            bza r0 = r13.c     // Catch:{ all -> 0x0121 }
            java.util.TreeSet r0 = r0.a     // Catch:{ all -> 0x0121 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0121 }
        L_0x004f:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0121 }
            if (r1 == 0) goto L_0x0079
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0121 }
            bzc r1 = (defpackage.bzc) r1     // Catch:{ all -> 0x0121 }
            long r5 = r1.b     // Catch:{ all -> 0x0121 }
            int r7 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x004f
            boolean r5 = r1.b(r14)     // Catch:{ all -> 0x0121 }
            if (r5 == 0) goto L_0x006e
            long r0 = r1.b     // Catch:{ all -> 0x0121 }
            bzb r0 = defpackage.bzb.a(r0)     // Catch:{ all -> 0x0121 }
            goto L_0x007b
        L_0x006e:
            long r5 = r1.a     // Catch:{ all -> 0x0121 }
            int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x004f
            bzb r0 = defpackage.bzb.a(r5)     // Catch:{ all -> 0x0121 }
            goto L_0x007b
        L_0x0079:
            bzb r0 = defpackage.bzb.a     // Catch:{ all -> 0x0121 }
        L_0x007b:
            bzd r1 = r13.b     // Catch:{ all -> 0x0121 }
            java.util.TreeSet r5 = r1.a     // Catch:{ all -> 0x0121 }
            int r5 = r5.size()     // Catch:{ all -> 0x0121 }
            if (r5 == 0) goto L_0x00ea
            long r5 = defpackage.bzd.a((long) r14)     // Catch:{ all -> 0x0121 }
            java.util.TreeSet r7 = r1.a     // Catch:{ all -> 0x0121 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0121 }
            r8 = 0
        L_0x0090:
            boolean r9 = r7.hasNext()     // Catch:{ all -> 0x0121 }
            if (r9 == 0) goto L_0x00c4
            java.lang.Object r9 = r7.next()     // Catch:{ all -> 0x0121 }
            bzc r9 = (defpackage.bzc) r9     // Catch:{ all -> 0x0121 }
            long r10 = r9.b     // Catch:{ all -> 0x0121 }
            int r12 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r12 > 0) goto L_0x0090
            boolean r10 = r9.b(r5)     // Catch:{ all -> 0x0121 }
            if (r10 == 0) goto L_0x00b7
            long r8 = r9.b     // Catch:{ all -> 0x0121 }
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 == 0) goto L_0x00b5
            long r8 = r8 - r5
            long r14 = r14 + r8
            bzb r14 = defpackage.bzb.a(r14)     // Catch:{ all -> 0x0121 }
            goto L_0x00ec
        L_0x00b5:
            r8 = 1
            goto L_0x0090
        L_0x00b7:
            long r9 = r9.a     // Catch:{ all -> 0x0121 }
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x0090
            long r9 = r9 - r5
            long r14 = r14 + r9
            bzb r14 = defpackage.bzb.a(r14)     // Catch:{ all -> 0x0121 }
            goto L_0x00ec
        L_0x00c4:
            long r3 = r3 - r5
            java.util.TreeSet r1 = r1.a     // Catch:{ all -> 0x0121 }
            java.lang.Object r1 = r1.first()     // Catch:{ all -> 0x0121 }
            bzc r1 = (defpackage.bzc) r1     // Catch:{ all -> 0x0121 }
            if (r8 != 0) goto L_0x00d0
            goto L_0x00e1
        L_0x00d0:
            long r5 = r1.a     // Catch:{ all -> 0x0121 }
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x00e1
            long r14 = r14 + r3
            long r1 = r1.b     // Catch:{ all -> 0x0121 }
            long r14 = r14 + r1
            bzb r14 = defpackage.bzb.a(r14)     // Catch:{ all -> 0x0121 }
            goto L_0x00ec
        L_0x00e1:
            long r14 = r14 + r3
            long r1 = r1.a     // Catch:{ all -> 0x0121 }
            long r14 = r14 + r1
            bzb r14 = defpackage.bzb.a(r14)     // Catch:{ all -> 0x0121 }
            goto L_0x00ec
        L_0x00ea:
            bzb r14 = defpackage.bzb.a     // Catch:{ all -> 0x0121 }
        L_0x00ec:
            boolean r15 = r0.a()     // Catch:{ all -> 0x0121 }
            if (r15 == 0) goto L_0x00fb
            boolean r15 = r14.a()     // Catch:{ all -> 0x0121 }
            if (r15 != 0) goto L_0x00f9
            goto L_0x00fb
        L_0x00f9:
            monitor-exit(r13)
            return r0
        L_0x00fb:
            boolean r15 = r0.a()     // Catch:{ all -> 0x0121 }
            if (r15 != 0) goto L_0x0107
            boolean r15 = r14.a()     // Catch:{ all -> 0x0121 }
            if (r15 != 0) goto L_0x00f9
        L_0x0107:
            boolean r15 = r0.a()     // Catch:{ all -> 0x0121 }
            if (r15 != 0) goto L_0x010e
        L_0x010d:
            goto L_0x0116
        L_0x010e:
            boolean r15 = r14.a()     // Catch:{ all -> 0x0121 }
            if (r15 != 0) goto L_0x010d
            monitor-exit(r13)
            return r14
        L_0x0116:
            long r1 = r0.c     // Catch:{ all -> 0x0121 }
            long r3 = r14.c     // Catch:{ all -> 0x0121 }
            int r15 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            monitor-exit(r13)
            if (r15 < 0) goto L_0x0120
            return r14
        L_0x0120:
            return r0
        L_0x0121:
            r14 = move-exception
            monitor-exit(r13)
            goto L_0x0125
        L_0x0124:
            throw r14
        L_0x0125:
            goto L_0x0124
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzf.b(long):bzb");
    }

    public final synchronized void a() {
        this.b.b();
        this.c.c();
    }

    public final synchronized void a(atmd atmd, TimeZone timeZone, long j, long j2) {
        if (j2 < j) {
            ((anih) ((anih) bxk.a.b()).a("bzf", "a", 183, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ScheduledFenceTime] Invalid time fence %s: (%s, %s)", (Object) Integer.valueOf(atmd.n), (Object) Long.valueOf(j), (Object) Long.valueOf(j2));
            return;
        }
        iva.b(j2 >= j);
        bzc a2 = bzc.a(j, j2);
        if (atmd != atmd.ABSOLUTE_INTERVAL) {
            a(a2, timeZone);
            if (a2.d(604800000)) {
                this.b.b();
                return;
            }
        }
        switch (atmd.ordinal()) {
            case 1:
                bza bza = this.c;
                bza.a(a2, (Set) bza.a);
                return;
            case 2:
                this.b.a(a2, 0, 1, 2, 3, 4, 5, 6);
                return;
            case 3:
                this.b.a(a2, 5, 6);
                return;
            case 4:
                this.b.a(a2, 0, 1, 2, 3, 4);
                return;
            case 5:
                this.b.a(a2, 6);
                return;
            case 6:
                this.b.a(a2, 0);
                return;
            case 7:
                this.b.a(a2, 1);
                return;
            case 8:
                this.b.a(a2, 2);
                return;
            case 9:
                this.b.a(a2, 3);
                return;
            case 10:
                this.b.a(a2, 4);
                return;
            case 11:
                this.b.a(a2, 5);
                return;
            default:
                ((anih) ((anih) bxk.a.c()).a("bzf", "a", 292, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ScheduledFenceTime] Invalid time fence type = %s", (Object) atmd);
                return;
        }
    }

    public final synchronized void b(atmd atmd, TimeZone timeZone, long j, long j2) {
        if (j2 < j) {
            ((anih) ((anih) bxk.a.b()).a("bzf", "b", 222, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ScheduledFenceTime] Invalid time fence %s: (%s, %s)", (Object) Integer.valueOf(atmd.n), (Object) Long.valueOf(j), (Object) Long.valueOf(j2));
            return;
        }
        iva.b(j2 >= j);
        bzc a2 = bzc.a(j, j2);
        if (atmd != atmd.ABSOLUTE_INTERVAL) {
            a(a2, timeZone);
            if (a2.d(604800000)) {
                this.b.b();
                return;
            }
        }
        switch (atmd.ordinal()) {
            case 1:
                this.c.a(a2);
                return;
            case 2:
                this.b.b(a2, 0, 1, 2, 3, 4, 5, 6);
                return;
            case 3:
                this.b.b(a2, 5, 6);
                return;
            case 4:
                this.b.b(a2, 0, 1, 2, 3, 4);
                return;
            case 5:
                this.b.b(a2, 6);
                return;
            case 6:
                this.b.b(a2, 0);
                return;
            case 7:
                this.b.b(a2, 1);
                return;
            case 8:
                this.b.b(a2, 2);
                return;
            case 9:
                this.b.b(a2, 3);
                return;
            case 10:
                this.b.b(a2, 4);
                return;
            case 11:
                this.b.b(a2, 5);
                return;
            default:
                ((anih) ((anih) bxk.a.c()).a("bzf", "b", 344, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ScheduledFenceTime] Invalid time fence type for inverse = %s", (Object) atmd);
                return;
        }
    }

    public final synchronized boolean a(long j) {
        Iterator it = this.c.a.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((bzc) it.next()).b(j)) {
                    break;
                }
            } else {
                bzd bzd = this.b;
                long a2 = bzd.a(j);
                Iterator it2 = bzd.a.iterator();
                while (it2.hasNext()) {
                    if (((bzc) it2.next()).b(a2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }
}
