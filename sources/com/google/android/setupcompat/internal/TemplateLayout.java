package com.google.android.setupcompat.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TemplateLayout extends FrameLayout {
    private ViewGroup a;
    private final Map b = new HashMap();
    public float e;
    public ViewTreeObserver.OnPreDrawListener f;

    public TemplateLayout(Context context, int i, int i2) {
        super(context);
        a(i, i2, (AttributeSet) null, R.attr.sucLayoutTheme);
    }

    private final void a(int i, int i2, AttributeSet attributeSet, int i3) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, algd.f, i3, 0);
        if (i == 0) {
            i = obtainStyledAttributes.getResourceId(0, 0);
        }
        if (i2 == 0) {
            i2 = obtainStyledAttributes.getResourceId(1, 0);
        }
        a(attributeSet, i3);
        super.addView(a(LayoutInflater.from(getContext()), i), -1, generateDefaultLayoutParams());
        ViewGroup a2 = a(i2);
        this.a = a2;
        if (a2 != null) {
            d();
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Container cannot be null in TemplateLayout");
    }

    /* access modifiers changed from: protected */
    public void a(AttributeSet attributeSet, int i) {
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        this.a.addView(view, i, layoutParams);
    }

    public View b(int i) {
        return findViewById(i);
    }

    /* access modifiers changed from: protected */
    public void d() {
    }

    public float getXFraction() {
        return this.e;
    }

    public void setXFraction(float f2) {
        this.e = f2;
        int width = getWidth();
        if (width != 0) {
            setTranslationX(((float) width) * f2);
        } else if (this.f == null) {
            this.f = new algu(this);
            getViewTreeObserver().addOnPreDrawListener(this.f);
        }
    }

    public TemplateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(0, 0, attributeSet, R.attr.sucLayoutTheme);
    }

    public TemplateLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(0, 0, attributeSet, i);
    }

    public final alhi a(Class cls) {
        return (alhi) this.b.get(cls);
    }

    /* access modifiers changed from: protected */
    public View a(LayoutInflater layoutInflater, int i) {
        return a(layoutInflater, 0, i);
    }

    /* access modifiers changed from: protected */
    public final View a(LayoutInflater layoutInflater, int i, int i2) {
        if (i2 != 0) {
            if (i != 0) {
                layoutInflater = LayoutInflater.from(new algg(layoutInflater.getContext(), i));
            }
            return layoutInflater.inflate(i2, this, false);
        }
        throw new IllegalArgumentException("android:layout not specified for TemplateLayout");
    }

    /* access modifiers changed from: protected */
    public ViewGroup a(int i) {
        return (ViewGroup) findViewById(i);
    }

    /* access modifiers changed from: protected */
    public final void a(Class cls, alhi alhi) {
        this.b.put(cls, alhi);
    }
}
