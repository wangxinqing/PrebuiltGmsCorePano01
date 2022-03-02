package defpackage;

import android.graphics.PointF;
import java.util.List;

/* renamed from: awv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awv extends awr {
    private final PointF e = new PointF();

    public awv(List list) {
        super(list);
    }

    public final /* bridge */ /* synthetic */ Object a(bbc bbc, float f) {
        Object obj;
        Object obj2 = bbc.b;
        if (obj2 == null || (obj = bbc.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) obj2;
        PointF pointF2 = (PointF) obj;
        bbe bbe = this.d;
        if (bbe != null) {
            float f2 = bbc.e;
            bbc.f.floatValue();
            c();
            return (PointF) bbe.a;
        }
        this.e.set(pointF.x + ((pointF2.x - pointF.x) * f), pointF.y + (f * (pointF2.y - pointF.y)));
        return this.e;
    }
}
