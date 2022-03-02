package com.android.setupwizardlib.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.Button;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NavigationBarButton extends Button {
    public NavigationBarButton(Context context) {
        super(context);
        a();
    }

    private final void a() {
        int i = Build.VERSION.SDK_INT;
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        for (int i2 = 0; i2 < compoundDrawablesRelative.length; i2++) {
            Drawable drawable = compoundDrawablesRelative[i2];
            if (drawable != null) {
                compoundDrawablesRelative[i2] = bep.a(drawable);
            }
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    private final void b() {
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            int i = Build.VERSION.SDK_INT;
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            Drawable[] drawableArr = {compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3], compoundDrawablesRelative[0], compoundDrawablesRelative[2]};
            for (int i2 = 0; i2 < 6; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable instanceof bep) {
                    bep bep = (bep) drawable;
                    bep.a = textColors;
                    if (bep.a()) {
                        bep.invalidateSelf();
                    }
                }
            }
            invalidate();
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            drawable = bep.a(drawable);
        }
        if (drawable2 != null) {
            drawable2 = bep.a(drawable2);
        }
        if (drawable3 != null) {
            drawable3 = bep.a(drawable3);
        }
        if (drawable4 != null) {
            drawable4 = bep.a(drawable4);
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b();
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            drawable = bep.a(drawable);
        }
        if (drawable2 != null) {
            drawable2 = bep.a(drawable2);
        }
        if (drawable3 != null) {
            drawable3 = bep.a(drawable3);
        }
        if (drawable4 != null) {
            drawable4 = bep.a(drawable4);
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b();
    }

    public final void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        b();
    }

    public NavigationBarButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
