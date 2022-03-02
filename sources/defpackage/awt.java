package defpackage;

import android.graphics.Path;
import android.graphics.PointF;

/* renamed from: awt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awt extends bbc {
    public Path a;
    private final bbc m;

    public awt(auk auk, bbc bbc) {
        super(auk, bbc.b, bbc.c, bbc.d, bbc.e, bbc.f);
        this.m = bbc;
        a();
    }

    public final void a() {
        Object obj;
        Object obj2 = this.c;
        boolean z = false;
        if (!(obj2 == null || (obj = this.b) == null || !((PointF) obj).equals(((PointF) obj2).x, ((PointF) this.c).y))) {
            z = true;
        }
        Object obj3 = this.c;
        if (obj3 != null && !z) {
            bbc bbc = this.m;
            this.a = bbb.a((PointF) this.b, (PointF) obj3, bbc.k, bbc.l);
        }
    }
}
