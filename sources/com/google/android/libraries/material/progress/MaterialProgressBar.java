package com.google.android.libraries.material.progress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MaterialProgressBar extends ProgressBar {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private aeoq f;
    private Drawable g;

    static {
        MaterialProgressBar.class.getSimpleName();
    }

    private MaterialProgressBar(Context context) {
        super(context, (AttributeSet) null, 16842872);
        super.getProgress();
    }

    private static int a(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        StringBuilder sb = new StringBuilder(59);
        sb.append("Invalid attribute value for mtrlLinearGrowFrom: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    private final void b(TypedArray typedArray, boolean z) {
        int i;
        float f2;
        boolean z2;
        int[] iArr = aeoz.a;
        if (typedArray.hasValue(0)) {
            i = typedArray.getColor(0, -1);
        } else {
            i = getResources().getColor(R.color.quantum_googblue);
        }
        int color = typedArray.getColor(8, -1);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{16842803});
        float f3 = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        int i2 = typedArray.getInt(6, 0);
        if (color != -1) {
            f2 = 1.0f;
        } else {
            f2 = f3;
        }
        if (z) {
            int i3 = this.d;
            if (this.a == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            setIndeterminateDrawable(new aeox(i3, i, color, f2, z2, a(i2)));
            return;
        }
        setProgressDrawable(new aeot(this.d, i, color, f2, a(i2)));
    }

    private final void d() {
        e();
        if (isIndeterminate()) {
            getProgressDrawable().setVisible(false, false);
            getIndeterminateDrawable().setVisible(a(), true);
            return;
        }
        getProgressDrawable().setVisible(a(), true);
        getIndeterminateDrawable().setVisible(false, false);
    }

    private final void e() {
        if (isIndeterminate()) {
            if (this.a != 0) {
                setMinimumHeight(this.d);
            } else {
                setMinimumHeight(0);
            }
        } else if (this.b != 0) {
            setMinimumHeight(this.d);
        } else {
            setMinimumHeight(0);
        }
    }

    private final int f() {
        return !isIndeterminate() ? this.b : this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (android.animation.ValueAnimator.areAnimatorsEnabled() != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (android.provider.Settings.Global.getFloat(r1, "animator_duration_scale", 1.0f) == 0.0f) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void g() {
        /*
            r5 = this;
            int r0 = r5.f()
            if (r0 != 0) goto L_0x00a4
            boolean r0 = r5.isIndeterminate()
            if (r0 == 0) goto L_0x00a4
            android.content.Context r0 = r5.getContext()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            r3 = 0
            if (r1 < r2) goto L_0x001e
            boolean r1 = android.animation.ValueAnimator.areAnimatorsEnabled()
            if (r1 == 0) goto L_0x0075
            goto L_0x0034
        L_0x001e:
            android.content.ContentResolver r1 = r0.getContentResolver()
            int r2 = android.os.Build.VERSION.SDK_INT
            int r2 = android.os.Build.VERSION.SDK_INT
            r2 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r4 = "animator_duration_scale"
            float r1 = android.provider.Settings.Global.getFloat(r1, r4, r2)
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0034
            goto L_0x0075
        L_0x0034:
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.os.PowerManager r0 = (android.os.PowerManager) r0
            boolean r0 = r0.isPowerSaveMode()
            if (r0 != 0) goto L_0x0075
            android.graphics.drawable.Drawable r0 = r5.b()
            aeoq r1 = r5.f
            if (r0 == r1) goto L_0x00a4
            android.graphics.drawable.Drawable r0 = r5.g
            r1 = 0
            r0.setVisible(r1, r1)
            android.graphics.drawable.Drawable r0 = r5.g
            r0.setCallback(r3)
            android.graphics.drawable.Drawable r0 = r5.g
            r5.unscheduleDrawable(r0)
            aeoq r0 = r5.f
            r5.setIndeterminateDrawable(r0)
            int r0 = r5.getWidth()
            int r1 = r5.getHeight()
            int r2 = r5.getWidth()
            int r3 = r5.getHeight()
            r5.onSizeChanged(r0, r1, r2, r3)
            goto L_0x00a4
        L_0x0075:
            android.graphics.drawable.Drawable r0 = r5.b()
            android.graphics.drawable.Drawable r1 = r5.g
            if (r0 == r1) goto L_0x00a4
            aeoq r0 = r5.f
            r0.a()
            aeoq r0 = r5.f
            r0.setCallback(r3)
            aeoq r0 = r5.f
            r5.unscheduleDrawable(r0)
            android.graphics.drawable.Drawable r0 = r5.g
            r5.setIndeterminateDrawable(r0)
            int r0 = r5.getWidth()
            int r1 = r5.getHeight()
            int r2 = r5.getWidth()
            int r3 = r5.getHeight()
            r5.onSizeChanged(r0, r1, r2, r3)
        L_0x00a4:
            android.graphics.drawable.Drawable r0 = r5.b()
            if (r0 == 0) goto L_0x00c0
            boolean r1 = r5.a()
            boolean r2 = r0 instanceof defpackage.aeoj
            if (r2 != 0) goto L_0x00b3
            goto L_0x00bb
        L_0x00b3:
            if (r1 != 0) goto L_0x00bb
            aeoj r0 = (defpackage.aeoj) r0
            r0.a()
            return
        L_0x00bb:
            r2 = 1
            r0.setVisible(r1, r2)
            return
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.material.progress.MaterialProgressBar.g():void");
    }

    public final void c() {
        if (getVisibility() != 0) {
            setVisibility(0);
        } else if (a()) {
            b().setVisible(true, false);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            c();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        if (b() instanceof aeoj) {
            ((aeoj) b()).a();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        }
        if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        b().draw(canvas);
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (f() == 0) {
            setMeasuredDimension(this.c + getPaddingLeft() + getPaddingRight(), this.c + getPaddingTop() + getPaddingBottom());
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int i3 = this.d;
        int i4 = this.e;
        setMeasuredDimension(measuredWidth, resolveSizeAndState(i3 + i4 + i4 + getPaddingTop() + getPaddingBottom(), i2, 0));
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (f() != 0) {
            int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
            int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
            Drawable indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable != null) {
                indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
            }
            Drawable progressDrawable = getProgressDrawable();
            if (progressDrawable != null) {
                progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
                return;
            }
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        g();
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        g();
    }

    public final synchronized void setIndeterminate(boolean z) {
        super.setIndeterminate(z);
        e();
        Drawable b2 = b();
        if (b2 != null) {
            b2.setVisible(a(), false);
        }
    }

    private final void a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aeoz.a, i, 2132018808);
        this.d = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.e = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        int i2 = obtainStyledAttributes.getInt(3, 0);
        this.a = i2;
        if (i2 == 0) {
            a(obtainStyledAttributes, true);
        } else if (i2 == 1 || i2 == 2) {
            b(obtainStyledAttributes, true);
        } else {
            throw new IllegalArgumentException("Invalid determinate progress style");
        }
        int i3 = obtainStyledAttributes.getInt(2, 1);
        this.b = i3;
        if (i3 == 0) {
            a(obtainStyledAttributes, false);
        } else if (i3 == 1) {
            b(obtainStyledAttributes, false);
        } else {
            throw new IllegalArgumentException("Invalid determinate progress style");
        }
        obtainStyledAttributes.recycle();
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.getProgress();
        a(context, attributeSet, 0);
        d();
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.getProgress();
        a(context, attributeSet, i);
        d();
    }

    public final Drawable b() {
        return !isIndeterminate() ? getProgressDrawable() : getIndeterminateDrawable();
    }

    private final void a(TypedArray typedArray, boolean z) {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int[] iArr2 = aeoz.a;
        int i4 = typedArray.getInt(7, 3);
        if (typedArray.hasValue(1)) {
            iArr = getResources().getIntArray(typedArray.getResourceId(1, -1));
        } else if (typedArray.hasValue(0)) {
            iArr = new int[]{typedArray.getColor(0, 0)};
        } else {
            iArr = null;
        }
        if (iArr == null) {
            iArr = getResources().getIntArray(R.array.material_google_colors);
        }
        if (i4 == 1) {
            i = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_size_small);
        } else if (i4 == 2) {
            i = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_size_medium);
        } else if (i4 == 3) {
            i = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_size_large);
        } else {
            throw new IllegalStateException("Invalid progress circle size");
        }
        this.c = i;
        if (i4 == 1) {
            i2 = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_stroke_width_small);
        } else if (i4 == 2) {
            i2 = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_stroke_width_medium);
        } else if (i4 == 3) {
            i2 = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_stroke_width_large);
        } else {
            throw new IllegalStateException("Invalid progress circle size");
        }
        if (i4 == 1) {
            i3 = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_inset_small);
        } else if (i4 == 2) {
            i3 = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_inset_medium);
        } else if (i4 == 3) {
            i3 = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_inset_large);
        } else {
            throw new IllegalStateException("Invalid progress circle size");
        }
        if (z) {
            this.g = kf.a(getContext(), (int) R.drawable.quantum_ic_sync_grey600_24);
            aeoq aeoq = new aeoq(i2, i3, iArr);
            this.f = aeoq;
            setIndeterminateDrawable(aeoq);
            return;
        }
        setProgressDrawable(new aeom(i2, i3, iArr[0]));
    }

    public final boolean a() {
        if (!qb.D(this) || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                if (!(parent instanceof View)) {
                    return true;
                }
                view = (View) parent;
            } else if (getWindowVisibility() != 0) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}
