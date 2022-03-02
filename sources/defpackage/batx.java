package defpackage;

/* renamed from: batx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class batx {
    static batw a;
    static long b;

    private batx() {
    }

    static batw a() {
        synchronized (batx.class) {
            if (a == null) {
                return new batw();
            }
            batw batw = a;
            a = batw.f;
            batw.f = null;
            b -= 8192;
            return batw;
        }
    }

    public static void a(batw batw) {
        if (batw.f != null || batw.g != null) {
            throw new IllegalArgumentException();
        } else if (!batw.d) {
            synchronized (batx.class) {
                if (b + 8192 <= 65536) {
                    b += 8192;
                    batw.f = a;
                    batw.c = 0;
                    batw.b = 0;
                    a = batw;
                }
            }
        }
    }
}
