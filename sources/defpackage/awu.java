package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* renamed from: awu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awu extends awr {
    private final PointF e = new PointF();
    private final float[] f = new float[2];
    private awt g;
    private final PathMeasure h = new PathMeasure();

    public awu(List list) {
        super(list);
    }

    public final /* bridge */ /* synthetic */ Object a(bbc bbc, float f2) {
        awt awt = (awt) bbc;
        Path path = awt.a;
        if (path == null) {
            return (PointF) bbc.b;
        }
        bbe bbe = this.d;
        if (bbe != null) {
            float f3 = awt.e;
            awt.f.floatValue();
            Object obj = awt.b;
            Object obj2 = awt.c;
            c();
            return (PointF) bbe.a;
        }
        if (this.g != awt) {
            this.h.setPath(path, false);
            this.g = awt;
        }
        PathMeasure pathMeasure = this.h;
        pathMeasure.getPosTan(f2 * pathMeasure.getLength(), this.f, (float[]) null);
        PointF pointF = this.e;
        float[] fArr = this.f;
        pointF.set(fArr[0], fArr[1]);
        return this.e;
    }
}
