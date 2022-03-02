package defpackage;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: ajze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajze extends Drawable.ConstantState {
    public ajzl a;
    public ajwh b;
    public ColorFilter c;
    public ColorStateList d = null;
    public ColorStateList e = null;
    public ColorStateList f = null;
    public ColorStateList g = null;
    public PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public Rect i = null;
    public float j = 1.0f;
    public float k = 1.0f;
    public float l;
    public int m = 255;
    public float n = 0.0f;
    public float o = 0.0f;
    public float p = 0.0f;
    public int q = 0;
    public int r = 0;
    public int s = 0;
    public int t = 0;
    public boolean u = false;
    public Paint.Style v = Paint.Style.FILL_AND_STROKE;

    public ajze(ajze ajze) {
        this.a = ajze.a;
        this.b = ajze.b;
        this.l = ajze.l;
        this.c = ajze.c;
        this.d = ajze.d;
        this.e = ajze.e;
        this.h = ajze.h;
        this.g = ajze.g;
        this.m = ajze.m;
        this.j = ajze.j;
        this.s = ajze.s;
        int i2 = ajze.q;
        this.q = 0;
        boolean z = ajze.u;
        this.u = false;
        this.k = ajze.k;
        this.n = ajze.n;
        this.o = ajze.o;
        float f2 = ajze.p;
        this.p = 0.0f;
        this.r = ajze.r;
        this.t = ajze.t;
        ColorStateList colorStateList = ajze.f;
        this.f = null;
        this.v = ajze.v;
        Rect rect = ajze.i;
        if (rect != null) {
            this.i = new Rect(rect);
        }
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable() {
        ajzf ajzf = new ajzf(this);
        ajzf.w = true;
        return ajzf;
    }

    public ajze(ajzl ajzl) {
        this.a = ajzl;
        this.b = null;
    }
}
