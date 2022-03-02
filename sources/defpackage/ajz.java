package defpackage;

import android.graphics.PointF;
import android.view.View;

/* renamed from: ajz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajz extends ajx {
    public final boolean m;
    public int p;
    final /* synthetic */ akb q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajz(akb akb, int i, boolean z) {
        super(akb);
        this.q = akb;
        this.p = i;
        this.m = z;
        this.a = -2;
    }

    public final PointF a(int i) {
        int i2 = this.p;
        if (i2 == 0) {
            return null;
        }
        akb akb = this.q;
        int i3 = 1;
        if ((akb.k & 262144) == 0) {
            if (i2 < 0) {
                i3 = -1;
            }
        } else if (i2 > 0) {
            i3 = -1;
        }
        if (akb.d == 0) {
            return new PointF((float) i3, 0.0f);
        }
        return new PointF(0.0f, (float) i3);
    }

    /* access modifiers changed from: protected */
    public final void d() {
        super.d();
        this.p = 0;
        View b = b(this.a);
        if (b != null) {
            this.q.a(b, true);
        }
    }
}
