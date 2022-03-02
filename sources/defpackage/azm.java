package defpackage;

import android.graphics.Color;

/* renamed from: azm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azm implements bao {
    public static final azm a = new azm();

    private azm() {
    }

    public final /* bridge */ /* synthetic */ Object a(bat bat, float f) {
        int n = bat.n();
        if (n == 1) {
            bat.a();
        }
        double j = bat.j();
        double j2 = bat.j();
        double j3 = bat.j();
        double j4 = bat.j();
        if (n == 1) {
            bat.b();
        }
        if (j <= 1.0d && j2 <= 1.0d && j3 <= 1.0d && j4 <= 1.0d) {
            j *= 255.0d;
            j2 *= 255.0d;
            j3 *= 255.0d;
            j4 *= 255.0d;
        }
        return Integer.valueOf(Color.argb((int) j4, (int) j, (int) j2, (int) j3));
    }
}
