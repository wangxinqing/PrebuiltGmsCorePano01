package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: avy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avy implements avw, awl, awc {
    private final Path a = new Path();
    private final Paint b = new avq(1);
    private final ayu c;
    private final String d;
    private final boolean e;
    private final List f = new ArrayList();
    private final awm g;
    private final awm h;
    private awm i;
    private final avc j;

    public avy(avc avc, ayu ayu, aym aym) {
        this.c = ayu;
        this.d = aym.b;
        this.e = aym.e;
        this.j = avc;
        if (aym.c == null || aym.d == null) {
            this.g = null;
            this.h = null;
            return;
        }
        this.a.setFillType(aym.a);
        awm a2 = aym.c.a();
        this.g = a2;
        a2.a((awl) this);
        ayu.a(this.g);
        awm a3 = aym.d.a();
        this.h = a3;
        a3.a((awl) this);
        ayu.a(this.h);
    }

    public final void a() {
        this.j.invalidateSelf();
    }

    public final String b() {
        return this.d;
    }

    public final void a(Canvas canvas, Matrix matrix, int i2) {
        if (!this.e) {
            this.b.setColor(((awn) this.g).g());
            this.b.setAlpha(bba.a((int) ((((((float) i2) / 255.0f) * ((float) ((Integer) this.h.f()).intValue())) / 100.0f) * 255.0f)));
            awm awm = this.i;
            if (awm != null) {
                this.b.setColorFilter((ColorFilter) awm.f());
            }
            this.a.reset();
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                this.a.addPath(((awe) this.f.get(i3)).e(), matrix);
            }
            canvas.drawPath(this.a, this.b);
            auf.a();
        }
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        this.a.reset();
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            this.a.addPath(((awe) this.f.get(i2)).e(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 4.0f, rectF.top - 4.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public final void a(axi axi, int i2, List list, axi axi2) {
        bba.a(axi, i2, list, axi2, this);
    }

    public final void a(Object obj, bbe bbe) {
        awm awm;
        if (obj == avh.a) {
            awm = this.g;
        } else if (obj == avh.d) {
            awm = this.h;
        } else if (obj == avh.B) {
            axb axb = new axb(bbe);
            this.i = axb;
            axb.a((awl) this);
            this.c.a(this.i);
            return;
        } else {
            return;
        }
        awm.d = bbe;
    }

    public final void a(List list, List list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            avu avu = (avu) list2.get(i2);
            if (avu instanceof awe) {
                this.f.add((awe) avu);
            }
        }
    }
}
