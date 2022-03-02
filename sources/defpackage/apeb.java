package defpackage;

/* renamed from: apeb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apeb {
    public static void a(anmq anmq, int i, apea apea) {
        if (i < 0) {
            anmq.write(0);
        } else if (apea != apea.UTF8) {
            if (i > 32767) {
                int i2 = (i >> 16) | 32768;
                anmq.write(i2 & 255);
                anmq.write(i2 >> 8);
            }
            anmq.write(i & 255);
            anmq.write((i >> 8) & 255);
        } else {
            if (i > 127) {
                anmq.write(((i & 32512) >> 8) | 128);
            }
            anmq.write(i & 255);
        }
    }
}
