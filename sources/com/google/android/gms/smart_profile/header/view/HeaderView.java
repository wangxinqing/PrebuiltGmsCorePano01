package com.google.android.gms.smart_profile.header.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class HeaderView extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    private int A;
    public final AvatarView a;
    public final ImageView b;
    public final View c;
    public final ViewGroup d;
    public final CircleView e;
    public final boolean f;
    public int g;
    public int h;
    public float i;
    public boolean j;
    public boolean k;
    public abld l;
    private final ViewGroup m;
    private final ViewGroup n;
    private final ViewGroup o;
    private final ViewGroup p;
    private final TextView q;
    private final TextView r;
    private final int s;
    private ValueAnimator t;
    private boolean u;
    private Path v;
    private float[] w;
    private float x;
    private RelativeLayout y;
    private int z;

    public HeaderView(Context context) {
        this(context, (AttributeSet) null);
    }

    private static int a(int i2, int i3, float f2) {
        return (int) (((float) i2) + (((float) (i3 - i2)) * (1.0f - f2)));
    }

    private final void b(int i2) {
        if (azim.b() && azig.b() && azhx.b()) {
            if (this.y.getBackground() instanceof GradientDrawable) {
                ((GradientDrawable) this.y.getBackground()).setColor(i2);
            } else {
                this.y.setBackgroundColor(i2);
            }
        }
    }

    private static final float c(float f2) {
        float max = Math.max(Math.min(0.7f, 1.0f), 0.0f);
        if (f2 > max) {
            return (f2 - max) / (1.0f - max);
        }
        return 0.0f;
    }

    public final void d() {
        this.u = true;
        this.p.setVisibility(8);
    }

    public final boolean e() {
        return this.i == 1.0f;
    }

    public final boolean f() {
        return this.i == 0.0f;
    }

    public final void onGlobalLayout() {
        int i2;
        int a2 = a((int) R.dimen.profile_header_avatar_diameter);
        int a3 = a((int) R.dimen.profile_header_expanded_avatar_vertical_spacing);
        int width = (getWidth() / 2) - (a2 / 2);
        int a4 = a((int) R.dimen.profile_header_avatar_collapsed_margin_left);
        if (azim.b()) {
            i2 = (this.s - a((int) R.dimen.profile_header_avatar_collapsed_diameter)) / 2;
        } else {
            i2 = a((int) R.dimen.profile_header_avatar_collapsed_margin_top);
        }
        if (this.f) {
            if (azim.b()) {
                a3 = this.s;
            }
            width = a((int) R.dimen.avatar_side_space_bugfixed);
            if (qb.h(this) == 1) {
                width = (getWidth() - a2) - width;
                ((RelativeLayout) this.n).setGravity(5);
                this.q.setGravity(5);
            }
        }
        if (qb.h(this) == 1) {
            a4 = (getWidth() - a((int) R.dimen.profile_header_avatar_collapsed_margin_left)) - a((int) R.dimen.profile_header_avatar_collapsed_diameter);
            this.r.setGravity(8388613);
        }
        Path path = new Path();
        this.v = path;
        float f2 = (float) width;
        path.moveTo(f2, (float) a3);
        int i3 = i2 + i2;
        this.v.lineTo(f2, (float) i3);
        this.v.quadTo(f2, 0.0f, (float) a4, (float) i2);
        this.x = (float) (a3 - i3);
        b(this.i);
        int i4 = Build.VERSION.SDK_INT;
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, 0);
        this.g = this.o.getMeasuredHeight();
        setMeasuredDimension(this.n.getMeasuredWidth(), a(this.s, this.g, this.i));
    }

    public HeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final int a(int i2) {
        return getResources().getDimensionPixelSize(i2);
    }

    public final void c() {
        ValueAnimator valueAnimator = this.t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public HeaderView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.i = 0.0f;
        boolean z2 = false;
        this.j = false;
        this.k = false;
        this.u = false;
        this.w = new float[2];
        if (azim.b()) {
            if (!azig.b() || !azhx.b()) {
                this.d = (ViewGroup) inflate(getContext(), R.layout.gm_header_view, (ViewGroup) null);
            } else {
                this.d = (ViewGroup) inflate(getContext(), R.layout.gm_header_view_fix, (ViewGroup) null);
            }
            Context context2 = getContext();
            TypedValue typedValue = new TypedValue();
            int complexToDimensionPixelSize = context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true) ? TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()) : 0;
            this.s = complexToDimensionPixelSize == 0 ? a((int) R.dimen.profile_header_collapsed_height) : complexToDimensionPixelSize;
        } else {
            this.d = (ViewGroup) inflate(getContext(), R.layout.profile_header_view, (ViewGroup) null);
            this.s = a((int) R.dimen.profile_header_collapsed_height);
        }
        addView(this.d);
        ViewGroup viewGroup = (ViewGroup) this.d.findViewById(R.id.profile_header_avatar_container);
        this.m = viewGroup;
        viewGroup.setPivotY(0.0f);
        this.m.setPivotX(0.0f);
        int i3 = Build.VERSION.SDK_INT;
        this.m.setOutlineProvider(new ablc(this));
        this.a = (AvatarView) this.d.findViewById(R.id.profile_header_avatar_view);
        this.b = (ImageView) this.d.findViewById(R.id.profile_header_default_avatar_icon);
        this.c = this.d.findViewById(R.id.profile_header_action_bar_container);
        this.n = (ViewGroup) this.d.findViewById(R.id.profile_header_action_bar_expanded_text);
        this.o = (ViewGroup) this.d.findViewById(R.id.profile_header_action_bar_content);
        this.p = (ViewGroup) this.d.findViewById(R.id.quick_actions_bar_container);
        this.q = (TextView) this.d.findViewById(R.id.profile_header_display_name);
        this.r = (TextView) this.d.findViewById(R.id.profile_header_action_bar_display_name);
        this.e = (CircleView) this.d.findViewById(R.id.profile_header_default_avatar_circle_view);
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f = getResources().getConfiguration().orientation == 2 ? true : z2;
        if (azim.b()) {
            int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                this.h = getResources().getDimensionPixelSize(identifier);
            }
            if (azig.b() && azhx.b()) {
                this.z = jsa.a(getContext(), R.attr.headerBackgroundCollapsedColor);
                this.A = jsa.a(getContext(), R.attr.headerBackgroundExpandedColor);
                if (this.f) {
                    this.y = (RelativeLayout) this.d.findViewById(R.id.profile_header_action_bar_content);
                } else {
                    this.y = (RelativeLayout) this.d.findViewById(R.id.profile_header_bar);
                }
            }
        }
    }

    public final void a() {
        a(0.0f);
    }

    public final void b() {
        a(1.0f);
    }

    public final void a(float f2) {
        if (!f() && !e()) {
            this.t = ValueAnimator.ofFloat(new float[]{this.i, f2});
            this.t.setInterpolator(new DecelerateInterpolator(1.5f));
            this.t.addUpdateListener(new abla(this));
            this.t.setDuration(250).start();
        }
    }

    public final void b(float f2) {
        int i2;
        float min = Math.min(Math.max(f2, 0.0f), 1.0f);
        this.i = min;
        int i3 = 0;
        PathMeasure pathMeasure = new PathMeasure(this.v, false);
        pathMeasure.getPosTan(pathMeasure.getLength() * this.i, this.w, (float[]) null);
        this.m.setX((float) ((int) this.w[0]));
        this.m.setY((float) ((int) this.w[1]));
        float length = this.x / pathMeasure.getLength();
        float f3 = this.i;
        float f4 = f3 >= length ? (f3 - length) / (1.0f - length) : 0.0f;
        float a2 = 1.0f - ((1.0f - (((float) a((int) R.dimen.profile_header_avatar_collapsed_diameter)) / ((float) a((int) R.dimen.profile_header_avatar_diameter)))) * f4);
        this.m.setScaleX(a2);
        this.m.setScaleY(a2);
        int i4 = Build.VERSION.SDK_INT;
        double d2 = (double) f4;
        Double.isNaN(d2);
        double sin = Math.sin(d2 * 3.141592653589793d);
        double min2 = Math.min(1.0d, sin + sin);
        int a3 = a((int) R.dimen.profile_header_avatar_collapsed_diameter);
        ViewGroup viewGroup = this.m;
        double d3 = (double) a3;
        Double.isNaN(d3);
        viewGroup.setTranslationZ((float) ((int) (min2 * d3)));
        requestLayout();
        if (!this.f) {
            int i5 = this.g;
            int i6 = -(i5 - a(this.s, i5, min));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.o.getLayoutParams();
            if (azim.b()) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) findViewById(R.id.profile_header_action_bar_collapsed).getLayoutParams();
                marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, Math.max(i6, -a((int) R.dimen.header_transparent_window_start_size)), marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
            }
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i6, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            this.o.requestLayout();
        }
        float c2 = c(min);
        float c3 = c(1.0f - min);
        this.r.setAlpha(c2);
        this.n.setAlpha(c3);
        TextView textView = this.r;
        if (c2 == 0.0f) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        textView.setVisibility(i2);
        ViewGroup viewGroup2 = this.n;
        if (c3 == 0.0f) {
            i3 = 4;
        }
        viewGroup2.setVisibility(i3);
        if (!this.u) {
            this.p.setAlpha(c3);
            this.p.setVisibility(i3);
        }
        if (this.k) {
            View findViewById = findViewById(R.id.domain_icon);
            findViewById.setAlpha(c3);
            findViewById.setVisibility(i3);
        }
        abld abld = this.l;
        if (abld != null) {
            abld.a();
        }
        if (azim.b() && azig.b() && azhx.b()) {
            if (e()) {
                b(this.z);
            } else {
                b(this.A);
            }
        }
    }

    public final void a(int i2, String str) {
        TextView textView = (TextView) this.d.findViewById(i2);
        textView.setText(str);
        textView.setVisibility(0);
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.q.setContentDescription(str);
            this.r.setContentDescription(str);
            this.r.setText(str);
            this.q.setText(str);
            this.q.setOnLongClickListener(new ablb(this, str));
        }
    }
}
