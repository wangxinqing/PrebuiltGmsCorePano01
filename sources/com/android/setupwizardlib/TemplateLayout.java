package com.android.setupwizardlib;

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

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TemplateLayout extends FrameLayout {
    private ViewGroup a;
    public float b;
    public ViewTreeObserver.OnPreDrawListener c;
    private final Map d = new HashMap();

    public TemplateLayout(Context context, int i, int i2) {
        super(context);
        a(i, i2, (AttributeSet) null, R.attr.suwLayoutTheme);
    }

    private final void a(int i, int i2, AttributeSet attributeSet, int i3) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, bdg.s, i3, 0);
        if (i == 0) {
            i = obtainStyledAttributes.getResourceId(0, 0);
        }
        if (i2 == 0) {
            i2 = obtainStyledAttributes.getResourceId(1, 0);
        }
        super.addView(a(LayoutInflater.from(getContext()), i), -1, generateDefaultLayoutParams());
        ViewGroup a2 = a(i2);
        this.a = a2;
        if (a2 != null) {
            a();
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Container cannot be null in TemplateLayout");
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        this.a.addView(view, i, layoutParams);
    }

    public View c(int i) {
        return findViewById(i);
    }

    public float getXFraction() {
        return this.b;
    }

    public void setXFraction(float f) {
        this.b = f;
        int width = getWidth();
        if (width != 0) {
            setTranslationX(((float) width) * f);
        } else if (this.c == null) {
            this.c = new bdh(this);
            getViewTreeObserver().addOnPreDrawListener(this.c);
        }
    }

    public TemplateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(0, 0, attributeSet, R.attr.suwLayoutTheme);
    }

    public TemplateLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(0, 0, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public View a(LayoutInflater layoutInflater, int i) {
        return a(layoutInflater, 0, i);
    }

    /* access modifiers changed from: protected */
    public final View a(LayoutInflater layoutInflater, int i, int i2) {
        if (i2 != 0) {
            if (i != 0) {
                layoutInflater = LayoutInflater.from(new bef(layoutInflater.getContext(), i));
            }
            return layoutInflater.inflate(i2, this, false);
        }
        throw new IllegalArgumentException("android:layout not specified for TemplateLayout");
    }

    /* access modifiers changed from: protected */
    public ViewGroup a(int i) {
        if (i == 0) {
            i = 0;
        }
        return (ViewGroup) findViewById(i);
    }

    public final bea a(Class cls) {
        return (bea) this.d.get(cls);
    }

    /* access modifiers changed from: protected */
    public final void a(Class cls, bea bea) {
        this.d.put(cls, bea);
    }
}
