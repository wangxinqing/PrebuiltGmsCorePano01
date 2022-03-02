package defpackage;

import android.graphics.PointF;

/* renamed from: ajw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajw extends ajx {
    final /* synthetic */ akb m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajw(akb akb) {
        super(akb);
        this.m = akb;
    }

    public final PointF a(int i) {
        if (b() == 0) {
            return null;
        }
        int j = act.j(this.m.h(0));
        akb akb = this.m;
        int i2 = 1;
        if ((akb.k & 262144) == 0) {
            if (i < j) {
                i2 = -1;
            }
        } else if (i > j) {
            i2 = -1;
        }
        if (akb.d == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }
}
