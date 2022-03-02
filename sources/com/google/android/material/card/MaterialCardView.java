package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MaterialCardView extends CardView implements Checkable, ajzw {
    private static final int[] g = {16842911};
    private static final int[] h = {16842912};
    private final ajub i;
    private boolean j;
    private boolean k;

    public MaterialCardView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void a(float f) {
        super.a(f);
        this.i.a();
    }

    public final boolean c() {
        ajub ajub = this.i;
        return ajub != null && ajub.r;
    }

    public final boolean isChecked() {
        return this.k;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ajzg.a((View) this, this.i.d);
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 3);
        if (c()) {
            mergeDrawableStates(onCreateDrawableState, g);
        }
        if (this.k) {
            mergeDrawableStates(onCreateDrawableState, h);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.k);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(c());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.k);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int i4;
        super.onMeasure(i2, i3);
        ajub ajub = this.i;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (ajub.o != null) {
            int i5 = ajub.f;
            int i6 = ajub.g;
            int i7 = (measuredWidth - i5) - i6;
            int i8 = (measuredHeight - i5) - i6;
            int h2 = qb.h(ajub.b);
            if (h2 == 1) {
                i4 = i7;
            } else {
                i4 = i5;
            }
            ajub.o.setLayerInset(2, h2 == 1 ? i5 : i7, ajub.f, i4, i8);
        }
    }

    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        if (this.j) {
            if (!this.i.q) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.i.q = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public final void setChecked(boolean z) {
        if (this.k != z) {
            toggle();
        }
    }

    public final void setClickable(boolean z) {
        Drawable drawable;
        super.setClickable(z);
        ajub ajub = this.i;
        Drawable drawable2 = ajub.i;
        if (ajub.b.isClickable()) {
            drawable = ajub.e();
        } else {
            drawable = ajub.e;
        }
        ajub.i = drawable;
        Drawable drawable3 = ajub.i;
        if (drawable2 == drawable3) {
            return;
        }
        if (Build.VERSION.SDK_INT < 23 || !(ajub.b.getForeground() instanceof InsetDrawable)) {
            ajub.b.setForeground(ajub.a(drawable3));
        } else {
            ((InsetDrawable) ajub.b.getForeground()).setDrawable(drawable3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        r0 = r8.i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void toggle() {
        /*
            r8 = this;
            boolean r0 = r8.c()
            if (r0 == 0) goto L_0x003f
            boolean r0 = r8.isEnabled()
            if (r0 == 0) goto L_0x003f
            boolean r0 = r8.k
            r0 = r0 ^ 1
            r8.k = r0
            r8.refreshDrawableState()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 <= r1) goto L_0x003f
            ajub r0 = r8.i
            android.graphics.drawable.Drawable r1 = r0.n
            if (r1 == 0) goto L_0x003f
            android.graphics.Rect r1 = r1.getBounds()
            int r2 = r1.bottom
            android.graphics.drawable.Drawable r3 = r0.n
            int r4 = r1.left
            int r5 = r1.top
            int r6 = r1.right
            int r7 = r2 + -1
            r3.setBounds(r4, r5, r6, r7)
            android.graphics.drawable.Drawable r0 = r0.n
            int r3 = r1.left
            int r4 = r1.top
            int r1 = r1.right
            r0.setBounds(r3, r4, r1, r2)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.toggle():void");
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialCardViewStyle);
    }

    public final void a(ajzl ajzl) {
        this.i.a(ajzl);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i2) {
        super(akdg.a(context, attributeSet, i2, 2132019032), attributeSet, i2);
        float f;
        Drawable drawable;
        this.k = false;
        this.j = true;
        TypedArray a = ajya.a(getContext(), attributeSet, ajuc.b, i2, 2132019032, new int[0]);
        ajub ajub = new ajub(this, attributeSet, i2);
        this.i = ajub;
        ajub.d.c(((agn) this.f.a).e);
        ajub ajub2 = this.i;
        ajub2.c.set(this.c.left, this.c.top, this.c.right, this.c.bottom);
        float f2 = 0.0f;
        if ((!ajub2.b.b || ajub2.b()) && !ajub2.c()) {
            f = 0.0f;
        } else {
            f = ajub2.d();
        }
        if (ajub2.b.b) {
            int i3 = Build.VERSION.SDK_INT;
            if (ajub2.b.a) {
                double d = 1.0d - ajub.a;
                double b = (double) agm.b(ajub2.b.f);
                Double.isNaN(b);
                f2 = (float) (d * b);
            }
        }
        int i4 = (int) (f - f2);
        MaterialCardView materialCardView = ajub2.b;
        materialCardView.c.set(ajub2.c.left + i4, ajub2.c.top + i4, ajub2.c.right + i4, ajub2.c.bottom + i4);
        agm.c(materialCardView.f);
        ajub ajub3 = this.i;
        ajub3.m = ajym.a(ajub3.b.getContext(), a, 8);
        if (ajub3.m == null) {
            ajub3.m = ColorStateList.valueOf(-1);
        }
        ajub3.h = a.getDimensionPixelSize(9, 0);
        boolean z = a.getBoolean(0, false);
        ajub3.r = z;
        ajub3.b.setLongClickable(z);
        ajub3.l = ajym.a(ajub3.b.getContext(), a, 3);
        Drawable b2 = ajym.b(ajub3.b.getContext(), a, 2);
        ajub3.j = b2;
        if (b2 != null) {
            ajub3.j = ma.f(b2.mutate());
            ma.a(ajub3.j, ajub3.l);
        }
        if (ajub3.o != null) {
            ajub3.o.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, ajub3.f());
        }
        ajub3.k = ajym.a(ajub3.b.getContext(), a, 4);
        if (ajub3.k == null) {
            ajub3.k = ColorStateList.valueOf(ajyl.a((View) ajub3.b, (int) R.attr.colorControlHighlight));
        }
        ColorStateList a2 = ajym.a(ajub3.b.getContext(), a, 1);
        ajub3.e.c(a2 == null ? ColorStateList.valueOf(0) : a2);
        if (!ajyu.a || (drawable = ajub3.n) == null) {
            ajzf ajzf = ajub3.p;
            if (ajzf != null) {
                ajzf.c(ajub3.k);
            }
        } else {
            ((RippleDrawable) drawable).setColor(ajub3.k);
        }
        ajub3.a();
        ajub3.e.a((float) ajub3.h, ajub3.m);
        super.setBackgroundDrawable(ajub3.a((Drawable) ajub3.d));
        ajub3.i = ajub3.b.isClickable() ? ajub3.e() : ajub3.e;
        ajub3.b.setForeground(ajub3.a(ajub3.i));
        a.recycle();
    }
}
