package androidx.leanback.widget;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SearchOrbView extends FrameLayout implements View.OnClickListener {
    public View.OnClickListener a;
    public View b;
    private View c;
    private ImageView d;
    private Drawable e;
    private alb f;
    private final float g;
    private final int h;
    private final int i;
    private final float j;
    private final float k;
    private ValueAnimator l;
    private boolean m;
    private boolean n;
    private final ArgbEvaluator o;
    private final ValueAnimator.AnimatorUpdateListener p;
    private ValueAnimator q;
    private final ValueAnimator.AnimatorUpdateListener r;

    public SearchOrbView(Context context) {
        this(context, (AttributeSet) null);
    }

    private final void b() {
        ValueAnimator valueAnimator = this.l;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.l = null;
        }
        if (this.m && this.n) {
            ValueAnimator ofObject = ValueAnimator.ofObject(this.o, new Object[]{Integer.valueOf(this.f.a), Integer.valueOf(this.f.b), Integer.valueOf(this.f.a)});
            this.l = ofObject;
            ofObject.setRepeatCount(-1);
            ValueAnimator valueAnimator2 = this.l;
            int i2 = this.h;
            valueAnimator2.setDuration((long) (i2 + i2));
            this.l.addUpdateListener(this.p);
            this.l.start();
        }
    }

    public int a() {
        return R.layout.lb_search_orb;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
        b();
    }

    public void onClick(View view) {
        View.OnClickListener onClickListener = this.a;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.n = false;
        b();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        a(z);
    }

    public SearchOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchOrbViewStyle);
    }

    public final void a(float f2) {
        View view = this.b;
        float f3 = this.j;
        qb.b(view, f3 + (f2 * (this.k - f3)));
    }

    public SearchOrbView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.o = new ArgbEvaluator();
        this.p = new akz(this);
        this.r = new ala(this);
        Resources resources = context.getResources();
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(a(), this, true);
        this.c = inflate;
        this.b = inflate.findViewById(R.id.search_orb);
        this.d = (ImageView) this.c.findViewById(R.id.icon);
        this.g = context.getResources().getFraction(R.fraction.lb_search_orb_focused_zoom, 1, 1);
        this.h = context.getResources().getInteger(R.integer.lb_search_orb_pulse_duration_ms);
        this.i = context.getResources().getInteger(R.integer.lb_search_orb_scale_duration_ms);
        this.k = (float) context.getResources().getDimensionPixelSize(R.dimen.lb_search_orb_focused_z);
        this.j = (float) context.getResources().getDimensionPixelSize(R.dimen.lb_search_orb_unfocused_z);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ait.h, i2, 0);
        qb.a(this, context, ait.h, attributeSet, obtainStyledAttributes, i2, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        a(drawable == null ? resources.getDrawable(R.drawable.lb_ic_in_app_search) : drawable);
        int color = obtainStyledAttributes.getColor(1, resources.getColor(R.color.lb_default_search_color));
        a(new alb(color, obtainStyledAttributes.getColor(0, color), obtainStyledAttributes.getColor(3, 0)));
        obtainStyledAttributes.recycle();
        setFocusable(true);
        setClipChildren(false);
        setOnClickListener(this);
        setSoundEffectsEnabled(false);
        a(0.0f);
        qb.b((View) this.d, this.k);
    }

    public final void a(int i2) {
        if (this.b.getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) this.b.getBackground()).setColor(i2);
        }
    }

    public final void b(boolean z) {
        this.m = z;
        b();
    }

    public final void a(alb alb) {
        this.f = alb;
        this.d.setColorFilter(alb.c);
        if (this.l == null) {
            a(this.f.a);
        } else {
            b(true);
        }
    }

    public final void a(Drawable drawable) {
        this.e = drawable;
        this.d.setImageDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        float f2;
        if (z) {
            f2 = this.g;
        } else {
            f2 = 1.0f;
        }
        this.c.animate().scaleX(f2).scaleY(f2).setDuration((long) this.i).start();
        int i2 = this.i;
        if (this.q == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.q = ofFloat;
            ofFloat.addUpdateListener(this.r);
        }
        if (!z) {
            this.q.reverse();
        } else {
            this.q.start();
        }
        this.q.setDuration((long) i2);
        b(z);
    }
}
