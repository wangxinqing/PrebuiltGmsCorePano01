package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import android.widget.TextView;

/* renamed from: ajur  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajur {
    private final Rect a;
    private final ColorStateList b;
    private final ColorStateList c;
    private final ColorStateList d;
    private final int e;
    private final ajzl f;

    private ajur(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, ajzl ajzl, Rect rect) {
        ot.a(rect.left);
        ot.a(rect.top);
        ot.a(rect.right);
        ot.a(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = ajzl;
    }

    static ajur a(Context context, int i) {
        ot.a(i != 0, (Object) "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, ajvw.b);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList a2 = ajym.a(context, obtainStyledAttributes, 4);
        ColorStateList a3 = ajym.a(context, obtainStyledAttributes, 9);
        ColorStateList a4 = ajym.a(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        ajzl a5 = ajzl.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0)).a();
        obtainStyledAttributes.recycle();
        return new ajur(a2, a3, a4, dimensionPixelSize, a5, rect);
    }

    public final int b() {
        return this.a.bottom;
    }

    public final int a() {
        return this.a.top;
    }

    /* access modifiers changed from: package-private */
    public final void a(TextView textView) {
        ajzf ajzf = new ajzf();
        ajzf ajzf2 = new ajzf();
        ajzf.a(this.f);
        ajzf2.a(this.f);
        ajzf.c(this.c);
        ajzf.a((float) this.e, this.d);
        textView.setTextColor(this.b);
        int i = Build.VERSION.SDK_INT;
        qb.a((View) textView, (Drawable) new InsetDrawable(new RippleDrawable(this.b.withAlpha(30), ajzf, ajzf2), this.a.left, this.a.top, this.a.right, this.a.bottom));
    }
}
