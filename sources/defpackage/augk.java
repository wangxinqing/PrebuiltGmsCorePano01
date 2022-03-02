package defpackage;

/* renamed from: augk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class augk {
    static {
        aucd o = aufc.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aufc aufc = (aufc) o.b;
        aufc.a = -62135596800L;
        aufc.b = 0;
        aufc aufc2 = (aufc) o.i();
        aucd o2 = aufc.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aufc aufc3 = (aufc) o2.b;
        aufc3.a = 253402300799L;
        aufc3.b = 999999999;
        aufc aufc4 = (aufc) o2.i();
        aucd o3 = aufc.c.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        aufc aufc5 = (aufc) o3.b;
        aufc5.a = 0;
        aufc5.b = 0;
        aufc aufc6 = (aufc) o3.i();
        new augj();
    }

    public static long a(aufc aufc) {
        long j;
        boolean z;
        boolean z2;
        b(aufc);
        long j2 = aufc.a;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(-1 ^ j2) + Long.numberOfLeadingZeros(1000) + Long.numberOfLeadingZeros(-1001);
        if (numberOfLeadingZeros <= 65) {
            if (numberOfLeadingZeros >= 64) {
                z = true;
            } else {
                z = false;
            }
            long j3 = j2;
            aonu.a(z, "checkedMultiply", j3, 1000);
            aonu.a(true, "checkedMultiply", j3, 1000);
            j = j2 * 1000;
            if (j2 == 0 || j / j2 == 1000) {
                z2 = true;
            } else {
                z2 = false;
            }
            aonu.a(z2, "checkedMultiply", j2, 1000);
        } else {
            j = j2 * 1000;
        }
        return aont.a(j, ((long) aufc.b) / 1000000);
    }

    public static void b(aufc aufc) {
        long j = aufc.a;
        int i = aufc.b;
        if (j < -62135596800L || j > 253402300799L || i < 0 || ((long) i) >= 1000000000) {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", new Object[]{Long.valueOf(j), Integer.valueOf(i)}));
        }
    }

    public static aubn a(aufc aufc, aufc aufc2) {
        boolean z;
        b(aufc);
        b(aufc2);
        long b = aont.b(aufc2.a, aufc.a);
        int i = aufc2.b;
        int i2 = aufc.b;
        long j = ((long) i) - ((long) i2);
        int i3 = (int) j;
        if (j == ((long) i3)) {
            z = true;
        } else {
            z = false;
        }
        aonu.a(z, "checkedSubtract", i, i2);
        return augi.a(b, i3);
    }

    public static aufc a(long j) {
        return a(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static aufc a(long j, int i) {
        long j2 = (long) i;
        if (j2 <= -1000000000 || j2 >= 1000000000) {
            j = aont.a(j, j2 / 1000000000);
            i = (int) (j2 % 1000000000);
        }
        if (i < 0) {
            i = (int) (((long) i) + 1000000000);
            j = aont.b(j, 1);
        }
        aucd o = aufc.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aufc aufc = (aufc) o.b;
        aufc.a = j;
        aufc.b = i;
        aufc aufc2 = (aufc) o.i();
        b(aufc2);
        return aufc2;
    }
}
