package android.support.v7.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SwitchCompat extends CompoundButton {
    private static final int[] O = {16842912};
    private static final Property e = new aep(Float.class, "thumbPos");
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private final TextPaint H;
    private ColorStateList I;
    private Layout J;
    private Layout K;
    private TransformationMethod L;
    private final zr M;
    private final Rect N;
    public CharSequence a;
    public CharSequence b;
    public float c;
    ObjectAnimator d;
    private Drawable f;
    private ColorStateList g;
    private PorterDuff.Mode h;
    private boolean i;
    private boolean j;
    private Drawable k;
    private ColorStateList l;
    private PorterDuff.Mode m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private float w;
    private float x;
    private VelocityTracker y;
    private int z;

    public SwitchCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    private final Layout a(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.L;
        CharSequence transformation = transformationMethod == null ? charSequence : transformationMethod.getTransformation(charSequence, this);
        TextPaint textPaint = this.H;
        return new StaticLayout(transformation, textPaint, transformation != null ? (int) Math.ceil((double) Layout.getDesiredWidth(transformation, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private final boolean a() {
        return this.c > 0.5f;
    }

    private final int b() {
        float f2;
        if (afs.a(this)) {
            f2 = 1.0f - this.c;
        } else {
            f2 = this.c;
        }
        return (int) ((f2 * ((float) c())) + 0.5f);
    }

    private final int c() {
        Rect rect;
        Drawable drawable = this.k;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.N;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            rect = aak.a(drawable2);
        } else {
            rect = aak.a;
        }
        return ((((this.A - this.C) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    public final void draw(Canvas canvas) {
        Rect rect;
        int i2;
        int i3;
        Rect rect2 = this.N;
        int i4 = this.D;
        int i5 = this.E;
        int i6 = this.F;
        int i7 = this.G;
        int b2 = b() + i4;
        Drawable drawable = this.f;
        if (drawable != null) {
            rect = aak.a(drawable);
        } else {
            rect = aak.a;
        }
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            b2 += rect2.left;
            if (rect == null) {
                i2 = i5;
                i3 = i7;
            } else {
                if (rect.left > rect2.left) {
                    i4 += rect.left - rect2.left;
                }
                if (rect.top > rect2.top) {
                    i2 = (rect.top - rect2.top) + i5;
                } else {
                    i2 = i5;
                }
                if (rect.right > rect2.right) {
                    i6 -= rect.right - rect2.right;
                }
                i3 = rect.bottom > rect2.bottom ? i7 - (rect.bottom - rect2.bottom) : i7;
            }
            this.k.setBounds(i4, i2, i6, i3);
        }
        Drawable drawable3 = this.f;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i8 = b2 - rect2.left;
            int i9 = b2 + this.C + rect2.right;
            this.f.setBounds(i8, i5, i9, i7);
            Drawable background = getBackground();
            if (background != null) {
                ma.a(background, i8, i5, i9, i7);
            }
        }
        super.draw(canvas);
    }

    public final void drawableHotspotChanged(float f2, float f3) {
        int i2 = Build.VERSION.SDK_INT;
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f;
        if (drawable != null) {
            ma.a(drawable, f2, f3);
        }
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            ma.a(drawable2, f2, f3);
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f;
        boolean z2 = false;
        if (drawable != null && drawable.isStateful()) {
            z2 = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.k;
        if (drawable2 != null && drawable2.isStateful()) {
            z2 |= drawable2.setState(drawableState);
        }
        if (z2) {
            invalidate();
        }
    }

    public final int getCompoundPaddingLeft() {
        if (!afs.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.r : compoundPaddingLeft;
    }

    public final int getCompoundPaddingRight() {
        if (afs.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.r : compoundPaddingRight;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.d.end();
            this.d = null;
        }
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, O);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        Layout layout;
        int i2;
        super.onDraw(canvas);
        Rect rect = this.N;
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i3 = this.E;
        int i4 = this.G;
        int i5 = i3 + rect.top;
        int i6 = i4 - rect.bottom;
        Drawable drawable2 = this.f;
        if (drawable != null) {
            if (this.s && drawable2 != null) {
                Rect a2 = aak.a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += a2.left;
                rect.right -= a2.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (!a()) {
            layout = this.K;
        } else {
            layout = this.J;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.I;
            if (colorStateList != null) {
                this.H.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.H.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i2 = bounds.left + bounds.right;
            } else {
                i2 = getWidth();
            }
            canvas.translate((float) ((i2 / 2) - (layout.getWidth() / 2)), (float) (((i5 + i6) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (!isChecked()) {
            charSequence = this.b;
        } else {
            charSequence = this.a;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z2, i2, i3, i4, i5);
        int i11 = 0;
        if (this.f != null) {
            Rect rect = this.N;
            Drawable drawable = this.k;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect a2 = aak.a(this.f);
            i6 = Math.max(0, a2.left - rect.left);
            i11 = Math.max(0, a2.right - rect.right);
        } else {
            i6 = 0;
        }
        if (afs.a(this)) {
            i8 = getPaddingLeft() + i6;
            i7 = ((this.A + i8) - i6) - i11;
        } else {
            i7 = (getWidth() - getPaddingRight()) - i11;
            i8 = (i7 - this.A) + i6 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int height = getHeight();
            int paddingBottom = getPaddingBottom();
            int i12 = this.B;
            i10 = (((paddingTop + height) - paddingBottom) / 2) - (i12 / 2);
            i9 = i10 + i12;
        } else if (gravity != 80) {
            i10 = getPaddingTop();
            i9 = this.B + i10;
        } else {
            i9 = getHeight() - getPaddingBottom();
            i10 = i9 - this.B;
        }
        this.D = i8;
        this.E = i10;
        this.G = i9;
        this.F = i7;
    }

    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (this.t) {
            if (this.J == null) {
                this.J = a(this.a);
            }
            if (this.K == null) {
                this.K = a(this.b);
            }
        }
        Rect rect = this.N;
        Drawable drawable = this.f;
        int i7 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i5 = (this.f.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.f.getIntrinsicHeight();
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (this.t) {
            int max = Math.max(this.J.getWidth(), this.K.getWidth());
            int i8 = this.p;
            i6 = max + i8 + i8;
        } else {
            i6 = 0;
        }
        this.C = Math.max(i6, i5);
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.k.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i9 = rect.left;
        int i10 = rect.right;
        Drawable drawable3 = this.f;
        if (drawable3 != null) {
            Rect a2 = aak.a(drawable3);
            i9 = Math.max(i9, a2.left);
            i10 = Math.max(i10, a2.right);
        }
        int i11 = this.q;
        int i12 = this.C;
        int max2 = Math.max(i11, i12 + i12 + i9 + i10);
        int max3 = Math.max(i7, i4);
        this.A = max2;
        this.B = max3;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < max3) {
            setMeasuredDimension(getMeasuredWidthAndState(), max3);
        }
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (!isChecked()) {
            charSequence = this.b;
        } else {
            charSequence = this.a;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r0 != 3) goto L_0x0157;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            android.view.VelocityTracker r0 = r9.y
            r0.addMovement(r10)
            int r0 = r10.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x0104
            r2 = 3
            r3 = 2
            r4 = 0
            if (r0 == r1) goto L_0x0092
            if (r0 == r3) goto L_0x0017
            if (r0 == r2) goto L_0x0092
            goto L_0x0157
        L_0x0017:
            int r0 = r9.u
            if (r0 == r1) goto L_0x005e
            if (r0 == r3) goto L_0x001f
            goto L_0x0157
        L_0x001f:
            float r10 = r10.getX()
            int r0 = r9.c()
            float r2 = r9.w
            float r2 = r10 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0032
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003b
        L_0x0032:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0039
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003b
        L_0x0039:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003b:
            boolean r0 = defpackage.afs.a(r9)
            if (r0 != 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            float r2 = -r2
        L_0x0043:
            float r0 = r9.c
            float r2 = r2 + r0
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 < 0) goto L_0x0053
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 > 0) goto L_0x0050
            r4 = r2
            goto L_0x0054
        L_0x0050:
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0054
        L_0x0053:
        L_0x0054:
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x005d
            r9.w = r10
            r9.a((float) r4)
        L_0x005d:
            return r1
        L_0x005e:
            float r0 = r10.getX()
            float r2 = r10.getY()
            float r4 = r9.w
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r9.v
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x0084
            float r4 = r9.x
            float r4 = r2 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r9.v
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0157
        L_0x0084:
            r9.u = r3
            android.view.ViewParent r10 = r9.getParent()
            r10.requestDisallowInterceptTouchEvent(r1)
            r9.w = r0
            r9.x = r2
            return r1
        L_0x0092:
            int r0 = r9.u
            r5 = 0
            if (r0 == r3) goto L_0x00a0
            r9.u = r5
            android.view.VelocityTracker r0 = r9.y
            r0.clear()
            goto L_0x0157
        L_0x00a0:
            r9.u = r5
            int r0 = r10.getAction()
            if (r0 != r1) goto L_0x00b0
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x00b0
            r0 = 1
            goto L_0x00b1
        L_0x00b0:
            r0 = 0
        L_0x00b1:
            boolean r3 = r9.isChecked()
            if (r0 == 0) goto L_0x00e8
            android.view.VelocityTracker r0 = r9.y
            r6 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r6)
            android.view.VelocityTracker r0 = r9.y
            float r0 = r0.getXVelocity()
            float r6 = java.lang.Math.abs(r0)
            int r7 = r9.z
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x00e3
            boolean r6 = defpackage.afs.a(r9)
            if (r6 != 0) goto L_0x00db
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e1
            r0 = 1
            goto L_0x00e9
        L_0x00db:
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e1
            r0 = 1
            goto L_0x00e9
        L_0x00e1:
            r0 = 0
            goto L_0x00e9
        L_0x00e3:
            boolean r0 = r9.a()
            goto L_0x00e9
        L_0x00e8:
            r0 = r3
        L_0x00e9:
            if (r0 != r3) goto L_0x00ec
            goto L_0x00f0
        L_0x00ec:
            r9.playSoundEffect(r5)
        L_0x00f0:
            r9.setChecked(r0)
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r10)
            r0.setAction(r2)
            super.onTouchEvent(r0)
            r0.recycle()
            super.onTouchEvent(r10)
            return r1
        L_0x0104:
            float r0 = r10.getX()
            float r2 = r10.getY()
            boolean r3 = r9.isEnabled()
            if (r3 == 0) goto L_0x0157
            android.graphics.drawable.Drawable r3 = r9.f
            if (r3 == 0) goto L_0x0157
            int r3 = r9.b()
            android.graphics.drawable.Drawable r4 = r9.f
            android.graphics.Rect r5 = r9.N
            r4.getPadding(r5)
            int r4 = r9.E
            int r5 = r9.v
            int r4 = r4 - r5
            int r6 = r9.D
            int r6 = r6 + r3
            int r6 = r6 - r5
            int r3 = r9.C
            android.graphics.Rect r5 = r9.N
            int r5 = r5.left
            android.graphics.Rect r7 = r9.N
            int r7 = r7.right
            int r8 = r9.v
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r3 = r3 + r7
            int r3 = r3 + r8
            int r5 = r9.G
            int r5 = r5 + r8
            float r6 = (float) r6
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0157
            float r3 = (float) r3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0157
            float r3 = (float) r4
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0157
            float r3 = (float) r5
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0157
            r9.u = r1
            r9.w = r0
            r9.x = r2
        L_0x0157:
            boolean r10 = super.onTouchEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setChecked(boolean z2) {
        super.setChecked(z2);
        boolean isChecked = isChecked();
        float f2 = 0.0f;
        if (getWindowToken() != null && qb.A(this)) {
            if (isChecked) {
                f2 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, e, new float[]{f2});
            this.d = ofFloat;
            ofFloat.setDuration(250);
            int i2 = Build.VERSION.SDK_INT;
            this.d.setAutoCancel(true);
            this.d.start();
            return;
        }
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (isChecked) {
            f2 = 1.0f;
        }
        a(f2);
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ry.a((TextView) this, callback));
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f || drawable == this.k;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Typeface typeface;
        Typeface typeface2;
        int i3;
        Drawable drawable;
        Drawable drawable2;
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.l = null;
        this.m = null;
        this.n = false;
        this.o = false;
        this.y = VelocityTracker.obtain();
        this.N = new Rect();
        aeq.a((View) this, getContext());
        boolean z2 = true;
        this.H = new TextPaint(1);
        this.H.density = getResources().getDisplayMetrics().density;
        aev a2 = aev.a(context, attributeSet, uh.x, i2, 0);
        qb.a(this, context, uh.x, attributeSet, a2.b, i2, 0);
        Drawable a3 = a2.a(2);
        this.f = a3;
        if (a3 != null) {
            a3.setCallback(this);
        }
        Drawable a4 = a2.a(11);
        this.k = a4;
        if (a4 != null) {
            a4.setCallback(this);
        }
        this.a = a2.c(0);
        this.b = a2.c(1);
        this.t = a2.a(3, true);
        this.p = a2.d(8, 0);
        this.q = a2.d(5, 0);
        this.r = a2.d(6, 0);
        this.s = a2.a(4, false);
        ColorStateList e2 = a2.e(9);
        if (e2 != null) {
            this.g = e2;
            this.i = true;
        }
        PorterDuff.Mode a5 = aak.a(a2.a(10, -1), (PorterDuff.Mode) null);
        if (this.h != a5) {
            this.h = a5;
            this.j = true;
        }
        boolean z3 = this.i;
        if ((z3 || this.j) && (drawable2 = this.f) != null && (z3 || this.j)) {
            Drawable mutate = ma.f(drawable2).mutate();
            this.f = mutate;
            if (this.i) {
                ma.a(mutate, this.g);
            }
            if (this.j) {
                ma.a(this.f, this.h);
            }
            if (this.f.isStateful()) {
                this.f.setState(getDrawableState());
            }
        }
        ColorStateList e3 = a2.e(12);
        if (e3 != null) {
            this.l = e3;
            this.n = true;
        }
        PorterDuff.Mode a6 = aak.a(a2.a(13, -1), (PorterDuff.Mode) null);
        if (this.m != a6) {
            this.m = a6;
            this.o = true;
        }
        boolean z4 = this.n;
        if ((z4 || this.o) && (drawable = this.k) != null && (z4 || this.o)) {
            Drawable mutate2 = ma.f(drawable).mutate();
            this.k = mutate2;
            if (this.n) {
                ma.a(mutate2, this.l);
            }
            if (this.o) {
                ma.a(this.k, this.m);
            }
            if (this.k.isStateful()) {
                this.k.setState(getDrawableState());
            }
        }
        int f2 = a2.f(7, 0);
        if (f2 != 0) {
            aev a7 = aev.a(context, f2, uh.y);
            ColorStateList e4 = a7.e(3);
            if (e4 == null) {
                this.I = getTextColors();
            } else {
                this.I = e4;
            }
            int d2 = a7.d(0, 0);
            if (d2 != 0) {
                float f3 = (float) d2;
                if (f3 != this.H.getTextSize()) {
                    this.H.setTextSize(f3);
                    requestLayout();
                }
            }
            int a8 = a7.a(1, -1);
            int a9 = a7.a(2, -1);
            if (a8 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (a8 == 2) {
                typeface = Typeface.SERIF;
            } else if (a8 != 3) {
                typeface = null;
            } else {
                typeface = Typeface.MONOSPACE;
            }
            float f4 = 0.0f;
            if (a9 <= 0) {
                this.H.setFakeBoldText(false);
                this.H.setTextSkewX(0.0f);
                a(typeface);
            } else {
                if (typeface != null) {
                    typeface2 = Typeface.create(typeface, a9);
                } else {
                    typeface2 = Typeface.defaultFromStyle(a9);
                }
                a(typeface2);
                if (typeface2 != null) {
                    i3 = typeface2.getStyle();
                } else {
                    i3 = 0;
                }
                int i4 = (i3 ^ -1) & a9;
                this.H.setFakeBoldText((i4 & 1) == 0 ? false : z2);
                this.H.setTextSkewX((2 & i4) != 0 ? -0.25f : f4);
            }
            if (a7.a(14, false)) {
                this.L = new vd(getContext());
            } else {
                this.L = null;
            }
            a7.a();
        }
        zr zrVar = new zr(this);
        this.M = zrVar;
        zrVar.a(attributeSet, i2);
        a2.a();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.v = viewConfiguration.getScaledTouchSlop();
        this.z = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    public final void a(float f2) {
        this.c = f2;
        invalidate();
    }

    public final void a(Typeface typeface) {
        if ((this.H.getTypeface() != null && !this.H.getTypeface().equals(typeface)) || (this.H.getTypeface() == null && typeface != null)) {
            this.H.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }
}
