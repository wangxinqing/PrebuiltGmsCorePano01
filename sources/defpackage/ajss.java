package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.material.badge.BadgeDrawable$SavedState;
import java.lang.ref.WeakReference;

/* renamed from: ajss  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajss extends Drawable implements ajxw {
    public final WeakReference a;
    public final ajzf b = new ajzf();
    public final ajxx c;
    public final BadgeDrawable$SavedState d;
    public int e;
    public WeakReference f;
    public WeakReference g;
    private final Rect h = new Rect();
    private final float i;
    private final float j;
    private final float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;

    public ajss(Context context) {
        ajyq ajyq;
        Context context2;
        this.a = new WeakReference(context);
        ajya.b(context);
        Resources resources = context.getResources();
        this.i = (float) resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius);
        this.k = (float) resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding);
        this.j = (float) resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius);
        ajxx ajxx = new ajxx(this);
        this.c = ajxx;
        ajxx.a.setTextAlign(Paint.Align.CENTER);
        this.d = new BadgeDrawable$SavedState(context);
        Context context3 = (Context) this.a.get();
        if (context3 != null && this.c.d != (ajyq = new ajyq(context3, 2132018320)) && (context2 = (Context) this.a.get()) != null) {
            this.c.a(ajyq, context2);
            d();
        }
    }

    private final String e() {
        if (b() <= this.e) {
            return Integer.toString(b());
        }
        Context context = (Context) this.a.get();
        if (context == null) {
            return "";
        }
        return context.getString(R.string.mtrl_exceed_max_badge_number_suffix, new Object[]{Integer.valueOf(this.e), "+"});
    }

    public final void a(View view, ViewGroup viewGroup) {
        this.f = new WeakReference(view);
        this.g = new WeakReference(viewGroup);
        d();
        invalidateSelf();
    }

    public final int b() {
        if (a()) {
            return this.d.d;
        }
        return 0;
    }

    public final void c() {
        invalidateSelf();
    }

    public final void d() {
        View view;
        int i2;
        float f2;
        float f3;
        float f4;
        float f5;
        Context context = (Context) this.a.get();
        WeakReference weakReference = this.f;
        ViewGroup viewGroup = null;
        if (weakReference != null) {
            view = (View) weakReference.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.h);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference weakReference2 = this.g;
            if (weakReference2 != null) {
                viewGroup = (ViewGroup) weakReference2.get();
            }
            if (viewGroup == null) {
                int i3 = ajst.a;
            } else {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            int i4 = this.d.h;
            if (i4 == 8388691 || i4 == 8388693) {
                this.m = (float) (rect2.bottom - this.d.j);
            } else {
                this.m = (float) (rect2.top + this.d.j);
            }
            if (b() <= 9) {
                float f6 = a() ? this.j : this.i;
                this.n = f6;
                this.p = f6;
                this.o = f6;
            } else {
                float f7 = this.j;
                this.n = f7;
                this.p = f7;
                this.o = (this.c.a(e()) / 2.0f) + this.k;
            }
            Resources resources = context.getResources();
            if (!a()) {
                i2 = R.dimen.mtrl_badge_horizontal_edge_offset;
            } else {
                i2 = R.dimen.mtrl_badge_text_horizontal_edge_offset;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i2);
            int i5 = this.d.h;
            if (i5 == 8388659 || i5 == 8388691) {
                if (qb.h(view) == 0) {
                    int i6 = rect2.left;
                    f4 = this.o;
                    f5 = (((float) i6) - f4) + ((float) dimensionPixelSize) + ((float) this.d.i);
                } else {
                    int i7 = rect2.right;
                    f4 = this.o;
                    f5 = ((((float) i7) + f4) - ((float) dimensionPixelSize)) - ((float) this.d.i);
                }
                this.l = f3;
            } else {
                if (qb.h(view) == 0) {
                    int i8 = rect2.right;
                    f2 = this.o;
                    f3 = ((((float) i8) + f2) - ((float) dimensionPixelSize)) - ((float) this.d.i);
                } else {
                    int i9 = rect2.left;
                    f2 = this.o;
                    f3 = (((float) i9) - f2) + ((float) dimensionPixelSize) + ((float) this.d.i);
                }
                this.l = f3;
            }
            ajst.a(this.h, f3, this.m, f2, this.p);
            this.b.b(this.n);
            if (!rect.equals(this.h)) {
                this.b.setBounds(this.h);
            }
        }
    }

    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.b.draw(canvas);
            if (a()) {
                Rect rect = new Rect();
                String e2 = e();
                this.c.a.getTextBounds(e2, 0, e2.length(), rect);
                canvas.drawText(e2, this.l, this.m + ((float) (rect.height() / 2)), this.c.a);
            }
        }
    }

    public final int getAlpha() {
        return this.d.c;
    }

    public final int getIntrinsicHeight() {
        return this.h.height();
    }

    public final int getIntrinsicWidth() {
        return this.h.width();
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        return false;
    }

    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final void setAlpha(int i2) {
        this.d.c = i2;
        this.c.a.setAlpha(i2);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final boolean a() {
        return this.d.d != -1;
    }
}
