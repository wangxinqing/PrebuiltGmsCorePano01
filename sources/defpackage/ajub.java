package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.gms.R;
import com.google.android.material.card.MaterialCardView;

/* renamed from: ajub  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajub {
    public static final double a = Math.cos(Math.toRadians(45.0d));
    private static final int[] s = {16842912};
    public final MaterialCardView b;
    public final Rect c = new Rect();
    public final ajzf d;
    public final ajzf e;
    public final int f;
    public final int g;
    public int h;
    public Drawable i;
    public Drawable j;
    public ColorStateList k;
    public ColorStateList l;
    public ColorStateList m;
    public Drawable n;
    public LayerDrawable o;
    public ajzf p;
    public boolean q = false;
    public boolean r;
    private ajzl t;
    private ajzf u;

    public ajub(MaterialCardView materialCardView, AttributeSet attributeSet, int i2) {
        this.b = materialCardView;
        ajzf ajzf = new ajzf(materialCardView.getContext(), attributeSet, i2, 2132019032);
        this.d = ajzf;
        ajzf.a(materialCardView.getContext());
        this.d.r();
        ajzk b2 = this.d.h().b();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, ajuc.a, i2, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            b2.e(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.e = new ajzf();
        a(b2.a());
        Resources resources = materialCardView.getResources();
        this.f = resources.getDimensionPixelSize(R.dimen.mtrl_card_checked_icon_margin);
        this.g = resources.getDimensionPixelSize(R.dimen.mtrl_card_checked_icon_size);
        obtainStyledAttributes.recycle();
    }

    private static final float a(ajyz ajyz, float f2) {
        if (ajyz instanceof ajzj) {
            double d2 = (double) f2;
            Double.isNaN(d2);
            return (float) ((1.0d - a) * d2);
        } else if (ajyz instanceof ajza) {
            return f2 / 2.0f;
        } else {
            return 0.0f;
        }
    }

    private final ajzf g() {
        return new ajzf(this.t);
    }

    public final boolean b() {
        int i2 = Build.VERSION.SDK_INT;
        return this.d.q();
    }

    public final boolean c() {
        return this.b.b && b() && this.b.a;
    }

    public final float d() {
        float a2 = a(this.t.b, this.d.p());
        ajyz ajyz = this.t.c;
        ajzf ajzf = this.d;
        float max = Math.max(a2, a(ajyz, ajzf.s.a.g.a(ajzf.j())));
        ajyz ajyz2 = this.t.d;
        ajzf ajzf2 = this.d;
        float a3 = a(ajyz2, ajzf2.s.a.h.a(ajzf2.j()));
        ajyz ajyz3 = this.t.e;
        ajzf ajzf3 = this.d;
        return Math.max(max, Math.max(a3, a(ajyz3, ajzf3.s.a.i.a(ajzf3.j()))));
    }

    public final Drawable e() {
        RippleDrawable rippleDrawable;
        if (this.n == null) {
            if (ajyu.a) {
                this.u = g();
                rippleDrawable = new RippleDrawable(this.k, (Drawable) null, this.u);
            } else {
                StateListDrawable stateListDrawable = new StateListDrawable();
                ajzf g2 = g();
                this.p = g2;
                g2.c(this.k);
                stateListDrawable.addState(new int[]{16842919}, this.p);
                rippleDrawable = stateListDrawable;
            }
            this.n = rippleDrawable;
        }
        if (this.o == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.n, this.e, f()});
            this.o = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.o;
    }

    public final Drawable f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.j;
        if (drawable != null) {
            stateListDrawable.addState(s, drawable);
        }
        return stateListDrawable;
    }

    public final Drawable a(Drawable drawable) {
        int i2;
        int i3;
        float f2;
        int i4 = Build.VERSION.SDK_INT;
        MaterialCardView materialCardView = this.b;
        if (materialCardView.a) {
            float a2 = materialCardView.a() * 1.5f;
            float f3 = 0.0f;
            if (c()) {
                f2 = d();
            } else {
                f2 = 0.0f;
            }
            int ceil = (int) Math.ceil((double) (a2 + f2));
            float a3 = this.b.a();
            if (c()) {
                f3 = d();
            }
            i2 = ceil;
            i3 = (int) Math.ceil((double) (a3 + f3));
        } else {
            i3 = 0;
            i2 = 0;
        }
        return new ajua(drawable, i3, i2, i3, i2);
    }

    public final void a() {
        this.d.d(this.b.f.b.getElevation());
    }

    public final void a(ajzl ajzl) {
        this.t = ajzl;
        this.d.a(ajzl);
        ajzf ajzf = this.d;
        ajzf.x = !ajzf.q();
        ajzf ajzf2 = this.e;
        if (ajzf2 != null) {
            ajzf2.a(ajzl);
        }
        ajzf ajzf3 = this.u;
        if (ajzf3 != null) {
            ajzf3.a(ajzl);
        }
        ajzf ajzf4 = this.p;
        if (ajzf4 != null) {
            ajzf4.a(ajzl);
        }
    }
}
