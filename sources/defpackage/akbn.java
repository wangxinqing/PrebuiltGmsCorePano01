package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.material.tabs.TabLayout;

/* renamed from: akbn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akbn extends LinearLayout {
    public TextView a;
    public ImageView b;
    public final Drawable c;
    final /* synthetic */ TabLayout d;
    private akbk e;
    private int f = 2;

    /* JADX WARNING: type inference failed for: r3v1, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public akbn(com.google.android.material.tabs.TabLayout r6, android.content.Context r7) {
        /*
            r5 = this;
            r5.d = r6
            r5.<init>(r7)
            r0 = 2
            r5.f = r0
            com.google.android.material.tabs.TabLayout r0 = r5.d
            int r0 = r0.q
            r1 = 0
            if (r0 == 0) goto L_0x0027
            android.graphics.drawable.Drawable r7 = defpackage.uj.b(r7, r0)
            r5.c = r7
            if (r7 == 0) goto L_0x0029
            boolean r7 = r7.isStateful()
            if (r7 == 0) goto L_0x0029
            android.graphics.drawable.Drawable r7 = r5.c
            int[] r0 = r5.getDrawableState()
            r7.setState(r0)
            goto L_0x0029
        L_0x0027:
            r5.c = r1
        L_0x0029:
            android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
            r7.<init>()
            r0 = 0
            r7.setColor(r0)
            com.google.android.material.tabs.TabLayout r0 = r5.d
            android.content.res.ColorStateList r0 = r0.l
            if (r0 == 0) goto L_0x0064
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r2 = 925353388(0x3727c5ac, float:1.0E-5)
            r0.setCornerRadius(r2)
            r2 = -1
            r0.setColor(r2)
            com.google.android.material.tabs.TabLayout r2 = r5.d
            android.content.res.ColorStateList r2 = r2.l
            android.content.res.ColorStateList r2 = defpackage.ajyu.a((android.content.res.ColorStateList) r2)
            int r3 = android.os.Build.VERSION.SDK_INT
            android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
            com.google.android.material.tabs.TabLayout r4 = r5.d
            boolean r4 = r4.y
            if (r4 != 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r7 = r1
        L_0x005b:
            if (r4 != 0) goto L_0x005f
            r1 = r0
            goto L_0x0060
        L_0x005f:
        L_0x0060:
            r3.<init>(r2, r7, r1)
            r7 = r3
        L_0x0064:
            defpackage.qb.a((android.view.View) r5, (android.graphics.drawable.Drawable) r7)
            com.google.android.material.tabs.TabLayout r7 = r5.d
            r7.invalidate()
            int r7 = r6.e
            int r0 = r6.f
            int r1 = r6.g
            int r2 = r6.h
            defpackage.qb.a(r5, r7, r0, r1, r2)
            r7 = 17
            r5.setGravity(r7)
            boolean r6 = r6.w
            r7 = 1
            r6 = r6 ^ r7
            r5.setOrientation(r6)
            r5.setClickable(r7)
            android.content.Context r6 = r5.getContext()
            ps r6 = defpackage.ps.a(r6)
            defpackage.qb.a((android.view.View) r5, (defpackage.ps) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbn.<init>(com.google.android.material.tabs.TabLayout, android.content.Context):void");
    }

    private static final void a(View view) {
        if (view != null) {
            view.addOnLayoutChangeListener(new akbm(view));
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.c;
        if (drawable != null && drawable.isStateful() && this.c.setState(drawableState)) {
            invalidate();
            this.d.invalidate();
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        qs a2 = qs.a(accessibilityNodeInfo);
        a2.b((Object) qr.a(0, 1, this.e.d, 1, isSelected()));
        if (isSelected()) {
            a2.c(false);
            a2.b(qp.a);
        }
        a2.f((CharSequence) "Tab");
    }

    public final void onMeasure(int i, int i2) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.d.r;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.a != null) {
            float f2 = this.d.o;
            int i4 = this.f;
            ImageView imageView = this.b;
            if (imageView != null && imageView.getVisibility() == 0) {
                i4 = 1;
            } else {
                TextView textView = this.a;
                if (textView != null && textView.getLineCount() > 1) {
                    f2 = this.d.p;
                }
            }
            float textSize = this.a.getTextSize();
            int lineCount = this.a.getLineCount();
            int a2 = ry.a(this.a);
            if (f2 != textSize || (a2 >= 0 && i4 != a2)) {
                if (this.d.v != 1 || f2 <= textSize || lineCount != 1 || ((layout = this.a.getLayout()) != null && layout.getLineWidth(0) * (f2 / layout.getPaint().getTextSize()) <= ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                    this.a.setTextSize(0, f2);
                    this.a.setMaxLines(i4);
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.e == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        this.e.a();
        return true;
    }

    public final void setSelected(boolean z) {
        boolean isSelected = isSelected();
        super.setSelected(z);
        if (isSelected != z && z) {
            int i = Build.VERSION.SDK_INT;
        }
        TextView textView = this.a;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setSelected(z);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Drawable drawable;
        Drawable drawable2;
        CharSequence charSequence;
        CharSequence charSequence2;
        int i;
        Drawable drawable3;
        Drawable drawable4;
        akbk akbk = this.e;
        boolean z = false;
        if (this.b == null) {
            int i2 = ajst.a;
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, this, false);
            this.b = imageView;
            addView(imageView, 0);
        }
        CharSequence charSequence3 = null;
        if (akbk == null || (drawable4 = akbk.a) == null) {
            drawable = null;
        } else {
            drawable = ma.f(drawable4).mutate();
        }
        if (drawable != null) {
            ma.a(drawable, this.d.k);
            PorterDuff.Mode mode = this.d.n;
            if (mode != null) {
                ma.a(drawable, mode);
            }
        }
        if (this.a == null) {
            int i3 = ajst.a;
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, this, false);
            this.a = textView;
            addView(textView);
            this.f = ry.a(this.a);
        }
        ry.a(this.a, this.d.i);
        ColorStateList colorStateList = this.d.j;
        if (colorStateList != null) {
            this.a.setTextColor(colorStateList);
        }
        TextView textView2 = this.a;
        ImageView imageView2 = this.b;
        akbk akbk2 = this.e;
        if (akbk2 == null || (drawable3 = akbk2.a) == null) {
            drawable2 = null;
        } else {
            drawable2 = ma.f(drawable3).mutate();
        }
        akbk akbk3 = this.e;
        if (akbk3 != null) {
            charSequence = akbk3.b;
        } else {
            charSequence = null;
        }
        if (imageView2 != null) {
            if (drawable2 != null) {
                imageView2.setImageDrawable(drawable2);
                imageView2.setVisibility(0);
                setVisibility(0);
            } else {
                imageView2.setVisibility(8);
                imageView2.setImageDrawable((Drawable) null);
            }
        }
        boolean z2 = !TextUtils.isEmpty(charSequence);
        if (textView2 != null) {
            if (z2) {
                textView2.setText(charSequence);
                int i4 = this.e.f;
                textView2.setVisibility(0);
                setVisibility(0);
            } else {
                textView2.setVisibility(8);
                textView2.setText((CharSequence) null);
            }
        }
        if (imageView2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
            if (!z2 || imageView2.getVisibility() != 0) {
                i = 0;
            } else {
                i = (int) ajyf.a(getContext(), 8);
            }
            if (this.d.w) {
                if (i != ph.b(marginLayoutParams)) {
                    ph.a(marginLayoutParams, i);
                    marginLayoutParams.bottomMargin = 0;
                    imageView2.setLayoutParams(marginLayoutParams);
                    imageView2.requestLayout();
                }
            } else if (i != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = i;
                ph.a(marginLayoutParams, 0);
                imageView2.setLayoutParams(marginLayoutParams);
                imageView2.requestLayout();
            }
        }
        akbk akbk4 = this.e;
        if (akbk4 != null) {
            charSequence2 = akbk4.c;
        } else {
            charSequence2 = null;
        }
        if (!z2) {
            charSequence3 = charSequence2;
        }
        afg.a(this, charSequence3);
        a((View) this.b);
        a((View) this.a);
        if (akbk != null && !TextUtils.isEmpty(akbk.c)) {
            setContentDescription(akbk.c);
        }
        if (akbk != null) {
            TabLayout tabLayout = akbk.g;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else if (tabLayout.c() == akbk.d) {
                z = true;
            }
        }
        setSelected(z);
    }

    public final void a(akbk akbk) {
        if (akbk != this.e) {
            this.e = akbk;
            a();
        }
    }
}
