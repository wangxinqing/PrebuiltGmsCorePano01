package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* renamed from: awj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awj extends avs {
    private final ayu c;
    private final String d;
    private final boolean e;
    private final awm f;
    private awm g;

    public awj(avc avc, ayu ayu, ayr ayr) {
        super(avc, ayu, ayp.a(ayr.i), ayq.a(ayr.j), ayr.g, ayr.e, ayr.f, ayr.c, ayr.b);
        this.c = ayu;
        this.d = ayr.a;
        this.e = ayr.h;
        awm a = ayr.d.a();
        this.f = a;
        a.a((awl) this);
        ayu.a(this.f);
    }

    public final void a(Canvas canvas, Matrix matrix, int i) {
        if (!this.e) {
            this.b.setColor(((awn) this.f).g());
            awm awm = this.g;
            if (awm != null) {
                this.b.setColorFilter((ColorFilter) awm.f());
            }
            super.a(canvas, matrix, i);
        }
    }

    public final String b() {
        return this.d;
    }

    public final void a(Object obj, bbe bbe) {
        super.a(obj, bbe);
        if (obj == avh.b) {
            this.f.d = bbe;
        } else if (obj == avh.B) {
            axb axb = new axb(bbe);
            this.g = axb;
            axb.a((awl) this);
            this.c.a(this.f);
        }
    }
}
