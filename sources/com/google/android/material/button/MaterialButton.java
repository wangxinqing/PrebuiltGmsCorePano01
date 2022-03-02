package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.AppCompatButton;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.google.android.gms.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MaterialButton extends AppCompatButton implements Checkable, ajzw {
    private static final int[] d = {16842911};
    private static final int[] e = {16842912};
    public int c;
    private final ajty f;
    private final LinkedHashSet g;
    private PorterDuff.Mode h;
    private ColorStateList i;
    private Drawable j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private int o;

    public MaterialButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private final String a() {
        return (!b() ? Button.class : CompoundButton.class).getName();
    }

    private final void b(boolean z) {
        if (!z) {
            ry.a(this, (Drawable) null, (Drawable) null, this.j, (Drawable) null);
        } else {
            ry.a(this, this.j, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    private final void c() {
        boolean z;
        if (this.j != null && getLayout() != null) {
            int i2 = this.o;
            boolean z2 = true;
            if (i2 == 1 || i2 == 3) {
                this.l = 0;
                a(false);
                return;
            }
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
            int i3 = this.k;
            if (i3 == 0) {
                i3 = this.j.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - min) - qb.j(this)) - i3) - this.c) - qb.i(this)) / 2;
            if (qb.h(this) != 1) {
                z = false;
            } else {
                z = true;
            }
            if (this.o != 4) {
                z2 = false;
            }
            if (z != z2) {
                measuredWidth = -measuredWidth;
            }
            if (this.l != measuredWidth) {
                this.l = measuredWidth;
                a(false);
            }
        }
    }

    private final boolean d() {
        ajty ajty = this.f;
        return ajty != null && !ajty.n;
    }

    public final boolean b() {
        ajty ajty = this.f;
        return ajty != null && ajty.o;
    }

    public final boolean isChecked() {
        return this.m;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ajzg.a((View) this, this.f.a());
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (b()) {
            mergeDrawableStates(onCreateDrawableState, d);
        }
        if (this.m) {
            mergeDrawableStates(onCreateDrawableState, e);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(a());
        accessibilityEvent.setChecked(this.m);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(a());
        accessibilityNodeInfo.setCheckable(b());
        accessibilityNodeInfo.setChecked(this.m);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        ajty ajty;
        super.onLayout(z, i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT == 21 && (ajty = this.f) != null) {
            int i6 = i5 - i3;
            int i7 = i4 - i2;
            Drawable drawable = ajty.m;
            if (drawable != null) {
                drawable.setBounds(ajty.c, ajty.e, i7 - ajty.d, i6 - ajty.f);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        c();
    }

    /* access modifiers changed from: protected */
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        c();
    }

    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public final void setBackgroundColor(int i2) {
        if (d()) {
            ajty ajty = this.f;
            if (ajty.a() != null) {
                ajty.a().setTint(i2);
                return;
            }
            return;
        }
        super.setBackgroundColor(i2);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        if (!d()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
            ajty ajty = this.f;
            ajty.n = true;
            ajty.a.b(ajty.j);
            ajty.a.b(ajty.i);
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public final void setBackgroundResource(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            drawable = uj.b(getContext(), i2);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        b(colorStateList);
    }

    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        b(mode);
    }

    public final void setChecked(boolean z) {
        if (b() && isEnabled() && this.m != z) {
            this.m = z;
            refreshDrawableState();
            if (!this.n) {
                this.n = true;
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    ((ajtx) it.next()).a();
                }
                this.n = false;
            }
        }
    }

    public final void setElevation(float f2) {
        super.setElevation(f2);
        if (d()) {
            this.f.a().d(f2);
        }
    }

    public final void toggle() {
        setChecked(!this.m);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonStyle);
    }

    private final void a(boolean z) {
        Drawable drawable = this.j;
        if (drawable != null) {
            Drawable mutate = ma.f(drawable).mutate();
            this.j = mutate;
            ma.a(mutate, this.i);
            PorterDuff.Mode mode = this.h;
            if (mode != null) {
                ma.a(this.j, mode);
            }
            int i2 = this.k;
            if (i2 == 0) {
                i2 = this.j.getIntrinsicWidth();
            }
            int i3 = this.k;
            if (i3 == 0) {
                i3 = this.j.getIntrinsicHeight();
            }
            Drawable drawable2 = this.j;
            int i4 = this.l;
            drawable2.setBounds(i4, 0, i2 + i4, i3);
        }
        int i5 = this.o;
        boolean z2 = true;
        if (!(i5 == 1 || i5 == 2)) {
            z2 = false;
        }
        if (!z) {
            Drawable[] b = ry.b(this);
            Drawable drawable3 = b[0];
            Drawable drawable4 = b[2];
            if ((z2 && drawable3 != this.j) || (!z2 && drawable4 != this.j)) {
                b(z2);
                return;
            }
            return;
        }
        b(z2);
    }

    public final ColorStateList getBackgroundTintList() {
        aet aet;
        if (d()) {
            return this.f.j;
        }
        yp ypVar = this.b;
        if (ypVar == null || (aet = ypVar.a) == null) {
            return null;
        }
        return aet.a;
    }

    public final PorterDuff.Mode getBackgroundTintMode() {
        aet aet;
        if (d()) {
            return this.f.i;
        }
        yp ypVar = this.b;
        if (ypVar == null || (aet = ypVar.a) == null) {
            return null;
        }
        return aet.b;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r22, android.util.AttributeSet r23, int r24) {
        /*
            r21 = this;
            r0 = r21
            r7 = r23
            r8 = r24
            r9 = 2132019020(0x7f14074c, float:1.9676363E38)
            r1 = r22
            android.content.Context r1 = defpackage.akdg.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.g = r1
            r10 = 0
            r0.m = r10
            r0.n = r10
            android.content.Context r11 = r21.getContext()
            int[] r3 = defpackage.ajtz.a
            int[] r6 = new int[r10]
            r5 = 2132019020(0x7f14074c, float:1.9676363E38)
            r1 = r11
            r2 = r23
            r4 = r24
            android.content.res.TypedArray r1 = defpackage.ajya.a(r1, r2, r3, r4, r5, r6)
            r2 = 11
            int r2 = r1.getDimensionPixelSize(r2, r10)
            r0.c = r2
            r2 = 14
            r3 = -1
            int r2 = r1.getInt(r2, r3)
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r2 = defpackage.ajyf.a((int) r2, (android.graphics.PorterDuff.Mode) r4)
            r0.h = r2
            android.content.Context r2 = r21.getContext()
            r4 = 13
            android.content.res.ColorStateList r2 = defpackage.ajym.a((android.content.Context) r2, (android.content.res.TypedArray) r1, (int) r4)
            r0.i = r2
            android.content.Context r2 = r21.getContext()
            r4 = 9
            android.graphics.drawable.Drawable r2 = defpackage.ajym.b(r2, r1, r4)
            r0.j = r2
            r2 = 10
            r4 = 1
            int r2 = r1.getInteger(r2, r4)
            r0.o = r2
            r2 = 12
            int r2 = r1.getDimensionPixelSize(r2, r10)
            r0.k = r2
            ajzk r2 = defpackage.ajzl.a((android.content.Context) r11, (android.util.AttributeSet) r7, (int) r8, (int) r9)
            ajzl r2 = r2.a()
            ajty r5 = new ajty
            r5.<init>(r0, r2)
            r0.f = r5
            int r2 = r1.getDimensionPixelOffset(r10, r10)
            r5.c = r2
            int r2 = r1.getDimensionPixelOffset(r4, r10)
            r5.d = r2
            r2 = 2
            int r6 = r1.getDimensionPixelOffset(r2, r10)
            r5.e = r6
            r6 = 3
            int r6 = r1.getDimensionPixelOffset(r6, r10)
            r5.f = r6
            r6 = 7
            boolean r7 = r1.hasValue(r6)
            if (r7 == 0) goto L_0x00b2
            int r6 = r1.getDimensionPixelSize(r6, r3)
            r5.g = r6
            ajzl r7 = r5.b
            float r6 = (float) r6
            ajzl r6 = r7.a((float) r6)
            r5.a((defpackage.ajzl) r6)
        L_0x00b2:
            r6 = 19
            int r6 = r1.getDimensionPixelSize(r6, r10)
            r5.h = r6
            r6 = 6
            int r6 = r1.getInt(r6, r3)
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r6 = defpackage.ajyf.a((int) r6, (android.graphics.PorterDuff.Mode) r7)
            r5.i = r6
            com.google.android.material.button.MaterialButton r6 = r5.a
            android.content.Context r6 = r6.getContext()
            r7 = 5
            android.content.res.ColorStateList r6 = defpackage.ajym.a((android.content.Context) r6, (android.content.res.TypedArray) r1, (int) r7)
            r5.j = r6
            com.google.android.material.button.MaterialButton r6 = r5.a
            android.content.Context r6 = r6.getContext()
            r7 = 18
            android.content.res.ColorStateList r6 = defpackage.ajym.a((android.content.Context) r6, (android.content.res.TypedArray) r1, (int) r7)
            r5.k = r6
            com.google.android.material.button.MaterialButton r6 = r5.a
            android.content.Context r6 = r6.getContext()
            r7 = 15
            android.content.res.ColorStateList r6 = defpackage.ajym.a((android.content.Context) r6, (android.content.res.TypedArray) r1, (int) r7)
            r5.l = r6
            r6 = 4
            boolean r6 = r1.getBoolean(r6, r10)
            r5.o = r6
            r6 = 8
            int r6 = r1.getDimensionPixelSize(r6, r10)
            com.google.android.material.button.MaterialButton r7 = r5.a
            int r7 = defpackage.qb.i(r7)
            com.google.android.material.button.MaterialButton r8 = r5.a
            int r8 = r8.getPaddingTop()
            com.google.android.material.button.MaterialButton r9 = r5.a
            int r9 = defpackage.qb.j(r9)
            com.google.android.material.button.MaterialButton r11 = r5.a
            int r11 = r11.getPaddingBottom()
            com.google.android.material.button.MaterialButton r12 = r5.a
            ajzf r13 = new ajzf
            ajzl r14 = r5.b
            r13.<init>((defpackage.ajzl) r14)
            com.google.android.material.button.MaterialButton r14 = r5.a
            android.content.Context r14 = r14.getContext()
            r13.a((android.content.Context) r14)
            android.content.res.ColorStateList r14 = r5.j
            defpackage.ma.a((android.graphics.drawable.Drawable) r13, (android.content.res.ColorStateList) r14)
            android.graphics.PorterDuff$Mode r14 = r5.i
            if (r14 != 0) goto L_0x0131
            goto L_0x0134
        L_0x0131:
            defpackage.ma.a((android.graphics.drawable.Drawable) r13, (android.graphics.PorterDuff.Mode) r14)
        L_0x0134:
            int r14 = r5.h
            float r14 = (float) r14
            android.content.res.ColorStateList r15 = r5.k
            r13.a((float) r14, (android.content.res.ColorStateList) r15)
            ajzf r14 = new ajzf
            ajzl r15 = r5.b
            r14.<init>((defpackage.ajzl) r15)
            r14.setTint(r10)
            int r15 = r5.h
            float r15 = (float) r15
            r14.a((float) r15, (int) r10)
            ajzf r15 = new ajzf
            ajzl r4 = r5.b
            r15.<init>((defpackage.ajzl) r4)
            r5.m = r15
            android.graphics.drawable.Drawable r4 = r5.m
            defpackage.ma.a((android.graphics.drawable.Drawable) r4, (int) r3)
            android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r4 = r5.l
            android.content.res.ColorStateList r4 = defpackage.ajyu.b(r4)
            android.graphics.drawable.LayerDrawable r15 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r2]
            r2[r10] = r14
            r14 = 1
            r2[r14] = r13
            r15.<init>(r2)
            android.graphics.drawable.InsetDrawable r2 = new android.graphics.drawable.InsetDrawable
            int r13 = r5.c
            int r10 = r5.e
            int r14 = r5.d
            int r0 = r5.f
            r16 = r15
            r15 = r2
            r17 = r13
            r18 = r10
            r19 = r14
            r20 = r0
            r15.<init>(r16, r17, r18, r19, r20)
            android.graphics.drawable.Drawable r0 = r5.m
            r3.<init>(r4, r2, r0)
            r5.p = r3
            android.graphics.drawable.LayerDrawable r0 = r5.p
            super.setBackgroundDrawable(r0)
            ajzf r0 = r5.a()
            if (r0 != 0) goto L_0x0199
            goto L_0x019d
        L_0x0199:
            float r2 = (float) r6
            r0.d((float) r2)
        L_0x019d:
            com.google.android.material.button.MaterialButton r0 = r5.a
            int r2 = r5.c
            int r7 = r7 + r2
            int r2 = r5.e
            int r8 = r8 + r2
            int r2 = r5.d
            int r9 = r9 + r2
            int r2 = r5.f
            int r11 = r11 + r2
            defpackage.qb.a(r0, r7, r8, r9, r11)
            r1.recycle()
            r0 = r21
            int r1 = r0.c
            r0.setCompoundDrawablePadding(r1)
            android.graphics.drawable.Drawable r1 = r0.j
            if (r1 == 0) goto L_0x01be
            r10 = 1
            goto L_0x01bf
        L_0x01be:
            r10 = 0
        L_0x01bf:
            r0.a((boolean) r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void b(ColorStateList colorStateList) {
        if (d()) {
            ajty ajty = this.f;
            if (ajty.j != colorStateList) {
                ajty.j = colorStateList;
                if (ajty.a() != null) {
                    ma.a((Drawable) ajty.a(), ajty.j);
                    return;
                }
                return;
            }
            return;
        }
        yp ypVar = this.b;
        if (ypVar != null) {
            if (ypVar.a == null) {
                ypVar.a = new aet();
            }
            aet aet = ypVar.a;
            aet.a = colorStateList;
            aet.d = true;
            ypVar.a();
        }
    }

    public final void b(PorterDuff.Mode mode) {
        if (d()) {
            ajty ajty = this.f;
            if (ajty.i != mode) {
                ajty.i = mode;
                if (ajty.a() != null && ajty.i != null) {
                    ma.a((Drawable) ajty.a(), ajty.i);
                    return;
                }
                return;
            }
            return;
        }
        yp ypVar = this.b;
        if (ypVar != null) {
            if (ypVar.a == null) {
                ypVar.a = new aet();
            }
            aet aet = ypVar.a;
            aet.b = mode;
            aet.c = true;
            ypVar.a();
        }
    }

    public final void a(ajzl ajzl) {
        if (d()) {
            this.f.a(ajzl);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public final void a(Drawable drawable) {
        if (this.j != drawable) {
            this.j = drawable;
            a(true);
        }
    }
}
