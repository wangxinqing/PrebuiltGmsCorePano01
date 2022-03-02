package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.gms.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Chip extends yq implements ajui, ajzw {
    public static final Rect a = new Rect();
    private static final int f = 2132019034;
    private static final int[] g = {16842913};
    private static final int[] h = {16842911};
    public ajuj b;
    public View.OnClickListener c;
    public CompoundButton.OnCheckedChangeListener d;
    public boolean e;
    private InsetDrawable i;
    private RippleDrawable j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private final ajuh q;
    private final Rect r;
    private final RectF s;
    private final ajyr t;

    public Chip(Context context) {
        this(context, (AttributeSet) null);
    }

    private final void a(boolean z) {
        if (this.l != z) {
            this.l = z;
            refreshDrawableState();
        }
    }

    private final void b(boolean z) {
        if (this.m != z) {
            this.m = z;
            refreshDrawableState();
        }
    }

    private final void h() {
        ajuj ajuj;
        if (!TextUtils.isEmpty(getText()) && (ajuj = this.b) != null) {
            int e2 = (int) (ajuj.m + ajuj.j + ajuj.e());
            ajuj ajuj2 = this.b;
            int d2 = (int) (ajuj2.h + ajuj2.i + ajuj2.d());
            if (this.i != null) {
                Rect rect = new Rect();
                this.i.getPadding(rect);
                d2 += rect.left;
                e2 += rect.right;
            }
            qb.a(this, d2, getPaddingTop(), e2, getPaddingBottom());
        }
    }

    private final void i() {
        if (!ajyu.a) {
            this.b.a(true);
            qb.a((View) this, a());
            h();
            if (a() == this.i && this.b.getCallback() == null) {
                this.b.setCallback(this.i);
                return;
            }
            return;
        }
        this.j = new RippleDrawable(ajyu.b(this.b.b), a(), (Drawable) null);
        this.b.a(false);
        qb.a((View) this, (Drawable) this.j);
        h();
    }

    private final void j() {
        ajyq ajyq;
        TextPaint paint = getPaint();
        ajuj ajuj = this.b;
        if (ajuj != null) {
            paint.drawableState = ajuj.getState();
        }
        ajuj ajuj2 = this.b;
        if (ajuj2 != null) {
            ajyq = ajuj2.o.d;
        } else {
            ajyq = null;
        }
        if (ajyq != null) {
            ajyq.a(getContext(), paint, this.t);
        }
    }

    private final void k() {
        if (this.i != null) {
            this.i = null;
            setMinWidth(0);
            ajuj ajuj = this.b;
            setMinHeight((int) (ajuj != null ? ajuj.a : 0.0f));
            i();
        }
    }

    public final Drawable a() {
        InsetDrawable insetDrawable = this.i;
        return insetDrawable == null ? this.b : insetDrawable;
    }

    public final boolean c() {
        ajuj ajuj = this.b;
        return (ajuj == null || ajuj.g() == null) ? false : true;
    }

    public final RectF d() {
        this.s.setEmpty();
        if (c()) {
            ajuj ajuj = this.b;
            RectF rectF = this.s;
            Rect bounds = ajuj.getBounds();
            rectF.setEmpty();
            if (ajuj.b()) {
                float f2 = ajuj.m + ajuj.l + ajuj.f + ajuj.k + ajuj.j;
                if (ma.h(ajuj) == 0) {
                    rectF.right = (float) bounds.right;
                    rectF.left = rectF.right - f2;
                } else {
                    rectF.left = (float) bounds.left;
                    rectF.right = ((float) bounds.left) + f2;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return this.s;
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return a(motionEvent) || this.q.a(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
        if (r7 != false) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            ajuh r0 = r9.q
            int r1 = r10.getAction()
            r2 = 1
            if (r1 == r2) goto L_0x0083
            int r1 = r10.getKeyCode()
            r3 = 61
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 0
            if (r1 == r3) goto L_0x0062
            r3 = 66
            if (r1 == r3) goto L_0x004c
            switch(r1) {
                case 19: goto L_0x001d;
                case 20: goto L_0x001d;
                case 21: goto L_0x001d;
                case 22: goto L_0x001d;
                case 23: goto L_0x004c;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x0083
        L_0x001d:
            boolean r6 = r10.hasNoModifiers()
            if (r6 == 0) goto L_0x0083
            r6 = 19
            if (r1 == r6) goto L_0x0036
            r6 = 21
            if (r1 == r6) goto L_0x0033
            r6 = 22
            if (r1 == r6) goto L_0x0032
            r3 = 130(0x82, float:1.82E-43)
            goto L_0x0038
        L_0x0032:
            goto L_0x0038
        L_0x0033:
            r3 = 17
            goto L_0x0038
        L_0x0036:
            r3 = 33
        L_0x0038:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r2
            r6 = 0
            r7 = 0
        L_0x003f:
            if (r6 >= r1) goto L_0x004b
            boolean r8 = r0.a((int) r3, (android.graphics.Rect) r5)
            if (r8 == 0) goto L_0x004b
            int r6 = r6 + 1
            r7 = 1
            goto L_0x003f
        L_0x004b:
            goto L_0x0079
        L_0x004c:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L_0x0083
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L_0x0083
            int r1 = r0.e
            if (r1 == r4) goto L_0x007b
            r3 = 16
            r0.a((int) r1, (int) r3)
            goto L_0x007b
        L_0x0062:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L_0x006e
            r1 = 2
            boolean r7 = r0.a((int) r1, (android.graphics.Rect) r5)
            goto L_0x0079
        L_0x006e:
            boolean r1 = r10.hasModifiers(r2)
            if (r1 == 0) goto L_0x0083
            boolean r7 = r0.a((int) r2, (android.graphics.Rect) r5)
        L_0x0079:
            if (r7 == 0) goto L_0x0083
        L_0x007b:
            ajuh r0 = r9.q
            int r0 = r0.e
            if (r0 != r4) goto L_0x0082
            goto L_0x001b
        L_0x0082:
            return r2
        L_0x0083:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ajuj ajuj = this.b;
        if (ajuj != null && ajuj.a(ajuj.e)) {
            ajuj ajuj2 = this.b;
            int isEnabled = isEnabled();
            if (this.e) {
                isEnabled++;
            }
            if (this.m) {
                isEnabled++;
            }
            if (this.l) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            int i2 = 0;
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            }
            if (this.e) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.m) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.l) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            if (ajuj2.a(iArr)) {
                invalidate();
            }
        }
    }

    public final Rect e() {
        RectF d2 = d();
        this.r.set((int) d2.left, (int) d2.top, (int) d2.right, (int) d2.bottom);
        return this.r;
    }

    public final boolean f() {
        ajuj ajuj = this.b;
        return ajuj != null && ajuj.g;
    }

    public final void g() {
        playSoundEffect(0);
        this.q.b(1, 1);
    }

    public final TextUtils.TruncateAt getEllipsize() {
        ajuj ajuj = this.b;
        if (ajuj != null) {
            return ajuj.p;
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        ajuh ajuh = this.q;
        if (ajuh.e == 1 || ajuh.d == 1) {
            rect.set(e());
        } else {
            super.getFocusedRect(rect);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ajzg.a((View) this, (ajzf) this.b);
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, g);
        }
        if (f()) {
            mergeDrawableStates(onCreateDrawableState, h);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        ajuh ajuh = this.q;
        int i3 = ajuh.e;
        if (i3 != Integer.MIN_VALUE) {
            ajuh.d(i3);
        }
        if (z) {
            ajuh.a(i2, rect);
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            b(d().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            b(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r6) {
        /*
            r5 = this;
            super.onInitializeAccessibilityNodeInfo(r6)
            boolean r0 = r5.f()
            if (r0 != 0) goto L_0x0017
            boolean r0 = r5.isClickable()
            if (r0 == 0) goto L_0x0010
            goto L_0x0017
        L_0x0010:
            java.lang.String r0 = "android.view.View"
            r6.setClassName(r0)
            goto L_0x0025
        L_0x0017:
            boolean r0 = r5.f()
            if (r0 != 0) goto L_0x0020
            java.lang.String r0 = "android.widget.Button"
            goto L_0x0022
        L_0x0020:
            java.lang.String r0 = "android.widget.CompoundButton"
        L_0x0022:
            r6.setClassName(r0)
        L_0x0025:
            boolean r0 = r5.f()
            r6.setCheckable(r0)
            boolean r0 = r5.isClickable()
            r6.setClickable(r0)
            android.view.ViewParent r0 = r5.getParent()
            boolean r0 = r0 instanceof com.google.android.material.chip.ChipGroup
            if (r0 == 0) goto L_0x008a
            android.view.ViewParent r0 = r5.getParent()
            com.google.android.material.chip.ChipGroup r0 = (com.google.android.material.chip.ChipGroup) r0
            qs r6 = defpackage.qs.a((android.view.accessibility.AccessibilityNodeInfo) r6)
            boolean r1 = r0.h
            r2 = -1
            if (r1 == 0) goto L_0x0069
            r1 = 0
            r3 = 0
        L_0x004c:
            int r4 = r0.getChildCount()
            if (r1 >= r4) goto L_0x0069
            android.view.View r4 = r0.getChildAt(r1)
            boolean r4 = r4 instanceof com.google.android.material.chip.Chip
            if (r4 != 0) goto L_0x005b
            goto L_0x0066
        L_0x005b:
            android.view.View r4 = r0.getChildAt(r1)
            com.google.android.material.chip.Chip r4 = (com.google.android.material.chip.Chip) r4
            if (r4 != r5) goto L_0x0064
            goto L_0x006a
        L_0x0064:
            int r3 = r3 + 1
        L_0x0066:
            int r1 = r1 + 1
            goto L_0x004c
        L_0x0069:
            r3 = -1
        L_0x006a:
            r0 = 2131429353(0x7f0b07e9, float:1.8480376E38)
            java.lang.Object r0 = r5.getTag(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x007c
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r2 = r0.intValue()
            goto L_0x007d
        L_0x007c:
        L_0x007d:
            boolean r0 = r5.isChecked()
            r1 = 1
            qr r0 = defpackage.qr.a(r2, r1, r3, r1, r0)
            r6.b((java.lang.Object) r0)
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (!d().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.o != i2) {
            this.o = i2;
            h();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r0 == false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.d()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x003e
            if (r0 == r3) goto L_0x002d
            r4 = 2
            if (r0 == r4) goto L_0x0023
            r1 = 3
            if (r0 == r1) goto L_0x0021
            goto L_0x0044
        L_0x0021:
            r0 = 0
            goto L_0x0037
        L_0x0023:
            boolean r0 = r5.l
            if (r0 == 0) goto L_0x0044
            if (r1 != 0) goto L_0x004b
            r5.a((boolean) r2)
            return r3
        L_0x002d:
            boolean r0 = r5.l
            if (r0 == 0) goto L_0x0036
            r5.g()
            r0 = 1
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            r5.a((boolean) r2)
            if (r0 != 0) goto L_0x004b
            goto L_0x0044
        L_0x003e:
            if (r1 == 0) goto L_0x0044
            r5.a((boolean) r3)
            goto L_0x004b
        L_0x0044:
            boolean r6 = super.onTouchEvent(r6)
            if (r6 != 0) goto L_0x004b
            return r2
        L_0x004b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setBackground(Drawable drawable) {
        if (drawable == a() || drawable == this.j) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public final void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable == a() || drawable == this.j) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public final void setBackgroundResource(int i2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public final void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        ajuj ajuj = this.b;
        if (ajuj == null) {
            this.k = z;
        } else if (ajuj.g) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.d) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables((Drawable) null, drawable2, (Drawable) null, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative((Drawable) null, drawable2, (Drawable) null, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(0, i3, 0, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(0, i3, 0, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setElevation(float f2) {
        super.setElevation(f2);
        ajuj ajuj = this.b;
        if (ajuj != null) {
            ajuj.d(f2);
        }
    }

    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.b == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            ajuj ajuj = this.b;
            if (ajuj != null) {
                ajuj.p = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public final void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(8388627);
        }
    }

    public final void setLayoutDirection(int i2) {
        if (this.b != null) {
            int i3 = Build.VERSION.SDK_INT;
            super.setLayoutDirection(i2);
        }
    }

    public final void setLines(int i2) {
        if (i2 <= 1) {
            super.setLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setMaxLines(int i2) {
        if (i2 <= 1) {
            super.setMaxLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        ajuj ajuj = this.b;
        if (ajuj != null) {
            ajuj.r = i2;
        }
    }

    public final void setMinLines(int i2) {
        if (i2 <= 1) {
            super.setMinLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(true);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        ajuj ajuj = this.b;
        if (ajuj != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (!ajuj.q) {
                charSequence2 = charSequence;
            } else {
                charSequence2 = null;
            }
            super.setText(charSequence2, bufferType);
            ajuj ajuj2 = this.b;
            if (ajuj2 != null) {
                ajuj2.a(charSequence);
            }
        }
    }

    public final void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        ajuj ajuj = this.b;
        if (ajuj != null) {
            ajuj.a(i2);
        }
        j();
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipStyle);
    }

    private final boolean a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = rq.class.getDeclaredField("l");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.q)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = rq.class.getDeclaredMethod("e", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.q, new Object[]{Integer.MIN_VALUE});
                    return true;
                }
            } catch (NoSuchMethodException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            } catch (IllegalAccessException e3) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e3);
            } catch (InvocationTargetException e4) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e4);
            } catch (NoSuchFieldException e5) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e5);
            }
        }
        return false;
    }

    public final void b() {
        a(this.p);
        requestLayout();
        int i2 = Build.VERSION.SDK_INT;
        invalidateOutline();
    }

    public Chip(Context context, AttributeSet attributeSet, int i2) {
        super(akdg.a(context, attributeSet, i2, f), attributeSet, i2);
        this.r = new Rect();
        this.s = new RectF();
        this.t = new ajuf(this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        ajuj a2 = ajuj.a(context2, attributeSet, i2, f);
        TypedArray a3 = ajya.a(context2, attributeSet, ajun.a, i2, f, new int[0]);
        this.n = a3.getBoolean(31, false);
        this.p = (int) Math.ceil((double) a3.getDimension(19, (float) Math.ceil((double) ajyf.a(getContext(), 48))));
        a3.recycle();
        ajuj ajuj = this.b;
        if (ajuj != a2) {
            if (ajuj != null) {
                ajuj.a((ajui) null);
            }
            this.b = a2;
            a2.q = false;
            a2.a((ajui) this);
            a(this.p);
        }
        a2.d(qb.o(this));
        TypedArray a4 = ajya.a(context2, attributeSet, ajun.a, i2, f, new int[0]);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(ajym.a(context2, a4, 1));
        }
        boolean hasValue = a4.hasValue(36);
        a4.recycle();
        this.q = new ajuh(this, this);
        c();
        qb.a((View) this, (oz) null);
        if (!hasValue) {
            int i3 = Build.VERSION.SDK_INT;
            setOutlineProvider(new ajug(this));
        }
        setChecked(this.k);
        setText(a2.c);
        setEllipsize(a2.p);
        setIncludeFontPadding(false);
        j();
        if (!this.b.q) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        h();
        if (this.n) {
            setMinHeight(this.p);
        }
        this.o = qb.h(this);
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        ajuj ajuj = this.b;
        if (ajuj != null) {
            ajuj.a(i2);
        }
        j();
    }

    public final void a(int i2) {
        int i3;
        int i4;
        this.p = i2;
        if (this.n) {
            int max = Math.max(0, i2 - this.b.getIntrinsicHeight());
            int max2 = Math.max(0, i2 - this.b.getIntrinsicWidth());
            if (max2 > 0 || max > 0) {
                if (max2 > 0) {
                    i3 = max2 >> 1;
                } else {
                    i3 = 0;
                }
                if (max > 0) {
                    i4 = max >> 1;
                } else {
                    i4 = 0;
                }
                if (this.i != null) {
                    Rect rect = new Rect();
                    this.i.getPadding(rect);
                    if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                        i();
                        return;
                    }
                }
                int i5 = Build.VERSION.SDK_INT;
                if (getMinHeight() != i2) {
                    setMinHeight(i2);
                }
                if (getMinWidth() != i2) {
                    setMinWidth(i2);
                }
                this.i = new InsetDrawable(this.b, i3, i4, i3, i4);
                i();
            } else if (this.i != null) {
                k();
            } else {
                i();
            }
        } else if (this.i != null) {
            k();
        } else {
            i();
        }
    }

    public final void a(ajzl ajzl) {
        this.b.a(ajzl);
    }

    public final void a(Drawable drawable) {
        ajuj ajuj = this.b;
        if (ajuj != null) {
            ajuj.b(drawable);
        }
    }
}
