package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* renamed from: ajzl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajzl {
    public static final ajyy a = new ajzi(0.5f);
    public final ajyz b;
    public final ajyz c;
    public final ajyz d;
    public final ajyz e;
    public final ajyy f;
    public final ajyy g;
    public final ajyy h;
    public final ajyy i;
    final ajzb j;
    final ajzb k;
    final ajzb l;
    final ajzb m;

    public ajzl() {
        this.b = ajzg.a();
        this.c = ajzg.a();
        this.d = ajzg.a();
        this.e = ajzg.a();
        this.f = new ajyw(0.0f);
        this.g = new ajyw(0.0f);
        this.h = new ajyw(0.0f);
        this.i = new ajyw(0.0f);
        this.j = ajzg.b();
        this.k = ajzg.b();
        this.l = ajzg.b();
        this.m = ajzg.b();
    }

    private static ajyy a(TypedArray typedArray, int i2, ajyy ajyy) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue != null) {
            if (peekValue.type == 5) {
                return new ajyw((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (peekValue.type == 6) {
                return new ajzi(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return ajyy;
    }

    public final ajzk b() {
        return new ajzk(this);
    }

    public ajzl(ajzk ajzk) {
        this.b = ajzk.a;
        this.c = ajzk.b;
        this.d = ajzk.c;
        this.e = ajzk.d;
        this.f = ajzk.e;
        this.g = ajzk.f;
        this.h = ajzk.g;
        this.i = ajzk.h;
        this.j = ajzk.i;
        this.k = ajzk.j;
        this.l = ajzk.k;
        this.m = ajzk.l;
    }

    public static ajzk a() {
        return new ajzk();
    }

    public static ajzk a(Context context, int i2, int i3) {
        return a(context, i2, i3, (ajyy) new ajyw(0.0f));
    }

    private static ajzk a(Context context, int i2, int i3, ajyy ajyy) {
        if (i3 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
            i2 = i3;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, ajzh.b);
        try {
            int i4 = obtainStyledAttributes.getInt(0, 0);
            int i5 = obtainStyledAttributes.getInt(3, i4);
            int i6 = obtainStyledAttributes.getInt(4, i4);
            int i7 = obtainStyledAttributes.getInt(2, i4);
            int i8 = obtainStyledAttributes.getInt(1, i4);
            ajyy a2 = a(obtainStyledAttributes, 5, ajyy);
            ajyy a3 = a(obtainStyledAttributes, 8, a2);
            ajyy a4 = a(obtainStyledAttributes, 9, a2);
            ajyy a5 = a(obtainStyledAttributes, 7, a2);
            ajyy a6 = a(obtainStyledAttributes, 6, a2);
            ajzk ajzk = new ajzk();
            ajyz a7 = ajzg.a(i5);
            ajzk.a = a7;
            ajzk.a(a7);
            ajzk.e = a3;
            ajyz a8 = ajzg.a(i6);
            ajzk.b = a8;
            ajzk.a(a8);
            ajzk.f = a4;
            ajyz a9 = ajzg.a(i7);
            ajzk.c = a9;
            ajzk.a(a9);
            ajzk.g = a5;
            ajyz a10 = ajzg.a(i8);
            ajzk.d = a10;
            ajzk.a(a10);
            ajzk.h = a6;
            return ajzk;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ajzk a(Context context, AttributeSet attributeSet, int i2, int i3) {
        return a(context, attributeSet, i2, i3, new ajyw(0.0f));
    }

    public static ajzk a(Context context, AttributeSet attributeSet, int i2, int i3, ajyy ajyy) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ajzh.a, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, ajyy);
    }

    public final ajzl a(float f2) {
        ajzk b2 = b();
        b2.e(f2);
        return b2.a();
    }

    public final boolean a(RectF rectF) {
        boolean z;
        boolean z2;
        if (!this.m.getClass().equals(ajzb.class) || !this.k.getClass().equals(ajzb.class) || !this.j.getClass().equals(ajzb.class) || !this.l.getClass().equals(ajzb.class)) {
            z = false;
        } else {
            z = true;
        }
        float a2 = this.f.a(rectF);
        if (this.g.a(rectF) == a2 && this.i.a(rectF) == a2 && this.h.a(rectF) == a2) {
            z2 = true;
        } else {
            z2 = false;
        }
        return z && z2 && ((this.c instanceof ajzj) && (this.b instanceof ajzj) && (this.d instanceof ajzj) && (this.e instanceof ajzj));
    }
}
