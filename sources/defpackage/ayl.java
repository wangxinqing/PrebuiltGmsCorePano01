package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ayl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayl {
    public final List a;
    public PointF b;
    public boolean c;

    public ayl() {
        this.a = new ArrayList();
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.a.size() + "closed=" + this.c + '}';
    }

    public ayl(PointF pointF, boolean z, List list) {
        this.b = pointF;
        this.c = z;
        this.a = new ArrayList(list);
    }
}
