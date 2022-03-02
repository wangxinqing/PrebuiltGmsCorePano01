package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: awx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awx extends awm {
    private final ayl e = new ayl();
    private final Path f = new Path();

    public awx(List list) {
        super(list);
    }

    public final /* bridge */ /* synthetic */ Object a(bbc bbc, float f2) {
        ayl ayl = (ayl) bbc.b;
        ayl ayl2 = (ayl) bbc.c;
        ayl ayl3 = this.e;
        if (ayl3.b == null) {
            ayl3.b = new PointF();
        }
        boolean z = true;
        if (!ayl.c && !ayl2.c) {
            z = false;
        }
        ayl3.c = z;
        if (ayl.a.size() != ayl2.a.size()) {
            bay.a("Curves must have the same number of control points. Shape 1: " + ayl.a.size() + "\tShape 2: " + ayl2.a.size());
        }
        int min = Math.min(ayl.a.size(), ayl2.a.size());
        if (ayl3.a.size() < min) {
            for (int size = ayl3.a.size(); size < min; size++) {
                ayl3.a.add(new axe());
            }
        } else if (ayl3.a.size() > min) {
            for (int size2 = ayl3.a.size() - 1; size2 >= min; size2--) {
                List list = ayl3.a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointF = ayl.b;
        PointF pointF2 = ayl2.b;
        float a = bba.a(pointF.x, pointF2.x, f2);
        float a2 = bba.a(pointF.y, pointF2.y, f2);
        if (ayl3.b == null) {
            ayl3.b = new PointF();
        }
        ayl3.b.set(a, a2);
        for (int size3 = ayl3.a.size() - 1; size3 >= 0; size3--) {
            axe axe = (axe) ayl.a.get(size3);
            axe axe2 = (axe) ayl2.a.get(size3);
            PointF pointF3 = axe.a;
            PointF pointF4 = axe.b;
            PointF pointF5 = axe.c;
            PointF pointF6 = axe2.a;
            PointF pointF7 = axe2.b;
            PointF pointF8 = axe2.c;
            ((axe) ayl3.a.get(size3)).a.set(bba.a(pointF3.x, pointF6.x, f2), bba.a(pointF3.y, pointF6.y, f2));
            ((axe) ayl3.a.get(size3)).b.set(bba.a(pointF4.x, pointF7.x, f2), bba.a(pointF4.y, pointF7.y, f2));
            ((axe) ayl3.a.get(size3)).c.set(bba.a(pointF5.x, pointF8.x, f2), bba.a(pointF5.y, pointF8.y, f2));
        }
        bba.a(this.e, this.f);
        return this.f;
    }
}
