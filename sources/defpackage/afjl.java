package defpackage;

import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;

/* renamed from: afjl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afjl {
    private static final anli a = anln.f();
    private static final TimeZone b = TimeZone.getTimeZone("America/Los_Angeles");
    private final aekn c;
    private final String d;
    private final int e;
    private final Set f = new HashSet();
    private volatile long g;
    private final int h;

    public afjl(aekn aekn, String str, int i, int i2) {
        this.c = aekn;
        this.d = str;
        this.e = i;
        this.h = i2;
        this.g = a();
    }

    private final long a() {
        if (this.h == 1) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(this.c.a());
            gregorianCalendar.setTimeZone(b);
            gregorianCalendar.set(11, 0);
            gregorianCalendar.set(12, 0);
            gregorianCalendar.set(13, 0);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(b);
        gregorianCalendar2.setTimeInMillis(this.c.a());
        gregorianCalendar2.set(11, 0);
        gregorianCalendar2.set(12, 0);
        gregorianCalendar2.set(13, 0);
        gregorianCalendar2.set(14, 0);
        return gregorianCalendar2.getTimeInMillis();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0078, code lost:
        if (r0 != false) goto L_0x00c0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aoje a(java.lang.String r11) {
        /*
            r10 = this;
            int r0 = r10.e
            r1 = 0
            if (r0 == 0) goto L_0x00c1
            long r2 = r10.a()
            java.lang.String r0 = r10.d
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r4 = r4.length()
            java.lang.String r5 = java.lang.String.valueOf(r11)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 22
            int r4 = r4 + r5
            r6.<init>(r4)
            r6.append(r2)
            java.lang.String r4 = "|"
            r6.append(r4)
            r6.append(r0)
            java.lang.String r0 = "|"
            r6.append(r0)
            r6.append(r11)
            java.lang.String r0 = r6.toString()
            anli r4 = a
            anlh r0 = r4.a((java.lang.CharSequence) r0)
            int r4 = r10.e
            int r5 = r10.h
            r6 = 1
            if (r5 != r6) goto L_0x004f
            int r5 = r0.c()
            int r5 = r5 % r4
            if (r5 != 0) goto L_0x00c0
            goto L_0x005b
        L_0x004f:
            long r7 = r0.d()
            long r4 = (long) r4
            long r7 = r7 % r4
            r4 = 0
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x00c0
        L_0x005b:
            long r4 = r10.g
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x0062
            goto L_0x007b
        L_0x0062:
            monitor-enter(r10)
            long r4 = r10.g     // Catch:{ all -> 0x00bd }
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x0070
            r10.g = r2     // Catch:{ all -> 0x00bd }
            java.util.Set r4 = r10.f     // Catch:{ all -> 0x00bd }
            r4.clear()     // Catch:{ all -> 0x00bd }
        L_0x0070:
            java.util.Set r4 = r10.f     // Catch:{ all -> 0x00bd }
            boolean r0 = r4.add(r0)     // Catch:{ all -> 0x00bd }
            r0 = r0 ^ r6
            monitor-exit(r10)     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x007b
            goto L_0x00c0
        L_0x007b:
            aoje r0 = defpackage.aoje.f
            aucd r0 = r0.o()
            boolean r4 = r0.c
            if (r4 != 0) goto L_0x0086
            goto L_0x008c
        L_0x0086:
            r0.c()
            r4 = 0
            r0.c = r4
        L_0x008c:
            aucj r4 = r0.b
            aoje r4 = (defpackage.aoje) r4
            r11.getClass()
            int r5 = r4.a
            r5 = r5 | r6
            r4.a = r5
            r4.b = r11
            r11 = r5 | 2
            r4.a = r11
            r4.c = r2
            int r2 = r10.e
            r11 = r11 | 4
            r4.a = r11
            long r2 = (long) r2
            r4.d = r2
            int r2 = r10.h
            if (r2 == 0) goto L_0x00bc
            r11 = r11 | 8
            r4.a = r11
            int r2 = r2 + -1
            r4.e = r2
            aucj r11 = r0.i()
            aoje r11 = (defpackage.aoje) r11
            return r11
        L_0x00bc:
            throw r1
        L_0x00bd:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00bd }
            throw r11
        L_0x00c0:
            return r1
        L_0x00c1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afjl.a(java.lang.String):aoje");
    }
}
