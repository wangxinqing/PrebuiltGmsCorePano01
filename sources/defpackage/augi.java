package defpackage;

import java.util.Comparator;

/* renamed from: augi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class augi {
    public static final Comparator a = new augh();

    static {
        aucd o = aubn.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aubn aubn = (aubn) o.b;
        aubn.a = -315576000000L;
        aubn.b = -999999999;
        aubn aubn2 = (aubn) o.i();
        aucd o2 = aubn.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aubn aubn3 = (aubn) o2.b;
        aubn3.a = 315576000000L;
        aubn3.b = 999999999;
        aubn aubn4 = (aubn) o2.i();
        aucd o3 = aubn.c.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        aubn aubn5 = (aubn) o3.b;
        aubn5.a = 0;
        aubn5.b = 0;
        aubn aubn6 = (aubn) o3.i();
    }

    public static long a(aubn aubn) {
        b(aubn);
        return aubn.a;
    }

    public static void b(aubn aubn) {
        long j = aubn.a;
        int i = aubn.b;
        if (j >= -315576000000L && j <= 315576000000L) {
            long j2 = (long) i;
            if (j2 >= -999999999 && j2 < 1000000000) {
                if (j < 0 || i < 0) {
                    if (j <= 0 && i <= 0) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", new Object[]{Long.valueOf(j), Integer.valueOf(i)}));
    }

    public static aubn a(long j) {
        return a(j / 1000, (int) ((j % 1000) * 1000000));
    }

    static aubn a(long j, int i) {
        long j2 = (long) i;
        if (j2 <= -1000000000 || j2 >= 1000000000) {
            j = aont.a(j, j2 / 1000000000);
            i = (int) (j2 % 1000000000);
        }
        if (j > 0 && i < 0) {
            i = (int) (((long) i) + 1000000000);
            j--;
        }
        if (j < 0 && i > 0) {
            i = (int) (((long) i) - 1000000000);
            j++;
        }
        aucd o = aubn.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aubn aubn = (aubn) o.b;
        aubn.a = j;
        aubn.b = i;
        aubn aubn2 = (aubn) o.i();
        b(aubn2);
        return aubn2;
    }
}
