package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* renamed from: ayz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayz extends ayu {
    private final avv g;

    public ayz(avc avc, ayx ayx) {
        super(avc, ayx);
        avv avv = new avv(avc, this, new ayn("__container", ayx.a, false));
        this.g = avv;
        avv.a(Collections.emptyList(), Collections.emptyList());
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        this.g.a(rectF, this.a, z);
    }

    public final void b(Canvas canvas, Matrix matrix, int i) {
        this.g.a(canvas, matrix, i);
    }

    public final void b(axi axi, int i, List list, axi axi2) {
        this.g.a(axi, i, list, axi2);
    }
}
