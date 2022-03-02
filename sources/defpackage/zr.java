package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: zr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zr {
    public int a = 0;
    public Typeface b;
    public boolean c;
    private final TextView d;
    private aet e;
    private aet f;
    private aet g;
    private aet h;
    private aet i;
    private aet j;
    private aet k;
    private final zs l;
    private int m = -1;

    public zr(TextView textView) {
        this.d = textView;
        this.l = new zs(this.d);
    }

    private static aet a(Context context, yu yuVar, int i2) {
        ColorStateList b2 = yuVar.b(context, i2);
        if (b2 == null) {
            return null;
        }
        aet aet = new aet();
        aet.d = true;
        aet.a = b2;
        return aet;
    }

    private final void j() {
        aet aet = this.k;
        this.e = aet;
        this.f = aet;
        this.g = aet;
        this.h = aet;
        this.i = aet;
        this.j = aet;
    }

    public final void b() {
        this.l.f();
    }

    public final boolean c() {
        return this.l.g();
    }

    public final int d() {
        return this.l.a;
    }

    public final int e() {
        return this.l.a();
    }

    public final int f() {
        return this.l.b();
    }

    public final int g() {
        return this.l.c();
    }

    public final int[] h() {
        return this.l.f;
    }

    public final void i() {
        if (!rk.a) {
            b();
        }
    }

    private final void a(Context context, aev aev) {
        String d2;
        boolean z;
        boolean z2;
        aev aev2 = aev;
        int[] iArr = uh.a;
        this.a = aev2.a(2, this.a);
        if (Build.VERSION.SDK_INT >= 28) {
            int a2 = aev2.a(11, -1);
            this.m = a2;
            if (a2 != -1) {
                this.a &= 2;
            }
        }
        int i2 = 12;
        boolean z3 = false;
        if (aev2.f(10) || aev2.f(12)) {
            Typeface typeface = null;
            this.b = null;
            if (!aev2.f(12)) {
                i2 = 10;
            }
            int i3 = this.m;
            int i4 = this.a;
            if (!context.isRestricted()) {
                zq zqVar = new zq(this, i3, i4, new WeakReference(this.d));
                try {
                    int i5 = this.a;
                    int resourceId = aev2.b.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        if (aev2.c == null) {
                            aev2.c = new TypedValue();
                        }
                        Context context2 = aev2.a;
                        TypedValue typedValue = aev2.c;
                        if (!context2.isRestricted()) {
                            typeface = li.a(context2, resourceId, typedValue, i5, zqVar, true);
                        }
                    }
                    if (typeface != null) {
                        if (Build.VERSION.SDK_INT < 28 || this.m == -1) {
                            this.b = typeface;
                        } else {
                            Typeface create = Typeface.create(typeface, 0);
                            int i6 = this.m;
                            if ((this.a & 2) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            this.b = Typeface.create(create, i6, z2);
                        }
                    }
                    if (this.b == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.c = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException e2) {
                }
            }
            if (this.b == null && (d2 = aev2.d(i2)) != null) {
                if (Build.VERSION.SDK_INT >= 28 && this.m != -1) {
                    Typeface create2 = Typeface.create(d2, 0);
                    int i7 = this.m;
                    if ((2 & this.a) != 0) {
                        z3 = true;
                    }
                    this.b = Typeface.create(create2, i7, z3);
                    return;
                }
                this.b = Typeface.create(d2, this.a);
            }
        } else if (aev2.f(1)) {
            this.c = false;
            int a3 = aev2.a(1, 1);
            if (a3 == 1) {
                this.b = Typeface.SANS_SERIF;
            } else if (a3 == 2) {
                this.b = Typeface.SERIF;
            } else if (a3 == 3) {
                this.b = Typeface.MONOSPACE;
            }
        }
    }

    private final void a(Drawable drawable, aet aet) {
        if (drawable != null && aet != null) {
            yu.a(drawable, aet, this.d.getDrawableState());
        }
    }

    public final void a() {
        if (!(this.e == null && this.f == null && this.g == null && this.h == null)) {
            Drawable[] compoundDrawables = this.d.getCompoundDrawables();
            a(compoundDrawables[0], this.e);
            a(compoundDrawables[1], this.f);
            a(compoundDrawables[2], this.g);
            a(compoundDrawables[3], this.h);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (this.i != null || this.j != null) {
            Drawable[] compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.i);
            a(compoundDrawablesRelative[2], this.j);
        }
    }

    public final void a(int i2) {
        zs zsVar = this.l;
        if (!zsVar.h()) {
            return;
        }
        if (i2 == 0) {
            zsVar.a = 0;
            zsVar.d = -1.0f;
            zsVar.e = -1.0f;
            zsVar.c = -1.0f;
            zsVar.f = new int[0];
            zsVar.b = false;
        } else if (i2 == 1) {
            DisplayMetrics displayMetrics = zsVar.i.getResources().getDisplayMetrics();
            zsVar.a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (zsVar.e()) {
                zsVar.f();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
        }
    }

    public final void a(int i2, float f2) {
        if (!rk.a && !c()) {
            this.l.a(i2, f2);
        }
    }

    public final void a(int i2, int i3, int i4, int i5) {
        zs zsVar = this.l;
        if (zsVar.h()) {
            DisplayMetrics displayMetrics = zsVar.i.getResources().getDisplayMetrics();
            zsVar.a(TypedValue.applyDimension(i5, (float) i2, displayMetrics), TypedValue.applyDimension(i5, (float) i3, displayMetrics), TypedValue.applyDimension(i5, (float) i4, displayMetrics));
            if (zsVar.e()) {
                zsVar.f();
            }
        }
    }

    public final void a(Context context, int i2) {
        String d2;
        ColorStateList e2;
        aev a2 = aev.a(context, i2, uh.y);
        if (a2.f(14)) {
            a(a2.a(14, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a2.f(3) && (e2 = a2.e(3)) != null) {
            this.d.setTextColor(e2);
        }
        if (a2.f(0) && a2.d(0, -1) == 0) {
            this.d.setTextSize(0, 0.0f);
        }
        a(context, a2);
        if (Build.VERSION.SDK_INT >= 26 && a2.f(13) && (d2 = a2.d(13)) != null) {
            this.d.setFontVariationSettings(d2);
        }
        a2.a();
        Typeface typeface = this.b;
        if (typeface != null) {
            this.d.setTypeface(typeface, this.a);
        }
    }

    public final void a(ColorStateList colorStateList) {
        boolean z;
        if (this.k == null) {
            this.k = new aet();
        }
        aet aet = this.k;
        aet.a = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        aet.d = z;
        j();
    }

    public final void a(PorterDuff.Mode mode) {
        boolean z;
        if (this.k == null) {
            this.k = new aet();
        }
        aet aet = this.k;
        aet.b = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        aet.c = z;
        j();
    }

    public final void a(AttributeSet attributeSet, int i2) {
        String str;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z;
        ColorStateList colorStateList3;
        boolean z2;
        String str2;
        ColorStateList colorStateList4;
        ColorStateList colorStateList5;
        String str3;
        float f2;
        float f3;
        float f4;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int i3;
        int resourceId;
        AttributeSet attributeSet2 = attributeSet;
        int i4 = i2;
        Context context = this.d.getContext();
        yu b2 = yu.b();
        aev a2 = aev.a(context, attributeSet2, uh.h, i4, 0);
        TextView textView = this.d;
        qb.a(textView, textView.getContext(), uh.h, attributeSet, a2.b, i2, 0);
        int f5 = a2.f(0, -1);
        if (a2.f(3)) {
            this.e = a(context, b2, a2.f(3, 0));
        }
        if (a2.f(1)) {
            this.f = a(context, b2, a2.f(1, 0));
        }
        if (a2.f(4)) {
            this.g = a(context, b2, a2.f(4, 0));
        }
        if (a2.f(2)) {
            this.h = a(context, b2, a2.f(2, 0));
        }
        int i5 = Build.VERSION.SDK_INT;
        if (a2.f(5)) {
            this.i = a(context, b2, a2.f(5, 0));
        }
        if (a2.f(6)) {
            this.j = a(context, b2, a2.f(6, 0));
        }
        a2.a();
        boolean z3 = this.d.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (f5 == -1) {
            str2 = null;
            z2 = false;
            colorStateList3 = null;
            z = false;
            colorStateList2 = null;
            colorStateList = null;
            str = null;
        } else {
            aev a3 = aev.a(context, f5, uh.y);
            if (z3) {
                z2 = false;
                z = false;
            } else if (a3.f(14)) {
                z2 = a3.a(14, false);
                z = true;
            } else {
                z2 = false;
                z = false;
            }
            a(context, a3);
            if (Build.VERSION.SDK_INT >= 23) {
                colorStateList3 = null;
                colorStateList2 = null;
                colorStateList = null;
            } else {
                if (a3.f(3)) {
                    colorStateList3 = a3.e(3);
                } else {
                    colorStateList3 = null;
                }
                if (a3.f(4)) {
                    colorStateList2 = a3.e(4);
                } else {
                    colorStateList2 = null;
                }
                colorStateList = a3.f(5) ? a3.e(5) : null;
            }
            if (a3.f(15)) {
                str = a3.d(15);
            } else {
                str = null;
            }
            if (Build.VERSION.SDK_INT < 26 || !a3.f(13)) {
                str2 = null;
            } else {
                str2 = a3.d(13);
            }
            a3.a();
        }
        aev a4 = aev.a(context, attributeSet2, uh.y, i4, 0);
        if (!z3 && a4.f(14)) {
            z2 = a4.a(14, false);
            z = true;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            colorStateList5 = colorStateList2;
            colorStateList4 = colorStateList;
        } else {
            if (a4.f(3)) {
                colorStateList3 = a4.e(3);
            }
            if (a4.f(4)) {
                colorStateList2 = a4.e(4);
            }
            if (a4.f(5)) {
                colorStateList = a4.e(5);
            }
            colorStateList5 = colorStateList2;
            colorStateList4 = colorStateList;
        }
        if (a4.f(15)) {
            str3 = a4.d(15);
        } else {
            str3 = str;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (a4.f(13)) {
                str2 = a4.d(13);
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && a4.f(0) && a4.d(0, -1) == 0) {
            this.d.setTextSize(0, 0.0f);
        }
        a(context, a4);
        a4.a();
        if (colorStateList3 != null) {
            this.d.setTextColor(colorStateList3);
        }
        if (colorStateList5 != null) {
            this.d.setHintTextColor(colorStateList5);
        }
        if (colorStateList4 != null) {
            this.d.setLinkTextColor(colorStateList4);
        }
        if (!z3 && z) {
            a(z2);
        }
        Typeface typeface = this.b;
        if (typeface != null) {
            if (this.m == -1) {
                this.d.setTypeface(typeface, this.a);
            } else {
                this.d.setTypeface(typeface);
            }
        }
        if (str2 != null) {
            this.d.setFontVariationSettings(str2);
        }
        if (str3 != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                this.d.setTextLocales(LocaleList.forLanguageTags(str3));
            } else {
                int i6 = Build.VERSION.SDK_INT;
                this.d.setTextLocale(Locale.forLanguageTag(str3.substring(0, str3.indexOf(44))));
            }
        }
        zs zsVar = this.l;
        TypedArray obtainStyledAttributes = zsVar.i.obtainStyledAttributes(attributeSet2, uh.i, i4, 0);
        TextView textView2 = zsVar.h;
        qb.a(textView2, textView2.getContext(), uh.i, attributeSet, obtainStyledAttributes, i2, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            zsVar.a = obtainStyledAttributes.getInt(5, 0);
        }
        if (obtainStyledAttributes.hasValue(4)) {
            f2 = obtainStyledAttributes.getDimension(4, -1.0f);
        } else {
            f2 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(2)) {
            f3 = obtainStyledAttributes.getDimension(2, -1.0f);
        } else {
            f3 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            f4 = obtainStyledAttributes.getDimension(1, -1.0f);
        } else {
            f4 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr = new int[length];
            if (length > 0) {
                for (int i7 = 0; i7 < length; i7++) {
                    iArr[i7] = obtainTypedArray.getDimensionPixelSize(i7, -1);
                }
                zsVar.f = zs.a(iArr);
                zsVar.d();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!zsVar.h()) {
            zsVar.a = 0;
        } else if (zsVar.a == 1) {
            if (!zsVar.g) {
                DisplayMetrics displayMetrics = zsVar.i.getResources().getDisplayMetrics();
                if (f3 == -1.0f) {
                    i3 = 2;
                    f3 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i3 = 2;
                }
                if (f4 == -1.0f) {
                    f4 = TypedValue.applyDimension(i3, 112.0f, displayMetrics);
                }
                if (f2 == -1.0f) {
                    f2 = 1.0f;
                }
                zsVar.a(f3, f4, f2);
            }
            zsVar.e();
        }
        if (rk.a) {
            zs zsVar2 = this.l;
            if (zsVar2.a != 0) {
                int[] iArr2 = zsVar2.f;
                if (iArr2.length > 0) {
                    if (((float) this.d.getAutoSizeStepGranularity()) != -1.0f) {
                        this.d.setAutoSizeTextTypeUniformWithConfiguration(this.l.b(), this.l.c(), this.l.a(), 0);
                    } else {
                        this.d.setAutoSizeTextTypeUniformWithPresetSizes(iArr2, 0);
                    }
                }
            }
        }
        aev a5 = aev.a(context, attributeSet2, uh.i);
        int f6 = a5.f(8, -1);
        if (f6 != -1) {
            drawable = b2.a(context, f6);
        } else {
            drawable = null;
        }
        int f7 = a5.f(13, -1);
        if (f7 != -1) {
            drawable2 = b2.a(context, f7);
        } else {
            drawable2 = null;
        }
        int f8 = a5.f(9, -1);
        if (f8 != -1) {
            drawable3 = b2.a(context, f8);
        } else {
            drawable3 = null;
        }
        int f9 = a5.f(6, -1);
        if (f9 != -1) {
            drawable4 = b2.a(context, f9);
        } else {
            drawable4 = null;
        }
        int f10 = a5.f(10, -1);
        if (f10 != -1) {
            drawable5 = b2.a(context, f10);
        } else {
            drawable5 = null;
        }
        int f11 = a5.f(7, -1);
        if (f11 != -1) {
            drawable6 = b2.a(context, f11);
        } else {
            drawable6 = null;
        }
        int i8 = Build.VERSION.SDK_INT;
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
            TextView textView3 = this.d;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (!(drawable == null && drawable2 == null && drawable3 == null && drawable4 == null)) {
            int i9 = Build.VERSION.SDK_INT;
            Drawable[] compoundDrawablesRelative2 = this.d.getCompoundDrawablesRelative();
            Drawable drawable7 = compoundDrawablesRelative2[0];
            if (drawable7 == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.d.getCompoundDrawables();
                TextView textView4 = this.d;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView4.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            } else {
                TextView textView5 = this.d;
                if (drawable2 == null) {
                    drawable2 = compoundDrawablesRelative2[1];
                }
                Drawable drawable8 = compoundDrawablesRelative2[2];
                if (drawable4 == null) {
                    drawable4 = compoundDrawablesRelative2[3];
                }
                textView5.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
            }
        }
        if (a5.f(11)) {
            ColorStateList e2 = a5.e(11);
            TextView textView6 = this.d;
            ot.a((Object) textView6);
            if (Build.VERSION.SDK_INT >= 24) {
                textView6.setCompoundDrawableTintList(e2);
            } else if (textView6 instanceof rz) {
                ((rz) textView6).a(e2);
            }
        }
        if (a5.f(12)) {
            PorterDuff.Mode a6 = aak.a(a5.a(12, -1), (PorterDuff.Mode) null);
            TextView textView7 = this.d;
            ot.a((Object) textView7);
            if (Build.VERSION.SDK_INT >= 24) {
                textView7.setCompoundDrawableTintMode(a6);
            } else if (textView7 instanceof rz) {
                ((rz) textView7).a(a6);
            }
        }
        int d2 = a5.d(14, -1);
        int d3 = a5.d(17, -1);
        int d4 = a5.d(18, -1);
        a5.a();
        if (d2 != -1) {
            ry.b(this.d, d2);
        }
        if (d3 != -1) {
            ry.c(this.d, d3);
        }
        if (d4 != -1) {
            ry.d(this.d, d4);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.d.setAllCaps(z);
    }

    public final void a(int[] iArr, int i2) {
        zs zsVar = this.l;
        if (zsVar.h()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = zsVar.i.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, (float) iArr[i3], displayMetrics));
                    }
                }
                zsVar.f = zs.a(iArr2);
                if (!zsVar.d()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                zsVar.g = false;
            }
            if (zsVar.e()) {
                zsVar.f();
            }
        }
    }
}
