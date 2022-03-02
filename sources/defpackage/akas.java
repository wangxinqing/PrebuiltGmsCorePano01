package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.gms.R;

/* renamed from: akas  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class akas extends FrameLayout {
    private static final View.OnTouchListener e = new akar();
    public int a;
    public final float b;
    public akam c;
    public akal d;
    private final float f;
    private ColorStateList g;
    private PorterDuff.Mode h;

    protected akas(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        super.onAttachedToWindow();
        akal akal = this.d;
        if (!(akal == null || Build.VERSION.SDK_INT < 29 || (rootWindowInsets = akal.a.e.getRootWindowInsets()) == null)) {
            akal.a.j = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            akal.a.a();
        }
        qb.r(this);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        boolean z;
        super.onDetachedFromWindow();
        akal akal = this.d;
        if (akal != null) {
            akat akat = akal.a;
            akba a2 = akba.a();
            akaj akaj = akat.m;
            synchronized (a2.a) {
                z = true;
                if (!a2.c(akaj) && !a2.d(akaj)) {
                    z = false;
                }
            }
            if (z) {
                akat.a.post(new akak(akal));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        akam akam = this.c;
        if (akam != null) {
            akat akat = akam.a;
            akat.e.c = null;
            akat.f();
        }
    }

    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.g == null)) {
            drawable = ma.f(drawable.mutate());
            ma.a(drawable, this.g);
            ma.a(drawable, this.h);
        }
        super.setBackgroundDrawable(drawable);
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        this.g = colorStateList;
        if (getBackground() != null) {
            Drawable f2 = ma.f(getBackground().mutate());
            ma.a(f2, colorStateList);
            ma.a(f2, this.h);
            if (f2 != getBackground()) {
                super.setBackgroundDrawable(f2);
            }
        }
    }

    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.h = mode;
        if (getBackground() != null) {
            Drawable f2 = ma.f(getBackground().mutate());
            ma.a(f2, mode);
            if (f2 != getBackground()) {
                super.setBackgroundDrawable(f2);
            }
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener == null ? e : null);
        super.setOnClickListener(onClickListener);
    }

    protected akas(Context context, AttributeSet attributeSet) {
        super(akdg.a(context, attributeSet, 0, 0), attributeSet);
        Drawable drawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, akau.a);
        if (obtainStyledAttributes.hasValue(6)) {
            qb.a((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.a = obtainStyledAttributes.getInt(2, 0);
        this.f = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(ajym.a(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(ajyf.a(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.b = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(e);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(ajuo.a(ajyl.a((View) this, (int) R.attr.colorSurface), ajyl.a((View) this, (int) R.attr.colorOnSurface), this.f));
            if (this.g != null) {
                drawable = ma.f(gradientDrawable);
                ma.a(drawable, this.g);
            } else {
                drawable = ma.f(gradientDrawable);
            }
            qb.a((View) this, drawable);
        }
    }
}
