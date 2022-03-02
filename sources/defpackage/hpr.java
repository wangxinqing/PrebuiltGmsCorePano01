package defpackage;

/* renamed from: hpr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hpr {
    public static void a(hpq hpq, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3 && i % 4 != 0) {
            hpq.a(i, (byte) 0);
            i++;
        }
        while (i < i3 - 3) {
            hpq.a(i, 0);
            i += 4;
        }
        while (i < i3) {
            hpq.a(i, (byte) 0);
            i++;
        }
    }

    public static void b(hpq hpq, int i, int i2) {
        hpq.a(i, aons.a(hpq.b(i), i2));
    }
}
