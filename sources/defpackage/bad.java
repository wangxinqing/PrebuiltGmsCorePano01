package defpackage;

import android.graphics.PointF;

/* renamed from: bad  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bad implements bao {
    public static final bad a = new bad();

    private bad() {
    }

    public final /* bridge */ /* synthetic */ Object a(bat bat, float f) {
        int n = bat.n();
        if (n == 1) {
            return azw.b(bat, f);
        }
        if (n == 3) {
            return azw.b(bat, f);
        }
        if (n == 7) {
            PointF pointF = new PointF(((float) bat.j()) * f, ((float) bat.j()) * f);
            while (bat.e()) {
                bat.l();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + bas.a(n));
    }
}
