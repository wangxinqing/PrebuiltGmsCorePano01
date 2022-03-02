package defpackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: ahlx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahlx extends ahjm {
    private final Calendar c = Calendar.getInstance();

    public ahlx(ahix ahix, aizy aizy) {
        super(ahix);
    }

    public static String a(Calendar calendar, long j) {
        long b = b(calendar, j);
        String format = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss.SSS", Locale.ENGLISH).format(calendar.getTime());
        return String.format(Locale.ENGLISH, "sinceBootTime=%d, %s", new Object[]{Long.valueOf(b), format});
    }

    public static long b(long j, long j2, long j3, long j4) {
        long j5 = j;
        long j6 = j2;
        long j7 = j4;
        if (!axwx.c()) {
            return j5;
        }
        Locale locale = Locale.ENGLISH;
        Object[] objArr = {b(j5, j7), b(j6, j7), Long.valueOf(j3), Long.valueOf(j4)};
        if (j5 == Long.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j5 + j7);
        instance.set(14, 0);
        if (instance.get(13) < 30) {
            instance.set(13, 0);
            long b = b(instance, j7);
            long j8 = b - j6;
            if (j6 == -1 || j8 > j3 / 2) {
                String valueOf = String.valueOf(a(instance, j7));
                if (valueOf.length() == 0) {
                    new String("  Prefer beginning of minute: ");
                } else {
                    "  Prefer beginning of minute: ".concat(valueOf);
                }
                return b;
            }
        }
        instance.set(13, 0);
        instance.add(12, 1);
        long b2 = b(instance, j7);
        Locale locale2 = Locale.ENGLISH;
        Object[] objArr2 = {a(instance, j7), Long.valueOf(b2)};
        return b2;
    }

    /* access modifiers changed from: protected */
    public final long c(long j, long j2) {
        long j3;
        boolean c2 = axwx.c();
        if (c2) {
            this.c.setTimeInMillis(j2 + j);
            this.c.set(14, 0);
            this.c.set(13, 0);
            this.c.add(12, 1);
            j3 = b(this.c, j2);
        } else {
            j3 = j;
        }
        ahjt ahka = this.b.a(9) ? new ahka(this.b) : new ahkc(this.b);
        ahla ahla = this.b.r;
        if (ahla.a) {
            j = Math.min(j, ahla.c);
        }
        return (ahle.a(j3 - j, ahka) || !c2) ? j3 : j3 + 60000;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ahjl a(long r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            long r11 = defpackage.ajbt.e()
            r13 = -1
            int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x0017
            long r3 = r23.a()
            ahix r5 = r0.b
            long r5 = r5.ak
            goto L_0x001c
        L_0x0017:
            long r3 = r0.c(r1, r11)
            r5 = r13
        L_0x001c:
            ahix r7 = r0.b
            long r7 = r7.U
            r9 = r11
            long r9 = b(r3, r5, r7, r9)
            long r3 = r23.b()
            ahix r5 = r0.b
            long r6 = r5.al
            long r13 = r5.V
            r5 = r6
            r7 = r13
            r13 = r9
            r9 = r11
            long r9 = b(r3, r5, r7, r9)
            r7 = 0
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0044
            long r1 = r0.c(r1, r11)
            goto L_0x0074
        L_0x0044:
            ahix r1 = r0.b
            long r2 = r1.am
            long r4 = r1.j()
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r1 == 0) goto L_0x006b
            ahix r1 = r0.b
            long r4 = r1.j()
            r15 = 2500000000(0x9502f900, double:1.2351641146E-314)
            long r15 = defpackage.ahjm.b(r15)
            long r4 = r4 - r15
            long r15 = java.lang.Math.max(r7, r4)
            r4 = r15
            goto L_0x006c
        L_0x006b:
            r4 = r15
        L_0x006c:
            long r1 = defpackage.ajqz.a((long) r2, (long) r4)
            ahix r3 = r0.b
            long r3 = r3.am
        L_0x0074:
            ahix r5 = r0.b
            long r5 = r5.j()
            r15 = r7
            r7 = r11
            long r1 = b(r1, r3, r5, r7)
            java.util.Locale r3 = java.util.Locale.ENGLISH
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            java.lang.Long r5 = java.lang.Long.valueOf(r13)
            r3[r4] = r5
            r4 = 1
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            r3[r4] = r5
            r4 = 2
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            r3[r4] = r5
            ahix r3 = r0.b
            ajaj r3 = r3.B
            boolean r3 = r3.d()
            if (r3 != 0) goto L_0x00a7
            r7 = 39
            goto L_0x00a8
        L_0x00a7:
            r7 = r15
        L_0x00a8:
            r4 = 360000(0x57e40, double:1.778636E-318)
            ahix r6 = r0.b
            long r11 = r6.j()
            long r19 = java.lang.Math.min(r4, r11)
            ahix r4 = r0.b
            boolean r4 = r4.b()
            if (r4 == 0) goto L_0x00d9
            r21 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r15 = r1
            r17 = r13
            boolean r4 = defpackage.ahjm.a(r15, r17, r19, r21)
            r5 = 8
            if (r4 == 0) goto L_0x00d3
            long r7 = r7 | r5
            long r1 = java.lang.Math.min(r13, r1)
            goto L_0x00db
        L_0x00d3:
            int r4 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d9
            long r7 = r7 | r5
            goto L_0x00db
        L_0x00d9:
            r1 = r13
        L_0x00db:
            if (r3 == 0) goto L_0x00de
            goto L_0x0102
        L_0x00de:
            boolean r3 = r0.a(r9, r1)
            if (r3 == 0) goto L_0x0101
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 104(0x68, float:1.46E-43)
            r1.<init>(r2)
            java.lang.String r2 = "Running tilt only detector next: FullTrigger: "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = " TiltOnlyTrigger: "
            r1.append(r2)
            r1.append(r9)
            r1.toString()
            r7 = 2
            goto L_0x0103
        L_0x0101:
        L_0x0102:
            r9 = r1
        L_0x0103:
            ahjl r1 = new ahjl
            aiac r2 = new aiac
            r3 = -1000(0xfffffffffffffc18, double:NaN)
            long r9 = r9 + r3
            r3 = 2000(0x7d0, double:9.88E-321)
            r2.<init>(r9, r3)
            r1.<init>(r2, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahlx.a(long):ahjl");
    }

    private static long b(Calendar calendar, long j) {
        return calendar.getTimeInMillis() - j;
    }

    public static String b(long j, long j2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j + j2);
        return a(instance, j2);
    }
}
